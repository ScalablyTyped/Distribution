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

