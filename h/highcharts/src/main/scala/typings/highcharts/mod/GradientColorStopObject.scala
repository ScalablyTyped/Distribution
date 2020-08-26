package typings.highcharts.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GradientColorStopObject extends js.Object {
  var `0`: Double = js.native
  var `1`: ColorString = js.native
}

object GradientColorStopObject {
  @scala.inline
  def apply(`0`: Double, `1`: ColorString): GradientColorStopObject = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("0")(`0`.asInstanceOf[js.Any])
    __obj.updateDynamic("1")(`1`.asInstanceOf[js.Any])
    __obj.asInstanceOf[GradientColorStopObject]
  }
  @scala.inline
  implicit class GradientColorStopObjectOps[Self <: GradientColorStopObject] (val x: Self) extends AnyVal {
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
    def set0(value: Double): Self = this.set("0", value.asInstanceOf[js.Any])
    @scala.inline
    def set1(value: ColorString): Self = this.set("1", value.asInstanceOf[js.Any])
  }
  
}

