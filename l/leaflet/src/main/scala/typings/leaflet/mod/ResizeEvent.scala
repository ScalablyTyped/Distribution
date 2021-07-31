package typings.leaflet.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ResizeEvent
  extends StObject
     with LeafletEvent {
  
  var newSize: Point_
  
  var oldSize: Point_
}
object ResizeEvent {
  
  @scala.inline
  def apply(
    layer: js.Any,
    newSize: Point_,
    oldSize: Point_,
    propagatedFrom: js.Any,
    sourceTarget: js.Any,
    target: js.Any,
    `type`: String
  ): ResizeEvent = {
    val __obj = js.Dynamic.literal(layer = layer.asInstanceOf[js.Any], newSize = newSize.asInstanceOf[js.Any], oldSize = oldSize.asInstanceOf[js.Any], propagatedFrom = propagatedFrom.asInstanceOf[js.Any], sourceTarget = sourceTarget.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ResizeEvent]
  }
  
  @scala.inline
  implicit class ResizeEventMutableBuilder[Self <: ResizeEvent] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setNewSize(value: Point_): Self = StObject.set(x, "newSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOldSize(value: Point_): Self = StObject.set(x, "oldSize", value.asInstanceOf[js.Any])
  }
}
