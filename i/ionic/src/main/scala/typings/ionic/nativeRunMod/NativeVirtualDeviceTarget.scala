package typings.ionic.nativeRunMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NativeVirtualDeviceTarget extends js.Object {
  var id: String
  var name: String
  var platform: String
  var sdkVersion: String
}

object NativeVirtualDeviceTarget {
  @scala.inline
  def apply(id: String, name: String, platform: String, sdkVersion: String): NativeVirtualDeviceTarget = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], platform = platform.asInstanceOf[js.Any], sdkVersion = sdkVersion.asInstanceOf[js.Any])
    __obj.asInstanceOf[NativeVirtualDeviceTarget]
  }
}

