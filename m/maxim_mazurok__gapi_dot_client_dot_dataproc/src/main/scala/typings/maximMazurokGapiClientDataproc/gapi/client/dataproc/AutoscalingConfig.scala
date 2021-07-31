package typings.maximMazurokGapiClientDataproc.gapi.client.dataproc

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AutoscalingConfig extends StObject {
  
  /**
    * Optional. The autoscaling policy used by the cluster.Only resource names including projectid and location (region) are valid. Examples:
    * https://www.googleapis.com/compute/v1/projects/[project_id]/locations/[dataproc_region]/autoscalingPolicies/[policy_id]
    * projects/[project_id]/locations/[dataproc_region]/autoscalingPolicies/[policy_id]Note that the policy must be in the same project and Dataproc region.
    */
  var policyUri: js.UndefOr[String] = js.undefined
}
object AutoscalingConfig {
  
  @scala.inline
  def apply(): AutoscalingConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AutoscalingConfig]
  }
  
  @scala.inline
  implicit class AutoscalingConfigMutableBuilder[Self <: AutoscalingConfig] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPolicyUri(value: String): Self = StObject.set(x, "policyUri", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPolicyUriUndefined: Self = StObject.set(x, "policyUri", js.undefined)
  }
}
