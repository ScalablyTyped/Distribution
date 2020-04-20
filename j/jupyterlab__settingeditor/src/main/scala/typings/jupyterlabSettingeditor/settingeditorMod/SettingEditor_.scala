package typings.jupyterlabSettingeditor.settingeditorMod

import typings.jupyterlabCodeeditor.editorMod.CodeEditor.IEditor
import typings.jupyterlabSettingeditor.settingeditorMod.SettingEditor.IOptions
import typings.jupyterlabSettingregistry.tokensMod.ISettingRegistry
import typings.jupyterlabSettingregistry.tokensMod.ISettingRegistry.ISettings
import typings.jupyterlabStatedb.tokensMod.IStateDB
import typings.luminoCoreutils.jsonMod.ReadonlyPartialJSONValue
import typings.luminoSignaling.mod.ISignal
import typings.luminoWidgets.mod.Widget
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@jupyterlab/settingeditor/lib/settingeditor", "SettingEditor")
@js.native
class SettingEditor_ protected () extends Widget {
  /**
    * Create a new setting editor.
    */
  def this(options: IOptions) = this()
  var _editor: js.Any = js.native
  /**
    * Get the state of the panel.
    */
  var _fetchState: js.Any = js.native
  var _fetching: js.Any = js.native
  var _instructions: js.Any = js.native
  var _list: js.Any = js.native
  /**
    * Handle root level layout state changes.
    */
  var _onStateChanged: js.Any = js.native
  var _panel: js.Any = js.native
  /**
    * Set the state of the setting editor.
    */
  var _saveState: js.Any = js.native
  var _saving: js.Any = js.native
  /**
    * Set the layout sizes.
    */
  var _setLayout: js.Any = js.native
  /**
    * Set the presets of the setting editor.
    */
  var _setState: js.Any = js.native
  var _state: js.Any = js.native
  var _when: js.Any = js.native
  /**
    * The state database key for the editor's state management.
    */
  val key: String = js.native
  /**
    * The setting registry used by the editor.
    */
  val registry: ISettingRegistry = js.native
  /**
    * The state database used to store layout.
    */
  val state: IStateDB[ReadonlyPartialJSONValue] = js.native
  /**
    * Whether the raw editor revert functionality is enabled.
    */
  def canRevertRaw: Boolean = js.native
  /**
    * Whether the raw editor save functionality is enabled.
    */
  def canSaveRaw: Boolean = js.native
  /**
    * Emits when the commands passed in at instantiation change.
    */
  def commandsChanged: ISignal[_, js.Array[String]] = js.native
  /**
    * Revert raw editor back to original settings.
    */
  def revert(): Unit = js.native
  /**
    * Save the contents of the raw editor.
    */
  def save(): js.Promise[Unit] = js.native
  /**
    * The currently loaded settings.
    */
  def settings: ISettings | Null = js.native
  /**
    * The inspectable raw user editor source for the currently loaded settings.
    */
  def source: IEditor = js.native
}

