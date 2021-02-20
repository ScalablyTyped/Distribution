package typings.googleapis.visionV1Mod.visionV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Response to a batch image annotation request.
  */
@js.native
trait SchemaBatchAnnotateImagesResponse extends StObject {
  
  /**
    * Individual responses to image annotation requests within the batch.
    */
  var responses: js.UndefOr[js.Array[SchemaAnnotateImageResponse]] = js.native
}
object SchemaBatchAnnotateImagesResponse {
  
  @scala.inline
  def apply(): SchemaBatchAnnotateImagesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaBatchAnnotateImagesResponse]
  }
  
  @scala.inline
  implicit class SchemaBatchAnnotateImagesResponseMutableBuilder[Self <: SchemaBatchAnnotateImagesResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setResponses(value: js.Array[SchemaAnnotateImageResponse]): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponsesUndefined: Self = StObject.set(x, "responses", js.undefined)
    
    @scala.inline
    def setResponsesVarargs(value: SchemaAnnotateImageResponse*): Self = StObject.set(x, "responses", js.Array(value :_*))
  }
}
