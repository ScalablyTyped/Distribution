package typings.ibmCloudSdkCore

import typings.ibmCloudSdkCore.esAuthAuthenticatorsIamRequestBasedAuthenticatorMod.IamRequestBasedAuthenticator
import typings.ibmCloudSdkCore.esAuthAuthenticatorsIamRequestBasedAuthenticatorMod.IamRequestOptions
import typings.ibmCloudSdkCore.esAuthTokenManagersMod.IamTokenManager
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esAuthAuthenticatorsIamAuthenticatorMod {
  
  @JSImport("ibm-cloud-sdk-core/es/auth/authenticators/iam-authenticator", "IamAuthenticator")
  @js.native
  open class IamAuthenticator protected () extends IamRequestBasedAuthenticator {
    /**
      *
      * Create a new [[IamAuthenticator]] instance.
      *
      * @param {object} options Configuration options for IAM authentication.
      * @param {boolean} options.disableSslVerification A flag that indicates
      *   whether verification of the token server's SSL certificate should be
      *   disabled or not
      * @param {string} options.url for HTTP token requests.
      * @param {object<string, string>} options.headers to be sent with every
      * @param {string} options.apikey The IAM api key.
      * @param {string} [options.clientId] The `clientId` and `clientSecret` fields are used to form a "basic"
      *   authorization header for IAM token requests.
      * @param {string} [options.clientSecret] The `clientId` and `clientSecret` fields are used to form a "basic"
      *   authorization header for IAM token requests.
      * @param {string} [options.scope] The "scope" parameter to use when fetching the bearer token from the
      *   IAM token server.
      * @throws {Error} When the configuration options are not valid.
      */
    def this(options: Options) = this()
    
    /* private */ var apikey: Any = js.native
    
    /* protected */ var requiredOptions: js.Array[String] = js.native
    
    /* protected */ @JSName("tokenManager")
    var tokenManager_IamAuthenticator: IamTokenManager = js.native
  }
  
  trait Options
    extends StObject
       with IamRequestOptions {
    
    /** The IAM api key */
    var apikey: String
  }
  object Options {
    
    inline def apply(apikey: String): Options = {
      val __obj = js.Dynamic.literal(apikey = apikey.asInstanceOf[js.Any])
      __obj.asInstanceOf[Options]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
      inline def setApikey(value: String): Self = StObject.set(x, "apikey", value.asInstanceOf[js.Any])
    }
  }
}
