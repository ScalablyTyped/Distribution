package typings.maximMazurokGapiClientAndroiddeviceprovisioning.gapi.client.androiddeviceprovisioning

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CustomerListDevicesResponse extends StObject {
  
  /** The customer's devices. */
  var devices: js.UndefOr[js.Array[Device]] = js.undefined
  
  /** A token used to access the next page of results. Omitted if no further results are available. */
  var nextPageToken: js.UndefOr[String] = js.undefined
}
object CustomerListDevicesResponse {
  
  @scala.inline
  def apply(): CustomerListDevicesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CustomerListDevicesResponse]
  }
  
  @scala.inline
  implicit class CustomerListDevicesResponseMutableBuilder[Self <: CustomerListDevicesResponse] (val x: Self) extends AnyVal {
    
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
  }
}
