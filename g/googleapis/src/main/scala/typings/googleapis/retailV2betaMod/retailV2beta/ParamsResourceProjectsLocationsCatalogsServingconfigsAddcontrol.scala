package typings.googleapis.retailV2betaMod.retailV2beta

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceProjectsLocationsCatalogsServingconfigsAddcontrol
  extends StObject
     with StandardParameters {
  
  /**
    * Request body metadata
    */
  var requestBody: js.UndefOr[SchemaGoogleCloudRetailV2betaAddControlRequest] = js.undefined
  
  /**
    * Required. The source ServingConfig resource name . Format: projects/{project_number\}/locations/{location_id\}/catalogs/{catalog_id\}/servingConfigs/{serving_config_id\}
    */
  var servingConfig: js.UndefOr[String] = js.undefined
}
object ParamsResourceProjectsLocationsCatalogsServingconfigsAddcontrol {
  
  inline def apply(): ParamsResourceProjectsLocationsCatalogsServingconfigsAddcontrol = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceProjectsLocationsCatalogsServingconfigsAddcontrol]
  }
  
  extension [Self <: ParamsResourceProjectsLocationsCatalogsServingconfigsAddcontrol](x: Self) {
    
    inline def setRequestBody(value: SchemaGoogleCloudRetailV2betaAddControlRequest): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setRequestBodyUndefined: Self = StObject.set(x, "requestBody", js.undefined)
    
    inline def setServingConfig(value: String): Self = StObject.set(x, "servingConfig", value.asInstanceOf[js.Any])
    
    inline def setServingConfigUndefined: Self = StObject.set(x, "servingConfig", js.undefined)
  }
}
