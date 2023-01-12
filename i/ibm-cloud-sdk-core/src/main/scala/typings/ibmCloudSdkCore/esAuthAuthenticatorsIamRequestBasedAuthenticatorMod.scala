package typings.ibmCloudSdkCore

import typings.ibmCloudSdkCore.esAuthAuthenticatorsTokenRequestBasedAuthenticatorMod.BaseOptions
import typings.ibmCloudSdkCore.esAuthAuthenticatorsTokenRequestBasedAuthenticatorMod.TokenRequestBasedAuthenticator
import typings.ibmCloudSdkCore.esAuthTokenManagersMod.IamRequestBasedTokenManager
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esAuthAuthenticatorsIamRequestBasedAuthenticatorMod {
  
  @JSImport("ibm-cloud-sdk-core/es/auth/authenticators/iam-request-based-authenticator", "IamRequestBasedAuthenticator")
  @js.native
  open class IamRequestBasedAuthenticator protected () extends TokenRequestBasedAuthenticator {
    /**
      *
      * Create a new [[IamRequestBasedAuthenticator]] instance.
      *
      * @param {object} options Configuration options for IAM authentication.
      * @param {boolean} options.disableSslVerification A flag that indicates
      *   whether verification of the token server's SSL certificate should be
      *   disabled or not
      * @param {string} options.url for HTTP token requests.
      * @param {object<string, string>} options.headers to be sent with every IAM token request
      * @param {string} [options.clientId] The `clientId` and `clientSecret` fields are used to form a "basic"
      *   authorization header for IAM token requests.
      * @param {string} [options.clientSecret] The `clientId` and `clientSecret` fields are used to form a "basic"
      *   authorization header for IAM token requests.
      * @param {string} [options.scope] The "scope" parameter to use when fetching the bearer token from the
      *   IAM token server.
      * @throws {Error} When the configuration options are not valid.
      */
    def this(options: IamRequestOptions) = this()
    
    /* protected */ var clientId: String = js.native
    
    /* protected */ var clientSecret: String = js.native
    
    /**
      * Return the most recently stored refresh token.
      *
      * @public
      * @returns {string}
      */
    def getRefreshToken(): String = js.native
    
    /* protected */ var scope: String = js.native
    
    /**
      * Setter for the mutually inclusive `clientId` and the `clientSecret`.
      * @param {string} clientId The `clientId` and `clientSecret` fields are used to form a "basic"
      *   authorization header for IAM token requests.
      * @param {string} clientSecret The `clientId` and `clientSecret` fields are used to form a "basic"
      *   authorization header for IAM token requests.
      */
    def setClientIdAndSecret(clientId: String, clientSecret: String): Unit = js.native
    
    /**
      * Setter for the "scope" parameter to use when fetching the bearer token from the IAM token server.
      * @param {string} scope A space seperated string that makes up the scope parameter
      */
    def setScope(scope: String): Unit = js.native
    
    /* protected */ @JSName("tokenManager")
    var tokenManager_IamRequestBasedAuthenticator: IamRequestBasedTokenManager = js.native
  }
  
  trait IamRequestOptions
    extends StObject
       with BaseOptions {
    
    /**
      * The `clientId` and `clientSecret` fields are used to form a "basic"
      * authorization header for IAM token requests.
      */
    var clientId: js.UndefOr[String] = js.undefined
    
    /**
      * The `clientId` and `clientSecret` fields are used to form a "basic"
      * authorization header for IAM token requests.
      */
    var clientSecret: js.UndefOr[String] = js.undefined
    
    /**
      * The "scope" parameter to use when fetching the bearer token from the IAM token server.
      */
    var scope: js.UndefOr[String] = js.undefined
  }
  object IamRequestOptions {
    
    inline def apply(): IamRequestOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IamRequestOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: IamRequestOptions] (val x: Self) extends AnyVal {
      
      inline def setClientId(value: String): Self = StObject.set(x, "clientId", value.asInstanceOf[js.Any])
      
      inline def setClientIdUndefined: Self = StObject.set(x, "clientId", js.undefined)
      
      inline def setClientSecret(value: String): Self = StObject.set(x, "clientSecret", value.asInstanceOf[js.Any])
      
      inline def setClientSecretUndefined: Self = StObject.set(x, "clientSecret", js.undefined)
      
      inline def setScope(value: String): Self = StObject.set(x, "scope", value.asInstanceOf[js.Any])
      
      inline def setScopeUndefined: Self = StObject.set(x, "scope", js.undefined)
    }
  }
}
