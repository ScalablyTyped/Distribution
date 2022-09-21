package typings.googleapis.retailV2alphaMod.retailV2alpha

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceProjectsLocationsCatalogsServingconfigsCreate
  extends StObject
     with StandardParameters {
  
  /**
    * Required. Full resource name of parent. Format: `projects/{project_number\}/locations/{location_id\}/catalogs/{catalog_id\}`
    */
  var parent: js.UndefOr[String] = js.undefined
  
  /**
    * Request body metadata
    */
  var requestBody: js.UndefOr[SchemaGoogleCloudRetailV2alphaServingConfig] = js.undefined
  
  /**
    * Required. The ID to use for the ServingConfig, which will become the final component of the ServingConfig's resource name. This value should be 4-63 characters, and valid characters are /a-z-_/.
    */
  var servingConfigId: js.UndefOr[String] = js.undefined
}
object ParamsResourceProjectsLocationsCatalogsServingconfigsCreate {
  
  inline def apply(): ParamsResourceProjectsLocationsCatalogsServingconfigsCreate = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceProjectsLocationsCatalogsServingconfigsCreate]
  }
  
  extension [Self <: ParamsResourceProjectsLocationsCatalogsServingconfigsCreate](x: Self) {
    
    inline def setParent(value: String): Self = StObject.set(x, "parent", value.asInstanceOf[js.Any])
    
    inline def setParentUndefined: Self = StObject.set(x, "parent", js.undefined)
    
    inline def setRequestBody(value: SchemaGoogleCloudRetailV2alphaServingConfig): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setRequestBodyUndefined: Self = StObject.set(x, "requestBody", js.undefined)
    
    inline def setServingConfigId(value: String): Self = StObject.set(x, "servingConfigId", value.asInstanceOf[js.Any])
    
    inline def setServingConfigIdUndefined: Self = StObject.set(x, "servingConfigId", js.undefined)
  }
}
