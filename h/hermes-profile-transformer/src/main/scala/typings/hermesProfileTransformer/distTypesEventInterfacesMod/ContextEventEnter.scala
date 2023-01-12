package typings.hermesProfileTransformer.distTypesEventInterfacesMod

import typings.hermesProfileTransformer.distTypesPhasesMod.EventsPhase.CONTEXT_EVENTS_ENTER
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ContextEventEnter
  extends StObject
     with SharedEventProperties
     with ContextEvent {
  
  @JSName("ph")
  var ph_ContextEventEnter: CONTEXT_EVENTS_ENTER
}
object ContextEventEnter {
  
  inline def apply(ph: CONTEXT_EVENTS_ENTER): ContextEventEnter = {
    val __obj = js.Dynamic.literal(ph = ph.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContextEventEnter]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ContextEventEnter] (val x: Self) extends AnyVal {
    
    inline def setPh(value: CONTEXT_EVENTS_ENTER): Self = StObject.set(x, "ph", value.asInstanceOf[js.Any])
  }
}
