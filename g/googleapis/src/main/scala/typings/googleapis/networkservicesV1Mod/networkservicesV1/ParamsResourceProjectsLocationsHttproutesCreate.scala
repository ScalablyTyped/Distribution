package typings.googleapis.networkservicesV1Mod.networkservicesV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceProjectsLocationsHttproutesCreate
  extends StObject
     with StandardParameters {
  
  /**
    * Required. Short name of the HttpRoute resource to be created.
    */
  var httpRouteId: js.UndefOr[String] = js.undefined
  
  /**
    * Required. The parent resource of the HttpRoute. Must be in the format `projects/x/locations/global`.
    */
  var parent: js.UndefOr[String] = js.undefined
  
  /**
    * Request body metadata
    */
  var requestBody: js.UndefOr[SchemaHttpRoute] = js.undefined
}
object ParamsResourceProjectsLocationsHttproutesCreate {
  
  inline def apply(): ParamsResourceProjectsLocationsHttproutesCreate = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceProjectsLocationsHttproutesCreate]
  }
  
  extension [Self <: ParamsResourceProjectsLocationsHttproutesCreate](x: Self) {
    
    inline def setHttpRouteId(value: String): Self = StObject.set(x, "httpRouteId", value.asInstanceOf[js.Any])
    
    inline def setHttpRouteIdUndefined: Self = StObject.set(x, "httpRouteId", js.undefined)
    
    inline def setParent(value: String): Self = StObject.set(x, "parent", value.asInstanceOf[js.Any])
    
    inline def setParentUndefined: Self = StObject.set(x, "parent", js.undefined)
    
    inline def setRequestBody(value: SchemaHttpRoute): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setRequestBodyUndefined: Self = StObject.set(x, "requestBody", js.undefined)
  }
}
