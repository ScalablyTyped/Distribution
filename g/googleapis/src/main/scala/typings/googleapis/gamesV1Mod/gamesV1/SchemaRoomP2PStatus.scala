package typings.googleapis.gamesV1Mod.gamesV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * This is a JSON template for an update on the status of a peer in a room.
  */
@js.native
trait SchemaRoomP2PStatus extends StObject {
  
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
  def apply(): SchemaRoomP2PStatus = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaRoomP2PStatus]
  }
  
  @scala.inline
  implicit class SchemaRoomP2PStatusMutableBuilder[Self <: SchemaRoomP2PStatus] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setConnectionSetupLatencyMillis(value: Double): Self = StObject.set(x, "connectionSetupLatencyMillis", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConnectionSetupLatencyMillisUndefined: Self = StObject.set(x, "connectionSetupLatencyMillis", js.undefined)
    
    @scala.inline
    def setError(value: String): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setErrorUndefined: Self = StObject.set(x, "error", js.undefined)
    
    @scala.inline
    def setError_reason(value: String): Self = StObject.set(x, "error_reason", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setError_reasonUndefined: Self = StObject.set(x, "error_reason", js.undefined)
    
    @scala.inline
    def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    @scala.inline
    def setParticipantId(value: String): Self = StObject.set(x, "participantId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParticipantIdUndefined: Self = StObject.set(x, "participantId", js.undefined)
    
    @scala.inline
    def setStatus(value: String): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
    
    @scala.inline
    def setUnreliableRoundtripLatencyMillis(value: Double): Self = StObject.set(x, "unreliableRoundtripLatencyMillis", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUnreliableRoundtripLatencyMillisUndefined: Self = StObject.set(x, "unreliableRoundtripLatencyMillis", js.undefined)
  }
}
