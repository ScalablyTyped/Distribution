package typings
package humpsLib.humpsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HumpsOptions extends js.Object {
  var process: js.UndefOr[HumpsProcessor] = js.undefined
  var separator: js.UndefOr[java.lang.String] = js.undefined
  var split: js.UndefOr[stdLib.RegExp] = js.undefined
}

object HumpsOptions {
  @scala.inline
  def apply(process: HumpsProcessor = null, separator: java.lang.String = null, split: stdLib.RegExp = null): HumpsOptions = {
    val __obj = js.Dynamic.literal()
    if (process != null) __obj.updateDynamic("process")(process)
    if (separator != null) __obj.updateDynamic("separator")(separator)
    if (split != null) __obj.updateDynamic("split")(split)
    __obj.asInstanceOf[HumpsOptions]
  }
}

