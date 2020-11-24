package typings.hermesProfileTransformer.eventInterfacesMod

import typings.hermesProfileTransformer.phasesMod.EventsPhase.CONTEXT_EVENTS_LEAVE
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ContextEventLeave
  extends ContextEvent
     with SharedEventProperties {
  
  @JSName("ph")
  var ph_ContextEventLeave: CONTEXT_EVENTS_LEAVE = js.native
}
object ContextEventLeave {
  
  @scala.inline
  def apply(ph: CONTEXT_EVENTS_LEAVE): ContextEventLeave = {
    val __obj = js.Dynamic.literal(ph = ph.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContextEventLeave]
  }
  
  @scala.inline
  implicit class ContextEventLeaveOps[Self <: ContextEventLeave] (val x: Self) extends AnyVal {
    
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
    def setPh(value: CONTEXT_EVENTS_LEAVE): Self = this.set("ph", value.asInstanceOf[js.Any])
  }
}
