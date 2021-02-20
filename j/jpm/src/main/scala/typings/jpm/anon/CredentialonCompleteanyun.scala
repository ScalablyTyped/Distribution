package typings.jpm.anon

import typings.jpm.FFAddonSDK.NSIException
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined jpm.sdk/passwords.Credential & {  onComplete :(): any | undefined,   onError :(error : jpm.FFAddonSDK.NSIException): any | undefined} */
@js.native
trait CredentialonCompleteanyun extends StObject {
  
  var formSubmitURL: js.UndefOr[String] = js.native
  
  var onComplete: js.UndefOr[js.Function0[_]] = js.native
  
  var onError: js.UndefOr[js.Function1[/* error */ NSIException, _]] = js.native
  
  var password: String = js.native
  
  var passwordField: js.UndefOr[String] = js.native
  
  var realm: js.UndefOr[String] = js.native
  
  var url: js.UndefOr[String] = js.native
  
  var username: String = js.native
  
  var usernameField: js.UndefOr[String] = js.native
}
object CredentialonCompleteanyun {
  
  @scala.inline
  def apply(password: String, username: String): CredentialonCompleteanyun = {
    val __obj = js.Dynamic.literal(password = password.asInstanceOf[js.Any], username = username.asInstanceOf[js.Any])
    __obj.asInstanceOf[CredentialonCompleteanyun]
  }
  
  @scala.inline
  implicit class CredentialonCompleteanyunMutableBuilder[Self <: CredentialonCompleteanyun] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFormSubmitURL(value: String): Self = StObject.set(x, "formSubmitURL", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFormSubmitURLUndefined: Self = StObject.set(x, "formSubmitURL", js.undefined)
    
    @scala.inline
    def setOnComplete(value: () => _): Self = StObject.set(x, "onComplete", js.Any.fromFunction0(value))
    
    @scala.inline
    def setOnCompleteUndefined: Self = StObject.set(x, "onComplete", js.undefined)
    
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
  }
}
