package typings.googleapis.gamesV1Mod.gamesV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * This is a JSON template for the status of a room that the player has
  * joined.
  */
trait SchemaRoomStatus extends StObject {
  
  /**
    * Auto-matching status for this room. Not set if the room is not currently
    * in the automatching queue.
    */
  var autoMatchingStatus: js.UndefOr[SchemaRoomAutoMatchStatus] = js.undefined
  
  /**
    * Uniquely identifies the type of this resource. Value is always the fixed
    * string games#roomStatus.
    */
  var kind: js.UndefOr[String] = js.undefined
  
  /**
    * The participants involved in the room, along with their statuses.
    * Includes participants who have left or declined invitations.
    */
  var participants: js.UndefOr[js.Array[SchemaRoomParticipant]] = js.undefined
  
  /**
    * Globally unique ID for a room.
    */
  var roomId: js.UndefOr[String] = js.undefined
  
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
  var status: js.UndefOr[String] = js.undefined
  
  /**
    * The version of the status for the room: an increasing counter, used by
    * the client to ignore out-of-order updates to room status.
    */
  var statusVersion: js.UndefOr[Double] = js.undefined
}
object SchemaRoomStatus {
  
  inline def apply(): SchemaRoomStatus = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaRoomStatus]
  }
  
  extension [Self <: SchemaRoomStatus](x: Self) {
    
    inline def setAutoMatchingStatus(value: SchemaRoomAutoMatchStatus): Self = StObject.set(x, "autoMatchingStatus", value.asInstanceOf[js.Any])
    
    inline def setAutoMatchingStatusUndefined: Self = StObject.set(x, "autoMatchingStatus", js.undefined)
    
    inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    inline def setParticipants(value: js.Array[SchemaRoomParticipant]): Self = StObject.set(x, "participants", value.asInstanceOf[js.Any])
    
    inline def setParticipantsUndefined: Self = StObject.set(x, "participants", js.undefined)
    
    inline def setParticipantsVarargs(value: SchemaRoomParticipant*): Self = StObject.set(x, "participants", js.Array(value :_*))
    
    inline def setRoomId(value: String): Self = StObject.set(x, "roomId", value.asInstanceOf[js.Any])
    
    inline def setRoomIdUndefined: Self = StObject.set(x, "roomId", js.undefined)
    
    inline def setStatus(value: String): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
    
    inline def setStatusVersion(value: Double): Self = StObject.set(x, "statusVersion", value.asInstanceOf[js.Any])
    
    inline def setStatusVersionUndefined: Self = StObject.set(x, "statusVersion", js.undefined)
  }
}
