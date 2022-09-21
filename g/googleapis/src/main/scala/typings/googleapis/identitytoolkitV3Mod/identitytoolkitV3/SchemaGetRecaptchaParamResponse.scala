package typings.googleapis.identitytoolkitV3Mod.identitytoolkitV3

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGetRecaptchaParamResponse extends StObject {
  
  /**
    * The fixed string "identitytoolkit#GetRecaptchaParamResponse".
    */
  var kind: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Site key registered at recaptcha.
    */
  var recaptchaSiteKey: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The stoken field for the recaptcha widget, used to request captcha challenge.
    */
  var recaptchaStoken: js.UndefOr[String | Null] = js.undefined
}
object SchemaGetRecaptchaParamResponse {
  
  inline def apply(): SchemaGetRecaptchaParamResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGetRecaptchaParamResponse]
  }
  
  extension [Self <: SchemaGetRecaptchaParamResponse](x: Self) {
    
    inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setKindNull: Self = StObject.set(x, "kind", null)
    
    inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    inline def setRecaptchaSiteKey(value: String): Self = StObject.set(x, "recaptchaSiteKey", value.asInstanceOf[js.Any])
    
    inline def setRecaptchaSiteKeyNull: Self = StObject.set(x, "recaptchaSiteKey", null)
    
    inline def setRecaptchaSiteKeyUndefined: Self = StObject.set(x, "recaptchaSiteKey", js.undefined)
    
    inline def setRecaptchaStoken(value: String): Self = StObject.set(x, "recaptchaStoken", value.asInstanceOf[js.Any])
    
    inline def setRecaptchaStokenNull: Self = StObject.set(x, "recaptchaStoken", null)
    
    inline def setRecaptchaStokenUndefined: Self = StObject.set(x, "recaptchaStoken", js.undefined)
  }
}
