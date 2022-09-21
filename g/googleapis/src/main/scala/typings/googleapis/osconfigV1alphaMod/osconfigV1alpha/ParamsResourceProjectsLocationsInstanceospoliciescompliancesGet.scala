package typings.googleapis.osconfigV1alphaMod.osconfigV1alpha

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceProjectsLocationsInstanceospoliciescompliancesGet
  extends StObject
     with StandardParameters {
  
  /**
    * Required. API resource name for instance OS policies compliance resource. Format: `projects/{project\}/locations/{location\}/instanceOSPoliciesCompliances/{instance\}` For `{project\}`, either Compute Engine project-number or project-id can be provided. For `{instance\}`, either Compute Engine VM instance-id or instance-name can be provided.
    */
  var name: js.UndefOr[String] = js.undefined
}
object ParamsResourceProjectsLocationsInstanceospoliciescompliancesGet {
  
  inline def apply(): ParamsResourceProjectsLocationsInstanceospoliciescompliancesGet = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceProjectsLocationsInstanceospoliciescompliancesGet]
  }
  
  extension [Self <: ParamsResourceProjectsLocationsInstanceospoliciescompliancesGet](x: Self) {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
