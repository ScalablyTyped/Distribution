package typings.googleapis.youtubeV3Mod.youtubeV3

import typings.googleapis.anon.Favorites
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Details about the content of a channel.
  */
@js.native
trait SchemaChannelContentDetails extends js.Object {
  var relatedPlaylists: js.UndefOr[Favorites] = js.native
}

object SchemaChannelContentDetails {
  @scala.inline
  def apply(): SchemaChannelContentDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaChannelContentDetails]
  }
  @scala.inline
  implicit class SchemaChannelContentDetailsOps[Self <: SchemaChannelContentDetails] (val x: Self) extends AnyVal {
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
    def setRelatedPlaylists(value: Favorites): Self = this.set("relatedPlaylists", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRelatedPlaylists: Self = this.set("relatedPlaylists", js.undefined)
  }
  
}

