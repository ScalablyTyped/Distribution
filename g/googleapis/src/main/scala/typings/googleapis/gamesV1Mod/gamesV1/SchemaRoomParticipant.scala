package typings.googleapis.gamesV1Mod.gamesV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * This is a JSON template for a participant in a room.
  */
@js.native
trait SchemaRoomParticipant extends js.Object {
  /**
    * True if this participant was auto-matched with the requesting player.
    */
  var autoMatched: js.UndefOr[Boolean] = js.native
  /**
    * Information about a player that has been anonymously auto-matched against
    * the requesting player. (Either player or autoMatchedPlayer will be set.)
    */
  var autoMatchedPlayer: js.UndefOr[SchemaAnonymousPlayer] = js.native
  /**
    * The capabilities which can be used when communicating with this
    * participant.
    */
  var capabilities: js.UndefOr[js.Array[String]] = js.native
  /**
    * Client address for the participant.
    */
  var clientAddress: js.UndefOr[SchemaRoomClientAddress] = js.native
  /**
    * True if this participant is in the fully connected set of peers in the
    * room.
    */
  var connected: js.UndefOr[Boolean] = js.native
  /**
    * An identifier for the participant in the scope of the room. Cannot be
    * used to identify a player across rooms or in other contexts.
    */
  var id: js.UndefOr[String] = js.native
  /**
    * Uniquely identifies the type of this resource. Value is always the fixed
    * string games#roomParticipant.
    */
  var kind: js.UndefOr[String] = js.native
  /**
    * The reason the participant left the room; populated if the participant
    * status is PARTICIPANT_LEFT. Possible values are:   -
    * &quot;PLAYER_LEFT&quot; - The player explicitly chose to leave the room.
    * - &quot;GAME_LEFT&quot; - The game chose to remove the player from the
    * room.  - &quot;ABANDONED&quot; - The player switched to another
    * application and abandoned the room. - &quot;PEER_CONNECTION_FAILURE&quot;
    * - The client was unable to establish or maintain a connection to other
    * peer(s) in the room. - &quot;SERVER_ERROR&quot; - The client received an
    * error response when it tried to communicate with the server.  -
    * &quot;TIMEOUT&quot; - The client timed out while waiting for players to
    * join and connect.  - &quot;PRESENCE_FAILURE&quot; - The client&#39;s XMPP
    * connection ended abruptly.
    */
  var leaveReason: js.UndefOr[String] = js.native
  /**
    * Information about the player. Not populated if this player was
    * anonymously auto-matched against the requesting player. (Either player or
    * autoMatchedPlayer will be set.)
    */
  var player: js.UndefOr[SchemaPlayer] = js.native
  /**
    * The status of the participant with respect to the room. Possible values
    * are:   - &quot;PARTICIPANT_INVITED&quot; - The participant has been
    * invited to join the room, but has not yet responded.  -
    * &quot;PARTICIPANT_JOINED&quot; - The participant has joined the room
    * (either after creating it or accepting an invitation.)  -
    * &quot;PARTICIPANT_DECLINED&quot; - The participant declined an invitation
    * to join the room.  - &quot;PARTICIPANT_LEFT&quot; - The participant
    * joined the room and then left it.
    */
  var status: js.UndefOr[String] = js.native
}

object SchemaRoomParticipant {
  @scala.inline
  def apply(
    autoMatched: js.UndefOr[Boolean] = js.undefined,
    autoMatchedPlayer: SchemaAnonymousPlayer = null,
    capabilities: js.Array[String] = null,
    clientAddress: SchemaRoomClientAddress = null,
    connected: js.UndefOr[Boolean] = js.undefined,
    id: String = null,
    kind: String = null,
    leaveReason: String = null,
    player: SchemaPlayer = null,
    status: String = null
  ): SchemaRoomParticipant = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(autoMatched)) __obj.updateDynamic("autoMatched")(autoMatched.get.asInstanceOf[js.Any])
    if (autoMatchedPlayer != null) __obj.updateDynamic("autoMatchedPlayer")(autoMatchedPlayer.asInstanceOf[js.Any])
    if (capabilities != null) __obj.updateDynamic("capabilities")(capabilities.asInstanceOf[js.Any])
    if (clientAddress != null) __obj.updateDynamic("clientAddress")(clientAddress.asInstanceOf[js.Any])
    if (!js.isUndefined(connected)) __obj.updateDynamic("connected")(connected.get.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (leaveReason != null) __obj.updateDynamic("leaveReason")(leaveReason.asInstanceOf[js.Any])
    if (player != null) __obj.updateDynamic("player")(player.asInstanceOf[js.Any])
    if (status != null) __obj.updateDynamic("status")(status.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaRoomParticipant]
  }
}

