package typings.kendoUi.kendo.ui

import typings.kendoUi.kendo.data.TreeListModel
import typings.std.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TreeListDropEvent
  extends StObject
     with TreeListEvent {
  
  var destination: js.UndefOr[TreeListModel] = js.undefined
  
  var dropTarget: js.UndefOr[Element] = js.undefined
  
  var setValid: js.UndefOr[Boolean] = js.undefined
  
  var source: js.UndefOr[TreeListModel] = js.undefined
  
  var valid: js.UndefOr[Boolean] = js.undefined
}
object TreeListDropEvent {
  
  inline def apply(isDefaultPrevented: () => Boolean, preventDefault: js.Function, sender: TreeList): TreeListDropEvent = {
    val __obj = js.Dynamic.literal(isDefaultPrevented = js.Any.fromFunction0(isDefaultPrevented), preventDefault = preventDefault.asInstanceOf[js.Any], sender = sender.asInstanceOf[js.Any])
    __obj.asInstanceOf[TreeListDropEvent]
  }
  
  extension [Self <: TreeListDropEvent](x: Self) {
    
    inline def setDestination(value: TreeListModel): Self = StObject.set(x, "destination", value.asInstanceOf[js.Any])
    
    inline def setDestinationUndefined: Self = StObject.set(x, "destination", js.undefined)
    
    inline def setDropTarget(value: Element): Self = StObject.set(x, "dropTarget", value.asInstanceOf[js.Any])
    
    inline def setDropTargetUndefined: Self = StObject.set(x, "dropTarget", js.undefined)
    
    inline def setSetValid(value: Boolean): Self = StObject.set(x, "setValid", value.asInstanceOf[js.Any])
    
    inline def setSetValidUndefined: Self = StObject.set(x, "setValid", js.undefined)
    
    inline def setSource(value: TreeListModel): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
    
    inline def setSourceUndefined: Self = StObject.set(x, "source", js.undefined)
    
    inline def setValid(value: Boolean): Self = StObject.set(x, "valid", value.asInstanceOf[js.Any])
    
    inline def setValidUndefined: Self = StObject.set(x, "valid", js.undefined)
  }
}
