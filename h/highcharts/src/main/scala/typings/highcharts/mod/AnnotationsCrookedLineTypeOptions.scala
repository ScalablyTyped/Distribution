package typings.highcharts.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AnnotationsCrookedLineTypeOptions extends StObject {
  
  /**
    * (Highstock) Line options.
    */
  var line: js.UndefOr[AnnotationsCrookedLineTypeLineOptions] = js.undefined
  
  var points: js.UndefOr[js.Array[AnnotationsCrookedLineTypePointsOptions]] = js.undefined
  
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
object AnnotationsCrookedLineTypeOptions {
  
  inline def apply(): AnnotationsCrookedLineTypeOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnnotationsCrookedLineTypeOptions]
  }
  
  extension [Self <: AnnotationsCrookedLineTypeOptions](x: Self) {
    
    inline def setLine(value: AnnotationsCrookedLineTypeLineOptions): Self = StObject.set(x, "line", value.asInstanceOf[js.Any])
    
    inline def setLineUndefined: Self = StObject.set(x, "line", js.undefined)
    
    inline def setPoints(value: js.Array[AnnotationsCrookedLineTypePointsOptions]): Self = StObject.set(x, "points", value.asInstanceOf[js.Any])
    
    inline def setPointsUndefined: Self = StObject.set(x, "points", js.undefined)
    
    inline def setPointsVarargs(value: AnnotationsCrookedLineTypePointsOptions*): Self = StObject.set(x, "points", js.Array(value*))
    
    inline def setXAxis(value: Double): Self = StObject.set(x, "xAxis", value.asInstanceOf[js.Any])
    
    inline def setXAxisUndefined: Self = StObject.set(x, "xAxis", js.undefined)
    
    inline def setYAxis(value: Double): Self = StObject.set(x, "yAxis", value.asInstanceOf[js.Any])
    
    inline def setYAxisUndefined: Self = StObject.set(x, "yAxis", js.undefined)
  }
}
