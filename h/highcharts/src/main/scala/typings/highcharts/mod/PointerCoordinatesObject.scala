package typings.highcharts.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PointerCoordinatesObject extends StObject {
  
  var chartX: Double = js.native
  
  var chartY: Double = js.native
}
object PointerCoordinatesObject {
  
  @scala.inline
  def apply(chartX: Double, chartY: Double): PointerCoordinatesObject = {
    val __obj = js.Dynamic.literal(chartX = chartX.asInstanceOf[js.Any], chartY = chartY.asInstanceOf[js.Any])
    __obj.asInstanceOf[PointerCoordinatesObject]
  }
  
  @scala.inline
  implicit class PointerCoordinatesObjectMutableBuilder[Self <: PointerCoordinatesObject] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setChartX(value: Double): Self = StObject.set(x, "chartX", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChartY(value: Double): Self = StObject.set(x, "chartY", value.asInstanceOf[js.Any])
  }
}
