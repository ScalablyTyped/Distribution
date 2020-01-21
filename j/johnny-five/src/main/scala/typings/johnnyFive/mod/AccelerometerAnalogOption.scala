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
    aref: Int | Double = null,
    autoCalibrate: js.UndefOr[Boolean] = js.undefined,
    controller: String = null,
    sensitivity: Int | Double = null,
    zeroV: Double | js.Array[Double] = null
  ): AccelerometerAnalogOption = {
    val __obj = js.Dynamic.literal(pins = pins.asInstanceOf[js.Any])
    if (aref != null) __obj.updateDynamic("aref")(aref.asInstanceOf[js.Any])
    if (!js.isUndefined(autoCalibrate)) __obj.updateDynamic("autoCalibrate")(autoCalibrate.asInstanceOf[js.Any])
    if (controller != null) __obj.updateDynamic("controller")(controller.asInstanceOf[js.Any])
    if (sensitivity != null) __obj.updateDynamic("sensitivity")(sensitivity.asInstanceOf[js.Any])
    if (zeroV != null) __obj.updateDynamic("zeroV")(zeroV.asInstanceOf[js.Any])
    __obj.asInstanceOf[AccelerometerAnalogOption]
  }
}

