package typings.hermesProfileTransformer.eventInterfacesMod

import typings.hermesProfileTransformer.anon.Linkedid
import typings.hermesProfileTransformer.phasesMod.EventsPhase.LINKED_ID_EVENTS
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LinkedIDEvent
  extends StObject
     with SharedEventProperties
     with Event {
  
  @JSName("args")
  var args_LinkedIDEvent: Linkedid
  
  var id: Double
  
  @JSName("ph")
  var ph_LinkedIDEvent: LINKED_ID_EVENTS
}
object LinkedIDEvent {
  
  inline def apply(args: Linkedid, id: Double, ph: LINKED_ID_EVENTS): LinkedIDEvent = {
    val __obj = js.Dynamic.literal(args = args.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], ph = ph.asInstanceOf[js.Any])
    __obj.asInstanceOf[LinkedIDEvent]
  }
  
  extension [Self <: LinkedIDEvent](x: Self) {
    
    inline def setArgs(value: Linkedid): Self = StObject.set(x, "args", value.asInstanceOf[js.Any])
    
    inline def setId(value: Double): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setPh(value: LINKED_ID_EVENTS): Self = StObject.set(x, "ph", value.asInstanceOf[js.Any])
  }
}
