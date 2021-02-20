package typings.maximMazurokGapiClientAndroiddeviceprovisioning.gapi.client.androiddeviceprovisioning

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UpdateDeviceMetadataRequest extends StObject {
  
  /** Required. The metadata to attach to the device. */
  var deviceMetadata: js.UndefOr[DeviceMetadata] = js.native
}
object UpdateDeviceMetadataRequest {
  
  @scala.inline
  def apply(): UpdateDeviceMetadataRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpdateDeviceMetadataRequest]
  }
  
  @scala.inline
  implicit class UpdateDeviceMetadataRequestMutableBuilder[Self <: UpdateDeviceMetadataRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDeviceMetadata(value: DeviceMetadata): Self = StObject.set(x, "deviceMetadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeviceMetadataUndefined: Self = StObject.set(x, "deviceMetadata", js.undefined)
  }
}
