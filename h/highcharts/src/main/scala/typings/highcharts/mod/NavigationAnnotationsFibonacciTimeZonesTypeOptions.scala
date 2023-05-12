package typings.highcharts.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NavigationAnnotationsFibonacciTimeZonesTypeOptions extends StObject {
  
  var controlPointOptions: js.UndefOr[NavigationAnnotationsFibonacciTimeZonesTypeControlPointOptions] = js.undefined
  
  /**
    * (Highstock) Line options.
    */
  var line: js.UndefOr[NavigationAnnotationsFibonacciTimeZonesTypeLineOptions] = js.undefined
  
  var points: js.UndefOr[js.Array[NavigationAnnotationsFibonacciTimeZonesTypePointsOptions]] = js.undefined
  
  /**
    * (Highstock) This number defines which xAxis the point is connected to. It
    * refers to either the axis id or the index of the axis in the xAxis array.
    */
  var xAxis: js.UndefOr[Double] = js.undefined
  
  /**
    * (Highstock) This number defines which yAxis the point is connected to. It
    * refers to either the axis id or the index of the axis in the xAxis array.
    */
  var yAxis: js.UndefOr[Double] = js.undefined
}
object NavigationAnnotationsFibonacciTimeZonesTypeOptions {
  
  inline def apply(): NavigationAnnotationsFibonacciTimeZonesTypeOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NavigationAnnotationsFibonacciTimeZonesTypeOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: NavigationAnnotationsFibonacciTimeZonesTypeOptions] (val x: Self) extends AnyVal {
    
    inline def setControlPointOptions(value: NavigationAnnotationsFibonacciTimeZonesTypeControlPointOptions): Self = StObject.set(x, "controlPointOptions", value.asInstanceOf[js.Any])
    
    inline def setControlPointOptionsUndefined: Self = StObject.set(x, "controlPointOptions", js.undefined)
    
    inline def setLine(value: NavigationAnnotationsFibonacciTimeZonesTypeLineOptions): Self = StObject.set(x, "line", value.asInstanceOf[js.Any])
    
    inline def setLineUndefined: Self = StObject.set(x, "line", js.undefined)
    
    inline def setPoints(value: js.Array[NavigationAnnotationsFibonacciTimeZonesTypePointsOptions]): Self = StObject.set(x, "points", value.asInstanceOf[js.Any])
    
    inline def setPointsUndefined: Self = StObject.set(x, "points", js.undefined)
    
    inline def setPointsVarargs(value: NavigationAnnotationsFibonacciTimeZonesTypePointsOptions*): Self = StObject.set(x, "points", js.Array(value*))
    
    inline def setXAxis(value: Double): Self = StObject.set(x, "xAxis", value.asInstanceOf[js.Any])
    
    inline def setXAxisUndefined: Self = StObject.set(x, "xAxis", js.undefined)
    
    inline def setYAxis(value: Double): Self = StObject.set(x, "yAxis", value.asInstanceOf[js.Any])
    
    inline def setYAxisUndefined: Self = StObject.set(x, "yAxis", js.undefined)
  }
}
