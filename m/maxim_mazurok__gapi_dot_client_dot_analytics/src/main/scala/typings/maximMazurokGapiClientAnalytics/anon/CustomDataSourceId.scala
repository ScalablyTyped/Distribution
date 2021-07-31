package typings.maximMazurokGapiClientAnalytics.anon

import typings.maximMazurokGapiClientAnalytics.gapi.client.analytics.AnalyticsDataimportDeleteUploadDataRequest
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CustomDataSourceId extends StObject {
  
  /** Account Id for the uploads to be deleted. */
  var accountId: String
  
  /** Data format for the response. */
  var alt: js.UndefOr[String] = js.undefined
  
  /** Custom data source Id for the uploads to be deleted. */
  var customDataSourceId: String
  
  /** Selector specifying which fields to include in a partial response. */
  var fields: js.UndefOr[String] = js.undefined
  
  /** API key. Your API key identifies your project and provides you with API access, quota, and reports. Required unless you provide an OAuth 2.0 token. */
  var key: js.UndefOr[String] = js.undefined
  
  /** OAuth 2.0 token for the current user. */
  var oauth_token: js.UndefOr[String] = js.undefined
  
  /** Returns response with indentations and line breaks. */
  var prettyPrint: js.UndefOr[Boolean] = js.undefined
  
  /** An opaque string that represents a user for quota purposes. Must not exceed 40 characters. */
  var quotaUser: js.UndefOr[String] = js.undefined
  
  /** Request body */
  var resource: AnalyticsDataimportDeleteUploadDataRequest
  
  /** Deprecated. Please use quotaUser instead. */
  var userIp: js.UndefOr[String] = js.undefined
  
  /** Web property Id for the uploads to be deleted. */
  var webPropertyId: String
}
object CustomDataSourceId {
  
  @scala.inline
  def apply(
    accountId: String,
    customDataSourceId: String,
    resource: AnalyticsDataimportDeleteUploadDataRequest,
    webPropertyId: String
  ): CustomDataSourceId = {
    val __obj = js.Dynamic.literal(accountId = accountId.asInstanceOf[js.Any], customDataSourceId = customDataSourceId.asInstanceOf[js.Any], resource = resource.asInstanceOf[js.Any], webPropertyId = webPropertyId.asInstanceOf[js.Any])
    __obj.asInstanceOf[CustomDataSourceId]
  }
  
  @scala.inline
  implicit class CustomDataSourceIdMutableBuilder[Self <: CustomDataSourceId] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAccountId(value: String): Self = StObject.set(x, "accountId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAlt(value: String): Self = StObject.set(x, "alt", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAltUndefined: Self = StObject.set(x, "alt", js.undefined)
    
    @scala.inline
    def setCustomDataSourceId(value: String): Self = StObject.set(x, "customDataSourceId", value.asInstanceOf[js.Any])
    
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
    def setResource(value: AnalyticsDataimportDeleteUploadDataRequest): Self = StObject.set(x, "resource", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUserIp(value: String): Self = StObject.set(x, "userIp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUserIpUndefined: Self = StObject.set(x, "userIp", js.undefined)
    
    @scala.inline
    def setWebPropertyId(value: String): Self = StObject.set(x, "webPropertyId", value.asInstanceOf[js.Any])
  }
}
