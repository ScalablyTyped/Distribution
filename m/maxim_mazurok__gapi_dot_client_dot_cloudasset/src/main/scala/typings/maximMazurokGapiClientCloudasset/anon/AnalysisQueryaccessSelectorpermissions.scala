package typings.maximMazurokGapiClientCloudasset.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AnalysisQueryaccessSelectorpermissions extends js.Object {
  
  /** V1 error format. */
  @JSName("$.xgafv")
  var $Dotxgafv: js.UndefOr[String] = js.native
  
  /** OAuth access token. */
  var access_token: js.UndefOr[String] = js.native
  
  /** Data format for response. */
  var alt: js.UndefOr[String] = js.native
  
  /** Optional. The permissions to appear in result. */
  @JSName("analysisQuery.accessSelector.permissions")
  var analysisQueryDotaccessSelectorDotpermissions: js.UndefOr[String | js.Array[String]] = js.native
  
  /** Optional. The roles to appear in result. */
  @JSName("analysisQuery.accessSelector.roles")
  var analysisQueryDotaccessSelectorDotroles: js.UndefOr[String | js.Array[String]] = js.native
  
  /**
    * Required. The identity appear in the form of members in [IAM policy binding](https://cloud.google.com/iam/reference/rest/v1/Binding). The examples of supported forms are:
    * "user:mike@example.com", "group:admins@example.com", "domain:google.com", "serviceAccount:my-project-id@appspot.gserviceaccount.com". Notice that wildcard characters (such as *
    * and ?) are not supported. You must give a specific identity.
    */
  @JSName("analysisQuery.identitySelector.identity")
  var analysisQueryDotidentitySelectorDotidentity: js.UndefOr[String] = js.native
  
  /**
    * Optional. If true, the response will include access analysis from identities to resources via service account impersonation. This is a very expensive operation, because many
    * derived queries will be executed. We highly recommend you use AssetService.AnalyzeIamPolicyLongrunning rpc instead. For example, if the request analyzes for which resources user
    * A has permission P, and there's an IAM policy states user A has iam.serviceAccounts.getAccessToken permission to a service account SA, and there's another IAM policy states
    * service account SA has permission P to a GCP folder F, then user A potentially has access to the GCP folder F. And those advanced analysis results will be included in
    * AnalyzeIamPolicyResponse.service_account_impersonation_analysis. Another example, if the request analyzes for who has permission P to a GCP folder F, and there's an IAM policy
    * states user A has iam.serviceAccounts.actAs permission to a service account SA, and there's another IAM policy states service account SA has permission P to the GCP folder F,
    * then user A potentially has access to the GCP folder F. And those advanced analysis results will be included in AnalyzeIamPolicyResponse.service_account_impersonation_analysis.
    * Default is false.
    */
  @JSName("analysisQuery.options.analyzeServiceAccountImpersonation")
  var analysisQueryDotoptionsDotanalyzeServiceAccountImpersonation: js.UndefOr[Boolean] = js.native
  
  /**
    * Optional. If true, the identities section of the result will expand any Google groups appearing in an IAM policy binding. If IamPolicyAnalysisQuery.identity_selector is
    * specified, the identity in the result will be determined by the selector, and this flag is not allowed to set. Default is false.
    */
  @JSName("analysisQuery.options.expandGroups")
  var analysisQueryDotoptionsDotexpandGroups: js.UndefOr[Boolean] = js.native
  
  /**
    * Optional. If true and IamPolicyAnalysisQuery.resource_selector is not specified, the resource section of the result will expand any resource attached to an IAM policy to include
    * resources lower in the resource hierarchy. For example, if the request analyzes for which resources user A has permission P, and the results include an IAM policy with P on a
    * GCP folder, the results will also include resources in that folder with permission P. If true and IamPolicyAnalysisQuery.resource_selector is specified, the resource section of
    * the result will expand the specified resource to include resources lower in the resource hierarchy. Only project or lower resources are supported. Folder and organization
    * resource cannot be used together with this option. For example, if the request analyzes for which users have permission P on a GCP project with this option enabled, the results
    * will include all users who have permission P on that project or any lower resource. Default is false.
    */
  @JSName("analysisQuery.options.expandResources")
  var analysisQueryDotoptionsDotexpandResources: js.UndefOr[Boolean] = js.native
  
  /**
    * Optional. If true, the access section of result will expand any roles appearing in IAM policy bindings to include their permissions. If IamPolicyAnalysisQuery.access_selector is
    * specified, the access section of the result will be determined by the selector, and this flag is not allowed to set. Default is false.
    */
  @JSName("analysisQuery.options.expandRoles")
  var analysisQueryDotoptionsDotexpandRoles: js.UndefOr[Boolean] = js.native
  
  /** Optional. If true, the result will output group identity edges, starting from the binding's group members, to any expanded identities. Default is false. */
  @JSName("analysisQuery.options.outputGroupEdges")
  var analysisQueryDotoptionsDotoutputGroupEdges: js.UndefOr[Boolean] = js.native
  
  /** Optional. If true, the result will output resource edges, starting from the policy attached resource, to any expanded resources. Default is false. */
  @JSName("analysisQuery.options.outputResourceEdges")
  var analysisQueryDotoptionsDotoutputResourceEdges: js.UndefOr[Boolean] = js.native
  
  /**
    * Required. The [full resource name] (https://cloud.google.com/asset-inventory/docs/resource-name-format) of a resource of [supported resource
    * types](https://cloud.google.com/asset-inventory/docs/supported-asset-types#analyzable_asset_types).
    */
  @JSName("analysisQuery.resourceSelector.fullResourceName")
  var analysisQueryDotresourceSelectorDotfullResourceName: js.UndefOr[String] = js.native
  
  /** JSONP */
  var callback: js.UndefOr[String] = js.native
  
  /**
    * Optional. Amount of time executable has to complete. See JSON representation of [Duration](https://developers.google.com/protocol-buffers/docs/proto3#json). If this field is set
    * with a value less than the RPC deadline, and the execution of your query hasn't finished in the specified execution timeout, you will get a response with partial result.
    * Otherwise, your query's execution will continue until the RPC deadline. If it's not finished until then, you will get a DEADLINE_EXCEEDED error. Default is empty.
    */
  var executionTimeout: js.UndefOr[String] = js.native
  
  /** Selector specifying which fields to include in a partial response. */
  var fields: js.UndefOr[String] = js.native
  
  /** API key. Your API key identifies your project and provides you with API access, quota, and reports. Required unless you provide an OAuth 2.0 token. */
  var key: js.UndefOr[String] = js.native
  
  /** OAuth 2.0 token for the current user. */
  var oauth_token: js.UndefOr[String] = js.native
  
  /** Returns response with indentations and line breaks. */
  var prettyPrint: js.UndefOr[Boolean] = js.native
  
  /** Available to use for quota purposes for server-side applications. Can be any arbitrary string assigned to a user, but should not exceed 40 characters. */
  var quotaUser: js.UndefOr[String] = js.native
  
  /**
    * Required. The relative name of the root asset. Only resources and IAM policies within the scope will be analyzed. This can only be an organization number (such as
    * "organizations/123"), a folder number (such as "folders/123"), a project ID (such as "projects/my-project-id"), or a project number (such as "projects/12345"). To know how to
    * get organization id, visit [here ](https://cloud.google.com/resource-manager/docs/creating-managing-organization#retrieving_your_organization_id). To know how to get folder or
    * project id, visit [here ](https://cloud.google.com/resource-manager/docs/creating-managing-folders#viewing_or_listing_folders_and_projects).
    */
  var scope: String = js.native
  
  /** Legacy upload protocol for media (e.g. "media", "multipart"). */
  var uploadType: js.UndefOr[String] = js.native
  
  /** Upload protocol for media (e.g. "raw", "multipart"). */
  var upload_protocol: js.UndefOr[String] = js.native
}
object AnalysisQueryaccessSelectorpermissions {
  
  @scala.inline
  def apply(scope: String): AnalysisQueryaccessSelectorpermissions = {
    val __obj = js.Dynamic.literal(scope = scope.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnalysisQueryaccessSelectorpermissions]
  }
  
  @scala.inline
  implicit class AnalysisQueryaccessSelectorpermissionsOps[Self <: AnalysisQueryaccessSelectorpermissions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setScope(value: String): Self = this.set("scope", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set$Dotxgafv(value: String): Self = this.set("$.xgafv", value.asInstanceOf[js.Any])
    
    @scala.inline
    def delete$Dotxgafv: Self = this.set("$.xgafv", js.undefined)
    
    @scala.inline
    def setAccess_token(value: String): Self = this.set("access_token", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAccess_token: Self = this.set("access_token", js.undefined)
    
    @scala.inline
    def setAlt(value: String): Self = this.set("alt", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAlt: Self = this.set("alt", js.undefined)
    
    @scala.inline
    def setAnalysisQueryDotaccessSelectorDotpermissionsVarargs(value: String*): Self = this.set("analysisQuery.accessSelector.permissions", js.Array(value :_*))
    
    @scala.inline
    def setAnalysisQueryDotaccessSelectorDotpermissions(value: String | js.Array[String]): Self = this.set("analysisQuery.accessSelector.permissions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAnalysisQueryDotaccessSelectorDotpermissions: Self = this.set("analysisQuery.accessSelector.permissions", js.undefined)
    
    @scala.inline
    def setAnalysisQueryDotaccessSelectorDotrolesVarargs(value: String*): Self = this.set("analysisQuery.accessSelector.roles", js.Array(value :_*))
    
    @scala.inline
    def setAnalysisQueryDotaccessSelectorDotroles(value: String | js.Array[String]): Self = this.set("analysisQuery.accessSelector.roles", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAnalysisQueryDotaccessSelectorDotroles: Self = this.set("analysisQuery.accessSelector.roles", js.undefined)
    
    @scala.inline
    def setAnalysisQueryDotidentitySelectorDotidentity(value: String): Self = this.set("analysisQuery.identitySelector.identity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAnalysisQueryDotidentitySelectorDotidentity: Self = this.set("analysisQuery.identitySelector.identity", js.undefined)
    
    @scala.inline
    def setAnalysisQueryDotoptionsDotanalyzeServiceAccountImpersonation(value: Boolean): Self = this.set("analysisQuery.options.analyzeServiceAccountImpersonation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAnalysisQueryDotoptionsDotanalyzeServiceAccountImpersonation: Self = this.set("analysisQuery.options.analyzeServiceAccountImpersonation", js.undefined)
    
    @scala.inline
    def setAnalysisQueryDotoptionsDotexpandGroups(value: Boolean): Self = this.set("analysisQuery.options.expandGroups", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAnalysisQueryDotoptionsDotexpandGroups: Self = this.set("analysisQuery.options.expandGroups", js.undefined)
    
    @scala.inline
    def setAnalysisQueryDotoptionsDotexpandResources(value: Boolean): Self = this.set("analysisQuery.options.expandResources", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAnalysisQueryDotoptionsDotexpandResources: Self = this.set("analysisQuery.options.expandResources", js.undefined)
    
    @scala.inline
    def setAnalysisQueryDotoptionsDotexpandRoles(value: Boolean): Self = this.set("analysisQuery.options.expandRoles", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAnalysisQueryDotoptionsDotexpandRoles: Self = this.set("analysisQuery.options.expandRoles", js.undefined)
    
    @scala.inline
    def setAnalysisQueryDotoptionsDotoutputGroupEdges(value: Boolean): Self = this.set("analysisQuery.options.outputGroupEdges", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAnalysisQueryDotoptionsDotoutputGroupEdges: Self = this.set("analysisQuery.options.outputGroupEdges", js.undefined)
    
    @scala.inline
    def setAnalysisQueryDotoptionsDotoutputResourceEdges(value: Boolean): Self = this.set("analysisQuery.options.outputResourceEdges", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAnalysisQueryDotoptionsDotoutputResourceEdges: Self = this.set("analysisQuery.options.outputResourceEdges", js.undefined)
    
    @scala.inline
    def setAnalysisQueryDotresourceSelectorDotfullResourceName(value: String): Self = this.set("analysisQuery.resourceSelector.fullResourceName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAnalysisQueryDotresourceSelectorDotfullResourceName: Self = this.set("analysisQuery.resourceSelector.fullResourceName", js.undefined)
    
    @scala.inline
    def setCallback(value: String): Self = this.set("callback", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCallback: Self = this.set("callback", js.undefined)
    
    @scala.inline
    def setExecutionTimeout(value: String): Self = this.set("executionTimeout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExecutionTimeout: Self = this.set("executionTimeout", js.undefined)
    
    @scala.inline
    def setFields(value: String): Self = this.set("fields", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFields: Self = this.set("fields", js.undefined)
    
    @scala.inline
    def setKey(value: String): Self = this.set("key", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKey: Self = this.set("key", js.undefined)
    
    @scala.inline
    def setOauth_token(value: String): Self = this.set("oauth_token", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOauth_token: Self = this.set("oauth_token", js.undefined)
    
    @scala.inline
    def setPrettyPrint(value: Boolean): Self = this.set("prettyPrint", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePrettyPrint: Self = this.set("prettyPrint", js.undefined)
    
    @scala.inline
    def setQuotaUser(value: String): Self = this.set("quotaUser", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteQuotaUser: Self = this.set("quotaUser", js.undefined)
    
    @scala.inline
    def setUploadType(value: String): Self = this.set("uploadType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUploadType: Self = this.set("uploadType", js.undefined)
    
    @scala.inline
    def setUpload_protocol(value: String): Self = this.set("upload_protocol", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUpload_protocol: Self = this.set("upload_protocol", js.undefined)
  }
}
