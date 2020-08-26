package typings.johnnyFive.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LCDParallelOption extends LCDGeneralOption {
  var backlight: js.UndefOr[Double] = js.native
  var pins: js.Array[_] = js.native
}

object LCDParallelOption {
  @scala.inline
  def apply(pins: js.Array[_]): LCDParallelOption = {
    val __obj = js.Dynamic.literal(pins = pins.asInstanceOf[js.Any])
    __obj.asInstanceOf[LCDParallelOption]
  }
  @scala.inline
  implicit class LCDParallelOptionOps[Self <: LCDParallelOption] (val x: Self) extends AnyVal {
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
    def setPinsVarargs(value: js.Any*): Self = this.set("pins", js.Array(value :_*))
    @scala.inline
    def setPins(value: js.Array[_]): Self = this.set("pins", value.asInstanceOf[js.Any])
    @scala.inline
    def setBacklight(value: Double): Self = this.set("backlight", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBacklight: Self = this.set("backlight", js.undefined)
  }
  
}

