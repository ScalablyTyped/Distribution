package typings
package intlDashRelativeformatLib.intlDashRelativeformatMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IntlRelativeFormatOptions extends js.Object {
  var style: js.UndefOr[intlDashRelativeformatLib.libTypesMod.STYLE] = js.undefined
  var units: js.UndefOr[intlDashRelativeformatLib.libTypesMod.SUPPORTED_FIELD] = js.undefined
}

object IntlRelativeFormatOptions {
  @scala.inline
  def apply(
    style: intlDashRelativeformatLib.libTypesMod.STYLE = null,
    units: intlDashRelativeformatLib.libTypesMod.SUPPORTED_FIELD = null
  ): IntlRelativeFormatOptions = {
    val __obj = js.Dynamic.literal()
    if (style != null) __obj.updateDynamic("style")(style)
    if (units != null) __obj.updateDynamic("units")(units)
    __obj.asInstanceOf[IntlRelativeFormatOptions]
  }
}

