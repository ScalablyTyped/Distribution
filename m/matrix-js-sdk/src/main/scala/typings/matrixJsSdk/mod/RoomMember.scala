package typings.matrixJsSdk.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("matrix-js-sdk", "RoomMember")
@js.native
class RoomMember protected () extends js.Object {
     // The events describing this RoomMember.
  def this(roomId: String, userId: String) = this()
     // The membership state for this room member e.g. 'join'.
  var events: js.Object = js.native
       // The User object for this room member, if one exists.
  var membership: MembershipType = js.native
    // True if the room member is currently typing.
  var name: String = js.native
     // The ambiguous displayname of this room member.
  var powerLevel: Double = js.native
     // The power level for this room member.
  var powerLevelNorm: Double = js.native
     // The human-readable name for this room member. This will be disambiguated with a suffix of " (@user_id:matrix.org)" if another member shares the same displayname.
  var rawDisplayName: String = js.native
  var roomId: String = js.native
     // The user ID of this member.
  var typing: Boolean = js.native
     // The normalised power level (0-100) for this room member.
  var user: User = js.native
     // The room ID for this member.
  var userId: String = js.native
  def getAvatarUrl(
    baseUrl: String,
    width: Double,
    height: Double,
    resizeMethod: String,
    allowDefault: Boolean,
    allowDirectLinks: Boolean
  ): Null | String = js.native
  def getDMInviter(): String = js.native
  def getLastModifiedTime(): Double = js.native
  def getMxcAvatarUrl(): String = js.native
  def isOutOfBand(): Boolean = js.native
  def markOutOfBand(): Unit = js.native
  def setMembershipEvent(event: MatrixEvent, roomState: RoomState): Unit = js.native
  def setPowerLevelEvent(powerLevelEvent: MatrixEvent): Unit = js.native
  def setTypingEvent(event: MatrixEvent): Unit = js.native
}

