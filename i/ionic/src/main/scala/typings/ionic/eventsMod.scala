package typings.ionic

import typings.ionic.definitionsMod.ServeDetails
import typings.ionic.ionicStrings.event
import typings.ionic.ionicStrings.serveColonready
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object eventsMod {
  
  @JSImport("ionic/lib/events", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def emit_serveready(event: serveColonready, data: ServeDetails): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("emit")(event.asInstanceOf[js.Any], data.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  trait IPCEvent[E /* <: String */, D /* <: js.Object */] extends StObject {
    
    var data: D
    
    var event: E
    
    var `type`: event
  }
  object IPCEvent {
    
    @scala.inline
    def apply[E /* <: String */, D /* <: js.Object */](data: D, event: E): IPCEvent[E, D] = {
      val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], event = event.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("event")
      __obj.asInstanceOf[IPCEvent[E, D]]
    }
    
    @scala.inline
    implicit class IPCEventMutableBuilder[Self <: IPCEvent[?, ?], E /* <: String */, D /* <: js.Object */] (val x: Self & (IPCEvent[E, D])) extends AnyVal {
      
      @scala.inline
      def setData(value: D): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEvent(value: E): Self = StObject.set(x, "event", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setType(value: event): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
}
