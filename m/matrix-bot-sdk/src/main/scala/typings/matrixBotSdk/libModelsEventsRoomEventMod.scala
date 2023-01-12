package typings.matrixBotSdk

import org.scalablytyped.runtime.StringDictionary
import typings.matrixBotSdk.libModelsEventsEventMod.MatrixEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libModelsEventsRoomEventMod {
  
  @JSImport("matrix-bot-sdk/lib/models/events/RoomEvent", "RoomEvent")
  @js.native
  open class RoomEvent[T /* <: js.Object | Any */] protected () extends MatrixEvent[T] {
    def this(event: Any) = this()
    
    /**
      * The event ID of this event.
      */
    def eventId: String = js.native
    
    /**
      * The timestamp in milliseconds this event was sent.
      */
    def timestamp: Double = js.native
    
    /**
      * The unsigned content for this event. May have no properties.
      */
    def unsigned: TypicalUnsigned = js.native
  }
  
  @JSImport("matrix-bot-sdk/lib/models/events/RoomEvent", "StateEvent")
  @js.native
  open class StateEvent[T /* <: js.Object | Any */] protected () extends RoomEvent[T] {
    def this(event: Any) = this()
    
    /**
      * The previous content for this state event. Will be an empty
      * object if there is no previous content.
      */
    def previousContent: T = js.native
    
    /**
      * The state key for this event. May be an empty string.
      */
    def stateKey: String = js.native
  }
  
  trait RoomEventContent extends StObject
  
  trait TypicalUnsigned
    extends StObject
       with /**
    * Other properties which may be included.
    */
  /* prop */ StringDictionary[Any] {
    
    /**
      * The age of this event in seconds.
      */
    var age: js.UndefOr[Double] = js.undefined
  }
  object TypicalUnsigned {
    
    inline def apply(): TypicalUnsigned = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TypicalUnsigned]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: TypicalUnsigned] (val x: Self) extends AnyVal {
      
      inline def setAge(value: Double): Self = StObject.set(x, "age", value.asInstanceOf[js.Any])
      
      inline def setAgeUndefined: Self = StObject.set(x, "age", js.undefined)
    }
  }
}
