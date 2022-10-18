package typings.matrixJsSdk.mod

import org.scalablytyped.runtime.StringDictionary
import typings.matrixJsSdk.anon.AllowJoin
import typings.matrixJsSdk.anon.Appdisplayname
import typings.matrixJsSdk.anon.Body
import typings.matrixJsSdk.anon.Callback
import typings.matrixJsSdk.anon.DisablePresence
import typings.matrixJsSdk.anon.Displayname
import typings.matrixJsSdk.anon.InviteSignUrl
import typings.matrixJsSdk.anon.Keys
import typings.matrixJsSdk.anon.Limit
import typings.matrixJsSdk.anon.LimitTerm
import typings.matrixJsSdk.anon.Limited
import typings.matrixJsSdk.anon.Longdescription
import typings.matrixJsSdk.anon.Presence
import typings.matrixJsSdk.anon.Reason
import typings.matrixJsSdk.anon.Replacementroom
import typings.matrixJsSdk.anon.Roomalias
import typings.matrixJsSdk.anon.Term
import typings.node.eventsMod.EventEmitter
import typings.node.eventsMod.EventEmitterOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("matrix-js-sdk", "MatrixClient")
@js.native
open class MatrixClient () extends EventEmitter {
  def this(options: EventEmitterOptions) = this()
  
  var _http: Any = js.native
  
  def acceptGroupInvite(groupId: String, opts: js.Object): js.Promise[Unit] = js.native
  
  def addPushRule(scope: String, kind: String, ruleId: String, body: js.Object): js.Promise[Unit] = js.native
  def addPushRule(scope: String, kind: String, ruleId: String, body: js.Object, callback: js.Function0[Unit]): js.Promise[Unit] = js.native
  
  def addRoomToGroup(groupId: String, roomId: String, isPublic: Boolean): js.Promise[Unit] = js.native
  
  def addRoomToGroupSummary(groupId: String, roomId: String): js.Promise[Unit] = js.native
  def addRoomToGroupSummary(groupId: String, roomId: String, categoryId: String): js.Promise[Unit] = js.native
  
  def addThreePid(creds: js.Object, bind: Boolean): js.Promise[Unit] = js.native
  def addThreePid(
    creds: js.Object,
    bind: Boolean,
    callback: js.Function2[/* err */ Null | js.Object, /* data */ Any, Unit]
  ): js.Promise[Unit] = js.native
  
  def addUserToGroupSummary(groupId: String, userId: String): js.Promise[Unit] = js.native
  def addUserToGroupSummary(groupId: String, userId: String, roleId: String): js.Promise[Unit] = js.native
  
  def backPaginateRoomEventsSearch(searchResults: js.Object): js.Promise[js.Object] = js.native
  
  def ban(roomId: String, userId: String, reason: String): js.Promise[Unit] = js.native
  def ban(
    roomId: String,
    userId: String,
    reason: String,
    callback: js.Function2[/* err */ Null | js.Object, /* data */ Any, Unit]
  ): js.Promise[Unit] = js.native
  
  def beginKeyVerification(method: String, userId: String, deviceId: String): js.Promise[js.Object] = js.native
  
  def cancelAndResendEventRoomKeyRequest(event: MatrixEvent[EventContentTypeMessage, EventType]): js.Promise[Unit] = js.native
  
  def cancelPendingEvent(event: MatrixEvent[EventContentTypeMessage, EventType]): js.Promise[Unit] = js.native
  
  def cancelUpload(promise: js.Promise[Unit]): Boolean = js.native
  
  def checkKeyBackup(): js.Object = js.native
  
  def claimOneTimeKeys(devices: js.Array[String], key_algorithm: String): js.Promise[js.Object] = js.native
  
  def clearStores(): js.Promise[Unit] = js.native
  
  def createAlias(alias: String, roomId: String): js.Promise[Unit] = js.native
  def createAlias(alias: String, roomId: String, callback: MatrixCallback): js.Promise[Unit] = js.native
  
  def createFilter(content: js.Object): js.Promise[Filter] = js.native
  
  def createGroup(content: js.Object): js.Promise[StringDictionary[String]] = js.native
  
  def createKeyBackupVersion(info: js.Object): js.Promise[js.Object] = js.native
  
  def createRoom(options: CreateRoomOptions): js.Promise[Roomalias] = js.native
  def createRoom(options: CreateRoomOptions, callback: MatrixCallback): js.Promise[Roomalias] = js.native
  
  var credentials: Any = js.native
  
  def deactivateAccount(auth: js.Object, erase: Boolean): js.Promise[Unit] = js.native
  
  def deleteAlias(alias: String): js.Promise[Unit] = js.native
  def deleteAlias(alias: String, callback: MatrixCallback): js.Promise[Unit] = js.native
  
  def deleteDevice(device_id: String, auth: js.Object): js.Promise[js.Object] = js.native
  
  def deleteMultipleDevices(devices: String, auth: js.Object): js.Promise[js.Object] = js.native
  
  def deletePushRule(scope: String, kind: String, ruleId: String): js.Promise[Unit] = js.native
  def deletePushRule(scope: String, kind: String, ruleId: String, callback: MatrixCallback): js.Promise[Unit] = js.native
  
  def deleteRoomTag(roomId: String, tagName: String): js.Promise[Unit] = js.native
  def deleteRoomTag(roomId: String, tagName: String, callback: MatrixCallback): js.Promise[Unit] = js.native
  
  def deleteThreePid(medium: String, address: String): js.Promise[js.Object] = js.native
  
  var deviceId: String = js.native
  
  def disableKeyBackup(): Unit = js.native
  
  def downloadKeys(userIds: js.Array[String], forceDownload: Boolean): js.Promise[StringDictionary[StringDictionary[String]]] = js.native
  
  def downloadKeysForUsers(userIds: js.Array[String]): js.Promise[js.Object] = js.native
  def downloadKeysForUsers(userIds: js.Array[String], opts: js.Object): js.Promise[js.Object] = js.native
  
  def dropFromPresenceList(callback: MatrixCallback, userIds: js.Array[String]): js.Promise[Unit] = js.native
  
  def enableKeyBackup(info: js.Object): Unit = js.native
  
  def exportRoomKeys(): js.Promise[Unit] = js.native
  
  def fetchRoomEvent(roomId: String, eventId: String): js.Promise[js.Object] = js.native
  def fetchRoomEvent(roomId: String, eventId: String, callback: MatrixCallback): js.Promise[js.Object] = js.native
  
  def forceDiscardSession(roomId: String): Unit = js.native
  
  def forget(roomId: String, deleteRoom: Boolean): js.Promise[Unit] = js.native
  def forget(roomId: String, deleteRoom: Boolean, callback: MatrixCallback): js.Promise[Unit] = js.native
  
  def generateClientSecret(): String = js.native
  
  def getAccessToken(): Null | String = js.native
  
  def getAccountData(eventType: EventType): Null | js.Object = js.native
  
  def getCanResetTimelineCallback(): Null | (js.Function1[/* repeated */ Any, Any]) = js.native
  
  def getCapabilities(fresh: Boolean): js.Promise[js.Object] = js.native
  
  def getCasLoginUrl(redirectUrl: String): String = js.native
  
  def getCurrentUploads(): js.Array[js.Object] = js.native
  
  def getDeviceEd25519Key(): Null | String = js.native
  
  def getDeviceId(): Null | String = js.native
  
  def getDevices(): js.Promise[js.Object] = js.native
  
  def getDomain(): Null | String = js.native
  
  def getEventMapper(): js.Function1[/* repeated */ Any, Any] = js.native
  
  def getEventSenderDeviceInfo(event: MatrixEvent[EventContentTypeMessage, EventType]): js.Promise[CryptoDeviceInfo] = js.native
  
  def getEventTimeline(timelineSet: EventTimelineSet, eventId: String): js.Promise[EventTimeline] = js.native
  
  def getFallbackAuthUrl(loginType: String, authSessionId: String): String = js.native
  
  def getFilter(userId: String, filterId: String, allowCached: Boolean): js.Promise[Filter] = js.native
  
  def getGlobalBlacklistUnverifiedDevices(): Boolean = js.native
  
  def getGroup(groupId: String): Group = js.native
  
  def getGroupInvitedUsers(groupId: String): js.Promise[js.Object] = js.native
  
  def getGroupProfile(groupId: String): js.Promise[js.Object] = js.native
  
  def getGroupRooms(groupId: String): js.Promise[js.Object] = js.native
  
  def getGroupSummary(groupId: String): js.Promise[js.Object] = js.native
  
  def getGroupUsers(groupId: String): js.Promise[js.Object] = js.native
  
  def getGroups(): js.Array[Group] = js.native
  
  def getHomeserverUrl(): String = js.native
  
  def getIdentityServerUrl(stripProto: Boolean): String = js.native
  
  def getIgnoredUsers(): js.Array[String] = js.native
  
  def getJoinedGroups(): js.Promise[js.Array[js.Object]] = js.native
  
  def getJoinedRoomMembers(roomId: String): js.Promise[js.Object] = js.native
  
  def getJoinedRooms(): js.Promise[js.Array[js.Object]] = js.native
  
  def getKeyBackupEnabled(): Boolean = js.native
  
  def getKeyBackupVersion(): js.Promise[Null | js.Object] = js.native
  
  def getKeyChanges(oldToken: String, newToken: String): js.Promise[js.Object] = js.native
  
  def getMediaConfig(): js.Promise[js.Object] = js.native
  def getMediaConfig(callback: MatrixCallback): js.Promise[js.Object] = js.native
  
  def getNotifTimelineSet(): EventTimelineSet = js.native
  
  def getOpenIdToken(): js.Promise[js.Object] = js.native
  
  def getOrCreateFilter(filterName: String, filter: Filter): js.Promise[String] = js.native
  
  def getPresenceList(): js.Promise[js.Array[js.Object]] = js.native
  def getPresenceList(callback: MatrixCallback): js.Promise[js.Array[js.Object]] = js.native
  
  def getProfileInfo(userId: String): js.Promise[Displayname] = js.native
  def getProfileInfo(userId: String, info: String): js.Promise[Displayname] = js.native
  def getProfileInfo(userId: String, info: String, callback: MatrixCallback): js.Promise[Displayname] = js.native
  def getProfileInfo(userId: String, info: Unit, callback: MatrixCallback): js.Promise[Displayname] = js.native
  
  def getPublicisedGroups(userIds: js.Array[String]): js.Promise[js.Object] = js.native
  
  def getPushActionsForEvent(event: MatrixEvent[EventContentTypeMessage, EventType]): PushAction = js.native
  
  def getPushRules(): js.Promise[js.Object] = js.native
  def getPushRules(callback: MatrixCallback): js.Promise[js.Object] = js.native
  
  def getPushers(): js.Promise[js.Object] = js.native
  def getPushers(callback: MatrixCallback): js.Promise[js.Object] = js.native
  
  def getRoom(roomId: String): Null | Room = js.native
  
  def getRoomDirectoryVisibility(roomId: String): js.Promise[js.Object] = js.native
  def getRoomDirectoryVisibility(roomId: String, callback: MatrixCallback): js.Promise[js.Object] = js.native
  
  def getRoomIdForAlias(alias: String): js.Promise[js.Object] = js.native
  def getRoomIdForAlias(alias: String, callback: MatrixCallback): js.Promise[js.Object] = js.native
  
  def getRoomPushRule(scope: String, roomId: String): js.Object = js.native
  
  def getRoomTags(roomId: String): js.Promise[js.Object] = js.native
  def getRoomTags(roomId: String, callback: MatrixCallback): js.Promise[js.Object] = js.native
  
  def getRoomUpgradeHistory(roomId: String, verifyLinks: Boolean): js.Array[Room] = js.native
  
  def getRooms(): js.Array[Room] = js.native
  
  def getScheduler(): Null | MatrixScheduler = js.native
  
  def getSsoLoginUrl(redirectUrl: String, loginType: String): String = js.native
  
  def getStateEvent(roomId: String, eventType: EventType): js.Promise[js.Object] = js.native
  def getStateEvent(roomId: String, eventType: EventType, stateKey: String): js.Promise[js.Object] = js.native
  def getStateEvent(roomId: String, eventType: EventType, stateKey: String, callback: MatrixCallback): js.Promise[js.Object] = js.native
  def getStateEvent(roomId: String, eventType: EventType, stateKey: Unit, callback: MatrixCallback): js.Promise[js.Object] = js.native
  
  def getStoredDevice(userId: String, deviceId: String): js.Promise[CryptoDeviceInfo] = js.native
  
  def getStoredDevicesForUser(userId: String): js.Promise[js.Array[CryptoDeviceInfo]] = js.native
  
  def getSyncState(): Null | SyncState = js.native
  
  def getSyncStateData(): Null | SyncData = js.native
  
  def getThirdpartyLocation(protocol: String, params: js.Object): js.Promise[js.Object] = js.native
  
  def getThirdpartyProtocols(): js.Promise[js.Object] = js.native
  
  def getThirdpartyUser(protocol: String, params: js.Object): js.Promise[js.Object] = js.native
  
  def getThreePids(): js.Promise[js.Object] = js.native
  def getThreePids(callback: MatrixCallback): js.Promise[js.Object] = js.native
  
  def getTurnServers(): js.Array[js.Object] = js.native
  
  def getUrlPreview(url: String, ts: Double): js.Promise[js.Object] = js.native
  def getUrlPreview(url: String, ts: Double, callback: MatrixCallback): js.Promise[js.Object] = js.native
  
  def getUser(userId: String): Null | User = js.native
  
  def getUserId(): Null | String = js.native
  
  def getUserIdLocalpart(): Null | String = js.native
  
  def getUsers(): js.Array[User] = js.native
  
  def getVisibleRooms(): js.Array[Room] = js.native
  
  def importRoomKeys(keys: js.Array[js.Object]): js.Promise[Unit] = js.native
  
  def initCrypto(): js.Promise[Unit] = js.native
  
  def invite(roomId: String, userId: String): js.Promise[Unit] = js.native
  def invite(roomId: String, userId: String, callback: MatrixCallback): js.Promise[Unit] = js.native
  
  def inviteByEmail(roomId: String, email: String): js.Promise[Unit] = js.native
  def inviteByEmail(roomId: String, email: String, callback: MatrixCallback): js.Promise[Unit] = js.native
  
  def inviteByThreePid(roomId: String, medium: String, address: String): js.Promise[Unit] = js.native
  def inviteByThreePid(roomId: String, medium: String, address: String, callback: MatrixCallback): js.Promise[Unit] = js.native
  
  def inviteToPresenceList(callback: MatrixCallback, userIds: js.Array[String]): js.Promise[Unit] = js.native
  
  def inviteUserToGroup(groupId: String, userId: String): js.Promise[Unit] = js.native
  
  def isCryptoEnabled(): Boolean = js.native
  
  def isEventSenderVerified(event: MatrixEvent[EventContentTypeMessage, EventType]): Boolean = js.native
  
  def isGuest(): Boolean = js.native
  
  def isKeyBackupTrusted(info: js.Object): js.Object = js.native
  
  def isLoggedIn(): Boolean = js.native
  
  def isRoomEncrypted(roomId: String): Boolean = js.native
  
  def isUserIgnored(userId: String): Boolean = js.native
  
  def isUsernameAvailable(username: String): js.Promise[Boolean] = js.native
  
  def joinGroup(groupId: String): js.Promise[Unit] = js.native
  
  def joinRoom(roomIdOrAlias: String): js.Promise[Room] = js.native
  def joinRoom(roomIdOrAlias: String, opts: Unit, callback: MatrixCallback): js.Promise[Room] = js.native
  def joinRoom(roomIdOrAlias: String, opts: InviteSignUrl): js.Promise[Room] = js.native
  def joinRoom(roomIdOrAlias: String, opts: InviteSignUrl, callback: MatrixCallback): js.Promise[Room] = js.native
  
  def kick(roomId: String, userId: String): js.Promise[Unit] = js.native
  def kick(roomId: String, userId: String, reason: String): js.Promise[Unit] = js.native
  def kick(roomId: String, userId: String, reason: String, callback: MatrixCallback): js.Promise[Unit] = js.native
  def kick(roomId: String, userId: String, reason: Unit, callback: MatrixCallback): js.Promise[Unit] = js.native
  
  def leave(roomId: String): js.Promise[Unit] = js.native
  def leave(roomId: String, callback: MatrixCallback): js.Promise[Unit] = js.native
  
  def leaveGroup(groupId: String): js.Promise[Unit] = js.native
  
  def leaveRoomChain(roomId: String, includeFuture: Boolean): js.Promise[js.Object] = js.native
  
  def login(loginType: String, data: js.Object): js.Promise[LoginPayload] = js.native
  def login(loginType: String, data: js.Object, callback: MatrixCallback): js.Promise[LoginPayload] = js.native
  
  def loginFlows(): js.Promise[LoginPayload] = js.native
  def loginFlows(callback: MatrixCallback): js.Promise[LoginPayload] = js.native
  
  def loginWithPassword(user: String, password: String): js.Promise[LoginPayload] = js.native
  def loginWithPassword(user: String, password: String, callback: MatrixCallback): js.Promise[LoginPayload] = js.native
  
  def loginWithSAML2(relayState: String): js.Promise[LoginPayload] = js.native
  def loginWithSAML2(relayState: String, callback: MatrixCallback): js.Promise[LoginPayload] = js.native
  
  def loginWithToken(token: String): js.Promise[LoginPayload] = js.native
  def loginWithToken(token: String, callback: MatrixCallback): js.Promise[LoginPayload] = js.native
  
  def logout(): js.Promise[Unit] = js.native
  def logout(callback: MatrixCallback): js.Promise[Unit] = js.native
  
  def lookupThreePid(medium: String, address: String): js.Promise[js.Object] = js.native
  def lookupThreePid(medium: String, address: String, callback: MatrixCallback): js.Promise[js.Object] = js.native
  
  def makeTxnId(): String = js.native
  
  def members(roomId: String, includeMembership: String, excludeMembership: String, atEventId: String): js.Promise[js.Object] = js.native
  def members(
    roomId: String,
    includeMembership: String,
    excludeMembership: String,
    atEventId: String,
    callback: MatrixCallback
  ): js.Promise[js.Object] = js.native
  
  def mxcUrlToHttp(
    mxcUrl: String,
    width: js.UndefOr[Double | Null],
    height: js.UndefOr[Double | Null],
    resizeMethod: js.UndefOr[String | Null],
    allowDirectLinks: js.UndefOr[Boolean | Null]
  ): Null | String = js.native
  
  def paginateEventTimeline(eventTimeline: EventTimeline): js.Promise[Boolean] = js.native
  def paginateEventTimeline(eventTimeline: EventTimeline, opts: js.Object): js.Promise[Boolean] = js.native
  
  def peekInRoom(roomId: String): js.Promise[js.Object] = js.native
  
  def prepareKeyBackupVersion(password: String): js.Promise[js.Object] = js.native
  
  def publicRooms(options: Limit): js.Promise[Unit] = js.native
  def publicRooms(options: Limit, callback: js.Function1[/* repeated */ Any, Any]): js.Promise[Unit] = js.native
  
  // TODO: clarify return type
  def redactEvent(roomId: String, eventId: String): js.Promise[Any] = js.native
  def redactEvent(roomId: String, eventId: String, txnId: String): js.Promise[Any] = js.native
  def redactEvent(roomId: String, eventId: String, txnId: String, callbackOrOpts: Reason): js.Promise[Any] = js.native
  def redactEvent(roomId: String, eventId: String, txnId: String, callbackOrOpts: MatrixCallback): js.Promise[Any] = js.native
  def redactEvent(roomId: String, eventId: String, txnId: Unit, callbackOrOpts: Reason): js.Promise[Any] = js.native
  def redactEvent(roomId: String, eventId: String, txnId: Unit, callbackOrOpts: MatrixCallback): js.Promise[Any] = js.native
  
  def register(
    username: String,
    password: String,
    sessionId: js.UndefOr[String],
    auth: js.UndefOr[js.Object],
    bindThreepids: js.UndefOr[js.Object],
    guestAccessToken: js.UndefOr[String],
    inhibitLogin: js.UndefOr[Boolean],
    callback: js.UndefOr[MatrixCallback]
  ): js.Promise[LoginPayload] = js.native
  
  def registerGuest(): js.Promise[LoginPayload] = js.native
  def registerGuest(opts: js.Object): js.Promise[LoginPayload] = js.native
  def registerGuest(opts: js.Object, callback: MatrixCallback): js.Promise[LoginPayload] = js.native
  def registerGuest(opts: Unit, callback: MatrixCallback): js.Promise[LoginPayload] = js.native
  
  def registerRequest(data: js.Object): js.Promise[LoginPayload] = js.native
  def registerRequest(data: js.Object, kind: String): js.Promise[LoginPayload] = js.native
  def registerRequest(data: js.Object, kind: String, callback: MatrixCallback): js.Promise[LoginPayload] = js.native
  def registerRequest(data: js.Object, kind: Unit, callback: MatrixCallback): js.Promise[LoginPayload] = js.native
  
  def removeRoomFromGroup(groupId: String, roomId: String): js.Promise[Unit] = js.native
  
  def removeRoomFromGroupSummary(groupId: String, roomId: String): js.Promise[Unit] = js.native
  
  def removeUserFromGroup(groupId: String, userId: String): js.Promise[Unit] = js.native
  
  def removeUserFromGroupSummary(groupId: String, userId: String): js.Promise[Unit] = js.native
  
  def requestAdd3pidEmailToken(email: String, clientSecret: String, sendAttempt: Double, nextLink: String): js.Promise[RequestTokenPayload] = js.native
  
  def requestAdd3pidMsisdnToken(
    phoneCountry: String,
    phoneNumber: String,
    clientSecret: String,
    sendAttempt: Double,
    nextLink: String
  ): js.Promise[RequestTokenPayload] = js.native
  
  def requestEmailToken(email: String, clientSecret: String, sendAttempt: Double, nextLink: String): js.Promise[RequestTokenPayload] = js.native
  def requestEmailToken(
    email: String,
    clientSecret: String,
    sendAttempt: Double,
    nextLink: String,
    callback: MatrixCallback
  ): js.Promise[RequestTokenPayload] = js.native
  
  def requestPasswordEmailToken(email: String, clientSecret: String, sendAttempt: Double, nextLink: String): js.Promise[RequestTokenPayload] = js.native
  def requestPasswordEmailToken(
    email: String,
    clientSecret: String,
    sendAttempt: Double,
    nextLink: String,
    callback: MatrixCallback
  ): js.Promise[RequestTokenPayload] = js.native
  
  def requestPasswordMsisdnToken(
    phoneCountry: String,
    phoneNumber: String,
    clientSecret: String,
    sendAttempt: Double,
    nextLink: String
  ): js.Promise[RequestTokenPayload] = js.native
  
  def requestRegisterEmailToken(email: String, clientSecret: String, sendAttempt: Double, nextLink: String): js.Promise[RequestTokenPayload] = js.native
  
  def requestRegisterMsisdnToken(
    phoneCountry: String,
    phoneNumber: String,
    clientSecret: String,
    sendAttempt: Double,
    nextLink: String
  ): js.Promise[RequestTokenPayload] = js.native
  
  def requestVerification(userId: String, devices: js.Array[String]): js.Promise[CryptoVerificationBase] = js.native
  
  def resendEvent(event: MatrixEvent[EventContentTypeMessage, EventType], room: Room): js.Promise[Unit] = js.native
  
  def resetNotifTimelineSet(): Unit = js.native
  
  def resolveRoomAlias(roomAlias: String): js.Promise[Unit] = js.native
  def resolveRoomAlias(roomAlias: String, callback: MatrixCallback): js.Promise[Unit] = js.native
  
  def retryImmediately(): Boolean = js.native
  
  def roomInitialSync(roomId: String, limit: Double): js.Promise[Unit] = js.native
  def roomInitialSync(roomId: String, limit: Double, callback: MatrixCallback): js.Promise[Unit] = js.native
  
  def roomState(roomId: String): js.Promise[Unit] = js.native
  def roomState(roomId: String, callback: MatrixCallback): js.Promise[Unit] = js.native
  
  def scheduleAllGroupSessionsForBackup(): Unit = js.native
  
  def scrollback(room: Room, limit: Double): js.Promise[Room] = js.native
  def scrollback(room: Room, limit: Double, callback: MatrixCallback): js.Promise[Room] = js.native
  
  def search(opts: Body): js.Promise[SearchResponse] = js.native
  def search(opts: Body, callback: MatrixCallback): js.Promise[SearchResponse] = js.native
  
  def searchMessageText(opts: Keys): js.Promise[SearchResponse] = js.native
  def searchMessageText(opts: Keys, callback: MatrixCallback): js.Promise[SearchResponse] = js.native
  
  def searchRoomEvents(opts: Term): js.Promise[SearchResponse] = js.native
  
  def searchUserDirectory(opts: LimitTerm): js.Promise[Limited] = js.native
  
  def sendEmoteMessage(roomId: String, body: String): js.Promise[Unit] = js.native
  def sendEmoteMessage(roomId: String, body: String, txnId: String): js.Promise[Unit] = js.native
  def sendEmoteMessage(roomId: String, body: String, txnId: String, callback: MatrixCallback): js.Promise[Unit] = js.native
  def sendEmoteMessage(roomId: String, body: String, txnId: Unit, callback: MatrixCallback): js.Promise[Unit] = js.native
  
  def sendEvent(roomId: String, eventType: EventType, content: js.Object): js.Promise[Unit] = js.native
  def sendEvent(roomId: String, eventType: EventType, content: js.Object, txnId: String): js.Promise[Unit] = js.native
  def sendEvent(roomId: String, eventType: EventType, content: js.Object, txnId: String, callback: MatrixCallback): js.Promise[Unit] = js.native
  def sendEvent(roomId: String, eventType: EventType, content: js.Object, txnId: Unit, callback: MatrixCallback): js.Promise[Unit] = js.native
  
  def sendHtmlEmote(roomId: String, body: String, htmlBody: String): js.Promise[Unit] = js.native
  def sendHtmlEmote(roomId: String, body: String, htmlBody: String, callback: MatrixCallback): js.Promise[Unit] = js.native
  
  def sendHtmlMessage(roomId: String, body: String, htmlBody: String): js.Promise[Unit] = js.native
  def sendHtmlMessage(roomId: String, body: String, htmlBody: String, callback: MatrixCallback): js.Promise[Unit] = js.native
  
  def sendHtmlNotice(roomId: String, body: String, htmlBody: String): js.Promise[Unit] = js.native
  def sendHtmlNotice(roomId: String, body: String, htmlBody: String, callback: MatrixCallback): js.Promise[Unit] = js.native
  
  def sendImageMessage(roomId: String, url: String, info: js.Object, text: String): js.Promise[Unit] = js.native
  def sendImageMessage(roomId: String, url: String, info: js.Object, text: String, callback: MatrixCallback): js.Promise[Unit] = js.native
  
  def sendKeyBackup(roomId: String, sessionId: String, version: Double, data: js.Object): js.Promise[Unit] = js.native
  
  def sendMessage(roomId: String, content: js.Object): js.Promise[Unit] = js.native
  def sendMessage(roomId: String, content: js.Object, txnId: String): js.Promise[Unit] = js.native
  def sendMessage(roomId: String, content: js.Object, txnId: String, callback: MatrixCallback): js.Promise[Unit] = js.native
  def sendMessage(roomId: String, content: js.Object, txnId: Unit, callback: MatrixCallback): js.Promise[Unit] = js.native
  
  def sendNotice(roomId: String, body: String): js.Promise[Unit] = js.native
  def sendNotice(roomId: String, body: String, txnId: String): js.Promise[Unit] = js.native
  def sendNotice(roomId: String, body: String, txnId: String, callback: MatrixCallback): js.Promise[Unit] = js.native
  def sendNotice(roomId: String, body: String, txnId: Unit, callback: MatrixCallback): js.Promise[Unit] = js.native
  
  def sendReadReceipt(event: MatrixEvent[EventContentTypeMessage, EventType]): js.Promise[Unit] = js.native
  def sendReadReceipt(event: MatrixEvent[EventContentTypeMessage, EventType], callback: MatrixCallback): js.Promise[Unit] = js.native
  
  def sendReceipt(event: MatrixEvent[EventContentTypeMessage, EventType], receiptType: String): js.Promise[Unit] = js.native
  def sendReceipt(
    event: MatrixEvent[EventContentTypeMessage, EventType],
    receiptType: String,
    callback: MatrixCallback
  ): js.Promise[Unit] = js.native
  
  def sendStateEvent(roomId: String, eventType: EventType, content: js.Object): js.Promise[Unit] = js.native
  def sendStateEvent(roomId: String, eventType: EventType, content: js.Object, stateKey: String): js.Promise[Unit] = js.native
  def sendStateEvent(
    roomId: String,
    eventType: EventType,
    content: js.Object,
    stateKey: String,
    callback: MatrixCallback
  ): js.Promise[Unit] = js.native
  def sendStateEvent(roomId: String, eventType: EventType, content: js.Object, stateKey: Unit, callback: MatrixCallback): js.Promise[Unit] = js.native
  
  def sendStickerMessage(roomId: String, url: String, info: js.Object, text: String): js.Promise[Unit] = js.native
  def sendStickerMessage(roomId: String, url: String, info: js.Object, text: String, callback: MatrixCallback): js.Promise[Unit] = js.native
  
  def sendTextMessage(roomId: String, body: String): js.Promise[Unit] = js.native
  def sendTextMessage(roomId: String, body: String, txnId: String): js.Promise[Unit] = js.native
  def sendTextMessage(roomId: String, body: String, txnId: String, callback: MatrixCallback): js.Promise[Unit] = js.native
  def sendTextMessage(roomId: String, body: String, txnId: Unit, callback: MatrixCallback): js.Promise[Unit] = js.native
  
  def sendToDevice(eventType: EventType, contentMap: StringDictionary[StringDictionary[js.Object]]): js.Promise[js.Object] = js.native
  def sendToDevice(eventType: EventType, contentMap: StringDictionary[StringDictionary[js.Object]], txnId: String): js.Promise[js.Object] = js.native
  
  def sendTyping(roomId: String, isTyping: Boolean, timeoutMs: Double): js.Promise[Unit] = js.native
  def sendTyping(roomId: String, isTyping: Boolean, timeoutMs: Double, callback: MatrixCallback): js.Promise[Unit] = js.native
  
  def setAccountData(eventType: EventType, contents: js.Object): js.Promise[Unit] = js.native
  def setAccountData(eventType: EventType, contents: js.Object, callback: MatrixCallback): js.Promise[Unit] = js.native
  
  def setAvatarUrl(url: String): js.Promise[Unit] = js.native
  def setAvatarUrl(url: String, callback: MatrixCallback): js.Promise[Unit] = js.native
  
  def setDeviceBlocked(userId: String, deviceId: String): js.Promise[Unit] = js.native
  def setDeviceBlocked(userId: String, deviceId: String, blocked: Boolean): js.Promise[Unit] = js.native
  
  def setDeviceDetails(device_id: String, body: js.Object): js.Promise[js.Object] = js.native
  
  def setDeviceKnown(userId: String, deviceId: String): js.Promise[Unit] = js.native
  def setDeviceKnown(userId: String, deviceId: String, known: Boolean): js.Promise[Unit] = js.native
  
  def setDeviceVerified(userId: String, deviceId: String): js.Promise[Unit] = js.native
  def setDeviceVerified(userId: String, deviceId: String, verified: Boolean): js.Promise[Unit] = js.native
  
  def setDisplayName(name: String): js.Promise[Unit] = js.native
  def setDisplayName(name: String, callback: MatrixCallback): js.Promise[Unit] = js.native
  
  def setForceTURN(forceTURN: Boolean): Unit = js.native
  
  def setGlobalBlacklistUnverifiedDevices(value: Boolean): Unit = js.native
  
  def setGlobalErrorOnUnknownDevices(value: Boolean): Unit = js.native
  
  def setGroupJoinPolicy(groupId: String, policy: js.Object): js.Promise[Unit] = js.native
  
  def setGroupProfile(groupId: String, profile: Longdescription): js.Promise[Unit] = js.native
  
  def setGroupPublicity(groupId: String, isPublic: Boolean): js.Promise[Unit] = js.native
  
  def setGuest(isGuest: Boolean): Unit = js.native
  
  def setGuestAccess(roomId: String, opts: AllowJoin): js.Promise[Unit] = js.native
  
  def setIgnoredUsers(userIds: js.Array[String]): js.Promise[js.Object] = js.native
  def setIgnoredUsers(userIds: js.Array[String], callback: MatrixCallback): js.Promise[js.Object] = js.native
  
  def setNotifTimelineSet(notifTimelineSet: EventTimelineSet): Unit = js.native
  
  def setPassword(authDict: js.Object, newPassword: String): js.Promise[Unit] = js.native
  def setPassword(authDict: js.Object, newPassword: String, callback: MatrixCallback): js.Promise[Unit] = js.native
  
  def setPowerLevel(
    roomId: String,
    userId: String,
    powerLevel: Double,
    event: MatrixEvent[EventContentTypeMessage, EventType]
  ): js.Promise[Unit] = js.native
  def setPowerLevel(
    roomId: String,
    userId: String,
    powerLevel: Double,
    event: MatrixEvent[EventContentTypeMessage, EventType],
    callback: MatrixCallback
  ): js.Promise[Unit] = js.native
  
  def setPresence(opts: Presence): js.Promise[Unit] = js.native
  def setPresence(opts: Presence, callback: js.Function1[/* repeated */ Any, Any]): js.Promise[Unit] = js.native
  
  def setProfileInfo(info: String, data: js.Object): js.Promise[Unit] = js.native
  def setProfileInfo(info: String, data: js.Object, callback: MatrixCallback): js.Promise[Unit] = js.native
  
  def setPushRuleActions(scope: String, kind: String, ruleId: String, actions: js.Array[String]): js.Promise[js.Object] = js.native
  def setPushRuleActions(scope: String, kind: String, ruleId: String, actions: js.Array[String], callback: MatrixCallback): js.Promise[js.Object] = js.native
  
  def setPushRuleEnabled(scope: String, kind: String, ruleId: String, enabled: Boolean): js.Promise[js.Object] = js.native
  def setPushRuleEnabled(scope: String, kind: String, ruleId: String, enabled: Boolean, callback: MatrixCallback): js.Promise[js.Object] = js.native
  
  def setPusher(pusher: Appdisplayname): js.Promise[Unit] = js.native
  def setPusher(pusher: Appdisplayname, callback: MatrixCallback): js.Promise[Unit] = js.native
  
  def setRoomAccountData(roomId: String, eventType: EventType, content: js.Object): js.Promise[Unit] = js.native
  def setRoomAccountData(roomId: String, eventType: EventType, content: js.Object, callback: MatrixCallback): js.Promise[Unit] = js.native
  
  def setRoomDirectoryVisibility(roomId: String, visibility: String): js.Promise[js.Object] = js.native
  def setRoomDirectoryVisibility(roomId: String, visibility: String, callback: MatrixCallback): js.Promise[js.Object] = js.native
  
  def setRoomDirectoryVisibilityAppService(networkId: String, roomId: String, visibility: String): js.Promise[js.Object] = js.native
  def setRoomDirectoryVisibilityAppService(networkId: String, roomId: String, visibility: String, callback: MatrixCallback): js.Promise[js.Object] = js.native
  
  def setRoomEncryption(roomId: String, config: js.Object): js.Promise[Unit] = js.native
  
  def setRoomMutePushRule(scope: String, roomId: String, mute: String): js.Promise[js.Object] = js.native
  
  def setRoomName(roomId: String, name: String): js.Promise[Unit] = js.native
  def setRoomName(roomId: String, name: String, callback: MatrixCallback): js.Promise[Unit] = js.native
  
  def setRoomReadMarkers(roomId: String, eventId: String, rrEvent: String): js.Promise[Unit] = js.native
  
  def setRoomReadMarkersHttpRequest(roomId: String, rmEventId: String, rrEventId: String): js.Promise[Unit] = js.native
  
  def setRoomTag(roomId: String, tagName: String, metadata: js.Object): js.Promise[Unit] = js.native
  def setRoomTag(roomId: String, tagName: String, metadata: js.Object, callback: MatrixCallback): js.Promise[Unit] = js.native
  
  def setRoomTopic(roomId: String, topic: String): js.Promise[Unit] = js.native
  def setRoomTopic(roomId: String, topic: String, callback: MatrixCallback): js.Promise[Unit] = js.native
  
  def startClient(): js.Promise[Unit] = js.native
  def startClient(opts: Double): js.Promise[Unit] = js.native
  def startClient(opts: DisablePresence): js.Promise[Unit] = js.native
  
  def stopClient(): Unit = js.native
  
  def stopPeeking(): Unit = js.native
  
  var store: MatrixStore = js.native
  
  def submitMsisdnToken(sid: String, clientSecret: String, token: String): js.Promise[js.Object] = js.native
  
  def supportsVoip(): Boolean = js.native
  
  def syncLeftRooms(): js.Promise[Unit] = js.native
  
  def turnServer(): js.Promise[Unit] = js.native
  def turnServer(callback: MatrixCallback): js.Promise[Unit] = js.native
  
  def unban(roomId: String, userId: String): js.Promise[Unit] = js.native
  def unban(roomId: String, userId: String, callback: MatrixCallback): js.Promise[Unit] = js.native
  
  def updateGroupRoomVisibility(groupId: String, roomId: String, isPublic: Boolean): js.Promise[Unit] = js.native
  
  def upgradeRoom(roomId: String, newVersion: String): js.Promise[Replacementroom] = js.native
  
  def uploadContent(file: Any, opts: Callback): js.Promise[String] = js.native
  
  def uploadKeys(): js.Object = js.native
  
  def uploadKeysRequest(content: js.Object): js.Promise[js.Object] = js.native
  def uploadKeysRequest(content: js.Object, opts: js.Object): js.Promise[js.Object] = js.native
  def uploadKeysRequest(content: js.Object, opts: js.Object, callback: MatrixCallback): js.Promise[js.Object] = js.native
  def uploadKeysRequest(content: js.Object, opts: Unit, callback: MatrixCallback): js.Promise[js.Object] = js.native
}
