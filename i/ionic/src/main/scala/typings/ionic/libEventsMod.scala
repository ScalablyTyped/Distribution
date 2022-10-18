package typings.ionic

import typings.ionic.definitionsMod.ServeDetails
import typings.ionic.ionicStrings.event
import typings.ionic.ionicStrings.serveColonready
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libEventsMod {
  
  @JSImport("ionic/lib/events", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def emit_serveready(event: serveColonready, data: ServeDetails): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("emit")(event.asInstanceOf[js.Any], data.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  trait IPCEvent[E /* <: String */, D /* <: js.Object */] extends StObject {
    
    var data: D
    
    var event: E
    
    var `type`: event
  }
  object IPCEvent {
    
    inline def apply[E /* <: String */, D /* <: js.Object */](data: D, event: E): IPCEvent[E, D] = {
      val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], event = event.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("event")
      __obj.asInstanceOf[IPCEvent[E, D]]
    }
    
    extension [Self <: IPCEvent[?, ?], E /* <: String */, D /* <: js.Object */](x: Self & (IPCEvent[E, D])) {
      
      inline def setData(value: D): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      inline def setEvent(value: E): Self = StObject.set(x, "event", value.asInstanceOf[js.Any])
      
      inline def setType(value: event): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
}
