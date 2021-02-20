package typings.igniteUi

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AgendaRangeChangingEventUIParam extends StObject {
  
  /**
    * Gets a reference to the current AgendaView start date.
    */
  var currentAgendaRangeStartDate: js.UndefOr[js.Any] = js.native
  
  /**
    * Gets a reference to the days to be shown in AgendaView mode.
    */
  var dateRangeInterval: js.UndefOr[Double] = js.native
  
  /**
    * Gets a reference to the newly AgendaView start date.
    */
  var newAgendaRangeStartDate: js.UndefOr[js.Any] = js.native
  
  /**
    * Gets a reference to the scheduler.
    */
  var owner: js.UndefOr[js.Any] = js.native
}
object AgendaRangeChangingEventUIParam {
  
  @scala.inline
  def apply(): AgendaRangeChangingEventUIParam = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AgendaRangeChangingEventUIParam]
  }
  
  @scala.inline
  implicit class AgendaRangeChangingEventUIParamMutableBuilder[Self <: AgendaRangeChangingEventUIParam] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCurrentAgendaRangeStartDate(value: js.Any): Self = StObject.set(x, "currentAgendaRangeStartDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCurrentAgendaRangeStartDateUndefined: Self = StObject.set(x, "currentAgendaRangeStartDate", js.undefined)
    
    @scala.inline
    def setDateRangeInterval(value: Double): Self = StObject.set(x, "dateRangeInterval", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDateRangeIntervalUndefined: Self = StObject.set(x, "dateRangeInterval", js.undefined)
    
    @scala.inline
    def setNewAgendaRangeStartDate(value: js.Any): Self = StObject.set(x, "newAgendaRangeStartDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNewAgendaRangeStartDateUndefined: Self = StObject.set(x, "newAgendaRangeStartDate", js.undefined)
    
    @scala.inline
    def setOwner(value: js.Any): Self = StObject.set(x, "owner", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOwnerUndefined: Self = StObject.set(x, "owner", js.undefined)
  }
}
