package typings.googleapis.osconfigV1betaMod.osconfigV1beta

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceProjectsGuestpoliciesGet
  extends StObject
     with StandardParameters {
  
  /**
    * Required. The resource name of the guest policy using one of the following forms: `projects/{project_number\}/guestPolicies/{guest_policy_id\}`.
    */
  var name: js.UndefOr[String] = js.undefined
}
object ParamsResourceProjectsGuestpoliciesGet {
  
  inline def apply(): ParamsResourceProjectsGuestpoliciesGet = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceProjectsGuestpoliciesGet]
  }
  
  extension [Self <: ParamsResourceProjectsGuestpoliciesGet](x: Self) {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
