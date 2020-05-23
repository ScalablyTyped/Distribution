package typings.jupyterlabNbformat.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<@jupyterlab/nbformat.@jupyterlab/nbformat.IBaseCellJupyterMetadata> */
trait PartialIBaseCellJupyterMe extends js.Object {
  var source_hidden: js.UndefOr[Boolean] = js.undefined
}

object PartialIBaseCellJupyterMe {
  @scala.inline
  def apply(source_hidden: js.UndefOr[Boolean] = js.undefined): PartialIBaseCellJupyterMe = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(source_hidden)) __obj.updateDynamic("source_hidden")(source_hidden.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[PartialIBaseCellJupyterMe]
  }
}

