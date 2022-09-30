package typings.matrixBotSdk

import typings.matrixBotSdk.roomEventMod.StateEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object pinnedEventsEventMod {
  
  @JSImport("matrix-bot-sdk/lib/models/events/PinnedEventsEvent", "PinnedEventsEvent")
  @js.native
  open class PinnedEventsEvent protected () extends StateEvent[PinnedEventsEventContent] {
    def this(event: Any) = this()
    
    /**
      * The event IDs that are pinned in the room.
      */
    def pinnedEventIds: js.Array[String] = js.native
  }
  
  trait PinnedEventsEventContent extends StObject {
    
    /**
      * The event IDs that are pinned in the room.
      */
    var pinned: js.Array[String]
  }
  object PinnedEventsEventContent {
    
    inline def apply(pinned: js.Array[String]): PinnedEventsEventContent = {
      val __obj = js.Dynamic.literal(pinned = pinned.asInstanceOf[js.Any])
      __obj.asInstanceOf[PinnedEventsEventContent]
    }
    
    extension [Self <: PinnedEventsEventContent](x: Self) {
      
      inline def setPinned(value: js.Array[String]): Self = StObject.set(x, "pinned", value.asInstanceOf[js.Any])
      
      inline def setPinnedVarargs(value: String*): Self = StObject.set(x, "pinned", js.Array(value*))
    }
  }
}
