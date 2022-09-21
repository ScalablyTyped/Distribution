package typings.googleapis.dataplexV1Mod.dataplexV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceProjectsLocationsLakesCreate
  extends StObject
     with StandardParameters {
  
  /**
    * Required. Lake identifier. This ID will be used to generate names such as database and dataset names when publishing metadata to Hive Metastore and BigQuery. * Must contain only lowercase letters, numbers and hyphens. * Must start with a letter. * Must end with a number or a letter. * Must be between 1-63 characters. * Must be unique within the customer project / location.
    */
  var lakeId: js.UndefOr[String] = js.undefined
  
  /**
    * Required. The resource name of the lake location, of the form: projects/{project_number\}/locations/{location_id\} where location_id refers to a GCP region.
    */
  var parent: js.UndefOr[String] = js.undefined
  
  /**
    * Request body metadata
    */
  var requestBody: js.UndefOr[SchemaGoogleCloudDataplexV1Lake] = js.undefined
  
  /**
    * Optional. Only validate the request, but do not perform mutations. The default is false.
    */
  var validateOnly: js.UndefOr[Boolean] = js.undefined
}
object ParamsResourceProjectsLocationsLakesCreate {
  
  inline def apply(): ParamsResourceProjectsLocationsLakesCreate = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceProjectsLocationsLakesCreate]
  }
  
  extension [Self <: ParamsResourceProjectsLocationsLakesCreate](x: Self) {
    
    inline def setLakeId(value: String): Self = StObject.set(x, "lakeId", value.asInstanceOf[js.Any])
    
    inline def setLakeIdUndefined: Self = StObject.set(x, "lakeId", js.undefined)
    
    inline def setParent(value: String): Self = StObject.set(x, "parent", value.asInstanceOf[js.Any])
    
    inline def setParentUndefined: Self = StObject.set(x, "parent", js.undefined)
    
    inline def setRequestBody(value: SchemaGoogleCloudDataplexV1Lake): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setRequestBodyUndefined: Self = StObject.set(x, "requestBody", js.undefined)
    
    inline def setValidateOnly(value: Boolean): Self = StObject.set(x, "validateOnly", value.asInstanceOf[js.Any])
    
    inline def setValidateOnlyUndefined: Self = StObject.set(x, "validateOnly", js.undefined)
  }
}
