package typings.maximMazurokGapiClientCompute.gapi.client.compute

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ResourcePolicySnapshotSchedulePolicySchedule extends js.Object {
  
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
  implicit class ResourcePolicySnapshotSchedulePolicyScheduleOps[Self <: ResourcePolicySnapshotSchedulePolicySchedule] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setDailySchedule(value: ResourcePolicyDailyCycle): Self = this.set("dailySchedule", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDailySchedule: Self = this.set("dailySchedule", js.undefined)
    
    @scala.inline
    def setHourlySchedule(value: ResourcePolicyHourlyCycle): Self = this.set("hourlySchedule", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHourlySchedule: Self = this.set("hourlySchedule", js.undefined)
    
    @scala.inline
    def setWeeklySchedule(value: ResourcePolicyWeeklyCycle): Self = this.set("weeklySchedule", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWeeklySchedule: Self = this.set("weeklySchedule", js.undefined)
  }
}
