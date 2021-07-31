package typings.maximMazurokGapiClientCompute.gapi.client.compute

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ResourcePolicySnapshotSchedulePolicyRetentionPolicy extends StObject {
  
  /** Maximum age of the snapshot that is allowed to be kept. */
  var maxRetentionDays: js.UndefOr[Double] = js.undefined
  
  /** Specifies the behavior to apply to scheduled snapshots when the source disk is deleted. */
  var onSourceDiskDelete: js.UndefOr[String] = js.undefined
}
object ResourcePolicySnapshotSchedulePolicyRetentionPolicy {
  
  @scala.inline
  def apply(): ResourcePolicySnapshotSchedulePolicyRetentionPolicy = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ResourcePolicySnapshotSchedulePolicyRetentionPolicy]
  }
  
  @scala.inline
  implicit class ResourcePolicySnapshotSchedulePolicyRetentionPolicyMutableBuilder[Self <: ResourcePolicySnapshotSchedulePolicyRetentionPolicy] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMaxRetentionDays(value: Double): Self = StObject.set(x, "maxRetentionDays", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxRetentionDaysUndefined: Self = StObject.set(x, "maxRetentionDays", js.undefined)
    
    @scala.inline
    def setOnSourceDiskDelete(value: String): Self = StObject.set(x, "onSourceDiskDelete", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnSourceDiskDeleteUndefined: Self = StObject.set(x, "onSourceDiskDelete", js.undefined)
  }
}
