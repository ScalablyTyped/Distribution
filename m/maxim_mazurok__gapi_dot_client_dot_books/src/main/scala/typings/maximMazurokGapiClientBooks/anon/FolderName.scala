package typings.maximMazurokGapiClientBooks.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FolderName extends js.Object {
  
  var folderName: js.UndefOr[String] = js.native
  
  var isEnabled: js.UndefOr[Boolean] = js.native
}
object FolderName {
  
  @scala.inline
  def apply(): FolderName = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FolderName]
  }
  
  @scala.inline
  implicit class FolderNameOps[Self <: FolderName] (val x: Self) extends AnyVal {
    
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
    def setFolderName(value: String): Self = this.set("folderName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFolderName: Self = this.set("folderName", js.undefined)
    
    @scala.inline
    def setIsEnabled(value: Boolean): Self = this.set("isEnabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIsEnabled: Self = this.set("isEnabled", js.undefined)
  }
}
