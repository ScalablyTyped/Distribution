package typings.hermesProfileTransformer.distTypesEventInterfacesMod

import typings.hermesProfileTransformer.distTypesPhasesMod.EventsPhase.MARK_EVENTS
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MarkEvent
  extends StObject
     with SharedEventProperties
     with Event {
  
  @JSName("ph")
  var ph_MarkEvent: MARK_EVENTS
}
object MarkEvent {
  
  inline def apply(ph: MARK_EVENTS): MarkEvent = {
    val __obj = js.Dynamic.literal(ph = ph.asInstanceOf[js.Any])
    __obj.asInstanceOf[MarkEvent]
  }
  
  extension [Self <: MarkEvent](x: Self) {
    
    inline def setPh(value: MARK_EVENTS): Self = StObject.set(x, "ph", value.asInstanceOf[js.Any])
  }
}
