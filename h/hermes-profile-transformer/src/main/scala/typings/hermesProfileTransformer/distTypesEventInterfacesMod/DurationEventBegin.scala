package typings.hermesProfileTransformer.distTypesEventInterfacesMod

import typings.hermesProfileTransformer.distTypesPhasesMod.EventsPhase.DURATION_EVENTS_BEGIN
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DurationEventBegin
  extends StObject
     with SharedEventProperties
     with DurationEvent {
  
  @JSName("ph")
  var ph_DurationEventBegin: DURATION_EVENTS_BEGIN
}
object DurationEventBegin {
  
  inline def apply(ph: DURATION_EVENTS_BEGIN): DurationEventBegin = {
    val __obj = js.Dynamic.literal(ph = ph.asInstanceOf[js.Any])
    __obj.asInstanceOf[DurationEventBegin]
  }
  
  extension [Self <: DurationEventBegin](x: Self) {
    
    inline def setPh(value: DURATION_EVENTS_BEGIN): Self = StObject.set(x, "ph", value.asInstanceOf[js.Any])
  }
}
