package typings.highcharts.mod

import typings.highcharts.highchartsStrings.drop
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PointDropEventObject extends StObject {
  
  /**
    * New point after drag if only a single one.
    */
  var newPoint: js.UndefOr[PointDragDropObject] = js.native
  
  /**
    * New point id after drag if only a single one.
    */
  var newPointId: js.UndefOr[String] = js.native
  
  /**
    * New points after drop.
    */
  var newPoints: Dictionary[PointDragDropObject] = js.native
  
  /**
    * Number of new points.
    */
  var numNewPoints: Double = js.native
  
  /**
    * Original data.
    */
  var origin: DragDropPositionObject = js.native
  
  /**
    * Prevent default drop action.
    */
  var preventDefault: js.Function = js.native
  
  /**
    * Target point that caused the event.
    */
  var target: Point = js.native
  
  /**
    * Event type.
    */
  var `type`: drop = js.native
}
object PointDropEventObject {
  
  @scala.inline
  def apply(
    newPoints: Dictionary[PointDragDropObject],
    numNewPoints: Double,
    origin: DragDropPositionObject,
    preventDefault: js.Function,
    target: Point,
    `type`: drop
  ): PointDropEventObject = {
    val __obj = js.Dynamic.literal(newPoints = newPoints.asInstanceOf[js.Any], numNewPoints = numNewPoints.asInstanceOf[js.Any], origin = origin.asInstanceOf[js.Any], preventDefault = preventDefault.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[PointDropEventObject]
  }
  
  @scala.inline
  implicit class PointDropEventObjectMutableBuilder[Self <: PointDropEventObject] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setNewPoint(value: PointDragDropObject): Self = StObject.set(x, "newPoint", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNewPointId(value: String): Self = StObject.set(x, "newPointId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNewPointIdUndefined: Self = StObject.set(x, "newPointId", js.undefined)
    
    @scala.inline
    def setNewPointUndefined: Self = StObject.set(x, "newPoint", js.undefined)
    
    @scala.inline
    def setNewPoints(value: Dictionary[PointDragDropObject]): Self = StObject.set(x, "newPoints", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNumNewPoints(value: Double): Self = StObject.set(x, "numNewPoints", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOrigin(value: DragDropPositionObject): Self = StObject.set(x, "origin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPreventDefault(value: js.Function): Self = StObject.set(x, "preventDefault", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTarget(value: Point): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: drop): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
