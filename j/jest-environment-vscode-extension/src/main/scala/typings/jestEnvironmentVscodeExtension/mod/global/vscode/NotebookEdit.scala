package typings.jestEnvironmentVscodeExtension.mod.global.vscode

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("vscode.NotebookEdit")
@js.native
open class NotebookEdit protected ()
  extends typings.vscode.mod.NotebookEdit {
  def this(range: typings.vscode.mod.NotebookRange, newCells: js.Array[typings.vscode.mod.NotebookCellData]) = this()
}
/* static members */
object NotebookEdit {
  
  @JSGlobal("vscode.NotebookEdit")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Utility to create an edit that deletes cells in a notebook.
    *
    * @param range The range of cells to delete.
    */
  inline def deleteCells(range: typings.vscode.mod.NotebookRange): typings.vscode.mod.NotebookEdit = ^.asInstanceOf[js.Dynamic].applyDynamic("deleteCells")(range.asInstanceOf[js.Any]).asInstanceOf[typings.vscode.mod.NotebookEdit]
  
  /**
    * Utility to create an edit that replaces cells in a notebook.
    *
    * @param index The index to insert cells at.
    * @param newCells The new notebook cells.
    */
  inline def insertCells(index: Double, newCells: js.Array[typings.vscode.mod.NotebookCellData]): typings.vscode.mod.NotebookEdit = (^.asInstanceOf[js.Dynamic].applyDynamic("insertCells")(index.asInstanceOf[js.Any], newCells.asInstanceOf[js.Any])).asInstanceOf[typings.vscode.mod.NotebookEdit]
  
  /**
    * Utility to create a edit that replaces cells in a notebook.
    *
    * @param range The range of cells to replace
    * @param newCells The new notebook cells.
    */
  inline def replaceCells(range: typings.vscode.mod.NotebookRange, newCells: js.Array[typings.vscode.mod.NotebookCellData]): typings.vscode.mod.NotebookEdit = (^.asInstanceOf[js.Dynamic].applyDynamic("replaceCells")(range.asInstanceOf[js.Any], newCells.asInstanceOf[js.Any])).asInstanceOf[typings.vscode.mod.NotebookEdit]
  
  /**
    * Utility to create an edit that update a cell's metadata.
    *
    * @param index The index of the cell to update.
    * @param newCellMetadata The new metadata for the cell.
    */
  inline def updateCellMetadata(index: Double, newCellMetadata: StringDictionary[Any]): typings.vscode.mod.NotebookEdit = (^.asInstanceOf[js.Dynamic].applyDynamic("updateCellMetadata")(index.asInstanceOf[js.Any], newCellMetadata.asInstanceOf[js.Any])).asInstanceOf[typings.vscode.mod.NotebookEdit]
  
  /**
    * Utility to create an edit that updates the notebook's metadata.
    *
    * @param newNotebookMetadata The new metadata for the notebook.
    */
  inline def updateNotebookMetadata(newNotebookMetadata: StringDictionary[Any]): typings.vscode.mod.NotebookEdit = ^.asInstanceOf[js.Dynamic].applyDynamic("updateNotebookMetadata")(newNotebookMetadata.asInstanceOf[js.Any]).asInstanceOf[typings.vscode.mod.NotebookEdit]
}
