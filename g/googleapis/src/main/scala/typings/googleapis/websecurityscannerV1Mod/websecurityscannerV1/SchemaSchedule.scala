package typings.googleapis.websecurityscannerV1Mod.websecurityscannerV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaSchedule extends StObject {
  
  /**
    * Required. The duration of time between executions in days.
    */
  var intervalDurationDays: js.UndefOr[Double | Null] = js.undefined
  
  /**
    * A timestamp indicates when the next run will be scheduled. The value is refreshed by the server after each run. If unspecified, it will default to current server time, which means the scan will be scheduled to start immediately.
    */
  var scheduleTime: js.UndefOr[String | Null] = js.undefined
}
object SchemaSchedule {
  
  inline def apply(): SchemaSchedule = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaSchedule]
  }
  
  extension [Self <: SchemaSchedule](x: Self) {
    
    inline def setIntervalDurationDays(value: Double): Self = StObject.set(x, "intervalDurationDays", value.asInstanceOf[js.Any])
    
    inline def setIntervalDurationDaysNull: Self = StObject.set(x, "intervalDurationDays", null)
    
    inline def setIntervalDurationDaysUndefined: Self = StObject.set(x, "intervalDurationDays", js.undefined)
    
    inline def setScheduleTime(value: String): Self = StObject.set(x, "scheduleTime", value.asInstanceOf[js.Any])
    
    inline def setScheduleTimeNull: Self = StObject.set(x, "scheduleTime", null)
    
    inline def setScheduleTimeUndefined: Self = StObject.set(x, "scheduleTime", js.undefined)
  }
}
