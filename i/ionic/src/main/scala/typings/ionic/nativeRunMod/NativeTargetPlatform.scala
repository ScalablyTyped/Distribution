package typings.ionic.nativeRunMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NativeTargetPlatform extends js.Object {
  var devices: js.Array[NativeDeviceTarget]
  var virtualDevices: js.Array[NativeVirtualDeviceTarget]
}

object NativeTargetPlatform {
  @scala.inline
  def apply(devices: js.Array[NativeDeviceTarget], virtualDevices: js.Array[NativeVirtualDeviceTarget]): NativeTargetPlatform = {
    val __obj = js.Dynamic.literal(devices = devices.asInstanceOf[js.Any], virtualDevices = virtualDevices.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[NativeTargetPlatform]
  }
}

