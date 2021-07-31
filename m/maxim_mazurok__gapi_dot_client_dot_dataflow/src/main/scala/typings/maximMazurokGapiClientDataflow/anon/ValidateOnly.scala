package typings.maximMazurokGapiClientDataflow.anon

import typings.maximMazurokGapiClientDataflow.gapi.client.dataflow.LaunchTemplateParameters
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ValidateOnly extends StObject {
  
  /** V1 error format. */
  @JSName("$.xgafv")
  var $Dotxgafv: js.UndefOr[String] = js.undefined
  
  /** OAuth access token. */
  var access_token: js.UndefOr[String] = js.undefined
  
  /** Data format for response. */
  var alt: js.UndefOr[String] = js.undefined
  
  /** JSONP */
  var callback: js.UndefOr[String] = js.undefined
  
  /** Path to dynamic template spec file on GCS. The file must be a Json serialized DynamicTemplateFieSpec object. */
  @JSName("dynamicTemplate.gcsPath")
  var dynamicTemplateDotgcsPath: js.UndefOr[String] = js.undefined
  
  /** Cloud Storage path for staging dependencies. Must be a valid Cloud Storage URL, beginning with `gs://`. */
  @JSName("dynamicTemplate.stagingLocation")
  var dynamicTemplateDotstagingLocation: js.UndefOr[String] = js.undefined
  
  /** Selector specifying which fields to include in a partial response. */
  var fields: js.UndefOr[String] = js.undefined
  
  /** A Cloud Storage path to the template from which to create the job. Must be valid Cloud Storage URL, beginning with 'gs://'. */
  var gcsPath: js.UndefOr[String] = js.undefined
  
  /** API key. Your API key identifies your project and provides you with API access, quota, and reports. Required unless you provide an OAuth 2.0 token. */
  var key: js.UndefOr[String] = js.undefined
  
  /** The [regional endpoint] (https://cloud.google.com/dataflow/docs/concepts/regional-endpoints) to which to direct the request. */
  var location: js.UndefOr[String] = js.undefined
  
  /** OAuth 2.0 token for the current user. */
  var oauth_token: js.UndefOr[String] = js.undefined
  
  /** Returns response with indentations and line breaks. */
  var prettyPrint: js.UndefOr[Boolean] = js.undefined
  
  /** Required. The ID of the Cloud Platform project that the job belongs to. */
  var projectId: String
  
  /** Available to use for quota purposes for server-side applications. Can be any arbitrary string assigned to a user, but should not exceed 40 characters. */
  var quotaUser: js.UndefOr[String] = js.undefined
  
  /** Request body */
  var resource: LaunchTemplateParameters
  
  /** Legacy upload protocol for media (e.g. "media", "multipart"). */
  var uploadType: js.UndefOr[String] = js.undefined
  
  /** Upload protocol for media (e.g. "raw", "multipart"). */
  var upload_protocol: js.UndefOr[String] = js.undefined
  
  /** If true, the request is validated but not actually executed. Defaults to false. */
  var validateOnly: js.UndefOr[Boolean] = js.undefined
}
object ValidateOnly {
  
  @scala.inline
  def apply(projectId: String, resource: LaunchTemplateParameters): ValidateOnly = {
    val __obj = js.Dynamic.literal(projectId = projectId.asInstanceOf[js.Any], resource = resource.asInstanceOf[js.Any])
    __obj.asInstanceOf[ValidateOnly]
  }
  
  @scala.inline
  implicit class ValidateOnlyMutableBuilder[Self <: ValidateOnly] (val x: Self) extends AnyVal {
    
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
    def setDynamicTemplateDotgcsPath(value: String): Self = StObject.set(x, "dynamicTemplate.gcsPath", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDynamicTemplateDotgcsPathUndefined: Self = StObject.set(x, "dynamicTemplate.gcsPath", js.undefined)
    
    @scala.inline
    def setDynamicTemplateDotstagingLocation(value: String): Self = StObject.set(x, "dynamicTemplate.stagingLocation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDynamicTemplateDotstagingLocationUndefined: Self = StObject.set(x, "dynamicTemplate.stagingLocation", js.undefined)
    
    @scala.inline
    def setFields(value: String): Self = StObject.set(x, "fields", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFieldsUndefined: Self = StObject.set(x, "fields", js.undefined)
    
    @scala.inline
    def setGcsPath(value: String): Self = StObject.set(x, "gcsPath", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGcsPathUndefined: Self = StObject.set(x, "gcsPath", js.undefined)
    
    @scala.inline
    def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
    
    @scala.inline
    def setLocation(value: String): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLocationUndefined: Self = StObject.set(x, "location", js.undefined)
    
    @scala.inline
    def setOauth_token(value: String): Self = StObject.set(x, "oauth_token", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOauth_tokenUndefined: Self = StObject.set(x, "oauth_token", js.undefined)
    
    @scala.inline
    def setPrettyPrint(value: Boolean): Self = StObject.set(x, "prettyPrint", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPrettyPrintUndefined: Self = StObject.set(x, "prettyPrint", js.undefined)
    
    @scala.inline
    def setProjectId(value: String): Self = StObject.set(x, "projectId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQuotaUser(value: String): Self = StObject.set(x, "quotaUser", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQuotaUserUndefined: Self = StObject.set(x, "quotaUser", js.undefined)
    
    @scala.inline
    def setResource(value: LaunchTemplateParameters): Self = StObject.set(x, "resource", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUploadType(value: String): Self = StObject.set(x, "uploadType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUploadTypeUndefined: Self = StObject.set(x, "uploadType", js.undefined)
    
    @scala.inline
    def setUpload_protocol(value: String): Self = StObject.set(x, "upload_protocol", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUpload_protocolUndefined: Self = StObject.set(x, "upload_protocol", js.undefined)
    
    @scala.inline
    def setValidateOnly(value: Boolean): Self = StObject.set(x, "validateOnly", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValidateOnlyUndefined: Self = StObject.set(x, "validateOnly", js.undefined)
  }
}
