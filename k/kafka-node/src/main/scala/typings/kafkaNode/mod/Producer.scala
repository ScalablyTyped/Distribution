package typings.kafkaNode.mod

import typings.kafkaNode.kafkaNodeStrings.error
import typings.kafkaNode.kafkaNodeStrings.ready
import typings.node.eventsMod.EventEmitter
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("kafka-node", "Producer")
@js.native
open class Producer protected () extends EventEmitter {
  def this(client: KafkaClient) = this()
  def this(client: KafkaClient, options: ProducerOptions) = this()
  def this(client: KafkaClient, options: Unit, customPartitioner: CustomPartitioner) = this()
  def this(client: KafkaClient, options: ProducerOptions, customPartitioner: CustomPartitioner) = this()
  
  def close(): Unit = js.native
  def close(cb: js.Function0[Any]): Unit = js.native
  
  def createTopics(topics: js.Array[String], async: Boolean, cb: js.Function2[/* error */ Any, /* data */ Any, Any]): Unit = js.native
  def createTopics(topics: js.Array[String], cb: js.Function2[/* error */ Any, /* data */ Any, Any]): Unit = js.native
  
  @JSName("on")
  def on_error(eventName: error, cb: js.Function1[/* error */ Any, Any]): this.type = js.native
  @JSName("on")
  def on_ready(eventName: ready, cb: js.Function0[Any]): this.type = js.native
  
  def send(payloads: js.Array[ProduceRequest], cb: js.Function2[/* error */ Any, /* data */ Any, Any]): Unit = js.native
}
