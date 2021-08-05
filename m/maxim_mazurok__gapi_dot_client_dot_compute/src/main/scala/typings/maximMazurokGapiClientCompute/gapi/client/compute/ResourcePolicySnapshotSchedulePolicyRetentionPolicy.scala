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
  
  inline def apply(): ResourcePolicySnapshotSchedulePolicyRetentionPolicy = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ResourcePolicySnapshotSchedulePolicyRetentionPolicy]
  }
  
  extension [Self <: ResourcePolicySnapshotSchedulePolicyRetentionPolicy](x: Self) {
    
    inline def setMaxRetentionDays(value: Double): Self = StObject.set(x, "maxRetentionDays", value.asInstanceOf[js.Any])
    
    inline def setMaxRetentionDaysUndefined: Self = StObject.set(x, "maxRetentionDays", js.undefined)
    
    inline def setOnSourceDiskDelete(value: String): Self = StObject.set(x, "onSourceDiskDelete", value.asInstanceOf[js.Any])
    
    inline def setOnSourceDiskDeleteUndefined: Self = StObject.set(x, "onSourceDiskDelete", js.undefined)
  }
}
