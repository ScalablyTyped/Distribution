package typings.maximMazurokGapiClientCompute.gapi.client.compute

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FileContentBuffer extends StObject {
  
  /** The raw content in the secure keys file. */
  var content: js.UndefOr[String] = js.native
  
  /** The file type of source file. */
  var fileType: js.UndefOr[String] = js.native
}
object FileContentBuffer {
  
  @scala.inline
  def apply(): FileContentBuffer = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FileContentBuffer]
  }
  
  @scala.inline
  implicit class FileContentBufferMutableBuilder[Self <: FileContentBuffer] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setContent(value: String): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContentUndefined: Self = StObject.set(x, "content", js.undefined)
    
    @scala.inline
    def setFileType(value: String): Self = StObject.set(x, "fileType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFileTypeUndefined: Self = StObject.set(x, "fileType", js.undefined)
  }
}
