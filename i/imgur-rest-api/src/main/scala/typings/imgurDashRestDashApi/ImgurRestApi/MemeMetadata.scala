package typings.imgurDashRestDashApi.ImgurRestApi

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
    val __obj = js.Dynamic.literal(bg_image = bg_image, bottom_text = bottom_text, meme_name = meme_name, top_text = top_text)
  
    __obj.asInstanceOf[MemeMetadata]
  }
}

