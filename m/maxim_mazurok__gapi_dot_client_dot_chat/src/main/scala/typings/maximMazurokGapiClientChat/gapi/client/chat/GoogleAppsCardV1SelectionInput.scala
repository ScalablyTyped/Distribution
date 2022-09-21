package typings.maximMazurokGapiClientChat.gapi.client.chat

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GoogleAppsCardV1SelectionInput extends StObject {
  
  /** An array of the selected items. */
  var items: js.UndefOr[js.Array[GoogleAppsCardV1SelectionItem]] = js.undefined
  
  /** The label displayed ahead of the switch control. */
  var label: js.UndefOr[String] = js.undefined
  
  /** The name of the text input which is used in `formInput`. */
  var name: js.UndefOr[String] = js.undefined
  
  /** If specified, the form is submitted when the selection changes. If not specified, you must specify a separate button. */
  var onChangeAction: js.UndefOr[GoogleAppsCardV1Action] = js.undefined
  
  /** The type of the selection. */
  var `type`: js.UndefOr[String] = js.undefined
}
object GoogleAppsCardV1SelectionInput {
  
  inline def apply(): GoogleAppsCardV1SelectionInput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleAppsCardV1SelectionInput]
  }
  
  extension [Self <: GoogleAppsCardV1SelectionInput](x: Self) {
    
    inline def setItems(value: js.Array[GoogleAppsCardV1SelectionItem]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
    
    inline def setItemsUndefined: Self = StObject.set(x, "items", js.undefined)
    
    inline def setItemsVarargs(value: GoogleAppsCardV1SelectionItem*): Self = StObject.set(x, "items", js.Array(value*))
    
    inline def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
    
    inline def setLabelUndefined: Self = StObject.set(x, "label", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setOnChangeAction(value: GoogleAppsCardV1Action): Self = StObject.set(x, "onChangeAction", value.asInstanceOf[js.Any])
    
    inline def setOnChangeActionUndefined: Self = StObject.set(x, "onChangeAction", js.undefined)
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
