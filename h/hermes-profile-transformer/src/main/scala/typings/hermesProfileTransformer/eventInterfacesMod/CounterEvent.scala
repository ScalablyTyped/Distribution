package typings.hermesProfileTransformer.eventInterfacesMod

import typings.hermesProfileTransformer.phasesMod.EventsPhase.COUNTER_EVENTS
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CounterEvent
  extends SharedEventProperties
     with Event {
  
  @JSName("ph")
  var ph_CounterEvent: COUNTER_EVENTS = js.native
}
object CounterEvent {
  
  @scala.inline
  def apply(ph: COUNTER_EVENTS): CounterEvent = {
    val __obj = js.Dynamic.literal(ph = ph.asInstanceOf[js.Any])
    __obj.asInstanceOf[CounterEvent]
  }
  
  @scala.inline
  implicit class CounterEventMutableBuilder[Self <: CounterEvent] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPh(value: COUNTER_EVENTS): Self = StObject.set(x, "ph", value.asInstanceOf[js.Any])
  }
}
