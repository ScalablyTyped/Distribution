package typings.matrixBotSdk

import typings.matrixBotSdk.appserviceMod.Appservice
import typings.matrixBotSdk.appserviceMod.IAppserviceOptions
import typings.matrixBotSdk.matrixBotSdkStrings.mDotemote
import typings.matrixBotSdk.matrixBotSdkStrings.mDotnotice
import typings.matrixBotSdk.matrixBotSdkStrings.mDottext
import typings.matrixBotSdk.mod.MatrixClient
import typings.matrixBotSdk.mod.Metrics
import typings.matrixBotSdk.unstableAppserviceApisMod.UnstableAppserviceApis
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object intentMod {
  
  @JSImport("matrix-bot-sdk/lib/appservice/Intent", "Intent")
  @js.native
  open class Intent protected () extends StObject {
    /**
      * Creates a new intent. Intended to be created by application services.
      * @param {IAppserviceOptions} options The options for the application service.
      * @param {string} impersonateUserId The user ID to impersonate.
      * @param {Appservice} appservice The application service itself.
      */
    def this(options: IAppserviceOptions, impersonateUserId: String, appservice: Appservice) = this()
    
    /* private */ var appservice: Any = js.native
    
    /* private */ var client: Any = js.native
    
    /* private */ var cryptoSetupPromise: Any = js.native
    
    /* private */ val cryptoStorage: Any = js.native
    
    /**
      * Sets up crypto on the client if it hasn't already been set up.
      * @returns {Promise<void>} Resolves when complete.
      */
    def enableEncryption(): js.Promise[Unit] = js.native
    
    /**
      * Ensures the user is joined to the given room
      * @param {string} roomId The room ID to join
      * @returns {Promise<any>} Resolves when complete
      */
    def ensureJoined(roomId: String): js.Promise[String] = js.native
    
    /**
      * Ensures the user is registered
      * @returns {Promise<any>} Resolves when complete
      */
    def ensureRegistered(): js.Promise[Any] = js.native
    
    /**
      * Ensures the user is registered and joined to the given room.
      * @param {string} roomId The room ID to join
      * @returns {Promise<any>} Resolves when complete
      */
    def ensureRegisteredAndJoined(roomId: String): js.Promise[Unit] = js.native
    
    /**
      * Gets the joined rooms for the intent. Note that by working around
      * the intent to join rooms may yield inaccurate results.
      * @returns {Promise<string[]>} Resolves to an array of room IDs where
      * the intent is joined.
      */
    def getJoinedRooms(): js.Promise[js.Array[String]] = js.native
    
    /* private */ var impersonateUserId: Any = js.native
    
    /**
      * Joins the given room
      * @param {string} roomIdOrAlias the room ID or alias to join
      * @returns {Promise<string>} resolves to the joined room ID
      */
    def joinRoom(roomIdOrAlias: String): js.Promise[String] = js.native
    
    /* private */ var knownJoinedRooms: Any = js.native
    
    /**
      * Leaves the given room.
      * @param {string} roomId The room ID to leave
      * @returns {Promise<any>} Resolves when the room has been left.
      */
    def leaveRoom(roomId: String): js.Promise[Any] = js.native
    
    /* private */ var makeClient: Any = js.native
    
    /**
      * The metrics instance for this intent. Note that this will not raise metrics
      * for the underlying client - those will be available through this instance's
      * parent (the appservice).
      */
    val metrics: Metrics = js.native
    
    /* private */ var options: Any = js.native
    
    /**
      * Refreshes which rooms the user is joined to, potentially saving time on
      * calls like ensureJoined()
      * @returns {Promise<string[]>} Resolves to the joined room IDs for the user.
      */
    def refreshJoinedRooms(): js.Promise[js.Array[String]] = js.native
    
    /**
      * Sends an event to a room.
      * @param {string} roomId The room ID to send the event to.
      * @param {any} content The content of the event.
      * @returns {Promise<string>} Resolves to the event ID of the sent event.
      */
    def sendEvent(roomId: String, content: Any): js.Promise[String] = js.native
    
    /**
      * Sends a text message to a room.
      * @param {string} roomId The room ID to send text to.
      * @param {string} body The message body to send.
      * @param {"m.text" | "m.emote" | "m.notice"} msgtype The message type to send.
      * @returns {Promise<string>} Resolves to the event ID of the sent message.
      */
    def sendText(roomId: String, body: String): js.Promise[String] = js.native
    def sendText(roomId: String, body: String, msgtype: mDottext | mDotemote | mDotnotice): js.Promise[String] = js.native
    
    /* private */ val storage: Any = js.native
    
    /**
      * Gets the underlying MatrixClient that powers this Intent.
      */
    def underlyingClient: MatrixClient = js.native
    
    /**
      * Gets the unstable API access class. This is generally not recommended to be
      * used by appservices.
      * @return {UnstableAppserviceApis} The unstable API access class.
      */
    def unstableApis: UnstableAppserviceApis = js.native
    
    /* private */ var unstableApisInstance: Any = js.native
    
    /**
      * Gets the user ID this intent is for.
      */
    def userId: String = js.native
  }
}
