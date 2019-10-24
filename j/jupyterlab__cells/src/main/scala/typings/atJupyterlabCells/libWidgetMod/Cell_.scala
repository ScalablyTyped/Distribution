package typings.atJupyterlabCells.libWidgetMod

import typings.atJupyterlabCells.libInputareaMod.InputArea
import typings.atJupyterlabCells.libModelMod.ICellModel
import typings.atJupyterlabCells.libWidgetMod.Cell.IContentFactory
import typings.atJupyterlabCells.libWidgetMod.Cell.IOptions
import typings.atJupyterlabObservables.libObservablemapMod.IObservableMap
import typings.atJupyterlabObservables.libObservablemapMod.IObservableMap.IChangedArgs
import typings.atPhosphorCoreutils.libJsonMod.JSONValue
import typings.atPhosphorWidgets.atPhosphorWidgetsMod.Widget
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
  val editor: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify CodeEditor.IEditor */ js.Any = js.native
  /**
    * Get the CodeEditorWrapper used by the cell.
    */
  val editorWidget: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify CodeEditorWrapper */ js.Any = js.native
  /**
    * Get the input area for the cell.
    */
  val inputArea: InputArea = js.native
  /**
    * The view state of input being hidden.
    */
  var inputHidden: Boolean = js.native
  /**
    * Get the model used by the cell.
    */
  val model: ICellModel = js.native
  /**
    * Get the prompt node used by the cell.
    */
  val promptNode: HTMLElement = js.native
  /**
    * The read only state of the cell.
    */
  var readOnly: Boolean = js.native
  /**
    * A promise that resolves when the widget renders for the first time.
    */
  val ready: js.Promise[Unit] = js.native
  /**
    * Whether to sync the collapse state to the cell model.
    */
  var syncCollapse: Boolean = js.native
  /**
    * Whether to sync the editable state to the cell model.
    */
  var syncEditable: Boolean = js.native
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
    * Revert view collapse state from model.
    */
  def loadCollapseState(): Unit = js.native
  /**
    * Load view editable state from model.
    */
  def loadEditableState(): Unit = js.native
  /**
    * Handle changes in the metadata.
    */
  /* protected */ def onMetadataChanged(model: IObservableMap[JSONValue], args: IChangedArgs[JSONValue]): Unit = js.native
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
}

