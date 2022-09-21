package typings.googleapis.retailV2alphaMod.retailV2alpha

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudRetailV2alphaListModelsResponse extends StObject {
  
  /**
    * List of Models.
    */
  var models: js.UndefOr[js.Array[SchemaGoogleCloudRetailV2alphaModel]] = js.undefined
  
  /**
    * Pagination token, if not returned indicates the last page.
    */
  var nextPageToken: js.UndefOr[String | Null] = js.undefined
}
object SchemaGoogleCloudRetailV2alphaListModelsResponse {
  
  inline def apply(): SchemaGoogleCloudRetailV2alphaListModelsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudRetailV2alphaListModelsResponse]
  }
  
  extension [Self <: SchemaGoogleCloudRetailV2alphaListModelsResponse](x: Self) {
    
    inline def setModels(value: js.Array[SchemaGoogleCloudRetailV2alphaModel]): Self = StObject.set(x, "models", value.asInstanceOf[js.Any])
    
    inline def setModelsUndefined: Self = StObject.set(x, "models", js.undefined)
    
    inline def setModelsVarargs(value: SchemaGoogleCloudRetailV2alphaModel*): Self = StObject.set(x, "models", js.Array(value*))
    
    inline def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    inline def setNextPageTokenNull: Self = StObject.set(x, "nextPageToken", null)
    
    inline def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
  }
}
