package typings
package atJupyterlabSettingeditorLib.libSettingeditorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@jupyterlab/settingeditor/lib/settingeditor", "SettingEditor")
@js.native
class SettingEditor protected ()
  extends atPhosphorWidgetsLib.atPhosphorWidgetsMod.Widget {
  /**
    * Create a new setting editor.
    */
  def this(options: atJupyterlabSettingeditorLib.libSettingeditorMod.SettingEditorNs.IOptions) = this()
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
    * Whether the raw editor revert functionality is enabled.
    */
  val canRevertRaw: scala.Boolean = js.native
  /**
    * Whether the raw editor save functionality is enabled.
    */
  val canSaveRaw: scala.Boolean = js.native
  /**
    * Emits when the commands passed in at instantiation change.
    */
  val commandsChanged: atPhosphorSignalingLib.atPhosphorSignalingMod.ISignal[_, js.Array[java.lang.String]] = js.native
  /**
    * Whether the debug panel is visible.
    */
  val isDebugVisible: scala.Boolean = js.native
  /**
    * The state database key for the editor's state management.
    */
  val key: java.lang.String = js.native
  /**
    * The setting registry used by the editor.
    */
  val registry: atJupyterlabCoreutilsLib.libSettingregistryMod.ISettingRegistry = js.native
  /**
    * The currently loaded settings.
    */
  val settings: atJupyterlabCoreutilsLib.libSettingregistryMod.ISettingRegistryNs.ISettings = js.native
  /**
    * The inspectable raw user editor source for the currently loaded settings.
    */
  val source: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify CodeEditor.IEditor */ js.Any = js.native
  /**
    * The state database used to store layout.
    */
  val state: atJupyterlabCoreutilsLib.libStatedbMod.IStateDB = js.native
  /**
    * Revert raw editor back to original settings.
    */
  def revert(): scala.Unit = js.native
  /**
    * Save the contents of the raw editor.
    */
  def save(): js.Promise[scala.Unit] = js.native
  /**
    * Toggle the debug functionality.
    */
  def toggleDebug(): scala.Unit = js.native
}

