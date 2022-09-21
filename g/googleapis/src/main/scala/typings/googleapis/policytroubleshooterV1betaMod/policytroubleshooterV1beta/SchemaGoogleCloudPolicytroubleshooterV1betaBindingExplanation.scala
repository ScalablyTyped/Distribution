package typings.googleapis.policytroubleshooterV1betaMod.policytroubleshooterV1beta

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudPolicytroubleshooterV1betaBindingExplanation extends StObject {
  
  /**
    * Indicates whether _this binding_ provides the specified permission to the specified member for the specified resource. This field does _not_ indicate whether the member actually has the permission for the resource. There might be another binding that overrides this binding. To determine whether the member actually has the permission, use the `access` field in the TroubleshootIamPolicyResponse.
    */
  var access: js.UndefOr[String | Null] = js.undefined
  
  /**
    * A condition expression that prevents access unless the expression evaluates to `true`. To learn about IAM Conditions, see https://cloud.google.com/iam/help/conditions/overview.
    */
  var condition: js.UndefOr[SchemaGoogleTypeExpr] = js.undefined
  
  /**
    * Indicates whether each member in the binding includes the member specified in the request, either directly or indirectly. Each key identifies a member in the binding, and each value indicates whether the member in the binding includes the member in the request. For example, suppose that a binding includes the following members: * `user:alice@example.com` * `group:product-eng@example.com` You want to troubleshoot access for `user:bob@example.com`. This user is a member of the group `group:product-eng@example.com`. For the first member in the binding, the key is `user:alice@example.com`, and the `membership` field in the value is set to `MEMBERSHIP_NOT_INCLUDED`. For the second member in the binding, the key is `group:product-eng@example.com`, and the `membership` field in the value is set to `MEMBERSHIP_INCLUDED`.
    */
  var memberships: js.UndefOr[
    StringDictionary[SchemaGoogleCloudPolicytroubleshooterV1betaBindingExplanationAnnotatedMembership] | Null
  ] = js.undefined
  
  /**
    * The relevance of this binding to the overall determination for the entire policy.
    */
  var relevance: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The role that this binding grants. For example, `roles/compute.serviceAgent`. For a complete list of predefined IAM roles, as well as the permissions in each role, see https://cloud.google.com/iam/help/roles/reference.
    */
  var role: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Indicates whether the role granted by this binding contains the specified permission.
    */
  var rolePermission: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The relevance of the permission's existence, or nonexistence, in the role to the overall determination for the entire policy.
    */
  var rolePermissionRelevance: js.UndefOr[String | Null] = js.undefined
}
object SchemaGoogleCloudPolicytroubleshooterV1betaBindingExplanation {
  
  inline def apply(): SchemaGoogleCloudPolicytroubleshooterV1betaBindingExplanation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudPolicytroubleshooterV1betaBindingExplanation]
  }
  
  extension [Self <: SchemaGoogleCloudPolicytroubleshooterV1betaBindingExplanation](x: Self) {
    
    inline def setAccess(value: String): Self = StObject.set(x, "access", value.asInstanceOf[js.Any])
    
    inline def setAccessNull: Self = StObject.set(x, "access", null)
    
    inline def setAccessUndefined: Self = StObject.set(x, "access", js.undefined)
    
    inline def setCondition(value: SchemaGoogleTypeExpr): Self = StObject.set(x, "condition", value.asInstanceOf[js.Any])
    
    inline def setConditionUndefined: Self = StObject.set(x, "condition", js.undefined)
    
    inline def setMemberships(
      value: StringDictionary[SchemaGoogleCloudPolicytroubleshooterV1betaBindingExplanationAnnotatedMembership]
    ): Self = StObject.set(x, "memberships", value.asInstanceOf[js.Any])
    
    inline def setMembershipsNull: Self = StObject.set(x, "memberships", null)
    
    inline def setMembershipsUndefined: Self = StObject.set(x, "memberships", js.undefined)
    
    inline def setRelevance(value: String): Self = StObject.set(x, "relevance", value.asInstanceOf[js.Any])
    
    inline def setRelevanceNull: Self = StObject.set(x, "relevance", null)
    
    inline def setRelevanceUndefined: Self = StObject.set(x, "relevance", js.undefined)
    
    inline def setRole(value: String): Self = StObject.set(x, "role", value.asInstanceOf[js.Any])
    
    inline def setRoleNull: Self = StObject.set(x, "role", null)
    
    inline def setRolePermission(value: String): Self = StObject.set(x, "rolePermission", value.asInstanceOf[js.Any])
    
    inline def setRolePermissionNull: Self = StObject.set(x, "rolePermission", null)
    
    inline def setRolePermissionRelevance(value: String): Self = StObject.set(x, "rolePermissionRelevance", value.asInstanceOf[js.Any])
    
    inline def setRolePermissionRelevanceNull: Self = StObject.set(x, "rolePermissionRelevance", null)
    
    inline def setRolePermissionRelevanceUndefined: Self = StObject.set(x, "rolePermissionRelevance", js.undefined)
    
    inline def setRolePermissionUndefined: Self = StObject.set(x, "rolePermission", js.undefined)
    
    inline def setRoleUndefined: Self = StObject.set(x, "role", js.undefined)
  }
}
