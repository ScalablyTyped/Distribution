package typings.ibmCloudSdkCore

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object v1Mod {
  
  @JSImport("ibm-cloud-sdk-core/iam-token-manager/v1", "IamTokenManagerV1")
  @js.native
  class IamTokenManagerV1 protected () extends StObject {
    /**
      * IAM Token Manager Service
      *
      * Retreives, stores, and refreshes IAM tokens.
      *
      * @param {Object} options
      * @param {String} options.iamApikey
      * @param {String} options.iamAccessToken
      * @param {String} options.iamUrl - url of the iam api to retrieve tokens from
      * @constructor
      */
    def this(options: Options) = this()
    
    /**
      * This function sends an access token back through a callback. The source of the token
      * is determined by the following logic:
      * 1. If user provides their own managed access token, assume it is valid and send it
      * 2. If this class is managing tokens and does not yet have one, make a request for one
      * 3. If this class is managing tokens and the token has expired, refresh it
      * 4. If this class is managing tokens and has a valid token stored, send it
      *
      * @param {Function} cb - callback function that the token will be passed to
      */
    def getToken(cb: js.Function): js.Any = js.native
    
    /* private */ var iamApikey: js.Any = js.native
    
    /* protected */ var iamUrl: String = js.native
    
    /**
      * Used as a fail-safe to prevent the condition of a refresh token expiring,
      * which could happen after around 30 days. This function will return true
      * if it has been at least 7 days and 1 hour since the last token was
      * retrieved.
      *
      * @private
      * @returns {boolean}
      */
    /* private */ var isRefreshTokenExpired: js.Any = js.native
    
    /**
      * Check if currently stored token is expired.
      *
      * Using a buffer to prevent the edge case of the
      * token expiring before the request could be made.
      *
      * The buffer will be a fraction of the total TTL. Using 80%.
      *
      * @private
      * @returns {boolean}
      */
    /* private */ var isTokenExpired: js.Any = js.native
    
    var name: String = js.native
    
    /**
      * Refresh an IAM token using a refresh token.
      *
      * @param {Function} cb - The callback that handles the response.
      * @returns {void}
      */
    /* private */ var refreshToken: js.Any = js.native
    
    /**
      * Request an IAM token using an API key.
      *
      * @param {Function} cb - The callback that handles the response.
      * @returns {void}
      */
    /* private */ var requestToken: js.Any = js.native
    
    /**
      * Save the response from the IAM service request to the object's state.
      *
      * @param {IamTokenData} tokenResponse - Response object from IAM service request
      * @private
      * @returns {void}
      */
    /* private */ var saveTokenInfo: js.Any = js.native
    
    var serviceVersion: String = js.native
    
    /**
      * Set a self-managed IAM access token.
      * The access token should be valid and not yet expired.
      *
      * By using this method, you accept responsibility for managing the
      * access token yourself. You must set a new access token before this
      * one expires. Failing to do so will result in authentication errors
      * after this token expires.
      *
      * @param {string} iamAccessToken - A valid, non-expired IAM access token
      * @returns {void}
      */
    def setAccessToken(iamAccessToken: String): Unit = js.native
    
    /* protected */ var tokenInfo: IamTokenData = js.native
    
    /* private */ var userAccessToken: js.Any = js.native
  }
  
  trait IamTokenData extends StObject {
    
    var access_token: String
    
    var expiration: Double
    
    var expires_in: Double
    
    var refresh_token: String
    
    var token_type: String
  }
  object IamTokenData {
    
    inline def apply(
      access_token: String,
      expiration: Double,
      expires_in: Double,
      refresh_token: String,
      token_type: String
    ): IamTokenData = {
      val __obj = js.Dynamic.literal(access_token = access_token.asInstanceOf[js.Any], expiration = expiration.asInstanceOf[js.Any], expires_in = expires_in.asInstanceOf[js.Any], refresh_token = refresh_token.asInstanceOf[js.Any], token_type = token_type.asInstanceOf[js.Any])
      __obj.asInstanceOf[IamTokenData]
    }
    
    extension [Self <: IamTokenData](x: Self) {
      
      inline def setAccess_token(value: String): Self = StObject.set(x, "access_token", value.asInstanceOf[js.Any])
      
      inline def setExpiration(value: Double): Self = StObject.set(x, "expiration", value.asInstanceOf[js.Any])
      
      inline def setExpires_in(value: Double): Self = StObject.set(x, "expires_in", value.asInstanceOf[js.Any])
      
      inline def setRefresh_token(value: String): Self = StObject.set(x, "refresh_token", value.asInstanceOf[js.Any])
      
      inline def setToken_type(value: String): Self = StObject.set(x, "token_type", value.asInstanceOf[js.Any])
    }
  }
  
  trait Options extends StObject {
    
    var iamAccessToken: js.UndefOr[String] = js.undefined
    
    var iamApikey: js.UndefOr[String] = js.undefined
    
    var iamUrl: js.UndefOr[String] = js.undefined
  }
  object Options {
    
    inline def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    extension [Self <: Options](x: Self) {
      
      inline def setIamAccessToken(value: String): Self = StObject.set(x, "iamAccessToken", value.asInstanceOf[js.Any])
      
      inline def setIamAccessTokenUndefined: Self = StObject.set(x, "iamAccessToken", js.undefined)
      
      inline def setIamApikey(value: String): Self = StObject.set(x, "iamApikey", value.asInstanceOf[js.Any])
      
      inline def setIamApikeyUndefined: Self = StObject.set(x, "iamApikey", js.undefined)
      
      inline def setIamUrl(value: String): Self = StObject.set(x, "iamUrl", value.asInstanceOf[js.Any])
      
      inline def setIamUrlUndefined: Self = StObject.set(x, "iamUrl", js.undefined)
    }
  }
}
