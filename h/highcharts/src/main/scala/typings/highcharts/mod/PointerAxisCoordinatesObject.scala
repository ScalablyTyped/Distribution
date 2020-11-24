package typings.highcharts.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PointerAxisCoordinatesObject extends js.Object {
  
  /**
    * Positions on the x-axis.
    */
  var xAxis: js.Array[PointerAxisCoordinateObject] = js.native
  
  /**
    * Positions on the y-axis.
    */
  var yAxis: js.Array[PointerAxisCoordinateObject] = js.native
}
object PointerAxisCoordinatesObject {
  
  @scala.inline
  def apply(xAxis: js.Array[PointerAxisCoordinateObject], yAxis: js.Array[PointerAxisCoordinateObject]): PointerAxisCoordinatesObject = {
    val __obj = js.Dynamic.literal(xAxis = xAxis.asInstanceOf[js.Any], yAxis = yAxis.asInstanceOf[js.Any])
    __obj.asInstanceOf[PointerAxisCoordinatesObject]
  }
  
  @scala.inline
  implicit class PointerAxisCoordinatesObjectOps[Self <: PointerAxisCoordinatesObject] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setXAxisVarargs(value: PointerAxisCoordinateObject*): Self = this.set("xAxis", js.Array(value :_*))
    
    @scala.inline
    def setXAxis(value: js.Array[PointerAxisCoordinateObject]): Self = this.set("xAxis", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setYAxisVarargs(value: PointerAxisCoordinateObject*): Self = this.set("yAxis", js.Array(value :_*))
    
    @scala.inline
    def setYAxis(value: js.Array[PointerAxisCoordinateObject]): Self = this.set("yAxis", value.asInstanceOf[js.Any])
  }
}
