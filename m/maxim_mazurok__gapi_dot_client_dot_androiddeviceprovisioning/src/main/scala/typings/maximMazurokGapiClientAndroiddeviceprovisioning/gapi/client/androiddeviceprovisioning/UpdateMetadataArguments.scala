package typings.maximMazurokGapiClientAndroiddeviceprovisioning.gapi.client.androiddeviceprovisioning

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UpdateMetadataArguments extends js.Object {
  
  /** Required. Device ID of the device. */
  var deviceId: js.UndefOr[String] = js.native
  
  /** Required. Device identifier. */
  var deviceIdentifier: js.UndefOr[DeviceIdentifier] = js.native
  
  /** Required. The metadata to update. */
  var deviceMetadata: js.UndefOr[DeviceMetadata] = js.native
}
object UpdateMetadataArguments {
  
  @scala.inline
  def apply(): UpdateMetadataArguments = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpdateMetadataArguments]
  }
  
  @scala.inline
  implicit class UpdateMetadataArgumentsOps[Self <: UpdateMetadataArguments] (val x: Self) extends AnyVal {
    
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
    def setDeviceIdentifier(value: DeviceIdentifier): Self = this.set("deviceIdentifier", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDeviceIdentifier: Self = this.set("deviceIdentifier", js.undefined)
    
    @scala.inline
    def setDeviceMetadata(value: DeviceMetadata): Self = this.set("deviceMetadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDeviceMetadata: Self = this.set("deviceMetadata", js.undefined)
  }
}
