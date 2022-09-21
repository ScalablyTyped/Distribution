package typings.googleapis.dataprocV1beta2Mod.dataprocV1beta2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaAutoscalingPolicy extends StObject {
  
  var basicAlgorithm: js.UndefOr[SchemaBasicAutoscalingAlgorithm] = js.undefined
  
  /**
    * Required. The policy id.The id must contain only letters (a-z, A-Z), numbers (0-9), underscores (_), and hyphens (-). Cannot begin or end with underscore or hyphen. Must consist of between 3 and 50 characters.
    */
  var id: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Output only. The "resource name" of the autoscaling policy, as described in https://cloud.google.com/apis/design/resource_names. For projects.regions.autoscalingPolicies, the resource name of the policy has the following format: projects/{project_id\}/regions/{region\}/autoscalingPolicies/{policy_id\} For projects.locations.autoscalingPolicies, the resource name of the policy has the following format: projects/{project_id\}/locations/{location\}/autoscalingPolicies/{policy_id\}
    */
  var name: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Optional. Describes how the autoscaler will operate for secondary workers.
    */
  var secondaryWorkerConfig: js.UndefOr[SchemaInstanceGroupAutoscalingPolicyConfig] = js.undefined
  
  /**
    * Required. Describes how the autoscaler will operate for primary workers.
    */
  var workerConfig: js.UndefOr[SchemaInstanceGroupAutoscalingPolicyConfig] = js.undefined
}
object SchemaAutoscalingPolicy {
  
  inline def apply(): SchemaAutoscalingPolicy = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaAutoscalingPolicy]
  }
  
  extension [Self <: SchemaAutoscalingPolicy](x: Self) {
    
    inline def setBasicAlgorithm(value: SchemaBasicAutoscalingAlgorithm): Self = StObject.set(x, "basicAlgorithm", value.asInstanceOf[js.Any])
    
    inline def setBasicAlgorithmUndefined: Self = StObject.set(x, "basicAlgorithm", js.undefined)
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdNull: Self = StObject.set(x, "id", null)
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameNull: Self = StObject.set(x, "name", null)
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setSecondaryWorkerConfig(value: SchemaInstanceGroupAutoscalingPolicyConfig): Self = StObject.set(x, "secondaryWorkerConfig", value.asInstanceOf[js.Any])
    
    inline def setSecondaryWorkerConfigUndefined: Self = StObject.set(x, "secondaryWorkerConfig", js.undefined)
    
    inline def setWorkerConfig(value: SchemaInstanceGroupAutoscalingPolicyConfig): Self = StObject.set(x, "workerConfig", value.asInstanceOf[js.Any])
    
    inline def setWorkerConfigUndefined: Self = StObject.set(x, "workerConfig", js.undefined)
  }
}
