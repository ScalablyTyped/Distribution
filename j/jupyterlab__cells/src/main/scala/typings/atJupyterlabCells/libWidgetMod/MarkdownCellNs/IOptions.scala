package typings.atJupyterlabCells.libWidgetMod.MarkdownCellNs

import typings.atJupyterlabCells.libModelMod.IMarkdownCellModel
import typings.atJupyterlabCells.libWidgetMod.CellNs.IContentFactory
import typings.atJupyterlabRendermime.libTokensMod.IRenderMimeRegistry
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
    editorConfig: Partial[
      /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify CodeEditor.IConfig */ _
    ] = null,
    updateEditorOnShow: js.UndefOr[Boolean] = js.undefined
  ): IOptions = {
    val __obj = js.Dynamic.literal(model = model, rendermime = rendermime)
    if (contentFactory != null) __obj.updateDynamic("contentFactory")(contentFactory)
    if (editorConfig != null) __obj.updateDynamic("editorConfig")(editorConfig)
    if (!js.isUndefined(updateEditorOnShow)) __obj.updateDynamic("updateEditorOnShow")(updateEditorOnShow)
    __obj.asInstanceOf[IOptions]
  }
}

