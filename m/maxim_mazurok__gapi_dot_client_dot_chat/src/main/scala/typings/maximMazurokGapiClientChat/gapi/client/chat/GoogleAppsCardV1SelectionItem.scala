package typings.maximMazurokGapiClientChat.gapi.client.chat

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GoogleAppsCardV1SelectionItem extends StObject {
  
  /** If more than one item is selected for `RADIO_BUTTON` and `DROPDOWN`, the first selected item is treated as selected and the ones after are ignored. */
  var selected: js.UndefOr[Boolean] = js.undefined
  
  /** The text to be displayed. */
  var text: js.UndefOr[String] = js.undefined
  
  /** The value associated with this item. The client should use this as a form input value. */
  var value: js.UndefOr[String] = js.undefined
}
object GoogleAppsCardV1SelectionItem {
  
  inline def apply(): GoogleAppsCardV1SelectionItem = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleAppsCardV1SelectionItem]
  }
  
  extension [Self <: GoogleAppsCardV1SelectionItem](x: Self) {
    
    inline def setSelected(value: Boolean): Self = StObject.set(x, "selected", value.asInstanceOf[js.Any])
    
    inline def setSelectedUndefined: Self = StObject.set(x, "selected", js.undefined)
    
    inline def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    
    inline def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
    
    inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
  }
}
