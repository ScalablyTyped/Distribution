package typings.highcharts.highchartsMod

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
    minHeight: Int | Double = null,
    minWidth: Int | Double = null,
    opacity: Int | Double = null,
    scrollPositionX: Int | Double = null,
    scrollPositionY: Int | Double = null
  ): ChartScrollablePlotAreaOptions = {
    val __obj = js.Dynamic.literal()
    if (minHeight != null) __obj.updateDynamic("minHeight")(minHeight.asInstanceOf[js.Any])
    if (minWidth != null) __obj.updateDynamic("minWidth")(minWidth.asInstanceOf[js.Any])
    if (opacity != null) __obj.updateDynamic("opacity")(opacity.asInstanceOf[js.Any])
    if (scrollPositionX != null) __obj.updateDynamic("scrollPositionX")(scrollPositionX.asInstanceOf[js.Any])
    if (scrollPositionY != null) __obj.updateDynamic("scrollPositionY")(scrollPositionY.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChartScrollablePlotAreaOptions]
  }
}

