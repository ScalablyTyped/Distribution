package typings.kafkaNode.mod

import typings.kafkaNode.kafkaNodeStrings.connect
import typings.kafkaNode.kafkaNodeStrings.error
import typings.kafkaNode.kafkaNodeStrings.ready
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("kafka-node", "Offset")
@js.native
class Offset protected () extends js.Object {
  def this(client: KafkaClient) = this()
  def commit(
    groupId: String,
    payloads: js.Array[OffsetCommitRequest],
    cb: js.Function2[/* error */ js.Any, /* data */ js.Any, _]
  ): Unit = js.native
  def fetch(payloads: js.Array[OffsetRequest], cb: js.Function2[/* error */ js.Any, /* data */ js.Any, _]): Unit = js.native
  def fetchCommits(
    groupId: String,
    payloads: js.Array[OffsetFetchRequest],
    cb: js.Function2[/* error */ js.Any, /* data */ js.Any, _]
  ): Unit = js.native
  def fetchEarliestOffsets(topics: js.Array[String], cb: js.Function2[/* error */ js.Any, /* data */ js.Any, _]): Unit = js.native
  def fetchLatestOffsets(topics: js.Array[String], cb: js.Function2[/* error */ js.Any, /* data */ js.Any, _]): Unit = js.native
  @JSName("on")
  def on_connect(eventName: connect, cb: js.Function0[_]): Unit = js.native
  @JSName("on")
  def on_error(eventName: error, cb: js.Function1[/* error */ js.Any, _]): Unit = js.native
  @JSName("on")
  def on_ready(eventName: ready, cb: js.Function0[_]): Unit = js.native
}

