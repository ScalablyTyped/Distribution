package typings.lyricist.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ArtistBrief extends js.Object {
  var api_path: String = js.native
  var header_image_url: String = js.native
  var id: Double = js.native
  var image_url: String = js.native
  var is_meme_verified: Boolean = js.native
  var is_verified: Boolean = js.native
  var name: String = js.native
  var url: String = js.native
}

object ArtistBrief {
  @scala.inline
  def apply(
    api_path: String,
    header_image_url: String,
    id: Double,
    image_url: String,
    is_meme_verified: Boolean,
    is_verified: Boolean,
    name: String,
    url: String
  ): ArtistBrief = {
    val __obj = js.Dynamic.literal(api_path = api_path.asInstanceOf[js.Any], header_image_url = header_image_url.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], image_url = image_url.asInstanceOf[js.Any], is_meme_verified = is_meme_verified.asInstanceOf[js.Any], is_verified = is_verified.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[ArtistBrief]
  }
  @scala.inline
  implicit class ArtistBriefOps[Self <: ArtistBrief] (val x: Self) extends AnyVal {
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
    def setApi_path(value: String): Self = this.set("api_path", value.asInstanceOf[js.Any])
    @scala.inline
    def setHeader_image_url(value: String): Self = this.set("header_image_url", value.asInstanceOf[js.Any])
    @scala.inline
    def setId(value: Double): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def setImage_url(value: String): Self = this.set("image_url", value.asInstanceOf[js.Any])
    @scala.inline
    def setIs_meme_verified(value: Boolean): Self = this.set("is_meme_verified", value.asInstanceOf[js.Any])
    @scala.inline
    def setIs_verified(value: Boolean): Self = this.set("is_verified", value.asInstanceOf[js.Any])
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def setUrl(value: String): Self = this.set("url", value.asInstanceOf[js.Any])
  }
  
}

