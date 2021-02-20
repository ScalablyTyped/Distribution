package typings.hermesProfileTransformer.eventInterfacesMod

import typings.hermesProfileTransformer.phasesMod.EventsPhase.FLOW_EVENTS_END
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FlowEventEnd
  extends FlowEvent
     with SharedEventProperties {
  
  @JSName("ph")
  var ph_FlowEventEnd: FLOW_EVENTS_END = js.native
}
object FlowEventEnd {
  
  @scala.inline
  def apply(ph: FLOW_EVENTS_END): FlowEventEnd = {
    val __obj = js.Dynamic.literal(ph = ph.asInstanceOf[js.Any])
    __obj.asInstanceOf[FlowEventEnd]
  }
  
  @scala.inline
  implicit class FlowEventEndMutableBuilder[Self <: FlowEventEnd] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPh(value: FLOW_EVENTS_END): Self = StObject.set(x, "ph", value.asInstanceOf[js.Any])
  }
}
