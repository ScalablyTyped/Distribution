package typings.highcharts.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ChartScrollablePlotAreaOptions extends js.Object {
  /**
    * (Highcharts, Gantt) The minimum height for the plot area. If it gets
    * smaller than this, the plot area will become scrollable.
    */
  var minHeight: js.UndefOr[Double] = js.undefined
  /**
    * (Highcharts, Gantt) The minimum width for the plot area. If it gets
    * smaller than this, the plot area will become scrollable.
    */
  var minWidth: js.UndefOr[Double] = js.undefined
  /**
    * (Highcharts, Gantt) The opacity of mask applied on one of the sides of
    * the plot area.
    */
  var opacity: js.UndefOr[Double] = js.undefined
  /**
    * (Highcharts, Gantt) The initial scrolling position of the scrollable plot
    * area. Ranges from 0 to 1, where 0 aligns the plot area to the left and 1
    * aligns it to the right. Typically we would use 1 if the chart has right
    * aligned Y axes.
    */
  var scrollPositionX: js.UndefOr[Double] = js.undefined
  /**
    * (Highcharts, Gantt) The initial scrolling position of the scrollable plot
    * area. Ranges from 0 to 1, where 0 aligns the plot area to the top and 1
    * aligns it to the bottom.
    */
  var scrollPositionY: js.UndefOr[Double] = js.undefined
}

object ChartScrollablePlotAreaOptions {
  @scala.inline
  def apply(
    minHeight: js.UndefOr[Double] = js.undefined,
    minWidth: js.UndefOr[Double] = js.undefined,
    opacity: js.UndefOr[Double] = js.undefined,
    scrollPositionX: js.UndefOr[Double] = js.undefined,
    scrollPositionY: js.UndefOr[Double] = js.undefined
  ): ChartScrollablePlotAreaOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(minHeight)) __obj.updateDynamic("minHeight")(minHeight.get.asInstanceOf[js.Any])
    if (!js.isUndefined(minWidth)) __obj.updateDynamic("minWidth")(minWidth.get.asInstanceOf[js.Any])
    if (!js.isUndefined(opacity)) __obj.updateDynamic("opacity")(opacity.get.asInstanceOf[js.Any])
    if (!js.isUndefined(scrollPositionX)) __obj.updateDynamic("scrollPositionX")(scrollPositionX.get.asInstanceOf[js.Any])
    if (!js.isUndefined(scrollPositionY)) __obj.updateDynamic("scrollPositionY")(scrollPositionY.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChartScrollablePlotAreaOptions]
  }
}

