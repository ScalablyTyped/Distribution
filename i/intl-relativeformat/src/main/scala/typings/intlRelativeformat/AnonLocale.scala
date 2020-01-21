package typings.intlRelativeformat

import typings.intlRelativeformat.typesMod.STYLE
import typings.intlRelativeformat.typesMod.SUPPORTED_FIELD
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonLocale extends js.Object {
  var locale: String
  var style: STYLE
  var units: js.UndefOr[SUPPORTED_FIELD] = js.undefined
}

object AnonLocale {
  @scala.inline
  def apply(locale: String, style: STYLE, units: SUPPORTED_FIELD = null): AnonLocale = {
    val __obj = js.Dynamic.literal(locale = locale.asInstanceOf[js.Any], style = style.asInstanceOf[js.Any])
    if (units != null) __obj.updateDynamic("units")(units.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonLocale]
  }
}

