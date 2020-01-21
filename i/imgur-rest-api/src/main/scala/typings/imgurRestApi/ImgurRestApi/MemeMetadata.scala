package typings.imgurRestApi.ImgurRestApi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MemeMetadata extends js.Object {
  var bg_image: String
  var bottom_text: String
  var meme_name: String
  var top_text: String
}

object MemeMetadata {
  @scala.inline
  def apply(bg_image: String, bottom_text: String, meme_name: String, top_text: String): MemeMetadata = {
    val __obj = js.Dynamic.literal(bg_image = bg_image.asInstanceOf[js.Any], bottom_text = bottom_text.asInstanceOf[js.Any], meme_name = meme_name.asInstanceOf[js.Any], top_text = top_text.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[MemeMetadata]
  }
}

