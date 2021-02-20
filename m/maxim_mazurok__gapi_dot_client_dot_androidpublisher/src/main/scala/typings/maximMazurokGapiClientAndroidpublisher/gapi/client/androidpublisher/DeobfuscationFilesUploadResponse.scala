package typings.maximMazurokGapiClientAndroidpublisher.gapi.client.androidpublisher

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DeobfuscationFilesUploadResponse extends StObject {
  
  /** The uploaded Deobfuscation File configuration. */
  var deobfuscationFile: js.UndefOr[DeobfuscationFile] = js.native
}
object DeobfuscationFilesUploadResponse {
  
  @scala.inline
  def apply(): DeobfuscationFilesUploadResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeobfuscationFilesUploadResponse]
  }
  
  @scala.inline
  implicit class DeobfuscationFilesUploadResponseMutableBuilder[Self <: DeobfuscationFilesUploadResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDeobfuscationFile(value: DeobfuscationFile): Self = StObject.set(x, "deobfuscationFile", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeobfuscationFileUndefined: Self = StObject.set(x, "deobfuscationFile", js.undefined)
  }
}
