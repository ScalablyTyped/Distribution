package typings.googleapis.recaptchaenterpriseV1Mod.recaptchaenterpriseV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudRecaptchaenterpriseV1Event extends StObject {
  
  /**
    * Optional. The expected action for this type of event. This should be the same action provided at token generation time on client-side platforms already integrated with recaptcha enterprise.
    */
  var expectedAction: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Optional. Unique stable hashed user identifier for the request. The identifier must be hashed using hmac-sha256 with stable secret.
    */
  var hashedAccountId: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Optional. The site key that was used to invoke reCAPTCHA on your site and generate the token.
    */
  var siteKey: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Optional. The user response token provided by the reCAPTCHA client-side integration on your site.
    */
  var token: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Optional. The user agent present in the request from the user's device related to this event.
    */
  var userAgent: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Optional. The IP address in the request from the user's device related to this event.
    */
  var userIpAddress: js.UndefOr[String | Null] = js.undefined
}
object SchemaGoogleCloudRecaptchaenterpriseV1Event {
  
  inline def apply(): SchemaGoogleCloudRecaptchaenterpriseV1Event = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudRecaptchaenterpriseV1Event]
  }
  
  extension [Self <: SchemaGoogleCloudRecaptchaenterpriseV1Event](x: Self) {
    
    inline def setExpectedAction(value: String): Self = StObject.set(x, "expectedAction", value.asInstanceOf[js.Any])
    
    inline def setExpectedActionNull: Self = StObject.set(x, "expectedAction", null)
    
    inline def setExpectedActionUndefined: Self = StObject.set(x, "expectedAction", js.undefined)
    
    inline def setHashedAccountId(value: String): Self = StObject.set(x, "hashedAccountId", value.asInstanceOf[js.Any])
    
    inline def setHashedAccountIdNull: Self = StObject.set(x, "hashedAccountId", null)
    
    inline def setHashedAccountIdUndefined: Self = StObject.set(x, "hashedAccountId", js.undefined)
    
    inline def setSiteKey(value: String): Self = StObject.set(x, "siteKey", value.asInstanceOf[js.Any])
    
    inline def setSiteKeyNull: Self = StObject.set(x, "siteKey", null)
    
    inline def setSiteKeyUndefined: Self = StObject.set(x, "siteKey", js.undefined)
    
    inline def setToken(value: String): Self = StObject.set(x, "token", value.asInstanceOf[js.Any])
    
    inline def setTokenNull: Self = StObject.set(x, "token", null)
    
    inline def setTokenUndefined: Self = StObject.set(x, "token", js.undefined)
    
    inline def setUserAgent(value: String): Self = StObject.set(x, "userAgent", value.asInstanceOf[js.Any])
    
    inline def setUserAgentNull: Self = StObject.set(x, "userAgent", null)
    
    inline def setUserAgentUndefined: Self = StObject.set(x, "userAgent", js.undefined)
    
    inline def setUserIpAddress(value: String): Self = StObject.set(x, "userIpAddress", value.asInstanceOf[js.Any])
    
    inline def setUserIpAddressNull: Self = StObject.set(x, "userIpAddress", null)
    
    inline def setUserIpAddressUndefined: Self = StObject.set(x, "userIpAddress", js.undefined)
  }
}
