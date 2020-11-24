package typings.googleapis.v1beta1Mod.alertcenterV1beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Detailed information of a single MDM suspicious activity event.
  */
@js.native
trait SchemaSuspiciousActivitySecurityDetail extends js.Object {
  
  /**
    * Required. The device ID.
    */
  var deviceId: js.UndefOr[String] = js.native
  
  /**
    * The model of the device.
    */
  var deviceModel: js.UndefOr[String] = js.native
  
  /**
    * The device property which was changed.
    */
  var deviceProperty: js.UndefOr[String] = js.native
  
  /**
    * The type of the device.
    */
  var deviceType: js.UndefOr[String] = js.native
  
  /**
    * Required for iOS, empty for others.
    */
  var iosVendorId: js.UndefOr[String] = js.native
  
  /**
    * The new value of the device property after the change.
    */
  var newValue: js.UndefOr[String] = js.native
  
  /**
    * The old value of the device property before the change.
    */
  var oldValue: js.UndefOr[String] = js.native
  
  /**
    * The device resource ID.
    */
  var resourceId: js.UndefOr[String] = js.native
  
  /**
    * The serial number of the device.
    */
  var serialNumber: js.UndefOr[String] = js.native
}
object SchemaSuspiciousActivitySecurityDetail {
  
  @scala.inline
  def apply(): SchemaSuspiciousActivitySecurityDetail = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaSuspiciousActivitySecurityDetail]
  }
  
  @scala.inline
  implicit class SchemaSuspiciousActivitySecurityDetailOps[Self <: SchemaSuspiciousActivitySecurityDetail] (val x: Self) extends AnyVal {
    
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
    def setDeviceModel(value: String): Self = this.set("deviceModel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDeviceModel: Self = this.set("deviceModel", js.undefined)
    
    @scala.inline
    def setDeviceProperty(value: String): Self = this.set("deviceProperty", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDeviceProperty: Self = this.set("deviceProperty", js.undefined)
    
    @scala.inline
    def setDeviceType(value: String): Self = this.set("deviceType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDeviceType: Self = this.set("deviceType", js.undefined)
    
    @scala.inline
    def setIosVendorId(value: String): Self = this.set("iosVendorId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIosVendorId: Self = this.set("iosVendorId", js.undefined)
    
    @scala.inline
    def setNewValue(value: String): Self = this.set("newValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNewValue: Self = this.set("newValue", js.undefined)
    
    @scala.inline
    def setOldValue(value: String): Self = this.set("oldValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOldValue: Self = this.set("oldValue", js.undefined)
    
    @scala.inline
    def setResourceId(value: String): Self = this.set("resourceId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteResourceId: Self = this.set("resourceId", js.undefined)
    
    @scala.inline
    def setSerialNumber(value: String): Self = this.set("serialNumber", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSerialNumber: Self = this.set("serialNumber", js.undefined)
  }
}
