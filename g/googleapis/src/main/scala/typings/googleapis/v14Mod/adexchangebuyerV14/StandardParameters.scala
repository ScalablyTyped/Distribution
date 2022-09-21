package typings.googleapis.v14Mod.adexchangebuyerV14

import typings.googleAuthLibrary.googleauthMod.JSONClient
import typings.googleapisCommon.mod.BaseExternalAccountClient
import typings.googleapisCommon.mod.Compute
import typings.googleapisCommon.mod.GoogleAuth
import typings.googleapisCommon.mod.JWT
import typings.googleapisCommon.mod.OAuth2Client
import typings.googleapisCommon.mod.UserRefreshClient
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StandardParameters extends StObject {
  
  /**
    * Data format for the response.
    */
  var alt: js.UndefOr[String] = js.undefined
  
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[
    String | OAuth2Client | JWT | Compute | UserRefreshClient | BaseExternalAccountClient | GoogleAuth[JSONClient]
  ] = js.undefined
  
  /**
    * Selector specifying which fields to include in a partial response.
    */
  var fields: js.UndefOr[String] = js.undefined
  
  /**
    * API key. Your API key identifies your project and provides you with API access, quota, and reports. Required unless you provide an OAuth 2.0 token.
    */
  var key: js.UndefOr[String] = js.undefined
  
  /**
    * OAuth 2.0 token for the current user.
    */
  var oauth_token: js.UndefOr[String] = js.undefined
  
  /**
    * Returns response with indentations and line breaks.
    */
  var prettyPrint: js.UndefOr[Boolean] = js.undefined
  
  /**
    * An opaque string that represents a user for quota purposes. Must not exceed 40 characters.
    */
  var quotaUser: js.UndefOr[String] = js.undefined
  
  /**
    * Deprecated. Please use quotaUser instead.
    */
  var userIp: js.UndefOr[String] = js.undefined
}
object StandardParameters {
  
  inline def apply(): StandardParameters = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StandardParameters]
  }
  
  extension [Self <: StandardParameters](x: Self) {
    
    inline def setAlt(value: String): Self = StObject.set(x, "alt", value.asInstanceOf[js.Any])
    
    inline def setAltUndefined: Self = StObject.set(x, "alt", js.undefined)
    
    inline def setAuth(
      value: String | OAuth2Client | JWT | Compute | UserRefreshClient | BaseExternalAccountClient | GoogleAuth[JSONClient]
    ): Self = StObject.set(x, "auth", value.asInstanceOf[js.Any])
    
    inline def setAuthUndefined: Self = StObject.set(x, "auth", js.undefined)
    
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
    
    inline def setUserIp(value: String): Self = StObject.set(x, "userIp", value.asInstanceOf[js.Any])
    
    inline def setUserIpUndefined: Self = StObject.set(x, "userIp", js.undefined)
  }
}
