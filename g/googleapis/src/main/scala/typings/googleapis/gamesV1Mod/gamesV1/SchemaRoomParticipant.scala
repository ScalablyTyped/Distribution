package typings.googleapis.gamesV1Mod.gamesV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * This is a JSON template for a participant in a room.
  */
trait SchemaRoomParticipant extends StObject {
  
  /**
    * True if this participant was auto-matched with the requesting player.
    */
  var autoMatched: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Information about a player that has been anonymously auto-matched against
    * the requesting player. (Either player or autoMatchedPlayer will be set.)
    */
  var autoMatchedPlayer: js.UndefOr[SchemaAnonymousPlayer] = js.undefined
  
  /**
    * The capabilities which can be used when communicating with this
    * participant.
    */
  var capabilities: js.UndefOr[js.Array[String]] = js.undefined
  
  /**
    * Client address for the participant.
    */
  var clientAddress: js.UndefOr[SchemaRoomClientAddress] = js.undefined
  
  /**
    * True if this participant is in the fully connected set of peers in the
    * room.
    */
  var connected: js.UndefOr[Boolean] = js.undefined
  
  /**
    * An identifier for the participant in the scope of the room. Cannot be
    * used to identify a player across rooms or in other contexts.
    */
  var id: js.UndefOr[String] = js.undefined
  
  /**
    * Uniquely identifies the type of this resource. Value is always the fixed
    * string games#roomParticipant.
    */
  var kind: js.UndefOr[String] = js.undefined
  
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
  var leaveReason: js.UndefOr[String] = js.undefined
  
  /**
    * Information about the player. Not populated if this player was
    * anonymously auto-matched against the requesting player. (Either player or
    * autoMatchedPlayer will be set.)
    */
  var player: js.UndefOr[SchemaPlayer] = js.undefined
  
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
  var status: js.UndefOr[String] = js.undefined
}
object SchemaRoomParticipant {
  
  inline def apply(): SchemaRoomParticipant = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaRoomParticipant]
  }
  
  extension [Self <: SchemaRoomParticipant](x: Self) {
    
    inline def setAutoMatched(value: Boolean): Self = StObject.set(x, "autoMatched", value.asInstanceOf[js.Any])
    
    inline def setAutoMatchedPlayer(value: SchemaAnonymousPlayer): Self = StObject.set(x, "autoMatchedPlayer", value.asInstanceOf[js.Any])
    
    inline def setAutoMatchedPlayerUndefined: Self = StObject.set(x, "autoMatchedPlayer", js.undefined)
    
    inline def setAutoMatchedUndefined: Self = StObject.set(x, "autoMatched", js.undefined)
    
    inline def setCapabilities(value: js.Array[String]): Self = StObject.set(x, "capabilities", value.asInstanceOf[js.Any])
    
    inline def setCapabilitiesUndefined: Self = StObject.set(x, "capabilities", js.undefined)
    
    inline def setCapabilitiesVarargs(value: String*): Self = StObject.set(x, "capabilities", js.Array(value :_*))
    
    inline def setClientAddress(value: SchemaRoomClientAddress): Self = StObject.set(x, "clientAddress", value.asInstanceOf[js.Any])
    
    inline def setClientAddressUndefined: Self = StObject.set(x, "clientAddress", js.undefined)
    
    inline def setConnected(value: Boolean): Self = StObject.set(x, "connected", value.asInstanceOf[js.Any])
    
    inline def setConnectedUndefined: Self = StObject.set(x, "connected", js.undefined)
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    inline def setLeaveReason(value: String): Self = StObject.set(x, "leaveReason", value.asInstanceOf[js.Any])
    
    inline def setLeaveReasonUndefined: Self = StObject.set(x, "leaveReason", js.undefined)
    
    inline def setPlayer(value: SchemaPlayer): Self = StObject.set(x, "player", value.asInstanceOf[js.Any])
    
    inline def setPlayerUndefined: Self = StObject.set(x, "player", js.undefined)
    
    inline def setStatus(value: String): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
  }
}
