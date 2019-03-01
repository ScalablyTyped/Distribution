package typings
package johnnyDashFiveLib.johnnyDashFiveMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AltimeterOption extends js.Object {
  var address: js.UndefOr[scala.Double] = js.undefined
  var controller: java.lang.String
  var elevation: js.UndefOr[scala.Double] = js.undefined
  var freq: js.UndefOr[scala.Double] = js.undefined
}

object AltimeterOption {
  @scala.inline
  def apply(
    controller: java.lang.String,
    address: scala.Int | scala.Double = null,
    elevation: scala.Int | scala.Double = null,
    freq: scala.Int | scala.Double = null
  ): AltimeterOption = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("controller")(controller)
    if (address != null) __obj.updateDynamic("address")(address.asInstanceOf[js.Any])
    if (elevation != null) __obj.updateDynamic("elevation")(elevation.asInstanceOf[js.Any])
    if (freq != null) __obj.updateDynamic("freq")(freq.asInstanceOf[js.Any])
    __obj.asInstanceOf[AltimeterOption]
  }
}

