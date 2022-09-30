package typings.matrixAppserviceBridge

import typings.matrixAppserviceBridge.encryptionMod.ClientEncryptionSession
import typings.matrixAppserviceBridge.intentMod.Intent
import typings.matrixAppserviceBridge.intentMod.IntentOpts
import typings.matrixBotSdk.mod.MatrixClient
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object encryptedIntentMod {
  
  @JSImport("matrix-appservice-bridge/lib/components/encrypted-intent", "EncryptedIntent")
  @js.native
  open class EncryptedIntent protected () extends Intent {
    def this(
      botSdkIntent: typings.matrixBotSdk.mod.Intent,
      botClient: MatrixClient,
      intentOpts: IntentOpts,
      encryptionOpts: EncryptedIntentOpts
    ) = this()
    
    /* private */ val encryptedRooms: Any = js.native
    
    /* private */ var encryptionHsClient: Any = js.native
    
    /* private */ var encryptionOpts: Any = js.native
    
    /* private */ var encryptionReadyPromise: Any = js.native
    
    /**
      * Get an encrypted session, either by resolving the `encryption.sessionPromise`
      * promise or creating a new session by logging in to the homeserver.
      */
    /* private */ var getEncryptedSession: Any = js.native
    
    /**
      * Check if a room is encrypted. If it is, return the algorithm.
      * @param roomId The room ID to be checked
      * @returns The encryption algorithm or false
      */
    def isRoomEncrypted(roomId: String): js.Promise[Boolean] = js.native
    
    /* private */ var loginForEncryptedClient: Any = js.native
  }
  
  trait EncryptedIntentOpts extends StObject {
    
    def ensureClientSyncingCallback(): js.Promise[Unit]
    
    var originalHomeserverUrl: String
    
    def sessionCreatedCallback(session: ClientEncryptionSession): js.Promise[Unit]
    
    var sessionPromise: js.Promise[ClientEncryptionSession | Null]
  }
  object EncryptedIntentOpts {
    
    inline def apply(
      ensureClientSyncingCallback: () => js.Promise[Unit],
      originalHomeserverUrl: String,
      sessionCreatedCallback: ClientEncryptionSession => js.Promise[Unit],
      sessionPromise: js.Promise[ClientEncryptionSession | Null]
    ): EncryptedIntentOpts = {
      val __obj = js.Dynamic.literal(ensureClientSyncingCallback = js.Any.fromFunction0(ensureClientSyncingCallback), originalHomeserverUrl = originalHomeserverUrl.asInstanceOf[js.Any], sessionCreatedCallback = js.Any.fromFunction1(sessionCreatedCallback), sessionPromise = sessionPromise.asInstanceOf[js.Any])
      __obj.asInstanceOf[EncryptedIntentOpts]
    }
    
    extension [Self <: EncryptedIntentOpts](x: Self) {
      
      inline def setEnsureClientSyncingCallback(value: () => js.Promise[Unit]): Self = StObject.set(x, "ensureClientSyncingCallback", js.Any.fromFunction0(value))
      
      inline def setOriginalHomeserverUrl(value: String): Self = StObject.set(x, "originalHomeserverUrl", value.asInstanceOf[js.Any])
      
      inline def setSessionCreatedCallback(value: ClientEncryptionSession => js.Promise[Unit]): Self = StObject.set(x, "sessionCreatedCallback", js.Any.fromFunction1(value))
      
      inline def setSessionPromise(value: js.Promise[ClientEncryptionSession | Null]): Self = StObject.set(x, "sessionPromise", value.asInstanceOf[js.Any])
    }
  }
}
