package typings.googleapis.identitytoolkitV3Mod.identitytoolkitV3

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Response of getting recaptcha param.
  */
trait SchemaGetRecaptchaParamResponse extends StObject {
  
  /**
    * The fixed string &quot;identitytoolkit#GetRecaptchaParamResponse&quot;.
    */
  var kind: js.UndefOr[String] = js.undefined
  
  /**
    * Site key registered at recaptcha.
    */
  var recaptchaSiteKey: js.UndefOr[String] = js.undefined
  
  /**
    * The stoken field for the recaptcha widget, used to request captcha
    * challenge.
    */
  var recaptchaStoken: js.UndefOr[String] = js.undefined
}
object SchemaGetRecaptchaParamResponse {
  
  @scala.inline
  def apply(): SchemaGetRecaptchaParamResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGetRecaptchaParamResponse]
  }
  
  @scala.inline
  implicit class SchemaGetRecaptchaParamResponseMutableBuilder[Self <: SchemaGetRecaptchaParamResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    @scala.inline
    def setRecaptchaSiteKey(value: String): Self = StObject.set(x, "recaptchaSiteKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRecaptchaSiteKeyUndefined: Self = StObject.set(x, "recaptchaSiteKey", js.undefined)
    
    @scala.inline
    def setRecaptchaStoken(value: String): Self = StObject.set(x, "recaptchaStoken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRecaptchaStokenUndefined: Self = StObject.set(x, "recaptchaStoken", js.undefined)
  }
}
