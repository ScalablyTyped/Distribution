package typings.maximMazurokGapiClientAndroiddeviceprovisioning.gapi.client.androiddeviceprovisioning

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FindDevicesByDeviceIdentifierResponse extends StObject {
  
  /** Found devices. */
  var devices: js.UndefOr[js.Array[Device]] = js.native
  
  /** A token used to access the next page of results. Omitted if no further results are available. */
  var nextPageToken: js.UndefOr[String] = js.native
  
  /** The total count of items in the list irrespective of pagination. */
  var totalSize: js.UndefOr[Double] = js.native
}
object FindDevicesByDeviceIdentifierResponse {
  
  @scala.inline
  def apply(): FindDevicesByDeviceIdentifierResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FindDevicesByDeviceIdentifierResponse]
  }
  
  @scala.inline
  implicit class FindDevicesByDeviceIdentifierResponseMutableBuilder[Self <: FindDevicesByDeviceIdentifierResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDevices(value: js.Array[Device]): Self = StObject.set(x, "devices", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDevicesUndefined: Self = StObject.set(x, "devices", js.undefined)
    
    @scala.inline
    def setDevicesVarargs(value: Device*): Self = StObject.set(x, "devices", js.Array(value :_*))
    
    @scala.inline
    def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
    
    @scala.inline
    def setTotalSize(value: Double): Self = StObject.set(x, "totalSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTotalSizeUndefined: Self = StObject.set(x, "totalSize", js.undefined)
  }
}
