package typings.googleapis.servicedirectoryV1Mod.servicedirectoryV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceProjectsLocationsNamespacesServicesEndpointsCreate
  extends StObject
     with StandardParameters {
  
  /**
    * Required. The Resource ID must be 1-63 characters long, and comply with RFC1035. Specifically, the name must be 1-63 characters long and match the regular expression `[a-z](?:[-a-z0-9]{0,61\}[a-z0-9])?` which means the first character must be a lowercase letter, and all following characters must be a dash, lowercase letter, or digit, except the last character, which cannot be a dash.
    */
  var endpointId: js.UndefOr[String] = js.undefined
  
  /**
    * Required. The resource name of the service that this endpoint provides.
    */
  var parent: js.UndefOr[String] = js.undefined
  
  /**
    * Request body metadata
    */
  var requestBody: js.UndefOr[SchemaEndpoint] = js.undefined
}
object ParamsResourceProjectsLocationsNamespacesServicesEndpointsCreate {
  
  inline def apply(): ParamsResourceProjectsLocationsNamespacesServicesEndpointsCreate = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceProjectsLocationsNamespacesServicesEndpointsCreate]
  }
  
  extension [Self <: ParamsResourceProjectsLocationsNamespacesServicesEndpointsCreate](x: Self) {
    
    inline def setEndpointId(value: String): Self = StObject.set(x, "endpointId", value.asInstanceOf[js.Any])
    
    inline def setEndpointIdUndefined: Self = StObject.set(x, "endpointId", js.undefined)
    
    inline def setParent(value: String): Self = StObject.set(x, "parent", value.asInstanceOf[js.Any])
    
    inline def setParentUndefined: Self = StObject.set(x, "parent", js.undefined)
    
    inline def setRequestBody(value: SchemaEndpoint): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setRequestBodyUndefined: Self = StObject.set(x, "requestBody", js.undefined)
  }
}
