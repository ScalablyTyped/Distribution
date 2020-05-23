package typings.matrixJsSdk.mod

import typings.matrixJsSdk.anon.NeedsUpgrade
import typings.matrixJsSdk.anon.PendingEventOrdering
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("matrix-js-sdk", "Room")
@js.native
class Room protected () extends js.Object {
                   // A token which a data store can use to remember the state of the room.
  def this(roomId: String, client: MatrixClient, myUserId: String) = this()
  def this(roomId: String, client: MatrixClient, myUserId: String, opts: PendingEventOrdering) = this()
                // Dict of room tags; the keys are the tag name and the values are any metadata associated with the tag - e.g. { "fav" : { order: 1 } }
  var accountData: js.Object = js.native
             // The state of the room at the time of the oldest event in the live timeline. Present for backwards compatibility -
  var currentState: RoomState = js.native
                // The ID of this room.
  var name: String = js.native
                // Dict of per-room account_data events; the keys are the event type and the values are the events.
  var oldState: RoomState = js.native
  var roomId: String = js.native
           // The room summary.
  var storageToken: js.Any = js.native
             // The state of the room at the time of the newest event in the timeline. Present for backwards compatibility -
  var summary: RoomSummary = js.native
         // The live event timeline for this room, with the oldest event at index 0. Present for backwards compatibility - prefer getLiveTimeline().
  var tags: js.Object = js.native
                // The human-readable display name for this room.
  var timeline: js.Array[MatrixEvent] = js.native
  def addAccountData(events: js.Array[MatrixEvent]): Unit = js.native
  def addEventsToTimeline(events: js.Array[MatrixEvent], toStartOfTimeline: Boolean, timeline: EventTimeline): Unit = js.native
  def addEventsToTimeline(
    events: js.Array[MatrixEvent],
    toStartOfTimeline: Boolean,
    timeline: EventTimeline,
    paginationToken: String
  ): Unit = js.native
  def addLiveEvents(events: js.Array[MatrixEvent], duplicateStrategy: String): Unit = js.native
  def addPendingEvent(event: MatrixEvent, txnId: String): Unit = js.native
  def addReceipt(event: MatrixEvent, fake: Boolean): Unit = js.native
  def addTags(event: MatrixEvent): Unit = js.native
  def addTimeline(): EventTimeline = js.native
  def clearLoadedMembersIfNeeded(): Unit = js.native
  def findEventById(eventId: String): Null | MatrixEvent = js.native
  def getAccountData(`type`: String): Null | MatrixEvent = js.native
  def getAliases(): js.Array[String] = js.native
  def getAvatarUrl(baseUrl: String, width: Double, height: Double, resizeMethod: String, allowDefault: Boolean): Null | String = js.native
  def getBlacklistUnverifiedDevices(): Boolean = js.native
  def getCanonicalAlias(): Null | String = js.native
  def getDMInviter(): js.UndefOr[String] = js.native
  def getDefaultRoomName(userId: String): String = js.native
  def getEncryptionTargetMembers(): js.Promise[js.Array[RoomMember]] = js.native
  def getEventReadUpTo(userId: String, ignoreSynthesized: Boolean): String = js.native
  def getInvitedAndJoinedMemberCount(): Double = js.native
  def getInvitedMemberCount(): Double = js.native
  def getJoinedMemberCount(): Double = js.native
  def getJoinedMembers(): js.Array[RoomMember] = js.native
  def getLiveTimeline(): EventTimeline = js.native
  def getMember(userId: String): RoomMember = js.native
  def getMembersWithMembership(membership: MembershipType): js.Array[RoomMember] = js.native
  def getMyMembership(): MembershipType | Null = js.native
  def getOrCreateFilteredTimelineSet(filter: Filter): EventTimelineSet = js.native
  def getPendingEvents(): js.Array[MatrixEvent] = js.native
  def getReceiptsForEvent(event: MatrixEvent): js.Array[js.Object] = js.native
  def getRecommendedVersion(): js.Promise[NeedsUpgrade] = js.native
  def getTimelineForEvent(eventId: String): Null | EventTimeline = js.native
  def getTimelineSets(): js.Array[EventTimelineSet] = js.native
  def getUnfilteredTimelineSet(): EventTimelineSet = js.native
  def getUnreadNotificationCount(`type`: String): Double = js.native
  def getUsersReadUpTo(event: MatrixEvent): js.Array[String] = js.native
  def getVersion(): String = js.native
  def guessDMUserId(): String = js.native
  def hasMembershipState(userId: String, membership: MembershipType): Boolean = js.native
  def hasUnverifiedDevices(): Boolean = js.native
  def hasUserReadEvent(userId: String, eventId: String): Boolean = js.native
  def loadMembersIfNeeded(): js.Promise[Unit] = js.native
  def maySendMessage(): Boolean = js.native
  def recalculate(): Unit = js.native
  def removeEvent(eventId: String): Boolean = js.native
  def removeEvents(event_ids: js.Array[String]): Unit = js.native
  def removeFilteredTimelineSet(filter: Filter): Unit = js.native
  def resetLiveTimeline(): Unit = js.native
  def resetLiveTimeline(backPaginationToken: String): Unit = js.native
  def resetLiveTimeline(backPaginationToken: String, forwardPaginationToken: String): Unit = js.native
  def setBlacklistUnverifiedDevices(value: Boolean): Unit = js.native
  def setUnreadNotificationCount(`type`: String, count: Double): Unit = js.native
  def shouldEncryptForInvitedMembers(): Boolean = js.native
  def shouldUpgradeToVersion(): Null | String = js.native
  def updateMyMembership(membership: MembershipType): Unit = js.native
  def updatePendingEvent(event: MatrixEvent, newStatus: EventStatus, newEventId: String): Unit = js.native
  def userMayUpgradeRoom(userId: String): Boolean = js.native
}

