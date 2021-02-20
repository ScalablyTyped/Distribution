package typings.jqueryFileupload

import org.scalablytyped.runtime.StringDictionary
import typings.jquery.JQueryXHR
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait JQueryFileUploadChunkObject
  extends JQueryFileInputOptions
     with JQueryFileUploadXhr {
  
  var blob: js.Any = js.native
  
  var chunkSize: Double = js.native
  
  var contentRange: String = js.native
}
object JQueryFileUploadChunkObject {
  
  @scala.inline
  def apply(
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
  
  @scala.inline
  implicit class JQueryFileUploadChunkObjectMutableBuilder[Self <: JQueryFileUploadChunkObject] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBlob(value: js.Any): Self = StObject.set(x, "blob", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChunkSize(value: Double): Self = StObject.set(x, "chunkSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContentRange(value: String): Self = StObject.set(x, "contentRange", value.asInstanceOf[js.Any])
  }
}
