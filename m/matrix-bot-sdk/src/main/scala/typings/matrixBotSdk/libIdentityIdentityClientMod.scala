package typings.matrixBotSdk

import typings.matrixBotSdk.libMatrixClientMod.MatrixClient
import typings.matrixBotSdk.libMetricsMetricsMod.Metrics
import typings.matrixBotSdk.libModelsIdentityServerModelsMod.IdentityServerAccount
import typings.matrixBotSdk.libModelsIdentityServerModelsMod.IdentityServerInvite
import typings.matrixBotSdk.libModelsOpenIDConnectMod.OpenIDConnectToken
import typings.matrixBotSdk.libModelsPoliciesMod.Policies
import typings.matrixBotSdk.libModelsThreepidMod.Threepid
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libIdentityIdentityClientMod {
  
  @JSImport("matrix-bot-sdk/lib/identity/IdentityClient", "IdentityClient")
  @js.native
  /* private */ open class IdentityClient () extends StObject {
    
    /**
      * Accepts all the terms of service offered by the identity server. Note that this is only meant to be
      * used by automated bots where terms acceptance is implicit - the terms of service need to be presented
      * to the user in most cases.
      * @returns {Promise<void>} Resolves when complete.
      */
    def acceptAllTerms(): js.Promise[Unit] = js.native
    
    /**
      * Accepts a given set of URLs from Policy objects returned by the server. This implies acceptance of
      * the terms. Note that this will not update the user's account data to consider these terms accepted
      * in the future - that is an exercise left to the caller.
      * @param {string[]} termsUrls The URLs to count as accepted.
      * @returns {Promise<void>} Resolves when complete.
      */
    def acceptTerms(termsUrls: js.Array[String]): js.Promise[Unit] = js.native
    
    val accessToken: String = js.native
    
    /**
      * If truthy, this is a string that will be supplied as `?brand=$brand` where endpoints can
      * result in communications to a user.
      */
    var brand: String = js.native
    
    /**
      * Performs a web request to the server, applying appropriate authorization headers for
      * this client.
      * @param {"GET"|"POST"|"PUT"|"DELETE"} method The HTTP method to use in the request
      * @param {string} endpoint The endpoint to call. For example: "/_matrix/identity/v2/account"
      * @param {any} qs The query string to send. Optional.
      * @param {any} body The request body to send. Optional. Will be converted to JSON unless the type is a Buffer.
      * @param {number} timeout The number of milliseconds to wait before timing out.
      * @param {boolean} raw If true, the raw response will be returned instead of the response body.
      * @param {string} contentType The content type to send. Only used if the `body` is a Buffer.
      * @param {string} noEncoding Set to true to disable encoding, and return a Buffer. Defaults to false
      * @returns {Promise<any>} Resolves to the response (body), rejected if a non-2xx status code was returned.
      */
    def doRequest(
      method: Any,
      endpoint: Any,
      qs: js.UndefOr[Any],
      body: js.UndefOr[Any],
      timeout: js.UndefOr[Double],
      raw: js.UndefOr[Boolean],
      contentType: js.UndefOr[String],
      noEncoding: js.UndefOr[Boolean]
    ): js.Promise[Any] = js.native
    
    /**
      * Gets account information for the logged in user.
      * @returns {Promise<IdentityServerAccount>} Resolves to the account information
      */
    def getAccount(): js.Promise[IdentityServerAccount] = js.native
    
    /**
      * Gets the terms of service for which the identity server has.
      * @returns {Promise<Policies>} Resolves to the policies of the server.
      */
    def getTermsOfService(): js.Promise[Policies] = js.native
    
    /**
      * Looks up a series of third party identifiers (email addresses or phone numbers) to see if they have
      * associated mappings. The returned array will be ordered the same as the input, and have falsey values
      * in place of any failed/missing lookups (eg: no mapping).
      * @param {Threepid[]} identifiers The identifiers to look up.
      * @param {boolean} allowPlaintext If true, the function will accept the server's offer to use plaintext
      * lookups when no other methods are available. The function will always prefer hashed methods.
      * @returns {Promise<string[]>} Resolves to the user IDs (or falsey values) in the same order as the input.
      */
    def lookup(identifiers: js.Array[Threepid]): js.Promise[js.Array[String]] = js.native
    def lookup(identifiers: js.Array[Threepid], allowPlaintext: Boolean): js.Promise[js.Array[String]] = js.native
    
    /**
      * Creates a third party email invite. This will store the invite in the identity server, but
      * not publish the invite to the room - the caller is expected to handle the remaining part. Note
      * that this function is not required to be called when using the Client-Server API for inviting
      * third party addresses to a room. This will make several calls into the room state to populate
      * the invite details, therefore the inviter (the client backing this identity client) must be
      * present in the room.
      * @param {string} emailAddress The email address to invite.
      * @param {string} roomId The room ID to invite to.
      * @returns {Promise<IdentityServerInvite>} Resolves to the identity server's stored invite.
      */
    def makeEmailInvite(emailAddress: String, roomId: String): js.Promise[IdentityServerInvite] = js.native
    
    val matrixClient: MatrixClient = js.native
    
    /**
      * The metrics instance for this client. Note that metrics for the underlying MatrixClient will
      * not be available here.
      */
    val metrics: Metrics = js.native
    
    val serverUrl: String = js.native
  }
  /* static members */
  object IdentityClient {
    
    @JSImport("matrix-bot-sdk/lib/identity/IdentityClient", "IdentityClient")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Gets an instance of an identity client.
      * @param {OpenIDConnectToken} oidc The OpenID Connect token to register to the identity server with.
      * @param {string} serverUrl The full URL where the identity server can be reached at.
      */
    inline def acquire(oidc: OpenIDConnectToken, serverUrl: String, mxClient: MatrixClient): js.Promise[IdentityClient] = (^.asInstanceOf[js.Dynamic].applyDynamic("acquire")(oidc.asInstanceOf[js.Any], serverUrl.asInstanceOf[js.Any], mxClient.asInstanceOf[js.Any])).asInstanceOf[js.Promise[IdentityClient]]
  }
}
