package typings.googleapis.retailV2alphaMod.retailV2alpha

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceProjectsLocationsCatalogsModelsCreate
  extends StObject
     with StandardParameters {
  
  /**
    * Optional. Whether to run a dry run to validate the request (without actually creating the model).
    */
  var dryRun: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Required. The parent resource under which to create the model. Format: projects/{project_number\}/locations/{location_id\}/catalogs/{catalog_id\}
    */
  var parent: js.UndefOr[String] = js.undefined
  
  /**
    * Request body metadata
    */
  var requestBody: js.UndefOr[SchemaGoogleCloudRetailV2alphaModel] = js.undefined
}
object ParamsResourceProjectsLocationsCatalogsModelsCreate {
  
  inline def apply(): ParamsResourceProjectsLocationsCatalogsModelsCreate = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceProjectsLocationsCatalogsModelsCreate]
  }
  
  extension [Self <: ParamsResourceProjectsLocationsCatalogsModelsCreate](x: Self) {
    
    inline def setDryRun(value: Boolean): Self = StObject.set(x, "dryRun", value.asInstanceOf[js.Any])
    
    inline def setDryRunUndefined: Self = StObject.set(x, "dryRun", js.undefined)
    
    inline def setParent(value: String): Self = StObject.set(x, "parent", value.asInstanceOf[js.Any])
    
    inline def setParentUndefined: Self = StObject.set(x, "parent", js.undefined)
    
    inline def setRequestBody(value: SchemaGoogleCloudRetailV2alphaModel): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setRequestBodyUndefined: Self = StObject.set(x, "requestBody", js.undefined)
  }
}
