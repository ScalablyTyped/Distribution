package typings.hermesProfileTransformer.eventInterfacesMod

import typings.hermesProfileTransformer.phasesMod.EventsPhase.DURATION_EVENTS_END
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DurationEventEnd
  extends StObject
     with SharedEventProperties
     with DurationEvent {
  
  @JSName("ph")
  var ph_DurationEventEnd: DURATION_EVENTS_END
}
object DurationEventEnd {
  
  inline def apply(ph: DURATION_EVENTS_END): DurationEventEnd = {
    val __obj = js.Dynamic.literal(ph = ph.asInstanceOf[js.Any])
    __obj.asInstanceOf[DurationEventEnd]
  }
  
  extension [Self <: DurationEventEnd](x: Self) {
    
    inline def setPh(value: DURATION_EVENTS_END): Self = StObject.set(x, "ph", value.asInstanceOf[js.Any])
  }
}
