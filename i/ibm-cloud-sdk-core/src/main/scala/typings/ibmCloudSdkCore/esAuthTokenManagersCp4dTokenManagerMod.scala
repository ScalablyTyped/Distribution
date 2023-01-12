package typings.ibmCloudSdkCore

import typings.ibmCloudSdkCore.esAuthTokenManagersJwtTokenManagerMod.JwtTokenManager
import typings.ibmCloudSdkCore.esAuthTokenManagersTokenManagerMod.TokenManagerOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esAuthTokenManagersCp4dTokenManagerMod {
  
  @JSImport("ibm-cloud-sdk-core/es/auth/token-managers/cp4d-token-manager", "Cp4dTokenManager")
  @js.native
  open class Cp4dTokenManager protected () extends JwtTokenManager {
    /**
      * Create a new [[Cp4dTokenManager]] instance.
      *
      * @param {object} options Configuration options.
      * @param {string} options.username The username used to obtain a bearer token.
      * @param {string} options.password The password used to obtain a bearer token [required if apikey not specified].
      * @param {string} options.apikey The API key used to obtain a bearer token [required if password not specified].
      * @param {string} options.url The endpoint for CP4D token requests.
      * @param {boolean} [options.disableSslVerification] A flag that indicates
      *   whether verification of the token server's SSL certificate should be
      *   disabled or not.
      * @param {object<string, string>} [options.headers] Headers to be sent with every
      *   outbound HTTP requests to token services.
      * @constructor
      */
    def this(options: Options) = this()
    
    /* private */ var apikey: Any = js.native
    
    /* private */ var password: Any = js.native
    
    /* protected */ var requiredOptions: js.Array[String] = js.native
    
    /* private */ var username: Any = js.native
  }
  
  trait CpdTokenData extends StObject {
    
    var _messageCode_ : String
    
    var accessToken: String
    
    var aud: String
    
    var iss: String
    
    var message: String
    
    var permissions: js.Array[String]
    
    var role: String
    
    var sub: String
    
    var uid: String
    
    var username: String
  }
  object CpdTokenData {
    
    inline def apply(
      _messageCode_ : String,
      accessToken: String,
      aud: String,
      iss: String,
      message: String,
      permissions: js.Array[String],
      role: String,
      sub: String,
      uid: String,
      username: String
    ): CpdTokenData = {
      val __obj = js.Dynamic.literal(_messageCode_ = _messageCode_.asInstanceOf[js.Any], accessToken = accessToken.asInstanceOf[js.Any], aud = aud.asInstanceOf[js.Any], iss = iss.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], permissions = permissions.asInstanceOf[js.Any], role = role.asInstanceOf[js.Any], sub = sub.asInstanceOf[js.Any], uid = uid.asInstanceOf[js.Any], username = username.asInstanceOf[js.Any])
      __obj.asInstanceOf[CpdTokenData]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: CpdTokenData] (val x: Self) extends AnyVal {
      
      inline def setAccessToken(value: String): Self = StObject.set(x, "accessToken", value.asInstanceOf[js.Any])
      
      inline def setAud(value: String): Self = StObject.set(x, "aud", value.asInstanceOf[js.Any])
      
      inline def setIss(value: String): Self = StObject.set(x, "iss", value.asInstanceOf[js.Any])
      
      inline def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
      
      inline def setPermissions(value: js.Array[String]): Self = StObject.set(x, "permissions", value.asInstanceOf[js.Any])
      
      inline def setPermissionsVarargs(value: String*): Self = StObject.set(x, "permissions", js.Array(value*))
      
      inline def setRole(value: String): Self = StObject.set(x, "role", value.asInstanceOf[js.Any])
      
      inline def setSub(value: String): Self = StObject.set(x, "sub", value.asInstanceOf[js.Any])
      
      inline def setUid(value: String): Self = StObject.set(x, "uid", value.asInstanceOf[js.Any])
      
      inline def setUsername(value: String): Self = StObject.set(x, "username", value.asInstanceOf[js.Any])
      
      inline def set_messageCode_(value: String): Self = StObject.set(x, "_messageCode_", value.asInstanceOf[js.Any])
    }
  }
  
  /** Configuration options for CP4D token retrieval. */
  trait Options
    extends StObject
       with TokenManagerOptions {
    
    /** The API key used to obtain a bearer token [required if password not specified]. */
    var apikey: js.UndefOr[String] = js.undefined
    
    /** The password used to obtain a bearer token [required if apikey not specified]. */
    var password: js.UndefOr[String] = js.undefined
    
    /** The endpoint for CP4D token requests. */
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
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
      inline def setApikey(value: String): Self = StObject.set(x, "apikey", value.asInstanceOf[js.Any])
      
      inline def setApikeyUndefined: Self = StObject.set(x, "apikey", js.undefined)
      
      inline def setPassword(value: String): Self = StObject.set(x, "password", value.asInstanceOf[js.Any])
      
      inline def setPasswordUndefined: Self = StObject.set(x, "password", js.undefined)
      
      inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
      
      inline def setUsername(value: String): Self = StObject.set(x, "username", value.asInstanceOf[js.Any])
    }
  }
}
