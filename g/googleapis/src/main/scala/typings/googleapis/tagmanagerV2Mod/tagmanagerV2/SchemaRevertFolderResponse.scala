package typings.googleapis.tagmanagerV2Mod.tagmanagerV2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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
  def apply(folder: SchemaFolder = null): SchemaRevertFolderResponse = {
    val __obj = js.Dynamic.literal()
    if (folder != null) __obj.updateDynamic("folder")(folder.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaRevertFolderResponse]
  }
}

