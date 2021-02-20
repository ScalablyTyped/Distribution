package typings.hermesProfileTransformer.eventInterfacesMod

import typings.hermesProfileTransformer.phasesMod.EventsPhase.ASYNC_EVENTS_NESTABLE_START
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AsyncEventStart
  extends AsyncEvent
     with SharedEventProperties {
  
  var id: Double = js.native
  
  @JSName("ph")
  var ph_AsyncEventStart: ASYNC_EVENTS_NESTABLE_START = js.native
  
  var scope: js.UndefOr[String] = js.native
}
object AsyncEventStart {
  
  @scala.inline
  def apply(id: Double, ph: ASYNC_EVENTS_NESTABLE_START): AsyncEventStart = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], ph = ph.asInstanceOf[js.Any])
    __obj.asInstanceOf[AsyncEventStart]
  }
  
  @scala.inline
  implicit class AsyncEventStartMutableBuilder[Self <: AsyncEventStart] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setId(value: Double): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPh(value: ASYNC_EVENTS_NESTABLE_START): Self = StObject.set(x, "ph", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScope(value: String): Self = StObject.set(x, "scope", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScopeUndefined: Self = StObject.set(x, "scope", js.undefined)
  }
}
