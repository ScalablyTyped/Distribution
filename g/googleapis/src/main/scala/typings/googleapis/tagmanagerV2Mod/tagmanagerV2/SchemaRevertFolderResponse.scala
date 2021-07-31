package typings.googleapis.tagmanagerV2Mod.tagmanagerV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The result of reverting folder changes in a workspace.
  */
trait SchemaRevertFolderResponse extends StObject {
  
  /**
    * Folder as it appears in the latest container version since the last
    * workspace synchronization operation. If no folder is present, that means
    * the folder was deleted in the latest container version.
    */
  var folder: js.UndefOr[SchemaFolder] = js.undefined
}
object SchemaRevertFolderResponse {
  
  @scala.inline
  def apply(): SchemaRevertFolderResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaRevertFolderResponse]
  }
  
  @scala.inline
  implicit class SchemaRevertFolderResponseMutableBuilder[Self <: SchemaRevertFolderResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFolder(value: SchemaFolder): Self = StObject.set(x, "folder", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFolderUndefined: Self = StObject.set(x, "folder", js.undefined)
  }
}
