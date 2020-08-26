package typings.johnnyFive.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PinState extends js.Object {
  var analogChannel: Double = js.native
  var mode: Double = js.native
  var report: Double = js.native
  var supportedModes: js.Array[Double] = js.native
  var value: Double = js.native
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
  @scala.inline
  implicit class PinStateOps[Self <: PinState] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setAnalogChannel(value: Double): Self = this.set("analogChannel", value.asInstanceOf[js.Any])
    @scala.inline
    def setMode(value: Double): Self = this.set("mode", value.asInstanceOf[js.Any])
    @scala.inline
    def setReport(value: Double): Self = this.set("report", value.asInstanceOf[js.Any])
    @scala.inline
    def setSupportedModesVarargs(value: Double*): Self = this.set("supportedModes", js.Array(value :_*))
    @scala.inline
    def setSupportedModes(value: js.Array[Double]): Self = this.set("supportedModes", value.asInstanceOf[js.Any])
    @scala.inline
    def setValue(value: Double): Self = this.set("value", value.asInstanceOf[js.Any])
  }
  
}

