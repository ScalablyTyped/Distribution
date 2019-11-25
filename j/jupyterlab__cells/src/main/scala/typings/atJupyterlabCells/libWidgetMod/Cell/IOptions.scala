package typings.atJupyterlabCells.libWidgetMod.Cell

import typings.atJupyterlabCells.libModelMod.ICellModel
import typings.atJupyterlabCodeeditor.libEditorMod.CodeEditor.IConfig
import typings.std.Partial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * An options object for initializing a cell widget.
  */
trait IOptions extends js.Object {
  /**
    * The factory object for customizable cell children.
    */
  var contentFactory: js.UndefOr[IContentFactory] = js.undefined
  /**
    * The configuration options for the text editor widget.
    */
  var editorConfig: js.UndefOr[Partial[IConfig]] = js.undefined
  /**
    * The model used by the cell.
    */
  var model: ICellModel
  /**
    * Whether to send an update request to the editor when it is shown.
    */
  var updateEditorOnShow: js.UndefOr[Boolean] = js.undefined
}

object IOptions {
  @scala.inline
  def apply(
    model: ICellModel,
    contentFactory: IContentFactory = null,
    editorConfig: Partial[IConfig] = null,
    updateEditorOnShow: js.UndefOr[Boolean] = js.undefined
  ): IOptions = {
    val __obj = js.Dynamic.literal(model = model.asInstanceOf[js.Any])
    if (contentFactory != null) __obj.updateDynamic("contentFactory")(contentFactory.asInstanceOf[js.Any])
    if (editorConfig != null) __obj.updateDynamic("editorConfig")(editorConfig.asInstanceOf[js.Any])
    if (!js.isUndefined(updateEditorOnShow)) __obj.updateDynamic("updateEditorOnShow")(updateEditorOnShow.asInstanceOf[js.Any])
    __obj.asInstanceOf[IOptions]
  }
}

