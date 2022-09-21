package typings.googleapis.networksecurityV1beta1Mod.networksecurityV1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceProjectsLocationsAuthorizationpoliciesDelete
  extends StObject
     with StandardParameters {
  
  /**
    * Required. A name of the AuthorizationPolicy to delete. Must be in the format `projects/{project\}/locations/{location\}/authorizationPolicies/x`.
    */
  var name: js.UndefOr[String] = js.undefined
}
object ParamsResourceProjectsLocationsAuthorizationpoliciesDelete {
  
  inline def apply(): ParamsResourceProjectsLocationsAuthorizationpoliciesDelete = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceProjectsLocationsAuthorizationpoliciesDelete]
  }
  
  extension [Self <: ParamsResourceProjectsLocationsAuthorizationpoliciesDelete](x: Self) {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
