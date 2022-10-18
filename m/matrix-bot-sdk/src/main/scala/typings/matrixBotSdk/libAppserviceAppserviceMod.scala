package typings.matrixBotSdk

import typings.expressServeStaticCore.mod.Express
import typings.matrixBotSdk.anon.Aliases
import typings.matrixBotSdk.anon.Encryption
import typings.matrixBotSdk.libAppserviceIntentMod.Intent
import typings.matrixBotSdk.libAppserviceMatrixBridgeMod.MatrixBridge
import typings.matrixBotSdk.libPreprocessorsIpreprocessorMod.IPreprocessor
import typings.matrixBotSdk.libStorageIappservicestorageproviderMod.IAppserviceCryptoStorageProvider
import typings.matrixBotSdk.libStorageIappservicestorageproviderMod.IAppserviceStorageProvider
import typings.matrixBotSdk.libStrategiesJoinRoomStrategyMod.IJoinRoomStrategy
import typings.matrixBotSdk.matrixBotSdkStrings.`private`
import typings.matrixBotSdk.matrixBotSdkStrings.public
import typings.matrixBotSdk.mod.MatrixClient
import typings.matrixBotSdk.mod.Metrics
import typings.node.eventsMod.EventEmitter
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libAppserviceAppserviceMod {
  
  @JSImport("matrix-bot-sdk/lib/appservice/Appservice", "Appservice")
  @js.native
  open class Appservice protected () extends EventEmitter {
    /**
      * Creates a new application service.
      * @param {IAppserviceOptions} options The options for the application service.
      */
    def this(options: IAppserviceOptions) = this()
    
    /**
      * Adds a preprocessor to the event pipeline. When this appservice encounters an event, it
      * will try to run it through the preprocessors it can in the order they were added.
      * @param {IPreprocessor} preprocessor the preprocessor to add
      */
    def addPreprocessor(preprocessor: IPreprocessor): Unit = js.native
    
    /* private */ val aliasPrefix: Any = js.native
    
    /* private */ var app: Any = js.native
    
    /* private */ var appServer: Any = js.native
    
    /**
      * Starts the application service, opening the bind address to begin processing requests.
      * @returns {Promise<void>} resolves when started
      */
    def begin(): js.Promise[Unit] = js.native
    
    /**
      * Get the application service's "bot" MatrixClient (the sender_localpart).
      * Normally the botIntent should be used to ensure that the bot user is safely
      * handled.
      * @returns {MatrixClient} The client for the application service itself.
      */
    def botClient: MatrixClient = js.native
    
    /**
      * Get the application service's "bot" Intent (the sender_localpart).
      * @returns {Intent} The intent for the application service itself.
      */
    def botIntent: Intent = js.native
    
    /**
      * Get the application service's "bot" user ID (the sender_localpart).
      */
    def botUserId: String = js.native
    
    /**
      * Gets the bridge-specific APIs for this application service.
      */
    def bridge: MatrixBridge = js.native
    
    /* private */ val bridgeInstance: Any = js.native
    
    /* private */ val cryptoStorage: Any = js.native
    
    /* private */ var eventProcessors: Any = js.native
    
    /**
      * Gets the express app instance which is serving requests. Not recommended for
      * general usage, but may be used to append routes to the web server.
      */
    def expressAppInstance: Express = js.native
    
    /**
      * Gets a full alias for a given localpart. The alias will be formed with the domain name given
      * in the constructor.
      * @param localpart The localpart to get an alias for.
      * @returns {string} The alias.
      */
    def getAlias(localpart: String): String = js.native
    
    /**
      * Gets a full alias for a given suffix. The prefix is automatically detected from the registration
      * options.
      * @param suffix The alias's suffix
      * @returns {string} The alias.
      */
    def getAliasForSuffix(suffix: String): String = js.native
    
    /**
      * Gets the localpart of an alias for a given suffix. The prefix is automatically detected from the registration
      * options. Useful for the createRoom endpoint.
      * @param suffix The alias's suffix
      * @returns {string} The alias localpart.
      */
    def getAliasLocalpartForSuffix(suffix: String): String = js.native
    
    /**
      * Gets an intent for a given localpart. The user ID will be formed with the domain name given
      * in the constructor.
      * @param localpart The localpart to get an Intent for.
      * @returns {Intent} An Intent for the user.
      */
    def getIntent(localpart: String): Intent = js.native
    
    /**
      * Gets an Intent for a given user suffix. The prefix is automatically detected from the registration
      * options.
      * @param suffix The user's suffix
      * @returns {Intent} An Intent for the user.
      */
    def getIntentForSuffix(suffix: String): Intent = js.native
    
    /**
      * Gets an Intent for a given user ID.
      * @param {string} userId The user ID to get an Intent for.
      * @returns {Intent} An Intent for the user.
      */
    def getIntentForUserId(userId: String): Intent = js.native
    
    /**
      * Gets the suffix for the provided alias. If the alias is not a namespaced
      * alias, this will return a falsey value.
      * @param {string} alias The alias to parse
      * @returns {string} The suffix from the alias.
      */
    def getSuffixForAlias(alias: String): String = js.native
    
    /**
      * Gets the suffix for the provided user ID. If the user ID is not a namespaced
      * user, this will return a falsey value.
      * @param {string} userId The user ID to parse
      * @returns {string} The suffix from the user ID.
      */
    def getSuffixForUserId(userId: String): String = js.native
    
    /**
      * Gets a full user ID for a given localpart. The user ID will be formed with the domain name given
      * in the constructor.
      * @param localpart The localpart to get a user ID for.
      * @returns {string} The user's ID.
      */
    def getUserId(localpart: String): String = js.native
    
    /**
      * Gets a full user ID for a given suffix. The prefix is automatically detected from the registration
      * options.
      * @param suffix The user's suffix
      * @returns {string} The user's ID.
      */
    def getUserIdForSuffix(suffix: String): String = js.native
    
    /* private */ var handleThirdpartyObject: Any = js.native
    
    /* private */ var intentsCache: Any = js.native
    
    /* private */ var isAuthed: Any = js.native
    
    /**
      * Determines if a given alias is namespaced by this application service.
      * @param {string} alias The alias to check
      * @returns {boolean} true if the alias is namespaced, false otherwise
      */
    def isNamespacedAlias(alias: String): Boolean = js.native
    
    /**
      * Determines if a given user ID is namespaced by this application service.
      * @param {string} userId The user ID to check
      * @returns {boolean} true if the user is namespaced, false otherwise
      */
    def isNamespacedUser(userId: String): Boolean = js.native
    
    /**
      * The metrics instance for this appservice. This will raise all metrics
      * from this appservice instance as well as any intents/MatrixClients created
      * by the appservice.
      */
    val metrics: Metrics = js.native
    
    /* private */ var onRoomAlias: Any = js.native
    
    /* private */ var onThirdpartyLocation: Any = js.native
    
    /* private */ var onThirdpartyProtocol: Any = js.native
    
    /* private */ var onThirdpartyUser: Any = js.native
    
    /* private */ var onTransaction: Any = js.native
    
    /* private */ var onUser: Any = js.native
    
    /* private */ var options: Any = js.native
    
    /* private */ var pendingTransactions: Any = js.native
    
    /* private */ var processEphemeralEvent: Any = js.native
    
    /* private */ var processEvent: Any = js.native
    
    /* private */ var processMembershipEvent: Any = js.native
    
    /* private */ val registration: Any = js.native
    
    /**
      * Sets the visibility of a room in the appservice's room directory.
      * @param {string} networkId The network ID to group the room under.
      * @param {string} roomId The room ID to manipulate the visibility of.
      * @param {"public" | "private"} visibility The visibility to set for the room.
      * @return {Promise<any>} resolves when the visibility has been updated.
      */
    def setRoomDirectoryVisibility(networkId: String, roomId: String, visibility: public | `private`): js.Promise[Any] = js.native
    
    /**
      * Stops the application service, freeing the web server.
      */
    def stop(): Unit = js.native
    
    /* private */ val storage: Any = js.native
    
    /* private */ val userPrefix: Any = js.native
  }
  
  trait IAppserviceOptions extends StObject {
    
    /**
      * The bind address to listen for requests on.
      */
    var bindAddress: String
    
    /**
      * The storage provider to use for setting up encryption. Encryption will be
      * disabled for all intents and the appservice if not configured.
      */
    var cryptoStorage: js.UndefOr[IAppserviceCryptoStorageProvider] = js.undefined
    
    /**
      * The name of the homeserver, as presented over federation (eg: "matrix.org")
      */
    var homeserverName: String
    
    /**
      * The URL to the homeserver's client server API (eg: "https://matrix.org")
      */
    var homeserverUrl: String
    
    /**
      * Options for how Intents are handled.
      */
    var intentOptions: js.UndefOr[Encryption] = js.undefined
    
    /**
      * The join strategy to use for all intents, if any.
      */
    var joinStrategy: js.UndefOr[IJoinRoomStrategy] = js.undefined
    
    /**
      * The port to listen for requests from the homeserver on.
      */
    var port: Double
    
    /**
      * The registration for this application service.
      */
    var registration: IAppserviceRegistration
    
    /**
      * The storage provider to use for this application service.
      */
    var storage: js.UndefOr[IAppserviceStorageProvider] = js.undefined
  }
  object IAppserviceOptions {
    
    inline def apply(
      bindAddress: String,
      homeserverName: String,
      homeserverUrl: String,
      port: Double,
      registration: IAppserviceRegistration
    ): IAppserviceOptions = {
      val __obj = js.Dynamic.literal(bindAddress = bindAddress.asInstanceOf[js.Any], homeserverName = homeserverName.asInstanceOf[js.Any], homeserverUrl = homeserverUrl.asInstanceOf[js.Any], port = port.asInstanceOf[js.Any], registration = registration.asInstanceOf[js.Any])
      __obj.asInstanceOf[IAppserviceOptions]
    }
    
    extension [Self <: IAppserviceOptions](x: Self) {
      
      inline def setBindAddress(value: String): Self = StObject.set(x, "bindAddress", value.asInstanceOf[js.Any])
      
      inline def setCryptoStorage(value: IAppserviceCryptoStorageProvider): Self = StObject.set(x, "cryptoStorage", value.asInstanceOf[js.Any])
      
      inline def setCryptoStorageUndefined: Self = StObject.set(x, "cryptoStorage", js.undefined)
      
      inline def setHomeserverName(value: String): Self = StObject.set(x, "homeserverName", value.asInstanceOf[js.Any])
      
      inline def setHomeserverUrl(value: String): Self = StObject.set(x, "homeserverUrl", value.asInstanceOf[js.Any])
      
      inline def setIntentOptions(value: Encryption): Self = StObject.set(x, "intentOptions", value.asInstanceOf[js.Any])
      
      inline def setIntentOptionsUndefined: Self = StObject.set(x, "intentOptions", js.undefined)
      
      inline def setJoinStrategy(value: IJoinRoomStrategy): Self = StObject.set(x, "joinStrategy", value.asInstanceOf[js.Any])
      
      inline def setJoinStrategyUndefined: Self = StObject.set(x, "joinStrategy", js.undefined)
      
      inline def setPort(value: Double): Self = StObject.set(x, "port", value.asInstanceOf[js.Any])
      
      inline def setRegistration(value: IAppserviceRegistration): Self = StObject.set(x, "registration", value.asInstanceOf[js.Any])
      
      inline def setStorage(value: IAppserviceStorageProvider): Self = StObject.set(x, "storage", value.asInstanceOf[js.Any])
      
      inline def setStorageUndefined: Self = StObject.set(x, "storage", js.undefined)
    }
  }
  
  trait IAppserviceRegistration extends StObject {
    
    /**
      * The token the application service uses to communicate with the homeserver.
      */
    var as_token: String
    
    /**
      * **Experimental**
      *
      * Should the application service receive ephemeral events from the homeserver. Optional.
      * @see https://github.com/matrix-org/matrix-doc/pull/2409
      */
    @JSName("de.sorunome.msc2409.push_ephemeral")
    var deDotsorunomeDotmsc2409Dotpush_ephemeral: js.UndefOr[Boolean] = js.undefined
    
    /**
      * The token the homeserver uses to communicate with the application service.
      */
    var hs_token: String
    
    /**
      * Optional ID for the appplication service. Used by homeservers to track which application
      * service registers what.
      */
    var id: js.UndefOr[String] = js.undefined
    
    /**
      * The various namespaces the application service can support.
      */
    var namespaces: Aliases
    
    /**
      * The protocols the application service supports. Optional.
      */
    var protocols: js.UndefOr[js.Array[String]] = js.undefined
    
    /**
      * If the application service is rate limited by the homeserver. Optional.
      */
    var rate_limited: js.UndefOr[Boolean] = js.undefined
    
    /**
      * The application service's own localpart (eg: "_irc_bot" in the user ID "@_irc_bot:domain.com")
      */
    var sender_localpart: String
    
    /**
      * Optional URL at which the application service can be contacted.
      */
    var url: js.UndefOr[String] = js.undefined
  }
  object IAppserviceRegistration {
    
    inline def apply(as_token: String, hs_token: String, namespaces: Aliases, sender_localpart: String): IAppserviceRegistration = {
      val __obj = js.Dynamic.literal(as_token = as_token.asInstanceOf[js.Any], hs_token = hs_token.asInstanceOf[js.Any], namespaces = namespaces.asInstanceOf[js.Any], sender_localpart = sender_localpart.asInstanceOf[js.Any])
      __obj.asInstanceOf[IAppserviceRegistration]
    }
    
    extension [Self <: IAppserviceRegistration](x: Self) {
      
      inline def setAs_token(value: String): Self = StObject.set(x, "as_token", value.asInstanceOf[js.Any])
      
      inline def setDeDotsorunomeDotmsc2409Dotpush_ephemeral(value: Boolean): Self = StObject.set(x, "de.sorunome.msc2409.push_ephemeral", value.asInstanceOf[js.Any])
      
      inline def setDeDotsorunomeDotmsc2409Dotpush_ephemeralUndefined: Self = StObject.set(x, "de.sorunome.msc2409.push_ephemeral", js.undefined)
      
      inline def setHs_token(value: String): Self = StObject.set(x, "hs_token", value.asInstanceOf[js.Any])
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
      
      inline def setNamespaces(value: Aliases): Self = StObject.set(x, "namespaces", value.asInstanceOf[js.Any])
      
      inline def setProtocols(value: js.Array[String]): Self = StObject.set(x, "protocols", value.asInstanceOf[js.Any])
      
      inline def setProtocolsUndefined: Self = StObject.set(x, "protocols", js.undefined)
      
      inline def setProtocolsVarargs(value: String*): Self = StObject.set(x, "protocols", js.Array(value*))
      
      inline def setRate_limited(value: Boolean): Self = StObject.set(x, "rate_limited", value.asInstanceOf[js.Any])
      
      inline def setRate_limitedUndefined: Self = StObject.set(x, "rate_limited", js.undefined)
      
      inline def setSender_localpart(value: String): Self = StObject.set(x, "sender_localpart", value.asInstanceOf[js.Any])
      
      inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
      
      inline def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
    }
  }
}
