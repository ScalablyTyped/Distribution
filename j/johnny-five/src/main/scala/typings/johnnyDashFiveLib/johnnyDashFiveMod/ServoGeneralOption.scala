package typings
package johnnyDashFiveLib.johnnyDashFiveMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ServoGeneralOption extends js.Object {
  var center: js.UndefOr[scala.Boolean] = js.undefined
  var controller: js.UndefOr[java.lang.String] = js.undefined
  var isInverted: js.UndefOr[scala.Boolean] = js.undefined
  var pin: scala.Double | java.lang.String
  var range: js.UndefOr[js.Array[scala.Double]] = js.undefined
  var startAt: js.UndefOr[scala.Double] = js.undefined
  var `type`: js.UndefOr[java.lang.String] = js.undefined
}

object ServoGeneralOption {
  @scala.inline
  def apply(
    pin: scala.Double | java.lang.String,
    center: js.UndefOr[scala.Boolean] = js.undefined,
    controller: java.lang.String = null,
    isInverted: js.UndefOr[scala.Boolean] = js.undefined,
    range: js.Array[scala.Double] = null,
    startAt: scala.Int | scala.Double = null,
    `type`: java.lang.String = null
  ): ServoGeneralOption = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("pin")(pin.asInstanceOf[js.Any])
    if (!js.isUndefined(center)) __obj.updateDynamic("center")(center)
    if (controller != null) __obj.updateDynamic("controller")(controller)
    if (!js.isUndefined(isInverted)) __obj.updateDynamic("isInverted")(isInverted)
    if (range != null) __obj.updateDynamic("range")(range)
    if (startAt != null) __obj.updateDynamic("startAt")(startAt.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[ServoGeneralOption]
  }
}

