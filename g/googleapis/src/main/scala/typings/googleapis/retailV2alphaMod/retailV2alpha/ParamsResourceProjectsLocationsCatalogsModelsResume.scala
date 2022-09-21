package typings.googleapis.retailV2alphaMod.retailV2alpha

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceProjectsLocationsCatalogsModelsResume
  extends StObject
     with StandardParameters {
  
  /**
    * Required. The name of the model to resume. Format: projects/{project_number\}/locations/{location_id\}/catalogs/{catalog_id\}/models/{model_id\}
    */
  var name: js.UndefOr[String] = js.undefined
  
  /**
    * Request body metadata
    */
  var requestBody: js.UndefOr[SchemaGoogleCloudRetailV2alphaResumeModelRequest] = js.undefined
}
object ParamsResourceProjectsLocationsCatalogsModelsResume {
  
  inline def apply(): ParamsResourceProjectsLocationsCatalogsModelsResume = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceProjectsLocationsCatalogsModelsResume]
  }
  
  extension [Self <: ParamsResourceProjectsLocationsCatalogsModelsResume](x: Self) {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setRequestBody(value: SchemaGoogleCloudRetailV2alphaResumeModelRequest): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setRequestBodyUndefined: Self = StObject.set(x, "requestBody", js.undefined)
  }
}
