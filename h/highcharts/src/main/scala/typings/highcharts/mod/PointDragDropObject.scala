package typings.highcharts.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PointDragDropObject extends StObject {
  
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
  implicit class PointDragDropObjectMutableBuilder[Self <: PointDragDropObject] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setNewValues(value: Dictionary[Double]): Self = StObject.set(x, "newValues", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPoint(value: Point): Self = StObject.set(x, "point", value.asInstanceOf[js.Any])
  }
}
