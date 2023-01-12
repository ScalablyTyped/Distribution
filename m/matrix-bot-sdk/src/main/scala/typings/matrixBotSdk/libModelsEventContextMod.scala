package typings.matrixBotSdk

import typings.matrixBotSdk.libModelsEventsRoomEventMod.RoomEvent
import typings.matrixBotSdk.libModelsEventsRoomEventMod.RoomEventContent
import typings.matrixBotSdk.libModelsEventsRoomEventMod.StateEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libModelsEventContextMod {
  
  trait EventContext extends StObject {
    
    /**
      * The events that happened after the contextual event.
      */
    var after: js.Array[RoomEvent[RoomEventContent]]
    
    /**
      * The events that happened before the contextual event.
      */
    var before: js.Array[RoomEvent[RoomEventContent]]
    
    /**
      * The event that was used to build this context.
      */
    var event: RoomEvent[RoomEventContent]
    
    /**
      * The state of the room at the point of the last event returned.
      */
    var state: js.Array[StateEvent[RoomEventContent]]
  }
  object EventContext {
    
    inline def apply(
      after: js.Array[RoomEvent[RoomEventContent]],
      before: js.Array[RoomEvent[RoomEventContent]],
      event: RoomEvent[RoomEventContent],
      state: js.Array[StateEvent[RoomEventContent]]
    ): EventContext = {
      val __obj = js.Dynamic.literal(after = after.asInstanceOf[js.Any], before = before.asInstanceOf[js.Any], event = event.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any])
      __obj.asInstanceOf[EventContext]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: EventContext] (val x: Self) extends AnyVal {
      
      inline def setAfter(value: js.Array[RoomEvent[RoomEventContent]]): Self = StObject.set(x, "after", value.asInstanceOf[js.Any])
      
      inline def setAfterVarargs(value: RoomEvent[RoomEventContent]*): Self = StObject.set(x, "after", js.Array(value*))
      
      inline def setBefore(value: js.Array[RoomEvent[RoomEventContent]]): Self = StObject.set(x, "before", value.asInstanceOf[js.Any])
      
      inline def setBeforeVarargs(value: RoomEvent[RoomEventContent]*): Self = StObject.set(x, "before", js.Array(value*))
      
      inline def setEvent(value: RoomEvent[RoomEventContent]): Self = StObject.set(x, "event", value.asInstanceOf[js.Any])
      
      inline def setState(value: js.Array[StateEvent[RoomEventContent]]): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
      
      inline def setStateVarargs(value: StateEvent[RoomEventContent]*): Self = StObject.set(x, "state", js.Array(value*))
    }
  }
}
