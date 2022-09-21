package typings.googleapis.memcacheV1Mod.memcacheV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaWeeklyMaintenanceWindow extends StObject {
  
  /**
    * Required. Allows to define schedule that runs specified day of the week.
    */
  var day: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Required. Duration of the time window.
    */
  var duration: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Required. Start time of the window in UTC.
    */
  var startTime: js.UndefOr[SchemaTimeOfDay] = js.undefined
}
object SchemaWeeklyMaintenanceWindow {
  
  inline def apply(): SchemaWeeklyMaintenanceWindow = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaWeeklyMaintenanceWindow]
  }
  
  extension [Self <: SchemaWeeklyMaintenanceWindow](x: Self) {
    
    inline def setDay(value: String): Self = StObject.set(x, "day", value.asInstanceOf[js.Any])
    
    inline def setDayNull: Self = StObject.set(x, "day", null)
    
    inline def setDayUndefined: Self = StObject.set(x, "day", js.undefined)
    
    inline def setDuration(value: String): Self = StObject.set(x, "duration", value.asInstanceOf[js.Any])
    
    inline def setDurationNull: Self = StObject.set(x, "duration", null)
    
    inline def setDurationUndefined: Self = StObject.set(x, "duration", js.undefined)
    
    inline def setStartTime(value: SchemaTimeOfDay): Self = StObject.set(x, "startTime", value.asInstanceOf[js.Any])
    
    inline def setStartTimeUndefined: Self = StObject.set(x, "startTime", js.undefined)
  }
}
