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
    val __obj = js.Dynamic.literal(analogChannel = analogChannel.asInstanceOf[js.Any], mode = mode.asInstanceOf[js.Any], report = report.asInstanceOf[js.Any], supportedModes = supportedModes.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[PinState]
  }
}

