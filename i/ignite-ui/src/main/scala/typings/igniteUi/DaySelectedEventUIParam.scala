package typings.igniteUi

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DaySelectedEventUIParam extends StObject {
  
  /**
    * Gets a reference to currently selected date.
    */
  var date: js.UndefOr[Any] = js.undefined
  
  /**
    * Gets a reference to the scheduler.
    */
  var owner: js.UndefOr[Any] = js.undefined
}
object DaySelectedEventUIParam {
  
  inline def apply(): DaySelectedEventUIParam = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DaySelectedEventUIParam]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DaySelectedEventUIParam] (val x: Self) extends AnyVal {
    
    inline def setDate(value: Any): Self = StObject.set(x, "date", value.asInstanceOf[js.Any])
    
    inline def setDateUndefined: Self = StObject.set(x, "date", js.undefined)
    
    inline def setOwner(value: Any): Self = StObject.set(x, "owner", value.asInstanceOf[js.Any])
    
    inline def setOwnerUndefined: Self = StObject.set(x, "owner", js.undefined)
  }
}
