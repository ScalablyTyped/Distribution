package typings
package imgurDashRestDashApiLib.ImgurRestApiNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MemeMetadata extends js.Object {
  var bg_image: java.lang.String
  var bottom_text: java.lang.String
  var meme_name: java.lang.String
  var top_text: java.lang.String
}

object MemeMetadata {
  @scala.inline
  def apply(
    bg_image: java.lang.String,
    bottom_text: java.lang.String,
    meme_name: java.lang.String,
    top_text: java.lang.String
  ): MemeMetadata = {
    val __obj = js.Dynamic.literal(bg_image = bg_image, bottom_text = bottom_text, meme_name = meme_name, top_text = top_text)
  
    __obj.asInstanceOf[MemeMetadata]
  }
}

