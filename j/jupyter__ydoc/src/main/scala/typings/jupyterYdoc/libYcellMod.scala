package typings.jupyterYdoc

import typings.jupyterYdoc.anon.PartialCellChange
import typings.jupyterYdoc.jupyterYdocStrings.code
import typings.jupyterYdoc.jupyterYdocStrings.markdown
import typings.jupyterYdoc.jupyterYdocStrings.raw
import typings.jupyterYdoc.libApiMod.CellChange
import typings.jupyterYdoc.libApiMod.IMapChange
import typings.jupyterYdoc.libApiMod.ISharedBaseCell
import typings.jupyterYdoc.libApiMod.ISharedCell
import typings.jupyterYdoc.libApiMod.SharedCell.Cell
import typings.jupyterYdoc.libApiMod.SharedCell.IOptions
import typings.jupyterYdoc.libYnotebookMod.YNotebook
import typings.jupyterlabNbformat.mod.ExecutionCount
import typings.jupyterlabNbformat.mod.IAttachments
import typings.jupyterlabNbformat.mod.IBaseCellMetadata
import typings.jupyterlabNbformat.mod.IOutput
import typings.luminoSignaling.mod.ISignal
import typings.luminoSignaling.mod.Signal
import typings.std.Partial
import typings.yProtocols.awarenessMod.Awareness
import typings.yjs.mod.Array
import typings.yjs.mod.Map
import typings.yjs.mod.Text
import typings.yjs.mod.UndoManager
import typings.yjs.mod.YEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libYcellMod {
  
  @JSImport("@jupyter/ydoc/lib/ycell", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
  - typings.luminoDisposable.mod.IDisposable because Already inherited
  - typings.luminoDisposable.mod.IObservableDisposable because Already inherited
  - typings.jupyterYdoc.libApiMod.ISharedBase because Already inherited
  - typings.jupyterYdoc.libApiMod.ISharedText because Already inherited
  - typings.jupyterYdoc.libYtextMod.IYText because var conflicts: source. Inlined ysource, awareness, undoManager */ @JSImport("@jupyter/ydoc/lib/ycell", "YBaseCell")
  @js.native
  open class YBaseCell[Metadata /* <: IBaseCellMetadata */] protected ()
    extends StObject
       with ISharedBaseCell[Metadata] {
    /**
      * Base cell constructor
      *
      * ### Notes
      * Don't use the constructor directly - prefer using ``YNotebook.insertCell``
      *
      * The ``ysource`` is needed because ``ymodel.get('source')`` will
      * not return the real source if the model is not yet attached to
      * a document. Requesting it explicitly allows to introspect a non-empty
      * source before the cell is attached to the document.
      *
      * @param ymodel Cell map
      * @param ysource Cell source
      * @param options \{ notebook?: The notebook the cell is attached to \}
      * @param ymetadata Cell metadata
      */
    def this(ymodel: Map[Any], ysource: Text) = this()
    def this(ymodel: Map[Any], ysource: Text, options: IOptions) = this()
    def this(ymodel: Map[Any], ysource: Text, options: Unit, ymetadata: Map[Any]) = this()
    def this(ymodel: Map[Any], ysource: Text, options: IOptions, ymetadata: Map[Any]) = this()
    
    /* private */ var _awareness: Any = js.native
    
    /* private */ var _changed: Any = js.native
    
    /* private */ var _disposed: Any = js.native
    
    /* private */ var _isDisposed: Any = js.native
    
    /* protected */ var _metadataChanged: Signal[this.type, IMapChange[Any]] = js.native
    
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
    
    /* private */ var _ymetadata: Any = js.native
    
    /* private */ var _ysource: Any = js.native
    
    /**
      * Cell notebook awareness or null if the cell is standalone.
      */
    def awareness: Awareness | Null = js.native
    /**
      * Shareable awareness
      */
    @JSName("awareness")
    val awareness_FYBaseCell: Awareness | Null = js.native
    
    /**
      * The type of the cell.
      */
    @JSName("cell_type")
    def cell_type_MYBaseCell: Any = js.native
    
    /**
      * The changed signal.
      */
    @JSName("changed")
    def changed_MYBaseCell: ISignal[this.type, CellChange] = js.native
    
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
      * A signal emitted when the object is disposed.
      */
    /* CompleteClass */
    override val disposed: ISignal[this.type, Unit] = js.native
    /**
      * Signal emitted when the cell is disposed.
      */
    @JSName("disposed")
    def disposed_MYBaseCell: ISignal[this.type, Unit] = js.native
    
    /**
      * Extract changes from YJS events
      *
      * @param events YJS events
      * @returns Cell changes
      */
    /* protected */ def getChanges(events: js.Array[YEvent[Any]]): PartialCellChange = js.native
    
    /**
      * Cell id
      */
    @JSName("id")
    def id_MYBaseCell: String = js.native
    
    /**
      * Test whether the object has been disposed.
      *
      * #### Notes
      * This property is always safe to access.
      */
    /* CompleteClass */
    override val isDisposed: Boolean = js.native
    /**
      * Whether the model has been disposed or not.
      */
    @JSName("isDisposed")
    def isDisposed_MYBaseCell: Boolean = js.native
    
    /**
      * Whether the cell is standalone or not.
      *
      * If the cell is standalone. It cannot be
      * inserted into a YNotebook because the Yjs model is already
      * attached to an anonymous Y.Doc instance.
      */
    @JSName("isStandalone")
    def isStandalone_MYBaseCell: Boolean = js.native
    
    /**
      * Signal triggered when the cell metadata changes.
      */
    @JSName("metadataChanged")
    def metadataChanged_MYBaseCell: ISignal[this.type, IMapChange[Any]] = js.native
    
    /**
      * Cell metadata.
      *
      * #### Notes
      * You should prefer to access and modify the specific key of interest.
      */
    @JSName("metadata")
    def metadata_MYBaseCell: Partial[Metadata] = js.native
    
    /**
      * The notebook that this cell belongs to.
      */
    @JSName("notebook")
    def notebook_MYBaseCell: YNotebook | Null = js.native
    
    /**
      * Defer setting the undo manager as it requires the
      * cell to be attached to the notebook Y document.
      */
    def setUndoManager(): Unit = js.native
    
    /**
      * Cell input content.
      */
    @JSName("source")
    def source_MYBaseCell: String = js.native
    
    /**
      * The cell undo manager.
      */
    def undoManager: UndoManager | Null = js.native
    /**
      * Undo manager
      */
    @JSName("undoManager")
    val undoManager_FYBaseCell: UndoManager | Null = js.native
    
    val ymodel: Map[Any] = js.native
    
    def ysource: Text = js.native
    /**
      * Shareable text
      */
    @JSName("ysource")
    val ysource_FYBaseCell: Text = js.native
  }
  /* static members */
  object YBaseCell {
    
    @JSImport("@jupyter/ydoc/lib/ycell", "YBaseCell")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Create a new YCell that works standalone. It cannot be
      * inserted into a YNotebook because the Yjs model is already
      * attached to an anonymous Y.Doc instance.
      */
    inline def create(): YBaseCell[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("create")().asInstanceOf[YBaseCell[Any]]
    inline def create(id: String): YBaseCell[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(id.asInstanceOf[js.Any]).asInstanceOf[YBaseCell[Any]]
  }
  
  /* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
  - typings.luminoDisposable.mod.IDisposable because Already inherited
  - typings.luminoDisposable.mod.IObservableDisposable because Already inherited
  - typings.jupyterYdoc.libApiMod.ISharedBase because Already inherited
  - typings.jupyterYdoc.libApiMod.ISharedText because Already inherited
  - typings.jupyterYdoc.libApiMod.ISharedBaseCell because Already inherited
  - typings.jupyterYdoc.libApiMod.ISharedCodeCell because var conflicts: cell_type, changed, disposed, id, isDisposed, isStandalone, metadata, metadataChanged, notebook, source. Inlined execution_count, outputs, getOutputs, setOutputs, updateOutputs */ @JSImport("@jupyter/ydoc/lib/ycell", "YCodeCell")
  @js.native
  open class YCodeCell protected ()
    extends YBaseCell[IBaseCellMetadata]
       with YCellType
       with ISharedCell {
    /**
      * Code cell constructor
      *
      * ### Notes
      * Don't use the constructor directly - prefer using ``YNotebook.insertCell``
      *
      * The ``ysource`` is needed because ``ymodel.get('source')`` will
      * not return the real source if the model is not yet attached to
      * a document. Requesting it explicitly allows to introspect a non-empty
      * source before the cell is attached to the document.
      *
      * @param ymodel Cell map
      * @param ysource Cell source
      * @param youtputs Code cell outputs
      * @param options \{ notebook?: The notebook the cell is attached to \}
      * @param ymetadata Cell metadata
      */
    def this(ymodel: Map[Any], ysource: Text, youtputs: Array[Any]) = this()
    def this(ymodel: Map[Any], ysource: Text, youtputs: Array[Any], options: IOptions) = this()
    def this(ymodel: Map[Any], ysource: Text, youtputs: Array[Any], options: Unit, ymetadata: Map[Any]) = this()
    def this(ymodel: Map[Any], ysource: Text, youtputs: Array[Any], options: IOptions, ymetadata: Map[Any]) = this()
    
    /* private */ var _youtputs: Any = js.native
    
    /**
      * The type of the cell.
      */
    @JSName("cell_type")
    def cell_type_MYCodeCell: code = js.native
    
    /**
      * The code cell's prompt number. Will be null if the cell has not been run.
      */
    def execution_count: Double | Null = js.native
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
      * Cell outputs.
      */
    def outputs: js.Array[IOutput] = js.native
    def outputs_=(v: js.Array[IOutput]): Unit = js.native
    /**
      * Cell outputs
      */
    @JSName("outputs")
    var outputs_FYCodeCell: js.Array[IOutput] = js.native
    
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
    
    @JSImport("@jupyter/ydoc/lib/ycell", "YCodeCell")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Create a new YCodeCell that works standalone. It cannot be
      * inserted into a YNotebook because the Yjs model is already
      * attached to an anonymous Y.Doc instance.
      */
    inline def create(): YCodeCell = ^.asInstanceOf[js.Dynamic].applyDynamic("create")().asInstanceOf[YCodeCell]
    inline def create(id: String): YCodeCell = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(id.asInstanceOf[js.Any]).asInstanceOf[YCodeCell]
  }
  
  /* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
  - typings.luminoDisposable.mod.IDisposable because Already inherited
  - typings.luminoDisposable.mod.IObservableDisposable because Already inherited
  - typings.jupyterYdoc.libApiMod.ISharedBase because Already inherited
  - typings.jupyterYdoc.libApiMod.ISharedText because Already inherited
  - typings.jupyterYdoc.libApiMod.ISharedBaseCell because Already inherited
  - typings.jupyterYdoc.libApiMod.ISharedAttachmentsCell because Already inherited
  - typings.jupyterYdoc.libApiMod.ISharedMarkdownCell because var conflicts: attachments, cell_type, metadata, source. Inlined  */ @JSImport("@jupyter/ydoc/lib/ycell", "YMarkdownCell")
  @js.native
  open class YMarkdownCell ()
    extends YAttachmentCell
       with YCellType
       with ISharedCell {
    
    /**
      * String identifying the type of cell.
      */
    @JSName("cell_type")
    def cell_type_MYMarkdownCell: markdown = js.native
  }
  /* static members */
  object YMarkdownCell {
    
    @JSImport("@jupyter/ydoc/lib/ycell", "YMarkdownCell")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Create a new YMarkdownCell that works standalone. It cannot be
      * inserted into a YNotebook because the Yjs model is already
      * attached to an anonymous Y.Doc instance.
      */
    inline def create(): YMarkdownCell = ^.asInstanceOf[js.Dynamic].applyDynamic("create")().asInstanceOf[YMarkdownCell]
    inline def create(id: String): YMarkdownCell = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(id.asInstanceOf[js.Any]).asInstanceOf[YMarkdownCell]
  }
  
  /* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
  - typings.luminoDisposable.mod.IDisposable because Already inherited
  - typings.luminoDisposable.mod.IObservableDisposable because Already inherited
  - typings.jupyterYdoc.libApiMod.ISharedBase because Already inherited
  - typings.jupyterYdoc.libApiMod.ISharedText because Already inherited
  - typings.jupyterYdoc.libApiMod.ISharedBaseCell because Already inherited
  - typings.jupyterYdoc.libApiMod.ISharedAttachmentsCell because Already inherited
  - typings.jupyterYdoc.libApiMod.ISharedRawCell because var conflicts: attachments, cell_type, metadata, source. Inlined  */ @JSImport("@jupyter/ydoc/lib/ycell", "YRawCell")
  @js.native
  open class YRawCell ()
    extends YAttachmentCell
       with YCellType
       with ISharedCell {
    
    /**
      * String identifying the type of cell.
      */
    @JSName("cell_type")
    def cell_type_MYRawCell: raw = js.native
  }
  /* static members */
  object YRawCell {
    
    @JSImport("@jupyter/ydoc/lib/ycell", "YRawCell")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Create a new YRawCell that works standalone. It cannot be
      * inserted into a YNotebook because the Yjs model is already
      * attached to an anonymous Y.Doc instance.
      */
    inline def create(): YRawCell = ^.asInstanceOf[js.Dynamic].applyDynamic("create")().asInstanceOf[YRawCell]
    inline def create(id: String): YRawCell = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(id.asInstanceOf[js.Any]).asInstanceOf[YRawCell]
  }
  
  inline def createCell(cell: Cell): YCodeCell | YMarkdownCell | YRawCell = ^.asInstanceOf[js.Dynamic].applyDynamic("createCell")(cell.asInstanceOf[js.Any]).asInstanceOf[YCodeCell | YMarkdownCell | YRawCell]
  inline def createCell(cell: Cell, notebook: YNotebook): YCodeCell | YMarkdownCell | YRawCell = (^.asInstanceOf[js.Dynamic].applyDynamic("createCell")(cell.asInstanceOf[js.Any], notebook.asInstanceOf[js.Any])).asInstanceOf[YCodeCell | YMarkdownCell | YRawCell]
  
  inline def createCellModelFromSharedType(`type`: Map[Any]): YCellType = ^.asInstanceOf[js.Dynamic].applyDynamic("createCellModelFromSharedType")(`type`.asInstanceOf[js.Any]).asInstanceOf[YCellType]
  inline def createCellModelFromSharedType(`type`: Map[Any], options: IOptions): YCellType = (^.asInstanceOf[js.Dynamic].applyDynamic("createCellModelFromSharedType")(`type`.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[YCellType]
  
  inline def createStandaloneCell(cell: Cell): YCellType = ^.asInstanceOf[js.Dynamic].applyDynamic("createStandaloneCell")(cell.asInstanceOf[js.Any]).asInstanceOf[YCellType]
  
  /* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
  - typings.luminoDisposable.mod.IDisposable because Already inherited
  - typings.luminoDisposable.mod.IObservableDisposable because Already inherited
  - typings.jupyterYdoc.libApiMod.ISharedBase because Already inherited
  - typings.jupyterYdoc.libApiMod.ISharedText because Already inherited
  - typings.jupyterYdoc.libApiMod.ISharedBaseCell because Already inherited
  - typings.jupyterYdoc.libApiMod.ISharedAttachmentsCell because var conflicts: cell_type, changed, disposed, id, isDisposed, isStandalone, metadata, metadataChanged, notebook, source. Inlined attachments, getAttachments, setAttachments, setAttachments */ @js.native
  trait YAttachmentCell extends YBaseCell[IBaseCellMetadata] {
    
    /**
      * Cell attachments
      */
    def attachments: js.UndefOr[IAttachments] = js.native
    def attachments_=(v: js.UndefOr[IAttachments]): Unit = js.native
    /**
      * Cell attachments
      */
    @JSName("attachments")
    var attachments_FYAttachmentCell: js.UndefOr[IAttachments] = js.native
    
    /**
      * Gets the cell attachments.
      *
      * @returns The cell attachments.
      */
    def getAttachments(): js.UndefOr[IAttachments] = js.native
    
    /**
      * Sets the cell attachments
      *
      * @param attachments: The cell attachments.
      */
    def setAttachments(): Unit = js.native
    def setAttachments(attachments: IAttachments): Unit = js.native
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.jupyterYdoc.libYcellMod.YRawCell
    - typings.jupyterYdoc.libYcellMod.YCodeCell
    - typings.jupyterYdoc.libYcellMod.YMarkdownCell
  */
  trait YCellType extends StObject
}
