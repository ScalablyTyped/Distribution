package typings.kendoUi.kendo.ui

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait WindowDraggable extends StObject {
  
  var axis: js.UndefOr[String] = js.native
  
  var containment: js.UndefOr[js.Any | String] = js.native
  
  var dragHandle: js.UndefOr[js.Any | String] = js.native
}
object WindowDraggable {
  
  @scala.inline
  def apply(): WindowDraggable = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WindowDraggable]
  }
  
  @scala.inline
  implicit class WindowDraggableMutableBuilder[Self <: WindowDraggable] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAxis(value: String): Self = StObject.set(x, "axis", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAxisUndefined: Self = StObject.set(x, "axis", js.undefined)
    
    @scala.inline
    def setContainment(value: js.Any | String): Self = StObject.set(x, "containment", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContainmentUndefined: Self = StObject.set(x, "containment", js.undefined)
    
    @scala.inline
    def setDragHandle(value: js.Any | String): Self = StObject.set(x, "dragHandle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDragHandleUndefined: Self = StObject.set(x, "dragHandle", js.undefined)
  }
}
