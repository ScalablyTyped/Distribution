package typings.atIonicUtilsDashSubprocess.atIonicUtilsDashSubprocessMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WhichOptions extends js.Object {
  var PATH: js.UndefOr[String] = js.undefined
  var PATHEXT: js.UndefOr[String] = js.undefined
}

object WhichOptions {
  @scala.inline
  def apply(PATH: String = null, PATHEXT: String = null): WhichOptions = {
    val __obj = js.Dynamic.literal()
    if (PATH != null) __obj.updateDynamic("PATH")(PATH)
    if (PATHEXT != null) __obj.updateDynamic("PATHEXT")(PATHEXT)
    __obj.asInstanceOf[WhichOptions]
  }
}

