package typings.maximMazurokGapiClientChat.gapi.client.chat

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Button extends StObject {
  
  /** A button with image and onclick action. */
  var imageButton: js.UndefOr[ImageButton] = js.undefined
  
  /** A button with text and onclick action. */
  var textButton: js.UndefOr[TextButton] = js.undefined
}
object Button {
  
  inline def apply(): Button = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Button]
  }
  
  extension [Self <: Button](x: Self) {
    
    inline def setImageButton(value: ImageButton): Self = StObject.set(x, "imageButton", value.asInstanceOf[js.Any])
    
    inline def setImageButtonUndefined: Self = StObject.set(x, "imageButton", js.undefined)
    
    inline def setTextButton(value: TextButton): Self = StObject.set(x, "textButton", value.asInstanceOf[js.Any])
    
    inline def setTextButtonUndefined: Self = StObject.set(x, "textButton", js.undefined)
  }
}
