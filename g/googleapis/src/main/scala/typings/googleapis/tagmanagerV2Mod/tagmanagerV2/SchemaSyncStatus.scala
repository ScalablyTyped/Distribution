package typings.googleapis.tagmanagerV2Mod.tagmanagerV2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The status of a workspace after synchronization.
  */
@js.native
trait SchemaSyncStatus extends js.Object {
  /**
    * Synchornization operation detected a merge conflict.
    */
  var mergeConflict: js.UndefOr[Boolean] = js.native
  /**
    * An error occurred during the synchronization operation.
    */
  var syncError: js.UndefOr[Boolean] = js.native
}

object SchemaSyncStatus {
  @scala.inline
  def apply(mergeConflict: js.UndefOr[Boolean] = js.undefined, syncError: js.UndefOr[Boolean] = js.undefined): SchemaSyncStatus = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(mergeConflict)) __obj.updateDynamic("mergeConflict")(mergeConflict.get.asInstanceOf[js.Any])
    if (!js.isUndefined(syncError)) __obj.updateDynamic("syncError")(syncError.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaSyncStatus]
  }
}

