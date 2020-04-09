package typings.jupyterlabConsole.widgetMod

import typings.jupyterlabApputils.sessioncontextMod.ISessionContext
import typings.jupyterlabCells.mod.Cell
import typings.jupyterlabCells.mod.CodeCell
import typings.jupyterlabConsole.widgetMod.CodeConsole.IContentFactory
import typings.jupyterlabConsole.widgetMod.CodeConsole.IModelFactory
import typings.jupyterlabConsole.widgetMod.CodeConsole.IOptions
import typings.jupyterlabNbformat.mod.ICodeCell
import typings.jupyterlabObservables.observablelistMod.IObservableList
import typings.jupyterlabRendermime.tokensMod.IRenderMimeRegistry
import typings.luminoCoreutils.jsonMod.JSONObject
import typings.luminoSignaling.mod.ISignal
import typings.luminoWidgets.mod.Widget
import typings.std.Date
import typings.std.Event_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@jupyterlab/console/lib/widget", "CodeConsole")
@js.native
class CodeConsole_ protected () extends Widget {
  /**
    * Construct a console widget.
    */
  def this(options: IOptions) = this()
  var _banner: js.Any = js.native
  var _cells: js.Any = js.native
  var _content: js.Any = js.native
  /**
    * Create the options used to initialize a code cell widget.
    */
  var _createCodeCellOptions: js.Any = js.native
  var _drag: js.Any = js.native
  var _dragData: js.Any = js.native
  /**
    * Handle the `'keydown'` event for the widget.
    */
  var _evtKeyDown: js.Any = js.native
  /**
    * Handle `mousedown` events for the widget.
    */
  var _evtMouseDown: js.Any = js.native
  /**
    * Handle `mousemove` event of widget
    */
  var _evtMouseMove: js.Any = js.native
  /**
    * Handle the `'mouseup'` event for the widget.
    */
  var _evtMouseUp: js.Any = js.native
  /**
    * Execute the code in the current prompt cell.
    */
  var _execute: js.Any = js.native
  var _executed: js.Any = js.native
  var _focusedCell: js.Any = js.native
  /**
    * Update the console based on the kernel info.
    */
  var _handleInfo: js.Any = js.native
  var _history: js.Any = js.native
  var _input: js.Any = js.native
  var _mimeTypeService: js.Any = js.native
  var _mimetype: js.Any = js.native
  var _msgIdCells: js.Any = js.native
  var _msgIds: js.Any = js.native
  /**
    * Handle cell disposed signals.
    */
  var _onCellDisposed: js.Any = js.native
  /**
    * Handle a keydown event on an editor.
    */
  var _onEditorKeydown: js.Any = js.native
  /**
    * Handle a change to the kernel.
    */
  var _onKernelChanged: js.Any = js.native
  /**
    * Handle a change to the kernel status.
    */
  var _onKernelStatusChanged: js.Any = js.native
  var _promptCellCreated: js.Any = js.native
  /**
    * Test whether we should execute the prompt cell.
    */
  var _shouldExecute: js.Any = js.native
  /**
    * Start a drag event
    */
  var _startDrag: js.Any = js.native
  /**
    * The content factory used by the console.
    */
  val contentFactory: IContentFactory = js.native
  /**
    * The model factory for the console widget.
    */
  val modelFactory: IModelFactory = js.native
  /**
    * The rendermime instance used by the console.
    */
  val rendermime: IRenderMimeRegistry = js.native
  /**
    * The client session used by the console.
    */
  val sessionContext: ISessionContext = js.native
  /**
    * Add a banner cell.
    */
  def addBanner(): Unit = js.native
  /**
    * Add a new cell to the content panel.
    *
    * @param cell - The code cell widget being added to the content panel.
    *
    * @param msgId - The optional execution message id for the cell.
    *
    * #### Notes
    * This method is meant for use by outside classes that want to add cells to a
    * console. It is distinct from the `inject` method in that it requires
    * rendered code cell widgets and does not execute them (though it can store
    * the execution message id).
    */
  def addCell(cell: CodeCell): Unit = js.native
  def addCell(cell: CodeCell, msgId: String): Unit = js.native
  /**
    * The list of content cells in the console.
    *
    * #### Notes
    * This list does not include the current banner or the prompt for a console.
    * It may include previous banners as raw cells.
    */
  def cells(): IObservableList[Cell] = js.native
  /**
    * Clear the code cells.
    */
  def clear(): Unit = js.native
  /**
    * Create a new cell with the built-in factory.
    */
  def createCodeCell(): CodeCell = js.native
  /**
    * Execute the current prompt.
    *
    * @param force - Whether to force execution without checking code
    * completeness.
    *
    * @param timeout - The length of time, in milliseconds, that the execution
    * should wait for the API to determine whether code being submitted is
    * incomplete before attempting submission anyway. The default value is `250`.
    */
  def execute(): js.Promise[Unit] = js.native
  def execute(force: Boolean): js.Promise[Unit] = js.native
  def execute(force: Boolean, timeout: Double): js.Promise[Unit] = js.native
  /**
    * A signal emitted when the console finished executing its prompt cell.
    */
  def executed(): ISignal[this.type, Date] = js.native
  /**
    * Get a cell given a message id.
    *
    * @param msgId - The message id.
    */
  def getCell(msgId: String): js.UndefOr[CodeCell] = js.native
  /**
    * Handle the DOM events for the widget.
    *
    * @param event -The DOM event sent to the widget.
    *
    * #### Notes
    * This method implements the DOM `EventListener` interface and is
    * called in response to events on the notebook panel's node. It should
    * not be called directly by user code.
    */
  def handleEvent(event: Event_): Unit = js.native
  /**
    * Inject arbitrary code for the console to execute immediately.
    *
    * @param code - The code contents of the cell being injected.
    *
    * @returns A promise that indicates when the injected cell's execution ends.
    */
  def inject(code: String): js.Promise[Unit] = js.native
  def inject(code: String, metadata: JSONObject): js.Promise[Unit] = js.native
  /**
    * Insert a line break in the prompt cell.
    */
  def insertLinebreak(): Unit = js.native
  /**
    * Make a new prompt cell.
    */
  /* protected */ def newPromptCell(): Unit = js.native
  def promptCell(): CodeCell | Null = js.native
  /**
    * A signal emitted when a new prompt cell is created.
    */
  def promptCellCreated(): ISignal[this.type, CodeCell] = js.native
  /**
    * Replaces the selected text in the prompt cell.
    *
    * @param text - The text to replace the selection.
    */
  def replaceSelection(text: String): Unit = js.native
  /**
    * Serialize the output.
    *
    * #### Notes
    * This only serializes the code cells and the prompt cell if it exists, and
    * skips any old banner cells.
    */
  def serialize(): js.Array[ICodeCell] = js.native
}

