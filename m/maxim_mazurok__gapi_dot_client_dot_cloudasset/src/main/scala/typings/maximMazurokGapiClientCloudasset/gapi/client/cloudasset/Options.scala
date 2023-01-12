package typings.maximMazurokGapiClientCloudasset.gapi.client.cloudasset

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Options extends StObject {
  
  /**
    * Optional. If true, the response will include access analysis from identities to resources via service account impersonation. This is a very expensive operation, because many derived
    * queries will be executed. We highly recommend you use AssetService.AnalyzeIamPolicyLongrunning rpc instead. For example, if the request analyzes for which resources user A has
    * permission P, and there's an IAM policy states user A has iam.serviceAccounts.getAccessToken permission to a service account SA, and there's another IAM policy states service
    * account SA has permission P to a GCP folder F, then user A potentially has access to the GCP folder F. And those advanced analysis results will be included in
    * AnalyzeIamPolicyResponse.service_account_impersonation_analysis. Another example, if the request analyzes for who has permission P to a GCP folder F, and there's an IAM policy
    * states user A has iam.serviceAccounts.actAs permission to a service account SA, and there's another IAM policy states service account SA has permission P to the GCP folder F, then
    * user A potentially has access to the GCP folder F. And those advanced analysis results will be included in AnalyzeIamPolicyResponse.service_account_impersonation_analysis. Only the
    * following permissions are considered in this analysis: * `iam.serviceAccounts.actAs` * `iam.serviceAccounts.signBlob` * `iam.serviceAccounts.signJwt` *
    * `iam.serviceAccounts.getAccessToken` * `iam.serviceAccounts.getOpenIdToken` * `iam.serviceAccounts.implicitDelegation` Default is false.
    */
  var analyzeServiceAccountImpersonation: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Optional. If true, the identities section of the result will expand any Google groups appearing in an IAM policy binding. If IamPolicyAnalysisQuery.identity_selector is specified,
    * the identity in the result will be determined by the selector, and this flag is not allowed to set. If true, the default max expansion per group is 1000 for
    * AssetService.AnalyzeIamPolicy][]. Default is false.
    */
  var expandGroups: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Optional. If true and IamPolicyAnalysisQuery.resource_selector is not specified, the resource section of the result will expand any resource attached to an IAM policy to include
    * resources lower in the resource hierarchy. For example, if the request analyzes for which resources user A has permission P, and the results include an IAM policy with P on a GCP
    * folder, the results will also include resources in that folder with permission P. If true and IamPolicyAnalysisQuery.resource_selector is specified, the resource section of the
    * result will expand the specified resource to include resources lower in the resource hierarchy. Only project or lower resources are supported. Folder and organization resource
    * cannot be used together with this option. For example, if the request analyzes for which users have permission P on a GCP project with this option enabled, the results will include
    * all users who have permission P on that project or any lower resource. If true, the default max expansion per resource is 1000 for AssetService.AnalyzeIamPolicy][] and 100000 for
    * AssetService.AnalyzeIamPolicyLongrunning][]. Default is false.
    */
  var expandResources: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Optional. If true, the access section of result will expand any roles appearing in IAM policy bindings to include their permissions. If IamPolicyAnalysisQuery.access_selector is
    * specified, the access section of the result will be determined by the selector, and this flag is not allowed to set. Default is false.
    */
  var expandRoles: js.UndefOr[Boolean] = js.undefined
  
  /** Optional. If true, the result will output the relevant membership relationships between groups and other groups, and between groups and principals. Default is false. */
  var outputGroupEdges: js.UndefOr[Boolean] = js.undefined
  
  /** Optional. If true, the result will output the relevant parent/child relationships between resources. Default is false. */
  var outputResourceEdges: js.UndefOr[Boolean] = js.undefined
}
object Options {
  
  inline def apply(): Options = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Options]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
    
    inline def setAnalyzeServiceAccountImpersonation(value: Boolean): Self = StObject.set(x, "analyzeServiceAccountImpersonation", value.asInstanceOf[js.Any])
    
    inline def setAnalyzeServiceAccountImpersonationUndefined: Self = StObject.set(x, "analyzeServiceAccountImpersonation", js.undefined)
    
    inline def setExpandGroups(value: Boolean): Self = StObject.set(x, "expandGroups", value.asInstanceOf[js.Any])
    
    inline def setExpandGroupsUndefined: Self = StObject.set(x, "expandGroups", js.undefined)
    
    inline def setExpandResources(value: Boolean): Self = StObject.set(x, "expandResources", value.asInstanceOf[js.Any])
    
    inline def setExpandResourcesUndefined: Self = StObject.set(x, "expandResources", js.undefined)
    
    inline def setExpandRoles(value: Boolean): Self = StObject.set(x, "expandRoles", value.asInstanceOf[js.Any])
    
    inline def setExpandRolesUndefined: Self = StObject.set(x, "expandRoles", js.undefined)
    
    inline def setOutputGroupEdges(value: Boolean): Self = StObject.set(x, "outputGroupEdges", value.asInstanceOf[js.Any])
    
    inline def setOutputGroupEdgesUndefined: Self = StObject.set(x, "outputGroupEdges", js.undefined)
    
    inline def setOutputResourceEdges(value: Boolean): Self = StObject.set(x, "outputResourceEdges", value.asInstanceOf[js.Any])
    
    inline def setOutputResourceEdgesUndefined: Self = StObject.set(x, "outputResourceEdges", js.undefined)
  }
}
