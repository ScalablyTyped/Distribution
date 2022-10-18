package typings.hermesProfileTransformer.distTypesEventInterfacesMod

import typings.hermesProfileTransformer.distTypesPhasesMod.EventsPhase.FLOW_EVENTS_STEP
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FlowEventStep
  extends StObject
     with SharedEventProperties
     with FlowEvent {
  
  @JSName("ph")
  var ph_FlowEventStep: FLOW_EVENTS_STEP
}
object FlowEventStep {
  
  inline def apply(ph: FLOW_EVENTS_STEP): FlowEventStep = {
    val __obj = js.Dynamic.literal(ph = ph.asInstanceOf[js.Any])
    __obj.asInstanceOf[FlowEventStep]
  }
  
  extension [Self <: FlowEventStep](x: Self) {
    
    inline def setPh(value: FLOW_EVENTS_STEP): Self = StObject.set(x, "ph", value.asInstanceOf[js.Any])
  }
}
