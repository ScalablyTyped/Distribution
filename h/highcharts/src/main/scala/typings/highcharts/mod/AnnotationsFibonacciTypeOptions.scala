package typings.highcharts.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AnnotationsFibonacciTypeOptions extends StObject {
  
  /**
    * (Highstock) An array of background colors: Default to: (see online
    * documentation for example)
    */
  var backgroundColors: js.UndefOr[js.Object] = js.native
  
  /**
    * (Highstock) The height of the fibonacci in terms of yAxis.
    */
  var height: js.UndefOr[Double] = js.native
  
  /**
    * (Highstock) An array with options for the labels.
    */
  var labels: js.UndefOr[js.Array[AnnotationsFibonacciTypeLabelsOptions]] = js.native
  
  /**
    * (Highstock) Line options.
    */
  var line: js.UndefOr[AnnotationsFibonacciTypeLineOptions] = js.native
  
  /**
    * (Highstock) The color of line.
    */
  var lineColor: js.UndefOr[String] = js.native
  
  /**
    * (Highstock) An array of colors for the lines.
    */
  var lineColors: js.UndefOr[js.Object] = js.native
  
  var points: js.UndefOr[js.Array[AnnotationsFibonacciTypePointsOptions]] = js.native
  
  /**
    * (Highstock) This number defines which xAxis the point is connected to. It
    * refers to either the axis id or the index of the axis in the xAxis array.
    */
  var xAxis: js.UndefOr[Double] = js.native
  
  /**
    * (Highstock) This number defines which yAxis the point is connected to. It
    * refers to either the axis id or the index of the axis in the xAxis array.
    */
  var yAxis: js.UndefOr[Double] = js.native
}
object AnnotationsFibonacciTypeOptions {
  
  @scala.inline
  def apply(): AnnotationsFibonacciTypeOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnnotationsFibonacciTypeOptions]
  }
  
  @scala.inline
  implicit class AnnotationsFibonacciTypeOptionsMutableBuilder[Self <: AnnotationsFibonacciTypeOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBackgroundColors(value: js.Object): Self = StObject.set(x, "backgroundColors", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBackgroundColorsUndefined: Self = StObject.set(x, "backgroundColors", js.undefined)
    
    @scala.inline
    def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
    
    @scala.inline
    def setLabels(value: js.Array[AnnotationsFibonacciTypeLabelsOptions]): Self = StObject.set(x, "labels", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabelsUndefined: Self = StObject.set(x, "labels", js.undefined)
    
    @scala.inline
    def setLabelsVarargs(value: AnnotationsFibonacciTypeLabelsOptions*): Self = StObject.set(x, "labels", js.Array(value :_*))
    
    @scala.inline
    def setLine(value: AnnotationsFibonacciTypeLineOptions): Self = StObject.set(x, "line", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLineColor(value: String): Self = StObject.set(x, "lineColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLineColorUndefined: Self = StObject.set(x, "lineColor", js.undefined)
    
    @scala.inline
    def setLineColors(value: js.Object): Self = StObject.set(x, "lineColors", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLineColorsUndefined: Self = StObject.set(x, "lineColors", js.undefined)
    
    @scala.inline
    def setLineUndefined: Self = StObject.set(x, "line", js.undefined)
    
    @scala.inline
    def setPoints(value: js.Array[AnnotationsFibonacciTypePointsOptions]): Self = StObject.set(x, "points", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPointsUndefined: Self = StObject.set(x, "points", js.undefined)
    
    @scala.inline
    def setPointsVarargs(value: AnnotationsFibonacciTypePointsOptions*): Self = StObject.set(x, "points", js.Array(value :_*))
    
    @scala.inline
    def setXAxis(value: Double): Self = StObject.set(x, "xAxis", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setXAxisUndefined: Self = StObject.set(x, "xAxis", js.undefined)
    
    @scala.inline
    def setYAxis(value: Double): Self = StObject.set(x, "yAxis", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setYAxisUndefined: Self = StObject.set(x, "yAxis", js.undefined)
  }
}
