package typings.jpm

import typings.jpm.anon.CredentialonCompleteanyun
import typings.jpm.anon.FormSubmitURL
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Interact with Firefox's Password Manager to add, retrieve and remove stored credentials
  */
object passwordsMod {
  
  @JSImport("sdk/passwords", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def remove(options: CredentialonCompleteanyun): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("remove")(options.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  @scala.inline
  def search(options: FormSubmitURL): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("search")(options.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  @scala.inline
  def store(options: CredentialonCompleteanyun): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("store")(options.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  trait Credential extends StObject {
    
    var formSubmitURL: js.UndefOr[String] = js.undefined
    
    var password: String
    
    var passwordField: js.UndefOr[String] = js.undefined
    
    var realm: js.UndefOr[String] = js.undefined
    
    var url: js.UndefOr[String] = js.undefined
    
    var username: String
    
    var usernameField: js.UndefOr[String] = js.undefined
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
