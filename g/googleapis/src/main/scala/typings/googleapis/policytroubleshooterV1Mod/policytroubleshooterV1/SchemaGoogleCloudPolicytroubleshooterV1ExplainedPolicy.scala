package typings.googleapis.policytroubleshooterV1Mod.policytroubleshooterV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudPolicytroubleshooterV1ExplainedPolicy extends StObject {
  
  /**
    * Indicates whether _this policy_ provides the specified permission to the specified principal for the specified resource. This field does _not_ indicate whether the principal actually has the permission for the resource. There might be another policy that overrides this policy. To determine whether the principal actually has the permission, use the `access` field in the TroubleshootIamPolicyResponse.
    */
  var access: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Details about how each binding in the policy affects the principal's ability, or inability, to use the permission for the resource. If the sender of the request does not have access to the policy, this field is omitted.
    */
  var bindingExplanations: js.UndefOr[js.Array[SchemaGoogleCloudPolicytroubleshooterV1BindingExplanation]] = js.undefined
  
  /**
    * The full resource name that identifies the resource. For example, `//compute.googleapis.com/projects/my-project/zones/us-central1-a/instances/my-instance`. If the sender of the request does not have access to the policy, this field is omitted. For examples of full resource names for Google Cloud services, see https://cloud.google.com/iam/help/troubleshooter/full-resource-names.
    */
  var fullResourceName: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The IAM policy attached to the resource. If the sender of the request does not have access to the policy, this field is empty.
    */
  var policy: js.UndefOr[SchemaGoogleIamV1Policy] = js.undefined
  
  /**
    * The relevance of this policy to the overall determination in the TroubleshootIamPolicyResponse. If the sender of the request does not have access to the policy, this field is omitted.
    */
  var relevance: js.UndefOr[String | Null] = js.undefined
}
object SchemaGoogleCloudPolicytroubleshooterV1ExplainedPolicy {
  
  inline def apply(): SchemaGoogleCloudPolicytroubleshooterV1ExplainedPolicy = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudPolicytroubleshooterV1ExplainedPolicy]
  }
  
  extension [Self <: SchemaGoogleCloudPolicytroubleshooterV1ExplainedPolicy](x: Self) {
    
    inline def setAccess(value: String): Self = StObject.set(x, "access", value.asInstanceOf[js.Any])
    
    inline def setAccessNull: Self = StObject.set(x, "access", null)
    
    inline def setAccessUndefined: Self = StObject.set(x, "access", js.undefined)
    
    inline def setBindingExplanations(value: js.Array[SchemaGoogleCloudPolicytroubleshooterV1BindingExplanation]): Self = StObject.set(x, "bindingExplanations", value.asInstanceOf[js.Any])
    
    inline def setBindingExplanationsUndefined: Self = StObject.set(x, "bindingExplanations", js.undefined)
    
    inline def setBindingExplanationsVarargs(value: SchemaGoogleCloudPolicytroubleshooterV1BindingExplanation*): Self = StObject.set(x, "bindingExplanations", js.Array(value*))
    
    inline def setFullResourceName(value: String): Self = StObject.set(x, "fullResourceName", value.asInstanceOf[js.Any])
    
    inline def setFullResourceNameNull: Self = StObject.set(x, "fullResourceName", null)
    
    inline def setFullResourceNameUndefined: Self = StObject.set(x, "fullResourceName", js.undefined)
    
    inline def setPolicy(value: SchemaGoogleIamV1Policy): Self = StObject.set(x, "policy", value.asInstanceOf[js.Any])
    
    inline def setPolicyUndefined: Self = StObject.set(x, "policy", js.undefined)
    
    inline def setRelevance(value: String): Self = StObject.set(x, "relevance", value.asInstanceOf[js.Any])
    
    inline def setRelevanceNull: Self = StObject.set(x, "relevance", null)
    
    inline def setRelevanceUndefined: Self = StObject.set(x, "relevance", js.undefined)
  }
}
