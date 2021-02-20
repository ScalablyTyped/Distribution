package typings.googleapis.dataprocV1beta2Mod.dataprocV1beta2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Autoscaling Policy config associated with the cluster.
  */
@js.native
trait SchemaAutoscalingConfig extends StObject {
  
  /**
    * Optional. The autoscaling policy used by the cluster.Only resource names
    * including projectid and location (region) are valid. Examples:
    * https://www.googleapis.com/compute/v1/projects/[project_id]/locations/[dataproc_region]/autoscalingPolicies/[policy_id]
    * projects/[project_id]/locations/[dataproc_region]/autoscalingPolicies/[policy_id]Note
    * that the policy must be in the same project and Cloud Dataproc region.
    */
  var policyUri: js.UndefOr[String] = js.native
}
object SchemaAutoscalingConfig {
  
  @scala.inline
  def apply(): SchemaAutoscalingConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaAutoscalingConfig]
  }
  
  @scala.inline
  implicit class SchemaAutoscalingConfigMutableBuilder[Self <: SchemaAutoscalingConfig] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPolicyUri(value: String): Self = StObject.set(x, "policyUri", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPolicyUriUndefined: Self = StObject.set(x, "policyUri", js.undefined)
  }
}
