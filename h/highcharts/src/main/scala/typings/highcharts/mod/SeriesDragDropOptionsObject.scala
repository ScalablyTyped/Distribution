package typings.highcharts.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SeriesDragDropOptionsObject extends js.Object {
  /**
    * (Highcharts, Highstock, Gantt) Options for the drag handles.
    */
  var dragHandle: js.UndefOr[DragDropHandleOptionsObject] = js.undefined
  /**
    * (Highcharts, Highstock, Gantt) Set the maximum X value the points can be
    * moved to.
    */
  var dragMaxX: js.UndefOr[Double] = js.undefined
  /**
    * (Highcharts, Highstock, Gantt) Set the maximum Y value the points can be
    * moved to.
    */
  var dragMaxY: js.UndefOr[Double] = js.undefined
  /**
    * (Highcharts, Highstock, Gantt) Set the minimum X value the points can be
    * moved to.
    */
  var dragMinX: js.UndefOr[Double] = js.undefined
  /**
    * (Highcharts, Highstock, Gantt) Set the minimum Y value the points can be
    * moved to.
    */
  var dragMinY: js.UndefOr[Double] = js.undefined
  /**
    * (Highcharts, Highstock, Gantt) The X precision value to drag to for this
    * series. Set to 0 to disable. By default this is disabled, except for
    * category axes, where the default is 1.
    */
  var dragPrecisionX: js.UndefOr[Double] = js.undefined
  /**
    * (Highcharts, Highstock, Gantt) The Y precision value to drag to for this
    * series. Set to 0 to disable. By default this is disabled, except for
    * category axes, where the default is 1.
    */
  var dragPrecisionY: js.UndefOr[Double] = js.undefined
  /**
    * (Highcharts, Highstock, Gantt) The amount of pixels to drag the pointer
    * before it counts as a drag operation. This prevents drag/drop to fire
    * when just clicking or selecting points.
    */
  var dragSensitivity: js.UndefOr[Double] = js.undefined
  /**
    * (Highstock) Allow close value to be dragged individually.
    */
  var draggableClose: js.UndefOr[Boolean] = js.undefined
  /**
    * (Gantt) Allow end value to be dragged individually.
    */
  var draggableEnd: js.UndefOr[Boolean] = js.undefined
  /**
    * (Highstock) Allow high value to be dragged individually.
    */
  var draggableHigh: js.UndefOr[Boolean] = js.undefined
  /**
    * (Highstock) Allow low value to be dragged individually.
    */
  var draggableLow: js.UndefOr[Boolean] = js.undefined
  /**
    * (Highstock) Allow open value to be dragged individually.
    */
  var draggableOpen: js.UndefOr[Boolean] = js.undefined
  /**
    * (Highcharts, Highstock) Allow Q1 value to be dragged individually.
    */
  var draggableQ1: js.UndefOr[Boolean] = js.undefined
  /**
    * (Highcharts, Highstock) Allow Q3 value to be dragged individually.
    */
  var draggableQ3: js.UndefOr[Boolean] = js.undefined
  /**
    * (Gantt) Allow start value to be dragged individually.
    */
  var draggableStart: js.UndefOr[Boolean] = js.undefined
  /**
    * (Highcharts) Allow target value to be dragged individually.
    */
  var draggableTarget: js.UndefOr[Boolean] = js.undefined
  /**
    * (Highcharts, Highstock, Gantt) Enable dragging in the X dimension.
    */
  var draggableX: js.UndefOr[Boolean] = js.undefined
  /**
    * (Highcharts, Highstock, Gantt) Allow x value to be dragged individually.
    */
  var draggableX1: js.UndefOr[Boolean] = js.undefined
  /**
    * (Highcharts, Highstock, Gantt) Allow x2 value to be dragged individually.
    */
  var draggableX2: js.UndefOr[Boolean] = js.undefined
  /**
    * (Highcharts, Highstock, Gantt) Enable dragging in the Y dimension. Note
    * that this is not supported for TreeGrid axes (the default axis type in
    * Gantt charts).
    */
  var draggableY: js.UndefOr[Boolean] = js.undefined
  /**
    * (Highcharts, Highstock, Gantt) Group the points by a property. Points
    * with the same property value will be grouped together when moving.
    */
  var groupBy: js.UndefOr[String] = js.undefined
  /**
    * (Highcharts, Highstock, Gantt) Style options for the guide box. The guide
    * box has one state by default, the `default` state.
    */
  var guideBox: js.UndefOr[
    PlotAreaDragDropGuideBoxOptions | PlotArearangeDragDropGuideBoxOptions | PlotAreasplineDragDropGuideBoxOptions | PlotAreasplinerangeDragDropGuideBoxOptions | PlotBarDragDropGuideBoxOptions | PlotBoxplotDragDropGuideBoxOptions | PlotBubbleDragDropGuideBoxOptions | PlotBulletDragDropGuideBoxOptions | PlotCandlestickDragDropGuideBoxOptions | PlotColumnDragDropGuideBoxOptions | PlotColumnpyramidDragDropGuideBoxOptions | PlotColumnrangeDragDropGuideBoxOptions | PlotDumbbellDragDropGuideBoxOptions | PlotErrorbarDragDropGuideBoxOptions | PlotFlagsDragDropGuideBoxOptions | PlotFunnel3dDragDropGuideBoxOptions | PlotGanttDragDropGuideBoxOptions | PlotHeatmapDragDropGuideBoxOptions | PlotLineDragDropGuideBoxOptions | PlotLollipopDragDropGuideBoxOptions | PlotMapbubbleDragDropGuideBoxOptions | PlotMapDragDropGuideBoxOptions | PlotMaplineDragDropGuideBoxOptions | PlotMappointDragDropGuideBoxOptions | PlotOhlcDragDropGuideBoxOptions | PlotPolygonDragDropGuideBoxOptions | PlotPyramid3dDragDropGuideBoxOptions | PlotScatterDragDropGuideBoxOptions | PlotSeriesDragDropGuideBoxOptions | PlotSplineDragDropGuideBoxOptions | PlotStreamgraphDragDropGuideBoxOptions | PlotTilemapDragDropGuideBoxOptions | PlotTimelineDragDropGuideBoxOptions | PlotVariwideDragDropGuideBoxOptions | PlotWaterfallDragDropGuideBoxOptions | PlotXrangeDragDropGuideBoxOptions | Dictionary[DragDropGuideBoxOptionsObject]
  ] = js.undefined
  /**
    * (Highcharts, Highstock, Gantt) Update points as they are dragged. If
    * false, a guide box is drawn to illustrate the new point size.
    */
  var liveRedraw: js.UndefOr[Boolean] = js.undefined
}

object SeriesDragDropOptionsObject {
  @scala.inline
  def apply(
    dragHandle: DragDropHandleOptionsObject = null,
    dragMaxX: Int | Double = null,
    dragMaxY: Int | Double = null,
    dragMinX: Int | Double = null,
    dragMinY: Int | Double = null,
    dragPrecisionX: Int | Double = null,
    dragPrecisionY: Int | Double = null,
    dragSensitivity: Int | Double = null,
    draggableClose: js.UndefOr[Boolean] = js.undefined,
    draggableEnd: js.UndefOr[Boolean] = js.undefined,
    draggableHigh: js.UndefOr[Boolean] = js.undefined,
    draggableLow: js.UndefOr[Boolean] = js.undefined,
    draggableOpen: js.UndefOr[Boolean] = js.undefined,
    draggableQ1: js.UndefOr[Boolean] = js.undefined,
    draggableQ3: js.UndefOr[Boolean] = js.undefined,
    draggableStart: js.UndefOr[Boolean] = js.undefined,
    draggableTarget: js.UndefOr[Boolean] = js.undefined,
    draggableX: js.UndefOr[Boolean] = js.undefined,
    draggableX1: js.UndefOr[Boolean] = js.undefined,
    draggableX2: js.UndefOr[Boolean] = js.undefined,
    draggableY: js.UndefOr[Boolean] = js.undefined,
    groupBy: String = null,
    guideBox: PlotAreaDragDropGuideBoxOptions | PlotArearangeDragDropGuideBoxOptions | PlotAreasplineDragDropGuideBoxOptions | PlotAreasplinerangeDragDropGuideBoxOptions | PlotBarDragDropGuideBoxOptions | PlotBoxplotDragDropGuideBoxOptions | PlotBubbleDragDropGuideBoxOptions | PlotBulletDragDropGuideBoxOptions | PlotCandlestickDragDropGuideBoxOptions | PlotColumnDragDropGuideBoxOptions | PlotColumnpyramidDragDropGuideBoxOptions | PlotColumnrangeDragDropGuideBoxOptions | PlotDumbbellDragDropGuideBoxOptions | PlotErrorbarDragDropGuideBoxOptions | PlotFlagsDragDropGuideBoxOptions | PlotFunnel3dDragDropGuideBoxOptions | PlotGanttDragDropGuideBoxOptions | PlotHeatmapDragDropGuideBoxOptions | PlotLineDragDropGuideBoxOptions | PlotLollipopDragDropGuideBoxOptions | PlotMapbubbleDragDropGuideBoxOptions | PlotMapDragDropGuideBoxOptions | PlotMaplineDragDropGuideBoxOptions | PlotMappointDragDropGuideBoxOptions | PlotOhlcDragDropGuideBoxOptions | PlotPolygonDragDropGuideBoxOptions | PlotPyramid3dDragDropGuideBoxOptions | PlotScatterDragDropGuideBoxOptions | PlotSeriesDragDropGuideBoxOptions | PlotSplineDragDropGuideBoxOptions | PlotStreamgraphDragDropGuideBoxOptions | PlotTilemapDragDropGuideBoxOptions | PlotTimelineDragDropGuideBoxOptions | PlotVariwideDragDropGuideBoxOptions | PlotWaterfallDragDropGuideBoxOptions | PlotXrangeDragDropGuideBoxOptions | Dictionary[DragDropGuideBoxOptionsObject] = null,
    liveRedraw: js.UndefOr[Boolean] = js.undefined
  ): SeriesDragDropOptionsObject = {
    val __obj = js.Dynamic.literal()
    if (dragHandle != null) __obj.updateDynamic("dragHandle")(dragHandle.asInstanceOf[js.Any])
    if (dragMaxX != null) __obj.updateDynamic("dragMaxX")(dragMaxX.asInstanceOf[js.Any])
    if (dragMaxY != null) __obj.updateDynamic("dragMaxY")(dragMaxY.asInstanceOf[js.Any])
    if (dragMinX != null) __obj.updateDynamic("dragMinX")(dragMinX.asInstanceOf[js.Any])
    if (dragMinY != null) __obj.updateDynamic("dragMinY")(dragMinY.asInstanceOf[js.Any])
    if (dragPrecisionX != null) __obj.updateDynamic("dragPrecisionX")(dragPrecisionX.asInstanceOf[js.Any])
    if (dragPrecisionY != null) __obj.updateDynamic("dragPrecisionY")(dragPrecisionY.asInstanceOf[js.Any])
    if (dragSensitivity != null) __obj.updateDynamic("dragSensitivity")(dragSensitivity.asInstanceOf[js.Any])
    if (!js.isUndefined(draggableClose)) __obj.updateDynamic("draggableClose")(draggableClose.asInstanceOf[js.Any])
    if (!js.isUndefined(draggableEnd)) __obj.updateDynamic("draggableEnd")(draggableEnd.asInstanceOf[js.Any])
    if (!js.isUndefined(draggableHigh)) __obj.updateDynamic("draggableHigh")(draggableHigh.asInstanceOf[js.Any])
    if (!js.isUndefined(draggableLow)) __obj.updateDynamic("draggableLow")(draggableLow.asInstanceOf[js.Any])
    if (!js.isUndefined(draggableOpen)) __obj.updateDynamic("draggableOpen")(draggableOpen.asInstanceOf[js.Any])
    if (!js.isUndefined(draggableQ1)) __obj.updateDynamic("draggableQ1")(draggableQ1.asInstanceOf[js.Any])
    if (!js.isUndefined(draggableQ3)) __obj.updateDynamic("draggableQ3")(draggableQ3.asInstanceOf[js.Any])
    if (!js.isUndefined(draggableStart)) __obj.updateDynamic("draggableStart")(draggableStart.asInstanceOf[js.Any])
    if (!js.isUndefined(draggableTarget)) __obj.updateDynamic("draggableTarget")(draggableTarget.asInstanceOf[js.Any])
    if (!js.isUndefined(draggableX)) __obj.updateDynamic("draggableX")(draggableX.asInstanceOf[js.Any])
    if (!js.isUndefined(draggableX1)) __obj.updateDynamic("draggableX1")(draggableX1.asInstanceOf[js.Any])
    if (!js.isUndefined(draggableX2)) __obj.updateDynamic("draggableX2")(draggableX2.asInstanceOf[js.Any])
    if (!js.isUndefined(draggableY)) __obj.updateDynamic("draggableY")(draggableY.asInstanceOf[js.Any])
    if (groupBy != null) __obj.updateDynamic("groupBy")(groupBy.asInstanceOf[js.Any])
    if (guideBox != null) __obj.updateDynamic("guideBox")(guideBox.asInstanceOf[js.Any])
    if (!js.isUndefined(liveRedraw)) __obj.updateDynamic("liveRedraw")(liveRedraw.asInstanceOf[js.Any])
    __obj.asInstanceOf[SeriesDragDropOptionsObject]
  }
}

