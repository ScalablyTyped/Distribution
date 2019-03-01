package typings
package kafkaDashNodeLib.kafkaDashNodeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("kafka-node", "HighLevelConsumer")
@js.native
class HighLevelConsumer protected () extends js.Object {
  def this(client: Client, payloads: js.Array[Topic], options: HighLevelConsumerOptions) = this()
  var client: Client = js.native
  def addTopics(topics: js.Array[java.lang.String | Topic]): scala.Unit = js.native
  def addTopics(
    topics: js.Array[java.lang.String | Topic],
    cb: js.Function2[/* error */ js.Any, js.Array[java.lang.String] | js.Array[Topic], _]
  ): scala.Unit = js.native
  def close(cb: js.Function0[_]): scala.Unit = js.native
  def close(force: scala.Boolean, cb: js.Function1[/* error */ js.Any, _]): scala.Unit = js.native
  def commit(cb: js.Function2[/* error */ js.Any, /* data */ js.Any, _]): scala.Unit = js.native
  def commit(force: scala.Boolean, cb: js.Function2[/* error */ js.Any, /* data */ js.Any, _]): scala.Unit = js.native
  @JSName("on")
  def on_connect(eventName: kafkaDashNodeLib.kafkaDashNodeLibStrings.connect, cb: js.Function0[_]): scala.Unit = js.native
  @JSName("on")
  def on_error(eventName: kafkaDashNodeLib.kafkaDashNodeLibStrings.error, cb: js.Function1[/* error */ js.Any, _]): scala.Unit = js.native
  @JSName("on")
  def on_message(
    eventName: kafkaDashNodeLib.kafkaDashNodeLibStrings.message,
    cb: js.Function1[/* message */ Message, _]
  ): scala.Unit = js.native
  @JSName("on")
  def on_offsetOutOfRange(
    eventName: kafkaDashNodeLib.kafkaDashNodeLibStrings.offsetOutOfRange,
    cb: js.Function1[/* error */ js.Any, _]
  ): scala.Unit = js.native
  @JSName("on")
  def on_rebalanced(eventName: kafkaDashNodeLib.kafkaDashNodeLibStrings.rebalanced, cb: js.Function0[_]): scala.Unit = js.native
  @JSName("on")
  def on_rebalancing(eventName: kafkaDashNodeLib.kafkaDashNodeLibStrings.rebalancing, cb: js.Function0[_]): scala.Unit = js.native
  def pause(): scala.Unit = js.native
  def removeTopics(topics: java.lang.String, cb: js.Function2[/* error */ js.Any, /* removed */ scala.Double, _]): scala.Unit = js.native
  def removeTopics(
    topics: js.Array[java.lang.String],
    cb: js.Function2[/* error */ js.Any, /* removed */ scala.Double, _]
  ): scala.Unit = js.native
  def resume(): scala.Unit = js.native
  def sendOffsetCommitRequest(commits: js.Array[OffsetCommitRequest], cb: js.Function2[/* error */ js.Any, /* data */ js.Any, _]): scala.Unit = js.native
  def setOffset(topic: java.lang.String, partition: scala.Double, offset: scala.Double): scala.Unit = js.native
}

