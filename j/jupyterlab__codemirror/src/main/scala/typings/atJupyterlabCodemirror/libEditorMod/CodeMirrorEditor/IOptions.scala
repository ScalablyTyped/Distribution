package typings.atJupyterlabCodemirror.libEditorMod.CodeMirrorEditor

import typings.atJupyterlabCodeeditor.libEditorMod.CodeEditor.IModel
import typings.atJupyterlabCodeeditor.libEditorMod.CodeEditor.ISelectionStyle
import typings.std.HTMLElement
import typings.std.Partial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The options used to initialize a code mirror editor.
  */
trait IOptions
  extends typings.atJupyterlabCodeeditor.libEditorMod.CodeEditor.IOptions

object IOptions {
  @scala.inline
  def apply(
    host: HTMLElement,
    model: IModel,
    config: Partial[typings.atJupyterlabCodeeditor.libEditorMod.CodeEditor.IConfig] = null,
    selectionStyle: Partial[ISelectionStyle] = null,
    uuid: String = null
  ): IOptions = {
    val __obj = js.Dynamic.literal(host = host.asInstanceOf[js.Any], model = model.asInstanceOf[js.Any])
    if (config != null) __obj.updateDynamic("config")(config.asInstanceOf[js.Any])
    if (selectionStyle != null) __obj.updateDynamic("selectionStyle")(selectionStyle.asInstanceOf[js.Any])
    if (uuid != null) __obj.updateDynamic("uuid")(uuid.asInstanceOf[js.Any])
    __obj.asInstanceOf[IOptions]
  }
}

