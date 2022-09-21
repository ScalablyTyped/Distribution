package typings.googleapis.dataplexV1Mod.dataplexV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceProjectsLocationsLakesZonesAssetsPatch
  extends StObject
     with StandardParameters {
  
  /**
    * Output only. The relative resource name of the asset, of the form: projects/{project_number\}/locations/{location_id\}/lakes/{lake_id\}/zones/{zone_id\}/assets/{asset_id\}.
    */
  var name: js.UndefOr[String] = js.undefined
  
  /**
    * Request body metadata
    */
  var requestBody: js.UndefOr[SchemaGoogleCloudDataplexV1Asset] = js.undefined
  
  /**
    * Required. Mask of fields to update.
    */
  var updateMask: js.UndefOr[String] = js.undefined
  
  /**
    * Optional. Only validate the request, but do not perform mutations. The default is false.
    */
  var validateOnly: js.UndefOr[Boolean] = js.undefined
}
object ParamsResourceProjectsLocationsLakesZonesAssetsPatch {
  
  inline def apply(): ParamsResourceProjectsLocationsLakesZonesAssetsPatch = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceProjectsLocationsLakesZonesAssetsPatch]
  }
  
  extension [Self <: ParamsResourceProjectsLocationsLakesZonesAssetsPatch](x: Self) {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setRequestBody(value: SchemaGoogleCloudDataplexV1Asset): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setRequestBodyUndefined: Self = StObject.set(x, "requestBody", js.undefined)
    
    inline def setUpdateMask(value: String): Self = StObject.set(x, "updateMask", value.asInstanceOf[js.Any])
    
    inline def setUpdateMaskUndefined: Self = StObject.set(x, "updateMask", js.undefined)
    
    inline def setValidateOnly(value: Boolean): Self = StObject.set(x, "validateOnly", value.asInstanceOf[js.Any])
    
    inline def setValidateOnlyUndefined: Self = StObject.set(x, "validateOnly", js.undefined)
  }
}
