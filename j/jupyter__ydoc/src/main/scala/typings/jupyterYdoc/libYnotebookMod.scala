package typings.jupyterYdoc

import typings.jupyterYdoc.anon.OmitIOptionsdata
import typings.jupyterYdoc.anon.PartialINotebookMetadata
import typings.jupyterYdoc.libApiMod.IMapChange
import typings.jupyterYdoc.libApiMod.ISharedCell
import typings.jupyterYdoc.libApiMod.ISharedNotebook.IOptions
import typings.jupyterYdoc.libApiMod.NotebookChange
import typings.jupyterYdoc.libApiMod.SharedCell.Cell
import typings.jupyterYdoc.libYcellMod.YBaseCell
import typings.jupyterYdoc.libYcellMod.YCellType
import typings.jupyterYdoc.libYdocumentMod.YDocument
import typings.jupyterlabNbformat.mod.IBaseCellMetadata
import typings.jupyterlabNbformat.mod.INotebookContent
import typings.jupyterlabNbformat.mod.INotebookMetadata
import typings.luminoCoreutils.typesJsonMod.PartialJSONValue
import typings.luminoSignaling.mod.ISignal
import typings.luminoSignaling.mod.Signal
import typings.yjs.mod.Array
import typings.yjs.mod.Map
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libYnotebookMod {
  
  /* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
  - typings.luminoDisposable.mod.IDisposable because Already inherited
  - typings.luminoDisposable.mod.IObservableDisposable because Already inherited
  - typings.jupyterYdoc.libApiMod.ISharedBase because Already inherited
  - typings.jupyterYdoc.libApiMod.ISharedDocument because Already inherited
  - typings.jupyterYdoc.libApiMod.ISharedNotebook because var conflicts: changed, disposed, isDisposed, state. Inlined metadataChanged, cells, disableDocumentWideUndoRedo, metadata, nbformat_minor, nbformat, deleteMetadata, getMetadata, getMetadata, setMetadata, setMetadata, updateMetadata, addCell, getCell, insertCell, insertCells, moveCell, moveCells, moveCells, deleteCell, deleteCellRange, fromJSON, toJSON */ @JSImport("@jupyter/ydoc/lib/ynotebook", "YNotebook")
  @js.native
  /**
    * Create a new notebook
    *
    * #### Notes
    * The document is empty and must be populated
    *
    * @param options
    */
  open class YNotebook () extends YDocument[NotebookChange] {
    def this(options: OmitIOptionsdata) = this()
    
    /* private */ var _disableDocumentWideUndoRedo: Any = js.native
    
    /* protected */ var _metadataChanged: Signal[this.type, IMapChange[Any]] = js.native
    
    /**
      * Handle a change to the ystate.
      */
    /* private */ var _onMetaChanged: Any = js.native
    
    /**
      * Handle a change to the list of cells.
      */
    /* private */ var _onYCellsChanged: Any = js.native
    
    /* private */ var _ycellMapping: Any = js.native
    
    /**
      * Internal Yjs cells list
      */
    /* protected */ val _ycells: Array[Map[Any]] = js.native
    
    /**
      * Add a shared cell at the notebook bottom.
      *
      * @param cell Cell to add.
      *
      * @returns The added cell.
      */
    def addCell(cell: Cell): YBaseCell[IBaseCellMetadata] = js.native
    /**
      * Add a shared cell at the notebook bottom.
      *
      * @param cell Cell to add.
      *
      * @returns The added cell.
      */
    @JSName("addCell")
    def addCell_ISharedCell(cell: Cell): ISharedCell = js.native
    
    /**
      * Cells list
      */
    val cells: js.Array[ISharedCell | YCellType] = js.native
    
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
      * @param to: The end index of the range to remove (exclusive).
      */
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
      *
      * Default: false
      */
    def disableDocumentWideUndoRedo: Boolean = js.native
    /**
      * Wether the undo/redo logic should be
      * considered on the full document across all cells.
      */
    @JSName("disableDocumentWideUndoRedo")
    val disableDocumentWideUndoRedo_FYNotebook: js.UndefOr[Boolean] = js.native
    
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
    def getCell(index: Double): YCellType = js.native
    /**
      * Get a shared cell by index.
      *
      * @param index: Cell's position.
      *
      * @returns The requested shared cell.
      */
    @JSName("getCell")
    def getCell_ISharedCell(index: Double): ISharedCell = js.native
    
    /**
      * Returns some metadata associated with the notebook.
      *
      * If no `key` is provided, it will return all metadata.
      * Else it will return the value for that key.
      *
      * @param key Key to get from the metadata
      * @returns Notebook's metadata.
      */
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
      * @param index: Cell's position.
      * @param cell: Cell to insert.
      *
      * @returns The inserted cell.
      */
    def insertCell(index: Double, cell: Cell): YBaseCell[IBaseCellMetadata] = js.native
    /**
      * Insert a shared cell into a specific position.
      *
      * @param index Cell's position.
      * @param cell Cell to insert.
      *
      * @returns The inserted cell.
      */
    @JSName("insertCell")
    def insertCell_ISharedCell(index: Double, cell: Cell): ISharedCell = js.native
    
    /**
      * Insert a list of shared cells into a specific position.
      *
      * @param index: Position to insert the cells.
      * @param cells: Array of shared cells to insert.
      *
      * @returns The inserted cells.
      */
    /**
      * Insert a list of shared cells into a specific position.
      *
      * @param index Position to insert the cells.
      * @param cells Array of shared cells to insert.
      *
      * @returns The inserted cells.
      */
    def insertCells(index: Double, cells: js.Array[Cell]): js.Array[YBaseCell[IBaseCellMetadata]] = js.native
    
    /**
      * Notebook metadata
      */
    def metadata: INotebookMetadata = js.native
    
    /**
      * Signal triggered when a metadata changes.
      */
    def metadataChanged: ISignal[this.type, IMapChange[Any]] = js.native
    /**
      * Signal triggered when a metadata changes.
      */
    @JSName("metadataChanged")
    val metadataChanged_FYNotebook: ISignal[this.type, IMapChange[Any]] = js.native
    
    def metadata_=(v: INotebookMetadata): Unit = js.native
    /**
      * Notebook metadata.
      */
    @JSName("metadata")
    var metadata_FYNotebook: INotebookMetadata = js.native
    
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
      * nbformat major version
      */
    def nbformat: Double = js.native
    def nbformat_=(value: Double): Unit = js.native
    /**
      * The major version number of the nbformat.
      */
    @JSName("nbformat")
    val nbformat_FYNotebook: Double = js.native
    
    /**
      * nbformat minor version
      */
    def nbformat_minor: Double = js.native
    def nbformat_minor_=(value: Double): Unit = js.native
    /**
      * The minor version number of the nbformat.
      */
    @JSName("nbformat_minor")
    val nbformat_minor_FYNotebook: Double = js.native
    
    /**
      * Sets a metadata associated with the notebook.
      *
      * @param metadata The key to set.
      * @param value New metadata value
      */
    def setMetadata(metadata: String, value: PartialJSONValue): Unit = js.native
    /**
      * Sets some metadata associated with the notebook.
      *
      * If only one argument is provided, it will override all notebook metadata.
      * Otherwise a single key will be set to a new value.
      *
      * @param metadata All Notebook's metadata or the key to set.
      * @param value New metadata value
      */
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
    
    /**
      * YJS map for the notebook metadata
      */
    val ymeta: Map[Any] = js.native
  }
  /* static members */
  object YNotebook {
    
    @JSImport("@jupyter/ydoc/lib/ynotebook", "YNotebook")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates a standalone YNotebook
      *
      * Note: This method is useful when we need to initialize
      * the YNotebook from the JavaScript side.
      */
    inline def create(): YNotebook = ^.asInstanceOf[js.Dynamic].applyDynamic("create")().asInstanceOf[YNotebook]
    inline def create(options: IOptions): YNotebook = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(options.asInstanceOf[js.Any]).asInstanceOf[YNotebook]
  }
}
