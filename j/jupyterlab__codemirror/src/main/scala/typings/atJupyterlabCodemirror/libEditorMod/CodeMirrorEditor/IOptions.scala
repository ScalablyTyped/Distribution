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
  extends typings.atJupyterlabCodeeditor.libEditorMod.CodeEditor.IOptions {
  /**
    * The configuration options for the editor.
    */
  @JSName("config")
  var config_IOptions: js.UndefOr[Partial[IConfig]] = js.undefined
}

object IOptions {
  @scala.inline
  def apply(
    host: HTMLElement,
    model: IModel,
    config: Partial[IConfig] = null,
    selectionStyle: Partial[ISelectionStyle] = null,
    uuid: String = null
  ): IOptions = {
    val __obj = js.Dynamic.literal(host = host, model = model)
    if (config != null) __obj.updateDynamic("config")(config)
    if (selectionStyle != null) __obj.updateDynamic("selectionStyle")(selectionStyle)
    if (uuid != null) __obj.updateDynamic("uuid")(uuid)
    __obj.asInstanceOf[IOptions]
  }
}

