package typings.hermesProfileTransformer.distTypesEventInterfacesMod

import typings.hermesProfileTransformer.distTypesPhasesMod.EventsPhase.CONTEXT_EVENTS_ENTER
import typings.hermesProfileTransformer.distTypesPhasesMod.EventsPhase.CONTEXT_EVENTS_LEAVE
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typings.hermesProfileTransformer.distTypesEventInterfacesMod.ContextEventEnter
  - typings.hermesProfileTransformer.distTypesEventInterfacesMod.ContextEventLeave
*/
trait ContextEvent
  extends StObject
     with Event
object ContextEvent {
  
  inline def ContextEventEnter(ph: CONTEXT_EVENTS_ENTER): typings.hermesProfileTransformer.distTypesEventInterfacesMod.ContextEventEnter = {
    val __obj = js.Dynamic.literal(ph = ph.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.hermesProfileTransformer.distTypesEventInterfacesMod.ContextEventEnter]
  }
  
  inline def ContextEventLeave(ph: CONTEXT_EVENTS_LEAVE): typings.hermesProfileTransformer.distTypesEventInterfacesMod.ContextEventLeave = {
    val __obj = js.Dynamic.literal(ph = ph.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.hermesProfileTransformer.distTypesEventInterfacesMod.ContextEventLeave]
  }
}
