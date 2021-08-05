package typings.highcharts.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AnnotationsCrookedLineTypePointsOptions extends StObject {
  
  var controlPoint: js.UndefOr[Double] = js.undefined
  
  /**
    * (Highstock) The x position of the point.
    */
  var x: js.UndefOr[Double] = js.undefined
  
  /**
    * (Highstock) The y position of the point.
    */
  var y: js.UndefOr[Double] = js.undefined
}
object AnnotationsCrookedLineTypePointsOptions {
  
  inline def apply(): AnnotationsCrookedLineTypePointsOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnnotationsCrookedLineTypePointsOptions]
  }
  
  extension [Self <: AnnotationsCrookedLineTypePointsOptions](x: Self) {
    
    inline def setControlPoint(value: Double): Self = StObject.set(x, "controlPoint", value.asInstanceOf[js.Any])
    
    inline def setControlPointUndefined: Self = StObject.set(x, "controlPoint", js.undefined)
    
    inline def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
    
    inline def setXUndefined: Self = StObject.set(x, "x", js.undefined)
    
    inline def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
    
    inline def setYUndefined: Self = StObject.set(x, "y", js.undefined)
  }
}
