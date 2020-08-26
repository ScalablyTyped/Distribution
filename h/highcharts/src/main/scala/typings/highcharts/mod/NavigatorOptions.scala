package typings.highcharts.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NavigatorOptions extends js.Object {
  /**
    * (Highstock, Gantt) Whether the navigator and scrollbar should adapt to
    * updated data in the base X axis. When loading data async, as in the demo
    * below, this should be `false`. Otherwise new data will trigger navigator
    * redraw, which will cause unwanted looping. In the demo below, the data in
    * the navigator is set only once. On navigating, only the main chart
    * content is updated.
    */
  var adaptToUpdatedData: js.UndefOr[Boolean] = js.native
  /**
    * (Highstock, Gantt) Enable or disable the navigator.
    */
  var enabled: js.UndefOr[Boolean] = js.native
  /**
    * (Highstock, Gantt) Options for the handles for dragging the zoomed area.
    */
  var handles: js.UndefOr[NavigatorHandlesOptions] = js.native
  /**
    * (Highstock, Gantt) The height of the navigator.
    */
  var height: js.UndefOr[Double] = js.native
  /**
    * (Highstock, Gantt) The distance from the nearest element, the X axis or X
    * axis labels.
    */
  var margin: js.UndefOr[Double] = js.native
  /**
    * (Highstock, Gantt) The color of the mask covering the areas of the
    * navigator series that are currently not visible in the main series. The
    * default color is bluish with an opacity of 0.3 to see the series below.
    */
  var maskFill: js.UndefOr[ColorString | GradientColorObject | PatternObject] = js.native
  /**
    * (Highstock, Gantt) Whether the mask should be inside the range marking
    * the zoomed range, or outside. In Highstock 1.x it was always `false`.
    */
  var maskInside: js.UndefOr[Boolean] = js.native
  /**
    * (Highstock, Gantt) When the chart is inverted, whether to draw the
    * navigator on the opposite side.
    */
  var opposite: js.UndefOr[Boolean] = js.native
  /**
    * (Highstock, Gantt) The color of the line marking the currently zoomed
    * area in the navigator.
    */
  var outlineColor: js.UndefOr[ColorString | GradientColorObject | PatternObject] = js.native
  /**
    * (Highstock, Gantt) The width of the line marking the currently zoomed
    * area in the navigator.
    */
  var outlineWidth: js.UndefOr[Double] = js.native
  /**
    * (Highstock, Gantt) Options for the navigator series. Available options
    * are the same as any series, documented at plotOptions and series.
    *
    * Unless data is explicitly defined on navigator.series, the data is
    * borrowed from the first series in the chart.
    *
    * Default series options for the navigator series are: (see online
    * documentation for example)
    */
  var series: js.UndefOr[
    NavigatorSeriesOptions | SeriesOptionsType | (js.Array[NavigatorSeriesOptions | SeriesOptionsType])
  ] = js.native
  /**
    * (Highstock, Gantt) Options for the navigator X axis. Default series
    * options for the navigator xAxis are: (see online documentation for
    * example)
    */
  var xAxis: js.UndefOr[NavigatorXAxisOptions | js.Array[NavigatorXAxisOptions]] = js.native
  /**
    * (Highstock, Gantt) Options for the navigator Y axis. Default series
    * options for the navigator yAxis are: (see online documentation for
    * example)
    */
  var yAxis: js.UndefOr[NavigatorYAxisOptions | js.Array[NavigatorYAxisOptions]] = js.native
}

object NavigatorOptions {
  @scala.inline
  def apply(): NavigatorOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NavigatorOptions]
  }
  @scala.inline
  implicit class NavigatorOptionsOps[Self <: NavigatorOptions] (val x: Self) extends AnyVal {
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
    def setAdaptToUpdatedData(value: Boolean): Self = this.set("adaptToUpdatedData", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAdaptToUpdatedData: Self = this.set("adaptToUpdatedData", js.undefined)
    @scala.inline
    def setEnabled(value: Boolean): Self = this.set("enabled", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEnabled: Self = this.set("enabled", js.undefined)
    @scala.inline
    def setHandles(value: NavigatorHandlesOptions): Self = this.set("handles", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHandles: Self = this.set("handles", js.undefined)
    @scala.inline
    def setHeight(value: Double): Self = this.set("height", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHeight: Self = this.set("height", js.undefined)
    @scala.inline
    def setMargin(value: Double): Self = this.set("margin", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMargin: Self = this.set("margin", js.undefined)
    @scala.inline
    def setMaskFill(value: ColorString | GradientColorObject | PatternObject): Self = this.set("maskFill", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaskFill: Self = this.set("maskFill", js.undefined)
    @scala.inline
    def setMaskInside(value: Boolean): Self = this.set("maskInside", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaskInside: Self = this.set("maskInside", js.undefined)
    @scala.inline
    def setOpposite(value: Boolean): Self = this.set("opposite", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOpposite: Self = this.set("opposite", js.undefined)
    @scala.inline
    def setOutlineColor(value: ColorString | GradientColorObject | PatternObject): Self = this.set("outlineColor", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOutlineColor: Self = this.set("outlineColor", js.undefined)
    @scala.inline
    def setOutlineWidth(value: Double): Self = this.set("outlineWidth", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOutlineWidth: Self = this.set("outlineWidth", js.undefined)
    @scala.inline
    def setSeriesVarargs(value: (NavigatorSeriesOptions | SeriesOptionsType)*): Self = this.set("series", js.Array(value :_*))
    @scala.inline
    def setSeries(
      value: NavigatorSeriesOptions | SeriesOptionsType | (js.Array[NavigatorSeriesOptions | SeriesOptionsType])
    ): Self = this.set("series", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSeries: Self = this.set("series", js.undefined)
    @scala.inline
    def setXAxisVarargs(value: NavigatorXAxisOptions*): Self = this.set("xAxis", js.Array(value :_*))
    @scala.inline
    def setXAxis(value: NavigatorXAxisOptions | js.Array[NavigatorXAxisOptions]): Self = this.set("xAxis", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteXAxis: Self = this.set("xAxis", js.undefined)
    @scala.inline
    def setYAxisVarargs(value: NavigatorYAxisOptions*): Self = this.set("yAxis", js.Array(value :_*))
    @scala.inline
    def setYAxis(value: NavigatorYAxisOptions | js.Array[NavigatorYAxisOptions]): Self = this.set("yAxis", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteYAxis: Self = this.set("yAxis", js.undefined)
  }
  
}

