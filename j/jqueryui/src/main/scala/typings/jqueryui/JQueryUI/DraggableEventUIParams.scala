package typings.jqueryui.JQueryUI

import typings.jqueryui.JQuery
import typings.jqueryui.anon.Left
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// Draggable //////////////////////////////////////////////////
@js.native
trait DraggableEventUIParams extends StObject {
  
  var helper: JQuery = js.native
  
  var offset: Left = js.native
  
  var position: Left = js.native
}
object DraggableEventUIParams {
  
  @scala.inline
  def apply(helper: JQuery, offset: Left, position: Left): DraggableEventUIParams = {
    val __obj = js.Dynamic.literal(helper = helper.asInstanceOf[js.Any], offset = offset.asInstanceOf[js.Any], position = position.asInstanceOf[js.Any])
    __obj.asInstanceOf[DraggableEventUIParams]
  }
  
  @scala.inline
  implicit class DraggableEventUIParamsMutableBuilder[Self <: DraggableEventUIParams] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setHelper(value: JQuery): Self = StObject.set(x, "helper", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOffset(value: Left): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPosition(value: Left): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
  }
}
