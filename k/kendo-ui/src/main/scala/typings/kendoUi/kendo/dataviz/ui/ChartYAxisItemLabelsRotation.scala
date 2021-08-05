package typings.kendoUi.kendo.dataviz.ui

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ChartYAxisItemLabelsRotation extends StObject {
  
  var align: js.UndefOr[String] = js.undefined
  
  var angle: js.UndefOr[Double] = js.undefined
}
object ChartYAxisItemLabelsRotation {
  
  inline def apply(): ChartYAxisItemLabelsRotation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ChartYAxisItemLabelsRotation]
  }
  
  extension [Self <: ChartYAxisItemLabelsRotation](x: Self) {
    
    inline def setAlign(value: String): Self = StObject.set(x, "align", value.asInstanceOf[js.Any])
    
    inline def setAlignUndefined: Self = StObject.set(x, "align", js.undefined)
    
    inline def setAngle(value: Double): Self = StObject.set(x, "angle", value.asInstanceOf[js.Any])
    
    inline def setAngleUndefined: Self = StObject.set(x, "angle", js.undefined)
  }
}
