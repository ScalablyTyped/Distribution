package typings.googleapis.osconfigV1betaMod.osconfigV1beta

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaRecurringSchedule extends StObject {
  
  /**
    * Optional. The end time at which a recurring patch deployment schedule is no longer active.
    */
  var endTime: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Required. The frequency unit of this recurring schedule.
    */
  var frequency: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Output only. The time the last patch job ran successfully.
    */
  var lastExecuteTime: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Required. Schedule with monthly executions.
    */
  var monthly: js.UndefOr[SchemaMonthlySchedule] = js.undefined
  
  /**
    * Output only. The time the next patch job is scheduled to run.
    */
  var nextExecuteTime: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Optional. The time that the recurring schedule becomes effective. Defaults to `create_time` of the patch deployment.
    */
  var startTime: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Required. Time of the day to run a recurring deployment.
    */
  var timeOfDay: js.UndefOr[SchemaTimeOfDay] = js.undefined
  
  /**
    * Required. Defines the time zone that `time_of_day` is relative to. The rules for daylight saving time are determined by the chosen time zone.
    */
  var timeZone: js.UndefOr[SchemaTimeZone] = js.undefined
  
  /**
    * Required. Schedule with weekly executions.
    */
  var weekly: js.UndefOr[SchemaWeeklySchedule] = js.undefined
}
object SchemaRecurringSchedule {
  
  inline def apply(): SchemaRecurringSchedule = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaRecurringSchedule]
  }
  
  extension [Self <: SchemaRecurringSchedule](x: Self) {
    
    inline def setEndTime(value: String): Self = StObject.set(x, "endTime", value.asInstanceOf[js.Any])
    
    inline def setEndTimeNull: Self = StObject.set(x, "endTime", null)
    
    inline def setEndTimeUndefined: Self = StObject.set(x, "endTime", js.undefined)
    
    inline def setFrequency(value: String): Self = StObject.set(x, "frequency", value.asInstanceOf[js.Any])
    
    inline def setFrequencyNull: Self = StObject.set(x, "frequency", null)
    
    inline def setFrequencyUndefined: Self = StObject.set(x, "frequency", js.undefined)
    
    inline def setLastExecuteTime(value: String): Self = StObject.set(x, "lastExecuteTime", value.asInstanceOf[js.Any])
    
    inline def setLastExecuteTimeNull: Self = StObject.set(x, "lastExecuteTime", null)
    
    inline def setLastExecuteTimeUndefined: Self = StObject.set(x, "lastExecuteTime", js.undefined)
    
    inline def setMonthly(value: SchemaMonthlySchedule): Self = StObject.set(x, "monthly", value.asInstanceOf[js.Any])
    
    inline def setMonthlyUndefined: Self = StObject.set(x, "monthly", js.undefined)
    
    inline def setNextExecuteTime(value: String): Self = StObject.set(x, "nextExecuteTime", value.asInstanceOf[js.Any])
    
    inline def setNextExecuteTimeNull: Self = StObject.set(x, "nextExecuteTime", null)
    
    inline def setNextExecuteTimeUndefined: Self = StObject.set(x, "nextExecuteTime", js.undefined)
    
    inline def setStartTime(value: String): Self = StObject.set(x, "startTime", value.asInstanceOf[js.Any])
    
    inline def setStartTimeNull: Self = StObject.set(x, "startTime", null)
    
    inline def setStartTimeUndefined: Self = StObject.set(x, "startTime", js.undefined)
    
    inline def setTimeOfDay(value: SchemaTimeOfDay): Self = StObject.set(x, "timeOfDay", value.asInstanceOf[js.Any])
    
    inline def setTimeOfDayUndefined: Self = StObject.set(x, "timeOfDay", js.undefined)
    
    inline def setTimeZone(value: SchemaTimeZone): Self = StObject.set(x, "timeZone", value.asInstanceOf[js.Any])
    
    inline def setTimeZoneUndefined: Self = StObject.set(x, "timeZone", js.undefined)
    
    inline def setWeekly(value: SchemaWeeklySchedule): Self = StObject.set(x, "weekly", value.asInstanceOf[js.Any])
    
    inline def setWeeklyUndefined: Self = StObject.set(x, "weekly", js.undefined)
  }
}
