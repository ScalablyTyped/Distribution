package typings.hermesProfileTransformer.distTypesEventInterfacesMod

import typings.hermesProfileTransformer.distTypesPhasesMod.EventsPhase.ASYNC_EVENTS_NESTABLE_END
import typings.hermesProfileTransformer.distTypesPhasesMod.EventsPhase.ASYNC_EVENTS_NESTABLE_INSTANT
import typings.hermesProfileTransformer.distTypesPhasesMod.EventsPhase.ASYNC_EVENTS_NESTABLE_START
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typings.hermesProfileTransformer.distTypesEventInterfacesMod.AsyncEventStart
  - typings.hermesProfileTransformer.distTypesEventInterfacesMod.AsyncEventInstant
  - typings.hermesProfileTransformer.distTypesEventInterfacesMod.AsyncEventEnd
*/
trait AsyncEvent
  extends StObject
     with Event
object AsyncEvent {
  
  inline def AsyncEventEnd(id: Double, ph: ASYNC_EVENTS_NESTABLE_END): typings.hermesProfileTransformer.distTypesEventInterfacesMod.AsyncEventEnd = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], ph = ph.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.hermesProfileTransformer.distTypesEventInterfacesMod.AsyncEventEnd]
  }
  
  inline def AsyncEventInstant(id: Double, ph: ASYNC_EVENTS_NESTABLE_INSTANT): typings.hermesProfileTransformer.distTypesEventInterfacesMod.AsyncEventInstant = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], ph = ph.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.hermesProfileTransformer.distTypesEventInterfacesMod.AsyncEventInstant]
  }
  
  inline def AsyncEventStart(id: Double, ph: ASYNC_EVENTS_NESTABLE_START): typings.hermesProfileTransformer.distTypesEventInterfacesMod.AsyncEventStart = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], ph = ph.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.hermesProfileTransformer.distTypesEventInterfacesMod.AsyncEventStart]
  }
}
