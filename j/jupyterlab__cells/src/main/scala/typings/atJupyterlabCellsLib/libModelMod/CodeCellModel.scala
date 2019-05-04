package typings
package atJupyterlabCellsLib.libModelMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- atJupyterlabCellsLib.libModelMod.ICodeCellModel because var conflicts: trusted. Inlined executionCount, outputs */ @JSImport("@jupyterlab/cells/lib/model", "CodeCellModel")
@js.native
class CodeCellModel protected () extends CellModel {
  /**
    * Construct a new code cell with optional original cell content.
    */
  def this(options: atJupyterlabCellsLib.libModelMod.CodeCellModelNs.IOptions) = this()
  /**
    * Handle a change to the execution count.
    */
  var _onExecutionCountChanged: js.Any = js.native
  var _outputs: js.Any = js.native
  /**
    * The execution count of the cell.
    */
  var executionCount: atJupyterlabCoreutilsLib.libNbformatMod.nbformatNs.ExecutionCount = js.native
  /**
    * The cell outputs.
    */
  val outputs: atJupyterlabOutputareaLib.libModelMod.IOutputAreaModel = js.native
  /**
    * The type of the cell.
    */
  @JSName("type")
  val type_CodeCellModel: atJupyterlabCellsLib.atJupyterlabCellsLibStrings.code = js.native
  /**
    * Dispose of the resources held by the model.
    */
  def dispose(): scala.Unit = js.native
}

