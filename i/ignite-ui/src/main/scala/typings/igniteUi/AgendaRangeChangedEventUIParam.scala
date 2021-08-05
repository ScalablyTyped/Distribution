package typings.igniteUi

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AgendaRangeChangedEventUIParam extends StObject {
  
  /**
    * Gets a reference to the days to be shown in AgendaView mode.
    */
  var dateRangeInterval: js.UndefOr[Double] = js.undefined
  
  /**
    * Gets a reference to the newly AgendaView start date.
    */
  var newAgendaRangeStartDate: js.UndefOr[js.Any] = js.undefined
  
  /**
    * Gets a reference to the scheduler.
    */
  var owner: js.UndefOr[js.Any] = js.undefined
}
object AgendaRangeChangedEventUIParam {
  
  inline def apply(): AgendaRangeChangedEventUIParam = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AgendaRangeChangedEventUIParam]
  }
  
  extension [Self <: AgendaRangeChangedEventUIParam](x: Self) {
    
    inline def setDateRangeInterval(value: Double): Self = StObject.set(x, "dateRangeInterval", value.asInstanceOf[js.Any])
    
    inline def setDateRangeIntervalUndefined: Self = StObject.set(x, "dateRangeInterval", js.undefined)
    
    inline def setNewAgendaRangeStartDate(value: js.Any): Self = StObject.set(x, "newAgendaRangeStartDate", value.asInstanceOf[js.Any])
    
    inline def setNewAgendaRangeStartDateUndefined: Self = StObject.set(x, "newAgendaRangeStartDate", js.undefined)
    
    inline def setOwner(value: js.Any): Self = StObject.set(x, "owner", value.asInstanceOf[js.Any])
    
    inline def setOwnerUndefined: Self = StObject.set(x, "owner", js.undefined)
  }
}
