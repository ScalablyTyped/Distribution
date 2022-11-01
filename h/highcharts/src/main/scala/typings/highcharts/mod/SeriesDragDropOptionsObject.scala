package typings.highcharts.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SeriesDragDropOptionsObject extends StObject {
  
  /**
    * (Highcharts, Highstock, Gantt) Options for the drag handles available in
    * column series.
    */
  var dragHandle: js.UndefOr[DragDropHandleOptionsObject] = js.undefined
  
  /**
    * (Highstock) Set the maximum X value the points can be moved to.
    */
  var dragMaxX: js.UndefOr[Double] = js.undefined
  
  /**
    * (Highstock) Set the maximum Y value the points can be moved to.
    */
  var dragMaxY: js.UndefOr[Double] = js.undefined
  
  /**
    * (Highstock) Set the minimum X value the points can be moved to.
    */
  var dragMinX: js.UndefOr[Double] = js.undefined
  
  /**
    * (Highstock) Set the minimum Y value the points can be moved to.
    */
  var dragMinY: js.UndefOr[Double] = js.undefined
  
  /**
    * (Highstock) The X precision value to drag to for this series. Set to 0 to
    * disable. By default this is disabled, except for category axes, where the
    * default is 1.
    */
  var dragPrecisionX: js.UndefOr[Double] = js.undefined
  
  /**
    * (Highstock) The Y precision value to drag to for this series. Set to 0 to
    * disable. By default this is disabled, except for category axes, where the
    * default is 1.
    */
  var dragPrecisionY: js.UndefOr[Double] = js.undefined
  
  /**
    * (Highstock) The amount of pixels to drag the pointer before it counts as
    * a drag operation. This prevents drag/drop to fire when just clicking or
    * selecting points.
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
    * (Highcharts) Allow Q1 value to be dragged individually.
    */
  var draggableQ1: js.UndefOr[Boolean] = js.undefined
  
  /**
    * (Highcharts) Allow Q3 value to be dragged individually.
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
    * (Highstock) Enable dragging in the X dimension.
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
    * (Highstock) Enable dragging in the Y dimension. Note that this is not
    * supported for TreeGrid axes (the default axis type in Gantt charts).
    */
  var draggableY: js.UndefOr[Boolean] = js.undefined
  
  /**
    * (Highstock) Group the points by a property. Points with the same property
    * value will be grouped together when moving.
    */
  var groupBy: js.UndefOr[String] = js.undefined
  
  /**
    * (Highstock) Style options for the guide box. The guide box has one state
    * by default, the `default` state.
    */
  var guideBox: js.UndefOr[
    /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 113, starting with typings.highcharts.mod.PlotAbandsDragDropGuideBoxOptions, typings.highcharts.mod.PlotAdDragDropGuideBoxOptions, typings.highcharts.mod.PlotAoDragDropGuideBoxOptions */ Any
  ] = js.undefined
  
  /**
    * (Highstock) Update points as they are dragged. If false, a guide box is
    * drawn to illustrate the new point size.
    */
  var liveRedraw: js.UndefOr[Boolean] = js.undefined
}
object SeriesDragDropOptionsObject {
  
  inline def apply(): SeriesDragDropOptionsObject = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SeriesDragDropOptionsObject]
  }
  
  extension [Self <: SeriesDragDropOptionsObject](x: Self) {
    
    inline def setDragHandle(value: DragDropHandleOptionsObject): Self = StObject.set(x, "dragHandle", value.asInstanceOf[js.Any])
    
    inline def setDragHandleUndefined: Self = StObject.set(x, "dragHandle", js.undefined)
    
    inline def setDragMaxX(value: Double): Self = StObject.set(x, "dragMaxX", value.asInstanceOf[js.Any])
    
    inline def setDragMaxXUndefined: Self = StObject.set(x, "dragMaxX", js.undefined)
    
    inline def setDragMaxY(value: Double): Self = StObject.set(x, "dragMaxY", value.asInstanceOf[js.Any])
    
    inline def setDragMaxYUndefined: Self = StObject.set(x, "dragMaxY", js.undefined)
    
    inline def setDragMinX(value: Double): Self = StObject.set(x, "dragMinX", value.asInstanceOf[js.Any])
    
    inline def setDragMinXUndefined: Self = StObject.set(x, "dragMinX", js.undefined)
    
    inline def setDragMinY(value: Double): Self = StObject.set(x, "dragMinY", value.asInstanceOf[js.Any])
    
    inline def setDragMinYUndefined: Self = StObject.set(x, "dragMinY", js.undefined)
    
    inline def setDragPrecisionX(value: Double): Self = StObject.set(x, "dragPrecisionX", value.asInstanceOf[js.Any])
    
    inline def setDragPrecisionXUndefined: Self = StObject.set(x, "dragPrecisionX", js.undefined)
    
    inline def setDragPrecisionY(value: Double): Self = StObject.set(x, "dragPrecisionY", value.asInstanceOf[js.Any])
    
    inline def setDragPrecisionYUndefined: Self = StObject.set(x, "dragPrecisionY", js.undefined)
    
    inline def setDragSensitivity(value: Double): Self = StObject.set(x, "dragSensitivity", value.asInstanceOf[js.Any])
    
    inline def setDragSensitivityUndefined: Self = StObject.set(x, "dragSensitivity", js.undefined)
    
    inline def setDraggableClose(value: Boolean): Self = StObject.set(x, "draggableClose", value.asInstanceOf[js.Any])
    
    inline def setDraggableCloseUndefined: Self = StObject.set(x, "draggableClose", js.undefined)
    
    inline def setDraggableEnd(value: Boolean): Self = StObject.set(x, "draggableEnd", value.asInstanceOf[js.Any])
    
    inline def setDraggableEndUndefined: Self = StObject.set(x, "draggableEnd", js.undefined)
    
    inline def setDraggableHigh(value: Boolean): Self = StObject.set(x, "draggableHigh", value.asInstanceOf[js.Any])
    
    inline def setDraggableHighUndefined: Self = StObject.set(x, "draggableHigh", js.undefined)
    
    inline def setDraggableLow(value: Boolean): Self = StObject.set(x, "draggableLow", value.asInstanceOf[js.Any])
    
    inline def setDraggableLowUndefined: Self = StObject.set(x, "draggableLow", js.undefined)
    
    inline def setDraggableOpen(value: Boolean): Self = StObject.set(x, "draggableOpen", value.asInstanceOf[js.Any])
    
    inline def setDraggableOpenUndefined: Self = StObject.set(x, "draggableOpen", js.undefined)
    
    inline def setDraggableQ1(value: Boolean): Self = StObject.set(x, "draggableQ1", value.asInstanceOf[js.Any])
    
    inline def setDraggableQ1Undefined: Self = StObject.set(x, "draggableQ1", js.undefined)
    
    inline def setDraggableQ3(value: Boolean): Self = StObject.set(x, "draggableQ3", value.asInstanceOf[js.Any])
    
    inline def setDraggableQ3Undefined: Self = StObject.set(x, "draggableQ3", js.undefined)
    
    inline def setDraggableStart(value: Boolean): Self = StObject.set(x, "draggableStart", value.asInstanceOf[js.Any])
    
    inline def setDraggableStartUndefined: Self = StObject.set(x, "draggableStart", js.undefined)
    
    inline def setDraggableTarget(value: Boolean): Self = StObject.set(x, "draggableTarget", value.asInstanceOf[js.Any])
    
    inline def setDraggableTargetUndefined: Self = StObject.set(x, "draggableTarget", js.undefined)
    
    inline def setDraggableX(value: Boolean): Self = StObject.set(x, "draggableX", value.asInstanceOf[js.Any])
    
    inline def setDraggableX1(value: Boolean): Self = StObject.set(x, "draggableX1", value.asInstanceOf[js.Any])
    
    inline def setDraggableX1Undefined: Self = StObject.set(x, "draggableX1", js.undefined)
    
    inline def setDraggableX2(value: Boolean): Self = StObject.set(x, "draggableX2", value.asInstanceOf[js.Any])
    
    inline def setDraggableX2Undefined: Self = StObject.set(x, "draggableX2", js.undefined)
    
    inline def setDraggableXUndefined: Self = StObject.set(x, "draggableX", js.undefined)
    
    inline def setDraggableY(value: Boolean): Self = StObject.set(x, "draggableY", value.asInstanceOf[js.Any])
    
    inline def setDraggableYUndefined: Self = StObject.set(x, "draggableY", js.undefined)
    
    inline def setGroupBy(value: String): Self = StObject.set(x, "groupBy", value.asInstanceOf[js.Any])
    
    inline def setGroupByUndefined: Self = StObject.set(x, "groupBy", js.undefined)
    
    inline def setGuideBox(
      value: /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 113, starting with typings.highcharts.mod.PlotAbandsDragDropGuideBoxOptions, typings.highcharts.mod.PlotAdDragDropGuideBoxOptions, typings.highcharts.mod.PlotAoDragDropGuideBoxOptions */ Any
    ): Self = StObject.set(x, "guideBox", value.asInstanceOf[js.Any])
    
    inline def setGuideBoxUndefined: Self = StObject.set(x, "guideBox", js.undefined)
    
    inline def setLiveRedraw(value: Boolean): Self = StObject.set(x, "liveRedraw", value.asInstanceOf[js.Any])
    
    inline def setLiveRedrawUndefined: Self = StObject.set(x, "liveRedraw", js.undefined)
  }
}
