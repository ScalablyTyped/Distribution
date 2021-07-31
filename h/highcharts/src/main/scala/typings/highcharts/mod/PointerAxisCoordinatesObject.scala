package typings.highcharts.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PointerAxisCoordinatesObject extends StObject {
  
  /**
    * Positions on the x-axis.
    */
  var xAxis: js.Array[PointerAxisCoordinateObject]
  
  /**
    * Positions on the y-axis.
    */
  var yAxis: js.Array[PointerAxisCoordinateObject]
}
object PointerAxisCoordinatesObject {
  
  @scala.inline
  def apply(xAxis: js.Array[PointerAxisCoordinateObject], yAxis: js.Array[PointerAxisCoordinateObject]): PointerAxisCoordinatesObject = {
    val __obj = js.Dynamic.literal(xAxis = xAxis.asInstanceOf[js.Any], yAxis = yAxis.asInstanceOf[js.Any])
    __obj.asInstanceOf[PointerAxisCoordinatesObject]
  }
  
  @scala.inline
  implicit class PointerAxisCoordinatesObjectMutableBuilder[Self <: PointerAxisCoordinatesObject] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setXAxis(value: js.Array[PointerAxisCoordinateObject]): Self = StObject.set(x, "xAxis", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setXAxisVarargs(value: PointerAxisCoordinateObject*): Self = StObject.set(x, "xAxis", js.Array(value :_*))
    
    @scala.inline
    def setYAxis(value: js.Array[PointerAxisCoordinateObject]): Self = StObject.set(x, "yAxis", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setYAxisVarargs(value: PointerAxisCoordinateObject*): Self = StObject.set(x, "yAxis", js.Array(value :_*))
  }
}
