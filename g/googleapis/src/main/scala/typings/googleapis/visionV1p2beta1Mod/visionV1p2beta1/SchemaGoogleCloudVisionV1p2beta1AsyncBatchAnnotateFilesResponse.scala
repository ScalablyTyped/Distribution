package typings.googleapis.visionV1p2beta1Mod.visionV1p2beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Response to an async batch file annotation request.
  */
trait SchemaGoogleCloudVisionV1p2beta1AsyncBatchAnnotateFilesResponse extends StObject {
  
  /**
    * The list of file annotation responses, one for each request in
    * AsyncBatchAnnotateFilesRequest.
    */
  var responses: js.UndefOr[js.Array[SchemaGoogleCloudVisionV1p2beta1AsyncAnnotateFileResponse]] = js.undefined
}
object SchemaGoogleCloudVisionV1p2beta1AsyncBatchAnnotateFilesResponse {
  
  inline def apply(): SchemaGoogleCloudVisionV1p2beta1AsyncBatchAnnotateFilesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudVisionV1p2beta1AsyncBatchAnnotateFilesResponse]
  }
  
  extension [Self <: SchemaGoogleCloudVisionV1p2beta1AsyncBatchAnnotateFilesResponse](x: Self) {
    
    inline def setResponses(value: js.Array[SchemaGoogleCloudVisionV1p2beta1AsyncAnnotateFileResponse]): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
    
    inline def setResponsesUndefined: Self = StObject.set(x, "responses", js.undefined)
    
    inline def setResponsesVarargs(value: SchemaGoogleCloudVisionV1p2beta1AsyncAnnotateFileResponse*): Self = StObject.set(x, "responses", js.Array(value :_*))
  }
}
