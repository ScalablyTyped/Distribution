package typings.googleapis.youtubeV3Mod.youtubeV3

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Information about the playlist item&#39;s privacy status.
  */
@js.native
trait SchemaPlaylistItemStatus extends js.Object {
  /**
    * This resource&#39;s privacy status.
    */
  var privacyStatus: js.UndefOr[String] = js.native
}

object SchemaPlaylistItemStatus {
  @scala.inline
  def apply(privacyStatus: String = null): SchemaPlaylistItemStatus = {
    val __obj = js.Dynamic.literal()
    if (privacyStatus != null) __obj.updateDynamic("privacyStatus")(privacyStatus.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaPlaylistItemStatus]
  }
}

