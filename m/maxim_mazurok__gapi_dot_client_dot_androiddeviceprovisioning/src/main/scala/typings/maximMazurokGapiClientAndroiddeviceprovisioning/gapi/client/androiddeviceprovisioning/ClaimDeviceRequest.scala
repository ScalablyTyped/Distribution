package typings.maximMazurokGapiClientAndroiddeviceprovisioning.gapi.client.androiddeviceprovisioning

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ClaimDeviceRequest extends StObject {
  
  /** Required. The ID of the customer for whom the device is being claimed. */
  var customerId: js.UndefOr[String] = js.undefined
  
  /** Required. Required. The device identifier of the device to claim. */
  var deviceIdentifier: js.UndefOr[DeviceIdentifier] = js.undefined
  
  /** Optional. The metadata to attach to the device. */
  var deviceMetadata: js.UndefOr[DeviceMetadata] = js.undefined
  
  /** Required. The section type of the device's provisioning record. */
  var sectionType: js.UndefOr[String] = js.undefined
}
object ClaimDeviceRequest {
  
  @scala.inline
  def apply(): ClaimDeviceRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ClaimDeviceRequest]
  }
  
  @scala.inline
  implicit class ClaimDeviceRequestMutableBuilder[Self <: ClaimDeviceRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCustomerId(value: String): Self = StObject.set(x, "customerId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCustomerIdUndefined: Self = StObject.set(x, "customerId", js.undefined)
    
    @scala.inline
    def setDeviceIdentifier(value: DeviceIdentifier): Self = StObject.set(x, "deviceIdentifier", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeviceIdentifierUndefined: Self = StObject.set(x, "deviceIdentifier", js.undefined)
    
    @scala.inline
    def setDeviceMetadata(value: DeviceMetadata): Self = StObject.set(x, "deviceMetadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeviceMetadataUndefined: Self = StObject.set(x, "deviceMetadata", js.undefined)
    
    @scala.inline
    def setSectionType(value: String): Self = StObject.set(x, "sectionType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSectionTypeUndefined: Self = StObject.set(x, "sectionType", js.undefined)
  }
}
