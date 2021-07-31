package typings.kendoUi.kendo.ui

import typings.kendoUi.JQuery
import typings.kendoUi.kendo.data.TreeListModel
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TreeListSaveEvent
  extends StObject
     with TreeListEvent {
  
  var container: js.UndefOr[JQuery] = js.undefined
  
  var model: js.UndefOr[TreeListModel] = js.undefined
}
object TreeListSaveEvent {
  
  @scala.inline
  def apply(isDefaultPrevented: () => Boolean, preventDefault: js.Function, sender: TreeList): TreeListSaveEvent = {
    val __obj = js.Dynamic.literal(isDefaultPrevented = js.Any.fromFunction0(isDefaultPrevented), preventDefault = preventDefault.asInstanceOf[js.Any], sender = sender.asInstanceOf[js.Any])
    __obj.asInstanceOf[TreeListSaveEvent]
  }
  
  @scala.inline
  implicit class TreeListSaveEventMutableBuilder[Self <: TreeListSaveEvent] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setContainer(value: JQuery): Self = StObject.set(x, "container", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContainerUndefined: Self = StObject.set(x, "container", js.undefined)
    
    @scala.inline
    def setModel(value: TreeListModel): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setModelUndefined: Self = StObject.set(x, "model", js.undefined)
  }
}
