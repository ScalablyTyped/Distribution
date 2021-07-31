package typings.kendoUi.kendo.mobile.ui

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BadgeChangeEvent
  extends StObject
     with BadgeEvent {
  
  var newValue: js.UndefOr[String | Double] = js.undefined
  
  var oldValue: js.UndefOr[String | Double] = js.undefined
}
object BadgeChangeEvent {
  
  @scala.inline
  def apply(isDefaultPrevented: () => Boolean, preventDefault: js.Function, sender: Badge): BadgeChangeEvent = {
    val __obj = js.Dynamic.literal(isDefaultPrevented = js.Any.fromFunction0(isDefaultPrevented), preventDefault = preventDefault.asInstanceOf[js.Any], sender = sender.asInstanceOf[js.Any])
    __obj.asInstanceOf[BadgeChangeEvent]
  }
  
  @scala.inline
  implicit class BadgeChangeEventMutableBuilder[Self <: BadgeChangeEvent] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setNewValue(value: String | Double): Self = StObject.set(x, "newValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNewValueUndefined: Self = StObject.set(x, "newValue", js.undefined)
    
    @scala.inline
    def setOldValue(value: String | Double): Self = StObject.set(x, "oldValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOldValueUndefined: Self = StObject.set(x, "oldValue", js.undefined)
  }
}
