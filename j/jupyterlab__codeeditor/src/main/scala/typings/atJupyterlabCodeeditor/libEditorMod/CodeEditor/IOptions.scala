package typings.atJupyterlabCodeeditor.libEditorMod.CodeEditor

import typings.std.HTMLElement
import typings.std.Partial
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
  var config: js.UndefOr[Partial[IConfig]] = js.undefined
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
  var selectionStyle: js.UndefOr[Partial[ISelectionStyle]] = js.undefined
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

