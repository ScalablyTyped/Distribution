package typings.matrixAppserviceBridge

import typings.matrixAppserviceBridge.anon.Flows
import typings.matrixAppserviceBridge.appServiceBotMod.AppServiceBot
import typings.matrixAppserviceBridge.eventTypesMod.WeakEvent
import typings.matrixAppserviceBridge.intentMod.Intent
import typings.matrixAppserviceBridge.membershipCacheMod.MembershipCache
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object encryptionMod {
  
  @JSImport("matrix-appservice-bridge/lib/components/encryption", "APPSERVICE_LOGIN_TYPE")
  @js.native
  val APPSERVICE_LOGIN_TYPE: /* "m.login.application_service" */ String = js.native
  
  @JSImport("matrix-appservice-bridge/lib/components/encryption", "EncryptedEventBroker")
  @js.native
  open class EncryptedEventBroker protected () extends StObject {
    def this(
      membership: MembershipCache,
      asBot: AppServiceBot,
      onEvent: js.Function1[/* weakEvent */ WeakEvent, Unit],
      getIntent: js.Function1[/* userId */ String, Intent],
      store: ClientEncryptionStore
    ) = this()
    
    /* private */ var asBot: Any = js.native
    
    /**
      * Stop syncing clients used for encryption
      */
    def close(): Unit = js.native
    
    /* private */ var eventsPendingAS: Any = js.native
    
    /* private */ var eventsPendingSync: Any = js.native
    
    /* private */ var getIntent: Any = js.native
    
    /* private */ var handleEvent: Any = js.native
    
    /* private */ var handledEvents: Any = js.native
    
    /* private */ var membership: Any = js.native
    
    /**
      * Called when the bridge gets an event through an appservice transaction.
      * @param event
      * @returns Should the event be passed through to the bridge.
      */
    def onASEvent(event: WeakEvent): js.Promise[Boolean] = js.native
    
    /* private */ var onEvent: Any = js.native
    
    /* private */ var onSyncEvent: Any = js.native
    
    def shouldAvoidCull(intent: Intent): Boolean = js.native
    
    /**
      * Start a sync loop for a given bridge user
      * @param userId The user whos matrix client should start syncing
      * @returns Resolves when the sync has begun.
      */
    def startSyncingUser(userId: String): js.Promise[Unit] = js.native
    
    /* private */ var store: Any = js.native
    
    /* private */ var syncingClients: Any = js.native
    
    /* private */ var userForRoom: Any = js.native
  }
  /* static members */
  object EncryptedEventBroker {
    
    @JSImport("matrix-appservice-bridge/lib/components/encryption", "EncryptedEventBroker")
    @js.native
    val ^ : js.Any = js.native
    
    inline def supportsLoginFlow(loginFlows: Flows): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("supportsLoginFlow")(loginFlows.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  }
  
  trait ClientEncryptionSession extends StObject {
    
    var accessToken: String
    
    var deviceId: String
    
    var syncToken: String | Null
    
    var userId: String
  }
  object ClientEncryptionSession {
    
    inline def apply(accessToken: String, deviceId: String, userId: String): ClientEncryptionSession = {
      val __obj = js.Dynamic.literal(accessToken = accessToken.asInstanceOf[js.Any], deviceId = deviceId.asInstanceOf[js.Any], userId = userId.asInstanceOf[js.Any], syncToken = null)
      __obj.asInstanceOf[ClientEncryptionSession]
    }
    
    extension [Self <: ClientEncryptionSession](x: Self) {
      
      inline def setAccessToken(value: String): Self = StObject.set(x, "accessToken", value.asInstanceOf[js.Any])
      
      inline def setDeviceId(value: String): Self = StObject.set(x, "deviceId", value.asInstanceOf[js.Any])
      
      inline def setSyncToken(value: String): Self = StObject.set(x, "syncToken", value.asInstanceOf[js.Any])
      
      inline def setSyncTokenNull: Self = StObject.set(x, "syncToken", null)
      
      inline def setUserId(value: String): Self = StObject.set(x, "userId", value.asInstanceOf[js.Any])
    }
  }
  
  trait ClientEncryptionStore extends StObject {
    
    def getStoredSession(userId: String): js.Promise[ClientEncryptionSession | Null]
    
    def setStoredSession(session: ClientEncryptionSession): js.Promise[Unit]
    
    def updateSyncToken(userId: String, token: String): js.Promise[Unit]
  }
  object ClientEncryptionStore {
    
    inline def apply(
      getStoredSession: String => js.Promise[ClientEncryptionSession | Null],
      setStoredSession: ClientEncryptionSession => js.Promise[Unit],
      updateSyncToken: (String, String) => js.Promise[Unit]
    ): ClientEncryptionStore = {
      val __obj = js.Dynamic.literal(getStoredSession = js.Any.fromFunction1(getStoredSession), setStoredSession = js.Any.fromFunction1(setStoredSession), updateSyncToken = js.Any.fromFunction2(updateSyncToken))
      __obj.asInstanceOf[ClientEncryptionStore]
    }
    
    extension [Self <: ClientEncryptionStore](x: Self) {
      
      inline def setGetStoredSession(value: String => js.Promise[ClientEncryptionSession | Null]): Self = StObject.set(x, "getStoredSession", js.Any.fromFunction1(value))
      
      inline def setSetStoredSession(value: ClientEncryptionSession => js.Promise[Unit]): Self = StObject.set(x, "setStoredSession", js.Any.fromFunction1(value))
      
      inline def setUpdateSyncToken(value: (String, String) => js.Promise[Unit]): Self = StObject.set(x, "updateSyncToken", js.Any.fromFunction2(value))
    }
  }
}
