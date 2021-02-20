package typings.maximMazurokGapiClientCompute.gapi.client.compute

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ResourcePolicySnapshotSchedulePolicy extends StObject {
  
  /** Retention policy applied to snapshots created by this resource policy. */
  var retentionPolicy: js.UndefOr[ResourcePolicySnapshotSchedulePolicyRetentionPolicy] = js.native
  
  /** A Vm Maintenance Policy specifies what kind of infrastructure maintenance we are allowed to perform on this VM and when. Schedule that is applied to disks covered by this policy. */
  var schedule: js.UndefOr[ResourcePolicySnapshotSchedulePolicySchedule] = js.native
  
  /** Properties with which snapshots are created such as labels, encryption keys. */
  var snapshotProperties: js.UndefOr[ResourcePolicySnapshotSchedulePolicySnapshotProperties] = js.native
}
object ResourcePolicySnapshotSchedulePolicy {
  
  @scala.inline
  def apply(): ResourcePolicySnapshotSchedulePolicy = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ResourcePolicySnapshotSchedulePolicy]
  }
  
  @scala.inline
  implicit class ResourcePolicySnapshotSchedulePolicyMutableBuilder[Self <: ResourcePolicySnapshotSchedulePolicy] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setRetentionPolicy(value: ResourcePolicySnapshotSchedulePolicyRetentionPolicy): Self = StObject.set(x, "retentionPolicy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRetentionPolicyUndefined: Self = StObject.set(x, "retentionPolicy", js.undefined)
    
    @scala.inline
    def setSchedule(value: ResourcePolicySnapshotSchedulePolicySchedule): Self = StObject.set(x, "schedule", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScheduleUndefined: Self = StObject.set(x, "schedule", js.undefined)
    
    @scala.inline
    def setSnapshotProperties(value: ResourcePolicySnapshotSchedulePolicySnapshotProperties): Self = StObject.set(x, "snapshotProperties", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSnapshotPropertiesUndefined: Self = StObject.set(x, "snapshotProperties", js.undefined)
  }
}
