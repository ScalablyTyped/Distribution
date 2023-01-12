package typings.highcharts.mod

import typings.highcharts.highchartsStrings.drag
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PointDragEventObject extends StObject {
  
  /**
    * New points during drag.
    */
  var newPoints: Dictionary[PointDragDropObject]
  
  /**
    * Original data.
    */
  var origin: DragDropPositionObject
  
  /**
    * Prevent default drag action.
    */
  var preventDefault: js.Function
  
  /**
    * Target point that caused the event.
    */
  var target: Point
  
  /**
    * Event type.
    */
  var `type`: drag
}
object PointDragEventObject {
  
  inline def apply(
    newPoints: Dictionary[PointDragDropObject],
    origin: DragDropPositionObject,
    preventDefault: js.Function,
    target: Point
  ): PointDragEventObject = {
    val __obj = js.Dynamic.literal(newPoints = newPoints.asInstanceOf[js.Any], origin = origin.asInstanceOf[js.Any], preventDefault = preventDefault.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("drag")
    __obj.asInstanceOf[PointDragEventObject]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PointDragEventObject] (val x: Self) extends AnyVal {
    
    inline def setNewPoints(value: Dictionary[PointDragDropObject]): Self = StObject.set(x, "newPoints", value.asInstanceOf[js.Any])
    
    inline def setOrigin(value: DragDropPositionObject): Self = StObject.set(x, "origin", value.asInstanceOf[js.Any])
    
    inline def setPreventDefault(value: js.Function): Self = StObject.set(x, "preventDefault", value.asInstanceOf[js.Any])
    
    inline def setTarget(value: Point): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
    
    inline def setType(value: drag): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
