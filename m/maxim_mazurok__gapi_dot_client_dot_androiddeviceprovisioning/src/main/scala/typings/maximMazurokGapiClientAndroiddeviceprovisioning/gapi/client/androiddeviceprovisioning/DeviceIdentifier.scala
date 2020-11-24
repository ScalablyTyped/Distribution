package typings.maximMazurokGapiClientAndroiddeviceprovisioning.gapi.client.androiddeviceprovisioning

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DeviceIdentifier extends js.Object {
  
  /** The device’s IMEI number. Validated on input. */
  var imei: js.UndefOr[String] = js.native
  
  /**
    * The device manufacturer’s name. Matches the device's built-in value returned from `android.os.Build.MANUFACTURER`. Allowed values are listed in
    * [manufacturers](/zero-touch/resources/manufacturer-names#manufacturers-names).
    */
  var manufacturer: js.UndefOr[String] = js.native
  
  /** The device’s MEID number. */
  var meid: js.UndefOr[String] = js.native
  
  /**
    * The device model's name. Matches the device's built-in value returned from `android.os.Build.MODEL`. Allowed values are listed in
    * [models](/zero-touch/resources/manufacturer-names#model-names).
    */
  var model: js.UndefOr[String] = js.native
  
  /** The manufacturer's serial number for the device. This value might not be unique across different device models. */
  var serialNumber: js.UndefOr[String] = js.native
}
object DeviceIdentifier {
  
  @scala.inline
  def apply(): DeviceIdentifier = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeviceIdentifier]
  }
  
  @scala.inline
  implicit class DeviceIdentifierOps[Self <: DeviceIdentifier] (val x: Self) extends AnyVal {
    
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
    def setImei(value: String): Self = this.set("imei", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteImei: Self = this.set("imei", js.undefined)
    
    @scala.inline
    def setManufacturer(value: String): Self = this.set("manufacturer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteManufacturer: Self = this.set("manufacturer", js.undefined)
    
    @scala.inline
    def setMeid(value: String): Self = this.set("meid", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMeid: Self = this.set("meid", js.undefined)
    
    @scala.inline
    def setModel(value: String): Self = this.set("model", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteModel: Self = this.set("model", js.undefined)
    
    @scala.inline
    def setSerialNumber(value: String): Self = this.set("serialNumber", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSerialNumber: Self = this.set("serialNumber", js.undefined)
  }
}
