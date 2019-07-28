package typings.atJupyterlabCodeeditor.libWidgetMod.CodeEditorWrapperNs

import typings.atJupyterlabCodeeditor.libEditorMod.CodeEditorNs.Factory
import typings.atJupyterlabCodeeditor.libEditorMod.CodeEditorNs.IConfig
import typings.atJupyterlabCodeeditor.libEditorMod.CodeEditorNs.IEditor
import typings.atJupyterlabCodeeditor.libEditorMod.CodeEditorNs.IModel
import typings.atJupyterlabCodeeditor.libEditorMod.CodeEditorNs.ISelectionStyle
import typings.std.Partial
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
  var config: js.UndefOr[Partial[IConfig]] = js.native
  /**
    * A code editor factory.
    *
    * #### Notes
    * The widget needs a factory and a model instead of a `CodeEditor.IEditor`
    * object because it needs to provide its own node as the host.
    */
  @JSName("factory")
  var factory_Original: Factory = js.native
  /**
    * The model used to initialize the code editor.
    */
  var model: IModel = js.native
  /**
    * The default selection style for the editor.
    */
  var selectionStyle: js.UndefOr[ISelectionStyle] = js.native
  /**
    * Whether to send an update request to the editor when it is shown.
    */
  var updateOnShow: js.UndefOr[Boolean] = js.native
  /**
    * The desired uuid for the editor.
    */
  var uuid: js.UndefOr[String] = js.native
  /**
    * A code editor factory.
    *
    * #### Notes
    * The widget needs a factory and a model instead of a `CodeEditor.IEditor`
    * object because it needs to provide its own node as the host.
    */
  def factory(options: typings.atJupyterlabCodeeditor.libEditorMod.CodeEditorNs.IOptions): IEditor = js.native
}

