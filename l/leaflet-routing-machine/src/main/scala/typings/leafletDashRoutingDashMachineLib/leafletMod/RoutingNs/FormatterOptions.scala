package typings
package leafletDashRoutingDashMachineLib.leafletMod.RoutingNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FormatterOptions extends js.Object {
  var language: js.UndefOr[java.lang.String] = js.undefined
  var roundingSensitivity: js.UndefOr[scala.Double] = js.undefined
  var unitNames: js.UndefOr[js.Object] = js.undefined
  var units: js.UndefOr[java.lang.String] = js.undefined
}

object FormatterOptions {
  @scala.inline
  def apply(
    language: java.lang.String = null,
    roundingSensitivity: scala.Int | scala.Double = null,
    unitNames: js.Object = null,
    units: java.lang.String = null
  ): FormatterOptions = {
    val __obj = js.Dynamic.literal()
    if (language != null) __obj.updateDynamic("language")(language)
    if (roundingSensitivity != null) __obj.updateDynamic("roundingSensitivity")(roundingSensitivity.asInstanceOf[js.Any])
    if (unitNames != null) __obj.updateDynamic("unitNames")(unitNames)
    if (units != null) __obj.updateDynamic("units")(units)
    __obj.asInstanceOf[FormatterOptions]
  }
}

