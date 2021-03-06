package typings.maximMazurokGapiClientAnalytics.anon

import typings.maximMazurokGapiClientAnalytics.gapi.client.analytics.CustomDimension
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IgnoreCustomDataSourceLinks extends StObject {
  
  /** Account ID for the custom dimension to update. */
  var accountId: String = js.native
  
  /** Data format for the response. */
  var alt: js.UndefOr[String] = js.native
  
  /** Custom dimension ID for the custom dimension to update. */
  var customDimensionId: String = js.native
  
  /** Selector specifying which fields to include in a partial response. */
  var fields: js.UndefOr[String] = js.native
  
  /** Force the update and ignore any warnings related to the custom dimension being linked to a custom data source / data set. */
  var ignoreCustomDataSourceLinks: js.UndefOr[Boolean] = js.native
  
  /** API key. Your API key identifies your project and provides you with API access, quota, and reports. Required unless you provide an OAuth 2.0 token. */
  var key: js.UndefOr[String] = js.native
  
  /** OAuth 2.0 token for the current user. */
  var oauth_token: js.UndefOr[String] = js.native
  
  /** Returns response with indentations and line breaks. */
  var prettyPrint: js.UndefOr[Boolean] = js.native
  
  /** An opaque string that represents a user for quota purposes. Must not exceed 40 characters. */
  var quotaUser: js.UndefOr[String] = js.native
  
  /** Request body */
  var resource: CustomDimension = js.native
  
  /** Deprecated. Please use quotaUser instead. */
  var userIp: js.UndefOr[String] = js.native
  
  /** Web property ID for the custom dimension to update. */
  var webPropertyId: String = js.native
}
object IgnoreCustomDataSourceLinks {
  
  @scala.inline
  def apply(accountId: String, customDimensionId: String, resource: CustomDimension, webPropertyId: String): IgnoreCustomDataSourceLinks = {
    val __obj = js.Dynamic.literal(accountId = accountId.asInstanceOf[js.Any], customDimensionId = customDimensionId.asInstanceOf[js.Any], resource = resource.asInstanceOf[js.Any], webPropertyId = webPropertyId.asInstanceOf[js.Any])
    __obj.asInstanceOf[IgnoreCustomDataSourceLinks]
  }
  
  @scala.inline
  implicit class IgnoreCustomDataSourceLinksMutableBuilder[Self <: IgnoreCustomDataSourceLinks] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAccountId(value: String): Self = StObject.set(x, "accountId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAlt(value: String): Self = StObject.set(x, "alt", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAltUndefined: Self = StObject.set(x, "alt", js.undefined)
    
    @scala.inline
    def setCustomDimensionId(value: String): Self = StObject.set(x, "customDimensionId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFields(value: String): Self = StObject.set(x, "fields", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFieldsUndefined: Self = StObject.set(x, "fields", js.undefined)
    
    @scala.inline
    def setIgnoreCustomDataSourceLinks(value: Boolean): Self = StObject.set(x, "ignoreCustomDataSourceLinks", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIgnoreCustomDataSourceLinksUndefined: Self = StObject.set(x, "ignoreCustomDataSourceLinks", js.undefined)
    
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
    def setResource(value: CustomDimension): Self = StObject.set(x, "resource", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUserIp(value: String): Self = StObject.set(x, "userIp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUserIpUndefined: Self = StObject.set(x, "userIp", js.undefined)
    
    @scala.inline
    def setWebPropertyId(value: String): Self = StObject.set(x, "webPropertyId", value.asInstanceOf[js.Any])
  }
}
