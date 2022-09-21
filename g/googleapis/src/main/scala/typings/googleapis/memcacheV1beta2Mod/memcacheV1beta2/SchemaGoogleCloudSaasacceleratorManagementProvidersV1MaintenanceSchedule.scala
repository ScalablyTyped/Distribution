package typings.googleapis.memcacheV1beta2Mod.memcacheV1beta2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudSaasacceleratorManagementProvidersV1MaintenanceSchedule extends StObject {
  
  /**
    * This field is deprecated, and will be always set to true since reschedule can happen multiple times now. This field should not be removed until all service producers remove this for their customers.
    */
  var canReschedule: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * The scheduled end time for the maintenance.
    */
  var endTime: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The rollout management policy this maintenance schedule is associated with. When doing reschedule update request, the reschedule should be against this given policy.
    */
  var rolloutManagementPolicy: js.UndefOr[String | Null] = js.undefined
  
  /**
    * schedule_deadline_time is the time deadline any schedule start time cannot go beyond, including reschedule. It's normally the initial schedule start time plus maintenance window length (1 day or 1 week). Maintenance cannot be scheduled to start beyond this deadline.
    */
  var scheduleDeadlineTime: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The scheduled start time for the maintenance.
    */
  var startTime: js.UndefOr[String | Null] = js.undefined
}
object SchemaGoogleCloudSaasacceleratorManagementProvidersV1MaintenanceSchedule {
  
  inline def apply(): SchemaGoogleCloudSaasacceleratorManagementProvidersV1MaintenanceSchedule = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudSaasacceleratorManagementProvidersV1MaintenanceSchedule]
  }
  
  extension [Self <: SchemaGoogleCloudSaasacceleratorManagementProvidersV1MaintenanceSchedule](x: Self) {
    
    inline def setCanReschedule(value: Boolean): Self = StObject.set(x, "canReschedule", value.asInstanceOf[js.Any])
    
    inline def setCanRescheduleNull: Self = StObject.set(x, "canReschedule", null)
    
    inline def setCanRescheduleUndefined: Self = StObject.set(x, "canReschedule", js.undefined)
    
    inline def setEndTime(value: String): Self = StObject.set(x, "endTime", value.asInstanceOf[js.Any])
    
    inline def setEndTimeNull: Self = StObject.set(x, "endTime", null)
    
    inline def setEndTimeUndefined: Self = StObject.set(x, "endTime", js.undefined)
    
    inline def setRolloutManagementPolicy(value: String): Self = StObject.set(x, "rolloutManagementPolicy", value.asInstanceOf[js.Any])
    
    inline def setRolloutManagementPolicyNull: Self = StObject.set(x, "rolloutManagementPolicy", null)
    
    inline def setRolloutManagementPolicyUndefined: Self = StObject.set(x, "rolloutManagementPolicy", js.undefined)
    
    inline def setScheduleDeadlineTime(value: String): Self = StObject.set(x, "scheduleDeadlineTime", value.asInstanceOf[js.Any])
    
    inline def setScheduleDeadlineTimeNull: Self = StObject.set(x, "scheduleDeadlineTime", null)
    
    inline def setScheduleDeadlineTimeUndefined: Self = StObject.set(x, "scheduleDeadlineTime", js.undefined)
    
    inline def setStartTime(value: String): Self = StObject.set(x, "startTime", value.asInstanceOf[js.Any])
    
    inline def setStartTimeNull: Self = StObject.set(x, "startTime", null)
    
    inline def setStartTimeUndefined: Self = StObject.set(x, "startTime", js.undefined)
  }
}
