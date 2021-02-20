package typings.hermesProfileTransformer.eventInterfacesMod

import typings.hermesProfileTransformer.phasesMod.EventsPhase.COMPLETE_EVENTS
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CompleteEvent
  extends SharedEventProperties
     with Event {
  
  var dur: Double = js.native
  
  @JSName("ph")
  var ph_CompleteEvent: COMPLETE_EVENTS = js.native
}
object CompleteEvent {
  
  @scala.inline
  def apply(dur: Double, ph: COMPLETE_EVENTS): CompleteEvent = {
    val __obj = js.Dynamic.literal(dur = dur.asInstanceOf[js.Any], ph = ph.asInstanceOf[js.Any])
    __obj.asInstanceOf[CompleteEvent]
  }
  
  @scala.inline
  implicit class CompleteEventMutableBuilder[Self <: CompleteEvent] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDur(value: Double): Self = StObject.set(x, "dur", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPh(value: COMPLETE_EVENTS): Self = StObject.set(x, "ph", value.asInstanceOf[js.Any])
  }
}
