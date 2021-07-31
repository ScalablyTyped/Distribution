package typings.igniteUi

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DaySelectedEventUIParam extends StObject {
  
  /**
    * Gets a reference to currently selected date.
    */
  var date: js.UndefOr[js.Any] = js.undefined
  
  /**
    * Gets a reference to the scheduler.
    */
  var owner: js.UndefOr[js.Any] = js.undefined
}
object DaySelectedEventUIParam {
  
  @scala.inline
  def apply(): DaySelectedEventUIParam = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DaySelectedEventUIParam]
  }
  
  @scala.inline
  implicit class DaySelectedEventUIParamMutableBuilder[Self <: DaySelectedEventUIParam] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDate(value: js.Any): Self = StObject.set(x, "date", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDateUndefined: Self = StObject.set(x, "date", js.undefined)
    
    @scala.inline
    def setOwner(value: js.Any): Self = StObject.set(x, "owner", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOwnerUndefined: Self = StObject.set(x, "owner", js.undefined)
  }
}
