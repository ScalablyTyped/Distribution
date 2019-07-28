package typings.intlDashRelativeformat

import typings.intlDashRelativeformat.libTypesMod.STYLE
import typings.intlDashRelativeformat.libTypesMod.SUPPORTED_FIELD
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Locale extends js.Object {
  var locale: String
  var style: STYLE
  var units: js.UndefOr[SUPPORTED_FIELD] = js.undefined
}

object Anon_Locale {
  @scala.inline
  def apply(locale: String, style: STYLE, units: SUPPORTED_FIELD = null): Anon_Locale = {
    val __obj = js.Dynamic.literal(locale = locale, style = style)
    if (units != null) __obj.updateDynamic("units")(units)
    __obj.asInstanceOf[Anon_Locale]
  }
}

