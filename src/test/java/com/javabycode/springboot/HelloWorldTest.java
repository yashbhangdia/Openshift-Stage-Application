package com.javabycode.springboot;

import org.junit.jupiter.api.Test;

import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class HelloWorldTest {

	@Test
	public void contextLoads() {
        System.out.println(" RUNNING INTEGRATION TEST ");
	}
}
