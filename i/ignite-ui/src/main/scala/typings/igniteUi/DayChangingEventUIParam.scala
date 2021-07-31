package typings.igniteUi

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DayChangingEventUIParam extends StObject {
  
  /**
    * Gets a reference to the currently selected date.
    */
  var currentSelectedDate: js.UndefOr[js.Any] = js.undefined
  
  /**
    * Gets a reference to newly selected date.
    */
  var newSelectedDate: js.UndefOr[js.Any] = js.undefined
  
  /**
    * Gets a reference to the scheduler.
    */
  var owner: js.UndefOr[js.Any] = js.undefined
}
object DayChangingEventUIParam {
  
  @scala.inline
  def apply(): DayChangingEventUIParam = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DayChangingEventUIParam]
  }
  
  @scala.inline
  implicit class DayChangingEventUIParamMutableBuilder[Self <: DayChangingEventUIParam] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCurrentSelectedDate(value: js.Any): Self = StObject.set(x, "currentSelectedDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCurrentSelectedDateUndefined: Self = StObject.set(x, "currentSelectedDate", js.undefined)
    
    @scala.inline
    def setNewSelectedDate(value: js.Any): Self = StObject.set(x, "newSelectedDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNewSelectedDateUndefined: Self = StObject.set(x, "newSelectedDate", js.undefined)
    
    @scala.inline
    def setOwner(value: js.Any): Self = StObject.set(x, "owner", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOwnerUndefined: Self = StObject.set(x, "owner", js.undefined)
  }
}
