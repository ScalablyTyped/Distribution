package typings.hermesProfileTransformer.eventInterfacesMod

import typings.hermesProfileTransformer.phasesMod.EventsPhase.CONTEXT_EVENTS_ENTER
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ContextEventEnter
  extends ContextEvent
     with SharedEventProperties {
  
  @JSName("ph")
  var ph_ContextEventEnter: CONTEXT_EVENTS_ENTER = js.native
}
object ContextEventEnter {
  
  @scala.inline
  def apply(ph: CONTEXT_EVENTS_ENTER): ContextEventEnter = {
    val __obj = js.Dynamic.literal(ph = ph.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContextEventEnter]
  }
  
  @scala.inline
  implicit class ContextEventEnterOps[Self <: ContextEventEnter] (val x: Self) extends AnyVal {
    
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
    def setPh(value: CONTEXT_EVENTS_ENTER): Self = this.set("ph", value.asInstanceOf[js.Any])
  }
}
