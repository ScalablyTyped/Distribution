package typings.maximMazurokGapiClientCompute.gapi.client.compute

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FileContentBuffer extends StObject {
  
  /** The raw content in the secure keys file. */
  var content: js.UndefOr[String] = js.undefined
  
  /** The file type of source file. */
  var fileType: js.UndefOr[String] = js.undefined
}
object FileContentBuffer {
  
  inline def apply(): FileContentBuffer = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FileContentBuffer]
  }
  
  extension [Self <: FileContentBuffer](x: Self) {
    
    inline def setContent(value: String): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
    
    inline def setContentUndefined: Self = StObject.set(x, "content", js.undefined)
    
    inline def setFileType(value: String): Self = StObject.set(x, "fileType", value.asInstanceOf[js.Any])
    
    inline def setFileTypeUndefined: Self = StObject.set(x, "fileType", js.undefined)
  }
}
