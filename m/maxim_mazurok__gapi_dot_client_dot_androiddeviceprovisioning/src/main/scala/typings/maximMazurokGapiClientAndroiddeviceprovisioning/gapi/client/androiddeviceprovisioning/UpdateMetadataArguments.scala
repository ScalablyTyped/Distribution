package typings.maximMazurokGapiClientAndroiddeviceprovisioning.gapi.client.androiddeviceprovisioning

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateMetadataArguments extends StObject {
  
  /** Required. Device ID of the device. */
  var deviceId: js.UndefOr[String] = js.undefined
  
  /** Required. Device identifier. */
  var deviceIdentifier: js.UndefOr[DeviceIdentifier] = js.undefined
  
  /** Required. The metadata to update. */
  var deviceMetadata: js.UndefOr[DeviceMetadata] = js.undefined
}
object UpdateMetadataArguments {
  
  @scala.inline
  def apply(): UpdateMetadataArguments = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpdateMetadataArguments]
  }
  
  @scala.inline
  implicit class UpdateMetadataArgumentsMutableBuilder[Self <: UpdateMetadataArguments] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDeviceId(value: String): Self = StObject.set(x, "deviceId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeviceIdUndefined: Self = StObject.set(x, "deviceId", js.undefined)
    
    @scala.inline
    def setDeviceIdentifier(value: DeviceIdentifier): Self = StObject.set(x, "deviceIdentifier", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeviceIdentifierUndefined: Self = StObject.set(x, "deviceIdentifier", js.undefined)
    
    @scala.inline
    def setDeviceMetadata(value: DeviceMetadata): Self = StObject.set(x, "deviceMetadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeviceMetadataUndefined: Self = StObject.set(x, "deviceMetadata", js.undefined)
  }
}
