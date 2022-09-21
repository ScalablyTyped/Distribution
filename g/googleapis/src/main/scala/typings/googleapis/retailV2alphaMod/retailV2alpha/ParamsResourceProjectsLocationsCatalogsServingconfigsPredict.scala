package typings.googleapis.retailV2alphaMod.retailV2alpha

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceProjectsLocationsCatalogsServingconfigsPredict
  extends StObject
     with StandardParameters {
  
  /**
    * Required. Full resource name of the format: `{placement=projects/x/locations/global/catalogs/default_catalog/servingConfigs/x\}` or `{placement=projects/x/locations/global/catalogs/default_catalog/placements/x\}`. We recommend using the `servingConfigs` resource. `placements` is a legacy resource. The ID of the Recommendations AI serving config or placement. Before you can request predictions from your model, you must create at least one serving config or placement for it. For more information, see [Managing serving configurations] (https://cloud.google.com/retail/docs/manage-configs). The full list of available serving configs can be seen at https://console.cloud.google.com/ai/retail/catalogs/default_catalog/configs
    */
  var placement: js.UndefOr[String] = js.undefined
  
  /**
    * Request body metadata
    */
  var requestBody: js.UndefOr[SchemaGoogleCloudRetailV2alphaPredictRequest] = js.undefined
}
object ParamsResourceProjectsLocationsCatalogsServingconfigsPredict {
  
  inline def apply(): ParamsResourceProjectsLocationsCatalogsServingconfigsPredict = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceProjectsLocationsCatalogsServingconfigsPredict]
  }
  
  extension [Self <: ParamsResourceProjectsLocationsCatalogsServingconfigsPredict](x: Self) {
    
    inline def setPlacement(value: String): Self = StObject.set(x, "placement", value.asInstanceOf[js.Any])
    
    inline def setPlacementUndefined: Self = StObject.set(x, "placement", js.undefined)
    
    inline def setRequestBody(value: SchemaGoogleCloudRetailV2alphaPredictRequest): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setRequestBodyUndefined: Self = StObject.set(x, "requestBody", js.undefined)
  }
}
