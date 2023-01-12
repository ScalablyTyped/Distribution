package typings.ibmCloudSdkCore

import typings.ibmCloudSdkCore.anon.Authorization
import typings.ibmCloudSdkCore.esAuthAuthenticatorsAuthenticatorMod.Authenticator
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esAuthAuthenticatorsBasicAuthenticatorMod {
  
  @JSImport("ibm-cloud-sdk-core/es/auth/authenticators/basic-authenticator", "BasicAuthenticator")
  @js.native
  open class BasicAuthenticator protected () extends Authenticator {
    /**
      * Create a new BasicAuthenticator instance.
      *
      * @param {object} options Configuration options for basic authentication.
      * @param {string} options.username The username portion of basic authentication.
      * @param {string} options.password The password portion of basic authentication.
      * @throws {Error} The configuration options are not valid.
      */
    def this(options: Options) = this()
    
    /* protected */ var authHeader: Authorization = js.native
    
    /* protected */ var requiredOptions: js.Array[String] = js.native
  }
  
  trait Options extends StObject {
    
    /** The password to be used in basic authorization. */
    var password: String
    
    /** The username to be used in basic authorization. */
    var username: String
  }
  object Options {
    
    inline def apply(password: String, username: String): Options = {
      val __obj = js.Dynamic.literal(password = password.asInstanceOf[js.Any], username = username.asInstanceOf[js.Any])
      __obj.asInstanceOf[Options]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
      inline def setPassword(value: String): Self = StObject.set(x, "password", value.asInstanceOf[js.Any])
      
      inline def setUsername(value: String): Self = StObject.set(x, "username", value.asInstanceOf[js.Any])
    }
  }
}
