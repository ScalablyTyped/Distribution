package typings.jupyterlabServices.anon

import typings.jupyterlabNbformat.mod.ExecutionCount
import typings.jupyterlabNbformat.mod.IMimeBundle
import typings.jupyterlabNbformat.mod.OutputMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Transient extends js.Object {
  var data: IMimeBundle
  var execution_count: ExecutionCount
  var metadata: OutputMetadata
  var transient: js.UndefOr[Displayid] = js.undefined
}

object Transient {
  @scala.inline
  def apply(
    data: IMimeBundle,
    metadata: OutputMetadata,
    execution_count: ExecutionCount = null.asInstanceOf[ExecutionCount],
    transient: Displayid = null
  ): Transient = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], metadata = metadata.asInstanceOf[js.Any], execution_count = execution_count.asInstanceOf[js.Any])
    if (transient != null) __obj.updateDynamic("transient")(transient.asInstanceOf[js.Any])
    __obj.asInstanceOf[Transient]
  }
}

