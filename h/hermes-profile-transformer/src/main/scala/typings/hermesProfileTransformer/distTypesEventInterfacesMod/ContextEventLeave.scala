package typings.hermesProfileTransformer.distTypesEventInterfacesMod

import typings.hermesProfileTransformer.distTypesPhasesMod.EventsPhase.CONTEXT_EVENTS_LEAVE
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ContextEventLeave
  extends StObject
     with SharedEventProperties
     with ContextEvent {
  
  @JSName("ph")
  var ph_ContextEventLeave: CONTEXT_EVENTS_LEAVE
}
object ContextEventLeave {
  
  inline def apply(ph: CONTEXT_EVENTS_LEAVE): ContextEventLeave = {
    val __obj = js.Dynamic.literal(ph = ph.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContextEventLeave]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ContextEventLeave] (val x: Self) extends AnyVal {
    
    inline def setPh(value: CONTEXT_EVENTS_LEAVE): Self = StObject.set(x, "ph", value.asInstanceOf[js.Any])
  }
}
