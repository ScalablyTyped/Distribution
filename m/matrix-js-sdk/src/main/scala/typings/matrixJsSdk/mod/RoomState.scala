package typings.matrixJsSdk.mod

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("matrix-js-sdk", "RoomState")
@js.native
open class RoomState () extends StObject {
  def this(roomId: String) = this()
  def this(roomId: String, oobMemberFlags: js.Object) = this()
  def this(roomId: Unit, oobMemberFlags: js.Object) = this()
  
  def clearOutOfBandMembers(): Unit = js.native
  
  def getInviteForThreePidToken(token: String): js.UndefOr[MatrixEvent[EventContentTypeMessage, EventType]] = js.native
  
  def getInvitedMemberCount(): Double = js.native
  
  def getJoinedMemberCount(): Double = js.native
  
  def getLastModifiedTime(): Double = js.native
  
  def getMember(userId: String): RoomMember = js.native
  
  def getMembers(): js.Array[RoomMember] = js.native
  
  def getMembersExcept(excludedIds: js.Array[String]): js.Array[RoomMember] = js.native
  
  def getSentinelMember(userId: String): RoomMember = js.native
  
  def getStateEvents(eventType: EventType, stateKey: String): (MatrixEvent[EventContentTypeMessage, EventType]) | (js.Array[MatrixEvent[EventContentTypeMessage, EventType]]) = js.native
  
  def getUserIdsWithDisplayName(displayName: String): js.Array[String] = js.native
  
  def markOutOfBandMembersFailed(): Unit = js.native
  
  def markOutOfBandMembersStarted(): Unit = js.native
  
  def mayClientSendStateEvent(stateEventType: EventType, cli: MatrixClient): Boolean = js.native
  
  def maySendEvent(eventType: EventType, userId: String): Boolean = js.native
  
  def maySendMessage(userId: String): Boolean = js.native
  
  def maySendRedactionForEvent(mxEvent: MatrixEvent[EventContentTypeMessage, EventType], userId: String): Boolean = js.native
  
  def maySendStateEvent(stateEventType: EventType, userId: String): Boolean = js.native
  
  def mayTriggerNotifOfType(notifLevelKey: String, userId: String): Boolean = js.native
  
  var members: StringDictionary[RoomMember] = js.native
  
  def needsOutOfBandMembers(): Boolean = js.native
  
  var roomId: String = js.native
  
  def setInvitedMemberCount(count: Double): Unit = js.native
  
  def setJoinedMemberCount(count: Double): Unit = js.native
  
  def setOutOfBandMembers(stateEvents: js.Array[MatrixEvent[EventContentTypeMessage, EventType]]): Unit = js.native
  
  def setStateEvents(stateEvents: js.Array[MatrixEvent[EventContentTypeMessage, EventType]]): Unit = js.native
  
  def setTypingEvent(event: MatrixEvent[EventContentTypeMessage, EventType]): Unit = js.native
  
  def setUnknownStateEvents(events: MatrixEvent[EventContentTypeMessage, EventType]): Unit = js.native
}
