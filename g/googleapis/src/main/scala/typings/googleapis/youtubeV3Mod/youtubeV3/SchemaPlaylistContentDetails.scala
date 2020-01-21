package typings.googleapis.youtubeV3Mod.youtubeV3

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SchemaPlaylistContentDetails extends js.Object {
  /**
    * The number of videos in the playlist.
    */
  var itemCount: js.UndefOr[Double] = js.native
}

object SchemaPlaylistContentDetails {
  @scala.inline
  def apply(itemCount: Int | Double = null): SchemaPlaylistContentDetails = {
    val __obj = js.Dynamic.literal()
    if (itemCount != null) __obj.updateDynamic("itemCount")(itemCount.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaPlaylistContentDetails]
  }
}

