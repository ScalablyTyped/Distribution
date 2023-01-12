package typings.maximMazurokGapiClientAndroidpublisher.gapi.client.androidpublisher

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeobfuscationFilesUploadResponse extends StObject {
  
  /** The uploaded Deobfuscation File configuration. */
  var deobfuscationFile: js.UndefOr[DeobfuscationFile] = js.undefined
}
object DeobfuscationFilesUploadResponse {
  
  inline def apply(): DeobfuscationFilesUploadResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeobfuscationFilesUploadResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DeobfuscationFilesUploadResponse] (val x: Self) extends AnyVal {
    
    inline def setDeobfuscationFile(value: DeobfuscationFile): Self = StObject.set(x, "deobfuscationFile", value.asInstanceOf[js.Any])
    
    inline def setDeobfuscationFileUndefined: Self = StObject.set(x, "deobfuscationFile", js.undefined)
  }
}
