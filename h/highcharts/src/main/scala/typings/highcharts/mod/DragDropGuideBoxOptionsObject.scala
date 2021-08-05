package typings.highcharts.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DragDropGuideBoxOptionsObject extends StObject {
  
  /**
    * (Highcharts, Highstock, Gantt) CSS class name of the guide box in this
    * state. Defaults to `highcharts-drag-box-default`.
    */
  var className: js.UndefOr[String] = js.undefined
  
  /**
    * (Highcharts, Highstock, Gantt) Guide box fill color.
    */
  var color: js.UndefOr[ColorString | GradientColorObject | PatternObject] = js.undefined
  
  /**
    * (Highcharts, Highstock, Gantt) Guide box cursor.
    */
  var cursor: js.UndefOr[String] = js.undefined
  
  /**
    * (Highcharts, Highstock, Gantt) Color of the border around the guide box.
    */
  var lineColor: js.UndefOr[ColorString] = js.undefined
  
  /**
    * (Highcharts, Highstock, Gantt) Width of the line around the guide box.
    */
  var lineWidth: js.UndefOr[Double] = js.undefined
  
  /**
    * (Highcharts, Highstock, Gantt) Guide box zIndex.
    */
  var zIndex: js.UndefOr[Double] = js.undefined
}
object DragDropGuideBoxOptionsObject {
  
  inline def apply(): DragDropGuideBoxOptionsObject = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DragDropGuideBoxOptionsObject]
  }
  
  extension [Self <: DragDropGuideBoxOptionsObject](x: Self) {
    
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
    
    inline def setZIndex(value: Double): Self = StObject.set(x, "zIndex", value.asInstanceOf[js.Any])
    
    inline def setZIndexUndefined: Self = StObject.set(x, "zIndex", js.undefined)
  }
}
