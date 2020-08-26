package typings.highcharts.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GanttPointOptionsObject extends js.Object {
  /**
    * (Gantt) Accessibility options for a data point.
    */
  var accessibility: js.UndefOr[PointAccessibilityOptionsObject] = js.native
  /**
    * (Gantt) Whether the grid node belonging to this point should start as
    * collapsed. Used in axes of type treegrid.
    */
  var collapsed: js.UndefOr[Boolean] = js.native
  /**
    * (Gantt) Progress indicator, how much of the task completed. If it is a
    * number, the `fill` will be applied automatically.
    */
  var completed: js.UndefOr[Double | XrangePointPartialFillOptionsObject] = js.native
  /**
    * (Gantt) A reserved subspace to store options and values for customized
    * functionality. Here you can add additional data for your own event
    * callbacks and formatter callbacks.
    */
  var custom: js.UndefOr[Dictionary[_]] = js.native
  /**
    * (Gantt) The ID of the point (task) that this point depends on in Gantt
    * charts. Aliases connect. Can also be an object, specifying further
    * connecting options between the points. Multiple connections can be
    * specified by providing an array.
    */
  var dependency: js.UndefOr[
    String | XrangePointConnectorsOptionsObject | (js.Array[String | XrangePointConnectorsOptionsObject])
  ] = js.native
  /**
    * (Gantt) A description of the point to add to the screen reader
    * information about the point.
    */
  var description: js.UndefOr[String] = js.native
  /**
    * (Gantt) Point specific options for the draggable-points module. Overrides
    * options on `series.dragDrop`.
    */
  var dragDrop: js.UndefOr[SeriesLineDataDragDropOptions] = js.native
  /**
    * (Highcharts) The `id` of a series in the drilldown.series array to use
    * for a drilldown for this point.
    */
  var drilldown: js.UndefOr[String] = js.native
  /**
    * (Gantt) The end time of a task.
    */
  var end: js.UndefOr[Double] = js.native
  /**
    * (Highcharts, Highstock, Gantt) An id for the point. This can be used
    * after render time to get a pointer to the point object through
    * `chart.get()`.
    */
  var id: js.UndefOr[String] = js.native
  /**
    * (Gantt) The rank for this point's data label in case of collision. If two
    * data labels are about to overlap, only the one with the highest
    * `labelrank` will be drawn.
    */
  var labelrank: js.UndefOr[Double] = js.native
  /**
    * (Highcharts, Highstock) Options for the point markers of line-like
    * series.
    */
  var marker: js.UndefOr[PointMarkerOptionsObject] = js.native
  /**
    * (Gantt) Whether this point is a milestone. If so, only the `start` option
    * is handled, while `end` is ignored.
    */
  var milestone: js.UndefOr[Boolean] = js.native
  /**
    * (Gantt) The name of a task. If a `treegrid` y-axis is used (default in
    * Gantt charts), this will be picked up automatically, and used to
    * calculate the y-value.
    */
  var name: js.UndefOr[String] = js.native
  /**
    * (Gantt) The ID of the parent point (task) of this point in Gantt charts.
    */
  var parent: js.UndefOr[String] = js.native
  /**
    * (Gantt) The start time of a task.
    */
  var start: js.UndefOr[Double] = js.native
  /**
    * (Gantt) The Y value of a task.
    */
  var y: js.UndefOr[Double] = js.native
}

object GanttPointOptionsObject {
  @scala.inline
  def apply(): GanttPointOptionsObject = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GanttPointOptionsObject]
  }
  @scala.inline
  implicit class GanttPointOptionsObjectOps[Self <: GanttPointOptionsObject] (val x: Self) extends AnyVal {
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
    def setCollapsed(value: Boolean): Self = this.set("collapsed", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCollapsed: Self = this.set("collapsed", js.undefined)
    @scala.inline
    def setCompleted(value: Double | XrangePointPartialFillOptionsObject): Self = this.set("completed", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCompleted: Self = this.set("completed", js.undefined)
    @scala.inline
    def setCustom(value: Dictionary[_]): Self = this.set("custom", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCustom: Self = this.set("custom", js.undefined)
    @scala.inline
    def setDependencyVarargs(value: (String | XrangePointConnectorsOptionsObject)*): Self = this.set("dependency", js.Array(value :_*))
    @scala.inline
    def setDependency(
      value: String | XrangePointConnectorsOptionsObject | (js.Array[String | XrangePointConnectorsOptionsObject])
    ): Self = this.set("dependency", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDependency: Self = this.set("dependency", js.undefined)
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
    def setEnd(value: Double): Self = this.set("end", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEnd: Self = this.set("end", js.undefined)
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
    def setMilestone(value: Boolean): Self = this.set("milestone", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMilestone: Self = this.set("milestone", js.undefined)
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    @scala.inline
    def setParent(value: String): Self = this.set("parent", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteParent: Self = this.set("parent", js.undefined)
    @scala.inline
    def setStart(value: Double): Self = this.set("start", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStart: Self = this.set("start", js.undefined)
    @scala.inline
    def setY(value: Double): Self = this.set("y", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteY: Self = this.set("y", js.undefined)
  }
  
}

