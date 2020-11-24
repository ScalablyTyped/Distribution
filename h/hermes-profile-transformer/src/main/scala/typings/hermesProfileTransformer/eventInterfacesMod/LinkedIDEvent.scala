package typings.hermesProfileTransformer.eventInterfacesMod

import typings.hermesProfileTransformer.anon.Linkedid
import typings.hermesProfileTransformer.phasesMod.EventsPhase.LINKED_ID_EVENTS
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LinkedIDEvent
  extends SharedEventProperties
     with Event {
  
  @JSName("args")
  var args_LinkedIDEvent: Linkedid = js.native
  
  var id: Double = js.native
  
  @JSName("ph")
  var ph_LinkedIDEvent: LINKED_ID_EVENTS = js.native
}
object LinkedIDEvent {
  
  @scala.inline
  def apply(args: Linkedid, id: Double, ph: LINKED_ID_EVENTS): LinkedIDEvent = {
    val __obj = js.Dynamic.literal(args = args.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], ph = ph.asInstanceOf[js.Any])
    __obj.asInstanceOf[LinkedIDEvent]
  }
  
  @scala.inline
  implicit class LinkedIDEventOps[Self <: LinkedIDEvent] (val x: Self) extends AnyVal {
    
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
    def setArgs(value: Linkedid): Self = this.set("args", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: Double): Self = this.set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPh(value: LINKED_ID_EVENTS): Self = this.set("ph", value.asInstanceOf[js.Any])
  }
}
