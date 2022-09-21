package typings.googleapis.v1p4beta1Mod.cloudassetV1p4beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaOptions extends StObject {
  
  /**
    * Optional. If true, the response will include access analysis from identities to resources via service account impersonation. This is a very expensive operation, because many derived queries will be executed. For example, if the request analyzes for which resources user A has permission P, and there's an IAM policy states user A has iam.serviceAccounts.getAccessToken permission to a service account SA, and there's another IAM policy states service account SA has permission P to a GCP folder F, then user A potentially has access to the GCP folder F. And those advanced analysis results will be included in AnalyzeIamPolicyResponse.service_account_impersonation_analysis. Another example, if the request analyzes for who has permission P to a GCP folder F, and there's an IAM policy states user A has iam.serviceAccounts.actAs permission to a service account SA, and there's another IAM policy states service account SA has permission P to the GCP folder F, then user A potentially has access to the GCP folder F. And those advanced analysis results will be included in AnalyzeIamPolicyResponse.service_account_impersonation_analysis. Default is false.
    */
  var analyzeServiceAccountImpersonation: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * Optional. If true, the identities section of the result will expand any Google groups appearing in an IAM policy binding. If identity_selector is specified, the identity in the result will be determined by the selector, and this flag will have no effect. Default is false.
    */
  var expandGroups: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * Optional. If true, the resource section of the result will expand any resource attached to an IAM policy to include resources lower in the resource hierarchy. For example, if the request analyzes for which resources user A has permission P, and the results include an IAM policy with P on a GCP folder, the results will also include resources in that folder with permission P. If resource_selector is specified, the resource section of the result will be determined by the selector, and this flag will have no effect. Default is false.
    */
  var expandResources: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * Optional. If true, the access section of result will expand any roles appearing in IAM policy bindings to include their permissions. If access_selector is specified, the access section of the result will be determined by the selector, and this flag will have no effect. Default is false.
    */
  var expandRoles: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * Optional. If true, the result will output group identity edges, starting from the binding's group members, to any expanded identities. Default is false.
    */
  var outputGroupEdges: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * Optional. If true, the result will output resource edges, starting from the policy attached resource, to any expanded resources. Default is false.
    */
  var outputResourceEdges: js.UndefOr[Boolean | Null] = js.undefined
}
object SchemaOptions {
  
  inline def apply(): SchemaOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaOptions]
  }
  
  extension [Self <: SchemaOptions](x: Self) {
    
    inline def setAnalyzeServiceAccountImpersonation(value: Boolean): Self = StObject.set(x, "analyzeServiceAccountImpersonation", value.asInstanceOf[js.Any])
    
    inline def setAnalyzeServiceAccountImpersonationNull: Self = StObject.set(x, "analyzeServiceAccountImpersonation", null)
    
    inline def setAnalyzeServiceAccountImpersonationUndefined: Self = StObject.set(x, "analyzeServiceAccountImpersonation", js.undefined)
    
    inline def setExpandGroups(value: Boolean): Self = StObject.set(x, "expandGroups", value.asInstanceOf[js.Any])
    
    inline def setExpandGroupsNull: Self = StObject.set(x, "expandGroups", null)
    
    inline def setExpandGroupsUndefined: Self = StObject.set(x, "expandGroups", js.undefined)
    
    inline def setExpandResources(value: Boolean): Self = StObject.set(x, "expandResources", value.asInstanceOf[js.Any])
    
    inline def setExpandResourcesNull: Self = StObject.set(x, "expandResources", null)
    
    inline def setExpandResourcesUndefined: Self = StObject.set(x, "expandResources", js.undefined)
    
    inline def setExpandRoles(value: Boolean): Self = StObject.set(x, "expandRoles", value.asInstanceOf[js.Any])
    
    inline def setExpandRolesNull: Self = StObject.set(x, "expandRoles", null)
    
    inline def setExpandRolesUndefined: Self = StObject.set(x, "expandRoles", js.undefined)
    
    inline def setOutputGroupEdges(value: Boolean): Self = StObject.set(x, "outputGroupEdges", value.asInstanceOf[js.Any])
    
    inline def setOutputGroupEdgesNull: Self = StObject.set(x, "outputGroupEdges", null)
    
    inline def setOutputGroupEdgesUndefined: Self = StObject.set(x, "outputGroupEdges", js.undefined)
    
    inline def setOutputResourceEdges(value: Boolean): Self = StObject.set(x, "outputResourceEdges", value.asInstanceOf[js.Any])
    
    inline def setOutputResourceEdgesNull: Self = StObject.set(x, "outputResourceEdges", null)
    
    inline def setOutputResourceEdgesUndefined: Self = StObject.set(x, "outputResourceEdges", js.undefined)
  }
}
