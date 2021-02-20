package typings.jpm.anon

import typings.jpm.FFAddonSDK.NSIException
import typings.jpm.passwordsMod.Credential
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FormSubmitURL extends StObject {
  
  var formSubmitURL: js.UndefOr[String] = js.native
  
  def onComplete(credentials: js.Array[Credential]): js.Any = js.native
  
  var onError: js.UndefOr[js.Function1[/* error */ NSIException, _]] = js.native
  
  var password: js.UndefOr[String] = js.native
  
  var passwordField: js.UndefOr[String] = js.native
  
  var realm: js.UndefOr[String] = js.native
  
  var url: js.UndefOr[String] = js.native
  
  var username: js.UndefOr[String] = js.native
  
  var usernameField: js.UndefOr[String] = js.native
}
object FormSubmitURL {
  
  @scala.inline
  def apply(onComplete: js.Array[Credential] => js.Any): FormSubmitURL = {
    val __obj = js.Dynamic.literal(onComplete = js.Any.fromFunction1(onComplete))
    __obj.asInstanceOf[FormSubmitURL]
  }
  
  @scala.inline
  implicit class FormSubmitURLMutableBuilder[Self <: FormSubmitURL] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFormSubmitURL(value: String): Self = StObject.set(x, "formSubmitURL", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFormSubmitURLUndefined: Self = StObject.set(x, "formSubmitURL", js.undefined)
    
    @scala.inline
    def setOnComplete(value: js.Array[Credential] => js.Any): Self = StObject.set(x, "onComplete", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnError(value: /* error */ NSIException => _): Self = StObject.set(x, "onError", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnErrorUndefined: Self = StObject.set(x, "onError", js.undefined)
    
    @scala.inline
    def setPassword(value: String): Self = StObject.set(x, "password", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPasswordField(value: String): Self = StObject.set(x, "passwordField", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPasswordFieldUndefined: Self = StObject.set(x, "passwordField", js.undefined)
    
    @scala.inline
    def setPasswordUndefined: Self = StObject.set(x, "password", js.undefined)
    
    @scala.inline
    def setRealm(value: String): Self = StObject.set(x, "realm", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRealmUndefined: Self = StObject.set(x, "realm", js.undefined)
    
    @scala.inline
    def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
    
    @scala.inline
    def setUsername(value: String): Self = StObject.set(x, "username", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUsernameField(value: String): Self = StObject.set(x, "usernameField", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUsernameFieldUndefined: Self = StObject.set(x, "usernameField", js.undefined)
    
    @scala.inline
    def setUsernameUndefined: Self = StObject.set(x, "username", js.undefined)
  }
}
