package typings.highcharts.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DragDropHandleOptionsObject extends StObject {
  
  /**
    * (Highcharts, Highstock, Gantt) The class name of the drag handles.
    * Defaults to `highcharts-drag-handle`.
    */
  var className: js.UndefOr[String] = js.undefined
  
  /**
    * (Highcharts, Highstock, Gantt) The fill color of the drag handles.
    */
  var color: js.UndefOr[ColorString | GradientColorObject | PatternObject] = js.undefined
  
  /**
    * (Highcharts, Highstock, Gantt) The mouse cursor to use for the drag
    * handles. By default this is intelligently switching between `ew-resize`
    * and `ns-resize` depending on the direction the point is being dragged.
    */
  var cursor: js.UndefOr[String] = js.undefined
  
  /**
    * (Highcharts, Highstock, Gantt) The line color of the drag handles.
    */
  var lineColor: js.UndefOr[ColorString] = js.undefined
  
  /**
    * (Highcharts, Highstock, Gantt) The line width for the drag handles.
    */
  var lineWidth: js.UndefOr[Double] = js.undefined
  
  /**
    * (Highcharts, Highstock, Gantt) Function to define the SVG path to use for
    * the drag handles. Takes the point as argument. Should return an SVG path
    * in array format. The SVG path is automatically positioned on the point.
    */
  var pathFormatter: js.UndefOr[js.Function] = js.undefined
  
  /**
    * (Highcharts, Highstock, Gantt) The z index for the drag handles.
    */
  var zIndex: js.UndefOr[Double] = js.undefined
}
object DragDropHandleOptionsObject {
  
  inline def apply(): DragDropHandleOptionsObject = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DragDropHandleOptionsObject]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DragDropHandleOptionsObject] (val x: Self) extends AnyVal {
    
    inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
    
    inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
    
    inline def setColor(value: ColorString | GradientColorObject | PatternObject): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    inline def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
    
    inline def setCursor(value: String): Self = StObject.set(x, "cursor", value.asInstanceOf[js.Any])
    
    inline def setCursorUndefined: Self = StObject.set(x, "cursor", js.undefined)
    
    inline def setLineColor(value: ColorString): Self = StObject.set(x, "lineColor", value.asInstanceOf[js.Any])
    
    inline def setLineColorUndefined: Self = StObject.set(x, "lineColor", js.undefined)
    
    inline def setLineWidth(value: Double): Self = StObject.set(x, "lineWidth", value.asInstanceOf[js.Any])
    
    inline def setLineWidthUndefined: Self = StObject.set(x, "lineWidth", js.undefined)
    
    inline def setPathFormatter(value: js.Function): Self = StObject.set(x, "pathFormatter", value.asInstanceOf[js.Any])
    
    inline def setPathFormatterUndefined: Self = StObject.set(x, "pathFormatter", js.undefined)
    
    inline def setZIndex(value: Double): Self = StObject.set(x, "zIndex", value.asInstanceOf[js.Any])
    
    inline def setZIndexUndefined: Self = StObject.set(x, "zIndex", js.undefined)
  }
}
