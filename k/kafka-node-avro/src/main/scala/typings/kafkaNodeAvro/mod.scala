package typings.kafkaNodeAvro

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("kafka-node-avro", "init")
  @js.native
  def init(settings: Settings): js.Promise[Kafka] = js.native
  
  @js.native
  trait Kafka extends StObject {
    
    /** Publishes message to Kafka */
    def send(options: SendOptions): js.Promise[js.Object] = js.native
  }
  object Kafka {
    
    @scala.inline
    def apply(send: SendOptions => js.Promise[js.Object]): Kafka = {
      val __obj = js.Dynamic.literal(send = js.Any.fromFunction1(send))
      __obj.asInstanceOf[Kafka]
    }
    
    @scala.inline
    implicit class KafkaMutableBuilder[Self <: Kafka] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setSend(value: SendOptions => js.Promise[js.Object]): Self = StObject.set(x, "send", js.Any.fromFunction1(value))
    }
  }
  
  @js.native
  trait KafkaSettings extends StObject {
    
    /** Kafka broker host name */
    var kafkaHost: String = js.native
  }
  object KafkaSettings {
    
    @scala.inline
    def apply(kafkaHost: String): KafkaSettings = {
      val __obj = js.Dynamic.literal(kafkaHost = kafkaHost.asInstanceOf[js.Any])
      __obj.asInstanceOf[KafkaSettings]
    }
    
    @scala.inline
    implicit class KafkaSettingsMutableBuilder[Self <: KafkaSettings] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setKafkaHost(value: String): Self = StObject.set(x, "kafkaHost", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait SchemaSettings extends StObject {
    
    /** Kafka schema registry url */
    var registry: String = js.native
  }
  object SchemaSettings {
    
    @scala.inline
    def apply(registry: String): SchemaSettings = {
      val __obj = js.Dynamic.literal(registry = registry.asInstanceOf[js.Any])
      __obj.asInstanceOf[SchemaSettings]
    }
    
    @scala.inline
    implicit class SchemaSettingsMutableBuilder[Self <: SchemaSettings] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setRegistry(value: String): Self = StObject.set(x, "registry", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait SendOptions extends StObject {
    
    /** Message key */
    var key: String = js.native
    
    /**
      * Object to send to kafka.
      * It will be automatically Avro encoded if schema registry finds a valid schema for topic
      */
    var messages: js.Object = js.native
    
    /** Kafka topic name to publish message */
    var topic: String = js.native
  }
  object SendOptions {
    
    @scala.inline
    def apply(key: String, messages: js.Object, topic: String): SendOptions = {
      val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any], messages = messages.asInstanceOf[js.Any], topic = topic.asInstanceOf[js.Any])
      __obj.asInstanceOf[SendOptions]
    }
    
    @scala.inline
    implicit class SendOptionsMutableBuilder[Self <: SendOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMessages(value: js.Object): Self = StObject.set(x, "messages", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTopic(value: String): Self = StObject.set(x, "topic", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Settings extends StObject {
    
    /** Kafka broker settings */
    var kafka: KafkaSettings = js.native
    
    /** Kafka schema registry settings */
    var schema: SchemaSettings = js.native
  }
  object Settings {
    
    @scala.inline
    def apply(kafka: KafkaSettings, schema: SchemaSettings): Settings = {
      val __obj = js.Dynamic.literal(kafka = kafka.asInstanceOf[js.Any], schema = schema.asInstanceOf[js.Any])
      __obj.asInstanceOf[Settings]
    }
    
    @scala.inline
    implicit class SettingsMutableBuilder[Self <: Settings] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setKafka(value: KafkaSettings): Self = StObject.set(x, "kafka", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSchema(value: SchemaSettings): Self = StObject.set(x, "schema", value.asInstanceOf[js.Any])
    }
  }
}
