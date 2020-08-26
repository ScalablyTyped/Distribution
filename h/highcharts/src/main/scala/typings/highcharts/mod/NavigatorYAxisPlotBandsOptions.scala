package typings.highcharts.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NavigatorYAxisPlotBandsOptions extends js.Object {
  /**
    * (Highstock) Flag to decide if plotBand should be rendered across all
    * panes.
    */
  var acrossPanes: js.UndefOr[Boolean] = js.native
  /**
    * (Highcharts, Highstock, Gantt) Border color for the plot band. Also
    * requires `borderWidth` to be set.
    */
  var borderColor: js.UndefOr[ColorString] = js.native
  /**
    * (Highcharts, Highstock, Gantt) Border width for the plot band. Also
    * requires `borderColor` to be set.
    */
  var borderWidth: js.UndefOr[Double] = js.native
  /**
    * (Highcharts, Highstock, Gantt) A custom class name, in addition to the
    * default `highcharts-plot-band`, to apply to each individual band.
    */
  var className: js.UndefOr[String] = js.native
  /**
    * (Highcharts, Highstock, Gantt) The color of the plot band.
    */
  var color: js.UndefOr[ColorString | GradientColorObject | PatternObject] = js.native
  /**
    * (Highcharts, Highstock, Gantt) An object defining mouse events for the
    * plot band. Supported properties are `click`, `mouseover`, `mouseout`,
    * `mousemove`.
    */
  var events: js.UndefOr[NavigatorYAxisPlotBandsEventsOptions] = js.native
  /**
    * (Highcharts, Highstock, Gantt) The start position of the plot band in
    * axis units.
    */
  var from: js.UndefOr[Double] = js.native
  /**
    * (Highcharts, Highstock, Gantt) An id used for identifying the plot band
    * in Axis.removePlotBand.
    */
  var id: js.UndefOr[String] = js.native
  /**
    * (Highcharts) In a gauge chart, this option determines the inner radius of
    * the plot band that stretches along the perimeter. It can be given as a
    * percentage string, like `"100%"`, or as a pixel number, like `100`. By
    * default, the inner radius is controlled by the thickness option.
    */
  var innerRadius: js.UndefOr[Double | String] = js.native
  /**
    * (Highcharts, Highstock, Gantt) Text labels for the plot bands
    */
  var label: js.UndefOr[NavigatorYAxisPlotBandsLabelOptions] = js.native
  /**
    * (Highcharts) In a gauge chart, this option determines the outer radius of
    * the plot band that stretches along the perimeter. It can be given as a
    * percentage string, like `"100%"`, or as a pixel number, like `100`.
    */
  var outerRadius: js.UndefOr[Double | String] = js.native
  /**
    * (Highcharts) In a gauge chart, this option sets the width of the plot
    * band stretching along the perimeter. It can be given as a percentage
    * string, like `"10%"`, or as a pixel number, like `10`. The default value
    * 10 is the same as the default tickLength, thus making the plot band act
    * as a background for the tick markers.
    */
  var thickness: js.UndefOr[Double | String] = js.native
  /**
    * (Highcharts, Highstock, Gantt) The end position of the plot band in axis
    * units.
    */
  var to: js.UndefOr[Double] = js.native
  /**
    * (Highcharts, Highstock, Gantt) The z index of the plot band within the
    * chart, relative to other elements. Using the same z index as another
    * element may give unpredictable results, as the last rendered element will
    * be on top. Values from 0 to 20 make sense.
    */
  var zIndex: js.UndefOr[Double] = js.native
}

object NavigatorYAxisPlotBandsOptions {
  @scala.inline
  def apply(): NavigatorYAxisPlotBandsOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NavigatorYAxisPlotBandsOptions]
  }
  @scala.inline
  implicit class NavigatorYAxisPlotBandsOptionsOps[Self <: NavigatorYAxisPlotBandsOptions] (val x: Self) extends AnyVal {
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
    def setAcrossPanes(value: Boolean): Self = this.set("acrossPanes", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAcrossPanes: Self = this.set("acrossPanes", js.undefined)
    @scala.inline
    def setBorderColor(value: ColorString): Self = this.set("borderColor", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBorderColor: Self = this.set("borderColor", js.undefined)
    @scala.inline
    def setBorderWidth(value: Double): Self = this.set("borderWidth", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBorderWidth: Self = this.set("borderWidth", js.undefined)
    @scala.inline
    def setClassName(value: String): Self = this.set("className", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteClassName: Self = this.set("className", js.undefined)
    @scala.inline
    def setColor(value: ColorString | GradientColorObject | PatternObject): Self = this.set("color", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteColor: Self = this.set("color", js.undefined)
    @scala.inline
    def setEvents(value: NavigatorYAxisPlotBandsEventsOptions): Self = this.set("events", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEvents: Self = this.set("events", js.undefined)
    @scala.inline
    def setFrom(value: Double): Self = this.set("from", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFrom: Self = this.set("from", js.undefined)
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteId: Self = this.set("id", js.undefined)
    @scala.inline
    def setInnerRadius(value: Double | String): Self = this.set("innerRadius", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInnerRadius: Self = this.set("innerRadius", js.undefined)
    @scala.inline
    def setLabel(value: NavigatorYAxisPlotBandsLabelOptions): Self = this.set("label", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLabel: Self = this.set("label", js.undefined)
    @scala.inline
    def setOuterRadius(value: Double | String): Self = this.set("outerRadius", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOuterRadius: Self = this.set("outerRadius", js.undefined)
    @scala.inline
    def setThickness(value: Double | String): Self = this.set("thickness", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteThickness: Self = this.set("thickness", js.undefined)
    @scala.inline
    def setTo(value: Double): Self = this.set("to", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTo: Self = this.set("to", js.undefined)
    @scala.inline
    def setZIndex(value: Double): Self = this.set("zIndex", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteZIndex: Self = this.set("zIndex", js.undefined)
  }
  
}

