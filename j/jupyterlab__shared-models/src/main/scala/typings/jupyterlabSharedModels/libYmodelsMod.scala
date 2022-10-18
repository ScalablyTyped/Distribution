package typings.jupyterlabSharedModels

import typings.jupyterlabNbformat.mod.ExecutionCount
import typings.jupyterlabNbformat.mod.IAttachments
import typings.jupyterlabNbformat.mod.INotebookMetadata
import typings.jupyterlabNbformat.mod.IOutput
import typings.jupyterlabSharedModels.anon.PartialINotebookMetadata
import typings.jupyterlabSharedModels.jupyterlabSharedModelsStrings.code
import typings.jupyterlabSharedModels.jupyterlabSharedModelsStrings.markdown
import typings.jupyterlabSharedModels.jupyterlabSharedModelsStrings.raw
import typings.jupyterlabSharedModels.libApiMod.CellChange
import typings.jupyterlabSharedModels.libApiMod.DocumentChange
import typings.jupyterlabSharedModels.libApiMod.FileChange
import typings.jupyterlabSharedModels.libApiMod.ISharedBaseCell
import typings.jupyterlabSharedModels.libApiMod.ISharedBaseCellMetadata
import typings.jupyterlabSharedModels.libApiMod.ISharedCell
import typings.jupyterlabSharedModels.libApiMod.ISharedDocument
import typings.jupyterlabSharedModels.libApiMod.ISharedNotebook
import typings.jupyterlabSharedModels.libApiMod.ISharedNotebook.IOptions
import typings.jupyterlabSharedModels.libApiMod.ISharedText
import typings.jupyterlabSharedModels.libApiMod.NotebookChange
import typings.luminoSignaling.mod.ISignal
import typings.luminoSignaling.mod.Signal
import typings.yProtocols.awarenessMod.Awareness
import typings.yjs.mod.Array
import typings.yjs.mod.Doc
import typings.yjs.mod.Map
import typings.yjs.mod.Text
import typings.yjs.mod.UndoManager
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libYmodelsMod {
  
  @JSImport("@jupyterlab/shared-models/lib/ymodels", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@jupyterlab/shared-models/lib/ymodels", JSImport.Default)
  @js.native
  open class default protected () extends YNotebook {
    def this(options: IOptions) = this()
  }
  /* static members */
  object default {
    
    @JSImport("@jupyterlab/shared-models/lib/ymodels", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Create a new YNotebook.
      */
    inline def create(disableDocumentWideUndoRedo: Boolean): ISharedNotebook = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(disableDocumentWideUndoRedo.asInstanceOf[js.Any]).asInstanceOf[ISharedNotebook]
  }
  
  @JSImport("@jupyterlab/shared-models/lib/ymodels", "YBaseCell")
  @js.native
  open class YBaseCell[Metadata /* <: ISharedBaseCellMetadata */] protected ()
    extends StObject
       with ISharedBaseCell[Metadata]
       with IYText {
    def this(ymodel: Map[Any]) = this()
    
    /* private */ var _awareness: Any = js.native
    
    /* private */ var _changed: Any = js.native
    
    /**
      * Handle a change to the ymodel.
      */
    /* private */ var _modelObserver: Any = js.native
    
    /**
      * The notebook that this cell belongs to.
      */
    /* protected */ var _notebook: YNotebook | Null = js.native
    
    /* private */ var _prevSourceLength: Any = js.native
    
    /* private */ var _undoManager: Any = js.native
    
    @JSName("awareness")
    def awareness_MYBaseCell: Awareness | Null = js.native
    
    /**
      * Whether the object can undo changes.
      */
    /* CompleteClass */
    override def canRedo(): Boolean = js.native
    
    /**
      * Whether the object can redo changes.
      */
    /* CompleteClass */
    override def canUndo(): Boolean = js.native
    
    /**
      * The type of the cell.
      */
    @JSName("cell_type")
    def cell_type_MYBaseCell: Any = js.native
    
    /**
      * The changed signal.
      */
    @JSName("changed")
    def changed_MYBaseCell: ISignal[this.type, CellChange[Metadata]] = js.native
    
    /**
      * Clear the change stack.
      */
    /* CompleteClass */
    override def clearUndoHistory(): Unit = js.native
    
    /**
      * Dispose of the resources held by the object.
      *
      * #### Notes
      * If the object's `dispose` method is called more than once, all
      * calls made after the first will be a no-op.
      *
      * #### Undefined Behavior
      * It is undefined behavior to use any functionality of the object
      * after it has been disposed unless otherwise explicitly noted.
      */
    /* CompleteClass */
    override def dispose(): Unit = js.native
    
    /**
      * Gets the cell attachments.
      *
      * @returns The cell attachments.
      */
    def getAttachments(): js.UndefOr[IAttachments] = js.native
    
    /**
      * Test whether the object has been disposed.
      *
      * #### Notes
      * This property is always safe to access.
      */
    /* CompleteClass */
    override val isDisposed: Boolean = js.native
    
    /**
      * The notebook that this cell belongs to.
      */
    def notebook: YNotebook | Null = js.native
    
    /**
      * Redo an operation.
      */
    /* CompleteClass */
    override def redo(): Unit = js.native
    
    /**
      * Sets the cell attachments
      *
      * @param attachments: The cell attachments.
      */
    def setAttachments(): Unit = js.native
    def setAttachments(attachments: IAttachments): Unit = js.native
    
    /**
      * Perform a transaction. While the function f is called, all changes to the shared
      * document are bundled into a single event.
      */
    /* CompleteClass */
    override def transact(f: js.Function0[Unit]): Unit = js.native
    def transact(f: js.Function0[Unit], undoable: Boolean): Unit = js.native
    
    /**
      * Undo an operation.
      */
    /* CompleteClass */
    override def undo(): Unit = js.native
    
    /**
      * Set the undoManager when adding new cells.
      */
    def undoManager_=(undoManager: UndoManager | Null): Unit = js.native
    /**
      * The notebook that this cell belongs to.
      */
    @JSName("undoManager")
    def undoManager_MYBaseCell: UndoManager | Null = js.native
    
    var ymodel: Map[Any] = js.native
    
    @JSName("ysource")
    def ysource_MYBaseCell: Text = js.native
  }
  /* static members */
  object YBaseCell {
    
    @JSImport("@jupyterlab/shared-models/lib/ymodels", "YBaseCell")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Create a new YRawCell that can be inserted into a YNotebook
      */
    inline def create(): YBaseCell[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("create")().asInstanceOf[YBaseCell[Any]]
    inline def create(id: String): YBaseCell[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(id.asInstanceOf[js.Any]).asInstanceOf[YBaseCell[Any]]
    
    /**
      * Create a new YRawCell that works standalone. It cannot be
      * inserted into a YNotebook because the Yjs model is already
      * attached to an anonymous Y.Doc instance.
      */
    inline def createStandalone(): YBaseCell[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("createStandalone")().asInstanceOf[YBaseCell[Any]]
    inline def createStandalone(id: String): YBaseCell[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("createStandalone")(id.asInstanceOf[js.Any]).asInstanceOf[YBaseCell[Any]]
  }
  
  /* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
  - typings.luminoDisposable.mod.IDisposable because Already inherited
  - typings.jupyterlabSharedModels.libApiMod.ISharedBase because Already inherited
  - typings.jupyterlabSharedModels.libApiMod.ISharedText because Already inherited
  - typings.jupyterlabSharedModels.libApiMod.ISharedBaseCell because Already inherited
  - typings.jupyterlabSharedModels.libApiMod.ISharedCodeCell because var conflicts: cell_type, changed, isDisposed, isStandalone. Inlined execution_count, getOutputs, setOutputs, updateOutputs */ @JSImport("@jupyterlab/shared-models/lib/ymodels", "YCodeCell")
  @js.native
  open class YCodeCell protected ()
    extends YBaseCell[ISharedBaseCellMetadata]
       with YCellType
       with ISharedCell {
    def this(ymodel: Map[Any]) = this()
    
    /**
      * The type of the cell.
      */
    @JSName("cell_type")
    def cell_type_MYCodeCell: code = js.native
    
    /**
      * The code cell's prompt number. Will be null if the cell has not been run.
      */
    def execution_count: Double | Null = js.native
    /**
      * The code cell's prompt number. Will be null if the cell has not been run.
      */
    def execution_count_=(count: Double | Null): Unit = js.native
    /**
      * The code cell's prompt number. Will be null if the cell has not been run.
      */
    @JSName("execution_count")
    var execution_count_FYCodeCell: ExecutionCount = js.native
    
    /**
      * Execution, display, or stream outputs.
      */
    def getOutputs(): js.Array[IOutput] = js.native
    
    /**
      * Replace all outputs.
      */
    /**
      * Add/Update output.
      */
    def setOutputs(outputs: js.Array[IOutput]): Unit = js.native
    
    /**
      * Replace content from `start' to `end` with `outputs`.
      *
      * @param start: The start index of the range to replace (inclusive).
      *
      * @param end: The end index of the range to replace (exclusive).
      *
      * @param outputs: New outputs (optional).
      */
    def updateOutputs(start: Double, end: Double): Unit = js.native
    /**
      * Replace content from `start' to `end` with `outputs`.
      *
      * @param start: The start index of the range to replace (inclusive).
      *
      * @param end: The end index of the range to replace (exclusive).
      *
      * @param outputs: New outputs (optional).
      */
    def updateOutputs(start: Double, end: Double, outputs: js.Array[IOutput]): Unit = js.native
  }
  /* static members */
  object YCodeCell {
    
    @JSImport("@jupyterlab/shared-models/lib/ymodels", "YCodeCell")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Create a new YCodeCell that can be inserted into a YNotebook
      */
    inline def create(): YCodeCell = ^.asInstanceOf[js.Dynamic].applyDynamic("create")().asInstanceOf[YCodeCell]
    inline def create(id: String): YCodeCell = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(id.asInstanceOf[js.Any]).asInstanceOf[YCodeCell]
    
    /**
      * Create a new YCodeCell that works standalone. It cannot be
      * inserted into a YNotebook because the Yjs model is already
      * attached to an anonymous Y.Doc instance.
      */
    inline def createStandalone(): YCodeCell = ^.asInstanceOf[js.Dynamic].applyDynamic("createStandalone")().asInstanceOf[YCodeCell]
    inline def createStandalone(id: String): YCodeCell = ^.asInstanceOf[js.Dynamic].applyDynamic("createStandalone")(id.asInstanceOf[js.Any]).asInstanceOf[YCodeCell]
  }
  
  @JSImport("@jupyterlab/shared-models/lib/ymodels", "YDocument")
  @js.native
  open class YDocument[T] ()
    extends StObject
       with ISharedDocument {
    
    /* protected */ var _changed: Signal[this.type, T] = js.native
    
    var awareness: Awareness = js.native
    
    /**
      * Whether the object can undo changes.
      */
    /* CompleteClass */
    override def canRedo(): Boolean = js.native
    
    /**
      * Whether the object can redo changes.
      */
    /* CompleteClass */
    override def canUndo(): Boolean = js.native
    
    /**
      * The changed signal.
      */
    /* CompleteClass */
    override val changed: ISignal[this.type, DocumentChange] = js.native
    /**
      * The changed signal.
      */
    @JSName("changed")
    def changed_MYDocument: ISignal[this.type, T] = js.native
    
    /**
      * Clear the change stack.
      */
    /* CompleteClass */
    override def clearUndoHistory(): Unit = js.native
    
    /**
      * Whether the document is saved to disk or not.
      */
    /* CompleteClass */
    override val dirty: Boolean = js.native
    def dirty_=(value: Boolean): Unit = js.native
    @JSName("dirty")
    def dirty_MYDocument: Boolean = js.native
    
    /**
      * Dispose of the resources held by the object.
      *
      * #### Notes
      * If the object's `dispose` method is called more than once, all
      * calls made after the first will be a no-op.
      *
      * #### Undefined Behavior
      * It is undefined behavior to use any functionality of the object
      * after it has been disposed unless otherwise explicitly noted.
      */
    /* CompleteClass */
    override def dispose(): Unit = js.native
    
    /**
      * Test whether the object has been disposed.
      *
      * #### Notes
      * This property is always safe to access.
      */
    /* CompleteClass */
    override val isDisposed: Boolean = js.native
    
    /**
      * Redo an operation.
      */
    /* CompleteClass */
    override def redo(): Unit = js.native
    
    var source: Text = js.native
    
    /**
      * Perform a transaction. While the function f is called, all changes to the shared
      * document are bundled into a single event.
      */
    /* CompleteClass */
    override def transact(f: js.Function0[Unit]): Unit = js.native
    def transact(f: js.Function0[Unit], undoable: Boolean): Unit = js.native
    
    /**
      * Undo an operation.
      */
    /* CompleteClass */
    override def undo(): Unit = js.native
    
    var undoManager: UndoManager = js.native
    
    var ydoc: Doc = js.native
    
    var ystate: Map[Any] = js.native
  }
  
  /* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
  - typings.luminoDisposable.mod.IDisposable because Already inherited
  - typings.jupyterlabSharedModels.libApiMod.ISharedBase because Already inherited
  - typings.jupyterlabSharedModels.libApiMod.ISharedText because var conflicts: changed, isDisposed. Inlined getSource, setSource, updateSource, updateSource
  - typings.jupyterlabSharedModels.libApiMod.ISharedDocument because Already inherited
  - typings.jupyterlabSharedModels.libYmodelsMod.IYText because var conflicts: awareness, changed, isDisposed, undoManager. Inlined ysource
  - typings.jupyterlabSharedModels.libApiMod.ISharedFile because var conflicts: changed, dirty, isDisposed. Inlined  */ @JSImport("@jupyterlab/shared-models/lib/ymodels", "YFile")
  @js.native
  open class YFile () extends YDocument[FileChange] {
    
    /**
      * Handle a change to the ymodel.
      */
    /* private */ var _modelObserver: Any = js.native
    
    /**
      * Handle a change to the ystate.
      */
    /* private */ var _onStateChanged: Any = js.native
    
    /**
      * Gets cell's source.
      *
      * @returns Cell's source.
      */
    def getSource(): String = js.native
    
    /**
      * Sets cell's source.
      *
      * @param value: New source.
      */
    def setSource(value: String): Unit = js.native
    
    /**
      * Replace content from `start' to `end` with `value`.
      *
      * @param start: The start index of the range to replace (inclusive).
      *
      * @param end: The end index of the range to replace (exclusive).
      *
      * @param value: New source (optional).
      */
    def updateSource(start: Double, end: Double): Unit = js.native
    def updateSource(start: Double, end: Double, value: String): Unit = js.native
    
    var ysource: Text = js.native
  }
  /* static members */
  object YFile {
    
    @JSImport("@jupyterlab/shared-models/lib/ymodels", "YFile")
    @js.native
    val ^ : js.Any = js.native
    
    inline def create(): YFile = ^.asInstanceOf[js.Dynamic].applyDynamic("create")().asInstanceOf[YFile]
  }
  
  /* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
  - typings.luminoDisposable.mod.IDisposable because Already inherited
  - typings.jupyterlabSharedModels.libApiMod.ISharedBase because Already inherited
  - typings.jupyterlabSharedModels.libApiMod.ISharedText because Already inherited
  - typings.jupyterlabSharedModels.libApiMod.ISharedBaseCell because Already inherited
  - typings.jupyterlabSharedModels.libApiMod.ISharedMarkdownCell because var conflicts: cell_type, changed, isDisposed, isStandalone. Inlined  */ @JSImport("@jupyterlab/shared-models/lib/ymodels", "YMarkdownCell")
  @js.native
  open class YMarkdownCell protected ()
    extends YBaseCell[ISharedBaseCellMetadata]
       with YCellType
       with ISharedCell {
    def this(ymodel: Map[Any]) = this()
    
    /**
      * String identifying the type of cell.
      */
    @JSName("cell_type")
    def cell_type_MYMarkdownCell: markdown = js.native
  }
  /* static members */
  object YMarkdownCell {
    
    @JSImport("@jupyterlab/shared-models/lib/ymodels", "YMarkdownCell")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Create a new YMarkdownCell that can be inserted into a YNotebook
      */
    inline def create(): YMarkdownCell = ^.asInstanceOf[js.Dynamic].applyDynamic("create")().asInstanceOf[YMarkdownCell]
    inline def create(id: String): YMarkdownCell = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(id.asInstanceOf[js.Any]).asInstanceOf[YMarkdownCell]
    
    /**
      * Create a new YMarkdownCell that works standalone. It cannot be
      * inserted into a YNotebook because the Yjs model is already
      * attached to an anonymous Y.Doc instance.
      */
    inline def createStandalone(): YMarkdownCell = ^.asInstanceOf[js.Dynamic].applyDynamic("createStandalone")().asInstanceOf[YMarkdownCell]
    inline def createStandalone(id: String): YMarkdownCell = ^.asInstanceOf[js.Dynamic].applyDynamic("createStandalone")(id.asInstanceOf[js.Any]).asInstanceOf[YMarkdownCell]
  }
  
  /* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
  - typings.luminoDisposable.mod.IDisposable because Already inherited
  - typings.jupyterlabSharedModels.libApiMod.ISharedBase because Already inherited
  - typings.jupyterlabSharedModels.libApiMod.ISharedDocument because Already inherited
  - typings.jupyterlabSharedModels.libApiMod.ISharedNotebook because var conflicts: changed, dirty, isDisposed. Inlined nbformat_minor, nbformat, cells, getMetadata, setMetadata, updateMetadata, getCell, insertCell, insertCells, moveCell, deleteCell, deleteCellRange */ @JSImport("@jupyterlab/shared-models/lib/ymodels", "YNotebook")
  @js.native
  open class YNotebook protected () extends YDocument[NotebookChange] {
    def this(options: IOptions) = this()
    
    /* private */ var _disableDocumentWideUndoRedo: Any = js.native
    
    /**
      * Handle a change to the ystate.
      */
    /* private */ var _onMetadataChanged: Any = js.native
    
    /**
      * Handle a change to the ystate.
      */
    /* private */ var _onStateChanged: Any = js.native
    
    /**
      * Handle a change to the list of cells.
      */
    /* private */ var _onYCellsChanged: Any = js.native
    
    /* private */ var _ycellMapping: Any = js.native
    
    var cells: js.Array[ISharedCell | YCellType] = js.native
    
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
      * Wether the the undo/redo logic should be
      * considered on the full document across all cells.
      *
      * @return The disableDocumentWideUndoRedo setting.
      */
    def disableDocumentWideUndoRedo: Boolean = js.native
    
    /**
      * Get a shared cell by index.
      *
      * @param index: Cell's position.
      *
      * @returns The requested shared cell.
      */
    def getCell(index: Double): ISharedCell = js.native
    /**
      * Get a shared cell by index.
      *
      * @param index: Cell's position.
      *
      * @returns The requested shared cell.
      */
    @JSName("getCell")
    def getCell_YCellType(index: Double): YCellType = js.native
    
    /**
      * Returns the metadata associated with the notebook.
      *
      * @returns Notebook's metadata.
      */
    def getMetadata(): INotebookMetadata = js.native
    
    /**
      * Insert a shared cell into a specific position.
      *
      * @param index: Cell's position.
      *
      * @param cell: Cell to insert.
      */
    def insertCell(index: Double, cell: ISharedCell): Unit = js.native
    /**
      * Insert a shared cell into a specific position.
      *
      * @param index: Cell's position.
      *
      * @param cell: Cell to insert.
      */
    def insertCell(index: Double, cell: YCellType): Unit = js.native
    
    /**
      * Insert a list of shared cells into a specific position.
      *
      * @param index: Position to insert the cells.
      *
      * @param cells: Array of shared cells to insert.
      */
    def insertCells(index: Double, cells: js.Array[ISharedCell | YCellType]): Unit = js.native
    
    /**
      * Move a cell.
      *
      * @param fromIndex: Index of the cell to move.
      *
      * @param toIndex: New position of the cell.
      */
    def moveCell(fromIndex: Double, toIndex: Double): Unit = js.native
    
    def nbformat: Double = js.native
    def nbformat_=(value: Double): Unit = js.native
    /**
      * The major version number of the nbformat.
      */
    @JSName("nbformat")
    val nbformat_FYNotebook: Double = js.native
    
    def nbformat_minor: Double = js.native
    def nbformat_minor_=(value: Double): Unit = js.native
    /**
      * The minor version number of the nbformat.
      */
    @JSName("nbformat_minor")
    val nbformat_minor_FYNotebook: Double = js.native
    
    /**
      * Sets the metadata associated with the notebook.
      *
      * @param metadata: Notebook's metadata.
      */
    def setMetadata(value: INotebookMetadata): Unit = js.native
    
    /**
      * Updates the metadata associated with the notebook.
      *
      * @param value: Metadata's attribute to update.
      */
    def updateMetadata(value: PartialINotebookMetadata): Unit = js.native
    
    var ycells: Array[Map[Any]] = js.native
    
    var ymeta: Map[Any] = js.native
    
    var ymodel: Map[Any] = js.native
  }
  /* static members */
  object YNotebook {
    
    @JSImport("@jupyterlab/shared-models/lib/ymodels", "YNotebook")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Create a new YNotebook.
      */
    inline def create(disableDocumentWideUndoRedo: Boolean): ISharedNotebook = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(disableDocumentWideUndoRedo.asInstanceOf[js.Any]).asInstanceOf[ISharedNotebook]
  }
  
  /* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
  - typings.luminoDisposable.mod.IDisposable because Already inherited
  - typings.jupyterlabSharedModels.libApiMod.ISharedBase because Already inherited
  - typings.jupyterlabSharedModels.libApiMod.ISharedText because Already inherited
  - typings.jupyterlabSharedModels.libApiMod.ISharedBaseCell because Already inherited
  - typings.jupyterlabSharedModels.libApiMod.ISharedRawCell because var conflicts: cell_type, changed, isDisposed, isStandalone. Inlined  */ @JSImport("@jupyterlab/shared-models/lib/ymodels", "YRawCell")
  @js.native
  open class YRawCell protected ()
    extends YBaseCell[ISharedBaseCellMetadata]
       with YCellType
       with ISharedCell {
    def this(ymodel: Map[Any]) = this()
    
    /**
      * String identifying the type of cell.
      */
    @JSName("cell_type")
    def cell_type_MYRawCell: raw = js.native
  }
  /* static members */
  object YRawCell {
    
    @JSImport("@jupyterlab/shared-models/lib/ymodels", "YRawCell")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Create a new YRawCell that can be inserted into a YNotebook
      */
    inline def create(): YRawCell = ^.asInstanceOf[js.Dynamic].applyDynamic("create")().asInstanceOf[YRawCell]
    inline def create(id: String): YRawCell = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(id.asInstanceOf[js.Any]).asInstanceOf[YRawCell]
    
    /**
      * Create a new YRawCell that works standalone. It cannot be
      * inserted into a YNotebook because the Yjs model is already
      * attached to an anonymous Y.Doc instance.
      */
    inline def createStandalone(): YRawCell = ^.asInstanceOf[js.Dynamic].applyDynamic("createStandalone")().asInstanceOf[YRawCell]
    inline def createStandalone(id: String): YRawCell = ^.asInstanceOf[js.Dynamic].applyDynamic("createStandalone")(id.asInstanceOf[js.Any]).asInstanceOf[YRawCell]
  }
  
  inline def createCellFromType(`type`: Map[Any]): YCellType = ^.asInstanceOf[js.Dynamic].applyDynamic("createCellFromType")(`type`.asInstanceOf[js.Any]).asInstanceOf[YCellType]
  
  inline def createStandaloneCell(cellType: raw | code | markdown): YCellType = ^.asInstanceOf[js.Dynamic].applyDynamic("createStandaloneCell")(cellType.asInstanceOf[js.Any]).asInstanceOf[YCellType]
  inline def createStandaloneCell(cellType: raw | code | markdown, id: String): YCellType = (^.asInstanceOf[js.Dynamic].applyDynamic("createStandaloneCell")(cellType.asInstanceOf[js.Any], id.asInstanceOf[js.Any])).asInstanceOf[YCellType]
  
  @js.native
  trait IYText
    extends StObject
       with ISharedText {
    
    val awareness: Awareness | Null = js.native
    
    val undoManager: UndoManager | Null = js.native
    
    val ysource: Text = js.native
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.jupyterlabSharedModels.libYmodelsMod.YRawCell
    - typings.jupyterlabSharedModels.libYmodelsMod.YCodeCell
    - typings.jupyterlabSharedModels.libYmodelsMod.YMarkdownCell
  */
  trait YCellType extends StObject
}
