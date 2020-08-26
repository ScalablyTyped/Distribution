package typings.highcharts.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ChartScrollablePlotAreaOptions extends js.Object {
  /**
    * (Highcharts, Gantt) The minimum height for the plot area. If it gets
    * smaller than this, the plot area will become scrollable.
    */
  var minHeight: js.UndefOr[Double] = js.native
  /**
    * (Highcharts, Gantt) The minimum width for the plot area. If it gets
    * smaller than this, the plot area will become scrollable.
    */
  var minWidth: js.UndefOr[Double] = js.native
  /**
    * (Highcharts, Gantt) The opacity of mask applied on one of the sides of
    * the plot area.
    */
  var opacity: js.UndefOr[Double] = js.native
  /**
    * (Highcharts, Gantt) The initial scrolling position of the scrollable plot
    * area. Ranges from 0 to 1, where 0 aligns the plot area to the left and 1
    * aligns it to the right. Typically we would use 1 if the chart has right
    * aligned Y axes.
    */
  var scrollPositionX: js.UndefOr[Double] = js.native
  /**
    * (Highcharts, Gantt) The initial scrolling position of the scrollable plot
    * area. Ranges from 0 to 1, where 0 aligns the plot area to the top and 1
    * aligns it to the bottom.
    */
  var scrollPositionY: js.UndefOr[Double] = js.native
}

object ChartScrollablePlotAreaOptions {
  @scala.inline
  def apply(): ChartScrollablePlotAreaOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ChartScrollablePlotAreaOptions]
  }
  @scala.inline
  implicit class ChartScrollablePlotAreaOptionsOps[Self <: ChartScrollablePlotAreaOptions] (val x: Self) extends AnyVal {
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
    def setMinHeight(value: Double): Self = this.set("minHeight", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMinHeight: Self = this.set("minHeight", js.undefined)
    @scala.inline
    def setMinWidth(value: Double): Self = this.set("minWidth", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMinWidth: Self = this.set("minWidth", js.undefined)
    @scala.inline
    def setOpacity(value: Double): Self = this.set("opacity", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOpacity: Self = this.set("opacity", js.undefined)
    @scala.inline
    def setScrollPositionX(value: Double): Self = this.set("scrollPositionX", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteScrollPositionX: Self = this.set("scrollPositionX", js.undefined)
    @scala.inline
    def setScrollPositionY(value: Double): Self = this.set("scrollPositionY", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteScrollPositionY: Self = this.set("scrollPositionY", js.undefined)
  }
  
}

