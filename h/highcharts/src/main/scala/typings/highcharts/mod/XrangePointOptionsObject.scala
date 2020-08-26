package typings.highcharts.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait XrangePointOptionsObject extends js.Object {
  /**
    * (Highcharts, Highstock, Gantt) Accessibility options for a data point.
    */
  var accessibility: js.UndefOr[PointAccessibilityOptionsObject] = js.native
  /**
    * (Highcharts, Gantt) An additional, individual class name for the data
    * point's graphic representation.
    */
  var className: js.UndefOr[String] = js.native
  /**
    * (Highcharts, Highstock, Gantt) Individual color for the point. By default
    * the color is pulled from the global `colors` array.
    *
    * In styled mode, the `color` option doesn't take effect. Instead, use
    * `colorIndex`.
    */
  var color: js.UndefOr[ColorString | GradientColorObject | PatternObject] = js.native
  /**
    * (Highcharts, Gantt) A specific color index to use for the point, so its
    * graphic representations are given the class name `highcharts-color-{n}`.
    * In styled mode this will change the color of the graphic. In non-styled
    * mode, the color by is set by the `fill` attribute, so the change in class
    * name won't have a visual effect by default.
    */
  var colorIndex: js.UndefOr[Double] = js.native
  /**
    * (Gantt) Connect to a point. This option can be either a string, referring
    * to the ID of another point, or an object, or an array of either. If the
    * option is an array, each element defines a connection.
    */
  var connect: js.UndefOr[
    String | XrangePointConnectorsOptionsObject | (js.Array[String | XrangePointConnectorsOptionsObject])
  ] = js.native
  /**
    * (Highcharts, Highstock, Gantt) A reserved subspace to store options and
    * values for customized functionality. Here you can add additional data for
    * your own event callbacks and formatter callbacks.
    */
  var custom: js.UndefOr[Dictionary[_]] = js.native
  /**
    * (Highcharts, Highstock, Gantt) Individual data label for each point. The
    * options are the same as the ones for plotOptions.series.dataLabels.
    */
  var dataLabels: js.UndefOr[DataLabelsOptions | js.Array[DataLabelsOptions]] = js.native
  /**
    * (Highcharts, Highstock, Gantt) A description of the point to add to the
    * screen reader information about the point.
    */
  var description: js.UndefOr[String] = js.native
  /**
    * (Highcharts, Highstock, Gantt) Point specific options for the
    * draggable-points module. Overrides options on `series.dragDrop`.
    */
  var dragDrop: js.UndefOr[SeriesLineDataDragDropOptions] = js.native
  /**
    * (Highcharts) The `id` of a series in the drilldown.series array to use
    * for a drilldown for this point.
    */
  var drilldown: js.UndefOr[String] = js.native
  /**
    * (Highcharts, Highstock, Gantt) The individual point events.
    */
  var events: js.UndefOr[PointEventsOptionsObject] = js.native
  /**
    * (Highcharts, Highstock, Gantt) An id for the point. This can be used
    * after render time to get a pointer to the point object through
    * `chart.get()`.
    */
  var id: js.UndefOr[String] = js.native
  /**
    * (Highcharts, Highstock, Gantt) The rank for this point's data label in
    * case of collision. If two data labels are about to overlap, only the one
    * with the highest `labelrank` will be drawn.
    */
  var labelrank: js.UndefOr[Double] = js.native
  /**
    * (Highcharts, Highstock) Options for the point markers of line-like
    * series.
    */
  var marker: js.UndefOr[PointMarkerOptionsObject] = js.native
  /**
    * (Highcharts, Highstock, Gantt) The name of the point as shown in the
    * legend, tooltip, dataLabels, etc.
    */
  var name: js.UndefOr[String] = js.native
  /**
    * (Highcharts, Highstock, Gantt) A partial fill for each point, typically
    * used to visualize how much of a task is performed. The partial fill
    * object can be set either on series or point level.
    */
  var partialFill: js.UndefOr[XrangePointPartialFillOptionsObject] = js.native
  /**
    * (Highcharts, Highstock, Gantt) Whether the data point is selected
    * initially.
    */
  var selected: js.UndefOr[Boolean] = js.native
  /**
    * (Highcharts, Highstock, Gantt) The starting X value of the range point.
    */
  var x: js.UndefOr[Double] = js.native
  /**
    * (Highcharts, Highstock, Gantt) The ending X value of the range point.
    */
  var x2: js.UndefOr[Double] = js.native
  /**
    * (Highcharts, Highstock, Gantt) The Y value of the range point.
    */
  var y: js.UndefOr[Double] = js.native
}

object XrangePointOptionsObject {
  @scala.inline
  def apply(): XrangePointOptionsObject = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[XrangePointOptionsObject]
  }
  @scala.inline
  implicit class XrangePointOptionsObjectOps[Self <: XrangePointOptionsObject] (val x: Self) extends AnyVal {
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
    def setAccessibility(value: PointAccessibilityOptionsObject): Self = this.set("accessibility", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAccessibility: Self = this.set("accessibility", js.undefined)
    @scala.inline
    def setClassName(value: String): Self = this.set("className", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteClassName: Self = this.set("className", js.undefined)
    @scala.inline
    def setColor(value: ColorString | GradientColorObject | PatternObject): Self = this.set("color", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteColor: Self = this.set("color", js.undefined)
    @scala.inline
    def setColorIndex(value: Double): Self = this.set("colorIndex", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteColorIndex: Self = this.set("colorIndex", js.undefined)
    @scala.inline
    def setConnectVarargs(value: (String | XrangePointConnectorsOptionsObject)*): Self = this.set("connect", js.Array(value :_*))
    @scala.inline
    def setConnect(
      value: String | XrangePointConnectorsOptionsObject | (js.Array[String | XrangePointConnectorsOptionsObject])
    ): Self = this.set("connect", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteConnect: Self = this.set("connect", js.undefined)
    @scala.inline
    def setCustom(value: Dictionary[_]): Self = this.set("custom", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCustom: Self = this.set("custom", js.undefined)
    @scala.inline
    def setDataLabelsVarargs(value: DataLabelsOptions*): Self = this.set("dataLabels", js.Array(value :_*))
    @scala.inline
    def setDataLabels(value: DataLabelsOptions | js.Array[DataLabelsOptions]): Self = this.set("dataLabels", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDataLabels: Self = this.set("dataLabels", js.undefined)
    @scala.inline
    def setDescription(value: String): Self = this.set("description", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDescription: Self = this.set("description", js.undefined)
    @scala.inline
    def setDragDrop(value: SeriesLineDataDragDropOptions): Self = this.set("dragDrop", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDragDrop: Self = this.set("dragDrop", js.undefined)
    @scala.inline
    def setDrilldown(value: String): Self = this.set("drilldown", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDrilldown: Self = this.set("drilldown", js.undefined)
    @scala.inline
    def setEvents(value: PointEventsOptionsObject): Self = this.set("events", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEvents: Self = this.set("events", js.undefined)
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteId: Self = this.set("id", js.undefined)
    @scala.inline
    def setLabelrank(value: Double): Self = this.set("labelrank", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLabelrank: Self = this.set("labelrank", js.undefined)
    @scala.inline
    def setMarker(value: PointMarkerOptionsObject): Self = this.set("marker", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMarker: Self = this.set("marker", js.undefined)
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    @scala.inline
    def setPartialFill(value: XrangePointPartialFillOptionsObject): Self = this.set("partialFill", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePartialFill: Self = this.set("partialFill", js.undefined)
    @scala.inline
    def setSelected(value: Boolean): Self = this.set("selected", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSelected: Self = this.set("selected", js.undefined)
    @scala.inline
    def setX(value: Double): Self = this.set("x", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteX: Self = this.set("x", js.undefined)
    @scala.inline
    def setX2(value: Double): Self = this.set("x2", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteX2: Self = this.set("x2", js.undefined)
    @scala.inline
    def setY(value: Double): Self = this.set("y", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteY: Self = this.set("y", js.undefined)
  }
  
}

