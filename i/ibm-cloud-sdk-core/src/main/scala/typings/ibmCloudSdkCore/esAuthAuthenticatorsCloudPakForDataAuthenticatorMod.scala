package typings.ibmCloudSdkCore

import typings.ibmCloudSdkCore.esAuthAuthenticatorsTokenRequestBasedAuthenticatorMod.BaseOptions
import typings.ibmCloudSdkCore.esAuthAuthenticatorsTokenRequestBasedAuthenticatorMod.TokenRequestBasedAuthenticator
import typings.ibmCloudSdkCore.esAuthTokenManagersMod.Cp4dTokenManager
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esAuthAuthenticatorsCloudPakForDataAuthenticatorMod {
  
  @JSImport("ibm-cloud-sdk-core/es/auth/authenticators/cloud-pak-for-data-authenticator", "CloudPakForDataAuthenticator")
  @js.native
  open class CloudPakForDataAuthenticator protected () extends TokenRequestBasedAuthenticator {
    /**
      * Create a new [[CloudPakForDataAuthenticator]] instance.
      *
      * @param {object} options Configuration options for CloudPakForData authentication.
      * @param {string} options.url For HTTP token requests.
      * @param {string} options.username The username used to obtain a bearer token.
      * @param {string} [options.password] The password used to obtain a bearer token [required if apikey not specified].
      * @param {string} [options.apikey] The API key used to obtain a bearer token [required if password not specified].
      * @param {boolean} [options.disableSslVerification] A flag that indicates
      *   whether verification of the token server's SSL certificate should be
      *   disabled or not
      * @param {object<string, string>} [options.headers] to be sent with every.
      * @throws `Error` The username, password, and/or url are not valid, or unspecified, for Cloud Pak For Data token
      *   requests.
      */
    def this(options: Options) = this()
    
    /* private */ var apikey: Any = js.native
    
    /* private */ var password: Any = js.native
    
    /* protected */ var requiredOptions: js.Array[String] = js.native
    
    /* protected */ @JSName("tokenManager")
    var tokenManager_CloudPakForDataAuthenticator: Cp4dTokenManager = js.native
    
    /* private */ var username: Any = js.native
  }
  
  trait Options
    extends StObject
       with BaseOptions {
    
    /** The API key used to obtain a bearer token [required if password not specified]. */
    var apikey: js.UndefOr[String] = js.undefined
    
    /** The password used to obtain a bearer token [required if apikey not specified]. */
    var password: js.UndefOr[String] = js.undefined
    
    /** The URL representing the Cloud Pak for Data token service endpoint. */
    @JSName("url")
    var url_Options: String
    
    /** The username used to obtain a bearer token. */
    var username: String
  }
  object Options {
    
    inline def apply(url: String, username: String): Options = {
      val __obj = js.Dynamic.literal(url = url.asInstanceOf[js.Any], username = username.asInstanceOf[js.Any])
      __obj.asInstanceOf[Options]
    }
    
    extension [Self <: Options](x: Self) {
      
      inline def setApikey(value: String): Self = StObject.set(x, "apikey", value.asInstanceOf[js.Any])
      
      inline def setApikeyUndefined: Self = StObject.set(x, "apikey", js.undefined)
      
      inline def setPassword(value: String): Self = StObject.set(x, "password", value.asInstanceOf[js.Any])
      
      inline def setPasswordUndefined: Self = StObject.set(x, "password", js.undefined)
      
      inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
      
      inline def setUsername(value: String): Self = StObject.set(x, "username", value.asInstanceOf[js.Any])
    }
  }
}
