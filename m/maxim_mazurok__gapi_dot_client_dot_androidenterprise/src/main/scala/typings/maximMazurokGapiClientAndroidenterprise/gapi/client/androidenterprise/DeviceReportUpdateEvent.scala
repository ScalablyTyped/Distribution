package typings.maximMazurokGapiClientAndroidenterprise.gapi.client.androidenterprise

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DeviceReportUpdateEvent extends js.Object {
  
  /** The Android ID of the device. This field will always be present. */
  var deviceId: js.UndefOr[String] = js.native
  
  /** The device report updated with the latest app states. This field will always be present. */
  var report: js.UndefOr[DeviceReport] = js.native
  
  /** The ID of the user. This field will always be present. */
  var userId: js.UndefOr[String] = js.native
}
object DeviceReportUpdateEvent {
  
  @scala.inline
  def apply(): DeviceReportUpdateEvent = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeviceReportUpdateEvent]
  }
  
  @scala.inline
  implicit class DeviceReportUpdateEventOps[Self <: DeviceReportUpdateEvent] (val x: Self) extends AnyVal {
    
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
    def setDeviceId(value: String): Self = this.set("deviceId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDeviceId: Self = this.set("deviceId", js.undefined)
    
    @scala.inline
    def setReport(value: DeviceReport): Self = this.set("report", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReport: Self = this.set("report", js.undefined)
    
    @scala.inline
    def setUserId(value: String): Self = this.set("userId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUserId: Self = this.set("userId", js.undefined)
  }
}
