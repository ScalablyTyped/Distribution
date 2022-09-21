package typings.googleapis.privatecaV1beta1Mod.privatecaV1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaReusableConfigWrapper extends StObject {
  
  /**
    * Required. A resource path to a ReusableConfig in the format `projects/x/locations/x/reusableConfigs/x`.
    */
  var reusableConfig: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Required. A user-specified inline ReusableConfigValues.
    */
  var reusableConfigValues: js.UndefOr[SchemaReusableConfigValues] = js.undefined
}
object SchemaReusableConfigWrapper {
  
  inline def apply(): SchemaReusableConfigWrapper = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaReusableConfigWrapper]
  }
  
  extension [Self <: SchemaReusableConfigWrapper](x: Self) {
    
    inline def setReusableConfig(value: String): Self = StObject.set(x, "reusableConfig", value.asInstanceOf[js.Any])
    
    inline def setReusableConfigNull: Self = StObject.set(x, "reusableConfig", null)
    
    inline def setReusableConfigUndefined: Self = StObject.set(x, "reusableConfig", js.undefined)
    
    inline def setReusableConfigValues(value: SchemaReusableConfigValues): Self = StObject.set(x, "reusableConfigValues", value.asInstanceOf[js.Any])
    
    inline def setReusableConfigValuesUndefined: Self = StObject.set(x, "reusableConfigValues", js.undefined)
  }
}
