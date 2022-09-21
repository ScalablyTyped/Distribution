package typings.googleapis.visionV1p1beta1Mod.visionV1p1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaBatchAnnotateFilesResponse extends StObject {
  
  /**
    * The list of file annotation responses, each response corresponding to each AnnotateFileRequest in BatchAnnotateFilesRequest.
    */
  var responses: js.UndefOr[js.Array[SchemaAnnotateFileResponse]] = js.undefined
}
object SchemaBatchAnnotateFilesResponse {
  
  inline def apply(): SchemaBatchAnnotateFilesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaBatchAnnotateFilesResponse]
  }
  
  extension [Self <: SchemaBatchAnnotateFilesResponse](x: Self) {
    
    inline def setResponses(value: js.Array[SchemaAnnotateFileResponse]): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
    
    inline def setResponsesUndefined: Self = StObject.set(x, "responses", js.undefined)
    
    inline def setResponsesVarargs(value: SchemaAnnotateFileResponse*): Self = StObject.set(x, "responses", js.Array(value*))
  }
}
