package typings.jupyterlabCompleter.widgetMod.Completer

import typings.jupyterlabCodeeditor.editorMod.CodeEditor.IEditor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The initialization options for a completer widget.
  */
trait IOptions extends js.Object {
  /**
    * The semantic parent of the completer widget, its referent editor.
    */
  var editor: js.UndefOr[IEditor | Null] = js.undefined
  /**
    * The model for the completer widget.
    */
  var model: js.UndefOr[IModel] = js.undefined
  /**
    * The renderer for the completer widget nodes.
    */
  var renderer: js.UndefOr[IRenderer] = js.undefined
}

object IOptions {
  @scala.inline
  def apply(
    editor: js.UndefOr[Null | IEditor] = js.undefined,
    model: IModel = null,
    renderer: IRenderer = null
  ): IOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(editor)) __obj.updateDynamic("editor")(editor.asInstanceOf[js.Any])
    if (model != null) __obj.updateDynamic("model")(model.asInstanceOf[js.Any])
    if (renderer != null) __obj.updateDynamic("renderer")(renderer.asInstanceOf[js.Any])
    __obj.asInstanceOf[IOptions]
  }
}

