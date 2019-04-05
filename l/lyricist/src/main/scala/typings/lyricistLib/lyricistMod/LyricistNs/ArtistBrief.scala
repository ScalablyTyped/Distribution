package typings
package lyricistLib.lyricistMod.LyricistNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ArtistBrief extends js.Object {
  var api_path: java.lang.String
  var header_image_url: java.lang.String
  var id: scala.Double
  var image_url: java.lang.String
  var is_meme_verified: scala.Boolean
  var is_verified: scala.Boolean
  var name: java.lang.String
  var url: java.lang.String
}

object ArtistBrief {
  @scala.inline
  def apply(
    api_path: java.lang.String,
    header_image_url: java.lang.String,
    id: scala.Double,
    image_url: java.lang.String,
    is_meme_verified: scala.Boolean,
    is_verified: scala.Boolean,
    name: java.lang.String,
    url: java.lang.String
  ): ArtistBrief = {
    val __obj = js.Dynamic.literal(api_path = api_path, header_image_url = header_image_url, id = id, image_url = image_url, is_meme_verified = is_meme_verified, is_verified = is_verified, name = name, url = url)
  
    __obj.asInstanceOf[ArtistBrief]
  }
}

