package typings.googleapis.networkservicesV1Mod.networkservicesV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceProjectsLocationsEndpointpoliciesGet
  extends StObject
     with StandardParameters {
  
  /**
    * Required. A name of the EndpointPolicy to get. Must be in the format `projects/x/locations/global/endpointPolicies/x`.
    */
  var name: js.UndefOr[String] = js.undefined
}
object ParamsResourceProjectsLocationsEndpointpoliciesGet {
  
  inline def apply(): ParamsResourceProjectsLocationsEndpointpoliciesGet = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceProjectsLocationsEndpointpoliciesGet]
  }
  
  extension [Self <: ParamsResourceProjectsLocationsEndpointpoliciesGet](x: Self) {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
