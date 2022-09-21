package typings.googleapis.securitycenterV1beta2Mod.securitycenterV1beta2

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaConfig extends StObject {
  
  /**
    * The state of enablement for the module at its level of the resource hierarchy.
    */
  var moduleEnablementState: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The configuration value for the module. The absence of this field implies its inheritance from the parent.
    */
  var value: js.UndefOr[StringDictionary[Any] | Null] = js.undefined
}
object SchemaConfig {
  
  inline def apply(): SchemaConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaConfig]
  }
  
  extension [Self <: SchemaConfig](x: Self) {
    
    inline def setModuleEnablementState(value: String): Self = StObject.set(x, "moduleEnablementState", value.asInstanceOf[js.Any])
    
    inline def setModuleEnablementStateNull: Self = StObject.set(x, "moduleEnablementState", null)
    
    inline def setModuleEnablementStateUndefined: Self = StObject.set(x, "moduleEnablementState", js.undefined)
    
    inline def setValue(value: StringDictionary[Any]): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    inline def setValueNull: Self = StObject.set(x, "value", null)
    
    inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
  }
}
