package typings.kendoUi.kendo.ui

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DropDownTreeFilteringEvent
  extends StObject
     with DropDownTreeEvent {
  
  var filter: js.UndefOr[Any] = js.undefined
}
object DropDownTreeFilteringEvent {
  
  inline def apply(isDefaultPrevented: () => Boolean, preventDefault: js.Function, sender: DropDownTree): DropDownTreeFilteringEvent = {
    val __obj = js.Dynamic.literal(isDefaultPrevented = js.Any.fromFunction0(isDefaultPrevented), preventDefault = preventDefault.asInstanceOf[js.Any], sender = sender.asInstanceOf[js.Any])
    __obj.asInstanceOf[DropDownTreeFilteringEvent]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DropDownTreeFilteringEvent] (val x: Self) extends AnyVal {
    
    inline def setFilter(value: Any): Self = StObject.set(x, "filter", value.asInstanceOf[js.Any])
    
    inline def setFilterUndefined: Self = StObject.set(x, "filter", js.undefined)
  }
}
