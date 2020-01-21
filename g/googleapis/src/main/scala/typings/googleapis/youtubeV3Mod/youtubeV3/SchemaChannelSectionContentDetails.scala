package typings.googleapis.youtubeV3Mod.youtubeV3

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Details about a channelsection, including playlists and channels.
  */
@js.native
trait SchemaChannelSectionContentDetails extends js.Object {
  /**
    * The channel ids for type multiple_channels.
    */
  var channels: js.UndefOr[js.Array[String]] = js.native
  /**
    * The playlist ids for type single_playlist and multiple_playlists. For
    * singlePlaylist, only one playlistId is allowed.
    */
  var playlists: js.UndefOr[js.Array[String]] = js.native
}

object SchemaChannelSectionContentDetails {
  @scala.inline
  def apply(channels: js.Array[String] = null, playlists: js.Array[String] = null): SchemaChannelSectionContentDetails = {
    val __obj = js.Dynamic.literal()
    if (channels != null) __obj.updateDynamic("channels")(channels.asInstanceOf[js.Any])
    if (playlists != null) __obj.updateDynamic("playlists")(playlists.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaChannelSectionContentDetails]
  }
}

