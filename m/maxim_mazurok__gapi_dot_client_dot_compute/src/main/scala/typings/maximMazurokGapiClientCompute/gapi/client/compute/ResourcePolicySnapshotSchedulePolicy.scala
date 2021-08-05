package typings.maximMazurokGapiClientCompute.gapi.client.compute

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ResourcePolicySnapshotSchedulePolicy extends StObject {
  
  /** Retention policy applied to snapshots created by this resource policy. */
  var retentionPolicy: js.UndefOr[ResourcePolicySnapshotSchedulePolicyRetentionPolicy] = js.undefined
  
  /** A Vm Maintenance Policy specifies what kind of infrastructure maintenance we are allowed to perform on this VM and when. Schedule that is applied to disks covered by this policy. */
  var schedule: js.UndefOr[ResourcePolicySnapshotSchedulePolicySchedule] = js.undefined
  
  /** Properties with which snapshots are created such as labels, encryption keys. */
  var snapshotProperties: js.UndefOr[ResourcePolicySnapshotSchedulePolicySnapshotProperties] = js.undefined
}
object ResourcePolicySnapshotSchedulePolicy {
  
  inline def apply(): ResourcePolicySnapshotSchedulePolicy = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ResourcePolicySnapshotSchedulePolicy]
  }
  
  extension [Self <: ResourcePolicySnapshotSchedulePolicy](x: Self) {
    
    inline def setRetentionPolicy(value: ResourcePolicySnapshotSchedulePolicyRetentionPolicy): Self = StObject.set(x, "retentionPolicy", value.asInstanceOf[js.Any])
    
    inline def setRetentionPolicyUndefined: Self = StObject.set(x, "retentionPolicy", js.undefined)
    
    inline def setSchedule(value: ResourcePolicySnapshotSchedulePolicySchedule): Self = StObject.set(x, "schedule", value.asInstanceOf[js.Any])
    
    inline def setScheduleUndefined: Self = StObject.set(x, "schedule", js.undefined)
    
    inline def setSnapshotProperties(value: ResourcePolicySnapshotSchedulePolicySnapshotProperties): Self = StObject.set(x, "snapshotProperties", value.asInstanceOf[js.Any])
    
    inline def setSnapshotPropertiesUndefined: Self = StObject.set(x, "snapshotProperties", js.undefined)
  }
}
