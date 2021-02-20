package typings.hermesProfileTransformer.eventInterfacesMod

import typings.hermesProfileTransformer.phasesMod.EventsPhase.CONTEXT_EVENTS_ENTER
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ContextEventEnter
  extends ContextEvent
     with SharedEventProperties {
  
  @JSName("ph")
  var ph_ContextEventEnter: CONTEXT_EVENTS_ENTER = js.native
}
object ContextEventEnter {
  
  @scala.inline
  def apply(ph: CONTEXT_EVENTS_ENTER): ContextEventEnter = {
    val __obj = js.Dynamic.literal(ph = ph.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContextEventEnter]
  }
  
  @scala.inline
  implicit class ContextEventEnterMutableBuilder[Self <: ContextEventEnter] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPh(value: CONTEXT_EVENTS_ENTER): Self = StObject.set(x, "ph", value.asInstanceOf[js.Any])
  }
}
