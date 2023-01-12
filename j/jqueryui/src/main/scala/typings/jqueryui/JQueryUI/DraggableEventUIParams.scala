package typings.jqueryui.JQueryUI

import typings.jqueryui.JQuery
import typings.jqueryui.anon.Left
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// Draggable //////////////////////////////////////////////////
trait DraggableEventUIParams extends StObject {
  
  var helper: JQuery
  
  var offset: Left
  
  var originalPosition: Left
  
  var position: Left
}
object DraggableEventUIParams {
  
  inline def apply(helper: JQuery, offset: Left, originalPosition: Left, position: Left): DraggableEventUIParams = {
    val __obj = js.Dynamic.literal(helper = helper.asInstanceOf[js.Any], offset = offset.asInstanceOf[js.Any], originalPosition = originalPosition.asInstanceOf[js.Any], position = position.asInstanceOf[js.Any])
    __obj.asInstanceOf[DraggableEventUIParams]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DraggableEventUIParams] (val x: Self) extends AnyVal {
    
    inline def setHelper(value: JQuery): Self = StObject.set(x, "helper", value.asInstanceOf[js.Any])
    
    inline def setOffset(value: Left): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
    
    inline def setOriginalPosition(value: Left): Self = StObject.set(x, "originalPosition", value.asInstanceOf[js.Any])
    
    inline def setPosition(value: Left): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
  }
}
