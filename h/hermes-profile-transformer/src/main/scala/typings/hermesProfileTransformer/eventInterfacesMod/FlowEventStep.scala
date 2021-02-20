package typings.hermesProfileTransformer.eventInterfacesMod

import typings.hermesProfileTransformer.phasesMod.EventsPhase.FLOW_EVENTS_STEP
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FlowEventStep
  extends FlowEvent
     with SharedEventProperties {
  
  @JSName("ph")
  var ph_FlowEventStep: FLOW_EVENTS_STEP = js.native
}
object FlowEventStep {
  
  @scala.inline
  def apply(ph: FLOW_EVENTS_STEP): FlowEventStep = {
    val __obj = js.Dynamic.literal(ph = ph.asInstanceOf[js.Any])
    __obj.asInstanceOf[FlowEventStep]
  }
  
  @scala.inline
  implicit class FlowEventStepMutableBuilder[Self <: FlowEventStep] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPh(value: FLOW_EVENTS_STEP): Self = StObject.set(x, "ph", value.asInstanceOf[js.Any])
  }
}
