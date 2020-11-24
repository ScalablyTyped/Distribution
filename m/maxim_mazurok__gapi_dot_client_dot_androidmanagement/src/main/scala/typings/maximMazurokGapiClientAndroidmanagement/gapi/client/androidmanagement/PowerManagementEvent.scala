package typings.maximMazurokGapiClientAndroidmanagement.gapi.client.androidmanagement

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PowerManagementEvent extends js.Object {
  
  /** For BATTERY_LEVEL_COLLECTED events, the battery level as a percentage. */
  var batteryLevel: js.UndefOr[Double] = js.native
  
  /** The creation time of the event. */
  var createTime: js.UndefOr[String] = js.native
  
  /** Event type. */
  var eventType: js.UndefOr[String] = js.native
}
object PowerManagementEvent {
  
  @scala.inline
  def apply(): PowerManagementEvent = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PowerManagementEvent]
  }
  
  @scala.inline
  implicit class PowerManagementEventOps[Self <: PowerManagementEvent] (val x: Self) extends AnyVal {
    
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
    def setBatteryLevel(value: Double): Self = this.set("batteryLevel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBatteryLevel: Self = this.set("batteryLevel", js.undefined)
    
    @scala.inline
    def setCreateTime(value: String): Self = this.set("createTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCreateTime: Self = this.set("createTime", js.undefined)
    
    @scala.inline
    def setEventType(value: String): Self = this.set("eventType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEventType: Self = this.set("eventType", js.undefined)
  }
}
