package typings.ibmCloudSdkCore

import typings.ibmCloudSdkCore.esAuthTokenManagersJwtTokenManagerMod.JwtTokenManager
import typings.ibmCloudSdkCore.esAuthTokenManagersTokenManagerMod.TokenManagerOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esAuthTokenManagersIamRequestBasedTokenManagerMod {
  
  @JSImport("ibm-cloud-sdk-core/es/auth/token-managers/iam-request-based-token-manager", "IamRequestBasedTokenManager")
  @js.native
  open class IamRequestBasedTokenManager protected () extends JwtTokenManager {
    /**
      *
      * Create a new [[IamRequestBasedTokenManager]] instance.
      *
      * @param {object} options Configuration options.
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
    def this(options: IamRequestOptions) = this()
    
    /* private */ var clientId: Any = js.native
    
    /* private */ var clientSecret: Any = js.native
    
    /* protected */ var formData: Any = js.native
    
    /**
      * Return the most recently stored refresh token.
      *
      * @public
      * @returns {string}
      */
    def getRefreshToken(): String = js.native
    
    /* protected */ var refreshToken: String = js.native
    
    /* private */ var scope: Any = js.native
    
    /**
      * Set the IAM `clientId` and `clientSecret` values.
      * These values are used to compute the Authorization header used
      * when retrieving the IAM access token.
      * If these values are not set, no Authorization header will be
      * set on the request (it is not required).
      *
      * @param {string} clientId - The client id.
      * @param {string} clientSecret - The client secret.
      * @returns {void}
      */
    def setClientIdAndSecret(clientId: String, clientSecret: String): Unit = js.native
    
    /**
      * Set the IAM `scope` value.
      * This value is the form parameter to use when fetching the bearer token
      * from the IAM token server.
      *
      * @param {string} scope - A space seperated string that makes up the scope parameter.
      * @returns {void}
      */
    def setScope(scope: String): Unit = js.native
  }
  
  trait IamRequestOptions
    extends StObject
       with TokenManagerOptions {
    
    var clientId: js.UndefOr[String] = js.undefined
    
    var clientSecret: js.UndefOr[String] = js.undefined
    
    var scope: js.UndefOr[String] = js.undefined
  }
  object IamRequestOptions {
    
    inline def apply(): IamRequestOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IamRequestOptions]
    }
    
    extension [Self <: IamRequestOptions](x: Self) {
      
      inline def setClientId(value: String): Self = StObject.set(x, "clientId", value.asInstanceOf[js.Any])
      
      inline def setClientIdUndefined: Self = StObject.set(x, "clientId", js.undefined)
      
      inline def setClientSecret(value: String): Self = StObject.set(x, "clientSecret", value.asInstanceOf[js.Any])
      
      inline def setClientSecretUndefined: Self = StObject.set(x, "clientSecret", js.undefined)
      
      inline def setScope(value: String): Self = StObject.set(x, "scope", value.asInstanceOf[js.Any])
      
      inline def setScopeUndefined: Self = StObject.set(x, "scope", js.undefined)
    }
  }
}
