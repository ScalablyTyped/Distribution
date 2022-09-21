package typings.googleapis.dataprocV1Mod.dataprocV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceProjectsLocationsAutoscalingpoliciesDelete
  extends StObject
     with StandardParameters {
  
  /**
    * Required. The "resource name" of the autoscaling policy, as described in https://cloud.google.com/apis/design/resource_names. For projects.regions.autoscalingPolicies.delete, the resource name of the policy has the following format: projects/{project_id\}/regions/{region\}/autoscalingPolicies/{policy_id\} For projects.locations.autoscalingPolicies.delete, the resource name of the policy has the following format: projects/{project_id\}/locations/{location\}/autoscalingPolicies/{policy_id\}
    */
  var name: js.UndefOr[String] = js.undefined
}
object ParamsResourceProjectsLocationsAutoscalingpoliciesDelete {
  
  inline def apply(): ParamsResourceProjectsLocationsAutoscalingpoliciesDelete = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceProjectsLocationsAutoscalingpoliciesDelete]
  }
  
  extension [Self <: ParamsResourceProjectsLocationsAutoscalingpoliciesDelete](x: Self) {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
