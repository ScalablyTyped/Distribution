package typings.jqueryui.JQueryUI

import typings.jqueryui.JQuery
import typings.jqueryui.anon.Left
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// Droppable //////////////////////////////////////////////////
@js.native
trait DroppableEventUIParam extends StObject {
  
  var draggable: JQuery = js.native
  
  var helper: JQuery = js.native
  
  var offset: Left = js.native
  
  var position: Left = js.native
}
object DroppableEventUIParam {
  
  @scala.inline
  def apply(draggable: JQuery, helper: JQuery, offset: Left, position: Left): DroppableEventUIParam = {
    val __obj = js.Dynamic.literal(draggable = draggable.asInstanceOf[js.Any], helper = helper.asInstanceOf[js.Any], offset = offset.asInstanceOf[js.Any], position = position.asInstanceOf[js.Any])
    __obj.asInstanceOf[DroppableEventUIParam]
  }
  
  @scala.inline
  implicit class DroppableEventUIParamMutableBuilder[Self <: DroppableEventUIParam] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDraggable(value: JQuery): Self = StObject.set(x, "draggable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHelper(value: JQuery): Self = StObject.set(x, "helper", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOffset(value: Left): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPosition(value: Left): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
  }
}
