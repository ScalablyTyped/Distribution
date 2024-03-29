package typings.matrixBotSdk

import typings.matrixBotSdk.libModelsEventsRoomEventMod.RoomEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libModelsEventsRedactionEventMod {
  
  @JSImport("matrix-bot-sdk/lib/models/events/RedactionEvent", "RedactionEvent")
  @js.native
  open class RedactionEvent protected () extends RoomEvent[RedactionEventContent] {
    def this(event: Any) = this()
    
    /**
      * The event ID this event redacts.
      * @deprecated It is possible for multiple events to be redacted depending on the room version.
      */
    def redactsEventId: String = js.native
    
    /**
      * The event IDs this event redacts.
      */
    def redactsEventIds: js.Array[String] = js.native
  }
  
  trait RedactionEventContent extends StObject {
    
    /**
      * The event ID or IDs this event redacts.
      */
    var redacts: js.UndefOr[String | js.Array[String]] = js.undefined
  }
  object RedactionEventContent {
    
    inline def apply(): RedactionEventContent = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[RedactionEventContent]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: RedactionEventContent] (val x: Self) extends AnyVal {
      
      inline def setRedacts(value: String | js.Array[String]): Self = StObject.set(x, "redacts", value.asInstanceOf[js.Any])
      
      inline def setRedactsUndefined: Self = StObject.set(x, "redacts", js.undefined)
      
      inline def setRedactsVarargs(value: String*): Self = StObject.set(x, "redacts", js.Array(value*))
    }
  }
}
