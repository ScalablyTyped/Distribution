package typings.jupyterlabCodeeditor.editorMod.CodeEditor

import typings.jupyterlabCodeeditor.anon.PartialIConfig
import typings.jupyterlabCodeeditor.anon.PartialISelectionStyle
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The options used to initialize an editor.
  */
trait IOptions extends js.Object {
  /**
    * The configuration options for the editor.
    */
  var config: js.UndefOr[PartialIConfig] = js.undefined
  /**
    * The host widget used by the editor.
    */
  var host: HTMLElement
  /**
    * The model used by the editor.
    */
  var model: IModel
  /**
    * The default selection style for the editor.
    */
  var selectionStyle: js.UndefOr[PartialISelectionStyle] = js.undefined
  /**
    * The desired uuid for the editor.
    */
  var uuid: js.UndefOr[String] = js.undefined
}

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

