package typings.jupyterlabCells.modelMod

import typings.jupyterlabCells.jupyterlabCellsStrings.code
import typings.jupyterlabCells.modelMod.CodeCellModel.IOptions
import typings.jupyterlabNbformat.mod.ExecutionCount
import typings.jupyterlabOutputarea.modelMod.IOutputAreaModel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- typings.luminoDisposable.mod.IDisposable because Already inherited
- typings.jupyterlabCodeeditor.editorMod.CodeEditor.IModel because Already inherited
- typings.jupyterlabCells.modelMod.ICellModel because Already inherited
- typings.jupyterlabCells.modelMod.ICodeCellModel because var conflicts: metadata, mimeType, mimeTypeChanged, trusted. Inlined executionCount, outputs, clearExecution */ @JSImport("@jupyterlab/cells/lib/model", "CodeCellModel")
@js.native
class CodeCellModel_ protected () extends CellModel {
  /**
    * Construct a new code cell with optional original cell content.
    */
  def this(options: IOptions) = this()
  /**
    * Handle a change to the execution count.
    */
  var _onExecutionCountChanged: js.Any = js.native
  var _outputs: js.Any = js.native
  /**
    * The code cell's prompt number. Will be null if the cell has not been run.
    */
  @JSName("executionCount")
  var executionCount_FCodeCellModel_ : ExecutionCount = js.native
  /**
    * The cell outputs.
    */
  @JSName("outputs")
  val outputs_FCodeCellModel_ : IOutputAreaModel = js.native
  /**
    * Clear execution, outputs, and related metadata
    */
  def clearExecution(): Unit = js.native
  /**
    * The execution count of the cell.
    */
  def executionCount(): ExecutionCount = js.native
  def executionCount(newValue: ExecutionCount): js.Any = js.native
  /**
    * The cell outputs.
    */
  def outputs(): IOutputAreaModel = js.native
  /**
    * The type of the cell.
    */
  @JSName("type")
  def type_MCodeCellModel_(): code = js.native
}

