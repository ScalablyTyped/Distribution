package typings.maximMazurokGapiClientAndroiddeviceprovisioning.gapi.client.androiddeviceprovisioning

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FindDevicesByOwnerRequest extends StObject {
  
  /** Required. The list of customer IDs to search for. */
  var customerId: js.UndefOr[js.Array[String]] = js.undefined
  
  /** Required. The maximum number of devices to show in a page of results. Must be between 1 and 100 inclusive. */
  var limit: js.UndefOr[String] = js.undefined
  
  /** A token specifying which result page to return. */
  var pageToken: js.UndefOr[String] = js.undefined
  
  /** Required. The section type of the device's provisioning record. */
  var sectionType: js.UndefOr[String] = js.undefined
}
object FindDevicesByOwnerRequest {
  
  inline def apply(): FindDevicesByOwnerRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FindDevicesByOwnerRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: FindDevicesByOwnerRequest] (val x: Self) extends AnyVal {
    
    inline def setCustomerId(value: js.Array[String]): Self = StObject.set(x, "customerId", value.asInstanceOf[js.Any])
    
    inline def setCustomerIdUndefined: Self = StObject.set(x, "customerId", js.undefined)
    
    inline def setCustomerIdVarargs(value: String*): Self = StObject.set(x, "customerId", js.Array(value*))
    
    inline def setLimit(value: String): Self = StObject.set(x, "limit", value.asInstanceOf[js.Any])
    
    inline def setLimitUndefined: Self = StObject.set(x, "limit", js.undefined)
    
    inline def setPageToken(value: String): Self = StObject.set(x, "pageToken", value.asInstanceOf[js.Any])
    
    inline def setPageTokenUndefined: Self = StObject.set(x, "pageToken", js.undefined)
    
    inline def setSectionType(value: String): Self = StObject.set(x, "sectionType", value.asInstanceOf[js.Any])
    
    inline def setSectionTypeUndefined: Self = StObject.set(x, "sectionType", js.undefined)
  }
}
