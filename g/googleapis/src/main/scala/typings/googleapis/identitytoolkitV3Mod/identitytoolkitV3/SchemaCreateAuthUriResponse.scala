package typings.googleapis.identitytoolkitV3Mod.identitytoolkitV3

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Response of creating the IDP authentication URL.
  */
trait SchemaCreateAuthUriResponse extends StObject {
  
  /**
    * all providers the user has once used to do federated login
    */
  var allProviders: js.UndefOr[js.Array[String]] = js.undefined
  
  /**
    * The URI used by the IDP to authenticate the user.
    */
  var authUri: js.UndefOr[String] = js.undefined
  
  /**
    * True if captcha is required.
    */
  var captchaRequired: js.UndefOr[Boolean] = js.undefined
  
  /**
    * True if the authUri is for user&#39;s existing provider.
    */
  var forExistingProvider: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The fixed string identitytoolkit#CreateAuthUriResponse&quot;.
    */
  var kind: js.UndefOr[String] = js.undefined
  
  /**
    * The provider ID of the auth URI.
    */
  var providerId: js.UndefOr[String] = js.undefined
  
  /**
    * Whether the user is registered if the identifier is an email.
    */
  var registered: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Session ID which should be passed in the following verifyAssertion
    * request.
    */
  var sessionId: js.UndefOr[String] = js.undefined
  
  /**
    * All sign-in methods this user has used.
    */
  var signinMethods: js.UndefOr[js.Array[String]] = js.undefined
}
object SchemaCreateAuthUriResponse {
  
  @scala.inline
  def apply(): SchemaCreateAuthUriResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaCreateAuthUriResponse]
  }
  
  @scala.inline
  implicit class SchemaCreateAuthUriResponseMutableBuilder[Self <: SchemaCreateAuthUriResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAllProviders(value: js.Array[String]): Self = StObject.set(x, "allProviders", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAllProvidersUndefined: Self = StObject.set(x, "allProviders", js.undefined)
    
    @scala.inline
    def setAllProvidersVarargs(value: String*): Self = StObject.set(x, "allProviders", js.Array(value :_*))
    
    @scala.inline
    def setAuthUri(value: String): Self = StObject.set(x, "authUri", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAuthUriUndefined: Self = StObject.set(x, "authUri", js.undefined)
    
    @scala.inline
    def setCaptchaRequired(value: Boolean): Self = StObject.set(x, "captchaRequired", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCaptchaRequiredUndefined: Self = StObject.set(x, "captchaRequired", js.undefined)
    
    @scala.inline
    def setForExistingProvider(value: Boolean): Self = StObject.set(x, "forExistingProvider", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setForExistingProviderUndefined: Self = StObject.set(x, "forExistingProvider", js.undefined)
    
    @scala.inline
    def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    @scala.inline
    def setProviderId(value: String): Self = StObject.set(x, "providerId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProviderIdUndefined: Self = StObject.set(x, "providerId", js.undefined)
    
    @scala.inline
    def setRegistered(value: Boolean): Self = StObject.set(x, "registered", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRegisteredUndefined: Self = StObject.set(x, "registered", js.undefined)
    
    @scala.inline
    def setSessionId(value: String): Self = StObject.set(x, "sessionId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSessionIdUndefined: Self = StObject.set(x, "sessionId", js.undefined)
    
    @scala.inline
    def setSigninMethods(value: js.Array[String]): Self = StObject.set(x, "signinMethods", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSigninMethodsUndefined: Self = StObject.set(x, "signinMethods", js.undefined)
    
    @scala.inline
    def setSigninMethodsVarargs(value: String*): Self = StObject.set(x, "signinMethods", js.Array(value :_*))
  }
}
