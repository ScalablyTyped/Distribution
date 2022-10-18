package typings.hermesProfileTransformer.distTypesEventInterfacesMod

import typings.hermesProfileTransformer.distTypesPhasesMod.EventsPhase.ASYNC_EVENTS_NESTABLE_START
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AsyncEventStart
  extends StObject
     with SharedEventProperties
     with AsyncEvent {
  
  var id: Double
  
  @JSName("ph")
  var ph_AsyncEventStart: ASYNC_EVENTS_NESTABLE_START
  
  var scope: js.UndefOr[String] = js.undefined
}
object AsyncEventStart {
  
  inline def apply(id: Double, ph: ASYNC_EVENTS_NESTABLE_START): AsyncEventStart = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], ph = ph.asInstanceOf[js.Any])
    __obj.asInstanceOf[AsyncEventStart]
  }
  
  extension [Self <: AsyncEventStart](x: Self) {
    
    inline def setId(value: Double): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setPh(value: ASYNC_EVENTS_NESTABLE_START): Self = StObject.set(x, "ph", value.asInstanceOf[js.Any])
    
    inline def setScope(value: String): Self = StObject.set(x, "scope", value.asInstanceOf[js.Any])
    
    inline def setScopeUndefined: Self = StObject.set(x, "scope", js.undefined)
  }
}
