package typings.kafkaNode.mod

import typings.kafkaNode.kafkaNodeStrings.connect
import typings.kafkaNode.kafkaNodeStrings.error
import typings.kafkaNode.kafkaNodeStrings.message
import typings.kafkaNode.kafkaNodeStrings.offsetOutOfRange
import typings.kafkaNode.kafkaNodeStrings.rebalanced
import typings.kafkaNode.kafkaNodeStrings.rebalancing
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("kafka-node", "ConsumerGroup")
@js.native
class ConsumerGroup protected () extends js.Object {
  def this(options: ConsumerGroupOptions, topics: String) = this()
  def this(options: ConsumerGroupOptions, topics: js.Array[String]) = this()
  
  def addTopics(topics: js.Array[String | Topic]): Unit = js.native
  def addTopics(
    topics: js.Array[String | Topic],
    cb: js.Function2[/* error */ js.Any, /* added */ js.Array[String | Topic], _]
  ): Unit = js.native
  
  var client: KafkaClient = js.native
  
  def close(cb: js.Function1[/* error */ Error, _]): Unit = js.native
  def close(force: Boolean, cb: js.Function1[/* error */ Error, _]): Unit = js.native
  
  def commit(cb: js.Function2[/* error */ js.Any, /* data */ js.Any, _]): Unit = js.native
  def commit(force: Boolean, cb: js.Function2[/* error */ js.Any, /* data */ js.Any, _]): Unit = js.native
  
  var generationId: Double = js.native
  
  var memberId: String = js.native
  
  @JSName("on")
  def on_connect(eventName: connect, cb: js.Function0[_]): Unit = js.native
  @JSName("on")
  def on_error(eventName: error, cb: js.Function1[/* error */ js.Any, _]): Unit = js.native
  @JSName("on")
  def on_message(eventName: message, cb: js.Function1[/* message */ Message, _]): Unit = js.native
  @JSName("on")
  def on_offsetOutOfRange(eventName: offsetOutOfRange, cb: js.Function1[/* error */ js.Any, _]): Unit = js.native
  @JSName("on")
  def on_rebalanced(eventName: rebalanced, cb: js.Function0[_]): Unit = js.native
  @JSName("on")
  def on_rebalancing(eventName: rebalancing, cb: js.Function0[_]): Unit = js.native
  
  def pause(): Unit = js.native
  
  def removeTopics(topics: String, cb: js.Function2[/* error */ js.Any, /* removed */ Double, _]): Unit = js.native
  def removeTopics(topics: js.Array[String], cb: js.Function2[/* error */ js.Any, /* removed */ Double, _]): Unit = js.native
  
  def resume(): Unit = js.native
  
  def sendOffsetCommitRequest(commits: js.Array[OffsetCommitRequest], cb: js.Function2[/* error */ js.Any, /* data */ js.Any, _]): Unit = js.native
  
  def setOffset(topic: String, partition: Double, offset: Double): Unit = js.native
}
