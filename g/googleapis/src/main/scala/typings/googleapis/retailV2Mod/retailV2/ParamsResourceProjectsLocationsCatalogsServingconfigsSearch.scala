package typings.googleapis.retailV2Mod.retailV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceProjectsLocationsCatalogsServingconfigsSearch
  extends StObject
     with StandardParameters {
  
  /**
    * Required. The resource name of the Retail Search serving config, such as `projects/x/locations/global/catalogs/default_catalog/servingConfigs/default_serving_config` or the name of the legacy placement resource, such as `projects/x/locations/global/catalogs/default_catalog/placements/default_search`. This field is used to identify the serving configuration name and the set of models that will be used to make the search.
    */
  var placement: js.UndefOr[String] = js.undefined
  
  /**
    * Request body metadata
    */
  var requestBody: js.UndefOr[SchemaGoogleCloudRetailV2SearchRequest] = js.undefined
}
object ParamsResourceProjectsLocationsCatalogsServingconfigsSearch {
  
  inline def apply(): ParamsResourceProjectsLocationsCatalogsServingconfigsSearch = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceProjectsLocationsCatalogsServingconfigsSearch]
  }
  
  extension [Self <: ParamsResourceProjectsLocationsCatalogsServingconfigsSearch](x: Self) {
    
    inline def setPlacement(value: String): Self = StObject.set(x, "placement", value.asInstanceOf[js.Any])
    
    inline def setPlacementUndefined: Self = StObject.set(x, "placement", js.undefined)
    
    inline def setRequestBody(value: SchemaGoogleCloudRetailV2SearchRequest): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setRequestBodyUndefined: Self = StObject.set(x, "requestBody", js.undefined)
  }
}
