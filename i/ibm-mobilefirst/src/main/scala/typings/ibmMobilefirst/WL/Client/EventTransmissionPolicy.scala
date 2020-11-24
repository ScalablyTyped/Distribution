package typings.ibmMobilefirst.WL.Client

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EventTransmissionPolicy extends js.Object {
  
  var eventStorageEnabled: js.UndefOr[Boolean] = js.native
  
  var interval: js.UndefOr[Double] = js.native
}
object EventTransmissionPolicy {
  
  @scala.inline
  def apply(): EventTransmissionPolicy = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EventTransmissionPolicy]
  }
  
  @scala.inline
  implicit class EventTransmissionPolicyOps[Self <: EventTransmissionPolicy] (val x: Self) extends AnyVal {
    
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
    def setEventStorageEnabled(value: Boolean): Self = this.set("eventStorageEnabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEventStorageEnabled: Self = this.set("eventStorageEnabled", js.undefined)
    
    @scala.inline
    def setInterval(value: Double): Self = this.set("interval", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInterval: Self = this.set("interval", js.undefined)
  }
}
