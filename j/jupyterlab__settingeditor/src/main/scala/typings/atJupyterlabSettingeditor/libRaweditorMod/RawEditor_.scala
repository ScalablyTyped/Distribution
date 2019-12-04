package typings.atJupyterlabSettingeditor.libRaweditorMod

import typings.atJupyterlabCodeeditor.libEditorMod.CodeEditor.IEditor
import typings.atJupyterlabCoreutils.libTokensMod.ISettingRegistry
import typings.atJupyterlabCoreutils.libTokensMod.ISettingRegistry.ISettings
import typings.atJupyterlabSettingeditor.libRaweditorMod.RawEditor.IOptions
import typings.atJupyterlabSettingeditor.libSplitpanelMod.SplitPanel
import typings.atPhosphorSignaling.atPhosphorSignalingMod.ISignal
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@jupyterlab/settingeditor/lib/raweditor", "RawEditor")
@js.native
class RawEditor_ protected () extends SplitPanel {
  /**
    * Create a new plugin editor.
    */
  def this(options: IOptions) = this()
  var _canRevert: js.Any = js.native
  var _canSave: js.Any = js.native
  var _commands: js.Any = js.native
  var _commandsChanged: js.Any = js.native
  var _defaults: js.Any = js.native
  var _inspector: js.Any = js.native
  var _onSaveError: js.Any = js.native
  /**
    * Handle updates to the settings.
    */
  var _onSettingsChanged: js.Any = js.native
  /**
    * Handle text changes in the underlying editor.
    */
  var _onTextChanged: js.Any = js.native
  var _settings: js.Any = js.native
  var _toolbar: js.Any = js.native
  var _updateToolbar: js.Any = js.native
  var _user: js.Any = js.native
  /**
    * Whether the raw editor revert functionality is enabled.
    */
  val canRevert: Boolean = js.native
  /**
    * Whether the raw editor save functionality is enabled.
    */
  val canSave: Boolean = js.native
  /**
    * Emits when the commands passed in at instantiation change.
    */
  val commandsChanged: ISignal[_, js.Array[String]] = js.native
  /**
    * Tests whether the settings have been modified and need saving.
    */
  val isDirty: Boolean = js.native
  /**
    * The setting registry used by the editor.
    */
  val registry: ISettingRegistry = js.native
  /**
    * The plugin settings being edited.
    */
  var settings: ISettings | Null = js.native
  /**
    * Get the relative sizes of the two editor panels.
    */
  var sizes: js.Array[Double] = js.native
  /**
    * The inspectable source editor for user input.
    */
  val source: IEditor = js.native
  /**
    * Revert the editor back to original settings.
    */
  def revert(): Unit = js.native
  /**
    * Save the contents of the raw editor.
    */
  def save(): js.Promise[Unit] = js.native
}

