package typings.kendoUi.kendo.dataviz.ui

import typings.kendoUi.JQuery
import typings.std.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TreeMapItemCreatedEvent extends TreeMapEvent {
  
  var element: js.UndefOr[JQuery | Element] = js.native
}
object TreeMapItemCreatedEvent {
  
  @scala.inline
  def apply(isDefaultPrevented: () => Boolean, preventDefault: js.Function, sender: TreeMap): TreeMapItemCreatedEvent = {
    val __obj = js.Dynamic.literal(isDefaultPrevented = js.Any.fromFunction0(isDefaultPrevented), preventDefault = preventDefault.asInstanceOf[js.Any], sender = sender.asInstanceOf[js.Any])
    __obj.asInstanceOf[TreeMapItemCreatedEvent]
  }
  
  @scala.inline
  implicit class TreeMapItemCreatedEventMutableBuilder[Self <: TreeMapItemCreatedEvent] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setElement(value: JQuery | Element): Self = StObject.set(x, "element", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setElementUndefined: Self = StObject.set(x, "element", js.undefined)
  }
}
