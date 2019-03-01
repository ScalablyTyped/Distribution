package typings
package johnnyDashFiveLib.johnnyDashFiveMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AccelerometerAnalogOption extends AccelerometerGeneralOption {
  var aref: js.UndefOr[scala.Double] = js.undefined
  var autoCalibrate: js.UndefOr[scala.Boolean] = js.undefined
  var pins: js.Array[java.lang.String]
  var sensitivity: js.UndefOr[scala.Double] = js.undefined
  var zeroV: js.UndefOr[scala.Double | js.Array[scala.Double]] = js.undefined
}

object AccelerometerAnalogOption {
  @scala.inline
  def apply(
    pins: js.Array[java.lang.String],
    aref: scala.Int | scala.Double = null,
    autoCalibrate: js.UndefOr[scala.Boolean] = js.undefined,
    controller: java.lang.String = null,
    sensitivity: scala.Int | scala.Double = null,
    zeroV: scala.Double | js.Array[scala.Double] = null
  ): AccelerometerAnalogOption = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("pins")(pins)
    if (aref != null) __obj.updateDynamic("aref")(aref.asInstanceOf[js.Any])
    if (!js.isUndefined(autoCalibrate)) __obj.updateDynamic("autoCalibrate")(autoCalibrate)
    if (controller != null) __obj.updateDynamic("controller")(controller)
    if (sensitivity != null) __obj.updateDynamic("sensitivity")(sensitivity.asInstanceOf[js.Any])
    if (zeroV != null) __obj.updateDynamic("zeroV")(zeroV.asInstanceOf[js.Any])
    __obj.asInstanceOf[AccelerometerAnalogOption]
  }
}

