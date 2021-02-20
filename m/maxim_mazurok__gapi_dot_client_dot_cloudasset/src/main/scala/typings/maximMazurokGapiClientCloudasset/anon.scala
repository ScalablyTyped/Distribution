package typings.maximMazurokGapiClientCloudasset

import typings.maximMazurokGapiClientCloudasset.gapi.client.cloudasset.AnalyzeIamPolicyLongrunningRequest
import typings.maximMazurokGapiClientCloudasset.gapi.client.cloudasset.CreateFeedRequest
import typings.maximMazurokGapiClientCloudasset.gapi.client.cloudasset.ExportAssetsRequest
import typings.maximMazurokGapiClientCloudasset.gapi.client.cloudasset.UpdateFeedRequest
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait Accesstoken extends StObject {
    
    /** V1 error format. */
    @JSName("$.xgafv")
    var $Dotxgafv: js.UndefOr[String] = js.native
    
    /** OAuth access token. */
    var access_token: js.UndefOr[String] = js.native
    
    /** Data format for response. */
    var alt: js.UndefOr[String] = js.native
    
    /** JSONP */
    var callback: js.UndefOr[String] = js.native
    
    /** Selector specifying which fields to include in a partial response. */
    var fields: js.UndefOr[String] = js.native
    
    /** API key. Your API key identifies your project and provides you with API access, quota, and reports. Required unless you provide an OAuth 2.0 token. */
    var key: js.UndefOr[String] = js.native
    
    /** OAuth 2.0 token for the current user. */
    var oauth_token: js.UndefOr[String] = js.native
    
    /**
      * Required. The name of the project/folder/organization where this feed should be created in. It can only be an organization number (such as "organizations/123"), a folder number
      * (such as "folders/123"), a project ID (such as "projects/my-project-id")", or a project number (such as "projects/12345").
      */
    var parent: String = js.native
    
    /** Returns response with indentations and line breaks. */
    var prettyPrint: js.UndefOr[Boolean] = js.native
    
    /** Available to use for quota purposes for server-side applications. Can be any arbitrary string assigned to a user, but should not exceed 40 characters. */
    var quotaUser: js.UndefOr[String] = js.native
    
    /** Request body */
    var resource: CreateFeedRequest = js.native
    
    /** Legacy upload protocol for media (e.g. "media", "multipart"). */
    var uploadType: js.UndefOr[String] = js.native
    
    /** Upload protocol for media (e.g. "raw", "multipart"). */
    var upload_protocol: js.UndefOr[String] = js.native
  }
  object Accesstoken {
    
    @scala.inline
    def apply(parent: String, resource: CreateFeedRequest): Accesstoken = {
      val __obj = js.Dynamic.literal(parent = parent.asInstanceOf[js.Any], resource = resource.asInstanceOf[js.Any])
      __obj.asInstanceOf[Accesstoken]
    }
    
    @scala.inline
    implicit class AccesstokenMutableBuilder[Self <: Accesstoken] (val x: Self) extends AnyVal {
      
      @scala.inline
      def set$Dotxgafv(value: String): Self = StObject.set(x, "$.xgafv", value.asInstanceOf[js.Any])
      
      @scala.inline
      def set$DotxgafvUndefined: Self = StObject.set(x, "$.xgafv", js.undefined)
      
      @scala.inline
      def setAccess_token(value: String): Self = StObject.set(x, "access_token", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAccess_tokenUndefined: Self = StObject.set(x, "access_token", js.undefined)
      
      @scala.inline
      def setAlt(value: String): Self = StObject.set(x, "alt", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAltUndefined: Self = StObject.set(x, "alt", js.undefined)
      
      @scala.inline
      def setCallback(value: String): Self = StObject.set(x, "callback", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCallbackUndefined: Self = StObject.set(x, "callback", js.undefined)
      
      @scala.inline
      def setFields(value: String): Self = StObject.set(x, "fields", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFieldsUndefined: Self = StObject.set(x, "fields", js.undefined)
      
      @scala.inline
      def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
      
      @scala.inline
      def setOauth_token(value: String): Self = StObject.set(x, "oauth_token", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOauth_tokenUndefined: Self = StObject.set(x, "oauth_token", js.undefined)
      
      @scala.inline
      def setParent(value: String): Self = StObject.set(x, "parent", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPrettyPrint(value: Boolean): Self = StObject.set(x, "prettyPrint", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPrettyPrintUndefined: Self = StObject.set(x, "prettyPrint", js.undefined)
      
      @scala.inline
      def setQuotaUser(value: String): Self = StObject.set(x, "quotaUser", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setQuotaUserUndefined: Self = StObject.set(x, "quotaUser", js.undefined)
      
      @scala.inline
      def setResource(value: CreateFeedRequest): Self = StObject.set(x, "resource", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUploadType(value: String): Self = StObject.set(x, "uploadType", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUploadTypeUndefined: Self = StObject.set(x, "uploadType", js.undefined)
      
      @scala.inline
      def setUpload_protocol(value: String): Self = StObject.set(x, "upload_protocol", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUpload_protocolUndefined: Self = StObject.set(x, "upload_protocol", js.undefined)
    }
  }
  
  @js.native
  trait Alt extends StObject {
    
    /** V1 error format. */
    @JSName("$.xgafv")
    var $Dotxgafv: js.UndefOr[String] = js.native
    
    /** OAuth access token. */
    var access_token: js.UndefOr[String] = js.native
    
    /** Data format for response. */
    var alt: js.UndefOr[String] = js.native
    
    /** JSONP */
    var callback: js.UndefOr[String] = js.native
    
    /** Selector specifying which fields to include in a partial response. */
    var fields: js.UndefOr[String] = js.native
    
    /** API key. Your API key identifies your project and provides you with API access, quota, and reports. Required unless you provide an OAuth 2.0 token. */
    var key: js.UndefOr[String] = js.native
    
    /** OAuth 2.0 token for the current user. */
    var oauth_token: js.UndefOr[String] = js.native
    
    /**
      * Required. The relative name of the root asset. This can only be an organization number (such as "organizations/123"), a project ID (such as "projects/my-project-id"), or a
      * project number (such as "projects/12345"), or a folder number (such as "folders/123").
      */
    var parent: String = js.native
    
    /** Returns response with indentations and line breaks. */
    var prettyPrint: js.UndefOr[Boolean] = js.native
    
    /** Available to use for quota purposes for server-side applications. Can be any arbitrary string assigned to a user, but should not exceed 40 characters. */
    var quotaUser: js.UndefOr[String] = js.native
    
    /** Legacy upload protocol for media (e.g. "media", "multipart"). */
    var uploadType: js.UndefOr[String] = js.native
    
    /** Upload protocol for media (e.g. "raw", "multipart"). */
    var upload_protocol: js.UndefOr[String] = js.native
  }
  object Alt {
    
    @scala.inline
    def apply(parent: String): Alt = {
      val __obj = js.Dynamic.literal(parent = parent.asInstanceOf[js.Any])
      __obj.asInstanceOf[Alt]
    }
    
    @scala.inline
    implicit class AltMutableBuilder[Self <: Alt] (val x: Self) extends AnyVal {
      
      @scala.inline
      def set$Dotxgafv(value: String): Self = StObject.set(x, "$.xgafv", value.asInstanceOf[js.Any])
      
      @scala.inline
      def set$DotxgafvUndefined: Self = StObject.set(x, "$.xgafv", js.undefined)
      
      @scala.inline
      def setAccess_token(value: String): Self = StObject.set(x, "access_token", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAccess_tokenUndefined: Self = StObject.set(x, "access_token", js.undefined)
      
      @scala.inline
      def setAlt(value: String): Self = StObject.set(x, "alt", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAltUndefined: Self = StObject.set(x, "alt", js.undefined)
      
      @scala.inline
      def setCallback(value: String): Self = StObject.set(x, "callback", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCallbackUndefined: Self = StObject.set(x, "callback", js.undefined)
      
      @scala.inline
      def setFields(value: String): Self = StObject.set(x, "fields", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFieldsUndefined: Self = StObject.set(x, "fields", js.undefined)
      
      @scala.inline
      def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
      
      @scala.inline
      def setOauth_token(value: String): Self = StObject.set(x, "oauth_token", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOauth_tokenUndefined: Self = StObject.set(x, "oauth_token", js.undefined)
      
      @scala.inline
      def setParent(value: String): Self = StObject.set(x, "parent", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPrettyPrint(value: Boolean): Self = StObject.set(x, "prettyPrint", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPrettyPrintUndefined: Self = StObject.set(x, "prettyPrint", js.undefined)
      
      @scala.inline
      def setQuotaUser(value: String): Self = StObject.set(x, "quotaUser", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setQuotaUserUndefined: Self = StObject.set(x, "quotaUser", js.undefined)
      
      @scala.inline
      def setUploadType(value: String): Self = StObject.set(x, "uploadType", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUploadTypeUndefined: Self = StObject.set(x, "uploadType", js.undefined)
      
      @scala.inline
      def setUpload_protocol(value: String): Self = StObject.set(x, "upload_protocol", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUpload_protocolUndefined: Self = StObject.set(x, "upload_protocol", js.undefined)
    }
  }
  
  @js.native
  trait AnalysisQueryaccessSelectorpermissions extends StObject {
    
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
    implicit class AnalysisQueryaccessSelectorpermissionsMutableBuilder[Self <: AnalysisQueryaccessSelectorpermissions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def set$Dotxgafv(value: String): Self = StObject.set(x, "$.xgafv", value.asInstanceOf[js.Any])
      
      @scala.inline
      def set$DotxgafvUndefined: Self = StObject.set(x, "$.xgafv", js.undefined)
      
      @scala.inline
      def setAccess_token(value: String): Self = StObject.set(x, "access_token", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAccess_tokenUndefined: Self = StObject.set(x, "access_token", js.undefined)
      
      @scala.inline
      def setAlt(value: String): Self = StObject.set(x, "alt", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAltUndefined: Self = StObject.set(x, "alt", js.undefined)
      
      @scala.inline
      def setAnalysisQueryDotaccessSelectorDotpermissions(value: String | js.Array[String]): Self = StObject.set(x, "analysisQuery.accessSelector.permissions", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAnalysisQueryDotaccessSelectorDotpermissionsUndefined: Self = StObject.set(x, "analysisQuery.accessSelector.permissions", js.undefined)
      
      @scala.inline
      def setAnalysisQueryDotaccessSelectorDotpermissionsVarargs(value: String*): Self = StObject.set(x, "analysisQuery.accessSelector.permissions", js.Array(value :_*))
      
      @scala.inline
      def setAnalysisQueryDotaccessSelectorDotroles(value: String | js.Array[String]): Self = StObject.set(x, "analysisQuery.accessSelector.roles", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAnalysisQueryDotaccessSelectorDotrolesUndefined: Self = StObject.set(x, "analysisQuery.accessSelector.roles", js.undefined)
      
      @scala.inline
      def setAnalysisQueryDotaccessSelectorDotrolesVarargs(value: String*): Self = StObject.set(x, "analysisQuery.accessSelector.roles", js.Array(value :_*))
      
      @scala.inline
      def setAnalysisQueryDotidentitySelectorDotidentity(value: String): Self = StObject.set(x, "analysisQuery.identitySelector.identity", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAnalysisQueryDotidentitySelectorDotidentityUndefined: Self = StObject.set(x, "analysisQuery.identitySelector.identity", js.undefined)
      
      @scala.inline
      def setAnalysisQueryDotoptionsDotanalyzeServiceAccountImpersonation(value: Boolean): Self = StObject.set(x, "analysisQuery.options.analyzeServiceAccountImpersonation", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAnalysisQueryDotoptionsDotanalyzeServiceAccountImpersonationUndefined: Self = StObject.set(x, "analysisQuery.options.analyzeServiceAccountImpersonation", js.undefined)
      
      @scala.inline
      def setAnalysisQueryDotoptionsDotexpandGroups(value: Boolean): Self = StObject.set(x, "analysisQuery.options.expandGroups", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAnalysisQueryDotoptionsDotexpandGroupsUndefined: Self = StObject.set(x, "analysisQuery.options.expandGroups", js.undefined)
      
      @scala.inline
      def setAnalysisQueryDotoptionsDotexpandResources(value: Boolean): Self = StObject.set(x, "analysisQuery.options.expandResources", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAnalysisQueryDotoptionsDotexpandResourcesUndefined: Self = StObject.set(x, "analysisQuery.options.expandResources", js.undefined)
      
      @scala.inline
      def setAnalysisQueryDotoptionsDotexpandRoles(value: Boolean): Self = StObject.set(x, "analysisQuery.options.expandRoles", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAnalysisQueryDotoptionsDotexpandRolesUndefined: Self = StObject.set(x, "analysisQuery.options.expandRoles", js.undefined)
      
      @scala.inline
      def setAnalysisQueryDotoptionsDotoutputGroupEdges(value: Boolean): Self = StObject.set(x, "analysisQuery.options.outputGroupEdges", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAnalysisQueryDotoptionsDotoutputGroupEdgesUndefined: Self = StObject.set(x, "analysisQuery.options.outputGroupEdges", js.undefined)
      
      @scala.inline
      def setAnalysisQueryDotoptionsDotoutputResourceEdges(value: Boolean): Self = StObject.set(x, "analysisQuery.options.outputResourceEdges", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAnalysisQueryDotoptionsDotoutputResourceEdgesUndefined: Self = StObject.set(x, "analysisQuery.options.outputResourceEdges", js.undefined)
      
      @scala.inline
      def setAnalysisQueryDotresourceSelectorDotfullResourceName(value: String): Self = StObject.set(x, "analysisQuery.resourceSelector.fullResourceName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAnalysisQueryDotresourceSelectorDotfullResourceNameUndefined: Self = StObject.set(x, "analysisQuery.resourceSelector.fullResourceName", js.undefined)
      
      @scala.inline
      def setCallback(value: String): Self = StObject.set(x, "callback", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCallbackUndefined: Self = StObject.set(x, "callback", js.undefined)
      
      @scala.inline
      def setExecutionTimeout(value: String): Self = StObject.set(x, "executionTimeout", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExecutionTimeoutUndefined: Self = StObject.set(x, "executionTimeout", js.undefined)
      
      @scala.inline
      def setFields(value: String): Self = StObject.set(x, "fields", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFieldsUndefined: Self = StObject.set(x, "fields", js.undefined)
      
      @scala.inline
      def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
      
      @scala.inline
      def setOauth_token(value: String): Self = StObject.set(x, "oauth_token", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOauth_tokenUndefined: Self = StObject.set(x, "oauth_token", js.undefined)
      
      @scala.inline
      def setPrettyPrint(value: Boolean): Self = StObject.set(x, "prettyPrint", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPrettyPrintUndefined: Self = StObject.set(x, "prettyPrint", js.undefined)
      
      @scala.inline
      def setQuotaUser(value: String): Self = StObject.set(x, "quotaUser", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setQuotaUserUndefined: Self = StObject.set(x, "quotaUser", js.undefined)
      
      @scala.inline
      def setScope(value: String): Self = StObject.set(x, "scope", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUploadType(value: String): Self = StObject.set(x, "uploadType", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUploadTypeUndefined: Self = StObject.set(x, "uploadType", js.undefined)
      
      @scala.inline
      def setUpload_protocol(value: String): Self = StObject.set(x, "upload_protocol", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUpload_protocolUndefined: Self = StObject.set(x, "upload_protocol", js.undefined)
    }
  }
  
  @js.native
  trait AssetNames extends StObject {
    
    /** V1 error format. */
    @JSName("$.xgafv")
    var $Dotxgafv: js.UndefOr[String] = js.native
    
    /** OAuth access token. */
    var access_token: js.UndefOr[String] = js.native
    
    /** Data format for response. */
    var alt: js.UndefOr[String] = js.native
    
    /**
      * A list of the full names of the assets. See: https://cloud.google.com/asset-inventory/docs/resource-name-format Example:
      * `//compute.googleapis.com/projects/my_project_123/zones/zone1/instances/instance1`. The request becomes a no-op if the asset name list is empty, and the max size of the asset
      * name list is 100 in one request.
      */
    var assetNames: js.UndefOr[String | js.Array[String]] = js.native
    
    /** JSONP */
    var callback: js.UndefOr[String] = js.native
    
    /** Optional. The content type. */
    var contentType: js.UndefOr[String] = js.native
    
    /** Selector specifying which fields to include in a partial response. */
    var fields: js.UndefOr[String] = js.native
    
    /** API key. Your API key identifies your project and provides you with API access, quota, and reports. Required unless you provide an OAuth 2.0 token. */
    var key: js.UndefOr[String] = js.native
    
    /** OAuth 2.0 token for the current user. */
    var oauth_token: js.UndefOr[String] = js.native
    
    /**
      * Required. The relative name of the root asset. It can only be an organization number (such as "organizations/123"), a project ID (such as "projects/my-project-id")", or a
      * project number (such as "projects/12345").
      */
    var parent: String = js.native
    
    /** Returns response with indentations and line breaks. */
    var prettyPrint: js.UndefOr[Boolean] = js.native
    
    /** Available to use for quota purposes for server-side applications. Can be any arbitrary string assigned to a user, but should not exceed 40 characters. */
    var quotaUser: js.UndefOr[String] = js.native
    
    /** End time of the time window (inclusive). If not specified, the current timestamp is used instead. */
    @JSName("readTimeWindow.endTime")
    var readTimeWindowDotendTime: js.UndefOr[String] = js.native
    
    /** Start time of the time window (exclusive). */
    @JSName("readTimeWindow.startTime")
    var readTimeWindowDotstartTime: js.UndefOr[String] = js.native
    
    /** Legacy upload protocol for media (e.g. "media", "multipart"). */
    var uploadType: js.UndefOr[String] = js.native
    
    /** Upload protocol for media (e.g. "raw", "multipart"). */
    var upload_protocol: js.UndefOr[String] = js.native
  }
  object AssetNames {
    
    @scala.inline
    def apply(parent: String): AssetNames = {
      val __obj = js.Dynamic.literal(parent = parent.asInstanceOf[js.Any])
      __obj.asInstanceOf[AssetNames]
    }
    
    @scala.inline
    implicit class AssetNamesMutableBuilder[Self <: AssetNames] (val x: Self) extends AnyVal {
      
      @scala.inline
      def set$Dotxgafv(value: String): Self = StObject.set(x, "$.xgafv", value.asInstanceOf[js.Any])
      
      @scala.inline
      def set$DotxgafvUndefined: Self = StObject.set(x, "$.xgafv", js.undefined)
      
      @scala.inline
      def setAccess_token(value: String): Self = StObject.set(x, "access_token", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAccess_tokenUndefined: Self = StObject.set(x, "access_token", js.undefined)
      
      @scala.inline
      def setAlt(value: String): Self = StObject.set(x, "alt", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAltUndefined: Self = StObject.set(x, "alt", js.undefined)
      
      @scala.inline
      def setAssetNames(value: String | js.Array[String]): Self = StObject.set(x, "assetNames", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAssetNamesUndefined: Self = StObject.set(x, "assetNames", js.undefined)
      
      @scala.inline
      def setAssetNamesVarargs(value: String*): Self = StObject.set(x, "assetNames", js.Array(value :_*))
      
      @scala.inline
      def setCallback(value: String): Self = StObject.set(x, "callback", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCallbackUndefined: Self = StObject.set(x, "callback", js.undefined)
      
      @scala.inline
      def setContentType(value: String): Self = StObject.set(x, "contentType", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setContentTypeUndefined: Self = StObject.set(x, "contentType", js.undefined)
      
      @scala.inline
      def setFields(value: String): Self = StObject.set(x, "fields", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFieldsUndefined: Self = StObject.set(x, "fields", js.undefined)
      
      @scala.inline
      def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
      
      @scala.inline
      def setOauth_token(value: String): Self = StObject.set(x, "oauth_token", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOauth_tokenUndefined: Self = StObject.set(x, "oauth_token", js.undefined)
      
      @scala.inline
      def setParent(value: String): Self = StObject.set(x, "parent", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPrettyPrint(value: Boolean): Self = StObject.set(x, "prettyPrint", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPrettyPrintUndefined: Self = StObject.set(x, "prettyPrint", js.undefined)
      
      @scala.inline
      def setQuotaUser(value: String): Self = StObject.set(x, "quotaUser", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setQuotaUserUndefined: Self = StObject.set(x, "quotaUser", js.undefined)
      
      @scala.inline
      def setReadTimeWindowDotendTime(value: String): Self = StObject.set(x, "readTimeWindow.endTime", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setReadTimeWindowDotendTimeUndefined: Self = StObject.set(x, "readTimeWindow.endTime", js.undefined)
      
      @scala.inline
      def setReadTimeWindowDotstartTime(value: String): Self = StObject.set(x, "readTimeWindow.startTime", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setReadTimeWindowDotstartTimeUndefined: Self = StObject.set(x, "readTimeWindow.startTime", js.undefined)
      
      @scala.inline
      def setUploadType(value: String): Self = StObject.set(x, "uploadType", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUploadTypeUndefined: Self = StObject.set(x, "uploadType", js.undefined)
      
      @scala.inline
      def setUpload_protocol(value: String): Self = StObject.set(x, "upload_protocol", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUpload_protocolUndefined: Self = StObject.set(x, "upload_protocol", js.undefined)
    }
  }
  
  @js.native
  trait AssetTypes extends StObject {
    
    /** V1 error format. */
    @JSName("$.xgafv")
    var $Dotxgafv: js.UndefOr[String] = js.native
    
    /** OAuth access token. */
    var access_token: js.UndefOr[String] = js.native
    
    /** Data format for response. */
    var alt: js.UndefOr[String] = js.native
    
    /**
      * Optional. A list of asset types that this request searches for. If empty, it will search all the [searchable asset
      * types](https://cloud.google.com/asset-inventory/docs/supported-asset-types#searchable_asset_types).
      */
    var assetTypes: js.UndefOr[String | js.Array[String]] = js.native
    
    /** JSONP */
    var callback: js.UndefOr[String] = js.native
    
    /** Selector specifying which fields to include in a partial response. */
    var fields: js.UndefOr[String] = js.native
    
    /** API key. Your API key identifies your project and provides you with API access, quota, and reports. Required unless you provide an OAuth 2.0 token. */
    var key: js.UndefOr[String] = js.native
    
    /** OAuth 2.0 token for the current user. */
    var oauth_token: js.UndefOr[String] = js.native
    
    /**
      * Optional. A comma separated list of fields specifying the sorting order of the results. The default order is ascending. Add " DESC" after the field name to indicate descending
      * order. Redundant space characters are ignored. Example: "location DESC, name". Only string fields in the response are sortable, including `name`, `displayName`, `description`,
      * `location`. All the other fields such as repeated fields (e.g., `networkTags`), map fields (e.g., `labels`) and struct fields (e.g., `additionalAttributes`) are not supported.
      */
    var orderBy: js.UndefOr[String] = js.native
    
    /**
      * Optional. The page size for search result pagination. Page size is capped at 500 even if a larger value is given. If set to zero, server will pick an appropriate default.
      * Returned results may be fewer than requested. When this happens, there could be more results as long as `next_page_token` is returned.
      */
    var pageSize: js.UndefOr[Double] = js.native
    
    /**
      * Optional. If present, then retrieve the next batch of results from the preceding call to this method. `page_token` must be the value of `next_page_token` from the previous
      * response. The values of all other method parameters, must be identical to those in the previous call.
      */
    var pageToken: js.UndefOr[String] = js.native
    
    /** Returns response with indentations and line breaks. */
    var prettyPrint: js.UndefOr[Boolean] = js.native
    
    /**
      * Optional. The query statement. See [how to construct a query](http://cloud.google.com/asset-inventory/docs/searching-resources#how_to_construct_a_query) for more information. If
      * not specified or empty, it will search all the resources within the specified `scope`. Note that the query string is compared against each Cloud IAM policy binding, including
      * its members, roles, and Cloud IAM conditions. The returned Cloud IAM policies will only contain the bindings that match your query. To learn more about the IAM policy structure,
      * see [IAM policy doc](https://cloud.google.com/iam/docs/policies#structure). Examples: * `name:Important` to find Cloud resources whose name contains "Important" as a word. *
      * `displayName:Impor*` to find Cloud resources whose display name contains "Impor" as a prefix. * `description:*por*` to find Cloud resources whose description contains "por" as a
      * substring. * `location:us-west*` to find Cloud resources whose location is prefixed with "us-west". * `labels:prod` to find Cloud resources whose labels contain "prod" as a key
      * or value. * `labels.env:prod` to find Cloud resources that have a label "env" and its value is "prod". * `labels.env:*` to find Cloud resources that have a label "env". *
      * `Important` to find Cloud resources that contain "Important" as a word in any of the searchable fields. * `Impor*` to find Cloud resources that contain "Impor" as a prefix in
      * any of the searchable fields. * `*por*` to find Cloud resources that contain "por" as a substring in any of the searchable fields. * `Important location:(us-west1 OR global)` to
      * find Cloud resources that contain "Important" as a word in any of the searchable fields and are also located in the "us-west1" region or the "global" location.
      */
    var query: js.UndefOr[String] = js.native
    
    /** Available to use for quota purposes for server-side applications. Can be any arbitrary string assigned to a user, but should not exceed 40 characters. */
    var quotaUser: js.UndefOr[String] = js.native
    
    /**
      * Required. A scope can be a project, a folder, or an organization. The search is limited to the resources within the `scope`. The caller must be granted the
      * [`cloudasset.assets.searchAllResources`](http://cloud.google.com/asset-inventory/docs/access-control#required_permissions) permission on the desired scope. The allowed values
      * are: * projects/{PROJECT_ID} (e.g., "projects/foo-bar") * projects/{PROJECT_NUMBER} (e.g., "projects/12345678") * folders/{FOLDER_NUMBER} (e.g., "folders/1234567") *
      * organizations/{ORGANIZATION_NUMBER} (e.g., "organizations/123456")
      */
    var scope: String = js.native
    
    /** Legacy upload protocol for media (e.g. "media", "multipart"). */
    var uploadType: js.UndefOr[String] = js.native
    
    /** Upload protocol for media (e.g. "raw", "multipart"). */
    var upload_protocol: js.UndefOr[String] = js.native
  }
  object AssetTypes {
    
    @scala.inline
    def apply(scope: String): AssetTypes = {
      val __obj = js.Dynamic.literal(scope = scope.asInstanceOf[js.Any])
      __obj.asInstanceOf[AssetTypes]
    }
    
    @scala.inline
    implicit class AssetTypesMutableBuilder[Self <: AssetTypes] (val x: Self) extends AnyVal {
      
      @scala.inline
      def set$Dotxgafv(value: String): Self = StObject.set(x, "$.xgafv", value.asInstanceOf[js.Any])
      
      @scala.inline
      def set$DotxgafvUndefined: Self = StObject.set(x, "$.xgafv", js.undefined)
      
      @scala.inline
      def setAccess_token(value: String): Self = StObject.set(x, "access_token", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAccess_tokenUndefined: Self = StObject.set(x, "access_token", js.undefined)
      
      @scala.inline
      def setAlt(value: String): Self = StObject.set(x, "alt", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAltUndefined: Self = StObject.set(x, "alt", js.undefined)
      
      @scala.inline
      def setAssetTypes(value: String | js.Array[String]): Self = StObject.set(x, "assetTypes", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAssetTypesUndefined: Self = StObject.set(x, "assetTypes", js.undefined)
      
      @scala.inline
      def setAssetTypesVarargs(value: String*): Self = StObject.set(x, "assetTypes", js.Array(value :_*))
      
      @scala.inline
      def setCallback(value: String): Self = StObject.set(x, "callback", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCallbackUndefined: Self = StObject.set(x, "callback", js.undefined)
      
      @scala.inline
      def setFields(value: String): Self = StObject.set(x, "fields", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFieldsUndefined: Self = StObject.set(x, "fields", js.undefined)
      
      @scala.inline
      def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
      
      @scala.inline
      def setOauth_token(value: String): Self = StObject.set(x, "oauth_token", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOauth_tokenUndefined: Self = StObject.set(x, "oauth_token", js.undefined)
      
      @scala.inline
      def setOrderBy(value: String): Self = StObject.set(x, "orderBy", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOrderByUndefined: Self = StObject.set(x, "orderBy", js.undefined)
      
      @scala.inline
      def setPageSize(value: Double): Self = StObject.set(x, "pageSize", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPageSizeUndefined: Self = StObject.set(x, "pageSize", js.undefined)
      
      @scala.inline
      def setPageToken(value: String): Self = StObject.set(x, "pageToken", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPageTokenUndefined: Self = StObject.set(x, "pageToken", js.undefined)
      
      @scala.inline
      def setPrettyPrint(value: Boolean): Self = StObject.set(x, "prettyPrint", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPrettyPrintUndefined: Self = StObject.set(x, "prettyPrint", js.undefined)
      
      @scala.inline
      def setQuery(value: String): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setQueryUndefined: Self = StObject.set(x, "query", js.undefined)
      
      @scala.inline
      def setQuotaUser(value: String): Self = StObject.set(x, "quotaUser", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setQuotaUserUndefined: Self = StObject.set(x, "quotaUser", js.undefined)
      
      @scala.inline
      def setScope(value: String): Self = StObject.set(x, "scope", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUploadType(value: String): Self = StObject.set(x, "uploadType", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUploadTypeUndefined: Self = StObject.set(x, "uploadType", js.undefined)
      
      @scala.inline
      def setUpload_protocol(value: String): Self = StObject.set(x, "upload_protocol", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUpload_protocolUndefined: Self = StObject.set(x, "upload_protocol", js.undefined)
    }
  }
  
  @js.native
  trait Callback extends StObject {
    
    /** V1 error format. */
    @JSName("$.xgafv")
    var $Dotxgafv: js.UndefOr[String] = js.native
    
    /** OAuth access token. */
    var access_token: js.UndefOr[String] = js.native
    
    /** Data format for response. */
    var alt: js.UndefOr[String] = js.native
    
    /** JSONP */
    var callback: js.UndefOr[String] = js.native
    
    /** Selector specifying which fields to include in a partial response. */
    var fields: js.UndefOr[String] = js.native
    
    /** API key. Your API key identifies your project and provides you with API access, quota, and reports. Required unless you provide an OAuth 2.0 token. */
    var key: js.UndefOr[String] = js.native
    
    /** The name of the operation resource. */
    var name: String = js.native
    
    /** OAuth 2.0 token for the current user. */
    var oauth_token: js.UndefOr[String] = js.native
    
    /** Returns response with indentations and line breaks. */
    var prettyPrint: js.UndefOr[Boolean] = js.native
    
    /** Available to use for quota purposes for server-side applications. Can be any arbitrary string assigned to a user, but should not exceed 40 characters. */
    var quotaUser: js.UndefOr[String] = js.native
    
    /** Legacy upload protocol for media (e.g. "media", "multipart"). */
    var uploadType: js.UndefOr[String] = js.native
    
    /** Upload protocol for media (e.g. "raw", "multipart"). */
    var upload_protocol: js.UndefOr[String] = js.native
  }
  object Callback {
    
    @scala.inline
    def apply(name: String): Callback = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[Callback]
    }
    
    @scala.inline
    implicit class CallbackMutableBuilder[Self <: Callback] (val x: Self) extends AnyVal {
      
      @scala.inline
      def set$Dotxgafv(value: String): Self = StObject.set(x, "$.xgafv", value.asInstanceOf[js.Any])
      
      @scala.inline
      def set$DotxgafvUndefined: Self = StObject.set(x, "$.xgafv", js.undefined)
      
      @scala.inline
      def setAccess_token(value: String): Self = StObject.set(x, "access_token", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAccess_tokenUndefined: Self = StObject.set(x, "access_token", js.undefined)
      
      @scala.inline
      def setAlt(value: String): Self = StObject.set(x, "alt", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAltUndefined: Self = StObject.set(x, "alt", js.undefined)
      
      @scala.inline
      def setCallback(value: String): Self = StObject.set(x, "callback", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCallbackUndefined: Self = StObject.set(x, "callback", js.undefined)
      
      @scala.inline
      def setFields(value: String): Self = StObject.set(x, "fields", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFieldsUndefined: Self = StObject.set(x, "fields", js.undefined)
      
      @scala.inline
      def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOauth_token(value: String): Self = StObject.set(x, "oauth_token", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOauth_tokenUndefined: Self = StObject.set(x, "oauth_token", js.undefined)
      
      @scala.inline
      def setPrettyPrint(value: Boolean): Self = StObject.set(x, "prettyPrint", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPrettyPrintUndefined: Self = StObject.set(x, "prettyPrint", js.undefined)
      
      @scala.inline
      def setQuotaUser(value: String): Self = StObject.set(x, "quotaUser", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setQuotaUserUndefined: Self = StObject.set(x, "quotaUser", js.undefined)
      
      @scala.inline
      def setUploadType(value: String): Self = StObject.set(x, "uploadType", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUploadTypeUndefined: Self = StObject.set(x, "uploadType", js.undefined)
      
      @scala.inline
      def setUpload_protocol(value: String): Self = StObject.set(x, "upload_protocol", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUpload_protocolUndefined: Self = StObject.set(x, "upload_protocol", js.undefined)
    }
  }
  
  @js.native
  trait Fields extends StObject {
    
    /** V1 error format. */
    @JSName("$.xgafv")
    var $Dotxgafv: js.UndefOr[String] = js.native
    
    /** OAuth access token. */
    var access_token: js.UndefOr[String] = js.native
    
    /** Data format for response. */
    var alt: js.UndefOr[String] = js.native
    
    /** JSONP */
    var callback: js.UndefOr[String] = js.native
    
    /** Selector specifying which fields to include in a partial response. */
    var fields: js.UndefOr[String] = js.native
    
    /** API key. Your API key identifies your project and provides you with API access, quota, and reports. Required unless you provide an OAuth 2.0 token. */
    var key: js.UndefOr[String] = js.native
    
    /**
      * Required. The format will be projects/{project_number}/feeds/{client-assigned_feed_identifier} or folders/{folder_number}/feeds/{client-assigned_feed_identifier} or
      * organizations/{organization_number}/feeds/{client-assigned_feed_identifier} The client-assigned feed identifier must be unique within the parent project/folder/organization.
      */
    var name: String = js.native
    
    /** OAuth 2.0 token for the current user. */
    var oauth_token: js.UndefOr[String] = js.native
    
    /** Returns response with indentations and line breaks. */
    var prettyPrint: js.UndefOr[Boolean] = js.native
    
    /** Available to use for quota purposes for server-side applications. Can be any arbitrary string assigned to a user, but should not exceed 40 characters. */
    var quotaUser: js.UndefOr[String] = js.native
    
    /** Request body */
    var resource: UpdateFeedRequest = js.native
    
    /** Legacy upload protocol for media (e.g. "media", "multipart"). */
    var uploadType: js.UndefOr[String] = js.native
    
    /** Upload protocol for media (e.g. "raw", "multipart"). */
    var upload_protocol: js.UndefOr[String] = js.native
  }
  object Fields {
    
    @scala.inline
    def apply(name: String, resource: UpdateFeedRequest): Fields = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], resource = resource.asInstanceOf[js.Any])
      __obj.asInstanceOf[Fields]
    }
    
    @scala.inline
    implicit class FieldsMutableBuilder[Self <: Fields] (val x: Self) extends AnyVal {
      
      @scala.inline
      def set$Dotxgafv(value: String): Self = StObject.set(x, "$.xgafv", value.asInstanceOf[js.Any])
      
      @scala.inline
      def set$DotxgafvUndefined: Self = StObject.set(x, "$.xgafv", js.undefined)
      
      @scala.inline
      def setAccess_token(value: String): Self = StObject.set(x, "access_token", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAccess_tokenUndefined: Self = StObject.set(x, "access_token", js.undefined)
      
      @scala.inline
      def setAlt(value: String): Self = StObject.set(x, "alt", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAltUndefined: Self = StObject.set(x, "alt", js.undefined)
      
      @scala.inline
      def setCallback(value: String): Self = StObject.set(x, "callback", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCallbackUndefined: Self = StObject.set(x, "callback", js.undefined)
      
      @scala.inline
      def setFields(value: String): Self = StObject.set(x, "fields", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFieldsUndefined: Self = StObject.set(x, "fields", js.undefined)
      
      @scala.inline
      def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOauth_token(value: String): Self = StObject.set(x, "oauth_token", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOauth_tokenUndefined: Self = StObject.set(x, "oauth_token", js.undefined)
      
      @scala.inline
      def setPrettyPrint(value: Boolean): Self = StObject.set(x, "prettyPrint", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPrettyPrintUndefined: Self = StObject.set(x, "prettyPrint", js.undefined)
      
      @scala.inline
      def setQuotaUser(value: String): Self = StObject.set(x, "quotaUser", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setQuotaUserUndefined: Self = StObject.set(x, "quotaUser", js.undefined)
      
      @scala.inline
      def setResource(value: UpdateFeedRequest): Self = StObject.set(x, "resource", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUploadType(value: String): Self = StObject.set(x, "uploadType", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUploadTypeUndefined: Self = StObject.set(x, "uploadType", js.undefined)
      
      @scala.inline
      def setUpload_protocol(value: String): Self = StObject.set(x, "upload_protocol", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUpload_protocolUndefined: Self = StObject.set(x, "upload_protocol", js.undefined)
    }
  }
  
  @js.native
  trait Key extends StObject {
    
    /** V1 error format. */
    @JSName("$.xgafv")
    var $Dotxgafv: js.UndefOr[String] = js.native
    
    /** OAuth access token. */
    var access_token: js.UndefOr[String] = js.native
    
    /** Data format for response. */
    var alt: js.UndefOr[String] = js.native
    
    /** JSONP */
    var callback: js.UndefOr[String] = js.native
    
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
    
    /** Request body */
    var resource: AnalyzeIamPolicyLongrunningRequest = js.native
    
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
  object Key {
    
    @scala.inline
    def apply(resource: AnalyzeIamPolicyLongrunningRequest, scope: String): Key = {
      val __obj = js.Dynamic.literal(resource = resource.asInstanceOf[js.Any], scope = scope.asInstanceOf[js.Any])
      __obj.asInstanceOf[Key]
    }
    
    @scala.inline
    implicit class KeyMutableBuilder[Self <: Key] (val x: Self) extends AnyVal {
      
      @scala.inline
      def set$Dotxgafv(value: String): Self = StObject.set(x, "$.xgafv", value.asInstanceOf[js.Any])
      
      @scala.inline
      def set$DotxgafvUndefined: Self = StObject.set(x, "$.xgafv", js.undefined)
      
      @scala.inline
      def setAccess_token(value: String): Self = StObject.set(x, "access_token", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAccess_tokenUndefined: Self = StObject.set(x, "access_token", js.undefined)
      
      @scala.inline
      def setAlt(value: String): Self = StObject.set(x, "alt", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAltUndefined: Self = StObject.set(x, "alt", js.undefined)
      
      @scala.inline
      def setCallback(value: String): Self = StObject.set(x, "callback", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCallbackUndefined: Self = StObject.set(x, "callback", js.undefined)
      
      @scala.inline
      def setFields(value: String): Self = StObject.set(x, "fields", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFieldsUndefined: Self = StObject.set(x, "fields", js.undefined)
      
      @scala.inline
      def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
      
      @scala.inline
      def setOauth_token(value: String): Self = StObject.set(x, "oauth_token", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOauth_tokenUndefined: Self = StObject.set(x, "oauth_token", js.undefined)
      
      @scala.inline
      def setPrettyPrint(value: Boolean): Self = StObject.set(x, "prettyPrint", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPrettyPrintUndefined: Self = StObject.set(x, "prettyPrint", js.undefined)
      
      @scala.inline
      def setQuotaUser(value: String): Self = StObject.set(x, "quotaUser", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setQuotaUserUndefined: Self = StObject.set(x, "quotaUser", js.undefined)
      
      @scala.inline
      def setResource(value: AnalyzeIamPolicyLongrunningRequest): Self = StObject.set(x, "resource", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setScope(value: String): Self = StObject.set(x, "scope", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUploadType(value: String): Self = StObject.set(x, "uploadType", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUploadTypeUndefined: Self = StObject.set(x, "uploadType", js.undefined)
      
      @scala.inline
      def setUpload_protocol(value: String): Self = StObject.set(x, "upload_protocol", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUpload_protocolUndefined: Self = StObject.set(x, "upload_protocol", js.undefined)
    }
  }
  
  @js.native
  trait Oauthtoken extends StObject {
    
    /** V1 error format. */
    @JSName("$.xgafv")
    var $Dotxgafv: js.UndefOr[String] = js.native
    
    /** OAuth access token. */
    var access_token: js.UndefOr[String] = js.native
    
    /** Data format for response. */
    var alt: js.UndefOr[String] = js.native
    
    /** JSONP */
    var callback: js.UndefOr[String] = js.native
    
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
  object Oauthtoken {
    
    @scala.inline
    def apply(scope: String): Oauthtoken = {
      val __obj = js.Dynamic.literal(scope = scope.asInstanceOf[js.Any])
      __obj.asInstanceOf[Oauthtoken]
    }
    
    @scala.inline
    implicit class OauthtokenMutableBuilder[Self <: Oauthtoken] (val x: Self) extends AnyVal {
      
      @scala.inline
      def set$Dotxgafv(value: String): Self = StObject.set(x, "$.xgafv", value.asInstanceOf[js.Any])
      
      @scala.inline
      def set$DotxgafvUndefined: Self = StObject.set(x, "$.xgafv", js.undefined)
      
      @scala.inline
      def setAccess_token(value: String): Self = StObject.set(x, "access_token", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAccess_tokenUndefined: Self = StObject.set(x, "access_token", js.undefined)
      
      @scala.inline
      def setAlt(value: String): Self = StObject.set(x, "alt", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAltUndefined: Self = StObject.set(x, "alt", js.undefined)
      
      @scala.inline
      def setCallback(value: String): Self = StObject.set(x, "callback", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCallbackUndefined: Self = StObject.set(x, "callback", js.undefined)
      
      @scala.inline
      def setFields(value: String): Self = StObject.set(x, "fields", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFieldsUndefined: Self = StObject.set(x, "fields", js.undefined)
      
      @scala.inline
      def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
      
      @scala.inline
      def setOauth_token(value: String): Self = StObject.set(x, "oauth_token", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOauth_tokenUndefined: Self = StObject.set(x, "oauth_token", js.undefined)
      
      @scala.inline
      def setPrettyPrint(value: Boolean): Self = StObject.set(x, "prettyPrint", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPrettyPrintUndefined: Self = StObject.set(x, "prettyPrint", js.undefined)
      
      @scala.inline
      def setQuotaUser(value: String): Self = StObject.set(x, "quotaUser", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setQuotaUserUndefined: Self = StObject.set(x, "quotaUser", js.undefined)
      
      @scala.inline
      def setScope(value: String): Self = StObject.set(x, "scope", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUploadType(value: String): Self = StObject.set(x, "uploadType", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUploadTypeUndefined: Self = StObject.set(x, "uploadType", js.undefined)
      
      @scala.inline
      def setUpload_protocol(value: String): Self = StObject.set(x, "upload_protocol", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUpload_protocolUndefined: Self = StObject.set(x, "upload_protocol", js.undefined)
    }
  }
  
  @js.native
  trait PageSize extends StObject {
    
    /** V1 error format. */
    @JSName("$.xgafv")
    var $Dotxgafv: js.UndefOr[String] = js.native
    
    /** OAuth access token. */
    var access_token: js.UndefOr[String] = js.native
    
    /** Data format for response. */
    var alt: js.UndefOr[String] = js.native
    
    /** JSONP */
    var callback: js.UndefOr[String] = js.native
    
    /** Selector specifying which fields to include in a partial response. */
    var fields: js.UndefOr[String] = js.native
    
    /** API key. Your API key identifies your project and provides you with API access, quota, and reports. Required unless you provide an OAuth 2.0 token. */
    var key: js.UndefOr[String] = js.native
    
    /** OAuth 2.0 token for the current user. */
    var oauth_token: js.UndefOr[String] = js.native
    
    /**
      * Optional. The page size for search result pagination. Page size is capped at 500 even if a larger value is given. If set to zero, server will pick an appropriate default.
      * Returned results may be fewer than requested. When this happens, there could be more results as long as `next_page_token` is returned.
      */
    var pageSize: js.UndefOr[Double] = js.native
    
    /**
      * Optional. If present, retrieve the next batch of results from the preceding call to this method. `page_token` must be the value of `next_page_token` from the previous response.
      * The values of all other method parameters must be identical to those in the previous call.
      */
    var pageToken: js.UndefOr[String] = js.native
    
    /** Returns response with indentations and line breaks. */
    var prettyPrint: js.UndefOr[Boolean] = js.native
    
    /**
      * Optional. The query statement. See [how to construct a query](https://cloud.google.com/asset-inventory/docs/searching-iam-policies#how_to_construct_a_query) for more
      * information. If not specified or empty, it will search all the IAM policies within the specified `scope`. Examples: * `policy:amy@gmail.com` to find IAM policy bindings that
      * specify user "amy@gmail.com". * `policy:roles/compute.admin` to find IAM policy bindings that specify the Compute Admin role. * `policy.role.permissions:storage.buckets.update`
      * to find IAM policy bindings that specify a role containing "storage.buckets.update" permission. Note that if callers don't have `iam.roles.get` access to a role's included
      * permissions, policy bindings that specify this role will be dropped from the search results. * `resource:organizations/123456` to find IAM policy bindings that are set on
      * "organizations/123456". * `Important` to find IAM policy bindings that contain "Important" as a word in any of the searchable fields (except for the included permissions). *
      * `*por*` to find IAM policy bindings that contain "por" as a substring in any of the searchable fields (except for the included permissions). * `resource:(instance1 OR instance2)
      * policy:amy` to find IAM policy bindings that are set on resources "instance1" or "instance2" and also specify user "amy".
      */
    var query: js.UndefOr[String] = js.native
    
    /** Available to use for quota purposes for server-side applications. Can be any arbitrary string assigned to a user, but should not exceed 40 characters. */
    var quotaUser: js.UndefOr[String] = js.native
    
    /**
      * Required. A scope can be a project, a folder, or an organization. The search is limited to the IAM policies within the `scope`. The caller must be granted the
      * [`cloudasset.assets.searchAllIamPolicies`](http://cloud.google.com/asset-inventory/docs/access-control#required_permissions) permission on the desired scope. The allowed values
      * are: * projects/{PROJECT_ID} (e.g., "projects/foo-bar") * projects/{PROJECT_NUMBER} (e.g., "projects/12345678") * folders/{FOLDER_NUMBER} (e.g., "folders/1234567") *
      * organizations/{ORGANIZATION_NUMBER} (e.g., "organizations/123456")
      */
    var scope: String = js.native
    
    /** Legacy upload protocol for media (e.g. "media", "multipart"). */
    var uploadType: js.UndefOr[String] = js.native
    
    /** Upload protocol for media (e.g. "raw", "multipart"). */
    var upload_protocol: js.UndefOr[String] = js.native
  }
  object PageSize {
    
    @scala.inline
    def apply(scope: String): PageSize = {
      val __obj = js.Dynamic.literal(scope = scope.asInstanceOf[js.Any])
      __obj.asInstanceOf[PageSize]
    }
    
    @scala.inline
    implicit class PageSizeMutableBuilder[Self <: PageSize] (val x: Self) extends AnyVal {
      
      @scala.inline
      def set$Dotxgafv(value: String): Self = StObject.set(x, "$.xgafv", value.asInstanceOf[js.Any])
      
      @scala.inline
      def set$DotxgafvUndefined: Self = StObject.set(x, "$.xgafv", js.undefined)
      
      @scala.inline
      def setAccess_token(value: String): Self = StObject.set(x, "access_token", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAccess_tokenUndefined: Self = StObject.set(x, "access_token", js.undefined)
      
      @scala.inline
      def setAlt(value: String): Self = StObject.set(x, "alt", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAltUndefined: Self = StObject.set(x, "alt", js.undefined)
      
      @scala.inline
      def setCallback(value: String): Self = StObject.set(x, "callback", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCallbackUndefined: Self = StObject.set(x, "callback", js.undefined)
      
      @scala.inline
      def setFields(value: String): Self = StObject.set(x, "fields", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFieldsUndefined: Self = StObject.set(x, "fields", js.undefined)
      
      @scala.inline
      def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
      
      @scala.inline
      def setOauth_token(value: String): Self = StObject.set(x, "oauth_token", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOauth_tokenUndefined: Self = StObject.set(x, "oauth_token", js.undefined)
      
      @scala.inline
      def setPageSize(value: Double): Self = StObject.set(x, "pageSize", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPageSizeUndefined: Self = StObject.set(x, "pageSize", js.undefined)
      
      @scala.inline
      def setPageToken(value: String): Self = StObject.set(x, "pageToken", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPageTokenUndefined: Self = StObject.set(x, "pageToken", js.undefined)
      
      @scala.inline
      def setPrettyPrint(value: Boolean): Self = StObject.set(x, "prettyPrint", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPrettyPrintUndefined: Self = StObject.set(x, "prettyPrint", js.undefined)
      
      @scala.inline
      def setQuery(value: String): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setQueryUndefined: Self = StObject.set(x, "query", js.undefined)
      
      @scala.inline
      def setQuotaUser(value: String): Self = StObject.set(x, "quotaUser", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setQuotaUserUndefined: Self = StObject.set(x, "quotaUser", js.undefined)
      
      @scala.inline
      def setScope(value: String): Self = StObject.set(x, "scope", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUploadType(value: String): Self = StObject.set(x, "uploadType", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUploadTypeUndefined: Self = StObject.set(x, "uploadType", js.undefined)
      
      @scala.inline
      def setUpload_protocol(value: String): Self = StObject.set(x, "upload_protocol", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUpload_protocolUndefined: Self = StObject.set(x, "upload_protocol", js.undefined)
    }
  }
  
  @js.native
  trait Parent extends StObject {
    
    /** V1 error format. */
    @JSName("$.xgafv")
    var $Dotxgafv: js.UndefOr[String] = js.native
    
    /** OAuth access token. */
    var access_token: js.UndefOr[String] = js.native
    
    /** Data format for response. */
    var alt: js.UndefOr[String] = js.native
    
    /** JSONP */
    var callback: js.UndefOr[String] = js.native
    
    /** Selector specifying which fields to include in a partial response. */
    var fields: js.UndefOr[String] = js.native
    
    /** API key. Your API key identifies your project and provides you with API access, quota, and reports. Required unless you provide an OAuth 2.0 token. */
    var key: js.UndefOr[String] = js.native
    
    /** OAuth 2.0 token for the current user. */
    var oauth_token: js.UndefOr[String] = js.native
    
    /**
      * Required. The relative name of the root asset. This can only be an organization number (such as "organizations/123"), a project ID (such as "projects/my-project-id"), or a
      * project number (such as "projects/12345"), or a folder number (such as "folders/123").
      */
    var parent: String = js.native
    
    /** Returns response with indentations and line breaks. */
    var prettyPrint: js.UndefOr[Boolean] = js.native
    
    /** Available to use for quota purposes for server-side applications. Can be any arbitrary string assigned to a user, but should not exceed 40 characters. */
    var quotaUser: js.UndefOr[String] = js.native
    
    /** Request body */
    var resource: ExportAssetsRequest = js.native
    
    /** Legacy upload protocol for media (e.g. "media", "multipart"). */
    var uploadType: js.UndefOr[String] = js.native
    
    /** Upload protocol for media (e.g. "raw", "multipart"). */
    var upload_protocol: js.UndefOr[String] = js.native
  }
  object Parent {
    
    @scala.inline
    def apply(parent: String, resource: ExportAssetsRequest): Parent = {
      val __obj = js.Dynamic.literal(parent = parent.asInstanceOf[js.Any], resource = resource.asInstanceOf[js.Any])
      __obj.asInstanceOf[Parent]
    }
    
    @scala.inline
    implicit class ParentMutableBuilder[Self <: Parent] (val x: Self) extends AnyVal {
      
      @scala.inline
      def set$Dotxgafv(value: String): Self = StObject.set(x, "$.xgafv", value.asInstanceOf[js.Any])
      
      @scala.inline
      def set$DotxgafvUndefined: Self = StObject.set(x, "$.xgafv", js.undefined)
      
      @scala.inline
      def setAccess_token(value: String): Self = StObject.set(x, "access_token", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAccess_tokenUndefined: Self = StObject.set(x, "access_token", js.undefined)
      
      @scala.inline
      def setAlt(value: String): Self = StObject.set(x, "alt", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAltUndefined: Self = StObject.set(x, "alt", js.undefined)
      
      @scala.inline
      def setCallback(value: String): Self = StObject.set(x, "callback", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCallbackUndefined: Self = StObject.set(x, "callback", js.undefined)
      
      @scala.inline
      def setFields(value: String): Self = StObject.set(x, "fields", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFieldsUndefined: Self = StObject.set(x, "fields", js.undefined)
      
      @scala.inline
      def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
      
      @scala.inline
      def setOauth_token(value: String): Self = StObject.set(x, "oauth_token", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOauth_tokenUndefined: Self = StObject.set(x, "oauth_token", js.undefined)
      
      @scala.inline
      def setParent(value: String): Self = StObject.set(x, "parent", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPrettyPrint(value: Boolean): Self = StObject.set(x, "prettyPrint", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPrettyPrintUndefined: Self = StObject.set(x, "prettyPrint", js.undefined)
      
      @scala.inline
      def setQuotaUser(value: String): Self = StObject.set(x, "quotaUser", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setQuotaUserUndefined: Self = StObject.set(x, "quotaUser", js.undefined)
      
      @scala.inline
      def setResource(value: ExportAssetsRequest): Self = StObject.set(x, "resource", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUploadType(value: String): Self = StObject.set(x, "uploadType", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUploadTypeUndefined: Self = StObject.set(x, "uploadType", js.undefined)
      
      @scala.inline
      def setUpload_protocol(value: String): Self = StObject.set(x, "upload_protocol", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUpload_protocolUndefined: Self = StObject.set(x, "upload_protocol", js.undefined)
    }
  }
}
