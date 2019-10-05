package typings.atJupyterlabCells.libWidgetMod.CodeCell

import typings.atJupyterlabCells.libModelMod.ICodeCellModel
import typings.atJupyterlabCells.libWidgetMod.Cell.IContentFactory
import typings.atJupyterlabCodeeditor.libEditorMod.CodeEditor.IConfig
import typings.atJupyterlabRendermime.libTokensMod.IRenderMimeRegistry
import typings.std.Partial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * An options object for initializing a base cell widget.
  */
trait IOptions
  extends typings.atJupyterlabCells.libWidgetMod.Cell.IOptions {
  /**
    * The model used by the cell.
    */
  @JSName("model")
  var model_IOptions: ICodeCellModel
  /**
    * The mime renderer for the cell widget.
    */
  var rendermime: IRenderMimeRegistry
}

object IOptions {
  @scala.inline
  def apply(
    model: ICodeCellModel,
    rendermime: IRenderMimeRegistry,
    contentFactory: IContentFactory = null,
    editorConfig: Partial[IConfig] = null,
    updateEditorOnShow: js.UndefOr[Boolean] = js.undefined
  ): IOptions = {
    val __obj = js.Dynamic.literal(model = model, rendermime = rendermime)
    if (contentFactory != null) __obj.updateDynamic("contentFactory")(contentFactory)
    if (editorConfig != null) __obj.updateDynamic("editorConfig")(editorConfig)
    if (!js.isUndefined(updateEditorOnShow)) __obj.updateDynamic("updateEditorOnShow")(updateEditorOnShow)
    __obj.asInstanceOf[IOptions]
  }
}

