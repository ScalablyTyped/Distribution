package typings.jupyterlabServices

import typings.jupyterlabNbformat.mod.ExecutionCount
import typings.jupyterlabNbformat.mod.IMimeBundle
import typings.jupyterlabNbformat.mod.OutputMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonTransient extends js.Object {
  var data: IMimeBundle
  var execution_count: ExecutionCount
  var metadata: OutputMetadata
  var transient: js.UndefOr[AnonDisplayid] = js.undefined
}

object AnonTransient {
  @scala.inline
  def apply(
    data: IMimeBundle,
    metadata: OutputMetadata,
    execution_count: Int | Double = null,
    transient: AnonDisplayid = null
  ): AnonTransient = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], metadata = metadata.asInstanceOf[js.Any])
    if (execution_count != null) __obj.updateDynamic("execution_count")(execution_count.asInstanceOf[js.Any])
    if (transient != null) __obj.updateDynamic("transient")(transient.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonTransient]
  }
}

