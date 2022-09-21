package typings.googleapis.dataplexV1Mod.dataplexV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceProjectsLocationsLakesZonesCreate
  extends StObject
     with StandardParameters {
  
  /**
    * Required. The resource name of the parent lake: projects/{project_number\}/locations/{location_id\}/lakes/{lake_id\}.
    */
  var parent: js.UndefOr[String] = js.undefined
  
  /**
    * Request body metadata
    */
  var requestBody: js.UndefOr[SchemaGoogleCloudDataplexV1Zone] = js.undefined
  
  /**
    * Optional. Only validate the request, but do not perform mutations. The default is false.
    */
  var validateOnly: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Required. Zone identifier. This ID will be used to generate names such as database and dataset names when publishing metadata to Hive Metastore and BigQuery. * Must contain only lowercase letters, numbers and hyphens. * Must start with a letter. * Must end with a number or a letter. * Must be between 1-63 characters. * Must be unique across all lakes from all locations in a project. * Must not be one of the reserved IDs (i.e. "default", "global-temp")
    */
  var zoneId: js.UndefOr[String] = js.undefined
}
object ParamsResourceProjectsLocationsLakesZonesCreate {
  
  inline def apply(): ParamsResourceProjectsLocationsLakesZonesCreate = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceProjectsLocationsLakesZonesCreate]
  }
  
  extension [Self <: ParamsResourceProjectsLocationsLakesZonesCreate](x: Self) {
    
    inline def setParent(value: String): Self = StObject.set(x, "parent", value.asInstanceOf[js.Any])
    
    inline def setParentUndefined: Self = StObject.set(x, "parent", js.undefined)
    
    inline def setRequestBody(value: SchemaGoogleCloudDataplexV1Zone): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setRequestBodyUndefined: Self = StObject.set(x, "requestBody", js.undefined)
    
    inline def setValidateOnly(value: Boolean): Self = StObject.set(x, "validateOnly", value.asInstanceOf[js.Any])
    
    inline def setValidateOnlyUndefined: Self = StObject.set(x, "validateOnly", js.undefined)
    
    inline def setZoneId(value: String): Self = StObject.set(x, "zoneId", value.asInstanceOf[js.Any])
    
    inline def setZoneIdUndefined: Self = StObject.set(x, "zoneId", js.undefined)
  }
}
