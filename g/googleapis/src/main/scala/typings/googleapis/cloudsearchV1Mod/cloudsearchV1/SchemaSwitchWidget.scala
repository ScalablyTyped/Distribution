package typings.googleapis.cloudsearchV1Mod.cloudsearchV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaSwitchWidget extends StObject {
  
  var controlType: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The name of the switch widget which is will be used in FormInput.
    */
  var name: js.UndefOr[String | Null] = js.undefined
  
  var onChange: js.UndefOr[SchemaFormAction] = js.undefined
  
  var selected: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * The value is what is passed back in apps script callback.
    */
  var value: js.UndefOr[String | Null] = js.undefined
}
object SchemaSwitchWidget {
  
  inline def apply(): SchemaSwitchWidget = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaSwitchWidget]
  }
  
  extension [Self <: SchemaSwitchWidget](x: Self) {
    
    inline def setControlType(value: String): Self = StObject.set(x, "controlType", value.asInstanceOf[js.Any])
    
    inline def setControlTypeNull: Self = StObject.set(x, "controlType", null)
    
    inline def setControlTypeUndefined: Self = StObject.set(x, "controlType", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameNull: Self = StObject.set(x, "name", null)
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setOnChange(value: SchemaFormAction): Self = StObject.set(x, "onChange", value.asInstanceOf[js.Any])
    
    inline def setOnChangeUndefined: Self = StObject.set(x, "onChange", js.undefined)
    
    inline def setSelected(value: Boolean): Self = StObject.set(x, "selected", value.asInstanceOf[js.Any])
    
    inline def setSelectedNull: Self = StObject.set(x, "selected", null)
    
    inline def setSelectedUndefined: Self = StObject.set(x, "selected", js.undefined)
    
    inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    inline def setValueNull: Self = StObject.set(x, "value", null)
    
    inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
  }
}
