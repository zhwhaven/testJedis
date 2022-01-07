package com.haven.test;

import org.junit.Test;
import redis.clients.jedis.Jedis;

import java.util.Random;
import java.util.Set;

public class testRedis {
    @Test
    public void test01(){
        Jedis jedis = new Jedis("192.168.6.100", 6379);
        String ping = jedis.ping();
        System.out.println(ping);
        jedis.select(0);
        Set<String> keys = jedis.keys("*");
        System.out.println(keys);
         keys.forEach((s)-> System.out.println(s));
    }
    @Test
    public void test02(){
        for (int i = 0; i <10 ; i++) {
            int k =    new Random().nextInt(100);
            System.out.println(k);
        }

    }
    @Test
    public void test03(){

    }
}
