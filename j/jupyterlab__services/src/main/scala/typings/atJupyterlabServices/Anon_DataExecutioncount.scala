package typings.atJupyterlabServices

import typings.atJupyterlabCoreutils.libNbformatMod.nbformat.ExecutionCount
import typings.atJupyterlabCoreutils.libNbformatMod.nbformat.IMimeBundle
import typings.atJupyterlabCoreutils.libNbformatMod.nbformat.OutputMetadata
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
    metadata: OutputMetadata,
    execution_count: Int | Double = null,
    transient: Anon_Displayid = null
  ): Anon_DataExecutioncount = {
    val __obj = js.Dynamic.literal(data = data, metadata = metadata)
    if (execution_count != null) __obj.updateDynamic("execution_count")(execution_count.asInstanceOf[js.Any])
    if (transient != null) __obj.updateDynamic("transient")(transient)
    __obj.asInstanceOf[Anon_DataExecutioncount]
  }
}

