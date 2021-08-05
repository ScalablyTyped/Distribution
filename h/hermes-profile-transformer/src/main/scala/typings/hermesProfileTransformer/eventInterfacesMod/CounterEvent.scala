package typings.hermesProfileTransformer.eventInterfacesMod

import typings.hermesProfileTransformer.phasesMod.EventsPhase.COUNTER_EVENTS
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CounterEvent
  extends StObject
     with SharedEventProperties
     with Event {
  
  @JSName("ph")
  var ph_CounterEvent: COUNTER_EVENTS
}
object CounterEvent {
  
  inline def apply(ph: COUNTER_EVENTS): CounterEvent = {
    val __obj = js.Dynamic.literal(ph = ph.asInstanceOf[js.Any])
    __obj.asInstanceOf[CounterEvent]
  }
  
  extension [Self <: CounterEvent](x: Self) {
    
    inline def setPh(value: COUNTER_EVENTS): Self = StObject.set(x, "ph", value.asInstanceOf[js.Any])
  }
}
