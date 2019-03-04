package typings
package johnnyDashFiveLib.johnnyDashFiveMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PinState extends js.Object {
  var analogChannel: scala.Double
  var mode: scala.Double
  var report: scala.Double
  var supportedModes: js.Array[scala.Double]
  var value: scala.Double
}

object PinState {
  @scala.inline
  def apply(
    analogChannel: scala.Double,
    mode: scala.Double,
    report: scala.Double,
    supportedModes: js.Array[scala.Double],
    value: scala.Double
  ): PinState = {
    val __obj = js.Dynamic.literal(analogChannel = analogChannel, mode = mode, report = report, supportedModes = supportedModes, value = value)
  
    __obj.asInstanceOf[PinState]
  }
}

