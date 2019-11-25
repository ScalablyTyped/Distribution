package typings.atJupyterlabCells.libWidgetMod.MarkdownCell

import typings.atJupyterlabCells.libModelMod.IMarkdownCellModel
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
  var model_IOptions: IMarkdownCellModel
  /**
    * The mime renderer for the cell widget.
    */
  var rendermime: IRenderMimeRegistry
}

object IOptions {
  @scala.inline
  def apply(
    model: IMarkdownCellModel,
    rendermime: IRenderMimeRegistry,
    contentFactory: IContentFactory = null,
    editorConfig: Partial[IConfig] = null,
    updateEditorOnShow: js.UndefOr[Boolean] = js.undefined
  ): IOptions = {
    val __obj = js.Dynamic.literal(model = model.asInstanceOf[js.Any], rendermime = rendermime.asInstanceOf[js.Any])
    if (contentFactory != null) __obj.updateDynamic("contentFactory")(contentFactory.asInstanceOf[js.Any])
    if (editorConfig != null) __obj.updateDynamic("editorConfig")(editorConfig.asInstanceOf[js.Any])
    if (!js.isUndefined(updateEditorOnShow)) __obj.updateDynamic("updateEditorOnShow")(updateEditorOnShow.asInstanceOf[js.Any])
    __obj.asInstanceOf[IOptions]
  }
}

