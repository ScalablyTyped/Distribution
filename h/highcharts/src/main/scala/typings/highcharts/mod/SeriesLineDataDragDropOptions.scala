package typings.highcharts.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SeriesLineDataDragDropOptions extends StObject {
  
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
    * (Highcharts, Highstock, Gantt) Enable dragging in the X dimension.
    */
  var draggableX: js.UndefOr[Boolean] = js.undefined
  
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
    /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 52 */ Any
  ] = js.undefined
  
  /**
    * (Highcharts, Highstock, Gantt) Update points as they are dragged. If
    * false, a guide box is drawn to illustrate the new point size.
    */
  var liveRedraw: js.UndefOr[Boolean] = js.undefined
}
object SeriesLineDataDragDropOptions {
  
  inline def apply(): SeriesLineDataDragDropOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SeriesLineDataDragDropOptions]
  }
  
  extension [Self <: SeriesLineDataDragDropOptions](x: Self) {
    
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
    
    inline def setDraggableX(value: Boolean): Self = StObject.set(x, "draggableX", value.asInstanceOf[js.Any])
    
    inline def setDraggableXUndefined: Self = StObject.set(x, "draggableX", js.undefined)
    
    inline def setDraggableY(value: Boolean): Self = StObject.set(x, "draggableY", value.asInstanceOf[js.Any])
    
    inline def setDraggableYUndefined: Self = StObject.set(x, "draggableY", js.undefined)
    
    inline def setGroupBy(value: String): Self = StObject.set(x, "groupBy", value.asInstanceOf[js.Any])
    
    inline def setGroupByUndefined: Self = StObject.set(x, "groupBy", js.undefined)
    
    inline def setGuideBox(value: /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 52 */ Any): Self = StObject.set(x, "guideBox", value.asInstanceOf[js.Any])
    
    inline def setGuideBoxUndefined: Self = StObject.set(x, "guideBox", js.undefined)
    
    inline def setLiveRedraw(value: Boolean): Self = StObject.set(x, "liveRedraw", value.asInstanceOf[js.Any])
    
    inline def setLiveRedrawUndefined: Self = StObject.set(x, "liveRedraw", js.undefined)
  }
}
