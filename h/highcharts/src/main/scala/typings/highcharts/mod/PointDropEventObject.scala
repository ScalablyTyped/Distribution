package typings.highcharts.mod

import typings.highcharts.highchartsStrings.drop
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PointDropEventObject extends StObject {
  
  /**
    * New point after drag if only a single one.
    */
  var newPoint: js.UndefOr[PointDragDropObject] = js.undefined
  
  /**
    * New point id after drag if only a single one.
    */
  var newPointId: js.UndefOr[String] = js.undefined
  
  /**
    * New points after drop.
    */
  var newPoints: Dictionary[PointDragDropObject]
  
  /**
    * Number of new points.
    */
  var numNewPoints: Double
  
  /**
    * Original data.
    */
  var origin: DragDropPositionObject
  
  /**
    * Prevent default drop action.
    */
  var preventDefault: js.Function
  
  /**
    * Target point that caused the event.
    */
  var target: Point
  
  /**
    * Event type.
    */
  var `type`: drop
}
object PointDropEventObject {
  
  inline def apply(
    newPoints: Dictionary[PointDragDropObject],
    numNewPoints: Double,
    origin: DragDropPositionObject,
    preventDefault: js.Function,
    target: Point
  ): PointDropEventObject = {
    val __obj = js.Dynamic.literal(newPoints = newPoints.asInstanceOf[js.Any], numNewPoints = numNewPoints.asInstanceOf[js.Any], origin = origin.asInstanceOf[js.Any], preventDefault = preventDefault.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("drop")
    __obj.asInstanceOf[PointDropEventObject]
  }
  
  extension [Self <: PointDropEventObject](x: Self) {
    
    inline def setNewPoint(value: PointDragDropObject): Self = StObject.set(x, "newPoint", value.asInstanceOf[js.Any])
    
    inline def setNewPointId(value: String): Self = StObject.set(x, "newPointId", value.asInstanceOf[js.Any])
    
    inline def setNewPointIdUndefined: Self = StObject.set(x, "newPointId", js.undefined)
    
    inline def setNewPointUndefined: Self = StObject.set(x, "newPoint", js.undefined)
    
    inline def setNewPoints(value: Dictionary[PointDragDropObject]): Self = StObject.set(x, "newPoints", value.asInstanceOf[js.Any])
    
    inline def setNumNewPoints(value: Double): Self = StObject.set(x, "numNewPoints", value.asInstanceOf[js.Any])
    
    inline def setOrigin(value: DragDropPositionObject): Self = StObject.set(x, "origin", value.asInstanceOf[js.Any])
    
    inline def setPreventDefault(value: js.Function): Self = StObject.set(x, "preventDefault", value.asInstanceOf[js.Any])
    
    inline def setTarget(value: Point): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
    
    inline def setType(value: drop): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
