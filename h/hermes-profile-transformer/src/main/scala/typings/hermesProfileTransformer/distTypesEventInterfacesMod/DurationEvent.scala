package typings.hermesProfileTransformer.distTypesEventInterfacesMod

import typings.hermesProfileTransformer.distTypesPhasesMod.EventsPhase.DURATION_EVENTS_BEGIN
import typings.hermesProfileTransformer.distTypesPhasesMod.EventsPhase.DURATION_EVENTS_END
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typings.hermesProfileTransformer.distTypesEventInterfacesMod.DurationEventBegin
  - typings.hermesProfileTransformer.distTypesEventInterfacesMod.DurationEventEnd
*/
trait DurationEvent
  extends StObject
     with Event
object DurationEvent {
  
  inline def DurationEventBegin(ph: DURATION_EVENTS_BEGIN): typings.hermesProfileTransformer.distTypesEventInterfacesMod.DurationEventBegin = {
    val __obj = js.Dynamic.literal(ph = ph.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.hermesProfileTransformer.distTypesEventInterfacesMod.DurationEventBegin]
  }
  
  inline def DurationEventEnd(ph: DURATION_EVENTS_END): typings.hermesProfileTransformer.distTypesEventInterfacesMod.DurationEventEnd = {
    val __obj = js.Dynamic.literal(ph = ph.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.hermesProfileTransformer.distTypesEventInterfacesMod.DurationEventEnd]
  }
}
