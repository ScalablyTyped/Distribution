package typings.googleapis.servicenetworkingV1Mod.servicenetworkingV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceServicesRolesAdd
  extends StObject
     with StandardParameters {
  
  /**
    * Required. This is in a form services/{service\} where {service\} is the name of the private access management service. For example 'service-peering.example.com'.
    */
  var parent: js.UndefOr[String] = js.undefined
  
  /**
    * Request body metadata
    */
  var requestBody: js.UndefOr[SchemaAddRolesRequest] = js.undefined
}
object ParamsResourceServicesRolesAdd {
  
  inline def apply(): ParamsResourceServicesRolesAdd = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceServicesRolesAdd]
  }
  
  extension [Self <: ParamsResourceServicesRolesAdd](x: Self) {
    
    inline def setParent(value: String): Self = StObject.set(x, "parent", value.asInstanceOf[js.Any])
    
    inline def setParentUndefined: Self = StObject.set(x, "parent", js.undefined)
    
    inline def setRequestBody(value: SchemaAddRolesRequest): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setRequestBodyUndefined: Self = StObject.set(x, "requestBody", js.undefined)
  }
}
