package typings.googleapis.osconfigV1Mod.osconfigV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaPatchRollout extends StObject {
  
  /**
    * The maximum number (or percentage) of VMs per zone to disrupt at any given moment. The number of VMs calculated from multiplying the percentage by the total number of VMs in a zone is rounded up. During patching, a VM is considered disrupted from the time the agent is notified to begin until patching has completed. This disruption time includes the time to complete reboot and any post-patch steps. A VM contributes to the disruption budget if its patching operation fails either when applying the patches, running pre or post patch steps, or if it fails to respond with a success notification before timing out. VMs that are not running or do not have an active agent do not count toward this disruption budget. For zone-by-zone rollouts, if the disruption budget in a zone is exceeded, the patch job stops, because continuing to the next zone requires completion of the patch process in the previous zone. For example, if the disruption budget has a fixed value of `10`, and 8 VMs fail to patch in the current zone, the patch job continues to patch 2 VMs at a time until the zone is completed. When that zone is completed successfully, patching begins with 10 VMs at a time in the next zone. If 10 VMs in the next zone fail to patch, the patch job stops.
    */
  var disruptionBudget: js.UndefOr[SchemaFixedOrPercent] = js.undefined
  
  /**
    * Mode of the patch rollout.
    */
  var mode: js.UndefOr[String | Null] = js.undefined
}
object SchemaPatchRollout {
  
  inline def apply(): SchemaPatchRollout = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaPatchRollout]
  }
  
  extension [Self <: SchemaPatchRollout](x: Self) {
    
    inline def setDisruptionBudget(value: SchemaFixedOrPercent): Self = StObject.set(x, "disruptionBudget", value.asInstanceOf[js.Any])
    
    inline def setDisruptionBudgetUndefined: Self = StObject.set(x, "disruptionBudget", js.undefined)
    
    inline def setMode(value: String): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
    
    inline def setModeNull: Self = StObject.set(x, "mode", null)
    
    inline def setModeUndefined: Self = StObject.set(x, "mode", js.undefined)
  }
}
