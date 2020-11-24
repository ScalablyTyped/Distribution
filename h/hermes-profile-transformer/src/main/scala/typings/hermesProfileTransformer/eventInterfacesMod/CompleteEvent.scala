package typings.hermesProfileTransformer.eventInterfacesMod

import typings.hermesProfileTransformer.phasesMod.EventsPhase.COMPLETE_EVENTS
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
  implicit class CompleteEventOps[Self <: CompleteEvent] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setDur(value: Double): Self = this.set("dur", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPh(value: COMPLETE_EVENTS): Self = this.set("ph", value.asInstanceOf[js.Any])
  }
}
