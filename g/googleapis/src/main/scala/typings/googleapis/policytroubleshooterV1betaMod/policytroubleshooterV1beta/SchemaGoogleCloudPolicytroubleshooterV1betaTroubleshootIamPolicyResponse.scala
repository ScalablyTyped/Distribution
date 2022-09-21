package typings.googleapis.policytroubleshooterV1betaMod.policytroubleshooterV1beta

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudPolicytroubleshooterV1betaTroubleshootIamPolicyResponse extends StObject {
  
  /**
    * Indicates whether the member has the specified permission for the specified resource, based on evaluating all of the applicable policies.
    */
  var access: js.UndefOr[String | Null] = js.undefined
  
  /**
    * List of IAM policies that were evaluated to check the member's permissions, with annotations to indicate how each policy contributed to the final result. The list of policies can include the policy for the resource itself. It can also include policies that are inherited from higher levels of the resource hierarchy, including the organization, the folder, and the project. To learn more about the resource hierarchy, see https://cloud.google.com/iam/help/resource-hierarchy.
    */
  var explainedPolicies: js.UndefOr[js.Array[SchemaGoogleCloudPolicytroubleshooterV1betaExplainedPolicy]] = js.undefined
}
object SchemaGoogleCloudPolicytroubleshooterV1betaTroubleshootIamPolicyResponse {
  
  inline def apply(): SchemaGoogleCloudPolicytroubleshooterV1betaTroubleshootIamPolicyResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudPolicytroubleshooterV1betaTroubleshootIamPolicyResponse]
  }
  
  extension [Self <: SchemaGoogleCloudPolicytroubleshooterV1betaTroubleshootIamPolicyResponse](x: Self) {
    
    inline def setAccess(value: String): Self = StObject.set(x, "access", value.asInstanceOf[js.Any])
    
    inline def setAccessNull: Self = StObject.set(x, "access", null)
    
    inline def setAccessUndefined: Self = StObject.set(x, "access", js.undefined)
    
    inline def setExplainedPolicies(value: js.Array[SchemaGoogleCloudPolicytroubleshooterV1betaExplainedPolicy]): Self = StObject.set(x, "explainedPolicies", value.asInstanceOf[js.Any])
    
    inline def setExplainedPoliciesUndefined: Self = StObject.set(x, "explainedPolicies", js.undefined)
    
    inline def setExplainedPoliciesVarargs(value: SchemaGoogleCloudPolicytroubleshooterV1betaExplainedPolicy*): Self = StObject.set(x, "explainedPolicies", js.Array(value*))
  }
}
