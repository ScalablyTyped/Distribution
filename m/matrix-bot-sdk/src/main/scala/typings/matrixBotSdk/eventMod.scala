package typings.matrixBotSdk

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object eventMod {
  
  @JSImport("matrix-bot-sdk/lib/models/events/Event", "MatrixEvent")
  @js.native
  open class MatrixEvent[T /* <: js.Object | Any */] protected () extends StObject {
    def this(event: Any) = this()
    
    /**
      * The content for this event. May have no properties.
      */
    def content: T = js.native
    
    /* protected */ var event: Any = js.native
    
    /**
      * Gets the raw event that this MatrixEvent is using.
      * Note that there's no guarantees on formats here - it is the exact
      * same input to the constructor.
      */
    def raw: Any = js.native
    
    /**
      * The user ID who sent this event.
      */
    def sender: String = js.native
    
    /**
      * The type of this event.
      */
    def `type`: String = js.native
  }
}
