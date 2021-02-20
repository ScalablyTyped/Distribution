package typings.matrixAppserviceBridge

import typings.matrixAppserviceBridge.anon.Flows
import typings.matrixAppserviceBridge.anon.TypeString
import typings.matrixAppserviceBridge.appServiceBotMod.AppServiceBot
import typings.matrixAppserviceBridge.eventTypesMod.EphemeralEvent
import typings.matrixAppserviceBridge.eventTypesMod.WeakEvent
import typings.matrixAppserviceBridge.intentMod.Intent
import typings.matrixAppserviceBridge.membershipCacheMod.MembershipCache
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object encryptionMod {
  
  @JSImport("matrix-appservice-bridge/lib/components/encryption", "APPSERVICE_LOGIN_TYPE")
  @js.native
  val APPSERVICE_LOGIN_TYPE: /* "uk.half-shot.msc2778.login.application_service" */ String = js.native
  
  @JSImport("matrix-appservice-bridge/lib/components/encryption", "EncryptedEventBroker")
  @js.native
  class EncryptedEventBroker protected () extends StObject {
    def this(
      membership: MembershipCache,
      asBot: AppServiceBot,
      onEvent: js.Function1[/* weakEvent */ WeakEvent, Unit],
      onEphemeralEvent: js.UndefOr[scala.Nothing],
      getIntent: js.Function1[/* userId */ String, Intent]
    ) = this()
    def this(
      membership: MembershipCache,
      asBot: AppServiceBot,
      onEvent: js.Function1[/* weakEvent */ WeakEvent, Unit],
      onEphemeralEvent: js.Function1[/* event */ EphemeralEvent, Unit],
      getIntent: js.Function1[/* userId */ String, Intent]
    ) = this()
    
    var asBot: js.Any = js.native
    
    /**
      * Stop syncing clients used for encryption
      */
    def close(): Unit = js.native
    
    var eventsPendingAS: js.Any = js.native
    
    var eventsPendingSync: js.Any = js.native
    
    var getIntent: js.Any = js.native
    
    var handleEvent: js.Any = js.native
    
    var handledEvents: js.Any = js.native
    
    var membership: js.Any = js.native
    
    /**
      * Called when the bridge gets an event through an appservice transaction.
      * @param event
      * @returns Should the event be passthrough
      */
    def onASEvent(event: WeakEvent): js.Promise[Boolean] = js.native
    
    var onEphemeralEvent: js.Any = js.native
    
    var onEvent: js.Any = js.native
    
    var onPresence: js.Any = js.native
    
    var onReceipt: js.Any = js.native
    
    var onSyncEvent: js.Any = js.native
    
    var onTyping: js.Any = js.native
    
    var presenceCleanupInterval: js.Any = js.native
    
    var receivedPresence: js.Any = js.native
    
    def shouldAvoidCull(intent: Intent): Boolean = js.native
    
    /**
      * Start a sync loop for a given bridge user
      * @param userId The user whos matrix client should start syncing
      */
    def startSyncingUser(userId: String): js.Promise[Unit] = js.native
    
    var syncingClients: js.Any = js.native
    
    var userForRoom: js.Any = js.native
  }
  /* static members */
  object EncryptedEventBroker {
    
    @JSImport("matrix-appservice-bridge/lib/components/encryption", "EncryptedEventBroker.supportsLoginFlow")
    @js.native
    def supportsLoginFlow(loginFlows: Flows): js.UndefOr[TypeString] = js.native
  }
  
  @js.native
  trait ClientEncryptionSession extends StObject {
    
    var accessToken: String = js.native
    
    var deviceId: String = js.native
    
    var userId: String = js.native
  }
  object ClientEncryptionSession {
    
    @scala.inline
    def apply(accessToken: String, deviceId: String, userId: String): ClientEncryptionSession = {
      val __obj = js.Dynamic.literal(accessToken = accessToken.asInstanceOf[js.Any], deviceId = deviceId.asInstanceOf[js.Any], userId = userId.asInstanceOf[js.Any])
      __obj.asInstanceOf[ClientEncryptionSession]
    }
    
    @scala.inline
    implicit class ClientEncryptionSessionMutableBuilder[Self <: ClientEncryptionSession] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAccessToken(value: String): Self = StObject.set(x, "accessToken", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDeviceId(value: String): Self = StObject.set(x, "deviceId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUserId(value: String): Self = StObject.set(x, "userId", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait ClientEncryptionStore extends StObject {
    
    def getStoredSession(userId: String): js.Promise[ClientEncryptionSession | Null] = js.native
    
    def setStoredSession(session: ClientEncryptionSession): js.Promise[Unit] = js.native
  }
  object ClientEncryptionStore {
    
    @scala.inline
    def apply(
      getStoredSession: String => js.Promise[ClientEncryptionSession | Null],
      setStoredSession: ClientEncryptionSession => js.Promise[Unit]
    ): ClientEncryptionStore = {
      val __obj = js.Dynamic.literal(getStoredSession = js.Any.fromFunction1(getStoredSession), setStoredSession = js.Any.fromFunction1(setStoredSession))
      __obj.asInstanceOf[ClientEncryptionStore]
    }
    
    @scala.inline
    implicit class ClientEncryptionStoreMutableBuilder[Self <: ClientEncryptionStore] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setGetStoredSession(value: String => js.Promise[ClientEncryptionSession | Null]): Self = StObject.set(x, "getStoredSession", js.Any.fromFunction1(value))
      
      @scala.inline
      def setSetStoredSession(value: ClientEncryptionSession => js.Promise[Unit]): Self = StObject.set(x, "setStoredSession", js.Any.fromFunction1(value))
    }
  }
}
