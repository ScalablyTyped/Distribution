package typings.googleapis.metastoreV1alphaMod.metastoreV1alpha

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceProjectsLocationsServicesRestore
  extends StObject
     with StandardParameters {
  
  /**
    * Request body metadata
    */
  var requestBody: js.UndefOr[SchemaRestoreServiceRequest] = js.undefined
  
  /**
    * Required. The relative resource name of the metastore service to run restore, in the following form:projects/{project_id\}/locations/{location_id\}/services/{service_id\}.
    */
  var service: js.UndefOr[String] = js.undefined
}
object ParamsResourceProjectsLocationsServicesRestore {
  
  inline def apply(): ParamsResourceProjectsLocationsServicesRestore = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceProjectsLocationsServicesRestore]
  }
  
  extension [Self <: ParamsResourceProjectsLocationsServicesRestore](x: Self) {
    
    inline def setRequestBody(value: SchemaRestoreServiceRequest): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setRequestBodyUndefined: Self = StObject.set(x, "requestBody", js.undefined)
    
    inline def setService(value: String): Self = StObject.set(x, "service", value.asInstanceOf[js.Any])
    
    inline def setServiceUndefined: Self = StObject.set(x, "service", js.undefined)
  }
}
