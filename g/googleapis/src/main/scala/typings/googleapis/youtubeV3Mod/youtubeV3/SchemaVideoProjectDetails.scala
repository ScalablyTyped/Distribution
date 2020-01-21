package typings.googleapis.youtubeV3Mod.youtubeV3

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Project specific details about the content of a YouTube Video.
  */
@js.native
trait SchemaVideoProjectDetails extends js.Object {
  /**
    * A list of project tags associated with the video during the upload.
    */
  var tags: js.UndefOr[js.Array[String]] = js.native
}

object SchemaVideoProjectDetails {
  @scala.inline
  def apply(tags: js.Array[String] = null): SchemaVideoProjectDetails = {
    val __obj = js.Dynamic.literal()
    if (tags != null) __obj.updateDynamic("tags")(tags.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaVideoProjectDetails]
  }
}

