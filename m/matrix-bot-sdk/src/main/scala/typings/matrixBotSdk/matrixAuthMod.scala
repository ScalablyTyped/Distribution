package typings.matrixBotSdk

import typings.matrixBotSdk.matrixClientMod.MatrixClient
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object matrixAuthMod {
  
  @JSImport("matrix-bot-sdk/lib/MatrixAuth", "MatrixAuth")
  @js.native
  open class MatrixAuth protected () extends StObject {
    /**
      * Creates a new MatrixAuth class for creating a MatrixClient
      * @param {string} homeserverUrl The homeserver URL to authenticate against.
      */
    def this(homeserverUrl: String) = this()
    
    /**
      * Generate a client with no access token so we can reuse the doRequest
      * logic already written.
      */
    /* private */ var createTemplateClient: Any = js.native
    
    /* private */ var homeserverUrl: Any = js.native
    
    /**
      * Performs simple password login with the homeserver. The caller is
      * expected to confirm if the homeserver supports this login flow prior
      * to invocation.
      * @param {string} username The username (localpart or user ID) to log in with
      * @param {string} password The password for the account
      * @param {string} deviceName The name of the newly created device. Optional.
      * @returns {Promise<MatrixClient>} Resolves to a logged-in MatrixClient
      */
    def passwordLogin(username: String, password: String): js.Promise[MatrixClient] = js.native
    def passwordLogin(username: String, password: String, deviceName: String): js.Promise[MatrixClient] = js.native
    
    /**
      * Performs simple registration using a password for the account. This will
      * assume the server supports the m.login.password flow for registration, and
      * will attempt to complete only that stage. The caller is expected to determine
      * if the homeserver supports registration prior to invocation.
      * @param {string} localpart The localpart (username) to register
      * @param {string} password The password to register with
      * @param {string} deviceName The name of the newly created device. Optional.
      * @returns {Promise<MatrixClient>} Resolves to a logged-in MatrixClient
      */
    def passwordRegister(localpart: String, password: String): js.Promise[MatrixClient] = js.native
    def passwordRegister(localpart: String, password: String, deviceName: String): js.Promise[MatrixClient] = js.native
  }
}
