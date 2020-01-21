package typings.googleapis.remotebuildexecutionV2Mod.remotebuildexecutionV2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Allowed values for priority in ResultsCachePolicy Used for querying both
  * cache and execution valid priority ranges.
  */
@js.native
trait SchemaBuildBazelRemoteExecutionV2PriorityCapabilities extends js.Object {
  var priorities: js.UndefOr[js.Array[SchemaBuildBazelRemoteExecutionV2PriorityCapabilitiesPriorityRange]] = js.native
}

object SchemaBuildBazelRemoteExecutionV2PriorityCapabilities {
  @scala.inline
  def apply(priorities: js.Array[SchemaBuildBazelRemoteExecutionV2PriorityCapabilitiesPriorityRange] = null): SchemaBuildBazelRemoteExecutionV2PriorityCapabilities = {
    val __obj = js.Dynamic.literal()
    if (priorities != null) __obj.updateDynamic("priorities")(priorities.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaBuildBazelRemoteExecutionV2PriorityCapabilities]
  }
}

