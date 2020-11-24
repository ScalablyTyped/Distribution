package typings.googleapis.v1beta1Mod.alertcenterV1beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Detailed information of a single MDM device compromised event.
  */
@js.native
trait SchemaDeviceCompromisedSecurityDetail extends js.Object {
  
  /**
    * The device compromised state. Possible values are
    * &quot;`Compromised`&quot; or &quot;`Not Compromised`&quot;.
    */
  var deviceCompromisedState: js.UndefOr[String] = js.native
  
  /**
    * Required. The device ID.
    */
  var deviceId: js.UndefOr[String] = js.native
  
  /**
    * The model of the device.
    */
  var deviceModel: js.UndefOr[String] = js.native
  
  /**
    * The type of the device.
    */
  var deviceType: js.UndefOr[String] = js.native
  
  /**
    * Required for iOS, empty for others.
    */
  var iosVendorId: js.UndefOr[String] = js.native
  
  /**
    * The device resource ID.
    */
  var resourceId: js.UndefOr[String] = js.native
  
  /**
    * The serial number of the device.
    */
  var serialNumber: js.UndefOr[String] = js.native
}
object SchemaDeviceCompromisedSecurityDetail {
  
  @scala.inline
  def apply(): SchemaDeviceCompromisedSecurityDetail = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaDeviceCompromisedSecurityDetail]
  }
  
  @scala.inline
  implicit class SchemaDeviceCompromisedSecurityDetailOps[Self <: SchemaDeviceCompromisedSecurityDetail] (val x: Self) extends AnyVal {
    
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
    def setDeviceCompromisedState(value: String): Self = this.set("deviceCompromisedState", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDeviceCompromisedState: Self = this.set("deviceCompromisedState", js.undefined)
    
    @scala.inline
    def setDeviceId(value: String): Self = this.set("deviceId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDeviceId: Self = this.set("deviceId", js.undefined)
    
    @scala.inline
    def setDeviceModel(value: String): Self = this.set("deviceModel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDeviceModel: Self = this.set("deviceModel", js.undefined)
    
    @scala.inline
    def setDeviceType(value: String): Self = this.set("deviceType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDeviceType: Self = this.set("deviceType", js.undefined)
    
    @scala.inline
    def setIosVendorId(value: String): Self = this.set("iosVendorId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIosVendorId: Self = this.set("iosVendorId", js.undefined)
    
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
