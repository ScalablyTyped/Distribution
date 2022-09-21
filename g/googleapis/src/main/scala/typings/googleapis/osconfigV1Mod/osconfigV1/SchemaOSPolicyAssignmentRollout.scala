package typings.googleapis.osconfigV1Mod.osconfigV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaOSPolicyAssignmentRollout extends StObject {
  
  /**
    * Required. The maximum number (or percentage) of VMs per zone to disrupt at any given moment.
    */
  var disruptionBudget: js.UndefOr[SchemaFixedOrPercent] = js.undefined
  
  /**
    * Required. This determines the minimum duration of time to wait after the configuration changes are applied through the current rollout. A VM continues to count towards the `disruption_budget` at least until this duration of time has passed after configuration changes are applied.
    */
  var minWaitDuration: js.UndefOr[String | Null] = js.undefined
}
object SchemaOSPolicyAssignmentRollout {
  
  inline def apply(): SchemaOSPolicyAssignmentRollout = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaOSPolicyAssignmentRollout]
  }
  
  extension [Self <: SchemaOSPolicyAssignmentRollout](x: Self) {
    
    inline def setDisruptionBudget(value: SchemaFixedOrPercent): Self = StObject.set(x, "disruptionBudget", value.asInstanceOf[js.Any])
    
    inline def setDisruptionBudgetUndefined: Self = StObject.set(x, "disruptionBudget", js.undefined)
    
    inline def setMinWaitDuration(value: String): Self = StObject.set(x, "minWaitDuration", value.asInstanceOf[js.Any])
    
    inline def setMinWaitDurationNull: Self = StObject.set(x, "minWaitDuration", null)
    
    inline def setMinWaitDurationUndefined: Self = StObject.set(x, "minWaitDuration", js.undefined)
  }
}
