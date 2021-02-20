package typings.jpm

import typings.jpm.anon.CredentialonCompleteanyun
import typings.jpm.anon.FormSubmitURL
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Interact with Firefox's Password Manager to add, retrieve and remove stored credentials
  */
object passwordsMod {
  
  @JSImport("sdk/passwords", "remove")
  @js.native
  def remove(options: CredentialonCompleteanyun): Unit = js.native
  
  @JSImport("sdk/passwords", "search")
  @js.native
  def search(options: FormSubmitURL): Unit = js.native
  
  @JSImport("sdk/passwords", "store")
  @js.native
  def store(options: CredentialonCompleteanyun): Unit = js.native
  
  @js.native
  trait Credential extends StObject {
    
    var formSubmitURL: js.UndefOr[String] = js.native
    
    var password: String = js.native
    
    var passwordField: js.UndefOr[String] = js.native
    
    var realm: js.UndefOr[String] = js.native
    
    var url: js.UndefOr[String] = js.native
    
    var username: String = js.native
    
    var usernameField: js.UndefOr[String] = js.native
  }
  object Credential {
    
    @scala.inline
    def apply(password: String, username: String): Credential = {
      val __obj = js.Dynamic.literal(password = password.asInstanceOf[js.Any], username = username.asInstanceOf[js.Any])
      __obj.asInstanceOf[Credential]
    }
    
    @scala.inline
    implicit class CredentialMutableBuilder[Self <: Credential] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setFormSubmitURL(value: String): Self = StObject.set(x, "formSubmitURL", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFormSubmitURLUndefined: Self = StObject.set(x, "formSubmitURL", js.undefined)
      
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
}
