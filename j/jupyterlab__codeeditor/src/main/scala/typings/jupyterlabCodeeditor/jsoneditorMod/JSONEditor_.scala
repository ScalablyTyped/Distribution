package typings.jupyterlabCodeeditor.jsoneditorMod

import typings.jupyterlabCodeeditor.editorMod.CodeEditor.IEditor
import typings.jupyterlabCodeeditor.editorMod.CodeEditor.IModel
import typings.jupyterlabCodeeditor.jsoneditorMod.JSONEditor.IOptions
import typings.jupyterlabObservables.observablejsonMod.IObservableJSON
import typings.luminoWidgets.mod.Widget
import typings.std.Event_
import typings.std.HTMLDivElement
import typings.std.HTMLSpanElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@jupyterlab/codeeditor/lib/jsoneditor", "JSONEditor")
@js.native
class JSONEditor_ protected () extends Widget {
  /**
    * Construct a new JSON editor.
    */
  def this(options: IOptions) = this()
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
  val commitButtonNode: HTMLSpanElement = js.native
  /**
    * The code editor used by the editor.
    */
  val editor: IEditor = js.native
  /**
    * The editor host node used by the JSON editor.
    */
  val editorHostNode: HTMLDivElement = js.native
  /**
    * The editor host node used by the JSON editor.
    */
  val headerNode: HTMLDivElement = js.native
  /**
    * The code editor model used by the editor.
    */
  val model: IModel = js.native
  /**
    * The revert button used by the JSON editor.
    */
  val revertButtonNode: HTMLSpanElement = js.native
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
  def handleEvent(event: Event_): Unit = js.native
  /**
    * Get whether the editor is dirty.
    */
  def isDirty(): Boolean = js.native
  def source(): js.Any = js.native
  def source(value: IObservableJSON): js.Any = js.native
  /**
    * The observable source.
    */
  @JSName("source")
  def source_Union(): IObservableJSON | Null = js.native
}

