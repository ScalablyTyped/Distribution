package typings
package kafkaDashNodeLib.kafkaDashNodeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("kafka-node", "Offset")
@js.native
class Offset protected () extends js.Object {
  def this(client: Client) = this()
  def commit(
    groupId: java.lang.String,
    payloads: js.Array[OffsetCommitRequest],
    cb: js.Function2[/* error */ js.Any, /* data */ js.Any, _]
  ): scala.Unit = js.native
  def fetch(payloads: js.Array[OffsetRequest], cb: js.Function2[/* error */ js.Any, /* data */ js.Any, _]): scala.Unit = js.native
  def fetchCommits(
    groupId: java.lang.String,
    payloads: js.Array[OffsetFetchRequest],
    cb: js.Function2[/* error */ js.Any, /* data */ js.Any, _]
  ): scala.Unit = js.native
  def fetchEarliestOffsets(topics: js.Array[java.lang.String], cb: js.Function2[/* error */ js.Any, /* data */ js.Any, _]): scala.Unit = js.native
  def fetchLatestOffsets(topics: js.Array[java.lang.String], cb: js.Function2[/* error */ js.Any, /* data */ js.Any, _]): scala.Unit = js.native
  @JSName("on")
  def on_connect(eventName: kafkaDashNodeLib.kafkaDashNodeLibStrings.connect, cb: js.Function0[_]): scala.Unit = js.native
  @JSName("on")
  def on_error(eventName: kafkaDashNodeLib.kafkaDashNodeLibStrings.error, cb: js.Function1[/* error */ js.Any, _]): scala.Unit = js.native
  @JSName("on")
  def on_ready(eventName: kafkaDashNodeLib.kafkaDashNodeLibStrings.ready, cb: js.Function0[_]): scala.Unit = js.native
}

