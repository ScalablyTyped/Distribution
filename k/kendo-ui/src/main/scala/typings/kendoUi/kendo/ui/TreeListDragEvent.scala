package typings.kendoUi.kendo.ui

import typings.kendoUi.JQuery
import typings.kendoUi.kendo.data.TreeListModel
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TreeListDragEvent
  extends StObject
     with TreeListEvent {
  
  var pageX: js.UndefOr[Double] = js.undefined
  
  var pageY: js.UndefOr[Double] = js.undefined
  
  var setStatus: js.UndefOr[js.Function] = js.undefined
  
  var source: js.UndefOr[TreeListModel] = js.undefined
  
  var status: js.UndefOr[String] = js.undefined
  
  var target: js.UndefOr[JQuery] = js.undefined
}
object TreeListDragEvent {
  
  inline def apply(isDefaultPrevented: () => Boolean, preventDefault: js.Function, sender: TreeList): TreeListDragEvent = {
    val __obj = js.Dynamic.literal(isDefaultPrevented = js.Any.fromFunction0(isDefaultPrevented), preventDefault = preventDefault.asInstanceOf[js.Any], sender = sender.asInstanceOf[js.Any])
    __obj.asInstanceOf[TreeListDragEvent]
  }
  
  extension [Self <: TreeListDragEvent](x: Self) {
    
    inline def setPageX(value: Double): Self = StObject.set(x, "pageX", value.asInstanceOf[js.Any])
    
    inline def setPageXUndefined: Self = StObject.set(x, "pageX", js.undefined)
    
    inline def setPageY(value: Double): Self = StObject.set(x, "pageY", value.asInstanceOf[js.Any])
    
    inline def setPageYUndefined: Self = StObject.set(x, "pageY", js.undefined)
    
    inline def setSetStatus(value: js.Function): Self = StObject.set(x, "setStatus", value.asInstanceOf[js.Any])
    
    inline def setSetStatusUndefined: Self = StObject.set(x, "setStatus", js.undefined)
    
    inline def setSource(value: TreeListModel): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
    
    inline def setSourceUndefined: Self = StObject.set(x, "source", js.undefined)
    
    inline def setStatus(value: String): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
    
    inline def setTarget(value: JQuery): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
    
    inline def setTargetUndefined: Self = StObject.set(x, "target", js.undefined)
  }
}
