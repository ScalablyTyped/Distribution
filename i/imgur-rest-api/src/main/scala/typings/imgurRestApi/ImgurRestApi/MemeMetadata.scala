package typings.imgurRestApi.ImgurRestApi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MemeMetadata extends js.Object {
  var bg_image: String = js.native
  var bottom_text: String = js.native
  var meme_name: String = js.native
  var top_text: String = js.native
}

object MemeMetadata {
  @scala.inline
  def apply(bg_image: String, bottom_text: String, meme_name: String, top_text: String): MemeMetadata = {
    val __obj = js.Dynamic.literal(bg_image = bg_image.asInstanceOf[js.Any], bottom_text = bottom_text.asInstanceOf[js.Any], meme_name = meme_name.asInstanceOf[js.Any], top_text = top_text.asInstanceOf[js.Any])
    __obj.asInstanceOf[MemeMetadata]
  }
  @scala.inline
  implicit class MemeMetadataOps[Self <: MemeMetadata] (val x: Self) extends AnyVal {
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
    def setBg_image(value: String): Self = this.set("bg_image", value.asInstanceOf[js.Any])
    @scala.inline
    def setBottom_text(value: String): Self = this.set("bottom_text", value.asInstanceOf[js.Any])
    @scala.inline
    def setMeme_name(value: String): Self = this.set("meme_name", value.asInstanceOf[js.Any])
    @scala.inline
    def setTop_text(value: String): Self = this.set("top_text", value.asInstanceOf[js.Any])
  }
  
}

