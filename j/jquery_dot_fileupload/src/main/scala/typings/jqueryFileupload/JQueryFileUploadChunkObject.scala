package typings.jqueryFileupload

import org.scalablytyped.runtime.StringDictionary
import typings.jquery.JQueryXHR
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait JQueryFileUploadChunkObject
  extends StObject
     with JQueryFileInputOptions
     with JQueryFileUploadXhr {
  
  var blob: js.Any
  
  var chunkSize: Double
  
  var contentRange: String
}
object JQueryFileUploadChunkObject {
  
  inline def apply(
    blob: js.Any,
    chunkSize: Double,
    contentRange: String,
    errorThrown: js.Any,
    headers: StringDictionary[js.Any],
    jqXHR: JQueryXHR,
    result: js.Any,
    textStatus: String
  ): JQueryFileUploadChunkObject = {
    val __obj = js.Dynamic.literal(blob = blob.asInstanceOf[js.Any], chunkSize = chunkSize.asInstanceOf[js.Any], contentRange = contentRange.asInstanceOf[js.Any], errorThrown = errorThrown.asInstanceOf[js.Any], headers = headers.asInstanceOf[js.Any], jqXHR = jqXHR.asInstanceOf[js.Any], result = result.asInstanceOf[js.Any], textStatus = textStatus.asInstanceOf[js.Any])
    __obj.asInstanceOf[JQueryFileUploadChunkObject]
  }
  
  extension [Self <: JQueryFileUploadChunkObject](x: Self) {
    
    inline def setBlob(value: js.Any): Self = StObject.set(x, "blob", value.asInstanceOf[js.Any])
    
    inline def setChunkSize(value: Double): Self = StObject.set(x, "chunkSize", value.asInstanceOf[js.Any])
    
    inline def setContentRange(value: String): Self = StObject.set(x, "contentRange", value.asInstanceOf[js.Any])
  }
}
