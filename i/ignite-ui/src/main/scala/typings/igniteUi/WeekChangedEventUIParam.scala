package typings.igniteUi

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait WeekChangedEventUIParam extends StObject {
  
  /**
    * Gets a reference to newly selected date.
    */
  var newSelectedDate: js.UndefOr[js.Any] = js.native
  
  /**
    * Gets a reference to the scheduler.
    */
  var owner: js.UndefOr[js.Any] = js.native
}
object WeekChangedEventUIParam {
  
  @scala.inline
  def apply(): WeekChangedEventUIParam = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WeekChangedEventUIParam]
  }
  
  @scala.inline
  implicit class WeekChangedEventUIParamMutableBuilder[Self <: WeekChangedEventUIParam] (val x: Self) extends AnyVal {
    
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
