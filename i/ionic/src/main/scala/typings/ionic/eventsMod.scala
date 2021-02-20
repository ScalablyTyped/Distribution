package typings.ionic

import typings.ionic.definitionsMod.ServeDetails
import typings.ionic.ionicStrings.event
import typings.ionic.ionicStrings.serveColonready
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object eventsMod {
  
  @JSImport("ionic/lib/events", "emit")
  @js.native
  def emit_serveready(event: serveColonready, data: ServeDetails): Boolean = js.native
  
  @js.native
  trait IPCEvent[E /* <: String */, D /* <: js.Object */] extends StObject {
    
    var data: D = js.native
    
    var event: E = js.native
    
    var `type`: event = js.native
  }
  object IPCEvent {
    
    @scala.inline
    def apply[E /* <: String */, D /* <: js.Object */](data: D, event: E, `type`: event): IPCEvent[E, D] = {
      val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], event = event.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[IPCEvent[E, D]]
    }
    
    @scala.inline
    implicit class IPCEventMutableBuilder[Self <: IPCEvent[_, _], E /* <: String */, D /* <: js.Object */] (val x: Self with (IPCEvent[E, D])) extends AnyVal {
      
      @scala.inline
      def setData(value: D): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEvent(value: E): Self = StObject.set(x, "event", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setType(value: event): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
}
