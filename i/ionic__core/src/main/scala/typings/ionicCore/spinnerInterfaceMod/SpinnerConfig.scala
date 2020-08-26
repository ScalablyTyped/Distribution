package typings.ionicCore.spinnerInterfaceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SpinnerConfig extends js.Object {
  var circles: js.UndefOr[Double] = js.native
  var dur: Double = js.native
  var elmDuration: js.UndefOr[Boolean] = js.native
  var lines: js.UndefOr[Double] = js.native
  def fn(dur: Double, index: Double, total: Double): SpinnerData = js.native
}

object SpinnerConfig {
  @scala.inline
  def apply(dur: Double, fn: (Double, Double, Double) => SpinnerData): SpinnerConfig = {
    val __obj = js.Dynamic.literal(dur = dur.asInstanceOf[js.Any], fn = js.Any.fromFunction3(fn))
    __obj.asInstanceOf[SpinnerConfig]
  }
  @scala.inline
  implicit class SpinnerConfigOps[Self <: SpinnerConfig] (val x: Self) extends AnyVal {
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
    def setDur(value: Double): Self = this.set("dur", value.asInstanceOf[js.Any])
    @scala.inline
    def setFn(value: (Double, Double, Double) => SpinnerData): Self = this.set("fn", js.Any.fromFunction3(value))
    @scala.inline
    def setCircles(value: Double): Self = this.set("circles", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCircles: Self = this.set("circles", js.undefined)
    @scala.inline
    def setElmDuration(value: Boolean): Self = this.set("elmDuration", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteElmDuration: Self = this.set("elmDuration", js.undefined)
    @scala.inline
    def setLines(value: Double): Self = this.set("lines", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLines: Self = this.set("lines", js.undefined)
  }
  
}

