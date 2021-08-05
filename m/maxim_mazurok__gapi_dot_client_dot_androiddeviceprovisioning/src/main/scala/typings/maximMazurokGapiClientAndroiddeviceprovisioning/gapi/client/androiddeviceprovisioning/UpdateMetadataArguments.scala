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
  
  inline def apply(): UpdateMetadataArguments = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpdateMetadataArguments]
  }
  
  extension [Self <: UpdateMetadataArguments](x: Self) {
    
    inline def setDeviceId(value: String): Self = StObject.set(x, "deviceId", value.asInstanceOf[js.Any])
    
    inline def setDeviceIdUndefined: Self = StObject.set(x, "deviceId", js.undefined)
    
    inline def setDeviceIdentifier(value: DeviceIdentifier): Self = StObject.set(x, "deviceIdentifier", value.asInstanceOf[js.Any])
    
    inline def setDeviceIdentifierUndefined: Self = StObject.set(x, "deviceIdentifier", js.undefined)
    
    inline def setDeviceMetadata(value: DeviceMetadata): Self = StObject.set(x, "deviceMetadata", value.asInstanceOf[js.Any])
    
    inline def setDeviceMetadataUndefined: Self = StObject.set(x, "deviceMetadata", js.undefined)
  }
}
