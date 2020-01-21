package typings.jupyterlabCells.modelMod

import typings.jupyterlabCells.jupyterlabCellsStrings.code
import typings.jupyterlabCells.modelMod.CodeCellModel.IOptions
import typings.jupyterlabCoreutils.nbformatMod.nbformat.ExecutionCount
import typings.jupyterlabOutputarea.modelMod.IOutputAreaModel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- typings.phosphorDisposable.mod.IDisposable because Already inherited
- typings.jupyterlabCodeeditor.editorMod.CodeEditor.IModel because Already inherited
- typings.jupyterlabCells.modelMod.ICellModel because Already inherited
- typings.jupyterlabCells.modelMod.ICodeCellModel because var conflicts: mimeType, mimeTypeChanged, trusted. Inlined executionCount, outputs */ @JSImport("@jupyterlab/cells/lib/model", "CodeCellModel")
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
    * The execution count of the cell.
    */
  var executionCount: ExecutionCount = js.native
  /**
    * The cell outputs.
    */
  val outputs: IOutputAreaModel = js.native
  /**
    * The type of the cell.
    */
  @JSName("type")
  val type_CodeCellModel_ : code = js.native
}

