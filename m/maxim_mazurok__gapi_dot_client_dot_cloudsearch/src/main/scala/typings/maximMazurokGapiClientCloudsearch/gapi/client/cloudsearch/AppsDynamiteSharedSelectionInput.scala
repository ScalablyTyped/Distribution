package typings.maximMazurokGapiClientCloudsearch.gapi.client.cloudsearch

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AppsDynamiteSharedSelectionInput extends StObject {
  
  var items: js.UndefOr[js.Array[AppsDynamiteSharedSelectionInputSelectionItem]] = js.undefined
  
  /** The label displayed ahead of the switch control. */
  var label: js.UndefOr[String] = js.undefined
  
  /** The name of the text input which is used in formInput. */
  var name: js.UndefOr[String] = js.undefined
  
  /** If specified, the form is submitted when the selection changes. If not specified, you must specify a separate button. */
  var onChangeAction: js.UndefOr[AppsDynamiteSharedAction] = js.undefined
  
  var `type`: js.UndefOr[String] = js.undefined
}
object AppsDynamiteSharedSelectionInput {
  
  inline def apply(): AppsDynamiteSharedSelectionInput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AppsDynamiteSharedSelectionInput]
  }
  
  extension [Self <: AppsDynamiteSharedSelectionInput](x: Self) {
    
    inline def setItems(value: js.Array[AppsDynamiteSharedSelectionInputSelectionItem]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
    
    inline def setItemsUndefined: Self = StObject.set(x, "items", js.undefined)
    
    inline def setItemsVarargs(value: AppsDynamiteSharedSelectionInputSelectionItem*): Self = StObject.set(x, "items", js.Array(value*))
    
    inline def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
    
    inline def setLabelUndefined: Self = StObject.set(x, "label", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setOnChangeAction(value: AppsDynamiteSharedAction): Self = StObject.set(x, "onChangeAction", value.asInstanceOf[js.Any])
    
    inline def setOnChangeActionUndefined: Self = StObject.set(x, "onChangeAction", js.undefined)
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
