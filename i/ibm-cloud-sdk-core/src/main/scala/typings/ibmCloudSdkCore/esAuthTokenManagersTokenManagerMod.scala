package typings.ibmCloudSdkCore

import org.scalablytyped.runtime.StringDictionary
import typings.ibmCloudSdkCore.esLibRequestWrapperMod.RequestWrapper
import typings.node.httpMod.OutgoingHttpHeaders
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esAuthTokenManagersTokenManagerMod {
  
  @JSImport("ibm-cloud-sdk-core/es/auth/token-managers/token-manager", "TokenManager")
  @js.native
  open class TokenManager protected () extends StObject {
    /**
      * Create a new [[TokenManager]] instance.
      * @constructor
      * @param {object} options Configuration options.
      * @param {string} options.url for HTTP token requests.
      * @param {boolean} [options.disableSslVerification] A flag that indicates
      *   whether verification of the token server's SSL certificate should be
      *   disabled or not.
      * @param {object<string, string>} [options.headers] Headers to be sent with every
      *   outbound HTTP requests to token services.
      */
    def this(options: TokenManagerOptions) = this()
    
    /* protected */ var accessToken: String = js.native
    
    /* protected */ var disableSslVerification: Boolean = js.native
    
    /* protected */ var expireTime: Double = js.native
    
    /**
      * Retrieve a new token using `requestToken()` in the case there is not a
      *   currently stored token from a previous call, or the previous token
      *   has expired.
      */
    def getToken(): js.Promise[Any] = js.native
    
    /* protected */ var headers: OutgoingHttpHeaders = js.native
    
    /**
      * Check if currently stored token is expired
      *
      * @private
      * @returns {boolean}
      */
    /* private */ var isTokenExpired: Any = js.native
    
    /**
      * Paces requests to request_token.
      *
      * This method pseudo-serializes requests for an access_token
      * when the current token is undefined or expired.
      * The first caller to this method records its `requestTime` and
      * then issues the token request. Subsequent callers will check the
      * `requestTime` to see if a request is active (has been issued within
      * the past 60 seconds), and if so will queue their promise for the
      * active requestor to resolve when that request completes.
      */
    /* protected */ def pacedRequestToken(): js.Promise[Any] = js.native
    
    /* private */ var pendingRequests: Any = js.native
    
    /* protected */ var refreshTime: Double = js.native
    
    /* private */ var requestTime: Any = js.native
    
    /**
      * Request a token using an API endpoint.
      *
      * @returns {Promise}
      */
    /* protected */ def requestToken(): js.Promise[Any] = js.native
    
    /* protected */ var requestWrapperInstance: RequestWrapper = js.native
    
    /**
      * Parse and save token information from the response.
      * Save the requested token into field `accessToken`.
      * Calculate expiration and refresh time from the received info
      * and store them in fields `expireTime` and `refreshTime`.
      *
      * @param tokenResponse - Response object from a token service request
      * @protected
      * @returns {void}
      */
    /* protected */ def saveTokenInfo(tokenResponse: Any): Unit = js.native
    
    /**
      * Setter for the disableSslVerification property.
      *
      * @param {boolean} value - the new value for the disableSslVerification
      *   property
      * @returns {void}
      */
    def setDisableSslVerification(value: Boolean): Unit = js.native
    
    /**
      * Set a completely new set of headers.
      *
      * @param {OutgoingHttpHeaders} headers - the new set of headers as an object
      * @returns {void}
      */
    def setHeaders(headers: OutgoingHttpHeaders): Unit = js.native
    
    /**
      * Check if currently stored token should be refreshed
      * i.e. past the window to request a new token
      *
      * @private
      * @returns {boolean}
      */
    /* private */ var tokenNeedsRefresh: Any = js.native
    
    /* protected */ var url: String = js.native
  }
  
  trait TokenManagerOptions
    extends StObject
       with /* propName */ StringDictionary[Any] {
    
    /**
      * A flag that indicates whether verification of
      *   the server's SSL certificate should be disabled or not.
      */
    var disableSslVerification: js.UndefOr[Boolean] = js.undefined
    
    /** Headers to be sent with every service token request. */
    var headers: js.UndefOr[OutgoingHttpHeaders] = js.undefined
    
    /** The endpoint for token requests. */
    var url: js.UndefOr[String] = js.undefined
  }
  object TokenManagerOptions {
    
    inline def apply(): TokenManagerOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TokenManagerOptions]
    }
    
    extension [Self <: TokenManagerOptions](x: Self) {
      
      inline def setDisableSslVerification(value: Boolean): Self = StObject.set(x, "disableSslVerification", value.asInstanceOf[js.Any])
      
      inline def setDisableSslVerificationUndefined: Self = StObject.set(x, "disableSslVerification", js.undefined)
      
      inline def setHeaders(value: OutgoingHttpHeaders): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
      
      inline def setHeadersUndefined: Self = StObject.set(x, "headers", js.undefined)
      
      inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
      
      inline def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
    }
  }
}
