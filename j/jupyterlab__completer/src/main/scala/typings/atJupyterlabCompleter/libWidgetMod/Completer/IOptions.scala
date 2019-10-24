package typings.atJupyterlabCompleter.libWidgetMod.Completer

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
  var editor: js.UndefOr[
    (/* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify CodeEditor.IEditor */ js.Any) | Null
  ] = js.undefined
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
    editor: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify CodeEditor.IEditor */ js.Any = null,
    model: IModel = null,
    renderer: IRenderer = null
  ): IOptions = {
    val __obj = js.Dynamic.literal()
    if (editor != null) __obj.updateDynamic("editor")(editor)
    if (model != null) __obj.updateDynamic("model")(model)
    if (renderer != null) __obj.updateDynamic("renderer")(renderer)
    __obj.asInstanceOf[IOptions]
  }
}

