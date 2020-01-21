package typings.googleapis.tagmanagerV2Mod.tagmanagerV2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A list of workspaces in a container.
  */
@js.native
trait SchemaListWorkspacesResponse extends js.Object {
  /**
    * Continuation token for fetching the next page of results.
    */
  var nextPageToken: js.UndefOr[String] = js.native
  /**
    * All Workspaces of a GTM Container.
    */
  var workspace: js.UndefOr[js.Array[SchemaWorkspace]] = js.native
}

object SchemaListWorkspacesResponse {
  @scala.inline
  def apply(nextPageToken: String = null, workspace: js.Array[SchemaWorkspace] = null): SchemaListWorkspacesResponse = {
    val __obj = js.Dynamic.literal()
    if (nextPageToken != null) __obj.updateDynamic("nextPageToken")(nextPageToken.asInstanceOf[js.Any])
    if (workspace != null) __obj.updateDynamic("workspace")(workspace.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaListWorkspacesResponse]
  }
}

