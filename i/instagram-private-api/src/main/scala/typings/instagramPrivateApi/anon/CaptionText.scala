package typings.instagramPrivateApi.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CaptionText extends js.Object {
  
  var captionText: String = js.native
  
  var mediaId: String = js.native
}
object CaptionText {
  
  @scala.inline
  def apply(captionText: String, mediaId: String): CaptionText = {
    val __obj = js.Dynamic.literal(captionText = captionText.asInstanceOf[js.Any], mediaId = mediaId.asInstanceOf[js.Any])
    __obj.asInstanceOf[CaptionText]
  }
  
  @scala.inline
  implicit class CaptionTextOps[Self <: CaptionText] (val x: Self) extends AnyVal {
    
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
    def setCaptionText(value: String): Self = this.set("captionText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMediaId(value: String): Self = this.set("mediaId", value.asInstanceOf[js.Any])
  }
}
