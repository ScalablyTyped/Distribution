package typings.highcharts.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ZAxisPlotLinesOptions extends AxisPlotLinesOptions {
  /**
    * (Highstock) Flag to decide if plotLine should be rendered across all
    * panes.
    */
  var acrossPanes: js.UndefOr[Boolean] = js.native
  /**
    * (Highcharts, Highstock, Gantt) A custom class name, in addition to the
    * default `highcharts-plot-line`, to apply to each individual line.
    */
  var className: js.UndefOr[String] = js.native
  /**
    * (Highcharts, Highstock, Gantt) The color of the line.
    */
  var color: js.UndefOr[ColorString] = js.native
  /**
    * (Highcharts, Highstock, Gantt) The dashing or dot style for the plot
    * line. For possible values see this overview.
    */
  var dashStyle: js.UndefOr[DashStyleValue] = js.native
  /**
    * (Highcharts, Highstock, Gantt) An object defining mouse events for the
    * plot line. Supported properties are `click`, `mouseover`, `mouseout`,
    * `mousemove`.
    */
  var events: js.UndefOr[ZAxisPlotLinesEventsOptions] = js.native
  /**
    * (Highcharts, Highstock, Gantt) An id used for identifying the plot line
    * in Axis.removePlotLine.
    */
  var id: js.UndefOr[String] = js.native
  /**
    * (Highcharts, Highstock, Gantt) Text labels for the plot bands
    */
  var label: js.UndefOr[ZAxisPlotLinesLabelOptions] = js.native
  /**
    * (Highcharts, Highstock, Gantt) The position of the line in axis units.
    */
  var value: js.UndefOr[Double] = js.native
  /**
    * (Highcharts, Highstock, Gantt) The width or thickness of the plot line.
    */
  var width: js.UndefOr[Double] = js.native
  /**
    * (Highcharts, Highstock, Gantt) The z index of the plot line within the
    * chart.
    */
  var zIndex: js.UndefOr[Double] = js.native
}

object ZAxisPlotLinesOptions {
  @scala.inline
  def apply(): ZAxisPlotLinesOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ZAxisPlotLinesOptions]
  }
  @scala.inline
  implicit class ZAxisPlotLinesOptionsOps[Self <: ZAxisPlotLinesOptions] (val x: Self) extends AnyVal {
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
    def setClassName(value: String): Self = this.set("className", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteClassName: Self = this.set("className", js.undefined)
    @scala.inline
    def setColor(value: ColorString): Self = this.set("color", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteColor: Self = this.set("color", js.undefined)
    @scala.inline
    def setDashStyle(value: DashStyleValue): Self = this.set("dashStyle", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDashStyle: Self = this.set("dashStyle", js.undefined)
    @scala.inline
    def setEvents(value: ZAxisPlotLinesEventsOptions): Self = this.set("events", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEvents: Self = this.set("events", js.undefined)
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteId: Self = this.set("id", js.undefined)
    @scala.inline
    def setLabel(value: ZAxisPlotLinesLabelOptions): Self = this.set("label", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLabel: Self = this.set("label", js.undefined)
    @scala.inline
    def setValue(value: Double): Self = this.set("value", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteValue: Self = this.set("value", js.undefined)
    @scala.inline
    def setWidth(value: Double): Self = this.set("width", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWidth: Self = this.set("width", js.undefined)
    @scala.inline
    def setZIndex(value: Double): Self = this.set("zIndex", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteZIndex: Self = this.set("zIndex", js.undefined)
  }
  
}

