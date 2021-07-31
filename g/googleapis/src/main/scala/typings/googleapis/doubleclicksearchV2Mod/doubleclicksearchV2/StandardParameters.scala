package typings.googleapis.doubleclicksearchV2Mod.doubleclicksearchV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StandardParameters extends StObject {
  
  /**
    * Data format for the response.
    */
  var alt: js.UndefOr[String] = js.undefined
  
  /**
    * Selector specifying which fields to include in a partial response.
    */
  var fields: js.UndefOr[String] = js.undefined
  
  /**
    * API key. Your API key identifies your project and provides you with API
    * access, quota, and reports. Required unless you provide an OAuth 2.0
    * token.
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
    * An opaque string that represents a user for quota purposes. Must not
    * exceed 40 characters.
    */
  var quotaUser: js.UndefOr[String] = js.undefined
  
  /**
    * Deprecated. Please use quotaUser instead.
    */
  var userIp: js.UndefOr[String] = js.undefined
}
object StandardParameters {
  
  @scala.inline
  def apply(): StandardParameters = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StandardParameters]
  }
  
  @scala.inline
  implicit class StandardParametersMutableBuilder[Self <: StandardParameters] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAlt(value: String): Self = StObject.set(x, "alt", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAltUndefined: Self = StObject.set(x, "alt", js.undefined)
    
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
    def setUserIp(value: String): Self = StObject.set(x, "userIp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUserIpUndefined: Self = StObject.set(x, "userIp", js.undefined)
  }
}
