package typings.hermesProfileTransformer.eventInterfacesMod

import typings.hermesProfileTransformer.phasesMod.EventsPhase.DURATION_EVENTS_END
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DurationEventEnd
  extends DurationEvent
     with SharedEventProperties {
  
  @JSName("ph")
  var ph_DurationEventEnd: DURATION_EVENTS_END = js.native
}
object DurationEventEnd {
  
  @scala.inline
  def apply(ph: DURATION_EVENTS_END): DurationEventEnd = {
    val __obj = js.Dynamic.literal(ph = ph.asInstanceOf[js.Any])
    __obj.asInstanceOf[DurationEventEnd]
  }
  
  @scala.inline
  implicit class DurationEventEndOps[Self <: DurationEventEnd] (val x: Self) extends AnyVal {
    
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
    def setPh(value: DURATION_EVENTS_END): Self = this.set("ph", value.asInstanceOf[js.Any])
  }
}
