package typings.hermesProfileTransformer.distTypesEventInterfacesMod

import typings.hermesProfileTransformer.distTypesPhasesMod.EventsPhase.FLOW_EVENTS_END
import typings.hermesProfileTransformer.distTypesPhasesMod.EventsPhase.FLOW_EVENTS_START
import typings.hermesProfileTransformer.distTypesPhasesMod.EventsPhase.FLOW_EVENTS_STEP
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typings.hermesProfileTransformer.distTypesEventInterfacesMod.FlowEventStart
  - typings.hermesProfileTransformer.distTypesEventInterfacesMod.FlowEventStep
  - typings.hermesProfileTransformer.distTypesEventInterfacesMod.FlowEventEnd
*/
trait FlowEvent
  extends StObject
     with Event
object FlowEvent {
  
  inline def FlowEventEnd(ph: FLOW_EVENTS_END): typings.hermesProfileTransformer.distTypesEventInterfacesMod.FlowEventEnd = {
    val __obj = js.Dynamic.literal(ph = ph.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.hermesProfileTransformer.distTypesEventInterfacesMod.FlowEventEnd]
  }
  
  inline def FlowEventStart(ph: FLOW_EVENTS_START): typings.hermesProfileTransformer.distTypesEventInterfacesMod.FlowEventStart = {
    val __obj = js.Dynamic.literal(ph = ph.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.hermesProfileTransformer.distTypesEventInterfacesMod.FlowEventStart]
  }
  
  inline def FlowEventStep(ph: FLOW_EVENTS_STEP): typings.hermesProfileTransformer.distTypesEventInterfacesMod.FlowEventStep = {
    val __obj = js.Dynamic.literal(ph = ph.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.hermesProfileTransformer.distTypesEventInterfacesMod.FlowEventStep]
  }
}
