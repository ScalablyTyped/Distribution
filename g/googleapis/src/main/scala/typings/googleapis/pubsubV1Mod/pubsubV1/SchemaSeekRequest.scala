package typings.googleapis.pubsubV1Mod.pubsubV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Request for the `Seek` method.
  */
@js.native
trait SchemaSeekRequest extends js.Object {
  /**
    * The snapshot to seek to. The snapshot&#39;s topic must be the same as
    * that of the provided subscription. Format is
    * `projects/{project}/snapshots/{snap}`.
    */
  var snapshot: js.UndefOr[String] = js.native
  /**
    * The time to seek to. Messages retained in the subscription that were
    * published before this time are marked as acknowledged, and messages
    * retained in the subscription that were published after this time are
    * marked as unacknowledged. Note that this operation affects only those
    * messages retained in the subscription (configured by the combination of
    * `message_retention_duration` and `retain_acked_messages`). For example,
    * if `time` corresponds to a point before the message retention window (or
    * to a point before the system&#39;s notion of the subscription creation
    * time), only retained messages will be marked as unacknowledged, and
    * already-expunged messages will not be restored.
    */
  var time: js.UndefOr[String] = js.native
}

object SchemaSeekRequest {
  @scala.inline
  def apply(snapshot: String = null, time: String = null): SchemaSeekRequest = {
    val __obj = js.Dynamic.literal()
    if (snapshot != null) __obj.updateDynamic("snapshot")(snapshot.asInstanceOf[js.Any])
    if (time != null) __obj.updateDynamic("time")(time.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaSeekRequest]
  }
}

