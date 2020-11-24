package typings.matrixJsSdk.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DeviceId extends js.Object {
  
  var deviceId: String = js.native
  
  var olmDevice: PickleKey = js.native
  
  var userId: String = js.native
}
object DeviceId {
  
  @scala.inline
  def apply(deviceId: String, olmDevice: PickleKey, userId: String): DeviceId = {
    val __obj = js.Dynamic.literal(deviceId = deviceId.asInstanceOf[js.Any], olmDevice = olmDevice.asInstanceOf[js.Any], userId = userId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeviceId]
  }
  
  @scala.inline
  implicit class DeviceIdOps[Self <: DeviceId] (val x: Self) extends AnyVal {
    
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
    def setOlmDevice(value: PickleKey): Self = this.set("olmDevice", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUserId(value: String): Self = this.set("userId", value.asInstanceOf[js.Any])
  }
}
