package typings.igniteUi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FileExtensionsValidatingEventUIParam extends js.Object {
  
  /**
    * Gets the file extension.
    */
  var fileExtension: js.UndefOr[String] = js.native
  
  /**
    * Gets the full file name.
    */
  var fileName: js.UndefOr[String] = js.native
  
  /**
    * Gets the the igUpload widget object.
    */
  var owner: js.UndefOr[js.Any] = js.native
}
object FileExtensionsValidatingEventUIParam {
  
  @scala.inline
  def apply(): FileExtensionsValidatingEventUIParam = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FileExtensionsValidatingEventUIParam]
  }
  
  @scala.inline
  implicit class FileExtensionsValidatingEventUIParamOps[Self <: FileExtensionsValidatingEventUIParam] (val x: Self) extends AnyVal {
    
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
    def setFileExtension(value: String): Self = this.set("fileExtension", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFileExtension: Self = this.set("fileExtension", js.undefined)
    
    @scala.inline
    def setFileName(value: String): Self = this.set("fileName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFileName: Self = this.set("fileName", js.undefined)
    
    @scala.inline
    def setOwner(value: js.Any): Self = this.set("owner", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOwner: Self = this.set("owner", js.undefined)
  }
}
