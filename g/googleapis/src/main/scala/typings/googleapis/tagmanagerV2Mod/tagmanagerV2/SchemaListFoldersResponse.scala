package typings.googleapis.tagmanagerV2Mod.tagmanagerV2

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
  var folder: js.UndefOr[js.Array[SchemaFolder]] = js.native
  /**
    * Continuation token for fetching the next page of results.
    */
  var nextPageToken: js.UndefOr[String] = js.native
}

object SchemaListFoldersResponse {
  @scala.inline
  def apply(folder: js.Array[SchemaFolder] = null, nextPageToken: String = null): SchemaListFoldersResponse = {
    val __obj = js.Dynamic.literal()
    if (folder != null) __obj.updateDynamic("folder")(folder.asInstanceOf[js.Any])
    if (nextPageToken != null) __obj.updateDynamic("nextPageToken")(nextPageToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaListFoldersResponse]
  }
}

