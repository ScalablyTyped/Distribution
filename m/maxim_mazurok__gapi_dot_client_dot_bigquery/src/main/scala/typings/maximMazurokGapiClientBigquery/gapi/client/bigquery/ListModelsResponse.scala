package typings.maximMazurokGapiClientBigquery.gapi.client.bigquery

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListModelsResponse extends StObject {
  
  /** Models in the requested dataset. Only the following fields are populated: model_reference, model_type, creation_time, last_modified_time and labels. */
  var models: js.UndefOr[js.Array[Model]] = js.undefined
  
  /** A token to request the next page of results. */
  var nextPageToken: js.UndefOr[String] = js.undefined
}
object ListModelsResponse {
  
  inline def apply(): ListModelsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListModelsResponse]
  }
  
  extension [Self <: ListModelsResponse](x: Self) {
    
    inline def setModels(value: js.Array[Model]): Self = StObject.set(x, "models", value.asInstanceOf[js.Any])
    
    inline def setModelsUndefined: Self = StObject.set(x, "models", js.undefined)
    
    inline def setModelsVarargs(value: Model*): Self = StObject.set(x, "models", js.Array(value*))
    
    inline def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    inline def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
  }
}
