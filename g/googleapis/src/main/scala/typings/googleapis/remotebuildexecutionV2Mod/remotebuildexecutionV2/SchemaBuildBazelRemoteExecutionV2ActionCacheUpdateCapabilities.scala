package typings.googleapis.remotebuildexecutionV2Mod.remotebuildexecutionV2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Describes the server/instance capabilities for updating the action cache.
  */
@js.native
trait SchemaBuildBazelRemoteExecutionV2ActionCacheUpdateCapabilities extends js.Object {
  var updateEnabled: js.UndefOr[Boolean] = js.native
}

object SchemaBuildBazelRemoteExecutionV2ActionCacheUpdateCapabilities {
  @scala.inline
  def apply(updateEnabled: js.UndefOr[Boolean] = js.undefined): SchemaBuildBazelRemoteExecutionV2ActionCacheUpdateCapabilities = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(updateEnabled)) __obj.updateDynamic("updateEnabled")(updateEnabled.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaBuildBazelRemoteExecutionV2ActionCacheUpdateCapabilities]
  }
}

