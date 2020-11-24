package typings.maximMazurokGapiClientChat.gapi.client.chat

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Button extends js.Object {
  
  /** A button with image and onclick action. */
  var imageButton: js.UndefOr[ImageButton] = js.native
  
  /** A button with text and onclick action. */
  var textButton: js.UndefOr[TextButton] = js.native
}
object Button {
  
  @scala.inline
  def apply(): Button = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Button]
  }
  
  @scala.inline
  implicit class ButtonOps[Self <: Button] (val x: Self) extends AnyVal {
    
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
    def setImageButton(value: ImageButton): Self = this.set("imageButton", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteImageButton: Self = this.set("imageButton", js.undefined)
    
    @scala.inline
    def setTextButton(value: TextButton): Self = this.set("textButton", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTextButton: Self = this.set("textButton", js.undefined)
  }
}
