package typings.googleapis.tagmanagerV2Mod.tagmanagerV2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The changes that have occurred in the workspace since the base container
  * version.
  */
@js.native
trait SchemaGetWorkspaceStatusResponse extends js.Object {
  /**
    * The merge conflict after sync.
    */
  var mergeConflict: js.UndefOr[js.Array[SchemaMergeConflict]] = js.native
  /**
    * Entities that have been changed in the workspace.
    */
  var workspaceChange: js.UndefOr[js.Array[SchemaEntity]] = js.native
}

object SchemaGetWorkspaceStatusResponse {
  @scala.inline
  def apply(
    mergeConflict: js.Array[SchemaMergeConflict] = null,
    workspaceChange: js.Array[SchemaEntity] = null
  ): SchemaGetWorkspaceStatusResponse = {
    val __obj = js.Dynamic.literal()
    if (mergeConflict != null) __obj.updateDynamic("mergeConflict")(mergeConflict.asInstanceOf[js.Any])
    if (workspaceChange != null) __obj.updateDynamic("workspaceChange")(workspaceChange.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaGetWorkspaceStatusResponse]
  }
}

