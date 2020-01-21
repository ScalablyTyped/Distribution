package typings.googleapis.youtubeV3Mod.youtubeV3

import typings.googleapis.AnonFavorites
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Details about the content of a channel.
  */
@js.native
trait SchemaChannelContentDetails extends js.Object {
  var relatedPlaylists: js.UndefOr[AnonFavorites] = js.native
}

object SchemaChannelContentDetails {
  @scala.inline
  def apply(relatedPlaylists: AnonFavorites = null): SchemaChannelContentDetails = {
    val __obj = js.Dynamic.literal()
    if (relatedPlaylists != null) __obj.updateDynamic("relatedPlaylists")(relatedPlaylists.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaChannelContentDetails]
  }
}

