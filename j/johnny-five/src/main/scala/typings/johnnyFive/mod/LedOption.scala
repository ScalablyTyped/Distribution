package typings.johnnyFive.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LedOption extends js.Object {
  var address: js.UndefOr[Double] = js.undefined
  var controller: js.UndefOr[String] = js.undefined
  var isAnode: js.UndefOr[Boolean] = js.undefined
  var pin: Double
  var `type`: js.UndefOr[String] = js.undefined
}

object LedOption {
  @scala.inline
  def apply(
    pin: Double,
    address: Int | Double = null,
    controller: String = null,
    isAnode: js.UndefOr[Boolean] = js.undefined,
    `type`: String = null
  ): LedOption = {
    val __obj = js.Dynamic.literal(pin = pin.asInstanceOf[js.Any])
    if (address != null) __obj.updateDynamic("address")(address.asInstanceOf[js.Any])
    if (controller != null) __obj.updateDynamic("controller")(controller.asInstanceOf[js.Any])
    if (!js.isUndefined(isAnode)) __obj.updateDynamic("isAnode")(isAnode.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[LedOption]
  }
}

