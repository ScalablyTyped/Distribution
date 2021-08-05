package typings.maximMazurokGapiClientCompute.gapi.client.compute

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ResourcePolicySnapshotSchedulePolicySchedule extends StObject {
  
  var dailySchedule: js.UndefOr[ResourcePolicyDailyCycle] = js.undefined
  
  var hourlySchedule: js.UndefOr[ResourcePolicyHourlyCycle] = js.undefined
  
  var weeklySchedule: js.UndefOr[ResourcePolicyWeeklyCycle] = js.undefined
}
object ResourcePolicySnapshotSchedulePolicySchedule {
  
  inline def apply(): ResourcePolicySnapshotSchedulePolicySchedule = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ResourcePolicySnapshotSchedulePolicySchedule]
  }
  
  extension [Self <: ResourcePolicySnapshotSchedulePolicySchedule](x: Self) {
    
    inline def setDailySchedule(value: ResourcePolicyDailyCycle): Self = StObject.set(x, "dailySchedule", value.asInstanceOf[js.Any])
    
    inline def setDailyScheduleUndefined: Self = StObject.set(x, "dailySchedule", js.undefined)
    
    inline def setHourlySchedule(value: ResourcePolicyHourlyCycle): Self = StObject.set(x, "hourlySchedule", value.asInstanceOf[js.Any])
    
    inline def setHourlyScheduleUndefined: Self = StObject.set(x, "hourlySchedule", js.undefined)
    
    inline def setWeeklySchedule(value: ResourcePolicyWeeklyCycle): Self = StObject.set(x, "weeklySchedule", value.asInstanceOf[js.Any])
    
    inline def setWeeklyScheduleUndefined: Self = StObject.set(x, "weeklySchedule", js.undefined)
  }
}
