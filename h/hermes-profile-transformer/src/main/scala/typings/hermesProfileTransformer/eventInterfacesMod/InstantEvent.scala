package typings.hermesProfileTransformer.eventInterfacesMod

import typings.hermesProfileTransformer.phasesMod.EventsPhase.INSTANT_EVENTS
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait InstantEvent
  extends SharedEventProperties
     with Event {
  
  @JSName("ph")
  var ph_InstantEvent: INSTANT_EVENTS = js.native
  
  var s: String = js.native
}
object InstantEvent {
  
  @scala.inline
  def apply(ph: INSTANT_EVENTS, s: String): InstantEvent = {
    val __obj = js.Dynamic.literal(ph = ph.asInstanceOf[js.Any], s = s.asInstanceOf[js.Any])
    __obj.asInstanceOf[InstantEvent]
  }
  
  @scala.inline
  implicit class InstantEventOps[Self <: InstantEvent] (val x: Self) extends AnyVal {
    
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
    def setPh(value: INSTANT_EVENTS): Self = this.set("ph", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setS(value: String): Self = this.set("s", value.asInstanceOf[js.Any])
  }
}
