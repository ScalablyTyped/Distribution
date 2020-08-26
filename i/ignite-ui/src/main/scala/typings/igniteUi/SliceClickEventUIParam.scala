package typings.igniteUi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SliceClickEventUIParam extends js.Object {
  /**
    * Used to get reference to chart object.
    */
  var chart: js.UndefOr[js.Any] = js.native
  /**
    * Used to get reference to slice object.
    */
  var slice: js.UndefOr[js.Any] = js.native
}

object SliceClickEventUIParam {
  @scala.inline
  def apply(): SliceClickEventUIParam = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SliceClickEventUIParam]
  }
  @scala.inline
  implicit class SliceClickEventUIParamOps[Self <: SliceClickEventUIParam] (val x: Self) extends AnyVal {
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
    def setChart(value: js.Any): Self = this.set("chart", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteChart: Self = this.set("chart", js.undefined)
    @scala.inline
    def setSlice(value: js.Any): Self = this.set("slice", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSlice: Self = this.set("slice", js.undefined)
  }
  
}

