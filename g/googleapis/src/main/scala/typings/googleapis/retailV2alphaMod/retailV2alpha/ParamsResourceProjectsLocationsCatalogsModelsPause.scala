package typings.googleapis.retailV2alphaMod.retailV2alpha

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceProjectsLocationsCatalogsModelsPause
  extends StObject
     with StandardParameters {
  
  /**
    * Required. The name of the model to pause. Format: projects/{project_number\}/locations/{location_id\}/catalogs/{catalog_id\}/models/{model_id\}
    */
  var name: js.UndefOr[String] = js.undefined
  
  /**
    * Request body metadata
    */
  var requestBody: js.UndefOr[SchemaGoogleCloudRetailV2alphaPauseModelRequest] = js.undefined
}
object ParamsResourceProjectsLocationsCatalogsModelsPause {
  
  inline def apply(): ParamsResourceProjectsLocationsCatalogsModelsPause = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceProjectsLocationsCatalogsModelsPause]
  }
  
  extension [Self <: ParamsResourceProjectsLocationsCatalogsModelsPause](x: Self) {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setRequestBody(value: SchemaGoogleCloudRetailV2alphaPauseModelRequest): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setRequestBodyUndefined: Self = StObject.set(x, "requestBody", js.undefined)
  }
}
