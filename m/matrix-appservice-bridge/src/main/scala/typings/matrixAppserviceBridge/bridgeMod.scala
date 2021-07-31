package typings.matrixAppserviceBridge

import typings.express.mod.Request_
import typings.expressServeStaticCore.mod.ParamsDictionary
import typings.expressServeStaticCore.mod.Query
import typings.matrixAppservice.mod.AppService
import typings.matrixAppservice.mod.AppServiceRegistration
import typings.matrixAppserviceBridge.anon.Bot
import typings.matrixAppserviceBridge.anon.CheckToken
import typings.matrixAppserviceBridge.anon.CreationOpts
import typings.matrixAppserviceBridge.anon.GetLocation
import typings.matrixAppserviceBridge.anon.HomeserverUrl
import typings.matrixAppserviceBridge.anon.Name
import typings.matrixAppserviceBridge.anon.PerRequest
import typings.matrixAppserviceBridge.anon.RuleFile
import typings.matrixAppserviceBridge.anon.Type
import typings.matrixAppserviceBridge.appServiceBotMod.AppServiceBot
import typings.matrixAppserviceBridge.bridgeContextMod.BridgeContext
import typings.matrixAppserviceBridge.clientFactoryMod.ClientFactory
import typings.matrixAppserviceBridge.eventBridgeStoreMod.EventBridgeStore
import typings.matrixAppserviceBridge.eventTypesMod.PresenceEvent
import typings.matrixAppserviceBridge.eventTypesMod.ReadReceiptEvent
import typings.matrixAppserviceBridge.eventTypesMod.TypingEvent
import typings.matrixAppserviceBridge.eventTypesMod.WeakEvent
import typings.matrixAppserviceBridge.intentMod.Intent
import typings.matrixAppserviceBridge.membershipCacheMod.MembershipCache
import typings.matrixAppserviceBridge.prometheusmetricsMod.BridgeGaugesCounts
import typings.matrixAppserviceBridge.prometheusmetricsMod.PrometheusMetrics
import typings.matrixAppserviceBridge.requestFactoryMod.RequestFactory
import typings.matrixAppserviceBridge.requestMod.Request
import typings.matrixAppserviceBridge.roomBridgeStoreMod.RoomBridgeStore
import typings.matrixAppserviceBridge.roomLinkValidatorMod.RoomLinkValidator
import typings.matrixAppserviceBridge.roomLinkValidatorMod.RoomLinkValidatorStatus
import typings.matrixAppserviceBridge.roomUpgradeHandlerMod.RoomUpgradeHandlerOpts
import typings.matrixAppserviceBridge.userBridgeStoreMod.UserBridgeStore
import typings.matrixAppserviceBridge.usersMatrixMod.MatrixUser
import typings.promClient.mod.Registry
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object bridgeMod {
  
  @JSImport("matrix-appservice-bridge/lib/bridge", "BRIDGE_PING_EVENT_TYPE")
  @js.native
  val BRIDGE_PING_EVENT_TYPE: /* "org.matrix.bridge.ping" */ String = js.native
  
  @JSImport("matrix-appservice-bridge/lib/bridge", "BRIDGE_PING_TIMEOUT_MS")
  @js.native
  val BRIDGE_PING_TIMEOUT_MS: /* 60000 */ Double = js.native
  
  @JSImport("matrix-appservice-bridge/lib/bridge", "Bridge")
  @js.native
  class Bridge protected () extends StObject {
    /**
      * @param opts Options to pass to the bridge
      * @param opts.roomUpgradeOpts Options to supply to
      * the room upgrade handler. If not defined then upgrades are NOT handled by the bridge.
      */
    def this(opts: BridgeOpts) = this()
    
    /**
      * Install a custom handler for an incoming HTTP API request. This allows
      * callers to add extra functionality, implement new APIs, etc...
      * @param opts Named options
      * @param opts.method The HTTP method name.
      * @param opts.path Path to the endpoint.
      * @param opts.checkToken Should the token be automatically checked. Defaults to true.
      * @param opts.handler Function to handle requests
      * to this endpoint.
      */
    def addAppServicePath(opts: CheckToken): Unit = js.native
    
    def appService: js.UndefOr[AppService] = js.native
    
    var appServiceBot: js.Any = js.native
    
    var appservice: js.Any = js.native
    
    var botClient: js.Any = js.native
    
    var botIntent: js.Any = js.native
    
    def botUserId: String = js.native
    
    /**
      * Determines whether a room should be provisoned based on
      * user provided rules and the room state. Will default to true
      * if no rules have been provided.
      * @param roomId The room to check.
      * @param cache Should the validator check it's cache.
      * @returns resolves if can and rejects if it cannot.
      *          A status code is returned on both.
      */
    def canProvisionRoom(roomId: String): js.Promise[RoomLinkValidatorStatus] = js.native
    def canProvisionRoom(roomId: String, cache: Boolean): js.Promise[RoomLinkValidatorStatus] = js.native
    
    def checkHomeserverSupport(): js.Promise[Unit] = js.native
    
    var clientFactory: js.Any = js.native
    
    /**
      * Close the appservice HTTP listener, and clear all timeouts.
      * @returns Resolves when the appservice HTTP listener has stopped
      */
    def close(): js.Promise[Unit] = js.native
    
    /**
      * Apply any customisations required on the appService object.
      */
    var customiseAppservice: js.Any = js.native
    
    var customiseAppserviceThirdPartyLookup: js.Any = js.native
    
    var eeEventBroker: js.Any = js.native
    
    var eventStore: js.Any = js.native
    
    /**
      * Get the AS bot instance.
      */
    def getBot(): AppServiceBot = js.native
    
    var getBridgeContext: js.Any = js.native
    
    /**
      * Retrieve the matrix client factory used when sending matrix requests.
      */
    def getClientFactory(): ClientFactory = js.native
    
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
    def getIntent(): Intent = js.native
    def getIntent(userId: String): Intent = js.native
    def getIntent(userId: String, request: Request[js.Any]): Intent = js.native
    def getIntent(userId: Unit, request: Request[js.Any]): Intent = js.native
    
    /**
      * Retrieve an Intent instance for the specified user ID localpart. This <i>must
      * be the complete user localpart</i>.
      * @param localpart The user ID localpart to get an Intent for.
      * @param request Optional. The request instance to tie the MatrixClient
      * instance to. Useful for logging contextual request IDs.
      * @return The intent instance
      */
    def getIntentFromLocalpart(localpart: String): Intent = js.native
    def getIntentFromLocalpart(localpart: String, request: Request[js.Any]): Intent = js.native
    
    var getPowerLevelEntry: js.Any = js.native
    
    /**
      * Returns a PrometheusMetrics instance stored on the bridge, creating it first
      * if required. The instance will be registered with the HTTP server so it can
      * serve the "/metrics" page in the usual way.
      * The instance will automatically register the Matrix SDK metrics by calling
      * {PrometheusMetrics~registerMatrixSdkMetrics}.
      * @param {boolean} registerEndpoint Register the /metrics endpoint on the appservice HTTP server. Defaults to true.
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
      * Retrieve the connected room store instance.
      */
    def getRoomStore(): js.UndefOr[RoomBridgeStore] = js.native
    
    /**
      * Returns a regex matching all users of the bridge.
      * @return Super regex composed of all user regexes.
      */
    var getUserRegex: js.Any = js.native
    
    /**
      * Retrieve the connected user store instance.
      */
    def getUserStore(): js.UndefOr[UserBridgeStore] = js.native
    
    var handleEventError: js.Any = js.native
    
    var intentBackingStore: js.Any = js.native
    
    var intentLastAccessedTimeout: js.Any = js.native
    
    var intents: js.Any = js.native
    
    /**
      * Restricts the promise according to the bridges `perRequest` setting.
      *
      * `perRequest` enabled:
      *     Returns a promise similar to `promise`, with the addition of it only
      *     resolving after `request`.
      * `perRequest` disabled:
      *     Returns the promise unchanged.
      */
    var limited: js.Any = js.native
    
    /**
      * Load the user and room databases. Access them via getUserStore() and getRoomStore().
      */
    def loadDatabases(): js.Promise[Unit] = js.native
    
    var membershipCache: js.Any = js.native
    
    var metrics: js.Any = js.native
    
    var onAliasQuery: js.Any = js.native
    
    var onConsume: js.Any = js.native
    
    var onEphemeralEvent: js.Any = js.native
    
    var onEvent: js.Any = js.native
    
    val onLog: js.Any = js.native
    
    var onUserQuery: js.Any = js.native
    
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
    
    var powerlevelMap: js.Any = js.native
    
    var prevRequestPromise: js.Any = js.native
    
    /**
      * Provision a user on the homeserver.
      * @param matrixUser The virtual user to be provisioned.
      * @param provisionedUser Provisioning information.
      * @return Resolved when provisioned.
      */
    def provisionUser(matrixUser: MatrixUser): js.Promise[Unit] = js.native
    def provisionUser(matrixUser: MatrixUser, provisionedUser: Name): js.Promise[Unit] = js.native
    
    var queue: js.Any = js.native
    
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
    def registerBridgeGauges(counterFunc: js.Function0[BridgeGaugesCounts]): Unit = js.native
    
    var registration: js.Any = js.native
    
    /**
      * Check a express Request to see if it's correctly
      * authenticated (includes the hsToken). The query parameter `access_token`
      * and the `Authorization` header are checked.
      * @returns {Boolean} True if authenticated, False if not.
      */
    def requestCheckToken(req: Request_[ParamsDictionary, js.Any, js.Any, Query]): Boolean = js.native
    
    var requestFactory: js.Any = js.native
    
    var roomLinkValidator: js.Any = js.native
    
    var roomStore: js.Any = js.native
    
    var roomUpgradeHandler: js.Any = js.native
    
    /**
      * Run the bridge (start listening)
      * @param port The port to listen on.
      * @param config Configuration options
      * @param appServiceInstance The AppService instance to attach to.
      * If not provided, one will be created.
      * @param hostname Optional hostname to bind to. (e.g. 0.0.0.0)
      * @return A promise resolving when the bridge is ready
      */
    def run[T](port: Double, config: T): js.Promise[Unit] = js.native
    def run[T](port: Double, config: T, appServiceInstance: Unit, hostname: String): js.Promise[Unit] = js.native
    def run[T](port: Double, config: T, appServiceInstance: Unit, hostname: String, backlog: Double): js.Promise[Unit] = js.native
    def run[T](port: Double, config: T, appServiceInstance: Unit, hostname: Unit, backlog: Double): js.Promise[Unit] = js.native
    def run[T](port: Double, config: T, appServiceInstance: AppService): js.Promise[Unit] = js.native
    def run[T](port: Double, config: T, appServiceInstance: AppService, hostname: String): js.Promise[Unit] = js.native
    def run[T](port: Double, config: T, appServiceInstance: AppService, hostname: String, backlog: Double): js.Promise[Unit] = js.native
    def run[T](port: Double, config: T, appServiceInstance: AppService, hostname: Unit, backlog: Double): js.Promise[Unit] = js.native
    
    var selfPingDeferred: js.Any = js.native
    
    var setPowerLevelEntry: js.Any = js.native
    
    var setupIntentCulling: js.Any = js.native
    
    var updateIntents: js.Any = js.native
    
    var userStore: js.Any = js.native
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
  }
  
  trait BridgeOpts extends StObject {
    
    var authenticateThirdpartyEndpoints: js.UndefOr[Boolean] = js.undefined
    
    var bridgeEncryption: js.UndefOr[HomeserverUrl] = js.undefined
    
    /**
      * The client factory instance to use. If not supplied, one will be created.
      */
    var clientFactory: js.UndefOr[ClientFactory] = js.undefined
    
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
    
    var roomLinkValidation: js.UndefOr[RuleFile] = js.undefined
    
    /**
      * The room store instance to use, or the path to the room .db file to load.
      * A database will be ClientFactoryEncryptionStorecreated if this is not specified. If `disableStores` is set,
      * no database will be created or used.
      */
    var roomStore: js.UndefOr[RoomBridgeStore | String] = js.undefined
    
    var roomUpgradeOpts: js.UndefOr[RoomUpgradeHandlerOpts] = js.undefined
    
    /**
      * True to stop receiving onEvent callbacks
      * for events which were sent by a bridge user. Default: true.
      */
    var suppressEcho: js.UndefOr[Boolean] = js.undefined
    
    /**
      * The user store instance to use, or the path to the user .db file to load.
      * A database will be created if this is not specified. If `disableStores` is set,
      * no database will be created or used.
      */
    var userStore: js.UndefOr[UserBridgeStore | String] = js.undefined
  }
  object BridgeOpts {
    
    @scala.inline
    def apply(
      controller: BridgeController,
      domain: String,
      homeserverUrl: String,
      registration: AppServiceRegistration | String
    ): BridgeOpts = {
      val __obj = js.Dynamic.literal(controller = controller.asInstanceOf[js.Any], domain = domain.asInstanceOf[js.Any], homeserverUrl = homeserverUrl.asInstanceOf[js.Any], registration = registration.asInstanceOf[js.Any])
      __obj.asInstanceOf[BridgeOpts]
    }
    
    @scala.inline
    implicit class BridgeOptsMutableBuilder[Self <: BridgeOpts] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAuthenticateThirdpartyEndpoints(value: Boolean): Self = StObject.set(x, "authenticateThirdpartyEndpoints", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAuthenticateThirdpartyEndpointsUndefined: Self = StObject.set(x, "authenticateThirdpartyEndpoints", js.undefined)
      
      @scala.inline
      def setBridgeEncryption(value: HomeserverUrl): Self = StObject.set(x, "bridgeEncryption", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBridgeEncryptionUndefined: Self = StObject.set(x, "bridgeEncryption", js.undefined)
      
      @scala.inline
      def setClientFactory(value: ClientFactory): Self = StObject.set(x, "clientFactory", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClientFactoryUndefined: Self = StObject.set(x, "clientFactory", js.undefined)
      
      @scala.inline
      def setController(value: BridgeController): Self = StObject.set(x, "controller", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisableContext(value: Boolean): Self = StObject.set(x, "disableContext", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisableContextUndefined: Self = StObject.set(x, "disableContext", js.undefined)
      
      @scala.inline
      def setDisableStores(value: Boolean): Self = StObject.set(x, "disableStores", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisableStoresUndefined: Self = StObject.set(x, "disableStores", js.undefined)
      
      @scala.inline
      def setDomain(value: String): Self = StObject.set(x, "domain", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEscapeUserIds(value: Boolean): Self = StObject.set(x, "escapeUserIds", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEscapeUserIdsUndefined: Self = StObject.set(x, "escapeUserIds", js.undefined)
      
      @scala.inline
      def setEventStore(value: EventBridgeStore | String): Self = StObject.set(x, "eventStore", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEventStoreUndefined: Self = StObject.set(x, "eventStore", js.undefined)
      
      @scala.inline
      def setHomeserverUrl(value: String): Self = StObject.set(x, "homeserverUrl", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIntentOptions(value: Bot): Self = StObject.set(x, "intentOptions", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIntentOptionsUndefined: Self = StObject.set(x, "intentOptions", js.undefined)
      
      @scala.inline
      def setLogRequestOutcome(value: Boolean): Self = StObject.set(x, "logRequestOutcome", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLogRequestOutcomeUndefined: Self = StObject.set(x, "logRequestOutcome", js.undefined)
      
      @scala.inline
      def setMembershipCache(value: MembershipCache): Self = StObject.set(x, "membershipCache", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMembershipCacheUndefined: Self = StObject.set(x, "membershipCache", js.undefined)
      
      @scala.inline
      def setNetworkName(value: String): Self = StObject.set(x, "networkName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNetworkNameUndefined: Self = StObject.set(x, "networkName", js.undefined)
      
      @scala.inline
      def setQueue(value: PerRequest): Self = StObject.set(x, "queue", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setQueueUndefined: Self = StObject.set(x, "queue", js.undefined)
      
      @scala.inline
      def setRegistration(value: AppServiceRegistration | String): Self = StObject.set(x, "registration", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRoomLinkValidation(value: RuleFile): Self = StObject.set(x, "roomLinkValidation", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRoomLinkValidationUndefined: Self = StObject.set(x, "roomLinkValidation", js.undefined)
      
      @scala.inline
      def setRoomStore(value: RoomBridgeStore | String): Self = StObject.set(x, "roomStore", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRoomStoreUndefined: Self = StObject.set(x, "roomStore", js.undefined)
      
      @scala.inline
      def setRoomUpgradeOpts(value: RoomUpgradeHandlerOpts): Self = StObject.set(x, "roomUpgradeOpts", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRoomUpgradeOptsUndefined: Self = StObject.set(x, "roomUpgradeOpts", js.undefined)
      
      @scala.inline
      def setSuppressEcho(value: Boolean): Self = StObject.set(x, "suppressEcho", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSuppressEchoUndefined: Self = StObject.set(x, "suppressEcho", js.undefined)
      
      @scala.inline
      def setUserStore(value: UserBridgeStore | String): Self = StObject.set(x, "userStore", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUserStoreUndefined: Self = StObject.set(x, "userStore", js.undefined)
    }
  }
  
  type PossiblePromise[T] = T | js.Promise[T]
  
  trait VettedBridgeOpts extends StObject {
    
    var authenticateThirdpartyEndpoints: Boolean
    
    var bridgeEncryption: js.UndefOr[HomeserverUrl] = js.undefined
    
    /**
      * The client factory instance to use. If not supplied, one will be created.
      */
    var clientFactory: js.UndefOr[ClientFactory] = js.undefined
    
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
    var disableContext: Boolean
    
    /**
      * True to disable enabling of stores.
      * This should be used by bridges that use their own database instances and
      * do not need any of the included store objects. This implies setting
      * disableContext to True. Default: false.
      */
    var disableStores: Boolean
    
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
    
    /**
      * The base HS url
      */
    var homeserverUrl: String
    
    /**
      * Options to supply to created Intent instances.
      */
    var intentOptions: Bot
    
    /**
      * True to enable SUCCESS/FAILED log lines to be sent to onLog. Default: true.
      */
    var logRequestOutcome: Boolean
    
    /**
      * A human readable string that will be used when the bridge signals errors
      * to the client. Will not include in error events if ommited.
      */
    var networkName: js.UndefOr[String] = js.undefined
    
    /**
      * Options for the `onEvent` queue. When the bridge
      * receives an incoming transaction, it needs to asyncly query the data store for
      * contextual info before calling onEvent. A queue is used to keep the onEvent
      * calls consistent with the arrival order from the incoming transactions.
      */
    var queue: Type
    
    /**
      * Application service registration object or path to the registration file.
      */
    var registration: AppServiceRegistration | String
    
    var roomLinkValidation: js.UndefOr[RuleFile] = js.undefined
    
    /**
      * The room store instance to use, or the path to the room .db file to load.
      * A database will be created if this is not specified. If `disableStores` is set,
      * no database will be created or used.
      */
    var roomStore: RoomBridgeStore | String
    
    var roomUpgradeOpts: js.UndefOr[RoomUpgradeHandlerOpts] = js.undefined
    
    /**
      * True to stop receiving onEvent callbacks
      * for events which were sent by a bridge user. Default: true.
      */
    var suppressEcho: Boolean
    
    /**
      * The user store instance to use, or the path to the user .db file to load.
      * A database will be created if this is not specified. If `disableStores` is set,
      * no database will be created or used.
      */
    var userStore: UserBridgeStore | String
  }
  object VettedBridgeOpts {
    
    @scala.inline
    def apply(
      authenticateThirdpartyEndpoints: Boolean,
      controller: BridgeController,
      disableContext: Boolean,
      disableStores: Boolean,
      domain: String,
      homeserverUrl: String,
      intentOptions: Bot,
      logRequestOutcome: Boolean,
      queue: Type,
      registration: AppServiceRegistration | String,
      roomStore: RoomBridgeStore | String,
      suppressEcho: Boolean,
      userStore: UserBridgeStore | String
    ): VettedBridgeOpts = {
      val __obj = js.Dynamic.literal(authenticateThirdpartyEndpoints = authenticateThirdpartyEndpoints.asInstanceOf[js.Any], controller = controller.asInstanceOf[js.Any], disableContext = disableContext.asInstanceOf[js.Any], disableStores = disableStores.asInstanceOf[js.Any], domain = domain.asInstanceOf[js.Any], homeserverUrl = homeserverUrl.asInstanceOf[js.Any], intentOptions = intentOptions.asInstanceOf[js.Any], logRequestOutcome = logRequestOutcome.asInstanceOf[js.Any], queue = queue.asInstanceOf[js.Any], registration = registration.asInstanceOf[js.Any], roomStore = roomStore.asInstanceOf[js.Any], suppressEcho = suppressEcho.asInstanceOf[js.Any], userStore = userStore.asInstanceOf[js.Any])
      __obj.asInstanceOf[VettedBridgeOpts]
    }
    
    @scala.inline
    implicit class VettedBridgeOptsMutableBuilder[Self <: VettedBridgeOpts] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAuthenticateThirdpartyEndpoints(value: Boolean): Self = StObject.set(x, "authenticateThirdpartyEndpoints", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBridgeEncryption(value: HomeserverUrl): Self = StObject.set(x, "bridgeEncryption", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBridgeEncryptionUndefined: Self = StObject.set(x, "bridgeEncryption", js.undefined)
      
      @scala.inline
      def setClientFactory(value: ClientFactory): Self = StObject.set(x, "clientFactory", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClientFactoryUndefined: Self = StObject.set(x, "clientFactory", js.undefined)
      
      @scala.inline
      def setController(value: BridgeController): Self = StObject.set(x, "controller", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisableContext(value: Boolean): Self = StObject.set(x, "disableContext", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisableStores(value: Boolean): Self = StObject.set(x, "disableStores", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDomain(value: String): Self = StObject.set(x, "domain", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEscapeUserIds(value: Boolean): Self = StObject.set(x, "escapeUserIds", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEscapeUserIdsUndefined: Self = StObject.set(x, "escapeUserIds", js.undefined)
      
      @scala.inline
      def setEventStore(value: EventBridgeStore | String): Self = StObject.set(x, "eventStore", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEventStoreUndefined: Self = StObject.set(x, "eventStore", js.undefined)
      
      @scala.inline
      def setHomeserverUrl(value: String): Self = StObject.set(x, "homeserverUrl", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIntentOptions(value: Bot): Self = StObject.set(x, "intentOptions", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLogRequestOutcome(value: Boolean): Self = StObject.set(x, "logRequestOutcome", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNetworkName(value: String): Self = StObject.set(x, "networkName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNetworkNameUndefined: Self = StObject.set(x, "networkName", js.undefined)
      
      @scala.inline
      def setQueue(value: Type): Self = StObject.set(x, "queue", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRegistration(value: AppServiceRegistration | String): Self = StObject.set(x, "registration", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRoomLinkValidation(value: RuleFile): Self = StObject.set(x, "roomLinkValidation", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRoomLinkValidationUndefined: Self = StObject.set(x, "roomLinkValidation", js.undefined)
      
      @scala.inline
      def setRoomStore(value: RoomBridgeStore | String): Self = StObject.set(x, "roomStore", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRoomUpgradeOpts(value: RoomUpgradeHandlerOpts): Self = StObject.set(x, "roomUpgradeOpts", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRoomUpgradeOptsUndefined: Self = StObject.set(x, "roomUpgradeOpts", js.undefined)
      
      @scala.inline
      def setSuppressEcho(value: Boolean): Self = StObject.set(x, "suppressEcho", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUserStore(value: UserBridgeStore | String): Self = StObject.set(x, "userStore", value.asInstanceOf[js.Any])
    }
  }
}
