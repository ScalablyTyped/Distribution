package typings.googleapis.dataprocV1Mod.dataprocV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaAutoscalingConfig extends StObject {
  
  /**
    * Optional. The autoscaling policy used by the cluster.Only resource names including projectid and location (region) are valid. Examples: https://www.googleapis.com/compute/v1/projects/[project_id]/locations/[dataproc_region]/autoscalingPolicies/[policy_id] projects/[project_id]/locations/[dataproc_region]/autoscalingPolicies/[policy_id]Note that the policy must be in the same project and Dataproc region.
    */
  var policyUri: js.UndefOr[String | Null] = js.undefined
}
object SchemaAutoscalingConfig {
  
  inline def apply(): SchemaAutoscalingConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaAutoscalingConfig]
  }
  
  extension [Self <: SchemaAutoscalingConfig](x: Self) {
    
    inline def setPolicyUri(value: String): Self = StObject.set(x, "policyUri", value.asInstanceOf[js.Any])
    
    inline def setPolicyUriNull: Self = StObject.set(x, "policyUri", null)
    
    inline def setPolicyUriUndefined: Self = StObject.set(x, "policyUri", js.undefined)
  }
}
