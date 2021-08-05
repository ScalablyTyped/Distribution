package typings.kendoUi.kendo.dataviz.ui

import typings.kendoUi.JQuery
import typings.std.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TreeMapItemCreatedEvent
  extends StObject
     with TreeMapEvent {
  
  var element: js.UndefOr[JQuery | Element] = js.undefined
}
object TreeMapItemCreatedEvent {
  
  inline def apply(isDefaultPrevented: () => Boolean, preventDefault: js.Function, sender: TreeMap): TreeMapItemCreatedEvent = {
    val __obj = js.Dynamic.literal(isDefaultPrevented = js.Any.fromFunction0(isDefaultPrevented), preventDefault = preventDefault.asInstanceOf[js.Any], sender = sender.asInstanceOf[js.Any])
    __obj.asInstanceOf[TreeMapItemCreatedEvent]
  }
  
  extension [Self <: TreeMapItemCreatedEvent](x: Self) {
    
    inline def setElement(value: JQuery | Element): Self = StObject.set(x, "element", value.asInstanceOf[js.Any])
    
    inline def setElementUndefined: Self = StObject.set(x, "element", js.undefined)
  }
}
