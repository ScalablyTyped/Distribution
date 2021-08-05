package typings.googleapis.mlV1Mod.mlV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Response message for the ListModels method.
  */
trait SchemaGoogleCloudMlV1ListModelsResponse extends StObject {
  
  /**
    * The list of models.
    */
  var models: js.UndefOr[js.Array[SchemaGoogleCloudMlV1Model]] = js.undefined
  
  /**
    * Optional. Pass this token as the `page_token` field of the request for a
    * subsequent call.
    */
  var nextPageToken: js.UndefOr[String] = js.undefined
}
object SchemaGoogleCloudMlV1ListModelsResponse {
  
  inline def apply(): SchemaGoogleCloudMlV1ListModelsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudMlV1ListModelsResponse]
  }
  
  extension [Self <: SchemaGoogleCloudMlV1ListModelsResponse](x: Self) {
    
    inline def setModels(value: js.Array[SchemaGoogleCloudMlV1Model]): Self = StObject.set(x, "models", value.asInstanceOf[js.Any])
    
    inline def setModelsUndefined: Self = StObject.set(x, "models", js.undefined)
    
    inline def setModelsVarargs(value: SchemaGoogleCloudMlV1Model*): Self = StObject.set(x, "models", js.Array(value :_*))
    
    inline def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    inline def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
  }
}
