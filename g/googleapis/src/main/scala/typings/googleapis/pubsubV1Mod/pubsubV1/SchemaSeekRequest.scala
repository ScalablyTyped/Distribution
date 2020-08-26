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
  def apply(): SchemaSeekRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaSeekRequest]
  }
  @scala.inline
  implicit class SchemaSeekRequestOps[Self <: SchemaSeekRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setSnapshot(value: String): Self = this.set("snapshot", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSnapshot: Self = this.set("snapshot", js.undefined)
    @scala.inline
    def setTime(value: String): Self = this.set("time", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTime: Self = this.set("time", js.undefined)
  }
  
}

