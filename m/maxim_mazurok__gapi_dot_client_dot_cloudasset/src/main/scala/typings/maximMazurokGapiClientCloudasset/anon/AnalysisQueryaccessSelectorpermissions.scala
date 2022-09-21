package typings.maximMazurokGapiClientCloudasset.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AnalysisQueryaccessSelectorpermissions extends StObject {
  
  /** V1 error format. */
  @JSName("$.xgafv")
  var $Dotxgafv: js.UndefOr[String] = js.undefined
  
  /** OAuth access token. */
  var access_token: js.UndefOr[String] = js.undefined
  
  /** Data format for response. */
  var alt: js.UndefOr[String] = js.undefined
  
  /** Optional. The permissions to appear in result. */
  @JSName("analysisQuery.accessSelector.permissions")
  var analysisQueryDotaccessSelectorDotpermissions: js.UndefOr[String | js.Array[String]] = js.undefined
  
  /** Optional. The roles to appear in result. */
  @JSName("analysisQuery.accessSelector.roles")
  var analysisQueryDotaccessSelectorDotroles: js.UndefOr[String | js.Array[String]] = js.undefined
  
  /**
    * The hypothetical access timestamp to evaluate IAM conditions. Note that this value must not be earlier than the current time; otherwise, an INVALID_ARGUMENT error will be
    * returned.
    */
  @JSName("analysisQuery.conditionContext.accessTime")
  var analysisQueryDotconditionContextDotaccessTime: js.UndefOr[String] = js.undefined
  
  /**
    * Required. The identity appear in the form of principals in [IAM policy binding](https://cloud.google.com/iam/reference/rest/v1/Binding). The examples of supported forms are:
    * "user:mike@example.com", "group:admins@example.com", "domain:google.com", "serviceAccount:my-project-id@appspot.gserviceaccount.com". Notice that wildcard characters (such as *
    * and ?) are not supported. You must give a specific identity.
    */
  @JSName("analysisQuery.identitySelector.identity")
  var analysisQueryDotidentitySelectorDotidentity: js.UndefOr[String] = js.undefined
  
  /**
    * Optional. If true, the response will include access analysis from identities to resources via service account impersonation. This is a very expensive operation, because many
    * derived queries will be executed. We highly recommend you use AssetService.AnalyzeIamPolicyLongrunning rpc instead. For example, if the request analyzes for which resources user
    * A has permission P, and there's an IAM policy states user A has iam.serviceAccounts.getAccessToken permission to a service account SA, and there's another IAM policy states
    * service account SA has permission P to a GCP folder F, then user A potentially has access to the GCP folder F. And those advanced analysis results will be included in
    * AnalyzeIamPolicyResponse.service_account_impersonation_analysis. Another example, if the request analyzes for who has permission P to a GCP folder F, and there's an IAM policy
    * states user A has iam.serviceAccounts.actAs permission to a service account SA, and there's another IAM policy states service account SA has permission P to the GCP folder F,
    * then user A potentially has access to the GCP folder F. And those advanced analysis results will be included in AnalyzeIamPolicyResponse.service_account_impersonation_analysis.
    * Only the following permissions are considered in this analysis: * `iam.serviceAccounts.actAs` * `iam.serviceAccounts.signBlob` * `iam.serviceAccounts.signJwt` *
    * `iam.serviceAccounts.getAccessToken` * `iam.serviceAccounts.getOpenIdToken` * `iam.serviceAccounts.implicitDelegation` Default is false.
    */
  @JSName("analysisQuery.options.analyzeServiceAccountImpersonation")
  var analysisQueryDotoptionsDotanalyzeServiceAccountImpersonation: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Optional. If true, the identities section of the result will expand any Google groups appearing in an IAM policy binding. If IamPolicyAnalysisQuery.identity_selector is
    * specified, the identity in the result will be determined by the selector, and this flag is not allowed to set. If true, the default max expansion per group is 1000 for
    * AssetService.AnalyzeIamPolicy][]. Default is false.
    */
  @JSName("analysisQuery.options.expandGroups")
  var analysisQueryDotoptionsDotexpandGroups: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Optional. If true and IamPolicyAnalysisQuery.resource_selector is not specified, the resource section of the result will expand any resource attached to an IAM policy to include
    * resources lower in the resource hierarchy. For example, if the request analyzes for which resources user A has permission P, and the results include an IAM policy with P on a
    * GCP folder, the results will also include resources in that folder with permission P. If true and IamPolicyAnalysisQuery.resource_selector is specified, the resource section of
    * the result will expand the specified resource to include resources lower in the resource hierarchy. Only project or lower resources are supported. Folder and organization
    * resource cannot be used together with this option. For example, if the request analyzes for which users have permission P on a GCP project with this option enabled, the results
    * will include all users who have permission P on that project or any lower resource. If true, the default max expansion per resource is 1000 for AssetService.AnalyzeIamPolicy][]
    * and 100000 for AssetService.AnalyzeIamPolicyLongrunning][]. Default is false.
    */
  @JSName("analysisQuery.options.expandResources")
  var analysisQueryDotoptionsDotexpandResources: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Optional. If true, the access section of result will expand any roles appearing in IAM policy bindings to include their permissions. If IamPolicyAnalysisQuery.access_selector is
    * specified, the access section of the result will be determined by the selector, and this flag is not allowed to set. Default is false.
    */
  @JSName("analysisQuery.options.expandRoles")
  var analysisQueryDotoptionsDotexpandRoles: js.UndefOr[Boolean] = js.undefined
  
  /** Optional. If true, the result will output the relevant membership relationships between groups and other groups, and between groups and principals. Default is false. */
  @JSName("analysisQuery.options.outputGroupEdges")
  var analysisQueryDotoptionsDotoutputGroupEdges: js.UndefOr[Boolean] = js.undefined
  
  /** Optional. If true, the result will output the relevant parent/child relationships between resources. Default is false. */
  @JSName("analysisQuery.options.outputResourceEdges")
  var analysisQueryDotoptionsDotoutputResourceEdges: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Required. The [full resource name] (https://cloud.google.com/asset-inventory/docs/resource-name-format) of a resource of [supported resource
    * types](https://cloud.google.com/asset-inventory/docs/supported-asset-types#analyzable_asset_types).
    */
  @JSName("analysisQuery.resourceSelector.fullResourceName")
  var analysisQueryDotresourceSelectorDotfullResourceName: js.UndefOr[String] = js.undefined
  
  /** JSONP */
  var callback: js.UndefOr[String] = js.undefined
  
  /**
    * Optional. Amount of time executable has to complete. See JSON representation of [Duration](https://developers.google.com/protocol-buffers/docs/proto3#json). If this field is set
    * with a value less than the RPC deadline, and the execution of your query hasn't finished in the specified execution timeout, you will get a response with partial result.
    * Otherwise, your query's execution will continue until the RPC deadline. If it's not finished until then, you will get a DEADLINE_EXCEEDED error. Default is empty.
    */
  var executionTimeout: js.UndefOr[String] = js.undefined
  
  /** Selector specifying which fields to include in a partial response. */
  var fields: js.UndefOr[String] = js.undefined
  
  /** API key. Your API key identifies your project and provides you with API access, quota, and reports. Required unless you provide an OAuth 2.0 token. */
  var key: js.UndefOr[String] = js.undefined
  
  /** OAuth 2.0 token for the current user. */
  var oauth_token: js.UndefOr[String] = js.undefined
  
  /** Returns response with indentations and line breaks. */
  var prettyPrint: js.UndefOr[Boolean] = js.undefined
  
  /** Available to use for quota purposes for server-side applications. Can be any arbitrary string assigned to a user, but should not exceed 40 characters. */
  var quotaUser: js.UndefOr[String] = js.undefined
  
  /**
    * Optional. The name of a saved query, which must be in the format of: * projects/project_number/savedQueries/saved_query_id * folders/folder_number/savedQueries/saved_query_id *
    * organizations/organization_number/savedQueries/saved_query_id If both `analysis_query` and `saved_analysis_query` are provided, they will be merged together with the
    * `saved_analysis_query` as base and the `analysis_query` as overrides. For more details of the merge behavior, please refer to the
    * [MergeFrom](https://developers.google.com/protocol-buffers/docs/reference/cpp/google.protobuf.message#Message.MergeFrom.details) page. Note that you cannot override primitive
    * fields with default value, such as 0 or empty string, etc., because we use proto3, which doesn't support field presence yet.
    */
  var savedAnalysisQuery: js.UndefOr[String] = js.undefined
  
  /**
    * Required. The relative name of the root asset. Only resources and IAM policies within the scope will be analyzed. This can only be an organization number (such as
    * "organizations/123"), a folder number (such as "folders/123"), a project ID (such as "projects/my-project-id"), or a project number (such as "projects/12345"). To know how to
    * get organization id, visit [here ](https://cloud.google.com/resource-manager/docs/creating-managing-organization#retrieving_your_organization_id). To know how to get folder or
    * project id, visit [here ](https://cloud.google.com/resource-manager/docs/creating-managing-folders#viewing_or_listing_folders_and_projects).
    */
  var scope: String
  
  /** Legacy upload protocol for media (e.g. "media", "multipart"). */
  var uploadType: js.UndefOr[String] = js.undefined
  
  /** Upload protocol for media (e.g. "raw", "multipart"). */
  var upload_protocol: js.UndefOr[String] = js.undefined
}
object AnalysisQueryaccessSelectorpermissions {
  
  inline def apply(scope: String): AnalysisQueryaccessSelectorpermissions = {
    val __obj = js.Dynamic.literal(scope = scope.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnalysisQueryaccessSelectorpermissions]
  }
  
  extension [Self <: AnalysisQueryaccessSelectorpermissions](x: Self) {
    
    inline def set$Dotxgafv(value: String): Self = StObject.set(x, "$.xgafv", value.asInstanceOf[js.Any])
    
    inline def set$DotxgafvUndefined: Self = StObject.set(x, "$.xgafv", js.undefined)
    
    inline def setAccess_token(value: String): Self = StObject.set(x, "access_token", value.asInstanceOf[js.Any])
    
    inline def setAccess_tokenUndefined: Self = StObject.set(x, "access_token", js.undefined)
    
    inline def setAlt(value: String): Self = StObject.set(x, "alt", value.asInstanceOf[js.Any])
    
    inline def setAltUndefined: Self = StObject.set(x, "alt", js.undefined)
    
    inline def setAnalysisQueryDotaccessSelectorDotpermissions(value: String | js.Array[String]): Self = StObject.set(x, "analysisQuery.accessSelector.permissions", value.asInstanceOf[js.Any])
    
    inline def setAnalysisQueryDotaccessSelectorDotpermissionsUndefined: Self = StObject.set(x, "analysisQuery.accessSelector.permissions", js.undefined)
    
    inline def setAnalysisQueryDotaccessSelectorDotpermissionsVarargs(value: String*): Self = StObject.set(x, "analysisQuery.accessSelector.permissions", js.Array(value*))
    
    inline def setAnalysisQueryDotaccessSelectorDotroles(value: String | js.Array[String]): Self = StObject.set(x, "analysisQuery.accessSelector.roles", value.asInstanceOf[js.Any])
    
    inline def setAnalysisQueryDotaccessSelectorDotrolesUndefined: Self = StObject.set(x, "analysisQuery.accessSelector.roles", js.undefined)
    
    inline def setAnalysisQueryDotaccessSelectorDotrolesVarargs(value: String*): Self = StObject.set(x, "analysisQuery.accessSelector.roles", js.Array(value*))
    
    inline def setAnalysisQueryDotconditionContextDotaccessTime(value: String): Self = StObject.set(x, "analysisQuery.conditionContext.accessTime", value.asInstanceOf[js.Any])
    
    inline def setAnalysisQueryDotconditionContextDotaccessTimeUndefined: Self = StObject.set(x, "analysisQuery.conditionContext.accessTime", js.undefined)
    
    inline def setAnalysisQueryDotidentitySelectorDotidentity(value: String): Self = StObject.set(x, "analysisQuery.identitySelector.identity", value.asInstanceOf[js.Any])
    
    inline def setAnalysisQueryDotidentitySelectorDotidentityUndefined: Self = StObject.set(x, "analysisQuery.identitySelector.identity", js.undefined)
    
    inline def setAnalysisQueryDotoptionsDotanalyzeServiceAccountImpersonation(value: Boolean): Self = StObject.set(x, "analysisQuery.options.analyzeServiceAccountImpersonation", value.asInstanceOf[js.Any])
    
    inline def setAnalysisQueryDotoptionsDotanalyzeServiceAccountImpersonationUndefined: Self = StObject.set(x, "analysisQuery.options.analyzeServiceAccountImpersonation", js.undefined)
    
    inline def setAnalysisQueryDotoptionsDotexpandGroups(value: Boolean): Self = StObject.set(x, "analysisQuery.options.expandGroups", value.asInstanceOf[js.Any])
    
    inline def setAnalysisQueryDotoptionsDotexpandGroupsUndefined: Self = StObject.set(x, "analysisQuery.options.expandGroups", js.undefined)
    
    inline def setAnalysisQueryDotoptionsDotexpandResources(value: Boolean): Self = StObject.set(x, "analysisQuery.options.expandResources", value.asInstanceOf[js.Any])
    
    inline def setAnalysisQueryDotoptionsDotexpandResourcesUndefined: Self = StObject.set(x, "analysisQuery.options.expandResources", js.undefined)
    
    inline def setAnalysisQueryDotoptionsDotexpandRoles(value: Boolean): Self = StObject.set(x, "analysisQuery.options.expandRoles", value.asInstanceOf[js.Any])
    
    inline def setAnalysisQueryDotoptionsDotexpandRolesUndefined: Self = StObject.set(x, "analysisQuery.options.expandRoles", js.undefined)
    
    inline def setAnalysisQueryDotoptionsDotoutputGroupEdges(value: Boolean): Self = StObject.set(x, "analysisQuery.options.outputGroupEdges", value.asInstanceOf[js.Any])
    
    inline def setAnalysisQueryDotoptionsDotoutputGroupEdgesUndefined: Self = StObject.set(x, "analysisQuery.options.outputGroupEdges", js.undefined)
    
    inline def setAnalysisQueryDotoptionsDotoutputResourceEdges(value: Boolean): Self = StObject.set(x, "analysisQuery.options.outputResourceEdges", value.asInstanceOf[js.Any])
    
    inline def setAnalysisQueryDotoptionsDotoutputResourceEdgesUndefined: Self = StObject.set(x, "analysisQuery.options.outputResourceEdges", js.undefined)
    
    inline def setAnalysisQueryDotresourceSelectorDotfullResourceName(value: String): Self = StObject.set(x, "analysisQuery.resourceSelector.fullResourceName", value.asInstanceOf[js.Any])
    
    inline def setAnalysisQueryDotresourceSelectorDotfullResourceNameUndefined: Self = StObject.set(x, "analysisQuery.resourceSelector.fullResourceName", js.undefined)
    
    inline def setCallback(value: String): Self = StObject.set(x, "callback", value.asInstanceOf[js.Any])
    
    inline def setCallbackUndefined: Self = StObject.set(x, "callback", js.undefined)
    
    inline def setExecutionTimeout(value: String): Self = StObject.set(x, "executionTimeout", value.asInstanceOf[js.Any])
    
    inline def setExecutionTimeoutUndefined: Self = StObject.set(x, "executionTimeout", js.undefined)
    
    inline def setFields(value: String): Self = StObject.set(x, "fields", value.asInstanceOf[js.Any])
    
    inline def setFieldsUndefined: Self = StObject.set(x, "fields", js.undefined)
    
    inline def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    inline def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
    
    inline def setOauth_token(value: String): Self = StObject.set(x, "oauth_token", value.asInstanceOf[js.Any])
    
    inline def setOauth_tokenUndefined: Self = StObject.set(x, "oauth_token", js.undefined)
    
    inline def setPrettyPrint(value: Boolean): Self = StObject.set(x, "prettyPrint", value.asInstanceOf[js.Any])
    
    inline def setPrettyPrintUndefined: Self = StObject.set(x, "prettyPrint", js.undefined)
    
    inline def setQuotaUser(value: String): Self = StObject.set(x, "quotaUser", value.asInstanceOf[js.Any])
    
    inline def setQuotaUserUndefined: Self = StObject.set(x, "quotaUser", js.undefined)
    
    inline def setSavedAnalysisQuery(value: String): Self = StObject.set(x, "savedAnalysisQuery", value.asInstanceOf[js.Any])
    
    inline def setSavedAnalysisQueryUndefined: Self = StObject.set(x, "savedAnalysisQuery", js.undefined)
    
    inline def setScope(value: String): Self = StObject.set(x, "scope", value.asInstanceOf[js.Any])
    
    inline def setUploadType(value: String): Self = StObject.set(x, "uploadType", value.asInstanceOf[js.Any])
    
    inline def setUploadTypeUndefined: Self = StObject.set(x, "uploadType", js.undefined)
    
    inline def setUpload_protocol(value: String): Self = StObject.set(x, "upload_protocol", value.asInstanceOf[js.Any])
    
    inline def setUpload_protocolUndefined: Self = StObject.set(x, "upload_protocol", js.undefined)
  }
}
