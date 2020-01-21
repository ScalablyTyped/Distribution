package typings.googleapis.youtubeV3Mod.youtubeV3

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Information about a new playlist item.
  */
@js.native
trait SchemaActivityContentDetailsPlaylistItem extends js.Object {
  /**
    * The value that YouTube uses to uniquely identify the playlist.
    */
  var playlistId: js.UndefOr[String] = js.native
  /**
    * ID of the item within the playlist.
    */
  var playlistItemId: js.UndefOr[String] = js.native
  /**
    * The resourceId object contains information about the resource that was
    * added to the playlist.
    */
  var resourceId: js.UndefOr[SchemaResourceId] = js.native
}

object SchemaActivityContentDetailsPlaylistItem {
  @scala.inline
  def apply(playlistId: String = null, playlistItemId: String = null, resourceId: SchemaResourceId = null): SchemaActivityContentDetailsPlaylistItem = {
    val __obj = js.Dynamic.literal()
    if (playlistId != null) __obj.updateDynamic("playlistId")(playlistId.asInstanceOf[js.Any])
    if (playlistItemId != null) __obj.updateDynamic("playlistItemId")(playlistItemId.asInstanceOf[js.Any])
    if (resourceId != null) __obj.updateDynamic("resourceId")(resourceId.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaActivityContentDetailsPlaylistItem]
  }
}

