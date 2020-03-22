package typings.jupyterlabNbformat

import typings.jupyterlabNbformat.jupyterlabNbformatStrings.auto
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<@jupyterlab/nbformat.@jupyterlab/nbformat.ICodeCellMetadata> */
trait PartialICodeCellMetadata extends js.Object {
  var collapsed: js.UndefOr[Boolean] = js.undefined
  var jupyter: js.UndefOr[PartialICodeCellJupyterMe] = js.undefined
  var name: js.UndefOr[String] = js.undefined
  var scrolled: js.UndefOr[Boolean | auto] = js.undefined
  var tags: js.UndefOr[js.Array[String]] = js.undefined
  var trusted: js.UndefOr[Boolean] = js.undefined
}

object PartialICodeCellMetadata {
  @scala.inline
  def apply(
    collapsed: js.UndefOr[Boolean] = js.undefined,
    jupyter: PartialICodeCellJupyterMe = null,
    name: String = null,
    scrolled: Boolean | auto = null,
    tags: js.Array[String] = null,
    trusted: js.UndefOr[Boolean] = js.undefined
  ): PartialICodeCellMetadata = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(collapsed)) __obj.updateDynamic("collapsed")(collapsed.asInstanceOf[js.Any])
    if (jupyter != null) __obj.updateDynamic("jupyter")(jupyter.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (scrolled != null) __obj.updateDynamic("scrolled")(scrolled.asInstanceOf[js.Any])
    if (tags != null) __obj.updateDynamic("tags")(tags.asInstanceOf[js.Any])
    if (!js.isUndefined(trusted)) __obj.updateDynamic("trusted")(trusted.asInstanceOf[js.Any])
    __obj.asInstanceOf[PartialICodeCellMetadata]
  }
}

