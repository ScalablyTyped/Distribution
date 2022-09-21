package typings.maximMazurokGapiClientCloudsearch.gapi.client.cloudsearch

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SwitchWidget extends StObject {
  
  var controlType: js.UndefOr[String] = js.undefined
  
  /** The name of the switch widget which is will be used in FormInput. */
  var name: js.UndefOr[String] = js.undefined
  
  var onChange: js.UndefOr[FormAction] = js.undefined
  
  var selected: js.UndefOr[Boolean] = js.undefined
  
  /** The value is what is passed back in apps script callback. */
  var value: js.UndefOr[String] = js.undefined
}
object SwitchWidget {
  
  inline def apply(): SwitchWidget = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SwitchWidget]
  }
  
  extension [Self <: SwitchWidget](x: Self) {
    
    inline def setControlType(value: String): Self = StObject.set(x, "controlType", value.asInstanceOf[js.Any])
    
    inline def setControlTypeUndefined: Self = StObject.set(x, "controlType", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setOnChange(value: FormAction): Self = StObject.set(x, "onChange", value.asInstanceOf[js.Any])
    
    inline def setOnChangeUndefined: Self = StObject.set(x, "onChange", js.undefined)
    
    inline def setSelected(value: Boolean): Self = StObject.set(x, "selected", value.asInstanceOf[js.Any])
    
    inline def setSelectedUndefined: Self = StObject.set(x, "selected", js.undefined)
    
    inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
  }
}
