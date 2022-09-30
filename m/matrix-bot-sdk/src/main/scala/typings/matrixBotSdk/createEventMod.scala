package typings.matrixBotSdk

import typings.matrixBotSdk.roomEventMod.StateEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object createEventMod {
  
  @JSImport("matrix-bot-sdk/lib/models/events/CreateEvent", "CreateEvent")
  @js.native
  open class CreateEvent protected () extends StateEvent[CreateEventContent] {
    def this(event: Any) = this()
    
    /**
      * The user ID who created the room.
      */
    def creator: String = js.native
    
    /**
      * Whether or not the room is federated. Default true (federated).
      */
    def federated: Boolean = js.native
    
    /**
      * The version of the room. Defaults to "1".
      */
    def version: String = js.native
  }
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped {[ P in string ]: unknown} */ trait CreateEventContent extends StObject {
    
    /**
      * The user ID who created the room.
      */
    var creator: String
    
    /**
      * Whether or not this room is federated. Default true.
      */
    @JSName("m.federate")
    var mDotfederate: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Information about the old room.
      */
    var predecessor: js.UndefOr[PreviousRoomInfo] = js.undefined
    
    /**
      * The version of the room. Default "1".
      */
    var room_version: js.UndefOr[String] = js.undefined
    
    /**
      * The type of the room, if applicable. For example, `m.space`.
      */
    var `type`: js.UndefOr[String] = js.undefined
  }
  object CreateEventContent {
    
    inline def apply(creator: String): CreateEventContent = {
      val __obj = js.Dynamic.literal(creator = creator.asInstanceOf[js.Any])
      __obj.asInstanceOf[CreateEventContent]
    }
    
    extension [Self <: CreateEventContent](x: Self) {
      
      inline def setCreator(value: String): Self = StObject.set(x, "creator", value.asInstanceOf[js.Any])
      
      inline def setMDotfederate(value: Boolean): Self = StObject.set(x, "m.federate", value.asInstanceOf[js.Any])
      
      inline def setMDotfederateUndefined: Self = StObject.set(x, "m.federate", js.undefined)
      
      inline def setPredecessor(value: PreviousRoomInfo): Self = StObject.set(x, "predecessor", value.asInstanceOf[js.Any])
      
      inline def setPredecessorUndefined: Self = StObject.set(x, "predecessor", js.undefined)
      
      inline def setRoom_version(value: String): Self = StObject.set(x, "room_version", value.asInstanceOf[js.Any])
      
      inline def setRoom_versionUndefined: Self = StObject.set(x, "room_version", js.undefined)
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  trait PreviousRoomInfo extends StObject {
    
    /**
      * The last known event ID in the old room.
      */
    var event_id: String
    
    /**
      * The old room ID.
      */
    var room_id: String
  }
  object PreviousRoomInfo {
    
    inline def apply(event_id: String, room_id: String): PreviousRoomInfo = {
      val __obj = js.Dynamic.literal(event_id = event_id.asInstanceOf[js.Any], room_id = room_id.asInstanceOf[js.Any])
      __obj.asInstanceOf[PreviousRoomInfo]
    }
    
    extension [Self <: PreviousRoomInfo](x: Self) {
      
      inline def setEvent_id(value: String): Self = StObject.set(x, "event_id", value.asInstanceOf[js.Any])
      
      inline def setRoom_id(value: String): Self = StObject.set(x, "room_id", value.asInstanceOf[js.Any])
    }
  }
}
