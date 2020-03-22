package typings.jupyterlabCodemirror.editorMod.CodeMirrorEditor

import typings.jupyterlabCodeeditor.PartialIConfig
import typings.jupyterlabCodeeditor.PartialISelectionStyle
import typings.jupyterlabCodeeditor.editorMod.CodeEditor.IModel
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The options used to initialize a code mirror editor.
  */
trait IOptions
  extends typings.jupyterlabCodeeditor.editorMod.CodeEditor.IOptions

object IOptions {
  @scala.inline
  def apply(
    host: HTMLElement,
    model: IModel,
    config: PartialIConfig = null,
    selectionStyle: PartialISelectionStyle = null,
    uuid: String = null
  ): IOptions = {
    val __obj = js.Dynamic.literal(host = host.asInstanceOf[js.Any], model = model.asInstanceOf[js.Any])
    if (config != null) __obj.updateDynamic("config")(config.asInstanceOf[js.Any])
    if (selectionStyle != null) __obj.updateDynamic("selectionStyle")(selectionStyle.asInstanceOf[js.Any])
    if (uuid != null) __obj.updateDynamic("uuid")(uuid.asInstanceOf[js.Any])
    __obj.asInstanceOf[IOptions]
  }
}

