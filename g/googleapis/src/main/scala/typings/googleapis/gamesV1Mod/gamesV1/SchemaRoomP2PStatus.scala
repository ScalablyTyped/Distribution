package typings.googleapis.gamesV1Mod.gamesV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * This is a JSON template for an update on the status of a peer in a room.
  */
@js.native
trait SchemaRoomP2PStatus extends js.Object {
  /**
    * The amount of time in milliseconds it took to establish connections with
    * this peer.
    */
  var connectionSetupLatencyMillis: js.UndefOr[Double] = js.native
  /**
    * The error code in event of a failure. Possible values are:   -
    * &quot;P2P_FAILED&quot; - The client failed to establish a P2P connection
    * with the peer.  - &quot;PRESENCE_FAILED&quot; - The client failed to
    * register to receive P2P connections.  - &quot;RELAY_SERVER_FAILED&quot; -
    * The client received an error when trying to use the relay server to
    * establish a P2P connection with the peer.
    */
  var error: js.UndefOr[String] = js.native
  /**
    * More detailed diagnostic message returned in event of a failure.
    */
  var error_reason: js.UndefOr[String] = js.native
  /**
    * Uniquely identifies the type of this resource. Value is always the fixed
    * string games#roomP2PStatus.
    */
  var kind: js.UndefOr[String] = js.native
  /**
    * The ID of the participant.
    */
  var participantId: js.UndefOr[String] = js.native
  /**
    * The status of the peer in the room. Possible values are:   -
    * &quot;CONNECTION_ESTABLISHED&quot; - The client established a P2P
    * connection with the peer.  - &quot;CONNECTION_FAILED&quot; - The client
    * failed to establish directed presence with the peer.
    */
  var status: js.UndefOr[String] = js.native
  /**
    * The amount of time in milliseconds it took to send packets back and forth
    * on the unreliable channel with this peer.
    */
  var unreliableRoundtripLatencyMillis: js.UndefOr[Double] = js.native
}

object SchemaRoomP2PStatus {
  @scala.inline
  def apply(
    connectionSetupLatencyMillis: js.UndefOr[Double] = js.undefined,
    error: String = null,
    error_reason: String = null,
    kind: String = null,
    participantId: String = null,
    status: String = null,
    unreliableRoundtripLatencyMillis: js.UndefOr[Double] = js.undefined
  ): SchemaRoomP2PStatus = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(connectionSetupLatencyMillis)) __obj.updateDynamic("connectionSetupLatencyMillis")(connectionSetupLatencyMillis.get.asInstanceOf[js.Any])
    if (error != null) __obj.updateDynamic("error")(error.asInstanceOf[js.Any])
    if (error_reason != null) __obj.updateDynamic("error_reason")(error_reason.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (participantId != null) __obj.updateDynamic("participantId")(participantId.asInstanceOf[js.Any])
    if (status != null) __obj.updateDynamic("status")(status.asInstanceOf[js.Any])
    if (!js.isUndefined(unreliableRoundtripLatencyMillis)) __obj.updateDynamic("unreliableRoundtripLatencyMillis")(unreliableRoundtripLatencyMillis.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaRoomP2PStatus]
  }
}

