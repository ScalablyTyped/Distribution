package typings.jupyterlabSharedModels.libApiMod

import typings.jupyterlabNbformat.mod.INotebookMetadata
import typings.jupyterlabSharedModels.anon.PartialINotebookMetadata
import typings.luminoSignaling.mod.ISignal
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ISharedNotebook
  extends StObject
     with ISharedDocument {
  
  /**
    * The list of shared cells in the notebook.
    */
  val cells: js.Array[ISharedCell]
  
  /**
    * The changed signal.
    */
  @JSName("changed")
  val changed_ISharedNotebook: ISignal[this.type, NotebookChange]
  
  /**
    * Remove a cell.
    *
    * @param index: Index of the cell to remove.
    */
  def deleteCell(index: Double): Unit
  
  /**
    * Remove a range of cells.
    *
    * @param from: The start index of the range to remove (inclusive).
    *
    * @param to: The end index of the range to remove (exclusive).
    */
  def deleteCellRange(from: Double, to: Double): Unit
  
  /**
    * Get a shared cell by index.
    *
    * @param index: Cell's position.
    *
    * @returns The requested shared cell.
    */
  def getCell(index: Double): ISharedCell
  
  /**
    * Returns the metadata associated with the notebook.
    *
    * @returns Notebook's metadata.
    */
  def getMetadata(): INotebookMetadata
  
  /**
    * Insert a shared cell into a specific position.
    *
    * @param index: Cell's position.
    *
    * @param cell: Cell to insert.
    */
  def insertCell(index: Double, cell: ISharedCell): Unit
  
  /**
    * Insert a list of shared cells into a specific position.
    *
    * @param index: Position to insert the cells.
    *
    * @param cells: Array of shared cells to insert.
    */
  def insertCells(index: Double, cells: js.Array[ISharedCell]): Unit
  
  /**
    * Move a cell.
    *
    * @param fromIndex: Index of the cell to move.
    *
    * @param toIndex: New position of the cell.
    */
  def moveCell(fromIndex: Double, toIndex: Double): Unit
  
  /**
    * The major version number of the nbformat.
    */
  val nbformat: Double
  
  /**
    * The minor version number of the nbformat.
    */
  val nbformat_minor: Double
  
  /**
    * Sets the metadata associated with the notebook.
    *
    * @param metadata: Notebook's metadata.
    */
  def setMetadata(metadata: INotebookMetadata): Unit
  
  /**
    * Updates the metadata associated with the notebook.
    *
    * @param value: Metadata's attribute to update.
    */
  def updateMetadata(value: PartialINotebookMetadata): Unit
}
object ISharedNotebook {
  
  inline def apply(
    canRedo: () => Boolean,
    canUndo: () => Boolean,
    cells: js.Array[ISharedCell],
    changed: ISignal[ISharedNotebook, NotebookChange],
    clearUndoHistory: () => Unit,
    deleteCell: Double => Unit,
    deleteCellRange: (Double, Double) => Unit,
    dirty: Boolean,
    dispose: () => Unit,
    getCell: Double => ISharedCell,
    getMetadata: () => INotebookMetadata,
    insertCell: (Double, ISharedCell) => Unit,
    insertCells: (Double, js.Array[ISharedCell]) => Unit,
    isDisposed: Boolean,
    moveCell: (Double, Double) => Unit,
    nbformat: Double,
    nbformat_minor: Double,
    redo: () => Unit,
    setMetadata: INotebookMetadata => Unit,
    transact: js.Function0[Unit] => Unit,
    undo: () => Unit,
    updateMetadata: PartialINotebookMetadata => Unit
  ): ISharedNotebook = {
    val __obj = js.Dynamic.literal(canRedo = js.Any.fromFunction0(canRedo), canUndo = js.Any.fromFunction0(canUndo), cells = cells.asInstanceOf[js.Any], changed = changed.asInstanceOf[js.Any], clearUndoHistory = js.Any.fromFunction0(clearUndoHistory), deleteCell = js.Any.fromFunction1(deleteCell), deleteCellRange = js.Any.fromFunction2(deleteCellRange), dirty = dirty.asInstanceOf[js.Any], dispose = js.Any.fromFunction0(dispose), getCell = js.Any.fromFunction1(getCell), getMetadata = js.Any.fromFunction0(getMetadata), insertCell = js.Any.fromFunction2(insertCell), insertCells = js.Any.fromFunction2(insertCells), isDisposed = isDisposed.asInstanceOf[js.Any], moveCell = js.Any.fromFunction2(moveCell), nbformat = nbformat.asInstanceOf[js.Any], nbformat_minor = nbformat_minor.asInstanceOf[js.Any], redo = js.Any.fromFunction0(redo), setMetadata = js.Any.fromFunction1(setMetadata), transact = js.Any.fromFunction1(transact), undo = js.Any.fromFunction0(undo), updateMetadata = js.Any.fromFunction1(updateMetadata))
    __obj.asInstanceOf[ISharedNotebook]
  }
  
  /**
    * The options used to initialize a a ISharedNotebook
    */
  trait IOptions extends StObject {
    
    /**
      * Wether the the undo/redo logic should be
      * considered on the full document across all cells.
      */
    var disableDocumentWideUndoRedo: Boolean
  }
  object IOptions {
    
    inline def apply(disableDocumentWideUndoRedo: Boolean): IOptions = {
      val __obj = js.Dynamic.literal(disableDocumentWideUndoRedo = disableDocumentWideUndoRedo.asInstanceOf[js.Any])
      __obj.asInstanceOf[IOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: IOptions] (val x: Self) extends AnyVal {
      
      inline def setDisableDocumentWideUndoRedo(value: Boolean): Self = StObject.set(x, "disableDocumentWideUndoRedo", value.asInstanceOf[js.Any])
    }
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ISharedNotebook] (val x: Self) extends AnyVal {
    
    inline def setCells(value: js.Array[ISharedCell]): Self = StObject.set(x, "cells", value.asInstanceOf[js.Any])
    
    inline def setCellsVarargs(value: ISharedCell*): Self = StObject.set(x, "cells", js.Array(value*))
    
    inline def setChanged(value: ISignal[ISharedNotebook, NotebookChange]): Self = StObject.set(x, "changed", value.asInstanceOf[js.Any])
    
    inline def setDeleteCell(value: Double => Unit): Self = StObject.set(x, "deleteCell", js.Any.fromFunction1(value))
    
    inline def setDeleteCellRange(value: (Double, Double) => Unit): Self = StObject.set(x, "deleteCellRange", js.Any.fromFunction2(value))
    
    inline def setGetCell(value: Double => ISharedCell): Self = StObject.set(x, "getCell", js.Any.fromFunction1(value))
    
    inline def setGetMetadata(value: () => INotebookMetadata): Self = StObject.set(x, "getMetadata", js.Any.fromFunction0(value))
    
    inline def setInsertCell(value: (Double, ISharedCell) => Unit): Self = StObject.set(x, "insertCell", js.Any.fromFunction2(value))
    
    inline def setInsertCells(value: (Double, js.Array[ISharedCell]) => Unit): Self = StObject.set(x, "insertCells", js.Any.fromFunction2(value))
    
    inline def setMoveCell(value: (Double, Double) => Unit): Self = StObject.set(x, "moveCell", js.Any.fromFunction2(value))
    
    inline def setNbformat(value: Double): Self = StObject.set(x, "nbformat", value.asInstanceOf[js.Any])
    
    inline def setNbformat_minor(value: Double): Self = StObject.set(x, "nbformat_minor", value.asInstanceOf[js.Any])
    
    inline def setSetMetadata(value: INotebookMetadata => Unit): Self = StObject.set(x, "setMetadata", js.Any.fromFunction1(value))
    
    inline def setUpdateMetadata(value: PartialINotebookMetadata => Unit): Self = StObject.set(x, "updateMetadata", js.Any.fromFunction1(value))
  }
}
