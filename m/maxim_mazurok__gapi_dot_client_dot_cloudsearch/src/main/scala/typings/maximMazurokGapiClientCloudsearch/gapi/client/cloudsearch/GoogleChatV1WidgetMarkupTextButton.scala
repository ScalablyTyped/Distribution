package typings.maximMazurokGapiClientCloudsearch.gapi.client.cloudsearch

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GoogleChatV1WidgetMarkupTextButton extends StObject {
  
  /** The onclick action of the button. */
  var onClick: js.UndefOr[GoogleChatV1WidgetMarkupOnClick] = js.undefined
  
  /** The text of the button. */
  var text: js.UndefOr[String] = js.undefined
}
object GoogleChatV1WidgetMarkupTextButton {
  
  inline def apply(): GoogleChatV1WidgetMarkupTextButton = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleChatV1WidgetMarkupTextButton]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GoogleChatV1WidgetMarkupTextButton] (val x: Self) extends AnyVal {
    
    inline def setOnClick(value: GoogleChatV1WidgetMarkupOnClick): Self = StObject.set(x, "onClick", value.asInstanceOf[js.Any])
    
    inline def setOnClickUndefined: Self = StObject.set(x, "onClick", js.undefined)
    
    inline def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    
    inline def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
  }
}
