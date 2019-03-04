package typings
package karmaLib.karmaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CustomLauncher extends js.Object {
  var base: java.lang.String
  var browserName: js.UndefOr[java.lang.String] = js.undefined
  var flags: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  var platform: js.UndefOr[java.lang.String] = js.undefined
}

object CustomLauncher {
  @scala.inline
  def apply(
    base: java.lang.String,
    browserName: java.lang.String = null,
    flags: js.Array[java.lang.String] = null,
    platform: java.lang.String = null
  ): CustomLauncher = {
    val __obj = js.Dynamic.literal(base = base)
    if (browserName != null) __obj.updateDynamic("browserName")(browserName)
    if (flags != null) __obj.updateDynamic("flags")(flags)
    if (platform != null) __obj.updateDynamic("platform")(platform)
    __obj.asInstanceOf[CustomLauncher]
  }
}

