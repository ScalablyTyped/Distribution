package typings.atJupyterlabCells.libWidgetMod

import typings.atJupyterlabCells.libModelMod.ICellModel
import typings.atJupyterlabCells.libModelMod.ICodeCellModel
import typings.atJupyterlabCells.libWidgetMod.CodeCell.IOptions
import typings.atJupyterlabCoreutils.libInterfacesMod.IChangedArgs
import typings.atJupyterlabOutputarea.atJupyterlabOutputareaMod.OutputArea
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@jupyterlab/cells/lib/widget", "CodeCell")
@js.native
class CodeCell_ protected () extends Cell {
  /**
    * Construct a code cell widget.
    */
  def this(options: IOptions) = this()
  var _output: js.Any = js.native
  var _outputHidden: js.Any = js.native
  /**
    * Handle changes in the number of outputs in the output area.
    */
  var _outputLengthHandler: js.Any = js.native
  var _outputPlaceholder: js.Any = js.native
  var _outputWrapper: js.Any = js.native
  var _outputsScrolled: js.Any = js.native
  var _rendermime: js.Any = js.native
  var _savingMetadata: js.Any = js.native
  var _syncScrolled: js.Any = js.native
  /**
    * The model used by the widget.
    */
  @JSName("model")
  val model_CodeCell_ : ICodeCellModel = js.native
  /**
    * Get the output area for the cell.
    */
  val outputArea: OutputArea = js.native
  /**
    * The view state of output being collapsed.
    */
  var outputHidden: Boolean = js.native
  /**
    * Whether the output is in a scrolled state?
    */
  var outputsScrolled: Boolean = js.native
  /**
    * Whether to sync the scrolled state to the cell model.
    */
  var syncScrolled: Boolean = js.native
  /**
    * Clone the OutputArea alone, returning a simplified output area, using the same model.
    */
  def cloneOutputArea(): OutputArea = js.native
  /**
    * Revert view collapse state from model.
    */
  def loadScrolledState(): Unit = js.native
  /**
    * Handle changes in the model.
    */
  /* protected */ def onStateChanged(model: ICellModel, args: IChangedArgs[_, String]): Unit = js.native
  /**
    * Save view collapse state to model
    */
  def saveScrolledState(): Unit = js.native
}

