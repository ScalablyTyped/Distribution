package typings.maximMazurokGapiClientBigquerydatatransfer.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PrettyPrint extends StObject {
  
  /** V1 error format. */
  @JSName("$.xgafv")
  var $Dotxgafv: js.UndefOr[String] = js.undefined
  
  /** OAuth access token. */
  var access_token: js.UndefOr[String] = js.undefined
  
  /** Data format for response. */
  var alt: js.UndefOr[String] = js.undefined
  
  /**
    * Optional OAuth2 authorization code to use with this transfer configuration. If it is provided, the transfer configuration will be associated with the authorizing user. In order
    * to obtain authorization_code, please make a request to https://www.gstatic.com/bigquerydatatransfer/oauthz/auth?client_id=&scope=&redirect_uri= * client_id should be OAuth
    * client_id of BigQuery DTS API for the given data source returned by ListDataSources method. * data_source_scopes are the scopes returned by ListDataSources method. *
    * redirect_uri is an optional parameter. If not specified, then authorization code is posted to the opener of authorization flow window. Otherwise it will be sent to the redirect
    * uri. A special value of urn:ietf:wg:oauth:2.0:oob means that authorization code should be returned in the title bar of the browser, with the page text prompting the user to copy
    * the code and paste it in the application.
    */
  var authorizationCode: js.UndefOr[String] = js.undefined
  
  /** JSONP */
  var callback: js.UndefOr[String] = js.undefined
  
  /** Selector specifying which fields to include in a partial response. */
  var fields: js.UndefOr[String] = js.undefined
  
  /** API key. Your API key identifies your project and provides you with API access, quota, and reports. Required unless you provide an OAuth 2.0 token. */
  var key: js.UndefOr[String] = js.undefined
  
  /**
    * The resource name of the transfer config. Transfer config names have the form of `projects/{project_id}/locations/{region}/transferConfigs/{config_id}`. The name is
    * automatically generated based on the config_id specified in CreateTransferConfigRequest along with project_id and region. If config_id is not provided, usually a uuid, even
    * though it is not guaranteed or required, will be generated for config_id.
    */
  var name: String
  
  /** OAuth 2.0 token for the current user. */
  var oauth_token: js.UndefOr[String] = js.undefined
  
  /** Returns response with indentations and line breaks. */
  var prettyPrint: js.UndefOr[Boolean] = js.undefined
  
  /** Available to use for quota purposes for server-side applications. Can be any arbitrary string assigned to a user, but should not exceed 40 characters. */
  var quotaUser: js.UndefOr[String] = js.undefined
  
  /**
    * Optional service account name. If this field is set and "service_account_name" is set in update_mask, transfer config will be updated to use this service account credentials. It
    * requires that requesting user calling this API has permissions to act as this service account.
    */
  var serviceAccountName: js.UndefOr[String] = js.undefined
  
  /** Required. Required list of fields to be updated in this request. */
  var updateMask: js.UndefOr[String] = js.undefined
  
  /** Legacy upload protocol for media (e.g. "media", "multipart"). */
  var uploadType: js.UndefOr[String] = js.undefined
  
  /** Upload protocol for media (e.g. "raw", "multipart"). */
  var upload_protocol: js.UndefOr[String] = js.undefined
  
  /**
    * Optional version info. If users want to find a very recent access token, that is, immediately after approving access, users have to set the version_info claim in the token
    * request. To obtain the version_info, users must use the "none+gsession" response type. which be return a version_info back in the authorization response which be be put in a JWT
    * claim in the token request.
    */
  var versionInfo: js.UndefOr[String] = js.undefined
}
object PrettyPrint {
  
  inline def apply(name: String): PrettyPrint = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[PrettyPrint]
  }
  
  extension [Self <: PrettyPrint](x: Self) {
    
    inline def set$Dotxgafv(value: String): Self = StObject.set(x, "$.xgafv", value.asInstanceOf[js.Any])
    
    inline def set$DotxgafvUndefined: Self = StObject.set(x, "$.xgafv", js.undefined)
    
    inline def setAccess_token(value: String): Self = StObject.set(x, "access_token", value.asInstanceOf[js.Any])
    
    inline def setAccess_tokenUndefined: Self = StObject.set(x, "access_token", js.undefined)
    
    inline def setAlt(value: String): Self = StObject.set(x, "alt", value.asInstanceOf[js.Any])
    
    inline def setAltUndefined: Self = StObject.set(x, "alt", js.undefined)
    
    inline def setAuthorizationCode(value: String): Self = StObject.set(x, "authorizationCode", value.asInstanceOf[js.Any])
    
    inline def setAuthorizationCodeUndefined: Self = StObject.set(x, "authorizationCode", js.undefined)
    
    inline def setCallback(value: String): Self = StObject.set(x, "callback", value.asInstanceOf[js.Any])
    
    inline def setCallbackUndefined: Self = StObject.set(x, "callback", js.undefined)
    
    inline def setFields(value: String): Self = StObject.set(x, "fields", value.asInstanceOf[js.Any])
    
    inline def setFieldsUndefined: Self = StObject.set(x, "fields", js.undefined)
    
    inline def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    inline def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setOauth_token(value: String): Self = StObject.set(x, "oauth_token", value.asInstanceOf[js.Any])
    
    inline def setOauth_tokenUndefined: Self = StObject.set(x, "oauth_token", js.undefined)
    
    inline def setPrettyPrint(value: Boolean): Self = StObject.set(x, "prettyPrint", value.asInstanceOf[js.Any])
    
    inline def setPrettyPrintUndefined: Self = StObject.set(x, "prettyPrint", js.undefined)
    
    inline def setQuotaUser(value: String): Self = StObject.set(x, "quotaUser", value.asInstanceOf[js.Any])
    
    inline def setQuotaUserUndefined: Self = StObject.set(x, "quotaUser", js.undefined)
    
    inline def setServiceAccountName(value: String): Self = StObject.set(x, "serviceAccountName", value.asInstanceOf[js.Any])
    
    inline def setServiceAccountNameUndefined: Self = StObject.set(x, "serviceAccountName", js.undefined)
    
    inline def setUpdateMask(value: String): Self = StObject.set(x, "updateMask", value.asInstanceOf[js.Any])
    
    inline def setUpdateMaskUndefined: Self = StObject.set(x, "updateMask", js.undefined)
    
    inline def setUploadType(value: String): Self = StObject.set(x, "uploadType", value.asInstanceOf[js.Any])
    
    inline def setUploadTypeUndefined: Self = StObject.set(x, "uploadType", js.undefined)
    
    inline def setUpload_protocol(value: String): Self = StObject.set(x, "upload_protocol", value.asInstanceOf[js.Any])
    
    inline def setUpload_protocolUndefined: Self = StObject.set(x, "upload_protocol", js.undefined)
    
    inline def setVersionInfo(value: String): Self = StObject.set(x, "versionInfo", value.asInstanceOf[js.Any])
    
    inline def setVersionInfoUndefined: Self = StObject.set(x, "versionInfo", js.undefined)
  }
}
