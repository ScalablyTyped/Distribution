package typings.igniteUi

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DayChangedEventUIParam extends StObject {
  
  /**
    * Gets a reference to newly selected date.
    */
  var newSelectedDate: js.UndefOr[js.Any] = js.undefined
  
  /**
    * Gets a reference to the scheduler.
    */
  var owner: js.UndefOr[js.Any] = js.undefined
}
object DayChangedEventUIParam {
  
  inline def apply(): DayChangedEventUIParam = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DayChangedEventUIParam]
  }
  
  extension [Self <: DayChangedEventUIParam](x: Self) {
    
    inline def setNewSelectedDate(value: js.Any): Self = StObject.set(x, "newSelectedDate", value.asInstanceOf[js.Any])
    
    inline def setNewSelectedDateUndefined: Self = StObject.set(x, "newSelectedDate", js.undefined)
    
    inline def setOwner(value: js.Any): Self = StObject.set(x, "owner", value.asInstanceOf[js.Any])
    
    inline def setOwnerUndefined: Self = StObject.set(x, "owner", js.undefined)
  }
}
