package typings.matrixBotSdk.synapseAdminApisMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SynapseRoomList extends StObject {
  
  var next_batch: String
  
  var offset: String
  
  var prev_batch: String
  
  var rooms: js.Array[SynapseRoomListing]
  
  var total_rooms: Double
}
object SynapseRoomList {
  
  inline def apply(
    next_batch: String,
    offset: String,
    prev_batch: String,
    rooms: js.Array[SynapseRoomListing],
    total_rooms: Double
  ): SynapseRoomList = {
    val __obj = js.Dynamic.literal(next_batch = next_batch.asInstanceOf[js.Any], offset = offset.asInstanceOf[js.Any], prev_batch = prev_batch.asInstanceOf[js.Any], rooms = rooms.asInstanceOf[js.Any], total_rooms = total_rooms.asInstanceOf[js.Any])
    __obj.asInstanceOf[SynapseRoomList]
  }
  
  extension [Self <: SynapseRoomList](x: Self) {
    
    inline def setNext_batch(value: String): Self = StObject.set(x, "next_batch", value.asInstanceOf[js.Any])
    
    inline def setOffset(value: String): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
    
    inline def setPrev_batch(value: String): Self = StObject.set(x, "prev_batch", value.asInstanceOf[js.Any])
    
    inline def setRooms(value: js.Array[SynapseRoomListing]): Self = StObject.set(x, "rooms", value.asInstanceOf[js.Any])
    
    inline def setRoomsVarargs(value: SynapseRoomListing*): Self = StObject.set(x, "rooms", js.Array(value*))
    
    inline def setTotal_rooms(value: Double): Self = StObject.set(x, "total_rooms", value.asInstanceOf[js.Any])
  }
}
