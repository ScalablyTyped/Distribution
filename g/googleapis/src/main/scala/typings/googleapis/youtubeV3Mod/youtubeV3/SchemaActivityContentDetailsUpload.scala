package typings.googleapis.youtubeV3Mod.youtubeV3

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Information about the uploaded video.
  */
@js.native
trait SchemaActivityContentDetailsUpload extends js.Object {
  /**
    * The ID that YouTube uses to uniquely identify the uploaded video.
    */
  var videoId: js.UndefOr[String] = js.native
}

object SchemaActivityContentDetailsUpload {
  @scala.inline
  def apply(videoId: String = null): SchemaActivityContentDetailsUpload = {
    val __obj = js.Dynamic.literal()
    if (videoId != null) __obj.updateDynamic("videoId")(videoId.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaActivityContentDetailsUpload]
  }
}

