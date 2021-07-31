package typings.maximMazurokGapiClientDataproc.gapi.client.dataproc

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AutoscalingPolicy extends StObject {
  
  var basicAlgorithm: js.UndefOr[BasicAutoscalingAlgorithm] = js.undefined
  
  /**
    * Required. The policy id.The id must contain only letters (a-z, A-Z), numbers (0-9), underscores (_), and hyphens (-). Cannot begin or end with underscore or hyphen. Must consist of
    * between 3 and 50 characters.
    */
  var id: js.UndefOr[String] = js.undefined
  
  /**
    * Output only. The "resource name" of the autoscaling policy, as described in https://cloud.google.com/apis/design/resource_names. For projects.regions.autoscalingPolicies, the
    * resource name of the policy has the following format: projects/{project_id}/regions/{region}/autoscalingPolicies/{policy_id} For projects.locations.autoscalingPolicies, the resource
    * name of the policy has the following format: projects/{project_id}/locations/{location}/autoscalingPolicies/{policy_id}
    */
  var name: js.UndefOr[String] = js.undefined
  
  /** Optional. Describes how the autoscaler will operate for secondary workers. */
  var secondaryWorkerConfig: js.UndefOr[InstanceGroupAutoscalingPolicyConfig] = js.undefined
  
  /** Required. Describes how the autoscaler will operate for primary workers. */
  var workerConfig: js.UndefOr[InstanceGroupAutoscalingPolicyConfig] = js.undefined
}
object AutoscalingPolicy {
  
  @scala.inline
  def apply(): AutoscalingPolicy = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AutoscalingPolicy]
  }
  
  @scala.inline
  implicit class AutoscalingPolicyMutableBuilder[Self <: AutoscalingPolicy] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBasicAlgorithm(value: BasicAutoscalingAlgorithm): Self = StObject.set(x, "basicAlgorithm", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBasicAlgorithmUndefined: Self = StObject.set(x, "basicAlgorithm", js.undefined)
    
    @scala.inline
    def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setSecondaryWorkerConfig(value: InstanceGroupAutoscalingPolicyConfig): Self = StObject.set(x, "secondaryWorkerConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSecondaryWorkerConfigUndefined: Self = StObject.set(x, "secondaryWorkerConfig", js.undefined)
    
    @scala.inline
    def setWorkerConfig(value: InstanceGroupAutoscalingPolicyConfig): Self = StObject.set(x, "workerConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWorkerConfigUndefined: Self = StObject.set(x, "workerConfig", js.undefined)
  }
}
