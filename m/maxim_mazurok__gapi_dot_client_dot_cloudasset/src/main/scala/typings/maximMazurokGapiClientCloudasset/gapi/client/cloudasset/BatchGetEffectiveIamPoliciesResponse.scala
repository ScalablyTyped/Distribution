package typings.maximMazurokGapiClientCloudasset.gapi.client.cloudasset

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BatchGetEffectiveIamPoliciesResponse extends StObject {
  
  /**
    * The effective policies for a batch of resources. Note that the results order is the same as the order of BatchGetEffectiveIamPoliciesRequest.names. When a resource does not have any
    * effective IAM policies, its corresponding policy_result will contain empty EffectiveIamPolicy.policies.
    */
  var policyResults: js.UndefOr[js.Array[EffectiveIamPolicy]] = js.undefined
}
object BatchGetEffectiveIamPoliciesResponse {
  
  inline def apply(): BatchGetEffectiveIamPoliciesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BatchGetEffectiveIamPoliciesResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: BatchGetEffectiveIamPoliciesResponse] (val x: Self) extends AnyVal {
    
    inline def setPolicyResults(value: js.Array[EffectiveIamPolicy]): Self = StObject.set(x, "policyResults", value.asInstanceOf[js.Any])
    
    inline def setPolicyResultsUndefined: Self = StObject.set(x, "policyResults", js.undefined)
    
    inline def setPolicyResultsVarargs(value: EffectiveIamPolicy*): Self = StObject.set(x, "policyResults", js.Array(value*))
  }
}
