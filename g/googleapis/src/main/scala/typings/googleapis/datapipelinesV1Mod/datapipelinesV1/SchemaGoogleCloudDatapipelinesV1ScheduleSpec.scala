package typings.googleapis.datapipelinesV1Mod.datapipelinesV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudDatapipelinesV1ScheduleSpec extends StObject {
  
  /**
    * Output only. When the next Scheduler job is going to run.
    */
  var nextJobTime: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Unix-cron format of the schedule. This information is retrieved from the linked Cloud Scheduler.
    */
  var schedule: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Timezone ID. This matches the timezone IDs used by the Cloud Scheduler API. If empty, UTC time is assumed.
    */
  var timeZone: js.UndefOr[String | Null] = js.undefined
}
object SchemaGoogleCloudDatapipelinesV1ScheduleSpec {
  
  inline def apply(): SchemaGoogleCloudDatapipelinesV1ScheduleSpec = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudDatapipelinesV1ScheduleSpec]
  }
  
  extension [Self <: SchemaGoogleCloudDatapipelinesV1ScheduleSpec](x: Self) {
    
    inline def setNextJobTime(value: String): Self = StObject.set(x, "nextJobTime", value.asInstanceOf[js.Any])
    
    inline def setNextJobTimeNull: Self = StObject.set(x, "nextJobTime", null)
    
    inline def setNextJobTimeUndefined: Self = StObject.set(x, "nextJobTime", js.undefined)
    
    inline def setSchedule(value: String): Self = StObject.set(x, "schedule", value.asInstanceOf[js.Any])
    
    inline def setScheduleNull: Self = StObject.set(x, "schedule", null)
    
    inline def setScheduleUndefined: Self = StObject.set(x, "schedule", js.undefined)
    
    inline def setTimeZone(value: String): Self = StObject.set(x, "timeZone", value.asInstanceOf[js.Any])
    
    inline def setTimeZoneNull: Self = StObject.set(x, "timeZone", null)
    
    inline def setTimeZoneUndefined: Self = StObject.set(x, "timeZone", js.undefined)
  }
}
