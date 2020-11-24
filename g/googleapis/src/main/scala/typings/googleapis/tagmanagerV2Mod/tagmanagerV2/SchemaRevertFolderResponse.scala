package typings.googleapis.tagmanagerV2Mod.tagmanagerV2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The result of reverting folder changes in a workspace.
  */
@js.native
trait SchemaRevertFolderResponse extends js.Object {
  
  /**
    * Folder as it appears in the latest container version since the last
    * workspace synchronization operation. If no folder is present, that means
    * the folder was deleted in the latest container version.
    */
  var folder: js.UndefOr[SchemaFolder] = js.native
}
object SchemaRevertFolderResponse {
  
  @scala.inline
  def apply(): SchemaRevertFolderResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaRevertFolderResponse]
  }
  
  @scala.inline
  implicit class SchemaRevertFolderResponseOps[Self <: SchemaRevertFolderResponse] (val x: Self) extends AnyVal {
    
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
    def setFolder(value: SchemaFolder): Self = this.set("folder", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFolder: Self = this.set("folder", js.undefined)
  }
}
