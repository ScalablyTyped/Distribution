package typings.googleapis.cloudsearchV1Mod.cloudsearchV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaSelectionControl extends StObject {
  
  /**
    * For radio button, at most one of the items will be selected.
    */
  var items: js.UndefOr[js.Array[SchemaSelectionItem]] = js.undefined
  
  /**
    * Label used to be displayed ahead of the selection control. It is optional.
    */
  var label: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The name of the text field which is will be used in FormInput.
    */
  var name: js.UndefOr[String | Null] = js.undefined
  
  /**
    * If specified, form is submitted when selection changed. If not specified, developer will need to specify a separate button.
    */
  var onChange: js.UndefOr[SchemaFormAction] = js.undefined
  
  var `type`: js.UndefOr[String | Null] = js.undefined
}
object SchemaSelectionControl {
  
  inline def apply(): SchemaSelectionControl = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaSelectionControl]
  }
  
  extension [Self <: SchemaSelectionControl](x: Self) {
    
    inline def setItems(value: js.Array[SchemaSelectionItem]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
    
    inline def setItemsUndefined: Self = StObject.set(x, "items", js.undefined)
    
    inline def setItemsVarargs(value: SchemaSelectionItem*): Self = StObject.set(x, "items", js.Array(value*))
    
    inline def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
    
    inline def setLabelNull: Self = StObject.set(x, "label", null)
    
    inline def setLabelUndefined: Self = StObject.set(x, "label", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameNull: Self = StObject.set(x, "name", null)
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setOnChange(value: SchemaFormAction): Self = StObject.set(x, "onChange", value.asInstanceOf[js.Any])
    
    inline def setOnChangeUndefined: Self = StObject.set(x, "onChange", js.undefined)
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeNull: Self = StObject.set(x, "type", null)
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
