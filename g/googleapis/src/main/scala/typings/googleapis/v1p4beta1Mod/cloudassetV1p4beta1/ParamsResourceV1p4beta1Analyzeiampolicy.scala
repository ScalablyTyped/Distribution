package typings.googleapis.v1p4beta1Mod.cloudassetV1p4beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceV1p4beta1Analyzeiampolicy
  extends StObject
     with StandardParameters {
  
  /**
    * Optional. The permissions to appear in result.
    */
  @JSName("analysisQuery.accessSelector.permissions")
  var analysisQueryDotaccessSelectorDotpermissions: js.UndefOr[js.Array[String]] = js.undefined
  
  /**
    * Optional. The roles to appear in result.
    */
  @JSName("analysisQuery.accessSelector.roles")
  var analysisQueryDotaccessSelectorDotroles: js.UndefOr[js.Array[String]] = js.undefined
  
  /**
    * Required. The identity appear in the form of members in [IAM policy binding](https://cloud.google.com/iam/reference/rest/v1/Binding). The examples of supported forms are: "user:mike@example.com", "group:admins@example.com", "domain:google.com", "serviceAccount:my-project-id@appspot.gserviceaccount.com". Notice that wildcard characters (such as * and ?) are not supported. You must give a specific identity.
    */
  @JSName("analysisQuery.identitySelector.identity")
  var analysisQueryDotidentitySelectorDotidentity: js.UndefOr[String] = js.undefined
  
  /**
    * Required. The [full resource name](https://cloud.google.com/asset-inventory/docs/resource-name-format) of a resource of [supported resource types](https://cloud.google.com/asset-inventory/docs/supported-asset-types#analyzable_asset_types).
    */
  @JSName("analysisQuery.resourceSelector.fullResourceName")
  var analysisQueryDotresourceSelectorDotfullResourceName: js.UndefOr[String] = js.undefined
  
  /**
    * Optional. If true, the response will include access analysis from identities to resources via service account impersonation. This is a very expensive operation, because many derived queries will be executed. We highly recommend you use AssetService.ExportIamPolicyAnalysis rpc instead. For example, if the request analyzes for which resources user A has permission P, and there's an IAM policy states user A has iam.serviceAccounts.getAccessToken permission to a service account SA, and there's another IAM policy states service account SA has permission P to a GCP folder F, then user A potentially has access to the GCP folder F. And those advanced analysis results will be included in AnalyzeIamPolicyResponse.service_account_impersonation_analysis. Another example, if the request analyzes for who has permission P to a GCP folder F, and there's an IAM policy states user A has iam.serviceAccounts.actAs permission to a service account SA, and there's another IAM policy states service account SA has permission P to the GCP folder F, then user A potentially has access to the GCP folder F. And those advanced analysis results will be included in AnalyzeIamPolicyResponse.service_account_impersonation_analysis. Default is false.
    */
  @JSName("options.analyzeServiceAccountImpersonation")
  var optionsDotanalyzeServiceAccountImpersonation: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Optional. Amount of time executable has to complete. See JSON representation of [Duration](https://developers.google.com/protocol-buffers/docs/proto3#json). If this field is set with a value less than the RPC deadline, and the execution of your query hasn't finished in the specified execution timeout, you will get a response with partial result. Otherwise, your query's execution will continue until the RPC deadline. If it's not finished until then, you will get a DEADLINE_EXCEEDED error. Default is empty.
    */
  @JSName("options.executionTimeout")
  var optionsDotexecutionTimeout: js.UndefOr[String] = js.undefined
  
  /**
    * Optional. If true, the identities section of the result will expand any Google groups appearing in an IAM policy binding. If identity_selector is specified, the identity in the result will be determined by the selector, and this flag will have no effect. Default is false.
    */
  @JSName("options.expandGroups")
  var optionsDotexpandGroups: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Optional. If true, the resource section of the result will expand any resource attached to an IAM policy to include resources lower in the resource hierarchy. For example, if the request analyzes for which resources user A has permission P, and the results include an IAM policy with P on a GCP folder, the results will also include resources in that folder with permission P. If resource_selector is specified, the resource section of the result will be determined by the selector, and this flag will have no effect. Default is false.
    */
  @JSName("options.expandResources")
  var optionsDotexpandResources: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Optional. If true, the access section of result will expand any roles appearing in IAM policy bindings to include their permissions. If access_selector is specified, the access section of the result will be determined by the selector, and this flag will have no effect. Default is false.
    */
  @JSName("options.expandRoles")
  var optionsDotexpandRoles: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Optional. If true, the result will output group identity edges, starting from the binding's group members, to any expanded identities. Default is false.
    */
  @JSName("options.outputGroupEdges")
  var optionsDotoutputGroupEdges: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Optional. If true, the result will output resource edges, starting from the policy attached resource, to any expanded resources. Default is false.
    */
  @JSName("options.outputResourceEdges")
  var optionsDotoutputResourceEdges: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Required. The relative name of the root asset. Only resources and IAM policies within the parent will be analyzed. This can only be an organization number (such as "organizations/123"), a folder number (such as "folders/123"), a project ID (such as "projects/my-project-id"), or a project number (such as "projects/12345"). To know how to get organization id, visit [here ](https://cloud.google.com/resource-manager/docs/creating-managing-organization#retrieving_your_organization_id). To know how to get folder or project id, visit [here ](https://cloud.google.com/resource-manager/docs/creating-managing-folders#viewing_or_listing_folders_and_projects).
    */
  var parent: js.UndefOr[String] = js.undefined
}
object ParamsResourceV1p4beta1Analyzeiampolicy {
  
  inline def apply(): ParamsResourceV1p4beta1Analyzeiampolicy = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceV1p4beta1Analyzeiampolicy]
  }
  
  extension [Self <: ParamsResourceV1p4beta1Analyzeiampolicy](x: Self) {
    
    inline def setAnalysisQueryDotaccessSelectorDotpermissions(value: js.Array[String]): Self = StObject.set(x, "analysisQuery.accessSelector.permissions", value.asInstanceOf[js.Any])
    
    inline def setAnalysisQueryDotaccessSelectorDotpermissionsUndefined: Self = StObject.set(x, "analysisQuery.accessSelector.permissions", js.undefined)
    
    inline def setAnalysisQueryDotaccessSelectorDotpermissionsVarargs(value: String*): Self = StObject.set(x, "analysisQuery.accessSelector.permissions", js.Array(value*))
    
    inline def setAnalysisQueryDotaccessSelectorDotroles(value: js.Array[String]): Self = StObject.set(x, "analysisQuery.accessSelector.roles", value.asInstanceOf[js.Any])
    
    inline def setAnalysisQueryDotaccessSelectorDotrolesUndefined: Self = StObject.set(x, "analysisQuery.accessSelector.roles", js.undefined)
    
    inline def setAnalysisQueryDotaccessSelectorDotrolesVarargs(value: String*): Self = StObject.set(x, "analysisQuery.accessSelector.roles", js.Array(value*))
    
    inline def setAnalysisQueryDotidentitySelectorDotidentity(value: String): Self = StObject.set(x, "analysisQuery.identitySelector.identity", value.asInstanceOf[js.Any])
    
    inline def setAnalysisQueryDotidentitySelectorDotidentityUndefined: Self = StObject.set(x, "analysisQuery.identitySelector.identity", js.undefined)
    
    inline def setAnalysisQueryDotresourceSelectorDotfullResourceName(value: String): Self = StObject.set(x, "analysisQuery.resourceSelector.fullResourceName", value.asInstanceOf[js.Any])
    
    inline def setAnalysisQueryDotresourceSelectorDotfullResourceNameUndefined: Self = StObject.set(x, "analysisQuery.resourceSelector.fullResourceName", js.undefined)
    
    inline def setOptionsDotanalyzeServiceAccountImpersonation(value: Boolean): Self = StObject.set(x, "options.analyzeServiceAccountImpersonation", value.asInstanceOf[js.Any])
    
    inline def setOptionsDotanalyzeServiceAccountImpersonationUndefined: Self = StObject.set(x, "options.analyzeServiceAccountImpersonation", js.undefined)
    
    inline def setOptionsDotexecutionTimeout(value: String): Self = StObject.set(x, "options.executionTimeout", value.asInstanceOf[js.Any])
    
    inline def setOptionsDotexecutionTimeoutUndefined: Self = StObject.set(x, "options.executionTimeout", js.undefined)
    
    inline def setOptionsDotexpandGroups(value: Boolean): Self = StObject.set(x, "options.expandGroups", value.asInstanceOf[js.Any])
    
    inline def setOptionsDotexpandGroupsUndefined: Self = StObject.set(x, "options.expandGroups", js.undefined)
    
    inline def setOptionsDotexpandResources(value: Boolean): Self = StObject.set(x, "options.expandResources", value.asInstanceOf[js.Any])
    
    inline def setOptionsDotexpandResourcesUndefined: Self = StObject.set(x, "options.expandResources", js.undefined)
    
    inline def setOptionsDotexpandRoles(value: Boolean): Self = StObject.set(x, "options.expandRoles", value.asInstanceOf[js.Any])
    
    inline def setOptionsDotexpandRolesUndefined: Self = StObject.set(x, "options.expandRoles", js.undefined)
    
    inline def setOptionsDotoutputGroupEdges(value: Boolean): Self = StObject.set(x, "options.outputGroupEdges", value.asInstanceOf[js.Any])
    
    inline def setOptionsDotoutputGroupEdgesUndefined: Self = StObject.set(x, "options.outputGroupEdges", js.undefined)
    
    inline def setOptionsDotoutputResourceEdges(value: Boolean): Self = StObject.set(x, "options.outputResourceEdges", value.asInstanceOf[js.Any])
    
    inline def setOptionsDotoutputResourceEdgesUndefined: Self = StObject.set(x, "options.outputResourceEdges", js.undefined)
    
    inline def setParent(value: String): Self = StObject.set(x, "parent", value.asInstanceOf[js.Any])
    
    inline def setParentUndefined: Self = StObject.set(x, "parent", js.undefined)
  }
}
