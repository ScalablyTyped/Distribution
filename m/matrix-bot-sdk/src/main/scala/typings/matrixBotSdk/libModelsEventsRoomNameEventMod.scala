package typings.matrixBotSdk

import typings.matrixBotSdk.libModelsEventsRoomEventMod.StateEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libModelsEventsRoomNameEventMod {
  
  @JSImport("matrix-bot-sdk/lib/models/events/RoomNameEvent", "RoomNameEvent")
  @js.native
  open class RoomNameEvent protected () extends StateEvent[RoomNameEventContent] {
    def this(event: Any) = this()
    
    /**
      * The name of the room.
      */
    def name: String = js.native
  }
  
  trait RoomNameEventContent extends StObject {
    
    var name: String
  }
  object RoomNameEventContent {
    
    inline def apply(name: String): RoomNameEventContent = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[RoomNameEventContent]
    }
    
    extension [Self <: RoomNameEventContent](x: Self) {
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    }
  }
}
