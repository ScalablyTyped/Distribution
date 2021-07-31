package typings.googleapis.visionV1p1beta1Mod.visionV1p1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A list of file annotation responses.
  */
trait SchemaGoogleCloudVisionV1p4beta1BatchAnnotateFilesResponse extends StObject {
  
  /**
    * The list of file annotation responses, each response corresponding to
    * each AnnotateFileRequest in BatchAnnotateFilesRequest.
    */
  var responses: js.UndefOr[js.Array[SchemaGoogleCloudVisionV1p4beta1AnnotateFileResponse]] = js.undefined
}
object SchemaGoogleCloudVisionV1p4beta1BatchAnnotateFilesResponse {
  
  @scala.inline
  def apply(): SchemaGoogleCloudVisionV1p4beta1BatchAnnotateFilesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudVisionV1p4beta1BatchAnnotateFilesResponse]
  }
  
  @scala.inline
  implicit class SchemaGoogleCloudVisionV1p4beta1BatchAnnotateFilesResponseMutableBuilder[Self <: SchemaGoogleCloudVisionV1p4beta1BatchAnnotateFilesResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setResponses(value: js.Array[SchemaGoogleCloudVisionV1p4beta1AnnotateFileResponse]): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponsesUndefined: Self = StObject.set(x, "responses", js.undefined)
    
    @scala.inline
    def setResponsesVarargs(value: SchemaGoogleCloudVisionV1p4beta1AnnotateFileResponse*): Self = StObject.set(x, "responses", js.Array(value :_*))
  }
}
