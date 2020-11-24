package typings.highcharts.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PointDragDropObject extends js.Object {
  
  /**
    * New values.
    */
  var newValues: Dictionary[Double] = js.native
  
  /**
    * Updated point.
    */
  var point: Point = js.native
}
object PointDragDropObject {
  
  @scala.inline
  def apply(newValues: Dictionary[Double], point: Point): PointDragDropObject = {
    val __obj = js.Dynamic.literal(newValues = newValues.asInstanceOf[js.Any], point = point.asInstanceOf[js.Any])
    __obj.asInstanceOf[PointDragDropObject]
  }
  
  @scala.inline
  implicit class PointDragDropObjectOps[Self <: PointDragDropObject] (val x: Self) extends AnyVal {
    
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
    def setNewValues(value: Dictionary[Double]): Self = this.set("newValues", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPoint(value: Point): Self = this.set("point", value.asInstanceOf[js.Any])
  }
}
