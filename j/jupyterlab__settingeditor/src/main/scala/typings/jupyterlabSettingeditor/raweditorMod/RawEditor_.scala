package typings.jupyterlabSettingeditor.raweditorMod

import typings.jupyterlabCodeeditor.editorMod.CodeEditor.IEditor
import typings.jupyterlabSettingeditor.raweditorMod.RawEditor.IOptions
import typings.jupyterlabSettingeditor.splitpanelMod.SplitPanel
import typings.jupyterlabSettingregistry.tokensMod.ISettingRegistry
import typings.jupyterlabSettingregistry.tokensMod.ISettingRegistry.ISettings
import typings.luminoSignaling.mod.ISignal
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
  def canRevert: Boolean = js.native
  
  /**
    * Whether the raw editor save functionality is enabled.
    */
  def canSave: Boolean = js.native
  
  /**
    * Emits when the commands passed in at instantiation change.
    */
  def commandsChanged: ISignal[_, js.Array[String]] = js.native
  
  /**
    * Tests whether the settings have been modified and need saving.
    */
  def isDirty: Boolean = js.native
  
  /**
    * The setting registry used by the editor.
    */
  val registry: ISettingRegistry = js.native
  
  /**
    * Revert the editor back to original settings.
    */
  def revert(): Unit = js.native
  
  /**
    * Save the contents of the raw editor.
    */
  def save(): js.Promise[Unit] = js.native
  
  /**
    * The plugin settings being edited.
    */
  def settings: ISettings | Null = js.native
  def settings_=(settings: ISettings | Null): Unit = js.native
  
  /**
    * Get the relative sizes of the two editor panels.
    */
  def sizes: js.Array[Double] = js.native
  def sizes_=(sizes: js.Array[Double]): Unit = js.native
  
  /**
    * The inspectable source editor for user input.
    */
  def source: IEditor = js.native
}
