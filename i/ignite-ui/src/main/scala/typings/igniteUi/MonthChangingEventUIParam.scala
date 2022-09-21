package typings.igniteUi

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MonthChangingEventUIParam extends StObject {
  
  /**
    * Gets a reference to the currently selected date.
    */
  var currentSelectedDate: js.UndefOr[Any] = js.undefined
  
  /**
    * Gets a reference to newly selected date.
    */
  var newSelectedDate: js.UndefOr[Any] = js.undefined
  
  /**
    * Gets a reference to the scheduler.
    */
  var owner: js.UndefOr[Any] = js.undefined
}
object MonthChangingEventUIParam {
  
  inline def apply(): MonthChangingEventUIParam = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MonthChangingEventUIParam]
  }
  
  extension [Self <: MonthChangingEventUIParam](x: Self) {
    
    inline def setCurrentSelectedDate(value: Any): Self = StObject.set(x, "currentSelectedDate", value.asInstanceOf[js.Any])
    
    inline def setCurrentSelectedDateUndefined: Self = StObject.set(x, "currentSelectedDate", js.undefined)
    
    inline def setNewSelectedDate(value: Any): Self = StObject.set(x, "newSelectedDate", value.asInstanceOf[js.Any])
    
    inline def setNewSelectedDateUndefined: Self = StObject.set(x, "newSelectedDate", js.undefined)
    
    inline def setOwner(value: Any): Self = StObject.set(x, "owner", value.asInstanceOf[js.Any])
    
    inline def setOwnerUndefined: Self = StObject.set(x, "owner", js.undefined)
  }
}
