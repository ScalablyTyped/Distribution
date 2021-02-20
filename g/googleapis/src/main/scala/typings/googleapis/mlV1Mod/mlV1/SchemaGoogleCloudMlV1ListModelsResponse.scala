package typings.googleapis.mlV1Mod.mlV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Response message for the ListModels method.
  */
@js.native
trait SchemaGoogleCloudMlV1ListModelsResponse extends StObject {
  
  /**
    * The list of models.
    */
  var models: js.UndefOr[js.Array[SchemaGoogleCloudMlV1Model]] = js.native
  
  /**
    * Optional. Pass this token as the `page_token` field of the request for a
    * subsequent call.
    */
  var nextPageToken: js.UndefOr[String] = js.native
}
object SchemaGoogleCloudMlV1ListModelsResponse {
  
  @scala.inline
  def apply(): SchemaGoogleCloudMlV1ListModelsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudMlV1ListModelsResponse]
  }
  
  @scala.inline
  implicit class SchemaGoogleCloudMlV1ListModelsResponseMutableBuilder[Self <: SchemaGoogleCloudMlV1ListModelsResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setModels(value: js.Array[SchemaGoogleCloudMlV1Model]): Self = StObject.set(x, "models", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setModelsUndefined: Self = StObject.set(x, "models", js.undefined)
    
    @scala.inline
    def setModelsVarargs(value: SchemaGoogleCloudMlV1Model*): Self = StObject.set(x, "models", js.Array(value :_*))
    
    @scala.inline
    def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
  }
}
