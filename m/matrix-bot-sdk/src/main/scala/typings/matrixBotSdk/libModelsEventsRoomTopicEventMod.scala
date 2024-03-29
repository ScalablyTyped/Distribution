package typings.matrixBotSdk

import typings.matrixBotSdk.libModelsEventsRoomEventMod.StateEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libModelsEventsRoomTopicEventMod {
  
  @JSImport("matrix-bot-sdk/lib/models/events/RoomTopicEvent", "RoomTopicEvent")
  @js.native
  open class RoomTopicEvent protected () extends StateEvent[RoomTopicEventContent] {
    def this(event: Any) = this()
    
    /**
      * The topic of the room.
      */
    def topic: String = js.native
  }
  
  trait RoomTopicEventContent extends StObject {
    
    var topic: String
  }
  object RoomTopicEventContent {
    
    inline def apply(topic: String): RoomTopicEventContent = {
      val __obj = js.Dynamic.literal(topic = topic.asInstanceOf[js.Any])
      __obj.asInstanceOf[RoomTopicEventContent]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: RoomTopicEventContent] (val x: Self) extends AnyVal {
      
      inline def setTopic(value: String): Self = StObject.set(x, "topic", value.asInstanceOf[js.Any])
    }
  }
}
