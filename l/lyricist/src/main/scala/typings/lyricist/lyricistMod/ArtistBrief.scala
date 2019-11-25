package typings.lyricist.lyricistMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ArtistBrief extends js.Object {
  var api_path: String
  var header_image_url: String
  var id: Double
  var image_url: String
  var is_meme_verified: Boolean
  var is_verified: Boolean
  var name: String
  var url: String
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
}

