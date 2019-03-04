package typings
package johnnyDashFiveLib.johnnyDashFiveMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ESCOption extends js.Object {
  var controller: js.UndefOr[java.lang.String] = js.undefined
  var device: js.UndefOr[java.lang.String] = js.undefined
  var neutral: js.UndefOr[scala.Double] = js.undefined
  var pin: scala.Double | java.lang.String
  var range: js.UndefOr[js.Array[scala.Double]] = js.undefined
  var startAt: js.UndefOr[scala.Double] = js.undefined
}

object ESCOption {
  @scala.inline
  def apply(
    pin: scala.Double | java.lang.String,
    controller: java.lang.String = null,
    device: java.lang.String = null,
    neutral: scala.Int | scala.Double = null,
    range: js.Array[scala.Double] = null,
    startAt: scala.Int | scala.Double = null
  ): ESCOption = {
    val __obj = js.Dynamic.literal(pin = pin.asInstanceOf[js.Any])
    if (controller != null) __obj.updateDynamic("controller")(controller)
    if (device != null) __obj.updateDynamic("device")(device)
    if (neutral != null) __obj.updateDynamic("neutral")(neutral.asInstanceOf[js.Any])
    if (range != null) __obj.updateDynamic("range")(range)
    if (startAt != null) __obj.updateDynamic("startAt")(startAt.asInstanceOf[js.Any])
    __obj.asInstanceOf[ESCOption]
  }
}

