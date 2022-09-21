package typings.googleapis.dataprocV1beta2Mod.dataprocV1beta2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceProjectsRegionsClustersGetiampolicy
  extends StObject
     with StandardParameters {
  
  /**
    * Optional. The policy format version to be returned.Valid values are 0, 1, and 3. Requests specifying an invalid value will be rejected.Requests for policies with any conditional bindings must specify version 3. Policies without any conditional bindings may specify any valid value or leave the field unset.To learn which resources support conditions in their IAM policies, see the IAM documentation (https://cloud.google.com/iam/help/conditions/resource-policies).
    */
  @JSName("options.requestedPolicyVersion")
  var optionsDotrequestedPolicyVersion: js.UndefOr[Double] = js.undefined
  
  /**
    * REQUIRED: The resource for which the policy is being requested. See the operation documentation for the appropriate value for this field.
    */
  var resource: js.UndefOr[String] = js.undefined
}
object ParamsResourceProjectsRegionsClustersGetiampolicy {
  
  inline def apply(): ParamsResourceProjectsRegionsClustersGetiampolicy = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceProjectsRegionsClustersGetiampolicy]
  }
  
  extension [Self <: ParamsResourceProjectsRegionsClustersGetiampolicy](x: Self) {
    
    inline def setOptionsDotrequestedPolicyVersion(value: Double): Self = StObject.set(x, "options.requestedPolicyVersion", value.asInstanceOf[js.Any])
    
    inline def setOptionsDotrequestedPolicyVersionUndefined: Self = StObject.set(x, "options.requestedPolicyVersion", js.undefined)
    
    inline def setResource(value: String): Self = StObject.set(x, "resource", value.asInstanceOf[js.Any])
    
    inline def setResourceUndefined: Self = StObject.set(x, "resource", js.undefined)
  }
}
