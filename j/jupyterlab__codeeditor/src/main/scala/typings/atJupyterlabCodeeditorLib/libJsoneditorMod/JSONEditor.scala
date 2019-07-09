package typings
package atJupyterlabCodeeditorLib.libJsoneditorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@jupyterlab/codeeditor/lib/jsoneditor", "JSONEditor")
@js.native
class JSONEditor protected ()
  extends atPhosphorWidgetsLib.atPhosphorWidgetsMod.Widget {
  /**
    * Construct a new JSON editor.
    */
  def this(options: atJupyterlabCodeeditorLib.libJsoneditorMod.JSONEditorNs.IOptions) = this()
  var _changeGuard: js.Any = js.native
  var _dataDirty: js.Any = js.native
  /**
    * Handle blur events for the text area.
    */
  var _evtBlur: js.Any = js.native
  /**
    * Handle click events for the buttons.
    */
  var _evtClick: js.Any = js.native
  var _inputDirty: js.Any = js.native
  /**
    * Merge the user content.
    */
  var _mergeContent: js.Any = js.native
  /**
    * Handle a change to the metadata of the source.
    */
  var _onSourceChanged: js.Any = js.native
  /**
    * Handle change events.
    */
  var _onValueChanged: js.Any = js.native
  var _originalValue: js.Any = js.native
  /**
    * Set the value given the owner contents.
    */
  var _setValue: js.Any = js.native
  var _source: js.Any = js.native
  /**
    * The commit button used by the JSON editor.
    */
  val commitButtonNode: stdLib.HTMLSpanElement = js.native
  /**
    * The code editor used by the editor.
    */
  val editor: atJupyterlabCodeeditorLib.libEditorMod.CodeEditorNs.IEditor = js.native
  /**
    * The editor host node used by the JSON editor.
    */
  val editorHostNode: stdLib.HTMLDivElement = js.native
  /**
    * The editor host node used by the JSON editor.
    */
  val headerNode: stdLib.HTMLDivElement = js.native
  /**
    * Get whether the editor is dirty.
    */
  val isDirty: scala.Boolean = js.native
  /**
    * The code editor model used by the editor.
    */
  val model: atJupyterlabCodeeditorLib.libEditorMod.CodeEditorNs.IModel = js.native
  /**
    * The revert button used by the JSON editor.
    */
  val revertButtonNode: stdLib.HTMLSpanElement = js.native
  /**
    * The observable source.
    */
  var source: atJupyterlabObservablesLib.libObservablejsonMod.IObservableJSON | scala.Null = js.native
  /**
    * Handle the DOM events for the widget.
    *
    * @param event - The DOM event sent to the widget.
    *
    * #### Notes
    * This method implements the DOM `EventListener` interface and is
    * called in response to events on the notebook panel's node. It should
    * not be called directly by user code.
    */
  def handleEvent(event: stdLib.Event): scala.Unit = js.native
}

