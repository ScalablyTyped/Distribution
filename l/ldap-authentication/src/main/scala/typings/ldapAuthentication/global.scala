package typings.ldapAuthentication

import typings.ldapAuthentication.mod.AuthenticationOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  object LdapAuthentication {
    
    @JSGlobal("LdapAuthentication")
    @js.native
    val ^ : js.Any = js.native
    
    @JSGlobal("LdapAuthentication.LdapAuthenticationError")
    @js.native
    open class LdapAuthenticationError protected ()
      extends typings.ldapAuthentication.mod.LdapAuthenticationError {
      def this(message: Any) = this()
    }
    
    inline def authenticate(options: AuthenticationOptions): js.Promise[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("authenticate")(options.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Any]]
  }
}
