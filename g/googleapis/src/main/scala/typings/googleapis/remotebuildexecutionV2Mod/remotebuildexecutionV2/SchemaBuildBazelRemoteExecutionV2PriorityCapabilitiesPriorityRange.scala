package typings.googleapis.remotebuildexecutionV2Mod.remotebuildexecutionV2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Supported range of priorities, including boundaries.
  */
@js.native
trait SchemaBuildBazelRemoteExecutionV2PriorityCapabilitiesPriorityRange extends js.Object {
  var maxPriority: js.UndefOr[Double] = js.native
  var minPriority: js.UndefOr[Double] = js.native
}

object SchemaBuildBazelRemoteExecutionV2PriorityCapabilitiesPriorityRange {
  @scala.inline
  def apply(maxPriority: js.UndefOr[Double] = js.undefined, minPriority: js.UndefOr[Double] = js.undefined): SchemaBuildBazelRemoteExecutionV2PriorityCapabilitiesPriorityRange = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(maxPriority)) __obj.updateDynamic("maxPriority")(maxPriority.get.asInstanceOf[js.Any])
    if (!js.isUndefined(minPriority)) __obj.updateDynamic("minPriority")(minPriority.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaBuildBazelRemoteExecutionV2PriorityCapabilitiesPriorityRange]
  }
}

