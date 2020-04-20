package typings.jupyterlabCells.widgetMod

import typings.jupyterlabCells.modelMod.ICellModel
import typings.jupyterlabCells.modelMod.ICodeCellModel
import typings.jupyterlabCells.widgetMod.CodeCell.IOptions
import typings.jupyterlabCoreutils.interfacesMod.IChangedArgs
import typings.jupyterlabOutputarea.mod.OutputArea
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
  val model_FCodeCell_ : ICodeCellModel = js.native
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
  /* protected */ def onStateChanged(model: ICellModel, args: IChangedArgs[_, _, String]): Unit = js.native
  /**
    * Get the output area for the cell.
    */
  def outputArea: OutputArea = js.native
  /**
    * The view state of output being collapsed.
    */
  def outputHidden: Boolean = js.native
  def outputHidden(value: Boolean): js.Any = js.native
  /**
    * Whether the output is in a scrolled state?
    */
  def outputsScrolled: Boolean = js.native
  def outputsScrolled(value: Boolean): js.Any = js.native
  /**
    * Save view collapse state to model
    */
  def saveScrolledState(): Unit = js.native
  /**
    * Whether to sync the scrolled state to the cell model.
    */
  def syncScrolled: Boolean = js.native
  def syncScrolled(value: Boolean): js.Any = js.native
}

