package typings.ibmCloudSdkCore

import typings.ibmCloudSdkCore.esAuthTokenManagersTokenManagerMod.TokenManager
import typings.ibmCloudSdkCore.esAuthTokenManagersTokenManagerMod.TokenManagerOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esAuthTokenManagersJwtTokenManagerMod {
  
  @JSImport("ibm-cloud-sdk-core/es/auth/token-managers/jwt-token-manager", "JwtTokenManager")
  @js.native
  open class JwtTokenManager protected () extends TokenManager {
    /**
      * Create a new [[JwtTokenManager]] instance.
      * @constructor
      * @param {object} options Configuration options.
      * @param {string} options.url for HTTP token requests.
      * @param {boolean} [options.disableSslVerification] A flag that indicates
      *   whether verification of the token server's SSL certificate should be
      *   disabled or not.
      * @param {object<string, string>} [options.headers] Headers to be sent with every
      *   outbound HTTP requests to token services.
      */
    def this(options: JwtTokenManagerOptions) = this()
    
    /* protected */ var tokenInfo: Any = js.native
    
    /* protected */ var tokenName: String = js.native
  }
  
  type JwtTokenManagerOptions = TokenManagerOptions
}
