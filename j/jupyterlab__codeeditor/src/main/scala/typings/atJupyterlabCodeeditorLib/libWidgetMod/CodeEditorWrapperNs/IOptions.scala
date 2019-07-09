package typings
package atJupyterlabCodeeditorLib.libWidgetMod.CodeEditorWrapperNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The options used to initialize a code editor widget.
  */
@js.native
trait IOptions extends js.Object {
  /**
    * The configuration options for the editor.
    */
  var config: js.UndefOr[stdLib.Partial[atJupyterlabCodeeditorLib.libEditorMod.CodeEditorNs.IConfig]] = js.native
  /**
    * A code editor factory.
    *
    * #### Notes
    * The widget needs a factory and a model instead of a `CodeEditor.IEditor`
    * object because it needs to provide its own node as the host.
    */
  @JSName("factory")
  var factory_Original: atJupyterlabCodeeditorLib.libEditorMod.CodeEditorNs.Factory = js.native
  /**
    * The model used to initialize the code editor.
    */
  var model: atJupyterlabCodeeditorLib.libEditorMod.CodeEditorNs.IModel = js.native
  /**
    * The default selection style for the editor.
    */
  var selectionStyle: js.UndefOr[atJupyterlabCodeeditorLib.libEditorMod.CodeEditorNs.ISelectionStyle] = js.native
  /**
    * Whether to send an update request to the editor when it is shown.
    */
  var updateOnShow: js.UndefOr[scala.Boolean] = js.native
  /**
    * The desired uuid for the editor.
    */
  var uuid: js.UndefOr[java.lang.String] = js.native
  /**
    * A code editor factory.
    *
    * #### Notes
    * The widget needs a factory and a model instead of a `CodeEditor.IEditor`
    * object because it needs to provide its own node as the host.
    */
  def factory(options: atJupyterlabCodeeditorLib.libEditorMod.CodeEditorNs.IOptions): atJupyterlabCodeeditorLib.libEditorMod.CodeEditorNs.IEditor = js.native
}

