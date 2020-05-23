package typings.johnnyFive.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AccelerometerAnalogOption extends AccelerometerGeneralOption {
  var aref: js.UndefOr[Double] = js.undefined
  var autoCalibrate: js.UndefOr[Boolean] = js.undefined
  var pins: js.Array[String]
  var sensitivity: js.UndefOr[Double] = js.undefined
  var zeroV: js.UndefOr[Double | js.Array[Double]] = js.undefined
}

object AccelerometerAnalogOption {
  @scala.inline
  def apply(
    pins: js.Array[String],
    aref: js.UndefOr[Double] = js.undefined,
    autoCalibrate: js.UndefOr[Boolean] = js.undefined,
    controller: String = null,
    sensitivity: js.UndefOr[Double] = js.undefined,
    zeroV: Double | js.Array[Double] = null
  ): AccelerometerAnalogOption = {
    val __obj = js.Dynamic.literal(pins = pins.asInstanceOf[js.Any])
    if (!js.isUndefined(aref)) __obj.updateDynamic("aref")(aref.get.asInstanceOf[js.Any])
    if (!js.isUndefined(autoCalibrate)) __obj.updateDynamic("autoCalibrate")(autoCalibrate.get.asInstanceOf[js.Any])
    if (controller != null) __obj.updateDynamic("controller")(controller.asInstanceOf[js.Any])
    if (!js.isUndefined(sensitivity)) __obj.updateDynamic("sensitivity")(sensitivity.get.asInstanceOf[js.Any])
    if (zeroV != null) __obj.updateDynamic("zeroV")(zeroV.asInstanceOf[js.Any])
    __obj.asInstanceOf[AccelerometerAnalogOption]
  }
}

