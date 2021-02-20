package typings.maximMazurokGapiClientChat.gapi.client.chat

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Button extends StObject {
  
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
  implicit class ButtonMutableBuilder[Self <: Button] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setImageButton(value: ImageButton): Self = StObject.set(x, "imageButton", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setImageButtonUndefined: Self = StObject.set(x, "imageButton", js.undefined)
    
    @scala.inline
    def setTextButton(value: TextButton): Self = StObject.set(x, "textButton", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTextButtonUndefined: Self = StObject.set(x, "textButton", js.undefined)
  }
}
