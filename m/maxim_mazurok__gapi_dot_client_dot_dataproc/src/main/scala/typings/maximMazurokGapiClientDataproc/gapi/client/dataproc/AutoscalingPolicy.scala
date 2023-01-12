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
    * Optional. The labels to associate with this autoscaling policy. Label keys must contain 1 to 63 characters, and must conform to RFC 1035 (https://www.ietf.org/rfc/rfc1035.txt).
    * Label values may be empty, but, if present, must contain 1 to 63 characters, and must conform to RFC 1035 (https://www.ietf.org/rfc/rfc1035.txt). No more than 32 labels can be
    * associated with an autoscaling policy.
    */
  var labels: js.UndefOr[
    /* import warning: importer.ImportType#apply Failed type conversion: {[ P in string ]: string} */ js.Any
  ] = js.undefined
  
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
  
  inline def apply(): AutoscalingPolicy = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AutoscalingPolicy]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AutoscalingPolicy] (val x: Self) extends AnyVal {
    
    inline def setBasicAlgorithm(value: BasicAutoscalingAlgorithm): Self = StObject.set(x, "basicAlgorithm", value.asInstanceOf[js.Any])
    
    inline def setBasicAlgorithmUndefined: Self = StObject.set(x, "basicAlgorithm", js.undefined)
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    inline def setLabels(
      value: /* import warning: importer.ImportType#apply Failed type conversion: {[ P in string ]: string} */ js.Any
    ): Self = StObject.set(x, "labels", value.asInstanceOf[js.Any])
    
    inline def setLabelsUndefined: Self = StObject.set(x, "labels", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setSecondaryWorkerConfig(value: InstanceGroupAutoscalingPolicyConfig): Self = StObject.set(x, "secondaryWorkerConfig", value.asInstanceOf[js.Any])
    
    inline def setSecondaryWorkerConfigUndefined: Self = StObject.set(x, "secondaryWorkerConfig", js.undefined)
    
    inline def setWorkerConfig(value: InstanceGroupAutoscalingPolicyConfig): Self = StObject.set(x, "workerConfig", value.asInstanceOf[js.Any])
    
    inline def setWorkerConfigUndefined: Self = StObject.set(x, "workerConfig", js.undefined)
  }
}
