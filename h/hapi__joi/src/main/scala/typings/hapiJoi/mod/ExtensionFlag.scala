package typings.hapiJoi.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ExtensionFlag extends js.Object {
  var default: js.UndefOr[js.Any] = js.undefined
  var setter: js.UndefOr[String] = js.undefined
}

object ExtensionFlag {
  @scala.inline
  def apply(default: js.Any = null, setter: String = null): ExtensionFlag = {
    val __obj = js.Dynamic.literal()
    if (default != null) __obj.updateDynamic("default")(default.asInstanceOf[js.Any])
    if (setter != null) __obj.updateDynamic("setter")(setter.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExtensionFlag]
  }
}

