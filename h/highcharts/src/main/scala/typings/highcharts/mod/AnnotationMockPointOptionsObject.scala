package typings.highcharts.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AnnotationMockPointOptionsObject extends StObject {
  
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) The x position of the point.
    * Units can be either in axis or chart pixel coordinates.
    */
  var x: js.UndefOr[Double] = js.undefined
  
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) This number defines which xAxis
    * the point is connected to. It refers to either the axis id or the index
    * of the axis in the xAxis array. If the option is not configured or the
    * axis is not found the point's x coordinate refers to the chart pixels.
    */
  var xAxis: js.UndefOr[Double | String | Null] = js.undefined
  
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) The y position of the point.
    * Units can be either in axis or chart pixel coordinates.
    */
  var y: js.UndefOr[Double] = js.undefined
  
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) This number defines which yAxis
    * the point is connected to. It refers to either the axis id or the index
    * of the axis in the yAxis array. If the option is not configured or the
    * axis is not found the point's y coordinate refers to the chart pixels.
    */
  var yAxis: js.UndefOr[Double | String | Null] = js.undefined
}
object AnnotationMockPointOptionsObject {
  
  inline def apply(): AnnotationMockPointOptionsObject = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnnotationMockPointOptionsObject]
  }
  
  extension [Self <: AnnotationMockPointOptionsObject](x: Self) {
    
    inline def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
    
    inline def setXAxis(value: Double | String): Self = StObject.set(x, "xAxis", value.asInstanceOf[js.Any])
    
    inline def setXAxisNull: Self = StObject.set(x, "xAxis", null)
    
    inline def setXAxisUndefined: Self = StObject.set(x, "xAxis", js.undefined)
    
    inline def setXUndefined: Self = StObject.set(x, "x", js.undefined)
    
    inline def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
    
    inline def setYAxis(value: Double | String): Self = StObject.set(x, "yAxis", value.asInstanceOf[js.Any])
    
    inline def setYAxisNull: Self = StObject.set(x, "yAxis", null)
    
    inline def setYAxisUndefined: Self = StObject.set(x, "yAxis", js.undefined)
    
    inline def setYUndefined: Self = StObject.set(x, "y", js.undefined)
  }
}
