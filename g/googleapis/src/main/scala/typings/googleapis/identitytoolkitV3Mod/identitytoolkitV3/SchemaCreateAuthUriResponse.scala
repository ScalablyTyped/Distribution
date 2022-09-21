package typings.googleapis.identitytoolkitV3Mod.identitytoolkitV3

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaCreateAuthUriResponse extends StObject {
  
  /**
    * all providers the user has once used to do federated login
    */
  var allProviders: js.UndefOr[js.Array[String] | Null] = js.undefined
  
  /**
    * The URI used by the IDP to authenticate the user.
    */
  var authUri: js.UndefOr[String | Null] = js.undefined
  
  /**
    * True if captcha is required.
    */
  var captchaRequired: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * True if the authUri is for user's existing provider.
    */
  var forExistingProvider: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * The fixed string identitytoolkit#CreateAuthUriResponse".
    */
  var kind: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The provider ID of the auth URI.
    */
  var providerId: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Whether the user is registered if the identifier is an email.
    */
  var registered: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * Session ID which should be passed in the following verifyAssertion request.
    */
  var sessionId: js.UndefOr[String | Null] = js.undefined
  
  /**
    * All sign-in methods this user has used.
    */
  var signinMethods: js.UndefOr[js.Array[String] | Null] = js.undefined
}
object SchemaCreateAuthUriResponse {
  
  inline def apply(): SchemaCreateAuthUriResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaCreateAuthUriResponse]
  }
  
  extension [Self <: SchemaCreateAuthUriResponse](x: Self) {
    
    inline def setAllProviders(value: js.Array[String]): Self = StObject.set(x, "allProviders", value.asInstanceOf[js.Any])
    
    inline def setAllProvidersNull: Self = StObject.set(x, "allProviders", null)
    
    inline def setAllProvidersUndefined: Self = StObject.set(x, "allProviders", js.undefined)
    
    inline def setAllProvidersVarargs(value: String*): Self = StObject.set(x, "allProviders", js.Array(value*))
    
    inline def setAuthUri(value: String): Self = StObject.set(x, "authUri", value.asInstanceOf[js.Any])
    
    inline def setAuthUriNull: Self = StObject.set(x, "authUri", null)
    
    inline def setAuthUriUndefined: Self = StObject.set(x, "authUri", js.undefined)
    
    inline def setCaptchaRequired(value: Boolean): Self = StObject.set(x, "captchaRequired", value.asInstanceOf[js.Any])
    
    inline def setCaptchaRequiredNull: Self = StObject.set(x, "captchaRequired", null)
    
    inline def setCaptchaRequiredUndefined: Self = StObject.set(x, "captchaRequired", js.undefined)
    
    inline def setForExistingProvider(value: Boolean): Self = StObject.set(x, "forExistingProvider", value.asInstanceOf[js.Any])
    
    inline def setForExistingProviderNull: Self = StObject.set(x, "forExistingProvider", null)
    
    inline def setForExistingProviderUndefined: Self = StObject.set(x, "forExistingProvider", js.undefined)
    
    inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setKindNull: Self = StObject.set(x, "kind", null)
    
    inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    inline def setProviderId(value: String): Self = StObject.set(x, "providerId", value.asInstanceOf[js.Any])
    
    inline def setProviderIdNull: Self = StObject.set(x, "providerId", null)
    
    inline def setProviderIdUndefined: Self = StObject.set(x, "providerId", js.undefined)
    
    inline def setRegistered(value: Boolean): Self = StObject.set(x, "registered", value.asInstanceOf[js.Any])
    
    inline def setRegisteredNull: Self = StObject.set(x, "registered", null)
    
    inline def setRegisteredUndefined: Self = StObject.set(x, "registered", js.undefined)
    
    inline def setSessionId(value: String): Self = StObject.set(x, "sessionId", value.asInstanceOf[js.Any])
    
    inline def setSessionIdNull: Self = StObject.set(x, "sessionId", null)
    
    inline def setSessionIdUndefined: Self = StObject.set(x, "sessionId", js.undefined)
    
    inline def setSigninMethods(value: js.Array[String]): Self = StObject.set(x, "signinMethods", value.asInstanceOf[js.Any])
    
    inline def setSigninMethodsNull: Self = StObject.set(x, "signinMethods", null)
    
    inline def setSigninMethodsUndefined: Self = StObject.set(x, "signinMethods", js.undefined)
    
    inline def setSigninMethodsVarargs(value: String*): Self = StObject.set(x, "signinMethods", js.Array(value*))
  }
}
