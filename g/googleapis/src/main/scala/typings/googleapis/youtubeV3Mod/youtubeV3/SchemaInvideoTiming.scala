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
  def apply(durationMs: String = null, offsetMs: String = null, `type`: String = null): SchemaInvideoTiming = {
    val __obj = js.Dynamic.literal()
    if (durationMs != null) __obj.updateDynamic("durationMs")(durationMs.asInstanceOf[js.Any])
    if (offsetMs != null) __obj.updateDynamic("offsetMs")(offsetMs.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaInvideoTiming]
  }
}

