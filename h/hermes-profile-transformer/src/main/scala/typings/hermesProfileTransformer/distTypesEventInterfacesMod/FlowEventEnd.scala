package typings.hermesProfileTransformer.distTypesEventInterfacesMod

import typings.hermesProfileTransformer.distTypesPhasesMod.EventsPhase.FLOW_EVENTS_END
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FlowEventEnd
  extends StObject
     with SharedEventProperties
     with FlowEvent {
  
  @JSName("ph")
  var ph_FlowEventEnd: FLOW_EVENTS_END
}
object FlowEventEnd {
  
  inline def apply(ph: FLOW_EVENTS_END): FlowEventEnd = {
    val __obj = js.Dynamic.literal(ph = ph.asInstanceOf[js.Any])
    __obj.asInstanceOf[FlowEventEnd]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: FlowEventEnd] (val x: Self) extends AnyVal {
    
    inline def setPh(value: FLOW_EVENTS_END): Self = StObject.set(x, "ph", value.asInstanceOf[js.Any])
  }
}
