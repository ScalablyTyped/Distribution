package typings.ionic.libNativeDashRunMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NativeRunSchema extends js.Object {
  var forwardedPorts: js.UndefOr[js.Array[String | Double]] = js.undefined
  var packagePath: String
  var platform: String
}

object NativeRunSchema {
  @scala.inline
  def apply(packagePath: String, platform: String, forwardedPorts: js.Array[String | Double] = null): NativeRunSchema = {
    val __obj = js.Dynamic.literal(packagePath = packagePath.asInstanceOf[js.Any], platform = platform.asInstanceOf[js.Any])
    if (forwardedPorts != null) __obj.updateDynamic("forwardedPorts")(forwardedPorts.asInstanceOf[js.Any])
    __obj.asInstanceOf[NativeRunSchema]
  }
}

