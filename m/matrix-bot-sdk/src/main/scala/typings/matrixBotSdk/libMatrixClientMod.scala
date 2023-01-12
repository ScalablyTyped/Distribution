package typings.matrixBotSdk

import org.scalablytyped.runtime.StringDictionary
import typings.matrixBotSdk.anon.Avatarurl
import typings.matrixBotSdk.anon.ContentType
import typings.matrixBotSdk.anon.Current
import typings.matrixBotSdk.libAdminApisMod.AdminApis
import typings.matrixBotSdk.libDmsMod.DMs
import typings.matrixBotSdk.libE2eeCryptoClientMod.CryptoClient
import typings.matrixBotSdk.libIdentityIdentityClientMod.IdentityClient
import typings.matrixBotSdk.libMetricsMetricsMod.Metrics
import typings.matrixBotSdk.libModelsAccountMod.IWhoAmI
import typings.matrixBotSdk.libModelsCreateRoomMod.RoomCreateOptions
import typings.matrixBotSdk.libModelsCryptoMod.FallbackKey
import typings.matrixBotSdk.libModelsCryptoMod.MultiUserDeviceListResponse
import typings.matrixBotSdk.libModelsCryptoMod.OTKAlgorithm
import typings.matrixBotSdk.libModelsCryptoMod.OTKClaimResponse
import typings.matrixBotSdk.libModelsCryptoMod.OTKCounts
import typings.matrixBotSdk.libModelsCryptoMod.OTKs
import typings.matrixBotSdk.libModelsCryptoMod.OwnUserDevice
import typings.matrixBotSdk.libModelsEventContextMod.EventContext
import typings.matrixBotSdk.libModelsEventsMembershipEventMod.Membership
import typings.matrixBotSdk.libModelsEventsMembershipEventMod.MembershipEvent
import typings.matrixBotSdk.libModelsOpenIDConnectMod.OpenIDConnectToken
import typings.matrixBotSdk.libModelsPowerLevelActionMod.PowerLevelAction
import typings.matrixBotSdk.libModelsPowerLevelBoundsMod.PowerLevelBounds
import typings.matrixBotSdk.libModelsPresenceMod.Presence
import typings.matrixBotSdk.libModelsServerVersionsMod.ServerVersions
import typings.matrixBotSdk.libModelsSpacesMod.Space
import typings.matrixBotSdk.libModelsSpacesMod.SpaceCreateOptions
import typings.matrixBotSdk.libPreprocessorsIpreprocessorMod.IPreprocessor
import typings.matrixBotSdk.libStorageIcryptostorageproviderMod.ICryptoStorageProvider
import typings.matrixBotSdk.libStorageIstorageproviderMod.IStorageProvider
import typings.matrixBotSdk.libStrategiesJoinRoomStrategyMod.IJoinRoomStrategy
import typings.matrixBotSdk.libUnstableApisMod.UnstableApis
import typings.matrixBotSdk.matrixBotSdkStrings.`private`
import typings.matrixBotSdk.matrixBotSdkStrings.crop
import typings.matrixBotSdk.matrixBotSdkStrings.offline
import typings.matrixBotSdk.matrixBotSdkStrings.online
import typings.matrixBotSdk.matrixBotSdkStrings.public
import typings.matrixBotSdk.matrixBotSdkStrings.scale
import typings.matrixBotSdk.matrixBotSdkStrings.unavailable
import typings.node.bufferMod.global.Buffer
import typings.node.eventsMod.EventEmitter
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libMatrixClientMod {
  
  @JSImport("matrix-bot-sdk/lib/MatrixClient", "MatrixClient")
  @js.native
  open class MatrixClient protected () extends EventEmitter {
    /**
      * Creates a new matrix client
      * @param {string} homeserverUrl The homeserver's client-server API URL
      * @param {string} accessToken The access token for the homeserver
      * @param {IStorageProvider} storage The storage provider to use. Defaults to MemoryStorageProvider.
      * @param {ICryptoStorageProvider} cryptoStore Optional crypto storage provider to use. If not supplied,
      * end-to-end encryption will not be functional in this client.
      */
    def this(homeserverUrl: String, accessToken: String) = this()
    def this(homeserverUrl: String, accessToken: String, storage: IStorageProvider) = this()
    def this(homeserverUrl: String, accessToken: String, storage: Unit, cryptoStore: ICryptoStorageProvider) = this()
    def this(
      homeserverUrl: String,
      accessToken: String,
      storage: IStorageProvider,
      cryptoStore: ICryptoStorageProvider
    ) = this()
    
    val accessToken: String = js.native
    
    /**
      * Adds a preprocessor to the event pipeline. When this client encounters an event, it
      * will try to run it through the preprocessors it can in the order they were added.
      * @param {IPreprocessor} preprocessor the preprocessor to add
      */
    def addPreprocessor(preprocessor: IPreprocessor): Unit = js.native
    
    /**
      * Gets the admin API access class.
      * @return {AdminApis} The admin API access class.
      */
    def adminApis: AdminApis = js.native
    
    /**
      * Bans a user from a room.
      * @param {string} userId the user ID to ban
      * @param {string} roomId the room ID to set the ban in
      * @param {string?} reason optional reason for the ban
      * @returns {Promise<any>} resolves when completed
      */
    def banUser(userId: Any, roomId: Any): js.Promise[Any] = js.native
    def banUser(userId: Any, roomId: Any, reason: Any): js.Promise[Any] = js.native
    
    /* private */ var cachedVersions: Any = js.native
    
    /**
      * Determines the boundary conditions for this client's ability to change another user's power level
      * in a given room. This will identify the maximum possible level this client can change the user to,
      * and if that change could even be possible. If the returned object indicates that the client can
      * change the power level of the user, the client is able to set the power level to any value equal
      * to or less than the maximum value.
      * @param {string} targetUserId The user ID to compare against.
      * @param {string} roomId The room ID to compare within.
      * @returns {Promise<PowerLevelBounds>} The bounds of the client's ability to change the user's power level.
      */
    def calculatePowerLevelChangeBoundsOn(targetUserId: String, roomId: String): js.Promise[PowerLevelBounds] = js.native
    
    /**
      * Gets the current One Time Key counts.
      * @returns {Promise<OTKCounts>} Resolves to the One Time Key counts.
      */
    def checkOneTimeKeyCounts(): js.Promise[OTKCounts] = js.native
    
    /**
      * Claims One Time Keys for a set of user devices, returning those keys. The caller is expected to verify
      * and validate the returned keys.
      *
      * Failures with federation are reported in the returned object.
      * @param {Record<string, Record<string, OTKAlgorithm>>} userDeviceMap The map of user IDs to device IDs to
      * OTKAlgorithm to request a claim for.
      * @param {number} federationTimeoutMs The default timeout for claiming keys over federation. Defaults to
      * 10 seconds.
      */
    def claimOneTimeKeys(userDeviceMap: Record[String, Record[String, OTKAlgorithm]]): js.Promise[OTKClaimResponse] = js.native
    def claimOneTimeKeys(userDeviceMap: Record[String, Record[String, OTKAlgorithm]], federationTimeoutMs: Double): js.Promise[OTKClaimResponse] = js.native
    
    /**
      * Creates a room. See the RoomCreateOptions interface
      * for more information on what to provide for `properties`. Note that creating
      * a room may cause the bot/appservice to raise a join event.
      * @param {RoomCreateOptions} properties the properties of the room.
      * @returns {Promise<string>} resolves to the room ID that represents the room
      */
    def createRoom(): js.Promise[String] = js.native
    def createRoom(properties: RoomCreateOptions): js.Promise[String] = js.native
    
    /**
      * Adds a new room alias to the room directory
      * @param {string} alias The alias to add (eg: "#my-room:matrix.org")
      * @param {string} roomId The room ID to add the alias to
      * @returns {Promise} resolves when the alias has been added
      */
    def createRoomAlias(alias: String, roomId: String): js.Promise[Any] = js.native
    
    /**
      * Creates a Space room.
      * @param {SpaceCreateOptions} opts The creation options.
      * @returns {Promise<Space>} Resolves to the created space.
      */
    def createSpace(opts: SpaceCreateOptions): js.Promise[Space] = js.native
    
    /**
      * The crypto manager instance for this client. Generally speaking, this shouldn't
      * need to be accessed but is made available.
      *
      * Will be null/undefined if crypto is not possible.
      */
    val crypto: CryptoClient = js.native
    
    val cryptoStore: ICryptoStorageProvider = js.native
    
    /**
      * Removes a room alias from the room directory
      * @param {string} alias The alias to remove
      * @returns {Promise} resolves when the alias has been deleted
      */
    def deleteRoomAlias(alias: String): js.Promise[Any] = js.native
    
    /**
      * The DM manager instance for this client.
      */
    val dms: DMs = js.native
    
    /**
      * Performs a web request to the homeserver, applying appropriate authorization headers for
      * this client.
      * @param {"GET"|"POST"|"PUT"|"DELETE"} method The HTTP method to use in the request
      * @param {string} endpoint The endpoint to call. For example: "/_matrix/client/v3/account/whoami"
      * @param {any} qs The query string to send. Optional.
      * @param {any} body The request body to send. Optional. Will be converted to JSON unless the type is a Buffer.
      * @param {number} timeout The number of milliseconds to wait before timing out.
      * @param {boolean} raw If true, the raw response will be returned instead of the response body.
      * @param {string} contentType The content type to send. Only used if the `body` is a Buffer.
      * @param {string} noEncoding Set to true to disable encoding, and return a Buffer. Defaults to false
      * @returns {Promise<any>} Resolves to the response (body), rejected if a non-2xx status code was returned.
      */
    def doRequest(
      method: Any,
      endpoint: Any,
      qs: js.UndefOr[Any],
      body: js.UndefOr[Any],
      timeout: js.UndefOr[Double],
      raw: js.UndefOr[Boolean],
      contentType: js.UndefOr[String],
      noEncoding: js.UndefOr[Boolean]
    ): js.Promise[Any] = js.native
    
    /* protected */ def doSync(token: String): js.Promise[Any] = js.native
    
    /**
      * Determines if the server supports at least one of the given specification versions or not.
      * @param {string[]} versions The versions to look for. Eg: ["v1.1"]
      * @returns {Promise<boolean>} Resolves to true if the server supports any of the versions, false otherwise.
      */
    def doesServerSupportAnyOneVersion(versions: js.Array[String]): js.Promise[Boolean] = js.native
    
    /**
      * Determines if the server supports a given unstable feature flag. Useful for determining
      * if the server can support an unstable MSC.
      * @param {string} feature The feature name to look for.
      * @returns {Promise<boolean>} Resolves to true if the server supports the flag, false otherwise.
      */
    def doesServerSupportUnstableFeature(feature: String): js.Promise[Boolean] = js.native
    
    /**
      * Determines if the server supports a given version of the specification or not.
      * @param {string} version The version to look for. Eg: "v1.1"
      * @returns {Promise<boolean>} Resolves to true if the server supports the version, false otherwise.
      */
    def doesServerSupportVersion(version: String): js.Promise[Boolean] = js.native
    
    /**
      * Download content from the homeserver's media repository. Note that this will <b>not</b> automatically decrypt
      * media as it cannot determine if the media is encrypted.
      * @param {string} mxcUrl The MXC URI for the content.
      * @param {string} allowRemote Indicates to the server that it should not attempt to fetch the
      * media if it is deemed remote. This is to prevent routing loops where the server contacts itself.
      * Defaults to true if not provided.
      * @returns {Promise<{data: Buffer, contentType: string}>} Resolves to the downloaded content.
      */
    def downloadContent(mxcUrl: String): js.Promise[ContentType] = js.native
    def downloadContent(mxcUrl: String, allowRemote: Boolean): js.Promise[ContentType] = js.native
    
    /* private */ var eventProcessors: Any = js.native
    
    /* private */ var filterId: Any = js.native
    
    /**
      * Retrieves content from account data.
      * @param {string} eventType The type of account data to retrieve.
      * @returns {Promise<any>} Resolves to the content of that account data.
      */
    def getAccountData[T](eventType: String): js.Promise[T] = js.native
    
    /**
      * Gets all room members in the room, optionally at a given point in time.
      * @param {string} roomId The room ID to get members of.
      * @param {string} atToken Optional batch token to get members at. Leave falsy for "now".
      * @returns {Promise<MembershipEvent[]>} Resolves to the member events in the room.
      */
    def getAllRoomMembers(roomId: String): js.Promise[js.Array[MembershipEvent]] = js.native
    def getAllRoomMembers(roomId: String, atToken: String): js.Promise[js.Array[MembershipEvent]] = js.native
    
    /**
      * Gets the visibility of a room in the directory.
      * @param {string} roomId The room ID to query the visibility of
      * @return {Promise<"public"|"private">} The visibility of the room
      */
    def getDirectoryVisibility(roomId: String): js.Promise[public | `private`] = js.native
    
    /**
      * Gets an event for a room. If the event is encrypted, and the client supports encryption,
      * and the room is encrypted, then this will return a decrypted event.
      * @param {string} roomId the room ID to get the event in
      * @param {string} eventId the event ID to look up
      * @returns {Promise<any>} resolves to the found event
      */
    def getEvent(roomId: String, eventId: String): js.Promise[Any] = js.native
    
    /**
      * Gets the context surrounding an event.
      * @param {string} roomId The room ID to get the context in.
      * @param {string} eventId The event ID to get the context of.
      * @param {number} limit The maximum number of events to return on either side of the event.
      * @returns {Promise<EventContext>} The context of the event
      */
    def getEventContext(roomId: String, eventId: String): js.Promise[EventContext] = js.native
    def getEventContext(roomId: String, eventId: String, limit: Double): js.Promise[EventContext] = js.native
    
    /**
      * Acquires an identity server client for communicating with an identity server. Note that
      * this will automatically do the login portion to establish a usable token with the identity
      * server provided, but it will not automatically accept any terms of service.
      *
      * The identity server name provided will in future be resolved to a server address - for now
      * that resolution is assumed to be prefixing the name with `https://`.
      * @param {string} identityServerName The domain of the identity server to connect to.
      * @returns {Promise<IdentityClient>} Resolves to a prepared identity client.
      */
    def getIdentityServerClient(identityServerName: String): js.Promise[IdentityClient] = js.native
    
    /**
      * Gets the joined members in a room. The client must be in the room to make this request.
      * @param {string} roomId The room ID to get the joined members of.
      * @returns {Promise<string>} The joined user IDs in the room
      */
    def getJoinedRoomMembers(roomId: String): js.Promise[js.Array[String]] = js.native
    
    /**
      * Gets the joined members in a room, as an object mapping userIds to profiles. The client must be in the room to make this request.
      * @param {string} roomId The room ID to get the joined members of.
      * @returns {Object} The joined user IDs in the room as an object mapped to a set of profiles.
      */
    def getJoinedRoomMembersWithProfiles(roomId: String): js.Promise[StringDictionary[Avatarurl]] = js.native
    
    /**
      * Gets a list of joined room IDs
      * @returns {Promise<string[]>} resolves to a list of room IDs the client participates in
      */
    def getJoinedRooms(): js.Promise[js.Array[String]] = js.native
    
    /**
      * Retrieves an OpenID Connect token from the homeserver for the current user.
      * @returns {Promise<OpenIDConnectToken>} Resolves to the token.
      */
    def getOpenIDConnectToken(): js.Promise[OpenIDConnectToken] = js.native
    
    /**
      * Gets a device list for the client's own account, with metadata. The devices are not verified
      * in this response, but should be active on the account.
      * @returns {Promise<OwnUserDevice[]>} Resolves to the active devices on the account.
      */
    def getOwnDevices(): js.Promise[js.Array[OwnUserDevice]] = js.native
    
    /**
      * Gets the presence information for the current user.
      * @returns {Promise<Presence>} Resolves to the presence status of the user.
      */
    def getPresenceStatus(): js.Promise[Presence] = js.native
    
    /**
      * Gets the presence information for a given user.
      * @param {string} userId The user ID to look up the presence of.
      * @returns {Promise<Presence>} Resolves to the presence status of the user.
      */
    def getPresenceStatusFor(userId: String): js.Promise[Presence] = js.native
    
    /**
      * Gets a published alias for the given room. These are supplied by the room admins
      * and should point to the room, but may not. This is primarily intended to be used
      * in the context of rendering a mention (pill) for a room.
      * @param {string} roomIdOrAlias The room ID or alias to get an alias for.
      * @returns {Promise<string>} Resolves to a published room alias, or falsey if none found.
      */
    def getPublishedAlias(roomIdOrAlias: String): js.Promise[String] = js.native
    
    /**
      * Gets an event for a room. Returned as a raw event.
      * @param {string} roomId the room ID to get the event in
      * @param {string} eventId the event ID to look up
      * @returns {Promise<any>} resolves to the found event
      */
    def getRawEvent(roomId: String, eventId: String): js.Promise[Any] = js.native
    
    /**
      * Retrieves content from room account data.
      * @param {string} eventType The type of room account data to retrieve.
      * @param {string} roomId The room to read the account data from.
      * @returns {Promise<any>} Resolves to the content of that account data.
      */
    def getRoomAccountData[T](eventType: String, roomId: String): js.Promise[T] = js.native
    
    /**
      * Gets the membership events of users in the room. Defaults to all membership
      * types, though this can be controlled with the membership and notMembership
      * arguments. To change the point in time, use the batchToken.
      * @param {string} roomId The room ID to get members in.
      * @param {string} batchToken The point in time to get members at (or null for 'now')
      * @param {string[]} membership The membership kinds to search for.
      * @param {string[]} notMembership The membership kinds to not search for.
      * @returns {Promise<MembershipEvent[]>} Resolves to the membership events of the users in the room.
      * @see getRoomMembersByMembership
      * @see getRoomMembersWithoutMembership
      * @see getAllRoomMembers
      */
    def getRoomMembers(roomId: String): js.Promise[js.Array[MembershipEvent]] = js.native
    def getRoomMembers(roomId: String, batchToken: String): js.Promise[js.Array[MembershipEvent]] = js.native
    def getRoomMembers(roomId: String, batchToken: String, membership: js.Array[Membership]): js.Promise[js.Array[MembershipEvent]] = js.native
    def getRoomMembers(
      roomId: String,
      batchToken: String,
      membership: js.Array[Membership],
      notMembership: js.Array[Membership]
    ): js.Promise[js.Array[MembershipEvent]] = js.native
    def getRoomMembers(roomId: String, batchToken: String, membership: Unit, notMembership: js.Array[Membership]): js.Promise[js.Array[MembershipEvent]] = js.native
    def getRoomMembers(roomId: String, batchToken: Unit, membership: js.Array[Membership]): js.Promise[js.Array[MembershipEvent]] = js.native
    def getRoomMembers(
      roomId: String,
      batchToken: Unit,
      membership: js.Array[Membership],
      notMembership: js.Array[Membership]
    ): js.Promise[js.Array[MembershipEvent]] = js.native
    def getRoomMembers(roomId: String, batchToken: Unit, membership: Unit, notMembership: js.Array[Membership]): js.Promise[js.Array[MembershipEvent]] = js.native
    
    /* private */ var getRoomMembersAt: Any = js.native
    
    /**
      * Gets the membership events of users in the room which have a particular membership type. To change
      * the point in time the server should return membership events at, use `atToken`.
      * @param {string} roomId The room ID to get members in.
      * @param {Membership} membership The membership to search for.
      * @param {string?} atToken Optional batch token to use, or null for "now".
      * @returns {Promise<MembershipEvent[]>} Resolves to the membership events of the users in the room.
      */
    def getRoomMembersByMembership(roomId: String, membership: Membership): js.Promise[js.Array[MembershipEvent]] = js.native
    def getRoomMembersByMembership(roomId: String, membership: Membership, atToken: String): js.Promise[js.Array[MembershipEvent]] = js.native
    
    /**
      * Gets the membership events of users in the room which lack a particular membership type. To change
      * the point in time the server should return membership events at, use `atToken`.
      * @param {string} roomId The room ID to get members in.
      * @param {Membership} notMembership The membership to NOT search for.
      * @param {string?} atToken Optional batch token to use, or null for "now".
      * @returns {Promise<MembershipEvent[]>} Resolves to the membership events of the users in the room.
      */
    def getRoomMembersWithoutMembership(roomId: String, notMembership: Membership): js.Promise[js.Array[MembershipEvent]] = js.native
    def getRoomMembersWithoutMembership(roomId: String, notMembership: Membership, atToken: String): js.Promise[js.Array[MembershipEvent]] = js.native
    
    /**
      * Gets the room state for the given room. Returned as raw events.
      * @param {string} roomId the room ID to get state for
      * @returns {Promise<any[]>} resolves to the room's state
      */
    def getRoomState(roomId: String): js.Promise[js.Array[Any]] = js.native
    
    /**
      * Gets a state event for a given room of a given type under the given state key.
      * @param {string} roomId the room ID
      * @param {string} type the event type
      * @param {String} stateKey the state key
      * @returns {Promise<any>} resolves to the state event
      */
    def getRoomStateEvent(roomId: Any, `type`: Any, stateKey: Any): js.Promise[Any] = js.native
    
    /**
      * Gets the state events for a given room of a given type under the given state key.
      * @param {string} roomId the room ID
      * @param {string} type the event type
      * @param {String} stateKey the state key, falsey if not needed
      * @returns {Promise<any|any[]>} resolves to the state event(s)
      * @deprecated It is not possible to get an array of events - use getRoomStateEvent instead
      */
    def getRoomStateEvents(roomId: Any, `type`: Any, stateKey: Any): js.Promise[Any | js.Array[Any]] = js.native
    
    /**
      * Determines the upgrade history for a given room as a doubly-linked list styled structure. Given
      * a room ID in the history of upgrades, the resulting `previous` array will hold any rooms which
      * are older than the given room. The resulting `newer` array will hold any rooms which are newer
      * versions of the room. Both arrays will be defined, but may be empty individually. Element zero
      * of each will always be the nearest to the given room ID and the last element will be the furthest
      * from the room. The given room will never be in either array.
      * @param {string} roomId the room ID to get the history of
      * @returns {Promise<{previous: RoomReference[], newer: RoomReference[]}>} Resolves to the room's
      * upgrade history
      */
    def getRoomUpgradeHistory(roomId: String): js.Promise[Current] = js.native
    
    /**
      * Retrieves content from account data. If the account data request throws an error,
      * this simply returns the default provided.
      * @param {string} eventType The type of account data to retrieve.
      * @param {any} defaultContent The default value. Defaults to null.
      * @returns {Promise<any>} Resolves to the content of that account data, or the default.
      */
    def getSafeAccountData[T](eventType: String): js.Promise[T] = js.native
    def getSafeAccountData[T](eventType: String, defaultContent: T): js.Promise[T] = js.native
    
    /**
      * Retrieves content from room account data. If the account data request throws an error,
      * this simply returns the default provided.
      * @param {string} eventType The type of room account data to retrieve.
      * @param {string} roomId The room to read the account data from.
      * @param {any} defaultContent The default value. Defaults to null.
      * @returns {Promise<any>} Resolves to the content of that room account data, or the default.
      */
    def getSafeRoomAccountData[T](eventType: String, roomId: String): js.Promise[T] = js.native
    def getSafeRoomAccountData[T](eventType: String, roomId: String, defaultContent: T): js.Promise[T] = js.native
    
    /**
      * Retrieves the server's supported specification versions and unstable features.
      * @returns {Promise<ServerVersions>} Resolves to the server's supported versions.
      */
    def getServerVersions(): js.Promise[ServerVersions] = js.native
    
    /**
      * Gets a Space.
      * This API does not work with unstable spaces (e.g. org.matrix.msc.1772.space)
      *
      * @throws If the room is not a space or there was an error
      * @returns {Promise<Space>} Resolves to the space.
      */
    def getSpace(roomIdOrAlias: String): js.Promise[Space] = js.native
    
    /**
      * Gets <b>unverified</b> device lists for the given users. The caller is expected to validate
      * and verify the device lists, including that the returned devices belong to the claimed users.
      *
      * Failures with federation are reported in the returned object. Users which did not fail a federation
      * lookup but have no devices will not appear in either the failures or in the returned devices.
      *
      * See https://matrix.org/docs/spec/client_server/r0.6.1#post-matrix-client-r0-keys-query for more
      * information.
      * @param {string[]} userIds The user IDs to query.
      * @param {number} federationTimeoutMs The default timeout for requesting devices over federation. Defaults to
      * 10 seconds.
      * @returns {Promise<MultiUserDeviceListResponse>} Resolves to the device list/errors for the requested user IDs.
      */
    def getUserDevices(userIds: js.Array[String]): js.Promise[MultiUserDeviceListResponse] = js.native
    def getUserDevices(userIds: js.Array[String], federationTimeoutMs: Double): js.Promise[MultiUserDeviceListResponse] = js.native
    
    /**
      * Gets the current user ID for this client
      * @returns {Promise<string>} The user ID of this client
      */
    def getUserId(): js.Promise[String] = js.native
    
    /**
      * Gets the profile for a given user
      * @param {string} userId the user ID to lookup
      * @returns {Promise<any>} the profile of the user
      */
    def getUserProfile(userId: String): js.Promise[Any] = js.native
    
    /**
      * Gets the user's information from the server directly.
      * @returns {Promise<IWhoAmI>} The "who am I" response.
      */
    def getWhoAmI(): js.Promise[IWhoAmI] = js.native
    
    val homeserverUrl: String = js.native
    
    /**
      * Sets a user ID to impersonate as. This will assume that the access token for this client
      * is for an application service, and that the userId given is within the reach of the
      * application service. Setting this to null will stop future impersonation. The user ID is
      * assumed to already be valid
      * @param {string} userId The user ID to masquerade as, or `null` to clear masquerading.
      * @param {string} deviceId Optional device ID to impersonate under the given user, if supported
      * by the server. Check the whoami response after setting.
      */
    def impersonateUserId(): Unit = js.native
    def impersonateUserId(userId: String): Unit = js.native
    def impersonateUserId(userId: String, deviceId: String): Unit = js.native
    def impersonateUserId(userId: Null, deviceId: String): Unit = js.native
    
    /* private */ var impersonatedDeviceId: Any = js.native
    
    /* private */ var impersonatedUserId: Any = js.native
    
    /**
      * Invites a user to a room.
      * @param {string} userId the user ID to invite
      * @param {string} roomId the room ID to invite the user to
      * @returns {Promise<any>} resolves when completed
      */
    def inviteUser(userId: Any, roomId: Any): js.Promise[Any] = js.native
    
    /**
      * Joins the given room
      * @param {string} roomIdOrAlias the room ID or alias to join
      * @param {string[]} viaServers the server names to try and join through
      * @returns {Promise<string>} resolves to the joined room ID
      */
    def joinRoom(roomIdOrAlias: String): js.Promise[String] = js.native
    def joinRoom(roomIdOrAlias: String, viaServers: js.Array[String]): js.Promise[String] = js.native
    
    /* private */ var joinStrategy: Any = js.native
    
    /**
      * Kicks a user from a room.
      * @param {string} userId the user ID to kick
      * @param {string} roomId the room ID to kick the user in
      * @param {string?} reason optional reason for the kick
      * @returns {Promise<any>} resolves when completed
      */
    def kickUser(userId: Any, roomId: Any): js.Promise[Any] = js.native
    def kickUser(userId: Any, roomId: Any, reason: Any): js.Promise[Any] = js.native
    
    /* private */ var lastJoinedRoomIds: Any = js.native
    
    /**
      * Leaves the given room
      * @param {string} roomId the room ID to leave
      * @returns {Promise<any>} resolves when left
      */
    def leaveRoom(roomId: String): js.Promise[Any] = js.native
    
    /**
      * Does a room directory lookup for a given room alias
      * @param {string} roomAlias the room alias to look up in the room directory
      * @returns {Promise<RoomDirectoryLookupResponse>} resolves to the room's information
      */
    def lookupRoomAlias(roomAlias: String): js.Promise[RoomDirectoryLookupResponse] = js.native
    
    /**
      * The metrics instance for this client
      */
    def metrics: Metrics = js.native
    
    /* private */ var metricsInstance: Any = js.native
    
    /**
      * Assigns a new metrics instance, overwriting the old one.
      * @param {Metrics} metrics The new metrics instance.
      */
    def metrics_=(metrics: Metrics): Unit = js.native
    
    /**
      * Converts a MXC URI to an HTTP URL.
      * @param {string} mxc The MXC URI to convert
      * @returns {string} The HTTP URL for the content.
      */
    def mxcToHttp(mxc: String): String = js.native
    
    /**
      * Converts a MXC URI to an HTTP URL for downsizing the content.
      * @param {string} mxc The MXC URI to convert and downsize.
      * @param {number} width The width, as an integer, for the thumbnail.
      * @param {number} height The height, as an intenger, for the thumbnail.
      * @param {"crop"|"scale"} method Whether to crop or scale (preserve aspect ratio) the content.
      * @returns {string} The HTTP URL for the downsized content.
      */
    def mxcToHttpThumbnail(mxc: String, width: Double, height: Double, method: crop | scale): String = js.native
    
    /**
      * Set this to true to have the client only persist the sync token after the sync
      * has been processed successfully. Note that if this is true then when the sync
      * loop throws an error the client will not persist a token.
      */
    /* protected */ var persistTokenAfterSync: Boolean = js.native
    
    /* private */ var processEvent: Any = js.native
    
    /* protected */ def processSync(raw: Any): js.Promise[Any] = js.native
    /* protected */ def processSync(raw: Any, emitFn: js.Function2[/* emitEventType */ String, /* repeated */ Any, js.Promise[Any]]): js.Promise[Any] = js.native
    
    /**
      * Redact an event in a given room
      * @param {string} roomId the room ID to send the redaction to
      * @param {string} eventId the event ID to redact
      * @param {String} reason an optional reason for redacting the event
      * @returns {Promise<string>} resolves to the event ID that represents the redaction
      */
    def redactEvent(roomId: String, eventId: String): js.Promise[String] = js.native
    def redactEvent(roomId: String, eventId: String, reason: String): js.Promise[String] = js.native
    
    /**
      * Replies to a given event with the given HTML. The event is sent with a msgtype of m.notice.
      * The message will be encrypted if the client supports encryption and the room is encrypted.
      * @param {string} roomId the room ID to reply in
      * @param {any} event the event to reply to
      * @param {string} html the HTML to reply with.
      * @returns {Promise<string>} resolves to the event ID which was sent
      */
    def replyHtmlNotice(roomId: String, event: Any, html: String): js.Promise[String] = js.native
    
    /**
      * Replies to a given event with the given HTML. The event is sent with a msgtype of m.text.
      * The message will be encrypted if the client supports encryption and the room is encrypted.
      * @param {string} roomId the room ID to reply in
      * @param {any} event the event to reply to
      * @param {string} html the HTML to reply with.
      * @returns {Promise<string>} resolves to the event ID which was sent
      */
    def replyHtmlText(roomId: String, event: Any, html: String): js.Promise[String] = js.native
    
    /**
      * Replies to a given event with the given text. The event is sent with a msgtype of m.notice.
      * The message will be encrypted if the client supports encryption and the room is encrypted.
      * @param {string} roomId the room ID to reply in
      * @param {any} event the event to reply to
      * @param {string} text the text to reply with
      * @param {string} html the HTML to reply with, or falsey to use the `text`
      * @returns {Promise<string>} resolves to the event ID which was sent
      */
    def replyNotice(roomId: String, event: Any, text: String): js.Promise[String] = js.native
    def replyNotice(roomId: String, event: Any, text: String, html: String): js.Promise[String] = js.native
    
    /**
      * Replies to a given event with the given text. The event is sent with a msgtype of m.text.
      * The message will be encrypted if the client supports encryption and the room is encrypted.
      * @param {string} roomId the room ID to reply in
      * @param {any} event the event to reply to
      * @param {string} text the text to reply with
      * @param {string} html the HTML to reply with, or falsey to use the `text`
      * @returns {Promise<string>} resolves to the event ID which was sent
      */
    def replyText(roomId: String, event: Any, text: String): js.Promise[String] = js.native
    def replyText(roomId: String, event: Any, text: String, html: String): js.Promise[String] = js.native
    
    /* private */ var requestId: Any = js.native
    
    /**
      * Resolves a room ID or alias to a room ID. If the given ID or alias looks like a room ID
      * already, it will be returned as-is. If the room ID or alias looks like a room alias, it
      * will be resolved to a room ID if possible. If the room ID or alias is neither, an error
      * will be raised.
      * @param {string} roomIdOrAlias the room ID or alias to resolve to a room ID
      * @returns {Promise<string>} resolves to the room ID
      */
    def resolveRoom(roomIdOrAlias: String): js.Promise[String] = js.native
    
    /**
      * Sends an event to the given room. This will encrypt the event before sending if the room is
      * encrypted and the client supports encryption. Use sendRawEvent() to avoid this behaviour.
      * @param {string} roomId the room ID to send the event to
      * @param {string} eventType the type of event to send
      * @param {string} content the event body to send
      * @returns {Promise<string>} resolves to the event ID that represents the event
      */
    def sendEvent(roomId: String, eventType: String, content: Any): js.Promise[String] = js.native
    
    /**
      * Sends a notice to the given room with HTML content. The message will be encrypted if the client supports
      * encryption and the room is encrypted.
      * @param {string} roomId the room ID to send the notice to
      * @param {string} html the HTML to send
      * @returns {Promise<string>} resolves to the event ID that represents the message
      */
    def sendHtmlNotice(roomId: String, html: String): js.Promise[String] = js.native
    
    /**
      * Sends a text message to the given room with HTML content. The message will be encrypted if the client supports
      * encryption and the room is encrypted.
      * @param {string} roomId the room ID to send the text to
      * @param {string} html the HTML to send
      * @returns {Promise<string>} resolves to the event ID that represents the message
      */
    def sendHtmlText(roomId: String, html: String): js.Promise[String] = js.native
    
    /**
      * Sends a message to the given room. The message will be encrypted if the client supports
      * encryption and the room is encrypted.
      * @param {string} roomId the room ID to send the message to
      * @param {object} content the event content to send
      * @returns {Promise<string>} resolves to the event ID that represents the message
      */
    def sendMessage(roomId: String, content: Any): js.Promise[String] = js.native
    
    /**
      * Sends a notice to the given room. The message will be encrypted if the client supports
      * encryption and the room is encrypted.
      * @param {string} roomId the room ID to send the notice to
      * @param {string} text the text to send
      * @returns {Promise<string>} resolves to the event ID that represents the message
      */
    def sendNotice(roomId: String, text: String): js.Promise[String] = js.native
    
    /**
      * Sends an event to the given room.
      * @param {string} roomId the room ID to send the event to
      * @param {string} eventType the type of event to send
      * @param {string} content the event body to send
      * @returns {Promise<string>} resolves to the event ID that represents the event
      */
    def sendRawEvent(roomId: String, eventType: String, content: Any): js.Promise[String] = js.native
    
    /**
      * Sends a read receipt for an event in a room
      * @param {string} roomId the room ID to send the receipt to
      * @param {string} eventId the event ID to set the receipt at
      * @returns {Promise<any>} resolves when the receipt has been sent
      */
    def sendReadReceipt(roomId: String, eventId: String): js.Promise[Any] = js.native
    
    /**
      * Sends a state event to the given room
      * @param {string} roomId the room ID to send the event to
      * @param {string} type the event type to send
      * @param {string} stateKey the state key to send, should not be null
      * @param {string} content the event body to send
      * @returns {Promise<string>} resolves to the event ID that represents the message
      */
    def sendStateEvent(roomId: String, `type`: String, stateKey: String, content: Any): js.Promise[String] = js.native
    
    /**
      * Sends a text message to the given room. The message will be encrypted if the client supports
      * encryption and the room is encrypted.
      * @param {string} roomId the room ID to send the text to
      * @param {string} text the text to send
      * @returns {Promise<string>} resolves to the event ID that represents the message
      */
    def sendText(roomId: String, text: String): js.Promise[String] = js.native
    
    /**
      * Sends to-device messages to the respective users/devices.
      * @param {string} type The message type being sent.
      * @param {Record<string, Record<string, any>>} messages The messages to send, mapped as user ID to
      * device ID (or "*" to denote all of the user's devices) to message payload (content).
      * @returns {Promise<void>} Resolves when complete.
      */
    def sendToDevices(`type`: String, messages: Record[String, Record[String, Any]]): js.Promise[Unit] = js.native
    
    /**
      * Sets account data.
      * @param {string} eventType The type of account data to set
      * @param {any} content The content to set
      * @returns {Promise<any>} Resolves when updated
      */
    def setAccountData(eventType: String, content: Any): js.Promise[Any] = js.native
    
    /**
      * Sets a new avatar url for the user.
      * @param {string} avatarUrl the new avatar URL for the user, in the form of a Matrix Content URI
      * @returns {Promise<any>} resolves when complete
      */
    def setAvatarUrl(avatarUrl: String): js.Promise[Any] = js.native
    
    /**
      * Sets the visibility of a room in the directory.
      * @param {string} roomId The room ID to manipulate the visibility of
      * @param {"public" | "private"} visibility The visibility to set for the room
      * @return {Promise} resolves when the visibility has been updated
      */
    def setDirectoryVisibility(roomId: String, visibility: public | `private`): js.Promise[Any] = js.native
    
    /**
      * Sets a new display name for the user.
      * @param {string} displayName the new display name for the user, or null to clear
      * @returns {Promise<any>} resolves when complete
      */
    def setDisplayName(displayName: String): js.Promise[Any] = js.native
    
    /**
      * Sets the strategy to use for when joinRoom is called on this client
      * @param {IJoinRoomStrategy} strategy The strategy to use, or null to use none
      */
    def setJoinStrategy(strategy: IJoinRoomStrategy): Unit = js.native
    
    /**
      * Sets the presence status for the current user.
      * @param {"online"|"offline"|"unavailable"} presence The new presence state for the user.
      * @param {string?} statusMessage Optional status message to include with the presence.
      * @returns {Promise<any>} Resolves when complete.
      */
    def setPresenceStatus(presence: online | offline | unavailable): js.Promise[Any] = js.native
    def setPresenceStatus(presence: online | offline | unavailable, statusMessage: String): js.Promise[Any] = js.native
    
    /**
      * Sets room account data.
      * @param {string} eventType The type of room account data to set
      * @param {string} roomId The room to set account data in
      * @param {any} content The content to set
      * @returns {Promise<any>} Resolves when updated
      */
    def setRoomAccountData(eventType: String, roomId: String, content: Any): js.Promise[Any] = js.native
    
    /**
      * Sets the typing status of the current user in a room
      * @param {string} roomId the room ID the user is typing in
      * @param {boolean} typing is the user currently typing
      * @param {number} timeout how long should the server preserve the typing state, in milliseconds
      * @returns {Promise<any>} resolves when the typing state has been set
      */
    def setTyping(roomId: String, typing: Boolean): js.Promise[Any] = js.native
    def setTyping(roomId: String, typing: Boolean, timeout: Double): js.Promise[Any] = js.native
    
    /**
      * Sets the power level for a given user ID in the given room. Note that this is not safe to
      * call multiple times concurrently as changes are not atomic. This will throw an error if
      * the user lacks enough permission to change the power level, or if a power level event is
      * missing from the room.
      * @param {string} userId The user ID to change
      * @param {string} roomId The room ID to change the power level in
      * @param {number} newLevel The integer power level to set the user to.
      * @returns {Promise<any>} Resolves when complete.
      */
    def setUserPowerLevel(userId: String, roomId: String, newLevel: Double): js.Promise[Any] = js.native
    
    /**
      * Starts syncing the client with an optional filter
      * @param {any} filter The filter to use, or null for none
      * @returns {Promise<any>} Resolves when the client has started syncing
      */
    def start(): js.Promise[Any] = js.native
    def start(filter: Any): js.Promise[Any] = js.native
    
    /* protected */ def startSync(): js.Promise[Unit] = js.native
    /* protected */ def startSync(emitFn: js.Function2[/* emitEventType */ String, /* repeated */ Any, js.Promise[Any]]): js.Promise[Unit] = js.native
    
    /* protected */ def startSyncInternal(): js.Promise[Any] = js.native
    
    /**
      * Stops the client from syncing.
      */
    def stop(): Unit = js.native
    
    /* private */ var stopSyncing: Any = js.native
    
    /* private */ var storage: Any = js.native
    
    /**
      * The storage provider for this client. Direct access is usually not required.
      */
    def storageProvider: IStorageProvider = js.native
    
    /**
      * The presence status to use while syncing. The valid values are "online" to set the account as online,
      * "offline" to set the user as offline, "unavailable" for marking the user away, and null for not setting
      * an explicit presence (the default).
      *
      * Has no effect if the client is not syncing. Does not apply until the next sync request.
      */
    var syncingPresence: online | offline | unavailable | Null = js.native
    
    /**
      * The number of milliseconds to wait for new events for on the next sync.
      *
      * Has no effect if the client is not syncing. Does not apply until the next sync request.
      */
    var syncingTimeout: Double = js.native
    
    /**
      * Unbans a user in a room.
      * @param {string} userId the user ID to unban
      * @param {string} roomId the room ID to lift the ban in
      * @returns {Promise<any>} resolves when completed
      */
    def unbanUser(userId: Any, roomId: Any): js.Promise[Any] = js.native
    
    /**
      * Gets the unstable API access class. This is generally not recommended to be
      * used by clients.
      * @return {UnstableApis} The unstable API access class.
      */
    def unstableApis: UnstableApis = js.native
    
    /* private */ var unstableApisInstance: Any = js.native
    
    /**
      * Uploads data to the homeserver's media repository. Note that this will <b>not</b> automatically encrypt
      * media as it cannot determine if the media should be encrypted.
      * @param {Buffer} data the content to upload.
      * @param {string} contentType the content type of the file. Defaults to application/octet-stream
      * @param {string} filename the name of the file. Optional.
      * @returns {Promise<string>} resolves to the MXC URI of the content
      */
    def uploadContent(data: Buffer): js.Promise[String] = js.native
    def uploadContent(data: Buffer, contentType: String): js.Promise[String] = js.native
    def uploadContent(data: Buffer, contentType: String, filename: String): js.Promise[String] = js.native
    def uploadContent(data: Buffer, contentType: Unit, filename: String): js.Promise[String] = js.native
    
    /**
      * Uploads data to the homeserver's media repository after downloading it from the
      * provided URL.
      * @param {string} url The URL to download content from.
      * @returns {Promise<string>} Resolves to the MXC URI of the content
      */
    def uploadContentFromUrl(url: String): js.Promise[String] = js.native
    
    /**
      * Uploads One Time Keys for the current device.
      * @param {OTKs} keys The keys to upload.
      * @returns {Promise<OTKCounts>} Resolves to the current One Time Key counts when complete.
      */
    def uploadDeviceOneTimeKeys(keys: OTKs): js.Promise[OTKCounts] = js.native
    
    /**
      * Uploads a fallback One Time Key to the server for usage. This will replace the existing fallback
      * key.
      * @param {FallbackKey} fallbackKey The fallback key.
      * @returns {Promise<OTKCounts>} Resolves to the One Time Key counts.
      */
    def uploadFallbackKey(fallbackKey: FallbackKey): js.Promise[OTKCounts] = js.native
    
    /**
      * Checks if a given user has a required power level required to send the given event.
      * @param {string} userId the user ID to check the power level of
      * @param {string} roomId the room ID to check the power level in
      * @param {string} eventType the event type to look for in the `events` property of the power levels
      * @param {boolean} isState true to indicate the event is intended to be a state event
      * @returns {Promise<boolean>} resolves to true if the user has the required power level, resolves to false otherwise
      */
    def userHasPowerLevelFor(userId: String, roomId: String, eventType: String, isState: Boolean): js.Promise[Boolean] = js.native
    
    /**
      * Checks if a given user has a required power level to perform the given action
      * @param {string} userId the user ID to check the power level of
      * @param {string} roomId the room ID to check the power level in
      * @param {PowerLevelAction} action the action to check power level for
      * @returns {Promise<boolean>} resolves to true if the user has the required power level, resolves to false otherwise
      */
    def userHasPowerLevelForAction(userId: String, roomId: String, action: PowerLevelAction): js.Promise[Boolean] = js.native
    
    /* private */ var userId: Any = js.native
    
    /* private */ var versionsLastFetched: Any = js.native
  }
  
  trait RoomDirectoryLookupResponse extends StObject {
    
    var residentServers: js.Array[String]
    
    var roomId: String
  }
  object RoomDirectoryLookupResponse {
    
    inline def apply(residentServers: js.Array[String], roomId: String): RoomDirectoryLookupResponse = {
      val __obj = js.Dynamic.literal(residentServers = residentServers.asInstanceOf[js.Any], roomId = roomId.asInstanceOf[js.Any])
      __obj.asInstanceOf[RoomDirectoryLookupResponse]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: RoomDirectoryLookupResponse] (val x: Self) extends AnyVal {
      
      inline def setResidentServers(value: js.Array[String]): Self = StObject.set(x, "residentServers", value.asInstanceOf[js.Any])
      
      inline def setResidentServersVarargs(value: String*): Self = StObject.set(x, "residentServers", js.Array(value*))
      
      inline def setRoomId(value: String): Self = StObject.set(x, "roomId", value.asInstanceOf[js.Any])
    }
  }
  
  trait RoomReference extends StObject {
    
    /**
      * If going backwards, the tombstone event ID, otherwise the creation
      * event. If the room can't be verified, this will be null. Will be
      * null if this reference is to the current room.
      */
    var refEventId: String
    
    /**
      * The room ID being referenced
      */
    var roomId: String
    
    /**
      * The version of the room at the time
      */
    var version: String
  }
  object RoomReference {
    
    inline def apply(refEventId: String, roomId: String, version: String): RoomReference = {
      val __obj = js.Dynamic.literal(refEventId = refEventId.asInstanceOf[js.Any], roomId = roomId.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
      __obj.asInstanceOf[RoomReference]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: RoomReference] (val x: Self) extends AnyVal {
      
      inline def setRefEventId(value: String): Self = StObject.set(x, "refEventId", value.asInstanceOf[js.Any])
      
      inline def setRoomId(value: String): Self = StObject.set(x, "roomId", value.asInstanceOf[js.Any])
      
      inline def setVersion(value: String): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
    }
  }
}
