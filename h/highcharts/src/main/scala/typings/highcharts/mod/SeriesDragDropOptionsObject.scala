package typings.highcharts.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SeriesDragDropOptionsObject extends StObject {
  
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
    * (Highstock) Allow close value to be dragged individually.
    */
  var draggableClose: js.UndefOr[Boolean] = js.native
  
  /**
    * (Gantt) Allow end value to be dragged individually.
    */
  var draggableEnd: js.UndefOr[Boolean] = js.native
  
  /**
    * (Highstock) Allow high value to be dragged individually.
    */
  var draggableHigh: js.UndefOr[Boolean] = js.native
  
  /**
    * (Highstock) Allow low value to be dragged individually.
    */
  var draggableLow: js.UndefOr[Boolean] = js.native
  
  /**
    * (Highstock) Allow open value to be dragged individually.
    */
  var draggableOpen: js.UndefOr[Boolean] = js.native
  
  /**
    * (Highcharts, Highstock) Allow Q1 value to be dragged individually.
    */
  var draggableQ1: js.UndefOr[Boolean] = js.native
  
  /**
    * (Highcharts, Highstock) Allow Q3 value to be dragged individually.
    */
  var draggableQ3: js.UndefOr[Boolean] = js.native
  
  /**
    * (Gantt) Allow start value to be dragged individually.
    */
  var draggableStart: js.UndefOr[Boolean] = js.native
  
  /**
    * (Highcharts) Allow target value to be dragged individually.
    */
  var draggableTarget: js.UndefOr[Boolean] = js.native
  
  /**
    * (Highcharts, Highstock, Gantt) Enable dragging in the X dimension.
    */
  var draggableX: js.UndefOr[Boolean] = js.native
  
  /**
    * (Highcharts, Highstock, Gantt) Allow x value to be dragged individually.
    */
  var draggableX1: js.UndefOr[Boolean] = js.native
  
  /**
    * (Highcharts, Highstock, Gantt) Allow x2 value to be dragged individually.
    */
  var draggableX2: js.UndefOr[Boolean] = js.native
  
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
    PlotAreaDragDropGuideBoxOptions | PlotArearangeDragDropGuideBoxOptions | PlotAreasplineDragDropGuideBoxOptions | PlotAreasplinerangeDragDropGuideBoxOptions | PlotBarDragDropGuideBoxOptions | PlotBoxplotDragDropGuideBoxOptions | PlotBubbleDragDropGuideBoxOptions | PlotBulletDragDropGuideBoxOptions | PlotCandlestickDragDropGuideBoxOptions | PlotColumnDragDropGuideBoxOptions | PlotColumnpyramidDragDropGuideBoxOptions | PlotColumnrangeDragDropGuideBoxOptions | PlotDumbbellDragDropGuideBoxOptions | PlotErrorbarDragDropGuideBoxOptions | PlotFlagsDragDropGuideBoxOptions | PlotFunnel3dDragDropGuideBoxOptions | PlotGanttDragDropGuideBoxOptions | PlotHeatmapDragDropGuideBoxOptions | PlotLineDragDropGuideBoxOptions | PlotLollipopDragDropGuideBoxOptions | PlotMapbubbleDragDropGuideBoxOptions | PlotMapDragDropGuideBoxOptions | PlotMaplineDragDropGuideBoxOptions | PlotMappointDragDropGuideBoxOptions | PlotOhlcDragDropGuideBoxOptions | PlotPolygonDragDropGuideBoxOptions | PlotPyramid3dDragDropGuideBoxOptions | PlotScatterDragDropGuideBoxOptions | PlotSeriesDragDropGuideBoxOptions | PlotSplineDragDropGuideBoxOptions | PlotStreamgraphDragDropGuideBoxOptions | PlotTilemapDragDropGuideBoxOptions | PlotTimelineDragDropGuideBoxOptions | PlotVariwideDragDropGuideBoxOptions | PlotWaterfallDragDropGuideBoxOptions | PlotXrangeDragDropGuideBoxOptions | Dictionary[DragDropGuideBoxOptionsObject]
  ] = js.native
  
  /**
    * (Highcharts, Highstock, Gantt) Update points as they are dragged. If
    * false, a guide box is drawn to illustrate the new point size.
    */
  var liveRedraw: js.UndefOr[Boolean] = js.native
}
object SeriesDragDropOptionsObject {
  
  @scala.inline
  def apply(): SeriesDragDropOptionsObject = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SeriesDragDropOptionsObject]
  }
  
  @scala.inline
  implicit class SeriesDragDropOptionsObjectMutableBuilder[Self <: SeriesDragDropOptionsObject] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDragHandle(value: DragDropHandleOptionsObject): Self = StObject.set(x, "dragHandle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDragHandleUndefined: Self = StObject.set(x, "dragHandle", js.undefined)
    
    @scala.inline
    def setDragMaxX(value: Double): Self = StObject.set(x, "dragMaxX", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDragMaxXUndefined: Self = StObject.set(x, "dragMaxX", js.undefined)
    
    @scala.inline
    def setDragMaxY(value: Double): Self = StObject.set(x, "dragMaxY", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDragMaxYUndefined: Self = StObject.set(x, "dragMaxY", js.undefined)
    
    @scala.inline
    def setDragMinX(value: Double): Self = StObject.set(x, "dragMinX", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDragMinXUndefined: Self = StObject.set(x, "dragMinX", js.undefined)
    
    @scala.inline
    def setDragMinY(value: Double): Self = StObject.set(x, "dragMinY", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDragMinYUndefined: Self = StObject.set(x, "dragMinY", js.undefined)
    
    @scala.inline
    def setDragPrecisionX(value: Double): Self = StObject.set(x, "dragPrecisionX", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDragPrecisionXUndefined: Self = StObject.set(x, "dragPrecisionX", js.undefined)
    
    @scala.inline
    def setDragPrecisionY(value: Double): Self = StObject.set(x, "dragPrecisionY", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDragPrecisionYUndefined: Self = StObject.set(x, "dragPrecisionY", js.undefined)
    
    @scala.inline
    def setDragSensitivity(value: Double): Self = StObject.set(x, "dragSensitivity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDragSensitivityUndefined: Self = StObject.set(x, "dragSensitivity", js.undefined)
    
    @scala.inline
    def setDraggableClose(value: Boolean): Self = StObject.set(x, "draggableClose", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDraggableCloseUndefined: Self = StObject.set(x, "draggableClose", js.undefined)
    
    @scala.inline
    def setDraggableEnd(value: Boolean): Self = StObject.set(x, "draggableEnd", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDraggableEndUndefined: Self = StObject.set(x, "draggableEnd", js.undefined)
    
    @scala.inline
    def setDraggableHigh(value: Boolean): Self = StObject.set(x, "draggableHigh", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDraggableHighUndefined: Self = StObject.set(x, "draggableHigh", js.undefined)
    
    @scala.inline
    def setDraggableLow(value: Boolean): Self = StObject.set(x, "draggableLow", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDraggableLowUndefined: Self = StObject.set(x, "draggableLow", js.undefined)
    
    @scala.inline
    def setDraggableOpen(value: Boolean): Self = StObject.set(x, "draggableOpen", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDraggableOpenUndefined: Self = StObject.set(x, "draggableOpen", js.undefined)
    
    @scala.inline
    def setDraggableQ1(value: Boolean): Self = StObject.set(x, "draggableQ1", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDraggableQ1Undefined: Self = StObject.set(x, "draggableQ1", js.undefined)
    
    @scala.inline
    def setDraggableQ3(value: Boolean): Self = StObject.set(x, "draggableQ3", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDraggableQ3Undefined: Self = StObject.set(x, "draggableQ3", js.undefined)
    
    @scala.inline
    def setDraggableStart(value: Boolean): Self = StObject.set(x, "draggableStart", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDraggableStartUndefined: Self = StObject.set(x, "draggableStart", js.undefined)
    
    @scala.inline
    def setDraggableTarget(value: Boolean): Self = StObject.set(x, "draggableTarget", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDraggableTargetUndefined: Self = StObject.set(x, "draggableTarget", js.undefined)
    
    @scala.inline
    def setDraggableX(value: Boolean): Self = StObject.set(x, "draggableX", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDraggableX1(value: Boolean): Self = StObject.set(x, "draggableX1", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDraggableX1Undefined: Self = StObject.set(x, "draggableX1", js.undefined)
    
    @scala.inline
    def setDraggableX2(value: Boolean): Self = StObject.set(x, "draggableX2", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDraggableX2Undefined: Self = StObject.set(x, "draggableX2", js.undefined)
    
    @scala.inline
    def setDraggableXUndefined: Self = StObject.set(x, "draggableX", js.undefined)
    
    @scala.inline
    def setDraggableY(value: Boolean): Self = StObject.set(x, "draggableY", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDraggableYUndefined: Self = StObject.set(x, "draggableY", js.undefined)
    
    @scala.inline
    def setGroupBy(value: String): Self = StObject.set(x, "groupBy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGroupByUndefined: Self = StObject.set(x, "groupBy", js.undefined)
    
    @scala.inline
    def setGuideBox(
      value: PlotAreaDragDropGuideBoxOptions | PlotArearangeDragDropGuideBoxOptions | PlotAreasplineDragDropGuideBoxOptions | PlotAreasplinerangeDragDropGuideBoxOptions | PlotBarDragDropGuideBoxOptions | PlotBoxplotDragDropGuideBoxOptions | PlotBubbleDragDropGuideBoxOptions | PlotBulletDragDropGuideBoxOptions | PlotCandlestickDragDropGuideBoxOptions | PlotColumnDragDropGuideBoxOptions | PlotColumnpyramidDragDropGuideBoxOptions | PlotColumnrangeDragDropGuideBoxOptions | PlotDumbbellDragDropGuideBoxOptions | PlotErrorbarDragDropGuideBoxOptions | PlotFlagsDragDropGuideBoxOptions | PlotFunnel3dDragDropGuideBoxOptions | PlotGanttDragDropGuideBoxOptions | PlotHeatmapDragDropGuideBoxOptions | PlotLineDragDropGuideBoxOptions | PlotLollipopDragDropGuideBoxOptions | PlotMapbubbleDragDropGuideBoxOptions | PlotMapDragDropGuideBoxOptions | PlotMaplineDragDropGuideBoxOptions | PlotMappointDragDropGuideBoxOptions | PlotOhlcDragDropGuideBoxOptions | PlotPolygonDragDropGuideBoxOptions | PlotPyramid3dDragDropGuideBoxOptions | PlotScatterDragDropGuideBoxOptions | PlotSeriesDragDropGuideBoxOptions | PlotSplineDragDropGuideBoxOptions | PlotStreamgraphDragDropGuideBoxOptions | PlotTilemapDragDropGuideBoxOptions | PlotTimelineDragDropGuideBoxOptions | PlotVariwideDragDropGuideBoxOptions | PlotWaterfallDragDropGuideBoxOptions | PlotXrangeDragDropGuideBoxOptions | Dictionary[DragDropGuideBoxOptionsObject]
    ): Self = StObject.set(x, "guideBox", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGuideBoxUndefined: Self = StObject.set(x, "guideBox", js.undefined)
    
    @scala.inline
    def setLiveRedraw(value: Boolean): Self = StObject.set(x, "liveRedraw", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLiveRedrawUndefined: Self = StObject.set(x, "liveRedraw", js.undefined)
  }
}
