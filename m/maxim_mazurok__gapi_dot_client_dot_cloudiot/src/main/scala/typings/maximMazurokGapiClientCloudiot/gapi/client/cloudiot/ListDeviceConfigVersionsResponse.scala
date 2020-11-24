package typings.maximMazurokGapiClientCloudiot.gapi.client.cloudiot

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListDeviceConfigVersionsResponse extends js.Object {
  
  /** The device configuration for the last few versions. Versions are listed in decreasing order, starting from the most recent one. */
  var deviceConfigs: js.UndefOr[js.Array[DeviceConfig]] = js.native
}
object ListDeviceConfigVersionsResponse {
  
  @scala.inline
  def apply(): ListDeviceConfigVersionsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListDeviceConfigVersionsResponse]
  }
  
  @scala.inline
  implicit class ListDeviceConfigVersionsResponseOps[Self <: ListDeviceConfigVersionsResponse] (val x: Self) extends AnyVal {
    
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
    def setDeviceConfigsVarargs(value: DeviceConfig*): Self = this.set("deviceConfigs", js.Array(value :_*))
    
    @scala.inline
    def setDeviceConfigs(value: js.Array[DeviceConfig]): Self = this.set("deviceConfigs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDeviceConfigs: Self = this.set("deviceConfigs", js.undefined)
  }
}
