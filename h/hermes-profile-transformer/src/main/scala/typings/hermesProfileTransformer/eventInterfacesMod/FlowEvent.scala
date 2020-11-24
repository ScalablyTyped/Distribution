package typings.hermesProfileTransformer.eventInterfacesMod

import typings.hermesProfileTransformer.phasesMod.EventsPhase.FLOW_EVENTS_END
import typings.hermesProfileTransformer.phasesMod.EventsPhase.FLOW_EVENTS_START
import typings.hermesProfileTransformer.phasesMod.EventsPhase.FLOW_EVENTS_STEP
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typings.hermesProfileTransformer.eventInterfacesMod.FlowEventStart
  - typings.hermesProfileTransformer.eventInterfacesMod.FlowEventStep
  - typings.hermesProfileTransformer.eventInterfacesMod.FlowEventEnd
*/
trait FlowEvent extends Event
object FlowEvent {
  
  @scala.inline
  def FlowEventStart(ph: FLOW_EVENTS_START): FlowEvent = {
    val __obj = js.Dynamic.literal(ph = ph.asInstanceOf[js.Any])
    __obj.asInstanceOf[FlowEvent]
  }
  
  @scala.inline
  def FlowEventStep(ph: FLOW_EVENTS_STEP): FlowEvent = {
    val __obj = js.Dynamic.literal(ph = ph.asInstanceOf[js.Any])
    __obj.asInstanceOf[FlowEvent]
  }
  
  @scala.inline
  def FlowEventEnd(ph: FLOW_EVENTS_END): FlowEvent = {
    val __obj = js.Dynamic.literal(ph = ph.asInstanceOf[js.Any])
    __obj.asInstanceOf[FlowEvent]
  }
}
