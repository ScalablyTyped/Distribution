package typings.matrixBotSdk

import typings.matrixBotSdk.libMatrixClientMod.MatrixClient
import typings.matrixBotSdk.libStorageIstorageproviderMod.IStorageProvider
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libPantalaimonClientMod {
  
  @JSImport("matrix-bot-sdk/lib/PantalaimonClient", "PantalaimonClient")
  @js.native
  open class PantalaimonClient protected () extends StObject {
    /**
      * Creates a new PantalaimonClient class for interacting with Pantalaimon. The storage
      * provider given will also be used in the client.
      * @param {string} homeserverUrl The homeserver (Pantalaimon) URL to interact with.
      * @param {IStorageProvider} storageProvider The storage provider to back the client with.
      */
    def this(homeserverUrl: String, storageProvider: IStorageProvider) = this()
    
    /**
      * Authenticates and creates the Pantalaimon-capable client. The username and password given
      * are only used if the storage provider does not reveal an access token.
      * @param {string} username The username to log in with, if needed.
      * @param {string} password The password to log in with, if needed.
      * @returns {Promise<MatrixClient>} Resolves to a MatrixClient ready for interacting with Pantalaimon.
      */
    def createClientWithCredentials(username: String, password: String): js.Promise[MatrixClient] = js.native
    
    /* private */ var homeserverUrl: Any = js.native
    
    /* private */ var storageProvider: Any = js.native
  }
}
