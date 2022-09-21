package typings.googleapis.servicedirectoryV1beta1Mod.servicedirectoryV1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceProjectsLocationsNamespacesServicesResolve
  extends StObject
     with StandardParameters {
  
  /**
    * Required. The name of the service to resolve.
    */
  var name: js.UndefOr[String] = js.undefined
  
  /**
    * Request body metadata
    */
  var requestBody: js.UndefOr[SchemaResolveServiceRequest] = js.undefined
}
object ParamsResourceProjectsLocationsNamespacesServicesResolve {
  
  inline def apply(): ParamsResourceProjectsLocationsNamespacesServicesResolve = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceProjectsLocationsNamespacesServicesResolve]
  }
  
  extension [Self <: ParamsResourceProjectsLocationsNamespacesServicesResolve](x: Self) {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setRequestBody(value: SchemaResolveServiceRequest): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setRequestBodyUndefined: Self = StObject.set(x, "requestBody", js.undefined)
  }
}
