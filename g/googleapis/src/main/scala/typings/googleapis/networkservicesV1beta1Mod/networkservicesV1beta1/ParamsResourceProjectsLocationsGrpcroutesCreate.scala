package typings.googleapis.networkservicesV1beta1Mod.networkservicesV1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceProjectsLocationsGrpcroutesCreate
  extends StObject
     with StandardParameters {
  
  /**
    * Required. Short name of the GrpcRoute resource to be created.
    */
  var grpcRouteId: js.UndefOr[String] = js.undefined
  
  /**
    * Required. The parent resource of the GrpcRoute. Must be in the format `projects/x/locations/global`.
    */
  var parent: js.UndefOr[String] = js.undefined
  
  /**
    * Request body metadata
    */
  var requestBody: js.UndefOr[SchemaGrpcRoute] = js.undefined
}
object ParamsResourceProjectsLocationsGrpcroutesCreate {
  
  inline def apply(): ParamsResourceProjectsLocationsGrpcroutesCreate = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceProjectsLocationsGrpcroutesCreate]
  }
  
  extension [Self <: ParamsResourceProjectsLocationsGrpcroutesCreate](x: Self) {
    
    inline def setGrpcRouteId(value: String): Self = StObject.set(x, "grpcRouteId", value.asInstanceOf[js.Any])
    
    inline def setGrpcRouteIdUndefined: Self = StObject.set(x, "grpcRouteId", js.undefined)
    
    inline def setParent(value: String): Self = StObject.set(x, "parent", value.asInstanceOf[js.Any])
    
    inline def setParentUndefined: Self = StObject.set(x, "parent", js.undefined)
    
    inline def setRequestBody(value: SchemaGrpcRoute): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setRequestBodyUndefined: Self = StObject.set(x, "requestBody", js.undefined)
  }
}
