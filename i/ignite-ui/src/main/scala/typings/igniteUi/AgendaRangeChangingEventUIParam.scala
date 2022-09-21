package typings.igniteUi

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AgendaRangeChangingEventUIParam extends StObject {
  
  /**
    * Gets a reference to the current AgendaView start date.
    */
  var currentAgendaRangeStartDate: js.UndefOr[Any] = js.undefined
  
  /**
    * Gets a reference to the days to be shown in AgendaView mode.
    */
  var dateRangeInterval: js.UndefOr[Double] = js.undefined
  
  /**
    * Gets a reference to the newly AgendaView start date.
    */
  var newAgendaRangeStartDate: js.UndefOr[Any] = js.undefined
  
  /**
    * Gets a reference to the scheduler.
    */
  var owner: js.UndefOr[Any] = js.undefined
}
object AgendaRangeChangingEventUIParam {
  
  inline def apply(): AgendaRangeChangingEventUIParam = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AgendaRangeChangingEventUIParam]
  }
  
  extension [Self <: AgendaRangeChangingEventUIParam](x: Self) {
    
    inline def setCurrentAgendaRangeStartDate(value: Any): Self = StObject.set(x, "currentAgendaRangeStartDate", value.asInstanceOf[js.Any])
    
    inline def setCurrentAgendaRangeStartDateUndefined: Self = StObject.set(x, "currentAgendaRangeStartDate", js.undefined)
    
    inline def setDateRangeInterval(value: Double): Self = StObject.set(x, "dateRangeInterval", value.asInstanceOf[js.Any])
    
    inline def setDateRangeIntervalUndefined: Self = StObject.set(x, "dateRangeInterval", js.undefined)
    
    inline def setNewAgendaRangeStartDate(value: Any): Self = StObject.set(x, "newAgendaRangeStartDate", value.asInstanceOf[js.Any])
    
    inline def setNewAgendaRangeStartDateUndefined: Self = StObject.set(x, "newAgendaRangeStartDate", js.undefined)
    
    inline def setOwner(value: Any): Self = StObject.set(x, "owner", value.asInstanceOf[js.Any])
    
    inline def setOwnerUndefined: Self = StObject.set(x, "owner", js.undefined)
  }
}
