package typings.ibmCloudSdkCore

import typings.ibmCloudSdkCore.esAuthAuthenticatorsAuthenticatorMod.Authenticator
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esAuthAuthenticatorsBearerTokenAuthenticatorMod {
  
  @JSImport("ibm-cloud-sdk-core/es/auth/authenticators/bearer-token-authenticator", "BearerTokenAuthenticator")
  @js.native
  open class BearerTokenAuthenticator protected () extends Authenticator {
    /**
      * Create a new BearerTokenAuthenticator instance.
      *
      * @param {object} options Configuration options for bearer authentication.
      * @param {string} options.bearerToken The bearer token to be added
      *   to requests.
      * @throws {Error} The configuration bearerToken is not valid, or unspecified.
      */
    def this(options: Options) = this()
    
    /* private */ var bearerToken: Any = js.native
    
    /* protected */ var requiredOptions: js.Array[String] = js.native
    
    /**
      * Set a new bearer token to be sent in subsequent requests.
      *
      * @param {string} bearerToken The bearer token that will be sent in service
      *   requests.
      */
    def setBearerToken(bearerToken: String): Unit = js.native
  }
  
  trait Options extends StObject {
    
    /** The bearer token to be added to requests. */
    var bearerToken: String
  }
  object Options {
    
    inline def apply(bearerToken: String): Options = {
      val __obj = js.Dynamic.literal(bearerToken = bearerToken.asInstanceOf[js.Any])
      __obj.asInstanceOf[Options]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
      inline def setBearerToken(value: String): Self = StObject.set(x, "bearerToken", value.asInstanceOf[js.Any])
    }
  }
}
