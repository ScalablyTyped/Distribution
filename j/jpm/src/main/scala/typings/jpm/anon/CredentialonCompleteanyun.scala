package typings.jpm.anon

import typings.jpm.FFAddonSDK.NSIException
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined jpm.sdk/passwords.Credential & {  onComplete :(): any | undefined,   onError :(error : jpm.FFAddonSDK.NSIException): any | undefined} */
trait CredentialonCompleteanyun extends StObject {
  
  var formSubmitURL: js.UndefOr[String] = js.undefined
  
  var onComplete: js.UndefOr[js.Function0[Any]] = js.undefined
  
  var onError: js.UndefOr[js.Function1[/* error */ NSIException, Any]] = js.undefined
  
  var password: String
  
  var passwordField: js.UndefOr[String] = js.undefined
  
  var realm: js.UndefOr[String] = js.undefined
  
  var url: js.UndefOr[String] = js.undefined
  
  var username: String
  
  var usernameField: js.UndefOr[String] = js.undefined
}
object CredentialonCompleteanyun {
  
  inline def apply(password: String, username: String): CredentialonCompleteanyun = {
    val __obj = js.Dynamic.literal(password = password.asInstanceOf[js.Any], username = username.asInstanceOf[js.Any])
    __obj.asInstanceOf[CredentialonCompleteanyun]
  }
  
  extension [Self <: CredentialonCompleteanyun](x: Self) {
    
    inline def setFormSubmitURL(value: String): Self = StObject.set(x, "formSubmitURL", value.asInstanceOf[js.Any])
    
    inline def setFormSubmitURLUndefined: Self = StObject.set(x, "formSubmitURL", js.undefined)
    
    inline def setOnComplete(value: () => Any): Self = StObject.set(x, "onComplete", js.Any.fromFunction0(value))
    
    inline def setOnCompleteUndefined: Self = StObject.set(x, "onComplete", js.undefined)
    
    inline def setOnError(value: /* error */ NSIException => Any): Self = StObject.set(x, "onError", js.Any.fromFunction1(value))
    
    inline def setOnErrorUndefined: Self = StObject.set(x, "onError", js.undefined)
    
    inline def setPassword(value: String): Self = StObject.set(x, "password", value.asInstanceOf[js.Any])
    
    inline def setPasswordField(value: String): Self = StObject.set(x, "passwordField", value.asInstanceOf[js.Any])
    
    inline def setPasswordFieldUndefined: Self = StObject.set(x, "passwordField", js.undefined)
    
    inline def setRealm(value: String): Self = StObject.set(x, "realm", value.asInstanceOf[js.Any])
    
    inline def setRealmUndefined: Self = StObject.set(x, "realm", js.undefined)
    
    inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    
    inline def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
    
    inline def setUsername(value: String): Self = StObject.set(x, "username", value.asInstanceOf[js.Any])
    
    inline def setUsernameField(value: String): Self = StObject.set(x, "usernameField", value.asInstanceOf[js.Any])
    
    inline def setUsernameFieldUndefined: Self = StObject.set(x, "usernameField", js.undefined)
  }
}
