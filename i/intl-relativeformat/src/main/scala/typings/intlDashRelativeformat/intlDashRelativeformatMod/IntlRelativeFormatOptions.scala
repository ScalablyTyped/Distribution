package typings.intlDashRelativeformat.intlDashRelativeformatMod

import typings.intlDashRelativeformat.libTypesMod.STYLE
import typings.intlDashRelativeformat.libTypesMod.SUPPORTED_FIELD
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IntlRelativeFormatOptions extends js.Object {
  var style: js.UndefOr[STYLE] = js.undefined
  var units: js.UndefOr[SUPPORTED_FIELD] = js.undefined
}

object IntlRelativeFormatOptions {
  @scala.inline
  def apply(style: STYLE = null, units: SUPPORTED_FIELD = null): IntlRelativeFormatOptions = {
    val __obj = js.Dynamic.literal()
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (units != null) __obj.updateDynamic("units")(units.asInstanceOf[js.Any])
    __obj.asInstanceOf[IntlRelativeFormatOptions]
  }
}

