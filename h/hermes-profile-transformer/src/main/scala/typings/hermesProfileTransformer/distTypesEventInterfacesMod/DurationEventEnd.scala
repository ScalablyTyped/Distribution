package typings.hermesProfileTransformer.distTypesEventInterfacesMod

import typings.hermesProfileTransformer.distTypesPhasesMod.EventsPhase.DURATION_EVENTS_END
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
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DurationEventEnd] (val x: Self) extends AnyVal {
    
    inline def setPh(value: DURATION_EVENTS_END): Self = StObject.set(x, "ph", value.asInstanceOf[js.Any])
  }
}
