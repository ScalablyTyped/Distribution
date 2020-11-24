package typings.maximMazurokGapiClientAndroidpublisher.gapi.client.androidpublisher

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DeobfuscationFilesUploadResponse extends js.Object {
  
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
  implicit class DeobfuscationFilesUploadResponseOps[Self <: DeobfuscationFilesUploadResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setDeobfuscationFile(value: DeobfuscationFile): Self = this.set("deobfuscationFile", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDeobfuscationFile: Self = this.set("deobfuscationFile", js.undefined)
  }
}
