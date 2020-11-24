package typings.ionic.nativeRunMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait NativeTargetPlatform extends js.Object {
  
  var devices: js.Array[NativeDeviceTarget] = js.native
  
  var virtualDevices: js.Array[NativeVirtualDeviceTarget] = js.native
}
object NativeTargetPlatform {
  
  @scala.inline
  def apply(devices: js.Array[NativeDeviceTarget], virtualDevices: js.Array[NativeVirtualDeviceTarget]): NativeTargetPlatform = {
    val __obj = js.Dynamic.literal(devices = devices.asInstanceOf[js.Any], virtualDevices = virtualDevices.asInstanceOf[js.Any])
    __obj.asInstanceOf[NativeTargetPlatform]
  }
  
  @scala.inline
  implicit class NativeTargetPlatformOps[Self <: NativeTargetPlatform] (val x: Self) extends AnyVal {
    
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
    def setDevicesVarargs(value: NativeDeviceTarget*): Self = this.set("devices", js.Array(value :_*))
    
    @scala.inline
    def setDevices(value: js.Array[NativeDeviceTarget]): Self = this.set("devices", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVirtualDevicesVarargs(value: NativeVirtualDeviceTarget*): Self = this.set("virtualDevices", js.Array(value :_*))
    
    @scala.inline
    def setVirtualDevices(value: js.Array[NativeVirtualDeviceTarget]): Self = this.set("virtualDevices", value.asInstanceOf[js.Any])
  }
}
