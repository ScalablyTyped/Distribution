package typings.googleapis.orgpolicyV2Mod.orgpolicyV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudOrgpolicyV2PolicySpecPolicyRuleStringValues extends StObject {
  
  /**
    * List of values allowed at this resource.
    */
  var allowedValues: js.UndefOr[js.Array[String] | Null] = js.undefined
  
  /**
    * List of values denied at this resource.
    */
  var deniedValues: js.UndefOr[js.Array[String] | Null] = js.undefined
}
object SchemaGoogleCloudOrgpolicyV2PolicySpecPolicyRuleStringValues {
  
  inline def apply(): SchemaGoogleCloudOrgpolicyV2PolicySpecPolicyRuleStringValues = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudOrgpolicyV2PolicySpecPolicyRuleStringValues]
  }
  
  extension [Self <: SchemaGoogleCloudOrgpolicyV2PolicySpecPolicyRuleStringValues](x: Self) {
    
    inline def setAllowedValues(value: js.Array[String]): Self = StObject.set(x, "allowedValues", value.asInstanceOf[js.Any])
    
    inline def setAllowedValuesNull: Self = StObject.set(x, "allowedValues", null)
    
    inline def setAllowedValuesUndefined: Self = StObject.set(x, "allowedValues", js.undefined)
    
    inline def setAllowedValuesVarargs(value: String*): Self = StObject.set(x, "allowedValues", js.Array(value*))
    
    inline def setDeniedValues(value: js.Array[String]): Self = StObject.set(x, "deniedValues", value.asInstanceOf[js.Any])
    
    inline def setDeniedValuesNull: Self = StObject.set(x, "deniedValues", null)
    
    inline def setDeniedValuesUndefined: Self = StObject.set(x, "deniedValues", js.undefined)
    
    inline def setDeniedValuesVarargs(value: String*): Self = StObject.set(x, "deniedValues", js.Array(value*))
  }
}
