package typings.hermesProfileTransformer.eventInterfacesMod

import typings.hermesProfileTransformer.phasesMod.EventsPhase.DURATION_EVENTS_BEGIN
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DurationEventBegin
  extends DurationEvent
     with SharedEventProperties {
  
  @JSName("ph")
  var ph_DurationEventBegin: DURATION_EVENTS_BEGIN = js.native
}
object DurationEventBegin {
  
  @scala.inline
  def apply(ph: DURATION_EVENTS_BEGIN): DurationEventBegin = {
    val __obj = js.Dynamic.literal(ph = ph.asInstanceOf[js.Any])
    __obj.asInstanceOf[DurationEventBegin]
  }
  
  @scala.inline
  implicit class DurationEventBeginOps[Self <: DurationEventBegin] (val x: Self) extends AnyVal {
    
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
    def setPh(value: DURATION_EVENTS_BEGIN): Self = this.set("ph", value.asInstanceOf[js.Any])
  }
}
