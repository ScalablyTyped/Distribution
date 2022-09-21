package typings.kafkaNode.mod

import typings.kafkaNode.kafkaNodeStrings.error
import typings.kafkaNode.kafkaNodeStrings.message
import typings.kafkaNode.kafkaNodeStrings.offsetOutOfRange
import typings.node.eventsMod.EventEmitter
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("kafka-node", "Consumer")
@js.native
open class Consumer protected () extends EventEmitter {
  def this(
    client: KafkaClient,
    fetchRequests: js.Array[OffsetFetchRequest | String],
    options: ConsumerOptions
  ) = this()
  
  def addTopics(
    topics: js.Array[String | Topic],
    cb: js.Function2[/* error */ Any, /* added */ js.Array[String | Topic], Any]
  ): Unit = js.native
  def addTopics(
    topics: js.Array[String | Topic],
    cb: js.Function2[/* error */ Any, /* added */ js.Array[String | Topic], Any],
    fromOffset: Boolean
  ): Unit = js.native
  
  var client: KafkaClient = js.native
  
  def close(cb: js.Function1[/* error */ js.Error, Any]): Unit = js.native
  def close(force: Boolean, cb: js.Function1[/* error */ js.Error, Any]): Unit = js.native
  
  def commit(cb: js.Function2[/* error */ Any, /* data */ Any, Any]): Unit = js.native
  def commit(force: Boolean, cb: js.Function2[/* error */ Any, /* data */ Any, Any]): Unit = js.native
  
  def on(eventName: error | offsetOutOfRange, cb: js.Function1[/* error */ Any, Any]): this.type = js.native
  @JSName("on")
  def on_message(eventName: message, cb: js.Function1[/* message */ Message, Any]): this.type = js.native
  
  def pause(): Unit = js.native
  
  def pauseTopics(topics: js.Array[Any]): Unit = js.native
  
  def removeTopics(topics: String, cb: js.Function2[/* error */ Any, /* removed */ Double, Any]): Unit = js.native
  def removeTopics(topics: js.Array[String], cb: js.Function2[/* error */ Any, /* removed */ Double, Any]): Unit = js.native
  
  def resume(): Unit = js.native
  
  def resumeTopics(topics: js.Array[Any]): Unit = js.native
  
  def setOffset(topic: String, partition: Double, offset: Double): Unit = js.native
}
