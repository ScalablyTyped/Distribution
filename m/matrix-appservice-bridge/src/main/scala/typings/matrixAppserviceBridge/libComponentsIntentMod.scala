package typings.matrixAppserviceBridge

import org.scalablytyped.runtime.StringDictionary
import typings.matrixAppserviceBridge.anon.BackingStore
import typings.matrixAppserviceBridge.anon.Eventid
import typings.matrixAppserviceBridge.anon.Roomid
import typings.matrixAppserviceBridge.anon.Ttl
import typings.matrixAppserviceBridge.libComponentsEventTypesMod.WeakStateEvent
import typings.matrixAppserviceBridge.libComponentsMembershipCacheMod.UserMembership
import typings.matrixAppserviceBridge.libErrorsMod.unstable.BridgeErrorReason
import typings.matrixAppserviceBridge.matrixAppserviceBridgeStrings.`private`
import typings.matrixAppserviceBridge.matrixAppserviceBridgeStrings.public
import typings.matrixAppserviceBridge.matrixAppserviceBridgeStrings.registeredEqualssigntrue
import typings.matrixBotSdk.libModelsEventsPresenceEventMod.PresenceState
import typings.matrixBotSdk.libModelsMatrixProfileMod.MatrixProfileInfo
import typings.matrixBotSdk.mod.MatrixClient
import typings.node.bufferMod.global.Buffer
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libComponentsIntentMod {
  
  @JSImport("matrix-appservice-bridge/lib/components/intent", "Intent")
  @js.native
  open class Intent protected () extends StObject {
    /**
      * Create an entity which can fulfil the intent of a given user.
      * @constructor
      * @param botSdkIntent The bot sdk intent which this intent wraps
      * fulfilled e.g. the entity joining the room when you call intent.join(roomId).
      * @param botClient The client instance for the AS bot itself.
      * This will be used to perform more priveleged actions such as creating new
      * rooms, sending invites, etc.
      * @param opts Options for this Intent instance.
      * @param opts.registered True to inform this instance that the client
      * is already registered. No registration requests will be made from this Intent.
      * Default: false.
      * @param opts.dontCheckPowerLevel True to not check for the right power
      * level before sending events. Default: false.
      *
      * @param opts.backingStore An object with 4 functions, outlined below.
      * If this Object is supplied, ALL 4 functions must be supplied. If this Object
      * is not supplied, the Intent will maintain its own backing store for membership
      * and power levels, which may scale badly for lots of users.
      *
      * @param opts.backingStore.getMembership A function which is called with a
      * room ID and user ID which should return the membership status of this user as
      * a string e.g "join". `null` should be returned if the membership is unknown.
      *
      * @param opts.backingStore.getPowerLevelContent A function which is called
      * with a room ID which should return the power level content for this room, as an Object.
      * `null` should be returned if there is no known content.
      *
      * @param opts.backingStore.setMembership A function with the signature:
      * function(roomId, userId, membership) which will set the membership of the given user in
      * the given room. This has no return value.
      *
      * @param opts.backingStore.setPowerLevelContent A function with the signature:
      * function(roomId, content) which will set the power level content in the given room.
      * This has no return value.
      *
      * @param opts.dontJoin True to not attempt to join a room before
      * sending messages into it. The surrounding code will have to ensure the correct
      * membership state itself in this case. Default: false.
      *
      * @param opts.enablePresence True to send presence, false to no-op.
      *
      * @param opts.caching.ttl How long requests can stay in the cache, in milliseconds.
      * @param opts.caching.size How many entries should be kept in the cache, before the oldest is dropped.
      * @param opts.getJsSdkClient Create a Matrix JS SDK client on demand for legacy code.
      */
    def this(botSdkIntent: typings.matrixBotSdk.mod.Intent, botClient: MatrixClient) = this()
    def this(botSdkIntent: typings.matrixBotSdk.mod.Intent, botClient: MatrixClient, opts: IntentOpts) = this()
    
    /**
      * Ensures that the client has the required power level to post the event type.
      * @param roomId Required as power levels exist inside a room.
      * @param eventTypes The event type to check the permissions for.
      * @param isState Are we checking for state permissions or regular event permissions.
      * @return If found, the power level event
      */
    /* protected */ def _ensureHasPowerLevelFor(roomId: String, eventType: String, isState: Boolean): js.Promise[js.UndefOr[PowerLevelContent]] = js.native
    
    /* protected */ def _ensureJoined(roomIdOrAlias: String): js.Promise[String] = js.native
    /* protected */ def _ensureJoined(roomIdOrAlias: String, ignoreCache: Boolean): js.Promise[String] = js.native
    /* protected */ def _ensureJoined(roomIdOrAlias: String, ignoreCache: Boolean, viaServers: js.Array[String]): js.Promise[String] = js.native
    /* protected */ def _ensureJoined(
      roomIdOrAlias: String,
      ignoreCache: Boolean,
      viaServers: js.Array[String],
      passthroughError: Boolean
    ): js.Promise[String] = js.native
    /* protected */ def _ensureJoined(roomIdOrAlias: String, ignoreCache: Boolean, viaServers: Unit, passthroughError: Boolean): js.Promise[String] = js.native
    /* protected */ def _ensureJoined(roomIdOrAlias: String, ignoreCache: Unit, viaServers: js.Array[String]): js.Promise[String] = js.native
    /* protected */ def _ensureJoined(roomIdOrAlias: String, ignoreCache: Unit, viaServers: js.Array[String], passthroughError: Boolean): js.Promise[String] = js.native
    /* protected */ def _ensureJoined(roomIdOrAlias: String, ignoreCache: Unit, viaServers: Unit, passthroughError: Boolean): js.Promise[String] = js.native
    
    /* protected */ def _joinGuard[T](roomId: String, promiseFn: js.Function0[js.Promise[T]]): js.Promise[T] = js.native
    
    /* private */ val _membershipStates: Any = js.native
    
    /* private */ val _powerLevels: Any = js.native
    
    /* private */ var _requestCaches: Any = js.native
    
    /**
      * Ban a user from a room.
      *
      * This will automatically make the client join the room so they can send the
      * ban if they are not already joined.
      * @param roomId The room to ban the user from.
      * @param target The target of the ban operation.
      * @param reason Optional. The reason for the ban.
      * @return Resolved when banned, else rejected with an error.
      */
    def ban(roomId: String, target: String): js.Promise[Any] = js.native
    def ban(roomId: String, target: String, reason: String): js.Promise[Any] = js.native
    
    /* private */ val botClient: Any = js.native
    
    val botSdkIntent: typings.matrixBotSdk.mod.Intent = js.native
    
    /**
      * Create a new alias mapping.
      * @param alias The room alias to create
      * @param roomId The room ID the alias should point at.
      */
    def createAlias(alias: String, roomId: String): js.Promise[Any] = js.native
    
    /**
      * Create a room with a set of options.
      * @param opts Options.
      * @param opts.createAsClient True to create this room as a client and
      * not the bot: the bot will not join. False to create this room as the bot and
      * auto-join the client. Default: false.
      * @param opts.options Options to pass to the client SDK /createRoom API.
      */
    def createRoom(opts: RoomCreationOpts): js.Promise[Roomid] = js.native
    
    /**
      * Create a widget in a room.
      * @param roomId The room to create the widget in.
      * @param widgetId The widget ID
      * @param opts Options for the widget.
      * @returns An eventID if the event was created.
      */
    def createWidget(roomId: String, widgetId: String, opts: WidgetOpts): js.Promise[String] = js.native
    
    /**
      * Ensure that the user has the given profile information set. If it does not,
      * set it.
      * @param displayname The displayname to set. Leave undefined to ignore.
      * @param avatarUrl The avatar to set. Leave undefined to ignore.
      */
    def ensureProfile(): js.Promise[Unit] = js.native
    def ensureProfile(displayname: String): js.Promise[Unit] = js.native
    def ensureProfile(displayname: String, avatarUrl: String): js.Promise[Unit] = js.native
    def ensureProfile(displayname: Unit, avatarUrl: String): js.Promise[Unit] = js.native
    
    def ensureRegistered(): js.Promise[js.UndefOr[registeredEqualssigntrue]] = js.native
    def ensureRegistered(forceRegister: Boolean): js.Promise[js.UndefOr[registeredEqualssigntrue]] = js.native
    
    /**
      * Create a widget in a room, if one doesn't already exist
      * @param roomId The room to create the widget in.
      * @param widgetId The widget ID
      * @param opts Options for the widget.
      * @returns An eventID if the event was created, otherwise null.
      */
    def ensureWidgetInRoom(roomId: String, widgetId: String, opts: WidgetOpts): js.Promise[String | Null] = js.native
    
    /**
      * Get an event in a room.
      * This will automatically make the client join the room so they can get the
      * event if they are not already joined.
      * @param roomId The room to fetch the event from.
      * @param eventId The eventId of the event to fetch.
      * @param useCache Should the request attempt to lookup from the cache.
      * @return Resolves with the content of the event, or rejects if not found.
      */
    def getEvent(roomId: String, eventId: String): js.Promise[Any] = js.native
    def getEvent(roomId: String, eventId: String, useCache: Boolean): js.Promise[Any] = js.native
    
    /**
      * Get a user's profile information
      *
      * @param userId The ID of the user whose profile to return
      * @param info The profile field name to retrieve (e.g. 'displayname'
      * or 'avatar_url'), or null to fetch the entire profile information.
      * @param useCache Should the request attempt to lookup
      * state from the cache.
      * @return A Promise that resolves with the requested user's profile
      * information
      */
    def getProfileInfo(userId: String): js.Promise[MatrixProfileInfo] = js.native
    def getProfileInfo(userId: String, info: Unit, useCache: Boolean): js.Promise[MatrixProfileInfo] = js.native
    def getProfileInfo(userId: String, info: UserProfileKeys): js.Promise[MatrixProfileInfo] = js.native
    def getProfileInfo(userId: String, info: UserProfileKeys, useCache: Boolean): js.Promise[MatrixProfileInfo] = js.native
    
    /**
      * Get a state event in a room.
      * This will automatically make the client join the room so they can get the
      * state if they are not already joined.
      * @param roomId The room to get the state from.
      * @param eventType The event type to fetch.
      * @param stateKey The state key of the event to fetch.
      * @param returnNull Return null on not found, rather than throwing
      */
    def getStateEvent(roomId: String, eventType: String): js.Promise[Any] = js.native
    def getStateEvent(roomId: String, eventType: String, stateKey: String): js.Promise[Any] = js.native
    def getStateEvent(roomId: String, eventType: String, stateKey: String, returnNull: Boolean): js.Promise[Any] = js.native
    def getStateEvent(roomId: String, eventType: String, stateKey: Unit, returnNull: Boolean): js.Promise[Any] = js.native
    
    /**
      * Invite a user to a room.
      *
      * This will automatically make the client join the room so they can send the
      * invite if they are not already joined.
      * @param roomId The room to invite the user to.
      * @param target The user ID to invite.
      * @return Resolved when invited, else rejected with an error.
      */
    def invite(roomId: String, target: String): js.Promise[Any] = js.native
    
    /**
      * Join a room
      *
      * This will automatically send an invite from the bot if it is an invite-only
      * room, which may make the bot attempt to join the room if it isn't already.
      * @param roomIdOrAlias The room ID or room alias to join.
      * @param viaServers The server names to try and join through in
      * addition to those that are automatically chosen.
      */
    def join(roomIdOrAlias: String): js.Promise[String] = js.native
    def join(roomIdOrAlias: String, viaServers: js.Array[String]): js.Promise[String] = js.native
    
    /**
      * Kick a user from a room.
      *
      * This will automatically make the client join the room so they can send the
      * kick if they are not already joined.
      * @param roomId The room to kick the user from.
      * @param target The target of the kick operation.
      * @param reason Optional. The reason for the kick.
      * @return Resolved when kickked, else rejected with an error.
      */
    def kick(roomId: String, target: String): js.Promise[Any] = js.native
    def kick(roomId: String, target: String, reason: String): js.Promise[Any] = js.native
    
    /**
      * Leave a room
      *
      * This will no-op if the user isn't in the room.
      * @param roomId The room to leave.
      * @param reason An optional string to explain why the user left the room.
      */
    def leave(roomId: String): js.Promise[Any] = js.native
    def leave(roomId: String, reason: String): js.Promise[Any] = js.native
    
    /* private */ var legacyClient: Any = js.native
    
    def matrixClient: MatrixClient = js.native
    
    /**
      * Inform this Intent class of an incoming event. Various optimisations will be
      * done if this is provided. For example, a /join request won't be sent out if
      * it knows you've already been joined to the room. This function does nothing
      * if a backing store was provided to the Intent.
      * @param event The incoming event JSON
      */
    def onEvent(event: WeakStateEvent): Unit = js.native
    
    /* protected */ var opts: BackingStore = js.native
    
    /**
      * Resolve a roomId or alias into a roomId. If a roomId is given, it is immediately returned.
      * @param roomAliasOrId A roomId or alias to resolve.
      * @throws If the provided string was incorrectly formatted or alias does not exist.
      */
    def resolveRoom(roomAliasOrId: String): js.Promise[String] = js.native
    
    /**
      * Get the current room state for a room.
      *
      * This will automatically make the client join the room so they can get the
      * state if they are not already joined.
      * @param roomId The room to get the state from.
      * @param useCache Should the request attempt to lookup
      * state from the cache.
      */
    def roomState(roomId: String): js.Promise[Any] = js.native
    def roomState(roomId: String, useCache: Boolean): js.Promise[Any] = js.native
    
    /**
      * Send a message event to a room.
      *
      * This will automatically make the client join the room so they can send the
      * message if they are not already joined. It will also make sure that the client
      * has sufficient power level to do this.
      * @param roomId The room to send to.
      * @param type The event type
      * @param content The event content
      * @returns The event ID wrapped inside an object (for legacy reasons)
      */
    def sendEvent(roomId: String, `type`: String, content: Record[String, Any]): js.Promise[Eventid] = js.native
    
    /**
      * Send an `m.room.message` event to a room.
      *
      * This will automatically make the client join the room so they can send the
      * message if they are not already joined. It will also make sure that the client
      * has sufficient power level to do this.
      * @param roomId The room to send to.
      * @param content The event content
      * @returns The eventId of the sent message
      */
    def sendMessage(roomId: String, content: Record[String, Any]): js.Promise[Eventid] = js.native
    
    /**
      * Send a read receipt to a room.
      *
      * This will automatically make the client join the room so they can send the
      * receipt event if they are not already joined.
      * @param roomId The room to send to.
      * @param eventId The event ID to set the receipt mark to.
      */
    def sendReadReceipt(roomId: String, eventId: String): js.Promise[Unit] = js.native
    
    /**
      * Send a state event to a room.
      *
      * This will automatically make the client join the room so they can send the
      * state if they are not already joined. It will also make sure that the client
      * has sufficient power level to do this.
      * @param roomId The room to send to.
      * @param type The event type
      * @param skey The state key
      * @param content The event content
      * @returns The event ID wrapped inside an object (for legacy reasons)
      */
    def sendStateEvent(roomId: String, `type`: String, skey: String, content: Record[String, Any]): js.Promise[Eventid] = js.native
    
    /**
      * Send a plaintext message to a room.
      *
      * This will automatically make the client join the room so they can send the
      * message if they are not already joined. It will also make sure that the client
      * has sufficient power level to do this.
      * @param roomId The room to send to.
      * @param text The text string to send.
      * @returns The Matrix event ID.
      */
    def sendText(roomId: String, text: String): js.Promise[Eventid] = js.native
    
    /**
      * Send a typing event to a room.
      *
      * This will automatically make the client join the room so they can send the
      * typing event if they are not already joined.
      * @param roomId The room to send to.
      * @param isTyping True if typing
      */
    def sendTyping(roomId: String, isTyping: Boolean): js.Promise[Unit] = js.native
    
    /**
      * Set the user's avatar URL
      *
      * @param url The new avatar URL
      */
    def setAvatarUrl(url: String): js.Promise[Any] = js.native
    
    /**
      * Set the user's display name
      *
      * @param name The new display name
      */
    def setDisplayName(name: String): js.Promise[Any] = js.native
    
    /**
      * Set the power level of the given target.
      * @param roomId The room to set the power level in.
      * @param target The target user ID
      * @param level The desired level. Undefined will remove the users custom power level.
      */
    def setPowerLevel(roomId: String, target: String): js.Promise[Unit] = js.native
    def setPowerLevel(roomId: String, target: String, level: Double): js.Promise[Unit] = js.native
    
    /**
      * Set the presence of this user.
      * @param presence One of "online", "offline" or "unavailable".
      * @param status_msg The status message to attach.
      * @return Resolves if the presence was set or no-oped, rejects otherwise.
      */
    def setPresence(presence: PresenceState): js.Promise[Any] = js.native
    def setPresence(presence: PresenceState, statusMsg: String): js.Promise[Any] = js.native
    
    /**
      * Set the avatar of a room.
      *
      * This will automatically make the client join the room so they can set the
      * topic if they are not already joined. It will also make sure that the client
      * has sufficient power level to do this.
      * @param roomId The room to send to.
      * @param avatar The url of the avatar.
      * @param info Extra information about the image. See m.room.avatar for details.
      */
    def setRoomAvatar(roomId: String, avatar: String): js.Promise[Eventid] = js.native
    def setRoomAvatar(roomId: String, avatar: String, info: String): js.Promise[Eventid] = js.native
    
    /**
      * Set the visibility of a room in the homeserver's room directory.
      * @param roomId The room
      * @param visibility Should the room be visible
      */
    def setRoomDirectoryVisibility(roomId: String, visibility: public | `private`): js.Promise[Any] = js.native
    
    /**
      * Set the visibility of a room in the appservice's room directory.
      * This only works if you have defined the `protocol` in the registration file.
      * @param roomId The room
      * @param networkId The network (not protocol) that owns this room. E.g. "freenode" (for an IRC bridge)
      * @param visibility Should the room be visible
      */
    def setRoomDirectoryVisibilityAppService(roomId: String, networkId: String, visibility: public | `private`): js.Promise[Unit] = js.native
    
    /**
      * Set the name of a room.
      *
      * This will automatically make the client join the room so they can set the
      * name if they are not already joined. It will also make sure that the client
      * has sufficient power level to do this.
      * @param roomId The room to send to.
      * @param name The room name.
      * @returns The Matrix event ID.
      */
    def setRoomName(roomId: String, name: String): js.Promise[Eventid] = js.native
    
    /**
      * Set the topic of a room.
      *
      * This will automatically make the client join the room so they can set the
      * topic if they are not already joined. It will also make sure that the client
      * has sufficient power level to do this.
      * @param roomId The room to send to.
      * @param topic The room topic.
      */
    def setRoomTopic(roomId: String, topic: String): js.Promise[Eventid] = js.native
    
    def setRoomUserProfile(roomId: String, profile: MatrixProfileInfo): js.Promise[Unit] = js.native
    
    /**
      * Unban a user from a room.
      *
      * This will automatically make the client join the room so they can send the
      * unban if they are not already joined.
      * @param roomId The room to unban the user from.
      * @param target The target of the unban operation.
      * @return Resolved when unbanned, else rejected with an error.
      */
    def unban(roomId: String, target: String): js.Promise[Any] = js.native
    
    /**
      * Signals that an error occured while handling an event by the bridge.
      *
      * **Warning**: This function is unstable and is likely to change pending the outcome
      * of https://github.com/matrix-org/matrix-doc/pull/2162.
      * @param roomID ID of the room in which the error occured.
      * @param eventID ID of the event for which the error occured.
      * @param networkName Name of the bridged network.
      * @param reason The reason why the bridge error occured.
      * @param reason_body A human readable string d
      * @param affectedUsers Array of regex matching all affected users.
      */
    def unstableSignalBridgeError(
      roomID: String,
      eventID: String,
      networkName: String,
      reason: BridgeErrorReason,
      affectedUsers: js.Array[String]
    ): js.Promise[Eventid] = js.native
    def unstableSignalBridgeError(
      roomID: String,
      eventID: String,
      networkName: Unit,
      reason: BridgeErrorReason,
      affectedUsers: js.Array[String]
    ): js.Promise[Eventid] = js.native
    
    def uploadContent(content: String): js.Promise[String] = js.native
    def uploadContent(content: String, opts: FileUploadOpts): js.Promise[String] = js.native
    /**
      * Upload a file to the homeserver.
      * @param content The file contents
      * @param opts Additional options for the upload.
      * @returns A MXC URL pointing to the uploaded data.
      */
    def uploadContent(content: Buffer): js.Promise[String] = js.native
    def uploadContent(content: Buffer, opts: FileUploadOpts): js.Promise[String] = js.native
    
    def userId: String = js.native
  }
  /* static members */
  object Intent {
    
    @JSImport("matrix-appservice-bridge/lib/components/intent", "Intent")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("matrix-appservice-bridge/lib/components/intent", "Intent.getClientWarningFired")
    @js.native
    def getClientWarningFired: Any = js.native
    inline def getClientWarningFired_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("getClientWarningFired")(x.asInstanceOf[js.Any])
  }
  
  trait FileUploadOpts extends StObject {
    
    var name: js.UndefOr[String] = js.undefined
    
    var `type`: js.UndefOr[String] = js.undefined
  }
  object FileUploadOpts {
    
    inline def apply(): FileUploadOpts = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[FileUploadOpts]
    }
    
    extension [Self <: FileUploadOpts](x: Self) {
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  trait IntentBackingStore extends StObject {
    
    def getMemberProfile(roomId: String, userid: String): MatrixProfileInfo
    
    def getMembership(roomId: String, userId: String): UserMembership
    
    def getPowerLevelContent(roomId: String): js.UndefOr[PowerLevelContent]
    
    def setMembership(roomId: String, userId: String, membership: UserMembership, profile: MatrixProfileInfo): Unit
    
    def setPowerLevelContent(roomId: String, content: PowerLevelContent): Unit
  }
  object IntentBackingStore {
    
    inline def apply(
      getMemberProfile: (String, String) => MatrixProfileInfo,
      getMembership: (String, String) => UserMembership,
      getPowerLevelContent: String => js.UndefOr[PowerLevelContent],
      setMembership: (String, String, UserMembership, MatrixProfileInfo) => Unit,
      setPowerLevelContent: (String, PowerLevelContent) => Unit
    ): IntentBackingStore = {
      val __obj = js.Dynamic.literal(getMemberProfile = js.Any.fromFunction2(getMemberProfile), getMembership = js.Any.fromFunction2(getMembership), getPowerLevelContent = js.Any.fromFunction1(getPowerLevelContent), setMembership = js.Any.fromFunction4(setMembership), setPowerLevelContent = js.Any.fromFunction2(setPowerLevelContent))
      __obj.asInstanceOf[IntentBackingStore]
    }
    
    extension [Self <: IntentBackingStore](x: Self) {
      
      inline def setGetMemberProfile(value: (String, String) => MatrixProfileInfo): Self = StObject.set(x, "getMemberProfile", js.Any.fromFunction2(value))
      
      inline def setGetMembership(value: (String, String) => UserMembership): Self = StObject.set(x, "getMembership", js.Any.fromFunction2(value))
      
      inline def setGetPowerLevelContent(value: String => js.UndefOr[PowerLevelContent]): Self = StObject.set(x, "getPowerLevelContent", js.Any.fromFunction1(value))
      
      inline def setSetMembership(value: (String, String, UserMembership, MatrixProfileInfo) => Unit): Self = StObject.set(x, "setMembership", js.Any.fromFunction4(value))
      
      inline def setSetPowerLevelContent(value: (String, PowerLevelContent) => Unit): Self = StObject.set(x, "setPowerLevelContent", js.Any.fromFunction2(value))
    }
  }
  
  trait IntentOpts extends StObject {
    
    var backingStore: js.UndefOr[IntentBackingStore] = js.undefined
    
    var caching: js.UndefOr[Ttl] = js.undefined
    
    var dontCheckPowerLevel: js.UndefOr[Boolean] = js.undefined
    
    var dontJoin: js.UndefOr[Boolean] = js.undefined
    
    var enablePresence: js.UndefOr[Boolean] = js.undefined
    
    var onEventSent: js.UndefOr[OnEventSentHook] = js.undefined
    
    var registered: js.UndefOr[Boolean] = js.undefined
  }
  object IntentOpts {
    
    inline def apply(): IntentOpts = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IntentOpts]
    }
    
    extension [Self <: IntentOpts](x: Self) {
      
      inline def setBackingStore(value: IntentBackingStore): Self = StObject.set(x, "backingStore", value.asInstanceOf[js.Any])
      
      inline def setBackingStoreUndefined: Self = StObject.set(x, "backingStore", js.undefined)
      
      inline def setCaching(value: Ttl): Self = StObject.set(x, "caching", value.asInstanceOf[js.Any])
      
      inline def setCachingUndefined: Self = StObject.set(x, "caching", js.undefined)
      
      inline def setDontCheckPowerLevel(value: Boolean): Self = StObject.set(x, "dontCheckPowerLevel", value.asInstanceOf[js.Any])
      
      inline def setDontCheckPowerLevelUndefined: Self = StObject.set(x, "dontCheckPowerLevel", js.undefined)
      
      inline def setDontJoin(value: Boolean): Self = StObject.set(x, "dontJoin", value.asInstanceOf[js.Any])
      
      inline def setDontJoinUndefined: Self = StObject.set(x, "dontJoin", js.undefined)
      
      inline def setEnablePresence(value: Boolean): Self = StObject.set(x, "enablePresence", value.asInstanceOf[js.Any])
      
      inline def setEnablePresenceUndefined: Self = StObject.set(x, "enablePresence", js.undefined)
      
      inline def setOnEventSent(
        value: (/* roomId */ String, /* type */ String, /* content */ Record[String, Any], /* eventId */ String) => Unit
      ): Self = StObject.set(x, "onEventSent", js.Any.fromFunction4(value))
      
      inline def setOnEventSentUndefined: Self = StObject.set(x, "onEventSent", js.undefined)
      
      inline def setRegistered(value: Boolean): Self = StObject.set(x, "registered", value.asInstanceOf[js.Any])
      
      inline def setRegisteredUndefined: Self = StObject.set(x, "registered", js.undefined)
    }
  }
  
  type OnEventSentHook = js.Function4[
    /* roomId */ String, 
    /* type */ String, 
    /* content */ Record[String, Any], 
    /* eventId */ String, 
    Unit
  ]
  
  trait PowerLevelContent extends StObject {
    
    var events: js.UndefOr[StringDictionary[Any]] = js.undefined
    
    var events_default: js.UndefOr[Any] = js.undefined
    
    var state_default: js.UndefOr[Any] = js.undefined
    
    var users: js.UndefOr[StringDictionary[Any]] = js.undefined
    
    var users_default: js.UndefOr[Any] = js.undefined
  }
  object PowerLevelContent {
    
    inline def apply(): PowerLevelContent = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PowerLevelContent]
    }
    
    extension [Self <: PowerLevelContent](x: Self) {
      
      inline def setEvents(value: StringDictionary[Any]): Self = StObject.set(x, "events", value.asInstanceOf[js.Any])
      
      inline def setEventsUndefined: Self = StObject.set(x, "events", js.undefined)
      
      inline def setEvents_default(value: Any): Self = StObject.set(x, "events_default", value.asInstanceOf[js.Any])
      
      inline def setEvents_defaultUndefined: Self = StObject.set(x, "events_default", js.undefined)
      
      inline def setState_default(value: Any): Self = StObject.set(x, "state_default", value.asInstanceOf[js.Any])
      
      inline def setState_defaultUndefined: Self = StObject.set(x, "state_default", js.undefined)
      
      inline def setUsers(value: StringDictionary[Any]): Self = StObject.set(x, "users", value.asInstanceOf[js.Any])
      
      inline def setUsersUndefined: Self = StObject.set(x, "users", js.undefined)
      
      inline def setUsers_default(value: Any): Self = StObject.set(x, "users_default", value.asInstanceOf[js.Any])
      
      inline def setUsers_defaultUndefined: Self = StObject.set(x, "users_default", js.undefined)
    }
  }
  
  trait RoomCreationOpts extends StObject {
    
    var createAsClient: js.UndefOr[Boolean] = js.undefined
    
    var options: js.UndefOr[Record[String, Any]] = js.undefined
  }
  object RoomCreationOpts {
    
    inline def apply(): RoomCreationOpts = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[RoomCreationOpts]
    }
    
    extension [Self <: RoomCreationOpts](x: Self) {
      
      inline def setCreateAsClient(value: Boolean): Self = StObject.set(x, "createAsClient", value.asInstanceOf[js.Any])
      
      inline def setCreateAsClientUndefined: Self = StObject.set(x, "createAsClient", js.undefined)
      
      inline def setOptions(value: Record[String, Any]): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
      
      inline def setOptionsUndefined: Self = StObject.set(x, "options", js.undefined)
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.matrixAppserviceBridge.matrixAppserviceBridgeStrings.avatar_url
    - typings.matrixAppserviceBridge.matrixAppserviceBridgeStrings.displayname
    - scala.Null
  */
  type UserProfileKeys = _UserProfileKeys | Null
  
  trait WidgetOpts extends StObject {
    
    var data: js.UndefOr[Record[String, Any]] = js.undefined
    
    var extra: js.UndefOr[Record[String, Any]] = js.undefined
    
    var name: String
    
    var `type`: js.UndefOr[String] = js.undefined
    
    var url: String
    
    var waitForIframeLoad: Boolean
  }
  object WidgetOpts {
    
    inline def apply(name: String, url: String, waitForIframeLoad: Boolean): WidgetOpts = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any], waitForIframeLoad = waitForIframeLoad.asInstanceOf[js.Any])
      __obj.asInstanceOf[WidgetOpts]
    }
    
    extension [Self <: WidgetOpts](x: Self) {
      
      inline def setData(value: Record[String, Any]): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      inline def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
      
      inline def setExtra(value: Record[String, Any]): Self = StObject.set(x, "extra", value.asInstanceOf[js.Any])
      
      inline def setExtraUndefined: Self = StObject.set(x, "extra", js.undefined)
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
      
      inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
      
      inline def setWaitForIframeLoad(value: Boolean): Self = StObject.set(x, "waitForIframeLoad", value.asInstanceOf[js.Any])
    }
  }
  
  trait _UserProfileKeys extends StObject
}
