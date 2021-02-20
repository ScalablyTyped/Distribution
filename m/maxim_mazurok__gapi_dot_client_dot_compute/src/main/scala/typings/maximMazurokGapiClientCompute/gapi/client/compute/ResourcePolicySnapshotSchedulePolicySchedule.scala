package typings.maximMazurokGapiClientCompute.gapi.client.compute

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ResourcePolicySnapshotSchedulePolicySchedule extends StObject {
  
  var dailySchedule: js.UndefOr[ResourcePolicyDailyCycle] = js.native
  
  var hourlySchedule: js.UndefOr[ResourcePolicyHourlyCycle] = js.native
  
  var weeklySchedule: js.UndefOr[ResourcePolicyWeeklyCycle] = js.native
}
object ResourcePolicySnapshotSchedulePolicySchedule {
  
  @scala.inline
  def apply(): ResourcePolicySnapshotSchedulePolicySchedule = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ResourcePolicySnapshotSchedulePolicySchedule]
  }
  
  @scala.inline
  implicit class ResourcePolicySnapshotSchedulePolicyScheduleMutableBuilder[Self <: ResourcePolicySnapshotSchedulePolicySchedule] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDailySchedule(value: ResourcePolicyDailyCycle): Self = StObject.set(x, "dailySchedule", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDailyScheduleUndefined: Self = StObject.set(x, "dailySchedule", js.undefined)
    
    @scala.inline
    def setHourlySchedule(value: ResourcePolicyHourlyCycle): Self = StObject.set(x, "hourlySchedule", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHourlyScheduleUndefined: Self = StObject.set(x, "hourlySchedule", js.undefined)
    
    @scala.inline
    def setWeeklySchedule(value: ResourcePolicyWeeklyCycle): Self = StObject.set(x, "weeklySchedule", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWeeklyScheduleUndefined: Self = StObject.set(x, "weeklySchedule", js.undefined)
  }
}
