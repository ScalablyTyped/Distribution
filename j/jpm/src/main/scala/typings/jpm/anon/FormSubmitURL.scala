package typings.jpm.anon

import typings.jpm.FFAddonSDK.NSIException
import typings.jpm.passwordsMod.Credential
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FormSubmitURL extends StObject {
  
  var formSubmitURL: js.UndefOr[String] = js.undefined
  
  def onComplete(credentials: js.Array[Credential]): js.Any
  
  var onError: js.UndefOr[js.Function1[/* error */ NSIException, js.Any]] = js.undefined
  
  var password: js.UndefOr[String] = js.undefined
  
  var passwordField: js.UndefOr[String] = js.undefined
  
  var realm: js.UndefOr[String] = js.undefined
  
  var url: js.UndefOr[String] = js.undefined
  
  var username: js.UndefOr[String] = js.undefined
  
  var usernameField: js.UndefOr[String] = js.undefined
}
object FormSubmitURL {
  
  inline def apply(onComplete: js.Array[Credential] => js.Any): FormSubmitURL = {
    val __obj = js.Dynamic.literal(onComplete = js.Any.fromFunction1(onComplete))
    __obj.asInstanceOf[FormSubmitURL]
  }
  
  extension [Self <: FormSubmitURL](x: Self) {
    
    inline def setFormSubmitURL(value: String): Self = StObject.set(x, "formSubmitURL", value.asInstanceOf[js.Any])
    
    inline def setFormSubmitURLUndefined: Self = StObject.set(x, "formSubmitURL", js.undefined)
    
    inline def setOnComplete(value: js.Array[Credential] => js.Any): Self = StObject.set(x, "onComplete", js.Any.fromFunction1(value))
    
    inline def setOnError(value: /* error */ NSIException => js.Any): Self = StObject.set(x, "onError", js.Any.fromFunction1(value))
    
    inline def setOnErrorUndefined: Self = StObject.set(x, "onError", js.undefined)
    
    inline def setPassword(value: String): Self = StObject.set(x, "password", value.asInstanceOf[js.Any])
    
    inline def setPasswordField(value: String): Self = StObject.set(x, "passwordField", value.asInstanceOf[js.Any])
    
    inline def setPasswordFieldUndefined: Self = StObject.set(x, "passwordField", js.undefined)
    
    inline def setPasswordUndefined: Self = StObject.set(x, "password", js.undefined)
    
    inline def setRealm(value: String): Self = StObject.set(x, "realm", value.asInstanceOf[js.Any])
    
    inline def setRealmUndefined: Self = StObject.set(x, "realm", js.undefined)
    
    inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    
    inline def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
    
    inline def setUsername(value: String): Self = StObject.set(x, "username", value.asInstanceOf[js.Any])
    
    inline def setUsernameField(value: String): Self = StObject.set(x, "usernameField", value.asInstanceOf[js.Any])
    
    inline def setUsernameFieldUndefined: Self = StObject.set(x, "usernameField", js.undefined)
    
    inline def setUsernameUndefined: Self = StObject.set(x, "username", js.undefined)
  }
}
