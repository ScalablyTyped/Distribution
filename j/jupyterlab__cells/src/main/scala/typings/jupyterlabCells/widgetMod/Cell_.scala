package typings.jupyterlabCells.widgetMod

import typings.jupyterlabCells.inputareaMod.InputArea
import typings.jupyterlabCells.modelMod.ICellModel
import typings.jupyterlabCells.widgetMod.Cell.IContentFactory
import typings.jupyterlabCells.widgetMod.Cell.IOptions
import typings.jupyterlabCodeeditor.editorMod.CodeEditor.IEditor
import typings.jupyterlabCodeeditor.mod.CodeEditorWrapper
import typings.jupyterlabObservables.observablejsonMod.IObservableJSON
import typings.jupyterlabObservables.observablemapMod.IObservableMap.IChangedArgs
import typings.luminoCoreutils.jsonMod.PartialJSONValue
import typings.luminoWidgets.mod.Widget
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@jupyterlab/cells/lib/widget", "Cell")
@js.native
class Cell_ protected () extends Widget {
  /**
    * Construct a new base cell widget.
    */
  def this(options: IOptions) = this()
  var _input: js.Any = js.native
  var _inputHidden: js.Any = js.native
  var _inputPlaceholder: js.Any = js.native
  var _inputWrapper: js.Any = js.native
  var _model: js.Any = js.native
  var _readOnly: js.Any = js.native
  var _syncCollapse: js.Any = js.native
  var _syncEditable: js.Any = js.native
  /**
    * The content factory used by the widget.
    */
  val contentFactory: IContentFactory = js.native
  /**
    * Get the CodeEditor used by the cell.
    */
  def editor: IEditor = js.native
  /**
    * Get the CodeEditorWrapper used by the cell.
    */
  def editorWidget: CodeEditorWrapper = js.native
  /**
    * Handle the input being hidden.
    *
    * #### Notes
    * This is called by the `inputHidden` setter so that subclasses
    * can perform actions upon the input being hidden without accessing
    * private state.
    */
  /* protected */ def handleInputHidden(value: Boolean): Unit = js.native
  /**
    * Initialize view state from model.
    *
    * #### Notes
    * Should be called after construction. For convenience, returns this, so it
    * can be chained in the construction, like `new Foo().initializeState();`
    */
  def initializeState(): this.type = js.native
  /**
    * Get the input area for the cell.
    */
  def inputArea: InputArea = js.native
  /**
    * The view state of input being hidden.
    */
  def inputHidden: Boolean = js.native
  def inputHidden(value: Boolean): js.Any = js.native
  /**
    * Revert view collapse state from model.
    */
  def loadCollapseState(): Unit = js.native
  /**
    * Load view editable state from model.
    */
  def loadEditableState(): Unit = js.native
  /**
    * Get the model used by the cell.
    */
  def model: ICellModel = js.native
  /**
    * Handle changes in the metadata.
    */
  /* protected */ def onMetadataChanged(model: IObservableJSON, args: IChangedArgs[js.UndefOr[PartialJSONValue]]): Unit = js.native
  /**
    * Get the prompt node used by the cell.
    */
  def promptNode: HTMLElement = js.native
  /**
    * The read only state of the cell.
    */
  def readOnly: Boolean = js.native
  def readOnly(value: Boolean): js.Any = js.native
  /**
    * A promise that resolves when the widget renders for the first time.
    */
  def ready: js.Promise[Unit] = js.native
  /**
    * Save view collapse state to model
    */
  def saveCollapseState(): Unit = js.native
  /**
    * Save view editable state to model
    */
  def saveEditableState(): Unit = js.native
  /**
    * Set the prompt for the widget.
    */
  def setPrompt(value: String): Unit = js.native
  /**
    * Whether to sync the collapse state to the cell model.
    */
  def syncCollapse: Boolean = js.native
  def syncCollapse(value: Boolean): js.Any = js.native
  /**
    * Whether to sync the editable state to the cell model.
    */
  def syncEditable: Boolean = js.native
  def syncEditable(value: Boolean): js.Any = js.native
}

