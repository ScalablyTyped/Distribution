package typings.maximMazurokGapiClientAndroiddeviceprovisioning.gapi.client.androiddeviceprovisioning

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FindDevicesByOwnerResponse extends js.Object {
  
  /** The customer's devices. */
  var devices: js.UndefOr[js.Array[Device]] = js.native
  
  /** A token used to access the next page of results. Omitted if no further results are available. */
  var nextPageToken: js.UndefOr[String] = js.native
  
  /** The total count of items in the list irrespective of pagination. */
  var totalSize: js.UndefOr[Double] = js.native
}
object FindDevicesByOwnerResponse {
  
  @scala.inline
  def apply(): FindDevicesByOwnerResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FindDevicesByOwnerResponse]
  }
  
  @scala.inline
  implicit class FindDevicesByOwnerResponseOps[Self <: FindDevicesByOwnerResponse] (val x: Self) extends AnyVal {
    
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
    def setDevicesVarargs(value: Device*): Self = this.set("devices", js.Array(value :_*))
    
    @scala.inline
    def setDevices(value: js.Array[Device]): Self = this.set("devices", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDevices: Self = this.set("devices", js.undefined)
    
    @scala.inline
    def setNextPageToken(value: String): Self = this.set("nextPageToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNextPageToken: Self = this.set("nextPageToken", js.undefined)
    
    @scala.inline
    def setTotalSize(value: Double): Self = this.set("totalSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTotalSize: Self = this.set("totalSize", js.undefined)
  }
}
