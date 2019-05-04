package typings
package atJupyterlabCellsLib.libWidgetMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@jupyterlab/cells/lib/widget", "CodeCell")
@js.native
class CodeCell protected () extends Cell {
  /**
    * Construct a code cell widget.
    */
  def this(options: atJupyterlabCellsLib.libWidgetMod.CodeCellNs.IOptions) = this()
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
  /**
    * The model used by the widget.
    */
  @JSName("model")
  val model_CodeCell: atJupyterlabCellsLib.libModelMod.ICodeCellModel = js.native
  /**
    * Get the output area for the cell.
    */
  val outputArea: atJupyterlabOutputareaLib.atJupyterlabOutputareaMod.OutputArea = js.native
  /**
    * The view state of output being collapsed.
    */
  var outputHidden: scala.Boolean = js.native
  /**
    * Whether the output is in a scrolled state?
    */
  var outputsScrolled: scala.Boolean = js.native
  /**
    * Clone the OutputArea alone, returning a simplified output area, using the same model.
    */
  def cloneOutputArea(): atJupyterlabOutputareaLib.atJupyterlabOutputareaMod.OutputArea = js.native
  /**
    * Handle changes in the metadata.
    */
  /* protected */ def onMetadataChanged(
    model: atJupyterlabObservablesLib.libObservablemapMod.IObservableMap[atPhosphorCoreutilsLib.libJsonMod.JSONValue],
    args: atJupyterlabObservablesLib.libObservablemapMod.IObservableMapNs.IChangedArgs[atPhosphorCoreutilsLib.libJsonMod.JSONValue]
  ): scala.Unit = js.native
  /**
    * Handle changes in the model.
    */
  /* protected */ def onStateChanged(
    model: atJupyterlabCellsLib.libModelMod.ICellModel,
    args: atJupyterlabCoreutilsLib.libInterfacesMod.IChangedArgs[_]
  ): scala.Unit = js.native
}

