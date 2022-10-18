package typings.matrixBotSdk

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libModelsEventsEventKindMod {
  
  @js.native
  sealed trait EventKind extends StObject
  @JSImport("matrix-bot-sdk/lib/models/events/EventKind", "EventKind")
  @js.native
  object EventKind extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[EventKind & String] = js.native
    
    /**
      * An ephemeral event, such as typing notifications or presence.
      */
    @js.native
    sealed trait EphemeralEvent
      extends StObject
         with EventKind
    /* "ephemeral" */ val EphemeralEvent: typings.matrixBotSdk.libModelsEventsEventKindMod.EventKind.EphemeralEvent & String = js.native
    
    /**
      * A room event. This could be a message event or a state event, and is associated with
      * a room.
      */
    @js.native
    sealed trait RoomEvent
      extends StObject
         with EventKind
    /* "room" */ val RoomEvent: typings.matrixBotSdk.libModelsEventsEventKindMod.EventKind.RoomEvent & String = js.native
  }
}
