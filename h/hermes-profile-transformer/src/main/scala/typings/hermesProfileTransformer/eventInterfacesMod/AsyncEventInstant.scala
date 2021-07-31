package typings.hermesProfileTransformer.eventInterfacesMod

import typings.hermesProfileTransformer.phasesMod.EventsPhase.ASYNC_EVENTS_NESTABLE_INSTANT
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AsyncEventInstant
  extends StObject
     with SharedEventProperties
     with AsyncEvent {
  
  var id: Double
  
  @JSName("ph")
  var ph_AsyncEventInstant: ASYNC_EVENTS_NESTABLE_INSTANT
  
  var scope: js.UndefOr[String] = js.undefined
}
object AsyncEventInstant {
  
  @scala.inline
  def apply(id: Double, ph: ASYNC_EVENTS_NESTABLE_INSTANT): AsyncEventInstant = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], ph = ph.asInstanceOf[js.Any])
    __obj.asInstanceOf[AsyncEventInstant]
  }
  
  @scala.inline
  implicit class AsyncEventInstantMutableBuilder[Self <: AsyncEventInstant] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setId(value: Double): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPh(value: ASYNC_EVENTS_NESTABLE_INSTANT): Self = StObject.set(x, "ph", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScope(value: String): Self = StObject.set(x, "scope", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScopeUndefined: Self = StObject.set(x, "scope", js.undefined)
  }
}
