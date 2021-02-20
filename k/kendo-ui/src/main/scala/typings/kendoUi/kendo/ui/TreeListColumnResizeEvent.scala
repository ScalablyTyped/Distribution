package typings.kendoUi.kendo.ui

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TreeListColumnResizeEvent extends TreeListEvent {
  
  var column: js.UndefOr[js.Any] = js.native
  
  var newWidth: js.UndefOr[Double] = js.native
  
  var oldWidth: js.UndefOr[Double] = js.native
}
object TreeListColumnResizeEvent {
  
  @scala.inline
  def apply(isDefaultPrevented: () => Boolean, preventDefault: js.Function, sender: TreeList): TreeListColumnResizeEvent = {
    val __obj = js.Dynamic.literal(isDefaultPrevented = js.Any.fromFunction0(isDefaultPrevented), preventDefault = preventDefault.asInstanceOf[js.Any], sender = sender.asInstanceOf[js.Any])
    __obj.asInstanceOf[TreeListColumnResizeEvent]
  }
  
  @scala.inline
  implicit class TreeListColumnResizeEventMutableBuilder[Self <: TreeListColumnResizeEvent] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setColumn(value: js.Any): Self = StObject.set(x, "column", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColumnUndefined: Self = StObject.set(x, "column", js.undefined)
    
    @scala.inline
    def setNewWidth(value: Double): Self = StObject.set(x, "newWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNewWidthUndefined: Self = StObject.set(x, "newWidth", js.undefined)
    
    @scala.inline
    def setOldWidth(value: Double): Self = StObject.set(x, "oldWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOldWidthUndefined: Self = StObject.set(x, "oldWidth", js.undefined)
  }
}
