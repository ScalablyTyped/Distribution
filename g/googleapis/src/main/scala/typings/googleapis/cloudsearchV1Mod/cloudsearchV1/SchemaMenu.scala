package typings.googleapis.cloudsearchV1Mod.cloudsearchV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaMenu extends StObject {
  
  var items: js.UndefOr[js.Array[SchemaMenuItem]] = js.undefined
  
  /**
    * Label used to be displayed ahead of the menu. It is optional.
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
}
object SchemaMenu {
  
  inline def apply(): SchemaMenu = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaMenu]
  }
  
  extension [Self <: SchemaMenu](x: Self) {
    
    inline def setItems(value: js.Array[SchemaMenuItem]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
    
    inline def setItemsUndefined: Self = StObject.set(x, "items", js.undefined)
    
    inline def setItemsVarargs(value: SchemaMenuItem*): Self = StObject.set(x, "items", js.Array(value*))
    
    inline def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
    
    inline def setLabelNull: Self = StObject.set(x, "label", null)
    
    inline def setLabelUndefined: Self = StObject.set(x, "label", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameNull: Self = StObject.set(x, "name", null)
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setOnChange(value: SchemaFormAction): Self = StObject.set(x, "onChange", value.asInstanceOf[js.Any])
    
    inline def setOnChangeUndefined: Self = StObject.set(x, "onChange", js.undefined)
  }
}
