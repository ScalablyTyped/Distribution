package typings.googleapis.visionV1Mod.visionV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudVisionV1p4beta1BatchAnnotateFilesResponse extends StObject {
  
  /**
    * The list of file annotation responses, each response corresponding to each AnnotateFileRequest in BatchAnnotateFilesRequest.
    */
  var responses: js.UndefOr[js.Array[SchemaGoogleCloudVisionV1p4beta1AnnotateFileResponse]] = js.undefined
}
object SchemaGoogleCloudVisionV1p4beta1BatchAnnotateFilesResponse {
  
  inline def apply(): SchemaGoogleCloudVisionV1p4beta1BatchAnnotateFilesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudVisionV1p4beta1BatchAnnotateFilesResponse]
  }
  
  extension [Self <: SchemaGoogleCloudVisionV1p4beta1BatchAnnotateFilesResponse](x: Self) {
    
    inline def setResponses(value: js.Array[SchemaGoogleCloudVisionV1p4beta1AnnotateFileResponse]): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
    
    inline def setResponsesUndefined: Self = StObject.set(x, "responses", js.undefined)
    
    inline def setResponsesVarargs(value: SchemaGoogleCloudVisionV1p4beta1AnnotateFileResponse*): Self = StObject.set(x, "responses", js.Array(value*))
  }
}
