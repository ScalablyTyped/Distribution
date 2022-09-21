package typings.maximMazurokGapiClientCloudsearch.gapi.client.cloudsearch

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SelectionItem extends StObject {
  
  /** If more than one items are selected for RADIO_BUTTON and DROPDOWN, the first selected item is treated as sElected and the after ones are all ignored. */
  var selected: js.UndefOr[Boolean] = js.undefined
  
  /** The text to be displayed. */
  var text: js.UndefOr[String] = js.undefined
  
  /** The value associated with this item which will be sent back to app scripts. Client should use as a form input value. */
  var value: js.UndefOr[String] = js.undefined
}
object SelectionItem {
  
  inline def apply(): SelectionItem = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SelectionItem]
  }
  
  extension [Self <: SelectionItem](x: Self) {
    
    inline def setSelected(value: Boolean): Self = StObject.set(x, "selected", value.asInstanceOf[js.Any])
    
    inline def setSelectedUndefined: Self = StObject.set(x, "selected", js.undefined)
    
    inline def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    
    inline def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
    
    inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
  }
}
