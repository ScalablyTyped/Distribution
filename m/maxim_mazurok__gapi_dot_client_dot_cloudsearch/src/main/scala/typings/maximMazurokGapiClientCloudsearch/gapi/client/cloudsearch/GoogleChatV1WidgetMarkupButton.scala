package typings.maximMazurokGapiClientCloudsearch.gapi.client.cloudsearch

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GoogleChatV1WidgetMarkupButton extends StObject {
  
  /** A button with image and onclick action. */
  var imageButton: js.UndefOr[GoogleChatV1WidgetMarkupImageButton] = js.undefined
  
  /** A button with text and onclick action. */
  var textButton: js.UndefOr[GoogleChatV1WidgetMarkupTextButton] = js.undefined
}
object GoogleChatV1WidgetMarkupButton {
  
  inline def apply(): GoogleChatV1WidgetMarkupButton = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleChatV1WidgetMarkupButton]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GoogleChatV1WidgetMarkupButton] (val x: Self) extends AnyVal {
    
    inline def setImageButton(value: GoogleChatV1WidgetMarkupImageButton): Self = StObject.set(x, "imageButton", value.asInstanceOf[js.Any])
    
    inline def setImageButtonUndefined: Self = StObject.set(x, "imageButton", js.undefined)
    
    inline def setTextButton(value: GoogleChatV1WidgetMarkupTextButton): Self = StObject.set(x, "textButton", value.asInstanceOf[js.Any])
    
    inline def setTextButtonUndefined: Self = StObject.set(x, "textButton", js.undefined)
  }
}
