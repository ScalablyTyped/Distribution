package typings
package kafkaDashNodeLib.kafkaDashNodeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("kafka-node", "Client")
@js.native
class Client protected () extends js.Object {
  def this(connectionString: java.lang.String) = this()
  def this(connectionString: java.lang.String, clientId: java.lang.String) = this()
  def this(connectionString: java.lang.String, clientId: java.lang.String, options: ZKOptions) = this()
  def this(connectionString: java.lang.String, clientId: java.lang.String, options: ZKOptions, noBatchOptions: AckBatchOptions) = this()
  def this(connectionString: java.lang.String, clientId: java.lang.String, options: ZKOptions, noBatchOptions: AckBatchOptions, sslOptions: js.Any) = this()
  def close(): scala.Unit = js.native
  def close(cb: js.Function0[scala.Unit]): scala.Unit = js.native
  def loadMetadataForTopics(
    topics: js.Array[java.lang.String],
    cb: js.Function2[/* error */ TopicsNotExistError | js.Any, /* data */ js.Any, _]
  ): scala.Unit = js.native
  // Note: socket_error is currently KafkaClient only, and zkReconnect is currently Client only.
  @JSName("on")
  def on_brokersChanged(eventName: kafkaDashNodeLib.kafkaDashNodeLibStrings.brokersChanged, cb: js.Function0[_]): this.type = js.native
  @JSName("on")
  def on_close(eventName: kafkaDashNodeLib.kafkaDashNodeLibStrings.close, cb: js.Function0[_]): this.type = js.native
  @JSName("on")
  def on_connect(eventName: kafkaDashNodeLib.kafkaDashNodeLibStrings.connect, cb: js.Function0[_]): this.type = js.native
  @JSName("on")
  def on_error(eventName: kafkaDashNodeLib.kafkaDashNodeLibStrings.error, cb: js.Function1[/* error */ js.Any, _]): this.type = js.native
  @JSName("on")
  def on_ready(eventName: kafkaDashNodeLib.kafkaDashNodeLibStrings.ready, cb: js.Function0[_]): this.type = js.native
  @JSName("on")
  def on_reconnect(eventName: kafkaDashNodeLib.kafkaDashNodeLibStrings.reconnect, cb: js.Function0[_]): this.type = js.native
  @JSName("on")
  def on_socket_error(
    eventName: kafkaDashNodeLib.kafkaDashNodeLibStrings.socket_error,
    cb: js.Function1[/* error */ js.Any, _]
  ): this.type = js.native
  @JSName("on")
  def on_zkReconnect(eventName: kafkaDashNodeLib.kafkaDashNodeLibStrings.zkReconnect, cb: js.Function0[_]): this.type = js.native
  def refreshMetadata(topics: js.Array[java.lang.String]): scala.Unit = js.native
  def refreshMetadata(topics: js.Array[java.lang.String], cb: js.Function1[/* error */ js.UndefOr[js.Any], _]): scala.Unit = js.native
  def sendOffsetCommitV2Request(
    group: java.lang.String,
    generationId: scala.Double,
    memberId: java.lang.String,
    commits: js.Array[OffsetCommitRequest],
    cb: js.Function2[/* error */ js.Any, /* data */ js.Any, _]
  ): scala.Unit = js.native
  def topicExists(
    topics: js.Array[java.lang.String],
    cb: js.Function1[/* error */ js.UndefOr[TopicsNotExistError | js.Any], _]
  ): scala.Unit = js.native
}

