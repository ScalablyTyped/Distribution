package typings.jupyterYdoc.libApiMod

import typings.jupyterYdoc.anon.PartialINotebookContent
import typings.jupyterYdoc.anon.PartialINotebookMetadata
import typings.jupyterYdoc.libApiMod.SharedCell.Cell
import typings.jupyterlabNbformat.mod.INotebookContent
import typings.jupyterlabNbformat.mod.INotebookMetadata
import typings.luminoCoreutils.typesJsonMod.PartialJSONValue
import typings.luminoSignaling.mod.ISignal
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ISharedNotebook
  extends StObject
     with ISharedDocument {
  
  /**
    * Add a shared cell at the notebook bottom.
    *
    * @param cell Cell to add.
    *
    * @returns The added cell.
    */
  def addCell(cell: Cell): ISharedCell = js.native
  
  /**
    * The list of shared cells in the notebook.
    */
  val cells: js.Array[ISharedCell] = js.native
  
  /**
    * The changed signal.
    */
  @JSName("changed")
  val changed_ISharedNotebook: ISignal[this.type, NotebookChange] = js.native
  
  /**
    * Remove a cell.
    *
    * @param index: Index of the cell to remove.
    */
  def deleteCell(index: Double): Unit = js.native
  
  /**
    * Remove a range of cells.
    *
    * @param from: The start index of the range to remove (inclusive).
    *
    * @param to: The end index of the range to remove (exclusive).
    */
  def deleteCellRange(from: Double, to: Double): Unit = js.native
  
  /**
    * Delete a metadata notebook.
    *
    * @param key The key to delete
    */
  def deleteMetadata(key: String): Unit = js.native
  
  /**
    * Wether the undo/redo logic should be
    * considered on the full document across all cells.
    */
  val disableDocumentWideUndoRedo: js.UndefOr[Boolean] = js.native
  
  /**
    * Override the notebook with a JSON-serialized document.
    *
    * @param value The notebook
    */
  def fromJSON(value: INotebookContent): Unit = js.native
  
  /**
    * Get a shared cell by index.
    *
    * @param index: Cell's position.
    *
    * @returns The requested shared cell.
    */
  def getCell(index: Double): ISharedCell = js.native
  
  /**
    * Returns all metadata associated with the notebook.
    *
    * @returns Notebook's metadata.
    */
  def getMetadata(): INotebookMetadata = js.native
  /**
    * Returns a metadata associated with the notebook.
    *
    * @param key Key to get from the metadata
    * @returns Notebook's metadata.
    */
  def getMetadata(key: String): js.UndefOr[PartialJSONValue] = js.native
  
  /**
    * Insert a shared cell into a specific position.
    *
    * @param index Cell's position.
    * @param cell Cell to insert.
    *
    * @returns The inserted cell.
    */
  def insertCell(index: Double, cell: Cell): ISharedCell = js.native
  
  /**
    * Insert a list of shared cells into a specific position.
    *
    * @param index Position to insert the cells.
    * @param cells Array of shared cells to insert.
    *
    * @returns The inserted cells.
    */
  def insertCells(index: Double, cells: js.Array[Cell]): js.Array[ISharedCell] = js.native
  
  /**
    * Notebook metadata.
    */
  var metadata: INotebookMetadata = js.native
  
  /**
    * Signal triggered when a metadata changes.
    */
  val metadataChanged: ISignal[this.type, IMapChange[Any]] = js.native
  
  /**
    * Move a cell.
    *
    * @param fromIndex: Index of the cell to move.
    * @param toIndex: New position of the cell.
    */
  def moveCell(fromIndex: Double, toIndex: Double): Unit = js.native
  
  /**
    * Move cells.
    *
    * @param fromIndex: Index of the first cells to move.
    * @param toIndex: New position of the first cell (in the current array).
    * @param n: Number of cells to move (default 1)
    */
  def moveCells(fromIndex: Double, toIndex: Double): Unit = js.native
  def moveCells(fromIndex: Double, toIndex: Double, n: Double): Unit = js.native
  
  /**
    * The major version number of the nbformat.
    */
  val nbformat: Double = js.native
  
  /**
    * The minor version number of the nbformat.
    */
  val nbformat_minor: Double = js.native
  
  /**
    * Sets a metadata associated with the notebook.
    *
    * @param metadata The key to set.
    * @param value New metadata value
    */
  def setMetadata(metadata: String, value: PartialJSONValue): Unit = js.native
  /**
    * Sets all metadata associated with the notebook.
    *
    * @param metadata All Notebook's metadata.
    */
  def setMetadata(metadata: INotebookMetadata): Unit = js.native
  
  /**
    * Serialize the model to JSON.
    */
  def toJSON(): INotebookContent = js.native
  
  /**
    * Updates the metadata associated with the notebook.
    *
    * @param value: Metadata's attribute to update.
    */
  def updateMetadata(value: PartialINotebookMetadata): Unit = js.native
}
object ISharedNotebook {
  
  /**
    * The options used to initialize a a ISharedNotebook
    */
  trait IOptions extends StObject {
    
    /**
      * The content of the notebook.
      */
    var data: js.UndefOr[PartialINotebookContent] = js.undefined
    
    /**
      * Wether the the undo/redo logic should be
      * considered on the full document across all cells.
      */
    var disableDocumentWideUndoRedo: js.UndefOr[Boolean] = js.undefined
  }
  object IOptions {
    
    inline def apply(): IOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: IOptions] (val x: Self) extends AnyVal {
      
      inline def setData(value: PartialINotebookContent): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      inline def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
      
      inline def setDisableDocumentWideUndoRedo(value: Boolean): Self = StObject.set(x, "disableDocumentWideUndoRedo", value.asInstanceOf[js.Any])
      
      inline def setDisableDocumentWideUndoRedoUndefined: Self = StObject.set(x, "disableDocumentWideUndoRedo", js.undefined)
    }
  }
}
