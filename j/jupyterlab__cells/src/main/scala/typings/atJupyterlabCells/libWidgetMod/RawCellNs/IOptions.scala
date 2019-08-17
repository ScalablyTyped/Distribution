package typings.atJupyterlabCells.libWidgetMod.RawCellNs

import typings.atJupyterlabCells.libModelMod.IRawCellModel
import typings.atJupyterlabCells.libWidgetMod.CellNs.IContentFactory
import typings.atJupyterlabCodeeditor.libEditorMod.CodeEditorNs.IConfig
import typings.std.Partial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * An options object for initializing a base cell widget.
  */
trait IOptions
  extends typings.atJupyterlabCells.libWidgetMod.CellNs.IOptions {
  /**
    * The model used by the cell.
    */
  @JSName("model")
  var model_IOptions: IRawCellModel
}

object IOptions {
  @scala.inline
  def apply(
    model: IRawCellModel,
    contentFactory: IContentFactory = null,
    editorConfig: Partial[IConfig] = null,
    updateEditorOnShow: js.UndefOr[Boolean] = js.undefined
  ): IOptions = {
    val __obj = js.Dynamic.literal(model = model)
    if (contentFactory != null) __obj.updateDynamic("contentFactory")(contentFactory)
    if (editorConfig != null) __obj.updateDynamic("editorConfig")(editorConfig)
    if (!js.isUndefined(updateEditorOnShow)) __obj.updateDynamic("updateEditorOnShow")(updateEditorOnShow)
    __obj.asInstanceOf[IOptions]
  }
}

