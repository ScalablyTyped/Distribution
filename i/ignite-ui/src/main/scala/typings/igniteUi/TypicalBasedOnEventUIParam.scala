package typings.igniteUi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TypicalBasedOnEventUIParam extends js.Object {
  /**
    * Used to specify which columns changing will invalidate the series and cause it to be recalculated.
    */
  var basedOn: js.UndefOr[js.Any] = js.native
  /**
    * Used to get reference to chart object.
    */
  var chart: js.UndefOr[js.Any] = js.native
  /**
    * Used to get the number of positions that should be calculated from the start.
    */
  var count: js.UndefOr[js.Any] = js.native
  /**
    * Used to get the data to use for the calculation.
    */
  var dataSource: js.UndefOr[js.Any] = js.native
  /**
    * Used to get the beginning position that should be calculated from.
    */
  var position: js.UndefOr[js.Any] = js.native
  /**
    * Used to get reference to current series object.
    */
  var series: js.UndefOr[js.Any] = js.native
  /**
    * Used to get the supporting calculations to use in the calculation.
    */
  var supportingCalculations: js.UndefOr[js.Any] = js.native
}

object TypicalBasedOnEventUIParam {
  @scala.inline
  def apply(): TypicalBasedOnEventUIParam = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TypicalBasedOnEventUIParam]
  }
  @scala.inline
  implicit class TypicalBasedOnEventUIParamOps[Self <: TypicalBasedOnEventUIParam] (val x: Self) extends AnyVal {
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
    def setBasedOn(value: js.Any): Self = this.set("basedOn", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBasedOn: Self = this.set("basedOn", js.undefined)
    @scala.inline
    def setChart(value: js.Any): Self = this.set("chart", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteChart: Self = this.set("chart", js.undefined)
    @scala.inline
    def setCount(value: js.Any): Self = this.set("count", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCount: Self = this.set("count", js.undefined)
    @scala.inline
    def setDataSource(value: js.Any): Self = this.set("dataSource", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDataSource: Self = this.set("dataSource", js.undefined)
    @scala.inline
    def setPosition(value: js.Any): Self = this.set("position", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePosition: Self = this.set("position", js.undefined)
    @scala.inline
    def setSeries(value: js.Any): Self = this.set("series", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSeries: Self = this.set("series", js.undefined)
    @scala.inline
    def setSupportingCalculations(value: js.Any): Self = this.set("supportingCalculations", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSupportingCalculations: Self = this.set("supportingCalculations", js.undefined)
  }
  
}

