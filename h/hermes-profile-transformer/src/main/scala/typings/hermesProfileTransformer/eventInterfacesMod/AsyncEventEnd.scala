package typings.hermesProfileTransformer.eventInterfacesMod

import typings.hermesProfileTransformer.phasesMod.EventsPhase.ASYNC_EVENTS_NESTABLE_END
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AsyncEventEnd
  extends StObject
     with SharedEventProperties
     with AsyncEvent {
  
  var id: Double
  
  @JSName("ph")
  var ph_AsyncEventEnd: ASYNC_EVENTS_NESTABLE_END
  
  var scope: js.UndefOr[String] = js.undefined
}
object AsyncEventEnd {
  
  inline def apply(id: Double, ph: ASYNC_EVENTS_NESTABLE_END): AsyncEventEnd = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], ph = ph.asInstanceOf[js.Any])
    __obj.asInstanceOf[AsyncEventEnd]
  }
  
  extension [Self <: AsyncEventEnd](x: Self) {
    
    inline def setId(value: Double): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setPh(value: ASYNC_EVENTS_NESTABLE_END): Self = StObject.set(x, "ph", value.asInstanceOf[js.Any])
    
    inline def setScope(value: String): Self = StObject.set(x, "scope", value.asInstanceOf[js.Any])
    
    inline def setScopeUndefined: Self = StObject.set(x, "scope", js.undefined)
  }
}
