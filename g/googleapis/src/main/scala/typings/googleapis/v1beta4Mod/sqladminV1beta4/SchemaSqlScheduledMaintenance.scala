package typings.googleapis.v1beta4Mod.sqladminV1beta4

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaSqlScheduledMaintenance extends StObject {
  
  var canDefer: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * If the scheduled maintenance can be rescheduled.
    */
  var canReschedule: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * Maintenance cannot be rescheduled to start beyond this deadline.
    */
  var scheduleDeadlineTime: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The start time of any upcoming scheduled maintenance for this instance.
    */
  var startTime: js.UndefOr[String | Null] = js.undefined
}
object SchemaSqlScheduledMaintenance {
  
  inline def apply(): SchemaSqlScheduledMaintenance = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaSqlScheduledMaintenance]
  }
  
  extension [Self <: SchemaSqlScheduledMaintenance](x: Self) {
    
    inline def setCanDefer(value: Boolean): Self = StObject.set(x, "canDefer", value.asInstanceOf[js.Any])
    
    inline def setCanDeferNull: Self = StObject.set(x, "canDefer", null)
    
    inline def setCanDeferUndefined: Self = StObject.set(x, "canDefer", js.undefined)
    
    inline def setCanReschedule(value: Boolean): Self = StObject.set(x, "canReschedule", value.asInstanceOf[js.Any])
    
    inline def setCanRescheduleNull: Self = StObject.set(x, "canReschedule", null)
    
    inline def setCanRescheduleUndefined: Self = StObject.set(x, "canReschedule", js.undefined)
    
    inline def setScheduleDeadlineTime(value: String): Self = StObject.set(x, "scheduleDeadlineTime", value.asInstanceOf[js.Any])
    
    inline def setScheduleDeadlineTimeNull: Self = StObject.set(x, "scheduleDeadlineTime", null)
    
    inline def setScheduleDeadlineTimeUndefined: Self = StObject.set(x, "scheduleDeadlineTime", js.undefined)
    
    inline def setStartTime(value: String): Self = StObject.set(x, "startTime", value.asInstanceOf[js.Any])
    
    inline def setStartTimeNull: Self = StObject.set(x, "startTime", null)
    
    inline def setStartTimeUndefined: Self = StObject.set(x, "startTime", js.undefined)
  }
}
