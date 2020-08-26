package typings.highcharts.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SeriesLineDataDragDropOptions extends js.Object {
  /**
    * (Highcharts, Highstock, Gantt) Options for the drag handles.
    */
  var dragHandle: js.UndefOr[DragDropHandleOptionsObject] = js.native
  /**
    * (Highcharts, Highstock, Gantt) Set the maximum X value the points can be
    * moved to.
    */
  var dragMaxX: js.UndefOr[Double] = js.native
  /**
    * (Highcharts, Highstock, Gantt) Set the maximum Y value the points can be
    * moved to.
    */
  var dragMaxY: js.UndefOr[Double] = js.native
  /**
    * (Highcharts, Highstock, Gantt) Set the minimum X value the points can be
    * moved to.
    */
  var dragMinX: js.UndefOr[Double] = js.native
  /**
    * (Highcharts, Highstock, Gantt) Set the minimum Y value the points can be
    * moved to.
    */
  var dragMinY: js.UndefOr[Double] = js.native
  /**
    * (Highcharts, Highstock, Gantt) The X precision value to drag to for this
    * series. Set to 0 to disable. By default this is disabled, except for
    * category axes, where the default is 1.
    */
  var dragPrecisionX: js.UndefOr[Double] = js.native
  /**
    * (Highcharts, Highstock, Gantt) The Y precision value to drag to for this
    * series. Set to 0 to disable. By default this is disabled, except for
    * category axes, where the default is 1.
    */
  var dragPrecisionY: js.UndefOr[Double] = js.native
  /**
    * (Highcharts, Highstock, Gantt) The amount of pixels to drag the pointer
    * before it counts as a drag operation. This prevents drag/drop to fire
    * when just clicking or selecting points.
    */
  var dragSensitivity: js.UndefOr[Double] = js.native
  /**
    * (Highcharts, Highstock, Gantt) Enable dragging in the X dimension.
    */
  var draggableX: js.UndefOr[Boolean] = js.native
  /**
    * (Highcharts, Highstock, Gantt) Enable dragging in the Y dimension. Note
    * that this is not supported for TreeGrid axes (the default axis type in
    * Gantt charts).
    */
  var draggableY: js.UndefOr[Boolean] = js.native
  /**
    * (Highcharts, Highstock, Gantt) Group the points by a property. Points
    * with the same property value will be grouped together when moving.
    */
  var groupBy: js.UndefOr[String] = js.native
  /**
    * (Highcharts, Highstock, Gantt) Style options for the guide box. The guide
    * box has one state by default, the `default` state.
    */
  var guideBox: js.UndefOr[
    /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 51 */ js.Any
  ] = js.native
  /**
    * (Highcharts, Highstock, Gantt) Update points as they are dragged. If
    * false, a guide box is drawn to illustrate the new point size.
    */
  var liveRedraw: js.UndefOr[Boolean] = js.native
}

object SeriesLineDataDragDropOptions {
  @scala.inline
  def apply(): SeriesLineDataDragDropOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SeriesLineDataDragDropOptions]
  }
  @scala.inline
  implicit class SeriesLineDataDragDropOptionsOps[Self <: SeriesLineDataDragDropOptions] (val x: Self) extends AnyVal {
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
    def setDragHandle(value: DragDropHandleOptionsObject): Self = this.set("dragHandle", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDragHandle: Self = this.set("dragHandle", js.undefined)
    @scala.inline
    def setDragMaxX(value: Double): Self = this.set("dragMaxX", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDragMaxX: Self = this.set("dragMaxX", js.undefined)
    @scala.inline
    def setDragMaxY(value: Double): Self = this.set("dragMaxY", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDragMaxY: Self = this.set("dragMaxY", js.undefined)
    @scala.inline
    def setDragMinX(value: Double): Self = this.set("dragMinX", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDragMinX: Self = this.set("dragMinX", js.undefined)
    @scala.inline
    def setDragMinY(value: Double): Self = this.set("dragMinY", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDragMinY: Self = this.set("dragMinY", js.undefined)
    @scala.inline
    def setDragPrecisionX(value: Double): Self = this.set("dragPrecisionX", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDragPrecisionX: Self = this.set("dragPrecisionX", js.undefined)
    @scala.inline
    def setDragPrecisionY(value: Double): Self = this.set("dragPrecisionY", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDragPrecisionY: Self = this.set("dragPrecisionY", js.undefined)
    @scala.inline
    def setDragSensitivity(value: Double): Self = this.set("dragSensitivity", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDragSensitivity: Self = this.set("dragSensitivity", js.undefined)
    @scala.inline
    def setDraggableX(value: Boolean): Self = this.set("draggableX", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDraggableX: Self = this.set("draggableX", js.undefined)
    @scala.inline
    def setDraggableY(value: Boolean): Self = this.set("draggableY", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDraggableY: Self = this.set("draggableY", js.undefined)
    @scala.inline
    def setGroupBy(value: String): Self = this.set("groupBy", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGroupBy: Self = this.set("groupBy", js.undefined)
    @scala.inline
    def setGuideBox(value: /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 51 */ js.Any): Self = this.set("guideBox", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGuideBox: Self = this.set("guideBox", js.undefined)
    @scala.inline
    def setLiveRedraw(value: Boolean): Self = this.set("liveRedraw", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLiveRedraw: Self = this.set("liveRedraw", js.undefined)
  }
  
}

