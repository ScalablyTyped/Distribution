package typings.kendoUi.kendo.ui

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EditorImageBrowserMessages extends js.Object {
  
  var deleteFile: js.UndefOr[String] = js.native
  
  var directoryNotFound: js.UndefOr[String] = js.native
  
  var emptyFolder: js.UndefOr[String] = js.native
  
  var invalidFileType: js.UndefOr[String] = js.native
  
  var orderBy: js.UndefOr[String] = js.native
  
  var orderByName: js.UndefOr[String] = js.native
  
  var orderBySize: js.UndefOr[String] = js.native
  
  var overwriteFile: js.UndefOr[String] = js.native
  
  var search: js.UndefOr[String] = js.native
  
  var uploadFile: js.UndefOr[String] = js.native
}
object EditorImageBrowserMessages {
  
  @scala.inline
  def apply(): EditorImageBrowserMessages = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EditorImageBrowserMessages]
  }
  
  @scala.inline
  implicit class EditorImageBrowserMessagesOps[Self <: EditorImageBrowserMessages] (val x: Self) extends AnyVal {
    
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
    def setDeleteFile(value: String): Self = this.set("deleteFile", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDeleteFile: Self = this.set("deleteFile", js.undefined)
    
    @scala.inline
    def setDirectoryNotFound(value: String): Self = this.set("directoryNotFound", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDirectoryNotFound: Self = this.set("directoryNotFound", js.undefined)
    
    @scala.inline
    def setEmptyFolder(value: String): Self = this.set("emptyFolder", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEmptyFolder: Self = this.set("emptyFolder", js.undefined)
    
    @scala.inline
    def setInvalidFileType(value: String): Self = this.set("invalidFileType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInvalidFileType: Self = this.set("invalidFileType", js.undefined)
    
    @scala.inline
    def setOrderBy(value: String): Self = this.set("orderBy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOrderBy: Self = this.set("orderBy", js.undefined)
    
    @scala.inline
    def setOrderByName(value: String): Self = this.set("orderByName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOrderByName: Self = this.set("orderByName", js.undefined)
    
    @scala.inline
    def setOrderBySize(value: String): Self = this.set("orderBySize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOrderBySize: Self = this.set("orderBySize", js.undefined)
    
    @scala.inline
    def setOverwriteFile(value: String): Self = this.set("overwriteFile", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOverwriteFile: Self = this.set("overwriteFile", js.undefined)
    
    @scala.inline
    def setSearch(value: String): Self = this.set("search", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSearch: Self = this.set("search", js.undefined)
    
    @scala.inline
    def setUploadFile(value: String): Self = this.set("uploadFile", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUploadFile: Self = this.set("uploadFile", js.undefined)
  }
}
