package typings.igniteUi

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ItemSelectedEventUIParam extends StObject {
  
  /**
    * Gets a reference to jQuery UI date picker widget, used as a calendar from the igDatePicker.
    */
  var calendar: js.UndefOr[Any] = js.undefined
  
  /**
    * Gets a reference to the selected date object.
    */
  var dateFromPicker: js.UndefOr[Any] = js.undefined
  
  /**
    * Gets a reference to the selected html element from the calendar.
    */
  var item: js.UndefOr[Any] = js.undefined
  
  /**
    * Gets a reference to the editor.
    */
  var owner: js.UndefOr[Any] = js.undefined
}
object ItemSelectedEventUIParam {
  
  inline def apply(): ItemSelectedEventUIParam = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ItemSelectedEventUIParam]
  }
  
  extension [Self <: ItemSelectedEventUIParam](x: Self) {
    
    inline def setCalendar(value: Any): Self = StObject.set(x, "calendar", value.asInstanceOf[js.Any])
    
    inline def setCalendarUndefined: Self = StObject.set(x, "calendar", js.undefined)
    
    inline def setDateFromPicker(value: Any): Self = StObject.set(x, "dateFromPicker", value.asInstanceOf[js.Any])
    
    inline def setDateFromPickerUndefined: Self = StObject.set(x, "dateFromPicker", js.undefined)
    
    inline def setItem(value: Any): Self = StObject.set(x, "item", value.asInstanceOf[js.Any])
    
    inline def setItemUndefined: Self = StObject.set(x, "item", js.undefined)
    
    inline def setOwner(value: Any): Self = StObject.set(x, "owner", value.asInstanceOf[js.Any])
    
    inline def setOwnerUndefined: Self = StObject.set(x, "owner", js.undefined)
  }
}
