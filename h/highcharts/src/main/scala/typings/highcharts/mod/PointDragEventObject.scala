package typings.highcharts.mod

import typings.highcharts.highchartsStrings.drag
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PointDragEventObject extends StObject {
  
  /**
    * New points during drag.
    */
  var newPoints: Dictionary[PointDragDropObject] = js.native
  
  /**
    * Original data.
    */
  var origin: DragDropPositionObject = js.native
  
  /**
    * Prevent default drag action.
    */
  var preventDefault: js.Function = js.native
  
  /**
    * Target point that caused the event.
    */
  var target: Point = js.native
  
  /**
    * Event type.
    */
  var `type`: drag = js.native
}
object PointDragEventObject {
  
  @scala.inline
  def apply(
    newPoints: Dictionary[PointDragDropObject],
    origin: DragDropPositionObject,
    preventDefault: js.Function,
    target: Point,
    `type`: drag
  ): PointDragEventObject = {
    val __obj = js.Dynamic.literal(newPoints = newPoints.asInstanceOf[js.Any], origin = origin.asInstanceOf[js.Any], preventDefault = preventDefault.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[PointDragEventObject]
  }
  
  @scala.inline
  implicit class PointDragEventObjectMutableBuilder[Self <: PointDragEventObject] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setNewPoints(value: Dictionary[PointDragDropObject]): Self = StObject.set(x, "newPoints", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOrigin(value: DragDropPositionObject): Self = StObject.set(x, "origin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPreventDefault(value: js.Function): Self = StObject.set(x, "preventDefault", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTarget(value: Point): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: drag): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
