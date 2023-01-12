package typings.ibmCloudSdkCore

import typings.ibmCloudSdkCore.esAuthTokenManagersIamRequestBasedTokenManagerMod.IamRequestBasedTokenManager
import typings.ibmCloudSdkCore.esAuthTokenManagersIamRequestBasedTokenManagerMod.IamRequestOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esAuthTokenManagersIamTokenManagerMod {
  
  @JSImport("ibm-cloud-sdk-core/es/auth/token-managers/iam-token-manager", "IamTokenManager")
  @js.native
  open class IamTokenManager protected () extends IamRequestBasedTokenManager {
    /**
      *
      * Create a new [[IamTokenManager]] instance.
      *
      * @param {object} options Configuration options.
      * @param {string} options.apikey The IAM api key.
      * @param {string} [options.clientId] The `clientId` and `clientSecret` fields are used to form a "basic"
      *   authorization header for IAM token requests.
      * @param {string} [options.clientSecret] The `clientId` and `clientSecret` fields are used to form a "basic"
      *   authorization header for IAM token requests.
      * @param {string} [url='https://iam.cloud.ibm.com'] The IAM endpoint for token requests.
      * @param {boolean} [options.disableSslVerification] A flag that indicates
      *   whether verification of the token server's SSL certificate should be
      *   disabled or not.
      * @param {object<string, string>} [options.headers] Headers to be sent with every
      *   outbound HTTP requests to token services.
      * @constructor
      */
    def this(options: Options) = this()
    
    /* private */ var apikey: Any = js.native
    
    /* protected */ var requiredOptions: js.Array[String] = js.native
  }
  
  /** Configuration options for IAM token retrieval. */
  trait Options
    extends StObject
       with IamRequestOptions {
    
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
