package typings.igniteUi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AxisRangeChangedEventUIParam extends js.Object {
  /**
    * Used to get reference to current chart axis object.
    */
  var axis: js.UndefOr[js.Any] = js.native
  /**
    * Used to get reference to chart object.
    */
  var chart: js.UndefOr[js.Any] = js.native
  /**
    * Used to get new maximum value.
    */
  var newMaximumValue: js.UndefOr[js.Any] = js.native
  /**
    * Used to get new minimum value.
    */
  var newMinimumValue: js.UndefOr[js.Any] = js.native
  /**
    * Used to get old maximum value.
    */
  var oldMaximumValue: js.UndefOr[js.Any] = js.native
  /**
    * Used to get old minimum value.
    */
  var oldMinimumValue: js.UndefOr[js.Any] = js.native
}

object AxisRangeChangedEventUIParam {
  @scala.inline
  def apply(): AxisRangeChangedEventUIParam = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AxisRangeChangedEventUIParam]
  }
  @scala.inline
  implicit class AxisRangeChangedEventUIParamOps[Self <: AxisRangeChangedEventUIParam] (val x: Self) extends AnyVal {
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
    def setAxis(value: js.Any): Self = this.set("axis", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAxis: Self = this.set("axis", js.undefined)
    @scala.inline
    def setChart(value: js.Any): Self = this.set("chart", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteChart: Self = this.set("chart", js.undefined)
    @scala.inline
    def setNewMaximumValue(value: js.Any): Self = this.set("newMaximumValue", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNewMaximumValue: Self = this.set("newMaximumValue", js.undefined)
    @scala.inline
    def setNewMinimumValue(value: js.Any): Self = this.set("newMinimumValue", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNewMinimumValue: Self = this.set("newMinimumValue", js.undefined)
    @scala.inline
    def setOldMaximumValue(value: js.Any): Self = this.set("oldMaximumValue", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOldMaximumValue: Self = this.set("oldMaximumValue", js.undefined)
    @scala.inline
    def setOldMinimumValue(value: js.Any): Self = this.set("oldMinimumValue", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOldMinimumValue: Self = this.set("oldMinimumValue", js.undefined)
  }
  
}

