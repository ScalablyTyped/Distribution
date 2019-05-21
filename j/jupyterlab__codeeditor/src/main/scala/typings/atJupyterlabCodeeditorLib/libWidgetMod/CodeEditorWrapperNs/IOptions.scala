package typings
package atJupyterlabCodeeditorLib.libWidgetMod.CodeEditorWrapperNs

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
  var config: js.UndefOr[stdLib.Partial[atJupyterlabCodeeditorLib.libEditorMod.CodeEditorNs.IConfig]] = js.undefined
  /**
    * A code editor factory.
    *
    * #### Notes
    * The widget needs a factory and a model instead of a `CodeEditor.IEditor`
    * object because it needs to provide its own node as the host.
    */
  var factory: atJupyterlabCodeeditorLib.libEditorMod.CodeEditorNs.Factory
  /**
    * The model used to initialize the code editor.
    */
  var model: atJupyterlabCodeeditorLib.libEditorMod.CodeEditorNs.IModel
  /**
    * The default selection style for the editor.
    */
  var selectionStyle: js.UndefOr[atJupyterlabCodeeditorLib.libEditorMod.CodeEditorNs.ISelectionStyle] = js.undefined
  /**
    * The desired uuid for the editor.
    */
  var uuid: js.UndefOr[java.lang.String] = js.undefined
}

object IOptions {
  @scala.inline
  def apply(
    factory: atJupyterlabCodeeditorLib.libEditorMod.CodeEditorNs.Factory,
    model: atJupyterlabCodeeditorLib.libEditorMod.CodeEditorNs.IModel,
    config: stdLib.Partial[atJupyterlabCodeeditorLib.libEditorMod.CodeEditorNs.IConfig] = null,
    selectionStyle: atJupyterlabCodeeditorLib.libEditorMod.CodeEditorNs.ISelectionStyle = null,
    uuid: java.lang.String = null
  ): IOptions = {
    val __obj = js.Dynamic.literal(factory = factory, model = model)
    if (config != null) __obj.updateDynamic("config")(config)
    if (selectionStyle != null) __obj.updateDynamic("selectionStyle")(selectionStyle)
    if (uuid != null) __obj.updateDynamic("uuid")(uuid)
    __obj.asInstanceOf[IOptions]
  }
}

