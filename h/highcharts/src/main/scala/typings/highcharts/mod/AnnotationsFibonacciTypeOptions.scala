package typings.highcharts.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AnnotationsFibonacciTypeOptions extends StObject {
  
  /**
    * (Highstock) An array of background colors: Default to: (see online
    * documentation for example)
    */
  var backgroundColors: js.UndefOr[js.Object] = js.undefined
  
  /**
    * (Highstock) The height of the fibonacci in terms of yAxis.
    */
  var height: js.UndefOr[Double] = js.undefined
  
  /**
    * (Highstock) An array with options for the labels.
    */
  var labels: js.UndefOr[js.Array[AnnotationsFibonacciTypeLabelsOptions]] = js.undefined
  
  /**
    * (Highstock) Line options.
    */
  var line: js.UndefOr[AnnotationsFibonacciTypeLineOptions] = js.undefined
  
  /**
    * (Highstock) The color of line.
    */
  var lineColor: js.UndefOr[String] = js.undefined
  
  /**
    * (Highstock) An array of colors for the lines.
    */
  var lineColors: js.UndefOr[js.Object] = js.undefined
  
  var points: js.UndefOr[js.Array[AnnotationsFibonacciTypePointsOptions]] = js.undefined
  
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
object AnnotationsFibonacciTypeOptions {
  
  inline def apply(): AnnotationsFibonacciTypeOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnnotationsFibonacciTypeOptions]
  }
  
  extension [Self <: AnnotationsFibonacciTypeOptions](x: Self) {
    
    inline def setBackgroundColors(value: js.Object): Self = StObject.set(x, "backgroundColors", value.asInstanceOf[js.Any])
    
    inline def setBackgroundColorsUndefined: Self = StObject.set(x, "backgroundColors", js.undefined)
    
    inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    inline def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
    
    inline def setLabels(value: js.Array[AnnotationsFibonacciTypeLabelsOptions]): Self = StObject.set(x, "labels", value.asInstanceOf[js.Any])
    
    inline def setLabelsUndefined: Self = StObject.set(x, "labels", js.undefined)
    
    inline def setLabelsVarargs(value: AnnotationsFibonacciTypeLabelsOptions*): Self = StObject.set(x, "labels", js.Array(value*))
    
    inline def setLine(value: AnnotationsFibonacciTypeLineOptions): Self = StObject.set(x, "line", value.asInstanceOf[js.Any])
    
    inline def setLineColor(value: String): Self = StObject.set(x, "lineColor", value.asInstanceOf[js.Any])
    
    inline def setLineColorUndefined: Self = StObject.set(x, "lineColor", js.undefined)
    
    inline def setLineColors(value: js.Object): Self = StObject.set(x, "lineColors", value.asInstanceOf[js.Any])
    
    inline def setLineColorsUndefined: Self = StObject.set(x, "lineColors", js.undefined)
    
    inline def setLineUndefined: Self = StObject.set(x, "line", js.undefined)
    
    inline def setPoints(value: js.Array[AnnotationsFibonacciTypePointsOptions]): Self = StObject.set(x, "points", value.asInstanceOf[js.Any])
    
    inline def setPointsUndefined: Self = StObject.set(x, "points", js.undefined)
    
    inline def setPointsVarargs(value: AnnotationsFibonacciTypePointsOptions*): Self = StObject.set(x, "points", js.Array(value*))
    
    inline def setXAxis(value: Double): Self = StObject.set(x, "xAxis", value.asInstanceOf[js.Any])
    
    inline def setXAxisUndefined: Self = StObject.set(x, "xAxis", js.undefined)
    
    inline def setYAxis(value: Double): Self = StObject.set(x, "yAxis", value.asInstanceOf[js.Any])
    
    inline def setYAxisUndefined: Self = StObject.set(x, "yAxis", js.undefined)
  }
}
