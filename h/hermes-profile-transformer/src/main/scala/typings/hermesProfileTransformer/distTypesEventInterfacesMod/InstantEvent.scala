package typings.hermesProfileTransformer.distTypesEventInterfacesMod

import typings.hermesProfileTransformer.distTypesPhasesMod.EventsPhase.INSTANT_EVENTS
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait InstantEvent
  extends StObject
     with SharedEventProperties
     with Event {
  
  @JSName("ph")
  var ph_InstantEvent: INSTANT_EVENTS
  
  var s: String
}
object InstantEvent {
  
  inline def apply(ph: INSTANT_EVENTS, s: String): InstantEvent = {
    val __obj = js.Dynamic.literal(ph = ph.asInstanceOf[js.Any], s = s.asInstanceOf[js.Any])
    __obj.asInstanceOf[InstantEvent]
  }
  
  extension [Self <: InstantEvent](x: Self) {
    
    inline def setPh(value: INSTANT_EVENTS): Self = StObject.set(x, "ph", value.asInstanceOf[js.Any])
    
    inline def setS(value: String): Self = StObject.set(x, "s", value.asInstanceOf[js.Any])
  }
}
