package typings
package johnnyDashFiveLib.johnnyDashFiveMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LedOption extends js.Object {
  var address: js.UndefOr[scala.Double] = js.undefined
  var controller: js.UndefOr[java.lang.String] = js.undefined
  var isAnode: js.UndefOr[scala.Boolean] = js.undefined
  var pin: scala.Double
  var `type`: js.UndefOr[java.lang.String] = js.undefined
}

object LedOption {
  @scala.inline
  def apply(
    pin: scala.Double,
    address: scala.Int | scala.Double = null,
    controller: java.lang.String = null,
    isAnode: js.UndefOr[scala.Boolean] = js.undefined,
    `type`: java.lang.String = null
  ): LedOption = {
    val __obj = js.Dynamic.literal(pin = pin)
    if (address != null) __obj.updateDynamic("address")(address.asInstanceOf[js.Any])
    if (controller != null) __obj.updateDynamic("controller")(controller)
    if (!js.isUndefined(isAnode)) __obj.updateDynamic("isAnode")(isAnode)
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[LedOption]
  }
}

