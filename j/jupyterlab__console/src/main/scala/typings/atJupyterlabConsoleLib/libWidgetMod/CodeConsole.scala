package typings
package atJupyterlabConsoleLib.libWidgetMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@jupyterlab/console/lib/widget", "CodeConsole")
@js.native
class CodeConsole protected ()
  extends atPhosphorWidgetsLib.atPhosphorWidgetsMod.Widget {
  /**
    * Construct a console widget.
    */
  def this(options: atJupyterlabConsoleLib.libWidgetMod.CodeConsoleNs.IOptions) = this()
  var _banner: js.Any = js.native
  var _cells: js.Any = js.native
  var _content: js.Any = js.native
  /**
    * Create a new foreign cell.
    */
  var _createCodeCell: js.Any = js.native
  /**
    * Create the options used to initialize a code cell widget.
    */
  var _createCodeCellOptions: js.Any = js.native
  /**
    * Handle the `'click'` event for the widget.
    */
  var _evtClick: js.Any = js.native
  /**
    * Handle the `'keydown'` event for the widget.
    */
  var _evtKeyDown: js.Any = js.native
  /**
    * Execute the code in the current prompt cell.
    */
  var _execute: js.Any = js.native
  var _executed: js.Any = js.native
  var _foreignHandler: js.Any = js.native
  /**
    * Update the console based on the kernel info.
    */
  var _handleInfo: js.Any = js.native
  var _history: js.Any = js.native
  var _input: js.Any = js.native
  var _mimeTypeService: js.Any = js.native
  var _mimetype: js.Any = js.native
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
    * The list of content cells in the console.
    *
    * #### Notes
    * This list does not include the current banner or the prompt for a console.
    * It may include previous banners as raw cells.
    */
  val cells: atJupyterlabObservablesLib.libObservablelistMod.IObservableList[atJupyterlabCellsLib.atJupyterlabCellsMod.Cell] = js.native
  /**
    * The content factory used by the console.
    */
  val contentFactory: atJupyterlabConsoleLib.libWidgetMod.CodeConsoleNs.IContentFactory = js.native
  /**
    * A signal emitted when the console finished executing its prompt cell.
    */
  val executed: atPhosphorSignalingLib.atPhosphorSignalingMod.ISignal[this.type, stdLib.Date] = js.native
  /**
    * The model factory for the console widget.
    */
  val modelFactory: atJupyterlabConsoleLib.libWidgetMod.CodeConsoleNs.IModelFactory = js.native
  val promptCell: atJupyterlabCellsLib.atJupyterlabCellsMod.CodeCell | scala.Null = js.native
  /**
    * A signal emitted when a new prompt cell is created.
    */
  val promptCellCreated: atPhosphorSignalingLib.atPhosphorSignalingMod.ISignal[this.type, atJupyterlabCellsLib.atJupyterlabCellsMod.CodeCell] = js.native
  /**
    * The rendermime instance used by the console.
    */
  val rendermime: atJupyterlabRendermimeLib.atJupyterlabRendermimeMod.RenderMimeRegistry = js.native
  /**
    * The client session used by the console.
    */
  val session: atJupyterlabApputilsLib.libClientsessionMod.IClientSession = js.native
  /**
    * Set whether the foreignHandler is able to inject foreign cells into a
    * console.
    */
  var showAllActivity: scala.Boolean = js.native
  def addBanner(): scala.Unit = js.native
  /**
    * Add a new cell to the content panel.
    *
    * @param cell - The cell widget being added to the content panel.
    *
    * #### Notes
    * This method is meant for use by outside classes that want to inject content
    * into a console. It is distinct from the `inject` method in that it requires
    * rendered code cell widgets and does not execute them.
    */
  def addCell(cell: atJupyterlabCellsLib.atJupyterlabCellsMod.Cell): scala.Unit = js.native
  /**
    * Clear the code cells.
    */
  def clear(): scala.Unit = js.native
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
  def execute(): js.Promise[scala.Unit] = js.native
  def execute(force: scala.Boolean): js.Promise[scala.Unit] = js.native
  def execute(force: scala.Boolean, timeout: scala.Double): js.Promise[scala.Unit] = js.native
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
  /**
    * Inject arbitrary code for the console to execute immediately.
    *
    * @param code - The code contents of the cell being injected.
    *
    * @returns A promise that indicates when the injected cell's execution ends.
    */
  def inject(code: java.lang.String): js.Promise[scala.Unit] = js.native
  /**
    * Insert a line break in the prompt cell.
    */
  def insertLinebreak(): scala.Unit = js.native
  /**
    * Make a new prompt cell.
    */
  /* protected */ def newPromptCell(): scala.Unit = js.native
  /**
    * Serialize the output.
    *
    * #### Notes
    * This only serializes the code cells and the prompt cell if it exists, and
    * skips any old banner cells.
    */
  def serialize(): js.Array[atJupyterlabCoreutilsLib.libNbformatMod.nbformatNs.ICodeCell] = js.native
}

