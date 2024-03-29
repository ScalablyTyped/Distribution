package typings.kendoUi.kendo.dataviz.ui

import typings.kendoUi.JQuery
import typings.kendoUi.kendo.data.Model
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DiagramCancelEvent
  extends StObject
     with DiagramEvent {
  
  var connection: js.UndefOr[Model] = js.undefined
  
  var container: js.UndefOr[JQuery] = js.undefined
  
  var shape: js.UndefOr[Model] = js.undefined
}
object DiagramCancelEvent {
  
  inline def apply(isDefaultPrevented: () => Boolean, preventDefault: js.Function, sender: Diagram): DiagramCancelEvent = {
    val __obj = js.Dynamic.literal(isDefaultPrevented = js.Any.fromFunction0(isDefaultPrevented), preventDefault = preventDefault.asInstanceOf[js.Any], sender = sender.asInstanceOf[js.Any])
    __obj.asInstanceOf[DiagramCancelEvent]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DiagramCancelEvent] (val x: Self) extends AnyVal {
    
    inline def setConnection(value: Model): Self = StObject.set(x, "connection", value.asInstanceOf[js.Any])
    
    inline def setConnectionUndefined: Self = StObject.set(x, "connection", js.undefined)
    
    inline def setContainer(value: JQuery): Self = StObject.set(x, "container", value.asInstanceOf[js.Any])
    
    inline def setContainerUndefined: Self = StObject.set(x, "container", js.undefined)
    
    inline def setShape(value: Model): Self = StObject.set(x, "shape", value.asInstanceOf[js.Any])
    
    inline def setShapeUndefined: Self = StObject.set(x, "shape", js.undefined)
  }
}
