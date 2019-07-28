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
    val __obj = js.Dynamic.literal(api_path = api_path, header_image_url = header_image_url, id = id, image_url = image_url, is_meme_verified = is_meme_verified, is_verified = is_verified, name = name, url = url)
  
    __obj.asInstanceOf[ArtistBrief]
  }
}

