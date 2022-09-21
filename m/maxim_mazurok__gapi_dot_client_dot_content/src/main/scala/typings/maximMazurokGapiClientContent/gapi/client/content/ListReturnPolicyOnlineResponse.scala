package typings.maximMazurokGapiClientContent.gapi.client.content

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListReturnPolicyOnlineResponse extends StObject {
  
  /** The retrieved return policies. */
  var returnPolicies: js.UndefOr[js.Array[ReturnPolicyOnline]] = js.undefined
}
object ListReturnPolicyOnlineResponse {
  
  inline def apply(): ListReturnPolicyOnlineResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListReturnPolicyOnlineResponse]
  }
  
  extension [Self <: ListReturnPolicyOnlineResponse](x: Self) {
    
    inline def setReturnPolicies(value: js.Array[ReturnPolicyOnline]): Self = StObject.set(x, "returnPolicies", value.asInstanceOf[js.Any])
    
    inline def setReturnPoliciesUndefined: Self = StObject.set(x, "returnPolicies", js.undefined)
    
    inline def setReturnPoliciesVarargs(value: ReturnPolicyOnline*): Self = StObject.set(x, "returnPolicies", js.Array(value*))
  }
}
