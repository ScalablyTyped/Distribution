package typings.johnnyFive.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ServoSweepOpts extends js.Object {
  var interval: js.UndefOr[Double] = js.native
  var range: js.Array[Double] = js.native
  var step: js.UndefOr[Double] = js.native
}

object ServoSweepOpts {
  @scala.inline
  def apply(range: js.Array[Double]): ServoSweepOpts = {
    val __obj = js.Dynamic.literal(range = range.asInstanceOf[js.Any])
    __obj.asInstanceOf[ServoSweepOpts]
  }
  @scala.inline
  implicit class ServoSweepOptsOps[Self <: ServoSweepOpts] (val x: Self) extends AnyVal {
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
    def setRangeVarargs(value: Double*): Self = this.set("range", js.Array(value :_*))
    @scala.inline
    def setRange(value: js.Array[Double]): Self = this.set("range", value.asInstanceOf[js.Any])
    @scala.inline
    def setInterval(value: Double): Self = this.set("interval", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInterval: Self = this.set("interval", js.undefined)
    @scala.inline
    def setStep(value: Double): Self = this.set("step", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStep: Self = this.set("step", js.undefined)
  }
  
}

