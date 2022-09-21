package typings.googleapis.privatecaV1beta1Mod.privatecaV1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaAllowedConfigList extends StObject {
  
  /**
    * Required. All Certificates issued by the CertificateAuthority must match at least one listed ReusableConfigWrapper. If a ReusableConfigWrapper has an empty field, any value will be allowed for that field.
    */
  var allowedConfigValues: js.UndefOr[js.Array[SchemaReusableConfigWrapper]] = js.undefined
}
object SchemaAllowedConfigList {
  
  inline def apply(): SchemaAllowedConfigList = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaAllowedConfigList]
  }
  
  extension [Self <: SchemaAllowedConfigList](x: Self) {
    
    inline def setAllowedConfigValues(value: js.Array[SchemaReusableConfigWrapper]): Self = StObject.set(x, "allowedConfigValues", value.asInstanceOf[js.Any])
    
    inline def setAllowedConfigValuesUndefined: Self = StObject.set(x, "allowedConfigValues", js.undefined)
    
    inline def setAllowedConfigValuesVarargs(value: SchemaReusableConfigWrapper*): Self = StObject.set(x, "allowedConfigValues", js.Array(value*))
  }
}
