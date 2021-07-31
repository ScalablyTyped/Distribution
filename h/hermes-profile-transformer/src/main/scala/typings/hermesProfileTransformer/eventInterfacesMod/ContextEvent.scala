package typings.hermesProfileTransformer.eventInterfacesMod

import typings.hermesProfileTransformer.phasesMod.EventsPhase.CONTEXT_EVENTS_ENTER
import typings.hermesProfileTransformer.phasesMod.EventsPhase.CONTEXT_EVENTS_LEAVE
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typings.hermesProfileTransformer.eventInterfacesMod.ContextEventEnter
  - typings.hermesProfileTransformer.eventInterfacesMod.ContextEventLeave
*/
trait ContextEvent
  extends StObject
     with Event
object ContextEvent {
  
  @scala.inline
  def ContextEventEnter(ph: CONTEXT_EVENTS_ENTER): typings.hermesProfileTransformer.eventInterfacesMod.ContextEventEnter = {
    val __obj = js.Dynamic.literal(ph = ph.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.hermesProfileTransformer.eventInterfacesMod.ContextEventEnter]
  }
  
  @scala.inline
  def ContextEventLeave(ph: CONTEXT_EVENTS_LEAVE): typings.hermesProfileTransformer.eventInterfacesMod.ContextEventLeave = {
    val __obj = js.Dynamic.literal(ph = ph.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.hermesProfileTransformer.eventInterfacesMod.ContextEventLeave]
  }
}
