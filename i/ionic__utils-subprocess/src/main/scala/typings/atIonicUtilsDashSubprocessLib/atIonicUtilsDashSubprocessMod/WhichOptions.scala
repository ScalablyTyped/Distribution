package typings
package atIonicUtilsDashSubprocessLib.atIonicUtilsDashSubprocessMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WhichOptions extends js.Object {
  var PATH: js.UndefOr[java.lang.String] = js.undefined
  var PATHEXT: js.UndefOr[java.lang.String] = js.undefined
}

object WhichOptions {
  @scala.inline
  def apply(PATH: java.lang.String = null, PATHEXT: java.lang.String = null): WhichOptions = {
    val __obj = js.Dynamic.literal()
    if (PATH != null) __obj.updateDynamic("PATH")(PATH)
    if (PATHEXT != null) __obj.updateDynamic("PATHEXT")(PATHEXT)
    __obj.asInstanceOf[WhichOptions]
  }
}

