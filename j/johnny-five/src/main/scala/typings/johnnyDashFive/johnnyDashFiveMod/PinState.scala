package typings.johnnyDashFive.johnnyDashFiveMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PinState extends js.Object {
  var analogChannel: Double
  var mode: Double
  var report: Double
  var supportedModes: js.Array[Double]
  var value: Double
}

object PinState {
  @scala.inline
  def apply(
    analogChannel: Double,
    mode: Double,
    report: Double,
    supportedModes: js.Array[Double],
    value: Double
  ): PinState = {
    val __obj = js.Dynamic.literal(analogChannel = analogChannel, mode = mode, report = report, supportedModes = supportedModes, value = value)
  
    __obj.asInstanceOf[PinState]
  }
}

