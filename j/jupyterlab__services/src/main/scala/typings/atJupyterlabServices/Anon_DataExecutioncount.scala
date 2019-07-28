package typings.atJupyterlabServices

import typings.atJupyterlabCoreutils.libNbformatMod.nbformatNs.ExecutionCount
import typings.atJupyterlabCoreutils.libNbformatMod.nbformatNs.IMimeBundle
import typings.atJupyterlabCoreutils.libNbformatMod.nbformatNs.OutputMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_DataExecutioncount extends js.Object {
  var data: IMimeBundle
  var execution_count: ExecutionCount
  var metadata: OutputMetadata
  var transient: js.UndefOr[Anon_Displayid] = js.undefined
}

object Anon_DataExecutioncount {
  @scala.inline
  def apply(
    data: IMimeBundle,
    execution_count: ExecutionCount,
    metadata: OutputMetadata,
    transient: Anon_Displayid = null
  ): Anon_DataExecutioncount = {
    val __obj = js.Dynamic.literal(data = data, execution_count = execution_count.asInstanceOf[js.Any], metadata = metadata)
    if (transient != null) __obj.updateDynamic("transient")(transient)
    __obj.asInstanceOf[Anon_DataExecutioncount]
  }
}

