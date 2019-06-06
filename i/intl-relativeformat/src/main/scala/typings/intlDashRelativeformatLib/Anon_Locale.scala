package typings
package intlDashRelativeformatLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Locale extends js.Object {
  var locale: java.lang.String
  var style: intlDashRelativeformatLib.libTypesMod.STYLE
  var units: js.UndefOr[intlDashRelativeformatLib.libTypesMod.SUPPORTED_FIELD] = js.undefined
}

object Anon_Locale {
  @scala.inline
  def apply(
    locale: java.lang.String,
    style: intlDashRelativeformatLib.libTypesMod.STYLE,
    units: intlDashRelativeformatLib.libTypesMod.SUPPORTED_FIELD = null
  ): Anon_Locale = {
    val __obj = js.Dynamic.literal(locale = locale, style = style)
    if (units != null) __obj.updateDynamic("units")(units)
    __obj.asInstanceOf[Anon_Locale]
  }
}

