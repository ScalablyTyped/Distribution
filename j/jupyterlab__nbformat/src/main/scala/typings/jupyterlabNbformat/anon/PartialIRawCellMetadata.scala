package typings.jupyterlabNbformat.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<@jupyterlab/nbformat.@jupyterlab/nbformat.IRawCellMetadata> */
trait PartialIRawCellMetadata extends js.Object {
  var format: js.UndefOr[String] = js.undefined
  var jupyter: js.UndefOr[PartialIBaseCellJupyterMe] = js.undefined
  var name: js.UndefOr[String] = js.undefined
  var tags: js.UndefOr[js.Array[String]] = js.undefined
  var trusted: js.UndefOr[Boolean] = js.undefined
}

object PartialIRawCellMetadata {
  @scala.inline
  def apply(
    format: String = null,
    jupyter: PartialIBaseCellJupyterMe = null,
    name: String = null,
    tags: js.Array[String] = null,
    trusted: js.UndefOr[Boolean] = js.undefined
  ): PartialIRawCellMetadata = {
    val __obj = js.Dynamic.literal()
    if (format != null) __obj.updateDynamic("format")(format.asInstanceOf[js.Any])
    if (jupyter != null) __obj.updateDynamic("jupyter")(jupyter.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (tags != null) __obj.updateDynamic("tags")(tags.asInstanceOf[js.Any])
    if (!js.isUndefined(trusted)) __obj.updateDynamic("trusted")(trusted.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[PartialIRawCellMetadata]
  }
}

