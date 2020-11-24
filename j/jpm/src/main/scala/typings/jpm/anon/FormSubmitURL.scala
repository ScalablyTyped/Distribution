package typings.jpm.anon

import typings.jpm.FFAddonSDK.NSIException
import typings.jpm.passwordsMod.Credential
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FormSubmitURL extends js.Object {
  
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
  implicit class FormSubmitURLOps[Self <: FormSubmitURL] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setOnComplete(value: js.Array[Credential] => js.Any): Self = this.set("onComplete", js.Any.fromFunction1(value))
    
    @scala.inline
    def setFormSubmitURL(value: String): Self = this.set("formSubmitURL", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFormSubmitURL: Self = this.set("formSubmitURL", js.undefined)
    
    @scala.inline
    def setOnError(value: /* error */ NSIException => _): Self = this.set("onError", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnError: Self = this.set("onError", js.undefined)
    
    @scala.inline
    def setPassword(value: String): Self = this.set("password", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePassword: Self = this.set("password", js.undefined)
    
    @scala.inline
    def setPasswordField(value: String): Self = this.set("passwordField", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePasswordField: Self = this.set("passwordField", js.undefined)
    
    @scala.inline
    def setRealm(value: String): Self = this.set("realm", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRealm: Self = this.set("realm", js.undefined)
    
    @scala.inline
    def setUrl(value: String): Self = this.set("url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUrl: Self = this.set("url", js.undefined)
    
    @scala.inline
    def setUsername(value: String): Self = this.set("username", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUsername: Self = this.set("username", js.undefined)
    
    @scala.inline
    def setUsernameField(value: String): Self = this.set("usernameField", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUsernameField: Self = this.set("usernameField", js.undefined)
  }
}
