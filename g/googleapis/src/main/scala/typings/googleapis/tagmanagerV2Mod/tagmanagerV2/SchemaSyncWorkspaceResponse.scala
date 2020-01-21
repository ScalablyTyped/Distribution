package typings.googleapis.tagmanagerV2Mod.tagmanagerV2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A response after synchronizing the workspace to the latest container
  * version.
  */
@js.native
trait SchemaSyncWorkspaceResponse extends js.Object {
  /**
    * The merge conflict after sync. If this field is not empty, the sync is
    * still treated as successful. But a version cannot be created until all
    * conflicts are resolved.
    */
  var mergeConflict: js.UndefOr[js.Array[SchemaMergeConflict]] = js.native
  /**
    * Indicates whether synchronization caused a merge conflict or sync error.
    */
  var syncStatus: js.UndefOr[SchemaSyncStatus] = js.native
}

object SchemaSyncWorkspaceResponse {
  @scala.inline
  def apply(mergeConflict: js.Array[SchemaMergeConflict] = null, syncStatus: SchemaSyncStatus = null): SchemaSyncWorkspaceResponse = {
    val __obj = js.Dynamic.literal()
    if (mergeConflict != null) __obj.updateDynamic("mergeConflict")(mergeConflict.asInstanceOf[js.Any])
    if (syncStatus != null) __obj.updateDynamic("syncStatus")(syncStatus.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaSyncWorkspaceResponse]
  }
}

