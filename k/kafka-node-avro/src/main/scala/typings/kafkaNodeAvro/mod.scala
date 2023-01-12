package typings.kafkaNodeAvro

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("kafka-node-avro", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def init(settings: Settings): js.Promise[Kafka] = ^.asInstanceOf[js.Dynamic].applyDynamic("init")(settings.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Kafka]]
  
  trait Kafka extends StObject {
    
    /** Publishes message to Kafka */
    def send(options: SendOptions): js.Promise[js.Object]
  }
  object Kafka {
    
    inline def apply(send: SendOptions => js.Promise[js.Object]): Kafka = {
      val __obj = js.Dynamic.literal(send = js.Any.fromFunction1(send))
      __obj.asInstanceOf[Kafka]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Kafka] (val x: Self) extends AnyVal {
      
      inline def setSend(value: SendOptions => js.Promise[js.Object]): Self = StObject.set(x, "send", js.Any.fromFunction1(value))
    }
  }
  
  trait KafkaSettings extends StObject {
    
    /** Kafka broker host name */
    var kafkaHost: String
  }
  object KafkaSettings {
    
    inline def apply(kafkaHost: String): KafkaSettings = {
      val __obj = js.Dynamic.literal(kafkaHost = kafkaHost.asInstanceOf[js.Any])
      __obj.asInstanceOf[KafkaSettings]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: KafkaSettings] (val x: Self) extends AnyVal {
      
      inline def setKafkaHost(value: String): Self = StObject.set(x, "kafkaHost", value.asInstanceOf[js.Any])
    }
  }
  
  trait SchemaSettings extends StObject {
    
    /** Kafka schema registry url */
    var registry: String
  }
  object SchemaSettings {
    
    inline def apply(registry: String): SchemaSettings = {
      val __obj = js.Dynamic.literal(registry = registry.asInstanceOf[js.Any])
      __obj.asInstanceOf[SchemaSettings]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: SchemaSettings] (val x: Self) extends AnyVal {
      
      inline def setRegistry(value: String): Self = StObject.set(x, "registry", value.asInstanceOf[js.Any])
    }
  }
  
  trait SendOptions extends StObject {
    
    /** Message key */
    var key: String
    
    /**
      * Object to send to kafka.
      * It will be automatically Avro encoded if schema registry finds a valid schema for topic
      */
    var messages: js.Object
    
    /** Kafka topic name to publish message */
    var topic: String
  }
  object SendOptions {
    
    inline def apply(key: String, messages: js.Object, topic: String): SendOptions = {
      val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any], messages = messages.asInstanceOf[js.Any], topic = topic.asInstanceOf[js.Any])
      __obj.asInstanceOf[SendOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: SendOptions] (val x: Self) extends AnyVal {
      
      inline def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      inline def setMessages(value: js.Object): Self = StObject.set(x, "messages", value.asInstanceOf[js.Any])
      
      inline def setTopic(value: String): Self = StObject.set(x, "topic", value.asInstanceOf[js.Any])
    }
  }
  
  trait Settings extends StObject {
    
    /** Kafka broker settings */
    var kafka: KafkaSettings
    
    /** Kafka schema registry settings */
    var schema: SchemaSettings
  }
  object Settings {
    
    inline def apply(kafka: KafkaSettings, schema: SchemaSettings): Settings = {
      val __obj = js.Dynamic.literal(kafka = kafka.asInstanceOf[js.Any], schema = schema.asInstanceOf[js.Any])
      __obj.asInstanceOf[Settings]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Settings] (val x: Self) extends AnyVal {
      
      inline def setKafka(value: KafkaSettings): Self = StObject.set(x, "kafka", value.asInstanceOf[js.Any])
      
      inline def setSchema(value: SchemaSettings): Self = StObject.set(x, "schema", value.asInstanceOf[js.Any])
    }
  }
}
