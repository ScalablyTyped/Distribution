package typings.karma.karmaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CustomLauncher extends js.Object {
  var base: String
  var browserName: js.UndefOr[String] = js.undefined
  var flags: js.UndefOr[js.Array[String]] = js.undefined
  var platform: js.UndefOr[String] = js.undefined
}

object CustomLauncher {
  @scala.inline
  def apply(base: String, browserName: String = null, flags: js.Array[String] = null, platform: String = null): CustomLauncher = {
    val __obj = js.Dynamic.literal(base = base)
    if (browserName != null) __obj.updateDynamic("browserName")(browserName)
    if (flags != null) __obj.updateDynamic("flags")(flags)
    if (platform != null) __obj.updateDynamic("platform")(platform)
    __obj.asInstanceOf[CustomLauncher]
  }
}

