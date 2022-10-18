package typings.hermesProfileTransformer.distTypesEventInterfacesMod

import typings.hermesProfileTransformer.distTypesPhasesMod.EventsPhase.SAMPLE_EVENTS
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SampleEvent
  extends StObject
     with SharedEventProperties
     with Event {
  
  @JSName("ph")
  var ph_SampleEvent: SAMPLE_EVENTS
}
object SampleEvent {
  
  inline def apply(ph: SAMPLE_EVENTS): SampleEvent = {
    val __obj = js.Dynamic.literal(ph = ph.asInstanceOf[js.Any])
    __obj.asInstanceOf[SampleEvent]
  }
  
  extension [Self <: SampleEvent](x: Self) {
    
    inline def setPh(value: SAMPLE_EVENTS): Self = StObject.set(x, "ph", value.asInstanceOf[js.Any])
  }
}
