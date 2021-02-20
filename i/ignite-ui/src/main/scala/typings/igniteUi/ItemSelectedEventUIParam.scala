package typings.igniteUi

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ItemSelectedEventUIParam extends StObject {
  
  /**
    * Gets a reference to jQuery UI date picker widget, used as a calendar from the igDatePicker.
    */
  var calendar: js.UndefOr[js.Any] = js.native
  
  /**
    * Gets a reference to the selected date object.
    */
  var dateFromPicker: js.UndefOr[js.Any] = js.native
  
  /**
    * Gets a reference to the selected html element from the calendar.
    */
  var item: js.UndefOr[js.Any] = js.native
  
  /**
    * Gets a reference to the editor.
    */
  var owner: js.UndefOr[js.Any] = js.native
}
object ItemSelectedEventUIParam {
  
  @scala.inline
  def apply(): ItemSelectedEventUIParam = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ItemSelectedEventUIParam]
  }
  
  @scala.inline
  implicit class ItemSelectedEventUIParamMutableBuilder[Self <: ItemSelectedEventUIParam] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCalendar(value: js.Any): Self = StObject.set(x, "calendar", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCalendarUndefined: Self = StObject.set(x, "calendar", js.undefined)
    
    @scala.inline
    def setDateFromPicker(value: js.Any): Self = StObject.set(x, "dateFromPicker", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDateFromPickerUndefined: Self = StObject.set(x, "dateFromPicker", js.undefined)
    
    @scala.inline
    def setItem(value: js.Any): Self = StObject.set(x, "item", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItemUndefined: Self = StObject.set(x, "item", js.undefined)
    
    @scala.inline
    def setOwner(value: js.Any): Self = StObject.set(x, "owner", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOwnerUndefined: Self = StObject.set(x, "owner", js.undefined)
  }
}
