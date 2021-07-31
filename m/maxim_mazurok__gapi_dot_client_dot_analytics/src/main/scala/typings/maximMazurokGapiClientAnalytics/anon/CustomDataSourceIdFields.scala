package typings.maximMazurokGapiClientAnalytics.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CustomDataSourceIdFields extends StObject {
  
  /** Account Id for the uploads to retrieve. */
  var accountId: String
  
  /** Data format for the response. */
  var alt: js.UndefOr[String] = js.undefined
  
  /** Custom data source Id for uploads to retrieve. */
  var customDataSourceId: String
  
  /** Selector specifying which fields to include in a partial response. */
  var fields: js.UndefOr[String] = js.undefined
  
  /** API key. Your API key identifies your project and provides you with API access, quota, and reports. Required unless you provide an OAuth 2.0 token. */
  var key: js.UndefOr[String] = js.undefined
  
  /** The maximum number of uploads to include in this response. */
  var `max-results`: js.UndefOr[Double] = js.undefined
  
  /** OAuth 2.0 token for the current user. */
  var oauth_token: js.UndefOr[String] = js.undefined
  
  /** Returns response with indentations and line breaks. */
  var prettyPrint: js.UndefOr[Boolean] = js.undefined
  
  /** An opaque string that represents a user for quota purposes. Must not exceed 40 characters. */
  var quotaUser: js.UndefOr[String] = js.undefined
  
  /** A 1-based index of the first upload to retrieve. Use this parameter as a pagination mechanism along with the max-results parameter. */
  var `start-index`: js.UndefOr[Double] = js.undefined
  
  /** Deprecated. Please use quotaUser instead. */
  var userIp: js.UndefOr[String] = js.undefined
  
  /** Web property Id for the uploads to retrieve. */
  var webPropertyId: String
}
object CustomDataSourceIdFields {
  
  @scala.inline
  def apply(accountId: String, customDataSourceId: String, webPropertyId: String): CustomDataSourceIdFields = {
    val __obj = js.Dynamic.literal(accountId = accountId.asInstanceOf[js.Any], customDataSourceId = customDataSourceId.asInstanceOf[js.Any], webPropertyId = webPropertyId.asInstanceOf[js.Any])
    __obj.asInstanceOf[CustomDataSourceIdFields]
  }
  
  @scala.inline
  implicit class CustomDataSourceIdFieldsMutableBuilder[Self <: CustomDataSourceIdFields] (val x: Self) extends AnyVal {
    
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
    def `setMax-results`(value: Double): Self = StObject.set(x, "max-results", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setMax-resultsUndefined`: Self = StObject.set(x, "max-results", js.undefined)
    
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
    def `setStart-index`(value: Double): Self = StObject.set(x, "start-index", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setStart-indexUndefined`: Self = StObject.set(x, "start-index", js.undefined)
    
    @scala.inline
    def setUserIp(value: String): Self = StObject.set(x, "userIp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUserIpUndefined: Self = StObject.set(x, "userIp", js.undefined)
    
    @scala.inline
    def setWebPropertyId(value: String): Self = StObject.set(x, "webPropertyId", value.asInstanceOf[js.Any])
  }
}
