package typings.matrixBotSdk.mod

import typings.matrixBotSdk.openIDConnectMod.OpenIDConnectToken
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("matrix-bot-sdk", "IdentityClient")
@js.native
/* private */ open class IdentityClient ()
  extends typings.matrixBotSdk.identityClientMod.IdentityClient
/* static members */
object IdentityClient {
  
  @JSImport("matrix-bot-sdk", "IdentityClient")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Gets an instance of an identity client.
    * @param {OpenIDConnectToken} oidc The OpenID Connect token to register to the identity server with.
    * @param {string} serverUrl The full URL where the identity server can be reached at.
    */
  inline def acquire(
    oidc: OpenIDConnectToken,
    serverUrl: String,
    mxClient: typings.matrixBotSdk.matrixClientMod.MatrixClient
  ): js.Promise[typings.matrixBotSdk.identityClientMod.IdentityClient] = (^.asInstanceOf[js.Dynamic].applyDynamic("acquire")(oidc.asInstanceOf[js.Any], serverUrl.asInstanceOf[js.Any], mxClient.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typings.matrixBotSdk.identityClientMod.IdentityClient]]
}
