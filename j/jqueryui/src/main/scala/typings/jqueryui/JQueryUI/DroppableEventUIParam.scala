package typings.jqueryui.JQueryUI

import typings.jqueryui.JQuery
import typings.jqueryui.anon.Left
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// Droppable //////////////////////////////////////////////////
trait DroppableEventUIParam extends StObject {
  
  var draggable: JQuery
  
  var helper: JQuery
  
  var offset: Left
  
  var position: Left
}
object DroppableEventUIParam {
  
  inline def apply(draggable: JQuery, helper: JQuery, offset: Left, position: Left): DroppableEventUIParam = {
    val __obj = js.Dynamic.literal(draggable = draggable.asInstanceOf[js.Any], helper = helper.asInstanceOf[js.Any], offset = offset.asInstanceOf[js.Any], position = position.asInstanceOf[js.Any])
    __obj.asInstanceOf[DroppableEventUIParam]
  }
  
  extension [Self <: DroppableEventUIParam](x: Self) {
    
    inline def setDraggable(value: JQuery): Self = StObject.set(x, "draggable", value.asInstanceOf[js.Any])
    
    inline def setHelper(value: JQuery): Self = StObject.set(x, "helper", value.asInstanceOf[js.Any])
    
    inline def setOffset(value: Left): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
    
    inline def setPosition(value: Left): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
  }
}
