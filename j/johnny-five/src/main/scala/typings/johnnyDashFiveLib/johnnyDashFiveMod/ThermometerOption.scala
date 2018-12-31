package typings
package johnnyDashFiveLib.johnnyDashFiveMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ThermometerOption extends js.Object {
  var controller: js.UndefOr[java.lang.String] = js.undefined
  var freq: js.UndefOr[scala.Double] = js.undefined
  var pin: java.lang.String | scala.Double
  var toCelsius: js.UndefOr[js.Function1[/* val */ scala.Double, scala.Double]] = js.undefined
}

