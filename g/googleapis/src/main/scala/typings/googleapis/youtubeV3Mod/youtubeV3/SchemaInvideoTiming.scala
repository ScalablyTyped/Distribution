package typings.googleapis.youtubeV3Mod.youtubeV3

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Describes a temporal position of a visual widget inside a video.
  */
@js.native
trait SchemaInvideoTiming extends js.Object {
  /**
    * Defines the duration in milliseconds for which the promotion should be
    * displayed. If missing, the client should use the default.
    */
  var durationMs: js.UndefOr[String] = js.native
  /**
    * Defines the time at which the promotion will appear. Depending on the
    * value of type the value of the offsetMs field will represent a time
    * offset from the start or from the end of the video, expressed in
    * milliseconds.
    */
  var offsetMs: js.UndefOr[String] = js.native
  /**
    * Describes a timing type. If the value is offsetFromStart, then the
    * offsetMs field represents an offset from the start of the video. If the
    * value is offsetFromEnd, then the offsetMs field represents an offset from
    * the end of the video.
    */
  var `type`: js.UndefOr[String] = js.native
}

object SchemaInvideoTiming {
  @scala.inline
  def apply(): SchemaInvideoTiming = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaInvideoTiming]
  }
  @scala.inline
  implicit class SchemaInvideoTimingOps[Self <: SchemaInvideoTiming] (val x: Self) extends AnyVal {
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
    def setDurationMs(value: String): Self = this.set("durationMs", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDurationMs: Self = this.set("durationMs", js.undefined)
    @scala.inline
    def setOffsetMs(value: String): Self = this.set("offsetMs", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOffsetMs: Self = this.set("offsetMs", js.undefined)
    @scala.inline
    def setType(value: String): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
  }
  
}

