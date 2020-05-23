package typings.jupyterlabCodeeditor.widgetMod.CodeEditorWrapper

import typings.jupyterlabCodeeditor.anon.PartialIConfig
import typings.jupyterlabCodeeditor.editorMod.CodeEditor.Factory
import typings.jupyterlabCodeeditor.editorMod.CodeEditor.IEditor
import typings.jupyterlabCodeeditor.editorMod.CodeEditor.IModel
import typings.jupyterlabCodeeditor.editorMod.CodeEditor.ISelectionStyle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The options used to initialize a code editor widget.
  */
trait IOptions extends js.Object {
  /**
    * The configuration options for the editor.
    */
  var config: js.UndefOr[PartialIConfig] = js.undefined
  /**
    * A code editor factory.
    *
    * #### Notes
    * The widget needs a factory and a model instead of a `CodeEditor.IEditor`
    * object because it needs to provide its own node as the host.
    */
  var factory: Factory
  /**
    * The model used to initialize the code editor.
    */
  var model: IModel
  /**
    * The default selection style for the editor.
    */
  var selectionStyle: js.UndefOr[ISelectionStyle] = js.undefined
  /**
    * Whether to send an update request to the editor when it is shown.
    */
  var updateOnShow: js.UndefOr[Boolean] = js.undefined
  /**
    * The desired uuid for the editor.
    */
  var uuid: js.UndefOr[String] = js.undefined
}

object IOptions {
  @scala.inline
  def apply(
    factory: /* options */ typings.jupyterlabCodeeditor.editorMod.CodeEditor.IOptions => IEditor,
    model: IModel,
    config: PartialIConfig = null,
    selectionStyle: ISelectionStyle = null,
    updateOnShow: js.UndefOr[Boolean] = js.undefined,
    uuid: String = null
  ): IOptions = {
    val __obj = js.Dynamic.literal(factory = js.Any.fromFunction1(factory), model = model.asInstanceOf[js.Any])
    if (config != null) __obj.updateDynamic("config")(config.asInstanceOf[js.Any])
    if (selectionStyle != null) __obj.updateDynamic("selectionStyle")(selectionStyle.asInstanceOf[js.Any])
    if (!js.isUndefined(updateOnShow)) __obj.updateDynamic("updateOnShow")(updateOnShow.get.asInstanceOf[js.Any])
    if (uuid != null) __obj.updateDynamic("uuid")(uuid.asInstanceOf[js.Any])
    __obj.asInstanceOf[IOptions]
  }
}

