package typings.ionic.nativeRunMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NativeDeviceTarget extends js.Object {
  var id: String
  var model: String
  var platform: String
  var sdkVersion: String
}

object NativeDeviceTarget {
  @scala.inline
  def apply(id: String, model: String, platform: String, sdkVersion: String): NativeDeviceTarget = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], model = model.asInstanceOf[js.Any], platform = platform.asInstanceOf[js.Any], sdkVersion = sdkVersion.asInstanceOf[js.Any])
    __obj.asInstanceOf[NativeDeviceTarget]
  }
}

