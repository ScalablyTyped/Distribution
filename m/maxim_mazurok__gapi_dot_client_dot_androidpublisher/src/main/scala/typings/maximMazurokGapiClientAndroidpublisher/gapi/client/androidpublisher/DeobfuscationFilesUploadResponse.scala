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
  
  extension [Self <: DeobfuscationFilesUploadResponse](x: Self) {
    
    inline def setDeobfuscationFile(value: DeobfuscationFile): Self = StObject.set(x, "deobfuscationFile", value.asInstanceOf[js.Any])
    
    inline def setDeobfuscationFileUndefined: Self = StObject.set(x, "deobfuscationFile", js.undefined)
  }
}
