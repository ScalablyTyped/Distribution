package typings.googleapis.gamesV1Mod.gamesV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * This is a JSON template for the status of a room that the player has
  * joined.
  */
@js.native
trait SchemaRoomStatus extends js.Object {
  /**
    * Auto-matching status for this room. Not set if the room is not currently
    * in the automatching queue.
    */
  var autoMatchingStatus: js.UndefOr[SchemaRoomAutoMatchStatus] = js.native
  /**
    * Uniquely identifies the type of this resource. Value is always the fixed
    * string games#roomStatus.
    */
  var kind: js.UndefOr[String] = js.native
  /**
    * The participants involved in the room, along with their statuses.
    * Includes participants who have left or declined invitations.
    */
  var participants: js.UndefOr[js.Array[SchemaRoomParticipant]] = js.native
  /**
    * Globally unique ID for a room.
    */
  var roomId: js.UndefOr[String] = js.native
  /**
    * The status of the room. Possible values are:   -
    * &quot;ROOM_INVITING&quot; - One or more players have been invited and not
    * responded.  - &quot;ROOM_AUTO_MATCHING&quot; - One or more slots need to
    * be filled by auto-matching.  - &quot;ROOM_CONNECTING&quot; - Players have
    * joined are connecting to each other (either before or after
    * auto-matching).  - &quot;ROOM_ACTIVE&quot; - All players have joined and
    * connected to each other.  - &quot;ROOM_DELETED&quot; - All joined players
    * have left.
    */
  var status: js.UndefOr[String] = js.native
  /**
    * The version of the status for the room: an increasing counter, used by
    * the client to ignore out-of-order updates to room status.
    */
  var statusVersion: js.UndefOr[Double] = js.native
}

object SchemaRoomStatus {
  @scala.inline
  def apply(
    autoMatchingStatus: SchemaRoomAutoMatchStatus = null,
    kind: String = null,
    participants: js.Array[SchemaRoomParticipant] = null,
    roomId: String = null,
    status: String = null,
    statusVersion: js.UndefOr[Double] = js.undefined
  ): SchemaRoomStatus = {
    val __obj = js.Dynamic.literal()
    if (autoMatchingStatus != null) __obj.updateDynamic("autoMatchingStatus")(autoMatchingStatus.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (participants != null) __obj.updateDynamic("participants")(participants.asInstanceOf[js.Any])
    if (roomId != null) __obj.updateDynamic("roomId")(roomId.asInstanceOf[js.Any])
    if (status != null) __obj.updateDynamic("status")(status.asInstanceOf[js.Any])
    if (!js.isUndefined(statusVersion)) __obj.updateDynamic("statusVersion")(statusVersion.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaRoomStatus]
  }
}

