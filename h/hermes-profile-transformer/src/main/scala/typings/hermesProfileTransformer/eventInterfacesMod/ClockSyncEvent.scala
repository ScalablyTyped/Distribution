package typings.hermesProfileTransformer.eventInterfacesMod

import typings.hermesProfileTransformer.anon.Issuets
import typings.hermesProfileTransformer.phasesMod.EventsPhase.CLOCK_SYNC_EVENTS
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ClockSyncEvent
  extends SharedEventProperties
     with Event {
  
  @JSName("args")
  var args_ClockSyncEvent: Issuets = js.native
  
  @JSName("ph")
  var ph_ClockSyncEvent: CLOCK_SYNC_EVENTS = js.native
}
object ClockSyncEvent {
  
  @scala.inline
  def apply(args: Issuets, ph: CLOCK_SYNC_EVENTS): ClockSyncEvent = {
    val __obj = js.Dynamic.literal(args = args.asInstanceOf[js.Any], ph = ph.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClockSyncEvent]
  }
  
  @scala.inline
  implicit class ClockSyncEventOps[Self <: ClockSyncEvent] (val x: Self) extends AnyVal {
    
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
    def setArgs(value: Issuets): Self = this.set("args", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPh(value: CLOCK_SYNC_EVENTS): Self = this.set("ph", value.asInstanceOf[js.Any])
  }
}
