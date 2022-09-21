package typings.kafkaNode.mod

import typings.kafkaNode.kafkaNodeStrings.connect
import typings.kafkaNode.kafkaNodeStrings.error
import typings.kafkaNode.kafkaNodeStrings.message
import typings.kafkaNode.kafkaNodeStrings.offsetOutOfRange
import typings.kafkaNode.kafkaNodeStrings.rebalanced
import typings.kafkaNode.kafkaNodeStrings.rebalancing
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("kafka-node", "ConsumerGroup")
@js.native
open class ConsumerGroup protected () extends StObject {
  def this(options: ConsumerGroupOptions, topics: String) = this()
  def this(options: ConsumerGroupOptions, topics: js.Array[String]) = this()
  
  def addTopics(topics: js.Array[String | Topic]): Unit = js.native
  def addTopics(
    topics: js.Array[String | Topic],
    cb: js.Function2[/* error */ Any, /* added */ js.Array[String | Topic], Any]
  ): Unit = js.native
  
  var client: KafkaClient = js.native
  
  def close(cb: js.Function1[/* error */ js.Error, Any]): Unit = js.native
  def close(force: Boolean, cb: js.Function1[/* error */ js.Error, Any]): Unit = js.native
  
  def commit(cb: js.Function2[/* error */ Any, /* data */ Any, Any]): Unit = js.native
  def commit(force: Boolean, cb: js.Function2[/* error */ Any, /* data */ Any, Any]): Unit = js.native
  
  var generationId: Double = js.native
  
  var memberId: String = js.native
  
  def on(eventName: rebalancing | rebalanced | connect, cb: js.Function0[Any]): Unit = js.native
  def on(eventName: error | offsetOutOfRange, cb: js.Function1[/* error */ Any, Any]): Unit = js.native
  @JSName("on")
  def on_message(eventName: message, cb: js.Function1[/* message */ Message, Any]): Unit = js.native
  
  def pause(): Unit = js.native
  
  def removeTopics(topics: String, cb: js.Function2[/* error */ Any, /* removed */ Double, Any]): Unit = js.native
  def removeTopics(topics: js.Array[String], cb: js.Function2[/* error */ Any, /* removed */ Double, Any]): Unit = js.native
  
  def resume(): Unit = js.native
  
  def sendOffsetCommitRequest(commits: js.Array[OffsetCommitRequest], cb: js.Function2[/* error */ Any, /* data */ Any, Any]): Unit = js.native
  
  def setOffset(topic: String, partition: Double, offset: Double): Unit = js.native
}
