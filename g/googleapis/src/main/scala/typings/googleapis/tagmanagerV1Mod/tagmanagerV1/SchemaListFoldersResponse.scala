package typings.googleapis.tagmanagerV1Mod.tagmanagerV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * List Folders Response.
  */
@js.native
trait SchemaListFoldersResponse extends js.Object {
  /**
    * All GTM Folders of a GTM Container.
    */
  var folders: js.UndefOr[js.Array[SchemaFolder]] = js.native
}

object SchemaListFoldersResponse {
  @scala.inline
  def apply(folders: js.Array[SchemaFolder] = null): SchemaListFoldersResponse = {
    val __obj = js.Dynamic.literal()
    if (folders != null) __obj.updateDynamic("folders")(folders.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaListFoldersResponse]
  }
}

