package typings.ibmCloudSdkCore

import org.scalablytyped.runtime.StringDictionary
import typings.ibmCloudSdkCore.esAuthAuthenticatorsAuthenticatorMod.Authenticator
import typings.ibmCloudSdkCore.esAuthTokenManagersMod.JwtTokenManager
import typings.node.httpMod.OutgoingHttpHeaders
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esAuthAuthenticatorsTokenRequestBasedAuthenticatorMod {
  
  @JSImport("ibm-cloud-sdk-core/es/auth/authenticators/token-request-based-authenticator", "TokenRequestBasedAuthenticator")
  @js.native
  open class TokenRequestBasedAuthenticator protected () extends Authenticator {
    /**
      * Create a new [[TokenRequestBasedAuthenticator]] instance with an internal [[JwtTokenManager]].
      *
      * @param {object} options Configuration options.
      * @param {string} options.url for HTTP token requests.
      * @param {boolean} [options.disableSslVerification] A flag that indicates
      *   whether verification of the token server's SSL certificate should be
      *   disabled or not.
      * @param {object<string, string>} [options.headers] to be sent with every
      *   outbound HTTP requests to token services.
      */
    def this(options: BaseOptions) = this()
    
    /* protected */ var disableSslVerification: Boolean = js.native
    
    /* protected */ var headers: OutgoingHttpHeaders = js.native
    
    /**
      * Set the flag that indicates whether verification of the server's SSL
      * certificate should be disabled or not.
      *
      * @param {boolean} value A flag that indicates whether verification of the
      *   token server's SSL certificate should be disabled or not.
      */
    def setDisableSslVerification(value: Boolean): Unit = js.native
    
    /**
      * Set headers.
      *
      * @param {object<string, string>} headers Default headers to be sent with
      *   every Cloud Pak For Data token request. Overwrites previous default headers.
      */
    def setHeaders(headers: OutgoingHttpHeaders): Unit = js.native
    
    /* protected */ var tokenManager: JwtTokenManager = js.native
    
    /* protected */ var url: String = js.native
  }
  
  trait BaseOptions
    extends StObject
       with /* propName */ StringDictionary[Any] {
    
    /**
      * A flag that indicates whether verification of the token server's SSL
      * certificate should be disabled or not.
      */
    var disableSslVerification: js.UndefOr[Boolean] = js.undefined
    
    /** Headers to be sent with every outbound HTTP requests to token services. */
    var headers: js.UndefOr[OutgoingHttpHeaders] = js.undefined
    
    /** Endpoint for HTTP token requests. */
    var url: js.UndefOr[String] = js.undefined
  }
  object BaseOptions {
    
    inline def apply(): BaseOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[BaseOptions]
    }
    
    extension [Self <: BaseOptions](x: Self) {
      
      inline def setDisableSslVerification(value: Boolean): Self = StObject.set(x, "disableSslVerification", value.asInstanceOf[js.Any])
      
      inline def setDisableSslVerificationUndefined: Self = StObject.set(x, "disableSslVerification", js.undefined)
      
      inline def setHeaders(value: OutgoingHttpHeaders): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
      
      inline def setHeadersUndefined: Self = StObject.set(x, "headers", js.undefined)
      
      inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
      
      inline def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
    }
  }
}
