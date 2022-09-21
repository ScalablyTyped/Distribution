package typings.googleapis.recaptchaenterpriseV1Mod.recaptchaenterpriseV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudRecaptchaenterpriseV1TokenProperties extends StObject {
  
  /**
    * Action name provided at token generation.
    */
  var action: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The timestamp corresponding to the generation of the token.
    */
  var createTime: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The hostname of the page on which the token was generated.
    */
  var hostname: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Reason associated with the response when valid = false.
    */
  var invalidReason: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Whether the provided user response token is valid. When valid = false, the reason could be specified in invalid_reason or it could also be due to a user failing to solve a challenge or a sitekey mismatch (i.e the sitekey used to generate the token was different than the one specified in the assessment).
    */
  var valid: js.UndefOr[Boolean | Null] = js.undefined
}
object SchemaGoogleCloudRecaptchaenterpriseV1TokenProperties {
  
  inline def apply(): SchemaGoogleCloudRecaptchaenterpriseV1TokenProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudRecaptchaenterpriseV1TokenProperties]
  }
  
  extension [Self <: SchemaGoogleCloudRecaptchaenterpriseV1TokenProperties](x: Self) {
    
    inline def setAction(value: String): Self = StObject.set(x, "action", value.asInstanceOf[js.Any])
    
    inline def setActionNull: Self = StObject.set(x, "action", null)
    
    inline def setActionUndefined: Self = StObject.set(x, "action", js.undefined)
    
    inline def setCreateTime(value: String): Self = StObject.set(x, "createTime", value.asInstanceOf[js.Any])
    
    inline def setCreateTimeNull: Self = StObject.set(x, "createTime", null)
    
    inline def setCreateTimeUndefined: Self = StObject.set(x, "createTime", js.undefined)
    
    inline def setHostname(value: String): Self = StObject.set(x, "hostname", value.asInstanceOf[js.Any])
    
    inline def setHostnameNull: Self = StObject.set(x, "hostname", null)
    
    inline def setHostnameUndefined: Self = StObject.set(x, "hostname", js.undefined)
    
    inline def setInvalidReason(value: String): Self = StObject.set(x, "invalidReason", value.asInstanceOf[js.Any])
    
    inline def setInvalidReasonNull: Self = StObject.set(x, "invalidReason", null)
    
    inline def setInvalidReasonUndefined: Self = StObject.set(x, "invalidReason", js.undefined)
    
    inline def setValid(value: Boolean): Self = StObject.set(x, "valid", value.asInstanceOf[js.Any])
    
    inline def setValidNull: Self = StObject.set(x, "valid", null)
    
    inline def setValidUndefined: Self = StObject.set(x, "valid", js.undefined)
  }
}
