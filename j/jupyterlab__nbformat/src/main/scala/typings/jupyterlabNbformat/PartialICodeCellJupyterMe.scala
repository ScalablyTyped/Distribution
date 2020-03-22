package typings.jupyterlabNbformat

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<@jupyterlab/nbformat.@jupyterlab/nbformat.ICodeCellJupyterMetadata> */
trait PartialICodeCellJupyterMe extends js.Object {
  var outputs_hidden: js.UndefOr[Boolean] = js.undefined
  var source_hidden: js.UndefOr[Boolean] = js.undefined
}

object PartialICodeCellJupyterMe {
  @scala.inline
  def apply(
    outputs_hidden: js.UndefOr[Boolean] = js.undefined,
    source_hidden: js.UndefOr[Boolean] = js.undefined
  ): PartialICodeCellJupyterMe = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(outputs_hidden)) __obj.updateDynamic("outputs_hidden")(outputs_hidden.asInstanceOf[js.Any])
    if (!js.isUndefined(source_hidden)) __obj.updateDynamic("source_hidden")(source_hidden.asInstanceOf[js.Any])
    __obj.asInstanceOf[PartialICodeCellJupyterMe]
  }
}

