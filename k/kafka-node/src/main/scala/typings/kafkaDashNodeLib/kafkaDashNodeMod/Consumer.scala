package typings
package kafkaDashNodeLib.kafkaDashNodeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("kafka-node", "Consumer")
@js.native
class Consumer protected () extends js.Object {
  def this(client: Client, fetchRequests: js.Array[OffsetFetchRequest | java.lang.String], options: ConsumerOptions) = this()
  var client: Client = js.native
  def addTopics(
    topics: js.Array[java.lang.String | Topic],
    cb: js.Function2[/* error */ js.Any, /* added */ js.Array[java.lang.String | Topic], _]
  ): scala.Unit = js.native
  def addTopics(
    topics: js.Array[java.lang.String | Topic],
    cb: js.Function2[/* error */ js.Any, /* added */ js.Array[java.lang.String | Topic], _],
    fromOffset: scala.Boolean
  ): scala.Unit = js.native
  def close(cb: js.Function0[_]): scala.Unit = js.native
  def close(force: scala.Boolean, cb: js.Function0[_]): scala.Unit = js.native
  def commit(cb: js.Function2[/* error */ js.Any, /* data */ js.Any, _]): scala.Unit = js.native
  def commit(force: scala.Boolean, cb: js.Function2[/* error */ js.Any, /* data */ js.Any, _]): scala.Unit = js.native
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
  def pause(): scala.Unit = js.native
  def pauseTopics(topics: js.Array[_]): scala.Unit = js.native
  def removeTopics(topics: java.lang.String, cb: js.Function2[/* error */ js.Any, /* removed */ scala.Double, _]): scala.Unit = js.native
  def removeTopics(
    topics: js.Array[java.lang.String],
    cb: js.Function2[/* error */ js.Any, /* removed */ scala.Double, _]
  ): scala.Unit = js.native
  def resume(): scala.Unit = js.native
  def resumeTopics(topics: js.Array[_]): scala.Unit = js.native
  def setOffset(topic: java.lang.String, partition: scala.Double, offset: scala.Double): scala.Unit = js.native
}

