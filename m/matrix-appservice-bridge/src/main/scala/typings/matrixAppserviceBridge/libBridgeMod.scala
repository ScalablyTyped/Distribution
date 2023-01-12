package typings.matrixAppserviceBridge

import typings.express.mod.Request_
import typings.matrixAppservice.mod.AppService
import typings.matrixAppservice.mod.AppServiceRegistration
import typings.matrixAppserviceBridge.anon.Authenticate
import typings.matrixAppserviceBridge.anon.Bot
import typings.matrixAppserviceBridge.anon.CreationOpts
import typings.matrixAppserviceBridge.anon.GetLocation
import typings.matrixAppserviceBridge.anon.HomeserverUrl
import typings.matrixAppserviceBridge.anon.Name
import typings.matrixAppserviceBridge.anon.PerRequest
import typings.matrixAppserviceBridge.anon.Type
import typings.matrixAppserviceBridge.anon.ValidateEditSender
import typings.matrixAppserviceBridge.libComponentsActivityTrackerMod.ActivityTracker
import typings.matrixAppserviceBridge.libComponentsActivityTrackerMod.ActivityTrackerOpts
import typings.matrixAppserviceBridge.libComponentsAppServiceBotMod.AppServiceBot
import typings.matrixAppserviceBridge.libComponentsBridgeContextMod.BridgeContext
import typings.matrixAppserviceBridge.libComponentsEncryptedIntentMod.EncryptedIntent
import typings.matrixAppserviceBridge.libComponentsEncryptedIntentMod.EncryptedIntentOpts
import typings.matrixAppserviceBridge.libComponentsEventBridgeStoreMod.EventBridgeStore
import typings.matrixAppserviceBridge.libComponentsEventTypesMod.PresenceEvent
import typings.matrixAppserviceBridge.libComponentsEventTypesMod.ReadReceiptEvent
import typings.matrixAppserviceBridge.libComponentsEventTypesMod.TypingEvent
import typings.matrixAppserviceBridge.libComponentsEventTypesMod.WeakEvent
import typings.matrixAppserviceBridge.libComponentsIntentMod.Intent
import typings.matrixAppserviceBridge.libComponentsIntentMod.IntentOpts
import typings.matrixAppserviceBridge.libComponentsMembershipCacheMod.MembershipCache
import typings.matrixAppserviceBridge.libComponentsPrometheusmetricsMod.BridgeGaugesCounts
import typings.matrixAppserviceBridge.libComponentsPrometheusmetricsMod.PrometheusMetrics
import typings.matrixAppserviceBridge.libComponentsRequestFactoryMod.RequestFactory
import typings.matrixAppserviceBridge.libComponentsRequestMod.Request
import typings.matrixAppserviceBridge.libComponentsRoomBridgeStoreMod.RoomBridgeStore
import typings.matrixAppserviceBridge.libComponentsRoomLinkValidatorMod.RoomLinkValidator
import typings.matrixAppserviceBridge.libComponentsRoomLinkValidatorMod.RoomLinkValidatorStatus
import typings.matrixAppserviceBridge.libComponentsRoomLinkValidatorMod.Rules
import typings.matrixAppserviceBridge.libComponentsRoomUpgradeHandlerMod.RoomUpgradeHandlerOpts
import typings.matrixAppserviceBridge.libComponentsUserActivityMod.UserActivityTracker
import typings.matrixAppserviceBridge.libComponentsUserActivityStoreMod.UserActivityStore
import typings.matrixAppserviceBridge.libComponentsUserBridgeStoreMod.UserBridgeStore
import typings.matrixAppserviceBridge.libModelsUsersMatrixMod.MatrixUser
import typings.promClient.mod.Registry
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libBridgeMod {
  
  @JSImport("matrix-appservice-bridge/lib/bridge", "BRIDGE_PING_EVENT_TYPE")
  @js.native
  val BRIDGE_PING_EVENT_TYPE: /* "org.matrix.bridge.ping" */ String = js.native
  
  @JSImport("matrix-appservice-bridge/lib/bridge", "BRIDGE_PING_TIMEOUT_MS")
  @js.native
  val BRIDGE_PING_TIMEOUT_MS: /* 60000 */ Double = js.native
  
  @JSImport("matrix-appservice-bridge/lib/bridge", "Bridge")
  @js.native
  open class Bridge protected () extends StObject {
    /**
      * @param opts Options to pass to the bridge
      * @param opts.roomUpgradeOpts Options to supply to
      * the room upgrade handler. If not defined then upgrades are NOT handled by the bridge.
      */
    def this(opts: BridgeOpts) = this()
    
    def activityTracker: js.UndefOr[ActivityTracker] = js.native
    
    /**
      * Install a custom handler for an incoming HTTP API request. This allows
      * callers to add extra functionality, implement new APIs, etc...
      * @param opts Named options
      * @param opts.authenticate Should the token be automatically checked. Defaults to true.
      * @param opts.handler Function to handle requests
      * @param opts.method The HTTP method name.
      * @param opts.path Path to the endpoint.
      * to this endpoint.
      */
    def addAppServicePath(opts: Authenticate): Unit = js.native
    
    def appService: AppService = js.native
    
    /* private */ var appServiceBot: Any = js.native
    
    /* private */ var appservice: Any = js.native
    
    /* private */ var botIntent: Any = js.native
    
    /* private */ var botSdkAS: Any = js.native
    
    def botUserId: String = js.native
    
    /**
      * Determines whether a room should be provisoned based on
      * user provided rules and the room state. Will default to true
      * if no rules have been provided.
      * @param roomId The room to check.
      * @param cache Should the validator check its cache.
      * @returns resolves if can and rejects if it cannot.
      *          A status code is returned on both.
      */
    def canProvisionRoom(roomId: String): js.Promise[RoomLinkValidatorStatus] = js.native
    def canProvisionRoom(roomId: String, cache: Boolean): js.Promise[RoomLinkValidatorStatus] = js.native
    
    def checkHomeserverSupport(): js.Promise[Unit] = js.native
    
    /**
      * Close the appservice HTTP listener, and clear all timeouts.
      * @returns Resolves when the appservice HTTP listener has stopped
      */
    def close(): js.Promise[Unit] = js.native
    
    /* private */ var customiseAppserviceThirdPartyLookup: Any = js.native
    
    /* private */ var eeEventBroker: Any = js.native
    
    /* private */ var eventStore: Any = js.native
    
    /**
      * Find a member for a given room. This method will fetch the joined members
      * from the homeserver if the cache doesn't have it stored.
      * @param preferBot Should we prefer the bot user over a ghost user
      * @returns The userID of the member.
      */
    def getAnyASMemberInRoom(roomId: String): js.Promise[String | Null] = js.native
    def getAnyASMemberInRoom(roomId: String, preferBot: Boolean): js.Promise[String | Null] = js.native
    
    /**
      * Get the AS bot instance.
      */
    def getBot(): AppServiceBot = js.native
    
    /* private */ var getBridgeContext: Any = js.native
    
    /**
      * Retrieve the connected event store instance, if one was configured.
      */
    def getEventStore(): js.UndefOr[EventBridgeStore] = js.native
    
    /**
      * Retrieve an Intent instance for the specified user ID. If no ID is given, an
      * instance for the bot itself is returned.
      * @param userId Optional. The user ID to get an Intent for.
      * @param request Optional. The request instance to tie the MatrixClient
      * instance to. Useful for logging contextual request IDs.
      * @return The intent instance
      */
    def getIntent(): Intent | EncryptedIntent = js.native
    def getIntent(userId: String): Intent | EncryptedIntent = js.native
    def getIntent(userId: String, request: Request[Any]): Intent | EncryptedIntent = js.native
    def getIntent(userId: Unit, request: Request[Any]): Intent | EncryptedIntent = js.native
    
    /**
      * Retrieve an Intent instance for the specified user ID localpart. This <i>must
      * be the complete user localpart</i>.
      * @param localpart The user ID localpart to get an Intent for.
      * @param request Optional. The request instance to tie the MatrixClient
      * instance to. Useful for logging contextual request IDs.
      * @return The intent instance
      */
    def getIntentFromLocalpart(localpart: String): Intent = js.native
    def getIntentFromLocalpart(localpart: String, request: Request[Any]): Intent = js.native
    
    /* private */ var getPowerLevelEntry: Any = js.native
    
    /**
      * Returns a PrometheusMetrics instance stored on the bridge, creating it first
      * if required. The instance will be registered with the HTTP server so it can
      * serve the "/metrics" page in the usual way.
      * The instance will automatically register the Matrix SDK metrics by calling
      * {PrometheusMetrics~registerMatrixSdkMetrics}.
      *
      * Ensure that `PackageInfo.getBridgeVersion` is returns the correct version before calling this,
      * as changes to the bridge version after metric instantiation will not be detected.
      *
      * @param {boolean} registerEndpoint Register the /metrics endpoint on the appservice HTTP server. Defaults to true.
      *                                   Note: `listen()` must have been called if this is true or this will throw.
      * @param {Registry?} registry Optionally provide an alternative registry for metrics.
      */
    def getPrometheusMetrics(): PrometheusMetrics = js.native
    def getPrometheusMetrics(registerEndpoint: Boolean): PrometheusMetrics = js.native
    def getPrometheusMetrics(registerEndpoint: Boolean, registry: Registry): PrometheusMetrics = js.native
    def getPrometheusMetrics(registerEndpoint: Unit, registry: Registry): PrometheusMetrics = js.native
    
    /**
      * Retrieve the request factory used to create incoming requests.
      */
    def getRequestFactory(): RequestFactory = js.native
    
    def getRoomLinkValidator(): js.UndefOr[RoomLinkValidator] = js.native
    
    /**
      * Retrieve the connected room store instance, if one was configured.
      */
    def getRoomStore(): js.UndefOr[RoomBridgeStore] = js.native
    
    /**
      * Retrieve the connected user activity store instance.
      */
    def getUserActivityStore(): js.UndefOr[UserActivityStore] = js.native
    
    /**
      * Returns a regex matching all users of the bridge.
      * @return Super regex composed of all user regexes.
      */
    /* private */ var getUserRegex: Any = js.native
    
    /**
      * Retrieve the connected user store instance, if one was configured.
      */
    def getUserStore(): js.UndefOr[UserBridgeStore] = js.native
    
    /* private */ var handleEventError: Any = js.native
    
    /**
      * Load registration, databases and initalise bridge components.
      *
      * **This must be called before `listen()`**
      */
    def initalise(): js.Promise[Unit] = js.native
    
    /* private */ var intentBackingStore: Any = js.native
    
    /* private */ var intentLastAccessedTimeout: Any = js.native
    
    /* private */ var intents: Any = js.native
    
    /* private */ var internalActivityTracker: Any = js.native
    
    /**
      * Restricts the promise according to the bridges `perRequest` setting.
      *
      * `perRequest` enabled:
      *     Returns a promise similar to `promise`, with the addition of it only
      *     resolving after `request`.
      * `perRequest` disabled:
      *     Returns the promise unchanged.
      */
    /* private */ var limited: Any = js.native
    
    /**
      * Setup a HTTP listener to handle appservice traffic.
      * ** This must be called after .initalise() **
      * @param port The port to listen on.
      * @param appServiceInstance The AppService instance to attach to.
      * If not provided, one will be created.
      * @param hostname Optional hostname to bind to.
      */
    def listen(port: Double): js.Promise[Unit] = js.native
    def listen(port: Double, hostname: String): js.Promise[Unit] = js.native
    def listen(port: Double, hostname: String, backlog: Double): js.Promise[Unit] = js.native
    def listen(port: Double, hostname: String, backlog: Double, appServiceInstance: AppService): js.Promise[Unit] = js.native
    def listen(port: Double, hostname: String, backlog: Unit, appServiceInstance: AppService): js.Promise[Unit] = js.native
    def listen(port: Double, hostname: Unit, backlog: Double): js.Promise[Unit] = js.native
    def listen(port: Double, hostname: Unit, backlog: Double, appServiceInstance: AppService): js.Promise[Unit] = js.native
    def listen(port: Double, hostname: Unit, backlog: Unit, appServiceInstance: AppService): js.Promise[Unit] = js.native
    
    /**
      * Load the user and room databases. Access them via getUserStore() and getRoomStore().
      */
    def loadDatabases(): js.Promise[Unit] = js.native
    
    /* private */ var membershipCache: Any = js.native
    
    /* private */ var metrics: Any = js.native
    
    /* private */ var onAliasQuery: Any = js.native
    
    /* private */ var onConsume: Any = js.native
    
    /* private */ var onEphemeralActivity: Any = js.native
    
    /* private */ var onEphemeralEvent: Any = js.native
    
    /* private */ var onEvent: Any = js.native
    
    /* private */ var onIntentCreate: Any = js.native
    
    /* private */ val onLog: Any = js.native
    
    /* private */ var onUserQuery: Any = js.native
    
    val opts: VettedBridgeOpts = js.native
    
    /**
      * Check the homeserver -> appservice connection by
      * sending a ping event.
      * @param roomId The room to use as a ping check.
      * @param timeoutMs How long to wait for the ping attempt. Defaults to 60s.
      * @throws This will throw if another ping attempt is made, or if the request times out.
      * @returns The delay in milliseconds
      */
    def pingAppserviceRoute(roomId: String): js.Promise[Double] = js.native
    def pingAppserviceRoute(roomId: String, timeoutMs: Double): js.Promise[Double] = js.native
    
    /* private */ var powerlevelMap: Any = js.native
    
    /* private */ var prevRequestPromise: Any = js.native
    
    /**
      * Provision a user on the homeserver.
      * @param matrixUser The virtual user to be provisioned.
      * @param provisionedUser Provisioning information.
      * @return Resolved when provisioned.
      */
    def provisionUser(matrixUser: MatrixUser): js.Promise[Unit] = js.native
    def provisionUser(matrixUser: MatrixUser, provisionedUser: Name): js.Promise[Unit] = js.native
    
    /* private */ var queue: Any = js.native
    
    /**
      * A convenient shortcut to calling registerBridgeGauges() on the
      * PrometheusMetrics instance directly. This version will supply the value of
      * the matrixGhosts field if the counter function did not return it, for
      * convenience.
      * @param {PrometheusMetrics~BridgeGaugesCallback} counterFunc A function that
      * when invoked returns the current counts of various items in the bridge.
      *
      * @example
      * bridge.registerBridgeGauges(() => {
      *     return {
      *         matrixRoomConfigs: Object.keys(this.matrixRooms).length,
      *         remoteRoomConfigs: Object.keys(this.remoteRooms).length,
      *
      *         remoteGhosts: Object.keys(this.remoteGhosts).length,
      *
      *         ...
      *     }
      * })
      */
    def registerBridgeGauges(counterFunc: js.Function0[js.Promise[BridgeGaugesCounts] | BridgeGaugesCounts]): Unit = js.native
    
    /* private */ var registration: Any = js.native
    
    /**
      * Check a express Request to see if it's correctly
      * authenticated (includes the hsToken). The query parameter `access_token`
      * and the `Authorization` header are checked.
      * @returns {Boolean} True if authenticated, False if not.
      */
    def requestCheckToken(
      req: Request_[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.ParamsDictionary */ Any, 
          Any, 
          Any, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.Query */ Any, 
          Record[String, Any]
        ]
    ): Boolean = js.native
    
    /* private */ var requestFactory: Any = js.native
    
    /* private */ var roomLinkValidator: Any = js.native
    
    /* private */ var roomStore: Any = js.native
    
    /* private */ var roomUpgradeHandler: Any = js.native
    
    /**
      * Run the bridge (start listening). This calls `initalise()` and `listen()`.
      * @param port The port to listen on.
      * @param appServiceInstance The AppService instance to attach to.
      * If not provided, one will be created.
      * @param hostname Optional hostname to bind to.
      * @return A promise resolving when the bridge is ready.
      */
    def run(port: Double): js.Promise[Unit] = js.native
    def run(port: Double, appServiceInstance: Unit, hostname: String): js.Promise[Unit] = js.native
    def run(port: Double, appServiceInstance: Unit, hostname: String, backlog: Double): js.Promise[Unit] = js.native
    def run(port: Double, appServiceInstance: Unit, hostname: Unit, backlog: Double): js.Promise[Unit] = js.native
    def run(port: Double, appServiceInstance: AppService): js.Promise[Unit] = js.native
    def run(port: Double, appServiceInstance: AppService, hostname: String): js.Promise[Unit] = js.native
    def run(port: Double, appServiceInstance: AppService, hostname: String, backlog: Double): js.Promise[Unit] = js.native
    def run(port: Double, appServiceInstance: AppService, hostname: Unit, backlog: Double): js.Promise[Unit] = js.native
    
    /* private */ var selfPingDeferred: Any = js.native
    
    /* private */ var setPowerLevelEntry: Any = js.native
    
    /* private */ var setupIntentCulling: Any = js.native
    
    /* private */ var updateIntents: Any = js.native
    
    def updateRoomLinkValidatorRules(rules: Rules): Unit = js.native
    
    /* private */ var userActivityStore: Any = js.native
    
    /* private */ var userStore: Any = js.native
    
    /* private */ var validateEditEvent: Any = js.native
  }
  
  @js.native
  trait BridgeController extends StObject {
    
    /**
      * The bridge will invoke this function when a room has been created
      * via onAliasQuery.
      */
    var onAliasQueried: js.UndefOr[js.Function2[/* alias */ String, /* roomId */ String, PossiblePromise[Unit]]] = js.native
    
    /**
      * The bridge will invoke this function when queried via onAliasQuery. If
      * not supplied, no rooms will be provisioned on alias queries. Provisioned rooms
      * will automatically be stored in the associated `roomStore`. */
    var onAliasQuery: js.UndefOr[
        js.Function2[
          /* alias */ String, 
          /* aliasLocalpart */ String, 
          PossiblePromise[CreationOpts | Null | Unit]
        ]
      ] = js.native
    
    /**
      * The bridge will invoke this when a typing, read reciept or presence event
      * is received from the HS. **This will only work with the `bridgeEncryption`
      * configuration set.**
      */
    var onEphemeralEvent: js.UndefOr[
        js.Function1[/* request */ Request[TypingEvent | ReadReceiptEvent | PresenceEvent], Unit]
      ] = js.native
    
    /**
      * The bridge will invoke when an event has been received from the HS.
      */
    def onEvent(request: Request[WeakEvent]): Unit = js.native
    def onEvent(request: Request[WeakEvent], context: BridgeContext): Unit = js.native
    
    /**
      * Invoked when logging. Defaults to a function which logs to the console.
      * */
    var onLog: js.UndefOr[js.Function2[/* text */ String, /* isError */ Boolean, Unit]] = js.native
    
    /**
      * The bridge will invoke this function when queried via onUserQuery. If
      * not supplied, no users will be provisioned on user queries. Provisioned users
      * will automatically be stored in the associated `userStore`.
      */
    var onUserQuery: js.UndefOr[js.Function1[/* matrixUser */ MatrixUser, PossiblePromise[Name | Null | Unit]]] = js.native
    
    /**
      * If supplied, the bridge will respond to third-party entity lookups using the
      * contained helper functions.
      */
    var thirdPartyLookup: js.UndefOr[GetLocation] = js.native
    
    var userActivityTracker: js.UndefOr[UserActivityTracker] = js.native
  }
  
  trait BridgeOpts extends StObject {
    
    var bridgeEncryption: js.UndefOr[HomeserverUrl] = js.undefined
    
    /**
      * The controller logic for the bridge.
      */
    var controller: BridgeController
    
    /**
      * `true` to disable {@link BridgeContext}
      * parameters in {@link Bridge.onEvent}. Disabling the context makes the
      * bridge do fewer database lookups, but prevents there from being a
      * `context` parameter.
      *
      * Default: `false`.
      */
    var disableContext: js.UndefOr[Boolean] = js.undefined
    
    /**
      * True to disable enabling of stores.
      * This should be used by bridges that use their own database instances and
      * do not need any of the included store objects. This implies setting
      * disableContext to True. Default: false.
      */
    var disableStores: js.UndefOr[Boolean] = js.undefined
    
    /**
      * The domain part for user_ids and room aliases e.g. "bar" in "@foo:bar".
      */
    var domain: String
    
    /**
      * Escape userIds for non-bot intents with
      * {@link MatrixUser~escapeUserId}
      * Default: true
      */
    var escapeUserIds: js.UndefOr[Boolean] = js.undefined
    
    /**
      * The event store instance to use, or the path to the user .db file to load.
      * A database will NOT be created if this is not specified. If `disableStores` is set,
      * no database will be created or used.
      */
    var eventStore: js.UndefOr[EventBridgeStore | String] = js.undefined
    
    var eventValidation: js.UndefOr[ValidateEditSender] = js.undefined
    
    /**
      * The base HS url
      */
    var homeserverUrl: String
    
    /**
      * Options to supply to created Intent instances.
      */
    var intentOptions: js.UndefOr[Bot] = js.undefined
    
    /**
      * True to enable SUCCESS/FAILED log lines to be sent to onLog. Default: true.
      */
    var logRequestOutcome: js.UndefOr[Boolean] = js.undefined
    
    /**
      * The membership cache instance
      * to use, which can be manually created by a bridge for greater control over
      * caching. By default a membership cache will be created internally.
      */
    var membershipCache: js.UndefOr[MembershipCache] = js.undefined
    
    /**
      * A human readable string that will be used when the bridge signals errors
      * to the client. Will not include in error events if ommited.
      */
    var networkName: js.UndefOr[String] = js.undefined
    
    /**
      * The factory function used to create intents.
      */
    var onIntentCreate: js.UndefOr[js.Function1[/* userId */ String, Intent]] = js.undefined
    
    /**
      * Options for the `onEvent` queue. When the bridge
      * receives an incoming transaction, it needs to asyncly query the data store for
      * contextual info before calling onEvent. A queue is used to keep the onEvent
      * calls consistent with the arrival order from the incoming transactions.
      */
    var queue: js.UndefOr[PerRequest] = js.undefined
    
    /**
      * Application service registration object or path to the registration file.
      */
    var registration: AppServiceRegistration | String
    
    var roomLinkValidation: js.UndefOr[typings.matrixAppserviceBridge.anon.Rules] = js.undefined
    
    /**
      * The room store instance to use, or the path to the room .db file to load.
      * A database will be created if this is not specified. If `disableStores` is set,
      * no database will be created or used.
      */
    var roomStore: js.UndefOr[RoomBridgeStore | String] = js.undefined
    
    var roomUpgradeOpts: js.UndefOr[RoomUpgradeHandlerOpts] = js.undefined
    
    /**
      * True to stop receiving onEvent callbacks
      * for events which were sent by a bridge user. Default: true.
      */
    var suppressEcho: js.UndefOr[Boolean] = js.undefined
    
    var trackUserActivity: js.UndefOr[ActivityTrackerOpts] = js.undefined
    
    /**
      * The user activity store instance to use, or the path to the user .db file to load.
      * A database will be created if this is not specified. If `disableStores` is set,
      * no database will be created or used.
      */
    var userActivityStore: js.UndefOr[UserActivityStore | String] = js.undefined
    
    /**
      * The user store instance to use, or the path to the user .db file to load.
      * A database will be created if this is not specified. If `disableStores` is set,
      * no database will be created or used.
      */
    var userStore: js.UndefOr[UserBridgeStore | String] = js.undefined
  }
  object BridgeOpts {
    
    inline def apply(
      controller: BridgeController,
      domain: String,
      homeserverUrl: String,
      registration: AppServiceRegistration | String
    ): BridgeOpts = {
      val __obj = js.Dynamic.literal(controller = controller.asInstanceOf[js.Any], domain = domain.asInstanceOf[js.Any], homeserverUrl = homeserverUrl.asInstanceOf[js.Any], registration = registration.asInstanceOf[js.Any])
      __obj.asInstanceOf[BridgeOpts]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: BridgeOpts] (val x: Self) extends AnyVal {
      
      inline def setBridgeEncryption(value: HomeserverUrl): Self = StObject.set(x, "bridgeEncryption", value.asInstanceOf[js.Any])
      
      inline def setBridgeEncryptionUndefined: Self = StObject.set(x, "bridgeEncryption", js.undefined)
      
      inline def setController(value: BridgeController): Self = StObject.set(x, "controller", value.asInstanceOf[js.Any])
      
      inline def setDisableContext(value: Boolean): Self = StObject.set(x, "disableContext", value.asInstanceOf[js.Any])
      
      inline def setDisableContextUndefined: Self = StObject.set(x, "disableContext", js.undefined)
      
      inline def setDisableStores(value: Boolean): Self = StObject.set(x, "disableStores", value.asInstanceOf[js.Any])
      
      inline def setDisableStoresUndefined: Self = StObject.set(x, "disableStores", js.undefined)
      
      inline def setDomain(value: String): Self = StObject.set(x, "domain", value.asInstanceOf[js.Any])
      
      inline def setEscapeUserIds(value: Boolean): Self = StObject.set(x, "escapeUserIds", value.asInstanceOf[js.Any])
      
      inline def setEscapeUserIdsUndefined: Self = StObject.set(x, "escapeUserIds", js.undefined)
      
      inline def setEventStore(value: EventBridgeStore | String): Self = StObject.set(x, "eventStore", value.asInstanceOf[js.Any])
      
      inline def setEventStoreUndefined: Self = StObject.set(x, "eventStore", js.undefined)
      
      inline def setEventValidation(value: ValidateEditSender): Self = StObject.set(x, "eventValidation", value.asInstanceOf[js.Any])
      
      inline def setEventValidationUndefined: Self = StObject.set(x, "eventValidation", js.undefined)
      
      inline def setHomeserverUrl(value: String): Self = StObject.set(x, "homeserverUrl", value.asInstanceOf[js.Any])
      
      inline def setIntentOptions(value: Bot): Self = StObject.set(x, "intentOptions", value.asInstanceOf[js.Any])
      
      inline def setIntentOptionsUndefined: Self = StObject.set(x, "intentOptions", js.undefined)
      
      inline def setLogRequestOutcome(value: Boolean): Self = StObject.set(x, "logRequestOutcome", value.asInstanceOf[js.Any])
      
      inline def setLogRequestOutcomeUndefined: Self = StObject.set(x, "logRequestOutcome", js.undefined)
      
      inline def setMembershipCache(value: MembershipCache): Self = StObject.set(x, "membershipCache", value.asInstanceOf[js.Any])
      
      inline def setMembershipCacheUndefined: Self = StObject.set(x, "membershipCache", js.undefined)
      
      inline def setNetworkName(value: String): Self = StObject.set(x, "networkName", value.asInstanceOf[js.Any])
      
      inline def setNetworkNameUndefined: Self = StObject.set(x, "networkName", js.undefined)
      
      inline def setOnIntentCreate(value: /* userId */ String => Intent): Self = StObject.set(x, "onIntentCreate", js.Any.fromFunction1(value))
      
      inline def setOnIntentCreateUndefined: Self = StObject.set(x, "onIntentCreate", js.undefined)
      
      inline def setQueue(value: PerRequest): Self = StObject.set(x, "queue", value.asInstanceOf[js.Any])
      
      inline def setQueueUndefined: Self = StObject.set(x, "queue", js.undefined)
      
      inline def setRegistration(value: AppServiceRegistration | String): Self = StObject.set(x, "registration", value.asInstanceOf[js.Any])
      
      inline def setRoomLinkValidation(value: typings.matrixAppserviceBridge.anon.Rules): Self = StObject.set(x, "roomLinkValidation", value.asInstanceOf[js.Any])
      
      inline def setRoomLinkValidationUndefined: Self = StObject.set(x, "roomLinkValidation", js.undefined)
      
      inline def setRoomStore(value: RoomBridgeStore | String): Self = StObject.set(x, "roomStore", value.asInstanceOf[js.Any])
      
      inline def setRoomStoreUndefined: Self = StObject.set(x, "roomStore", js.undefined)
      
      inline def setRoomUpgradeOpts(value: RoomUpgradeHandlerOpts): Self = StObject.set(x, "roomUpgradeOpts", value.asInstanceOf[js.Any])
      
      inline def setRoomUpgradeOptsUndefined: Self = StObject.set(x, "roomUpgradeOpts", js.undefined)
      
      inline def setSuppressEcho(value: Boolean): Self = StObject.set(x, "suppressEcho", value.asInstanceOf[js.Any])
      
      inline def setSuppressEchoUndefined: Self = StObject.set(x, "suppressEcho", js.undefined)
      
      inline def setTrackUserActivity(value: ActivityTrackerOpts): Self = StObject.set(x, "trackUserActivity", value.asInstanceOf[js.Any])
      
      inline def setTrackUserActivityUndefined: Self = StObject.set(x, "trackUserActivity", js.undefined)
      
      inline def setUserActivityStore(value: UserActivityStore | String): Self = StObject.set(x, "userActivityStore", value.asInstanceOf[js.Any])
      
      inline def setUserActivityStoreUndefined: Self = StObject.set(x, "userActivityStore", js.undefined)
      
      inline def setUserStore(value: UserBridgeStore | String): Self = StObject.set(x, "userStore", value.asInstanceOf[js.Any])
      
      inline def setUserStoreUndefined: Self = StObject.set(x, "userStore", js.undefined)
    }
  }
  
  type PossiblePromise[T] = T | js.Promise[T]
  
  @js.native
  trait VettedBridgeOpts extends StObject {
    
    var bridgeEncryption: js.UndefOr[HomeserverUrl] = js.native
    
    /**
      * The controller logic for the bridge.
      */
    var controller: BridgeController = js.native
    
    /**
      * `true` to disable {@link BridgeContext}
      * parameters in {@link Bridge.onEvent}. Disabling the context makes the
      * bridge do fewer database lookups, but prevents there from being a
      * `context` parameter.
      *
      * Default: `false`.
      */
    var disableContext: Boolean = js.native
    
    /**
      * True to disable enabling of stores.
      * This should be used by bridges that use their own database instances and
      * do not need any of the included store objects. This implies setting
      * disableContext to True. Default: false.
      */
    var disableStores: Boolean = js.native
    
    /**
      * The domain part for user_ids and room aliases e.g. "bar" in "@foo:bar".
      */
    var domain: String = js.native
    
    /**
      * Escape userIds for non-bot intents with
      * {@link MatrixUser~escapeUserId}
      * Default: true
      */
    var escapeUserIds: js.UndefOr[Boolean] = js.native
    
    /**
      * The event store instance to use, or the path to the user .db file to load.
      * A database will NOT be created if this is not specified. If `disableStores` is set,
      * no database will be created or used.
      */
    var eventStore: js.UndefOr[EventBridgeStore | String] = js.native
    
    var eventValidation: js.UndefOr[ValidateEditSender] = js.native
    
    /**
      * The base HS url
      */
    var homeserverUrl: String = js.native
    
    /**
      * Options to supply to created Intent instances.
      */
    var intentOptions: Bot = js.native
    
    /**
      * True to enable SUCCESS/FAILED log lines to be sent to onLog. Default: true.
      */
    var logRequestOutcome: Boolean = js.native
    
    /**
      * A human readable string that will be used when the bridge signals errors
      * to the client. Will not include in error events if ommited.
      */
    var networkName: js.UndefOr[String] = js.native
    
    /**
      * The factory function used to create intents. If encryptionOpts is specified, this should create an
      * EncryptedIntent instead.
      */
    def onIntentCreate(userId: String, opts: IntentOpts): Intent | EncryptedIntent = js.native
    def onIntentCreate(userId: String, opts: IntentOpts, encryptionOpts: EncryptedIntentOpts): Intent | EncryptedIntent = js.native
    
    /**
      * Options for the `onEvent` queue. When the bridge
      * receives an incoming transaction, it needs to asyncly query the data store for
      * contextual info before calling onEvent. A queue is used to keep the onEvent
      * calls consistent with the arrival order from the incoming transactions.
      */
    var queue: Type = js.native
    
    /**
      * Application service registration object or path to the registration file.
      */
    var registration: AppServiceRegistration | String = js.native
    
    var roomLinkValidation: js.UndefOr[typings.matrixAppserviceBridge.anon.Rules] = js.native
    
    /**
      * The room store instance to use, or the path to the room .db file to load.
      * A database will be created if this is not specified. If `disableStores` is set,
      * no database will be created or used.
      */
    var roomStore: RoomBridgeStore | String = js.native
    
    var roomUpgradeOpts: js.UndefOr[RoomUpgradeHandlerOpts] = js.native
    
    /**
      * True to stop receiving onEvent callbacks
      * for events which were sent by a bridge user. Default: true.
      */
    var suppressEcho: Boolean = js.native
    
    /**
      * The user activity store instance to use, or the path to the user .db file to load.
      * A database will be created if this is not specified. If `disableStores` is set,
      * no database will be created or used.
      */
    var userActivityStore: UserActivityStore | String = js.native
    
    var userActivityTracking: js.UndefOr[ActivityTrackerOpts] = js.native
    
    /**
      * The user store instance to use, or the path to the user .db file to load.
      * A database will be created if this is not specified. If `disableStores` is set,
      * no database will be created or used.
      */
    var userStore: UserBridgeStore | String = js.native
  }
}
