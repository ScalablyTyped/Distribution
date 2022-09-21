package typings.googleapis.v21Mod.contentV21

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaListReturnPolicyOnlineResponse extends StObject {
  
  /**
    * The retrieved return policies.
    */
  var returnPolicies: js.UndefOr[js.Array[SchemaReturnPolicyOnline]] = js.undefined
}
object SchemaListReturnPolicyOnlineResponse {
  
  inline def apply(): SchemaListReturnPolicyOnlineResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaListReturnPolicyOnlineResponse]
  }
  
  extension [Self <: SchemaListReturnPolicyOnlineResponse](x: Self) {
    
    inline def setReturnPolicies(value: js.Array[SchemaReturnPolicyOnline]): Self = StObject.set(x, "returnPolicies", value.asInstanceOf[js.Any])
    
    inline def setReturnPoliciesUndefined: Self = StObject.set(x, "returnPolicies", js.undefined)
    
    inline def setReturnPoliciesVarargs(value: SchemaReturnPolicyOnline*): Self = StObject.set(x, "returnPolicies", js.Array(value*))
  }
}
