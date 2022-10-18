package typings.jpm

import typings.jpm.anon.CredentialonCompleteanyun
import typings.jpm.anon.FormSubmitURL
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Interact with Firefox's Password Manager to add, retrieve and remove stored credentials
  */
object sdkPasswordsMod {
  
  @JSImport("sdk/passwords", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def remove(options: CredentialonCompleteanyun): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("remove")(options.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def search(options: FormSubmitURL): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("search")(options.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def store(options: CredentialonCompleteanyun): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("store")(options.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
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
    
    inline def apply(password: String, username: String): Credential = {
      val __obj = js.Dynamic.literal(password = password.asInstanceOf[js.Any], username = username.asInstanceOf[js.Any])
      __obj.asInstanceOf[Credential]
    }
    
    extension [Self <: Credential](x: Self) {
      
      inline def setFormSubmitURL(value: String): Self = StObject.set(x, "formSubmitURL", value.asInstanceOf[js.Any])
      
      inline def setFormSubmitURLUndefined: Self = StObject.set(x, "formSubmitURL", js.undefined)
      
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
}
