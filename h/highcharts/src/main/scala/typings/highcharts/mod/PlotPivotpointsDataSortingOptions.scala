package typings.highcharts.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PlotPivotpointsDataSortingOptions extends js.Object {
  /**
    * (Highcharts, Highstock) Enable or disable data sorting for the series.
    * Use xAxis.reversed to change the sorting order.
    */
  var enabled: js.UndefOr[Boolean] = js.native
  /**
    * (Highcharts, Highstock) Whether to allow matching points by name in an
    * update. If this option is disabled, points will be matched by order.
    */
  var matchByName: js.UndefOr[Boolean] = js.native
  /**
    * (Highcharts, Highstock) Determines what data value should be used to sort
    * by.
    */
  var sortKey: js.UndefOr[String] = js.native
}

object PlotPivotpointsDataSortingOptions {
  @scala.inline
  def apply(): PlotPivotpointsDataSortingOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PlotPivotpointsDataSortingOptions]
  }
  @scala.inline
  implicit class PlotPivotpointsDataSortingOptionsOps[Self <: PlotPivotpointsDataSortingOptions] (val x: Self) extends AnyVal {
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
    def setEnabled(value: Boolean): Self = this.set("enabled", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEnabled: Self = this.set("enabled", js.undefined)
    @scala.inline
    def setMatchByName(value: Boolean): Self = this.set("matchByName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMatchByName: Self = this.set("matchByName", js.undefined)
    @scala.inline
    def setSortKey(value: String): Self = this.set("sortKey", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSortKey: Self = this.set("sortKey", js.undefined)
  }
  
}

