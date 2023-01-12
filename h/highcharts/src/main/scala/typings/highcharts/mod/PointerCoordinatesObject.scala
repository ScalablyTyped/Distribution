package typings.highcharts.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PointerCoordinatesObject extends StObject {
  
  var chartX: Double
  
  var chartY: Double
}
object PointerCoordinatesObject {
  
  inline def apply(chartX: Double, chartY: Double): PointerCoordinatesObject = {
    val __obj = js.Dynamic.literal(chartX = chartX.asInstanceOf[js.Any], chartY = chartY.asInstanceOf[js.Any])
    __obj.asInstanceOf[PointerCoordinatesObject]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PointerCoordinatesObject] (val x: Self) extends AnyVal {
    
    inline def setChartX(value: Double): Self = StObject.set(x, "chartX", value.asInstanceOf[js.Any])
    
    inline def setChartY(value: Double): Self = StObject.set(x, "chartY", value.asInstanceOf[js.Any])
  }
}
