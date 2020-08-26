package typings.googleapis.youtubeV3Mod.youtubeV3

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Details about the live streaming metadata.
  */
@js.native
trait SchemaVideoLiveStreamingDetails extends js.Object {
  /**
    * The ID of the currently active live chat attached to this video. This
    * field is filled only if the video is a currently live broadcast that has
    * live chat. Once the broadcast transitions to complete this field will be
    * removed and the live chat closed down. For persistent broadcasts that
    * live chat id will no longer be tied to this video but rather to the new
    * video being displayed at the persistent page.
    */
  var activeLiveChatId: js.UndefOr[String] = js.native
  /**
    * The time that the broadcast actually ended. The value is specified in ISO
    * 8601 (YYYY-MM-DDThh:mm:ss.sZ) format. This value will not be available
    * until the broadcast is over.
    */
  var actualEndTime: js.UndefOr[String] = js.native
  /**
    * The time that the broadcast actually started. The value is specified in
    * ISO 8601 (YYYY-MM-DDThh:mm:ss.sZ) format. This value will not be
    * available until the broadcast begins.
    */
  var actualStartTime: js.UndefOr[String] = js.native
  /**
    * The number of viewers currently watching the broadcast. The property and
    * its value will be present if the broadcast has current viewers and the
    * broadcast owner has not hidden the viewcount for the video. Note that
    * YouTube stops tracking the number of concurrent viewers for a broadcast
    * when the broadcast ends. So, this property would not identify the number
    * of viewers watching an archived video of a live broadcast that already
    * ended.
    */
  var concurrentViewers: js.UndefOr[String] = js.native
  /**
    * The time that the broadcast is scheduled to end. The value is specified
    * in ISO 8601 (YYYY-MM-DDThh:mm:ss.sZ) format. If the value is empty or the
    * property is not present, then the broadcast is scheduled to continue
    * indefinitely.
    */
  var scheduledEndTime: js.UndefOr[String] = js.native
  /**
    * The time that the broadcast is scheduled to begin. The value is specified
    * in ISO 8601 (YYYY-MM-DDThh:mm:ss.sZ) format.
    */
  var scheduledStartTime: js.UndefOr[String] = js.native
}

object SchemaVideoLiveStreamingDetails {
  @scala.inline
  def apply(): SchemaVideoLiveStreamingDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaVideoLiveStreamingDetails]
  }
  @scala.inline
  implicit class SchemaVideoLiveStreamingDetailsOps[Self <: SchemaVideoLiveStreamingDetails] (val x: Self) extends AnyVal {
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
    def setActiveLiveChatId(value: String): Self = this.set("activeLiveChatId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteActiveLiveChatId: Self = this.set("activeLiveChatId", js.undefined)
    @scala.inline
    def setActualEndTime(value: String): Self = this.set("actualEndTime", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteActualEndTime: Self = this.set("actualEndTime", js.undefined)
    @scala.inline
    def setActualStartTime(value: String): Self = this.set("actualStartTime", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteActualStartTime: Self = this.set("actualStartTime", js.undefined)
    @scala.inline
    def setConcurrentViewers(value: String): Self = this.set("concurrentViewers", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteConcurrentViewers: Self = this.set("concurrentViewers", js.undefined)
    @scala.inline
    def setScheduledEndTime(value: String): Self = this.set("scheduledEndTime", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteScheduledEndTime: Self = this.set("scheduledEndTime", js.undefined)
    @scala.inline
    def setScheduledStartTime(value: String): Self = this.set("scheduledStartTime", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteScheduledStartTime: Self = this.set("scheduledStartTime", js.undefined)
  }
  
}

