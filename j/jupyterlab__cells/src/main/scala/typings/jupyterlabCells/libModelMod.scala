package typings.jupyterlabCells

import typings.jupyterlabAttachments.libModelMod.IAttachmentsModel
import typings.jupyterlabCells.jupyterlabCellsStrings.code
import typings.jupyterlabCells.jupyterlabCellsStrings.markdown
import typings.jupyterlabCells.jupyterlabCellsStrings.raw
import typings.jupyterlabCells.libModelMod.AttachmentsCellModel.IOptions
import typings.jupyterlabCodeeditor.libEditorMod.CodeEditor.IModel
import typings.jupyterlabCodeeditor.libEditorMod.CodeEditor.ITextSelection
import typings.jupyterlabCodeeditor.mod.CodeEditor.Model
import typings.jupyterlabNbformat.mod.CellType
import typings.jupyterlabNbformat.mod.ExecutionCount
import typings.jupyterlabNbformat.mod.IBaseCell
import typings.jupyterlabNbformat.mod.ICell
import typings.jupyterlabObservables.libModeldbMod.IModelDB
import typings.jupyterlabObservables.libModeldbMod.IObservableValue
import typings.jupyterlabObservables.libObservablejsonMod.IObservableJSON
import typings.jupyterlabObservables.libObservablejsonMod.IObservableJSON.IChangedArgs
import typings.jupyterlabObservables.libObservablemapMod.IObservableMap
import typings.jupyterlabObservables.libObservablestringMod.IObservableString
import typings.jupyterlabOutputarea.libModelMod.IOutputAreaModel
import typings.jupyterlabOutputarea.libModelMod.IOutputAreaModel.ChangedArgs
import typings.jupyterlabSharedModels.libApiMod.CellChange
import typings.jupyterlabSharedModels.libApiMod.ISharedBaseCellMetadata
import typings.jupyterlabSharedModels.libApiMod.ISharedCell
import typings.jupyterlabSharedModels.libApiMod.ISharedCodeCell
import typings.jupyterlabSharedModels.libApiMod.ISharedText
import typings.luminoSignaling.mod.ISignal
import typings.luminoSignaling.mod.Signal
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libModelMod {
  
  @JSImport("@jupyterlab/cells/lib/model", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@jupyterlab/cells/lib/model", "AttachmentsCellModel")
  @js.native
  open class AttachmentsCellModel protected () extends CellModel {
    /**
      * Construct a new cell with optional attachments.
      */
    def this(options: IOptions) = this()
    
    /* private */ var _attachments: Any = js.native
    
    /**
      * Get the attachments of the model.
      */
    def attachments: IAttachmentsModel = js.native
  }
  object AttachmentsCellModel {
    
    /**
      * The default implementation of an `IContentFactory`.
      */
    @JSImport("@jupyterlab/cells/lib/model", "AttachmentsCellModel.ContentFactory")
    @js.native
    open class ContentFactory ()
      extends StObject
         with IContentFactory {
      
      /**
        * Create an output area.
        */
      /* CompleteClass */
      override def createAttachmentsModel(options: typings.jupyterlabAttachments.libModelMod.IAttachmentsModel.IOptions): IAttachmentsModel = js.native
    }
    
    /**
      * The shared `ContentFactory` instance.
      */
    @JSImport("@jupyterlab/cells/lib/model", "AttachmentsCellModel.defaultContentFactory")
    @js.native
    val defaultContentFactory: ContentFactory = js.native
    
    /**
      * A factory for creating code cell model content.
      */
    trait IContentFactory extends StObject {
      
      /**
        * Create an output area.
        */
      def createAttachmentsModel(options: typings.jupyterlabAttachments.libModelMod.IAttachmentsModel.IOptions): IAttachmentsModel
    }
    object IContentFactory {
      
      inline def apply(
        createAttachmentsModel: typings.jupyterlabAttachments.libModelMod.IAttachmentsModel.IOptions => IAttachmentsModel
      ): IContentFactory = {
        val __obj = js.Dynamic.literal(createAttachmentsModel = js.Any.fromFunction1(createAttachmentsModel))
        __obj.asInstanceOf[IContentFactory]
      }
      
      @scala.inline
      implicit open class MutableBuilder[Self <: IContentFactory] (val x: Self) extends AnyVal {
        
        inline def setCreateAttachmentsModel(value: typings.jupyterlabAttachments.libModelMod.IAttachmentsModel.IOptions => IAttachmentsModel): Self = StObject.set(x, "createAttachmentsModel", js.Any.fromFunction1(value))
      }
    }
    
    /**
      * The options used to initialize a `AttachmentsCellModel`.
      */
    trait IOptions
      extends StObject
         with typings.jupyterlabCells.libModelMod.CellModel.IOptions {
      
      /**
        * The factory for attachment model creation.
        */
      var contentFactory: js.UndefOr[IContentFactory] = js.undefined
    }
    object IOptions {
      
      inline def apply(): IOptions = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[IOptions]
      }
      
      @scala.inline
      implicit open class MutableBuilder[Self <: IOptions] (val x: Self) extends AnyVal {
        
        inline def setContentFactory(value: IContentFactory): Self = StObject.set(x, "contentFactory", value.asInstanceOf[js.Any])
        
        inline def setContentFactoryUndefined: Self = StObject.set(x, "contentFactory", js.undefined)
      }
    }
  }
  
  /* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
  - typings.jupyterlabCodeeditor.libEditorMod.CodeEditor.IModel because Already inherited
  - typings.jupyterlabCells.libModelMod.ICellModel because Already inherited typings.luminoDisposable.mod.IDisposable */ @JSImport("@jupyterlab/cells/lib/model", "CellModel")
  @js.native
  open class CellModel protected () extends Model {
    /**
      * Construct a cell model from optional cell content.
      */
    def this(options: typings.jupyterlabCells.libModelMod.CellModel.IOptions) = this()
    
    /**
      * Change the cell metadata for a given event.
      *
      * @param metadata The cell metadata.
      * @param event The event to handle.
      */
    /* private */ var _changeCellMetadata: Any = js.native
    
    /**
      * Handle a change to the cell shared model and reflect it in modelDB.
      * We update the modeldb metadata when the shared model changes.
      *
      * This method overrides the CodeEditor protected _onSharedModelChanged
      * so we first call super._onSharedModelChanged
      *
      * @override CodeEditor._onSharedModelChanged
      */
    /* protected */ def _onSharedModelChanged(sender: ISharedCodeCell, change: CellChange[ISharedBaseCellMetadata]): Unit = js.native
    
    /* private */ var _updateModelDBMetadata: Any = js.native
    
    /**
      * A signal emitted when the state of the model changes.
      */
    val contentChanged: Signal[this.type, Unit] = js.native
    
    /**
      * The id for the cell.
      */
    def id: String = js.native
    
    /**
      * The metadata associated with the cell.
      */
    def metadata: IObservableJSON = js.native
    
    /**
      * Handle a change to the observable value.
      */
    /* protected */ def onGenericChange(): Unit = js.native
    
    /**
      * Handle a change to the cell metadata modelDB and reflect it in the shared model.
      */
    /* protected */ def onModelDBMetadataChange(sender: IObservableJSON, event: IChangedArgs): Unit = js.native
    
    /**
      * Handle a change to the trusted state.
      *
      * The default implementation is a no-op.
      */
    def onTrustedChanged(trusted: IObservableValue, args: typings.jupyterlabObservables.mod.ObservableValue.IChangedArgs): Unit = js.native
    
    @JSName("sharedModel")
    var sharedModel_CellModel: ISharedCell = js.native
    
    /**
      * A signal emitted when a model state changes.
      */
    val stateChanged: Signal[
        this.type, 
        typings.jupyterlabCoreutils.libInterfacesMod.IChangedArgs[Any, Any, String]
      ] = js.native
    
    /**
      * When we initialize a cell model, we create a standalone model that cannot be shared in a YNotebook.
      * Call this function to re-initialize the local representation based on a fresh shared model (e.g. models.YFile or models.YCodeCell).
      *
      * @param sharedModel
      * @param reinitialize Whether to reinitialize the shared model.
      */
    def switchSharedModel(sharedModel: ISharedCodeCell): Unit = js.native
    def switchSharedModel(sharedModel: ISharedCodeCell, reinitialize: Boolean): Unit = js.native
    
    /**
      * Serialize the model to JSON.
      */
    def toJSON(): ICell = js.native
    
    /**
      * Get the trusted state of the model.
      */
    def trusted: Boolean = js.native
    /**
      * Set the trusted state of the model.
      */
    def trusted_=(newValue: Boolean): Unit = js.native
  }
  object CellModel {
    
    /**
      * The options used to initialize a `CellModel`.
      */
    trait IOptions extends StObject {
      
      /**
        * The source cell data.
        */
      var cell: js.UndefOr[IBaseCell] = js.undefined
      
      /**
        * A unique identifier for this cell.
        */
      var id: js.UndefOr[String] = js.undefined
      
      /**
        * An IModelDB in which to store cell data.
        */
      var modelDB: js.UndefOr[IModelDB] = js.undefined
    }
    object IOptions {
      
      inline def apply(): typings.jupyterlabCells.libModelMod.CellModel.IOptions = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[typings.jupyterlabCells.libModelMod.CellModel.IOptions]
      }
      
      @scala.inline
      implicit open class MutableBuilder[Self <: typings.jupyterlabCells.libModelMod.CellModel.IOptions] (val x: Self) extends AnyVal {
        
        inline def setCell(value: IBaseCell): Self = StObject.set(x, "cell", value.asInstanceOf[js.Any])
        
        inline def setCellUndefined: Self = StObject.set(x, "cell", js.undefined)
        
        inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
        
        inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
        
        inline def setModelDB(value: IModelDB): Self = StObject.set(x, "modelDB", value.asInstanceOf[js.Any])
        
        inline def setModelDBUndefined: Self = StObject.set(x, "modelDB", js.undefined)
      }
    }
  }
  
  /* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
  - typings.jupyterlabCodeeditor.libEditorMod.CodeEditor.IModel because Already inherited
  - typings.jupyterlabCells.libModelMod.ICellModel because Already inherited
  - typings.jupyterlabCells.libModelMod.ICodeCellModel because Already inherited typings.luminoDisposable.mod.IDisposable */ @JSImport("@jupyterlab/cells/lib/model", "CodeCellModel")
  @js.native
  open class CodeCellModel protected () extends CellModel {
    /**
      * Construct a new code cell with optional original cell content.
      */
    def this(options: typings.jupyterlabCells.libModelMod.CodeCellModel.IOptions) = this()
    
    /* private */ var _executedCode: Any = js.native
    
    /* private */ var _isDirty: Any = js.native
    
    /**
      * Handle a change to the execution count.
      */
    /* private */ var _onExecutionCountChanged: Any = js.native
    
    /**
      * Handle a change to the code cell value.
      */
    /* private */ var _onValueChanged: Any = js.native
    
    /* private */ var _outputs: Any = js.native
    
    /**
      * Set whether the cell is dirty or not.
      */
    /* private */ var _setDirty: Any = js.native
    
    def clearExecution(): Unit = js.native
    
    /**
      * The execution count of the cell.
      */
    def executionCount: ExecutionCount = js.native
    def executionCount_=(newValue: ExecutionCount): Unit = js.native
    
    /**
      * Whether the cell is dirty or not.
      *
      * A cell is dirty if it is output is not empty and does not
      * result of the input code execution.
      */
    def isDirty: Boolean = js.native
    
    /**
      * Handle a change to the cell outputs modelDB and reflect it in the shared model.
      */
    /* protected */ def onModelDBOutputsChange(sender: IOutputAreaModel, event: ChangedArgs): Unit = js.native
    
    /**
      * The cell outputs.
      */
    def outputs: IOutputAreaModel = js.native
  }
  object CodeCellModel {
    
    /**
      * The default implementation of an `IContentFactory`.
      */
    @JSImport("@jupyterlab/cells/lib/model", "CodeCellModel.ContentFactory")
    @js.native
    open class ContentFactory ()
      extends StObject
         with IContentFactory {
      
      /**
        * Create an output area.
        */
      /* CompleteClass */
      override def createOutputArea(options: typings.jupyterlabOutputarea.libModelMod.IOutputAreaModel.IOptions): IOutputAreaModel = js.native
    }
    
    /**
      * The shared `ContentFactory` instance.
      */
    @JSImport("@jupyterlab/cells/lib/model", "CodeCellModel.defaultContentFactory")
    @js.native
    val defaultContentFactory: ContentFactory = js.native
    
    /**
      * A factory for creating code cell model content.
      */
    trait IContentFactory extends StObject {
      
      /**
        * Create an output area.
        */
      def createOutputArea(options: typings.jupyterlabOutputarea.libModelMod.IOutputAreaModel.IOptions): IOutputAreaModel
    }
    object IContentFactory {
      
      inline def apply(
        createOutputArea: typings.jupyterlabOutputarea.libModelMod.IOutputAreaModel.IOptions => IOutputAreaModel
      ): IContentFactory = {
        val __obj = js.Dynamic.literal(createOutputArea = js.Any.fromFunction1(createOutputArea))
        __obj.asInstanceOf[IContentFactory]
      }
      
      @scala.inline
      implicit open class MutableBuilder[Self <: IContentFactory] (val x: Self) extends AnyVal {
        
        inline def setCreateOutputArea(value: typings.jupyterlabOutputarea.libModelMod.IOutputAreaModel.IOptions => IOutputAreaModel): Self = StObject.set(x, "createOutputArea", js.Any.fromFunction1(value))
      }
    }
    
    /**
      * The options used to initialize a `CodeCellModel`.
      */
    trait IOptions
      extends StObject
         with typings.jupyterlabCells.libModelMod.CellModel.IOptions {
      
      /**
        * The factory for output area model creation.
        */
      var contentFactory: js.UndefOr[IContentFactory] = js.undefined
    }
    object IOptions {
      
      inline def apply(): typings.jupyterlabCells.libModelMod.CodeCellModel.IOptions = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[typings.jupyterlabCells.libModelMod.CodeCellModel.IOptions]
      }
      
      @scala.inline
      implicit open class MutableBuilder[Self <: typings.jupyterlabCells.libModelMod.CodeCellModel.IOptions] (val x: Self) extends AnyVal {
        
        inline def setContentFactory(value: IContentFactory): Self = StObject.set(x, "contentFactory", value.asInstanceOf[js.Any])
        
        inline def setContentFactoryUndefined: Self = StObject.set(x, "contentFactory", js.undefined)
      }
    }
  }
  
  @JSImport("@jupyterlab/cells/lib/model", "MarkdownCellModel")
  @js.native
  open class MarkdownCellModel protected () extends AttachmentsCellModel {
    /**
      * Construct a markdown cell model from optional cell content.
      */
    def this(options: typings.jupyterlabCells.libModelMod.CellModel.IOptions) = this()
  }
  
  @JSImport("@jupyterlab/cells/lib/model", "RawCellModel")
  @js.native
  open class RawCellModel protected () extends AttachmentsCellModel {
    /**
      * Construct a new cell with optional attachments.
      */
    def this(options: IOptions) = this()
  }
  
  inline def isCodeCellModel(model: ICellModel): /* is @jupyterlab/cells.@jupyterlab/cells/lib/model.ICodeCellModel */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isCodeCellModel")(model.asInstanceOf[js.Any]).asInstanceOf[/* is @jupyterlab/cells.@jupyterlab/cells/lib/model.ICodeCellModel */ Boolean]
  
  inline def isMarkdownCellModel(model: ICellModel): /* is @jupyterlab/cells.@jupyterlab/cells/lib/model.IMarkdownCellModel */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isMarkdownCellModel")(model.asInstanceOf[js.Any]).asInstanceOf[/* is @jupyterlab/cells.@jupyterlab/cells/lib/model.IMarkdownCellModel */ Boolean]
  
  inline def isRawCellModel(model: ICellModel): /* is @jupyterlab/cells.@jupyterlab/cells/lib/model.IRawCellModel */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isRawCellModel")(model.asInstanceOf[js.Any]).asInstanceOf[/* is @jupyterlab/cells.@jupyterlab/cells/lib/model.IRawCellModel */ Boolean]
  
  trait IAttachmentsCellModel
    extends StObject
       with ICellModel {
    
    /**
      * The cell attachments
      */
    val attachments: IAttachmentsModel
  }
  object IAttachmentsCellModel {
    
    inline def apply(
      attachments: IAttachmentsModel,
      contentChanged: ISignal[ICellModel, Unit],
      id: String,
      metadata: IObservableJSON,
      mimeType: String,
      mimeTypeChanged: ISignal[
          IModel, 
          typings.jupyterlabCoreutils.libInterfacesMod.IChangedArgs[String, String, String]
        ],
      modelDB: IModelDB,
      selections: IObservableMap[js.Array[ITextSelection]],
      sharedModel: ISharedCell & ISharedText,
      sharedModelSwitched: ISignal[IModel, Boolean],
      stateChanged: ISignal[
          ICellModel, 
          typings.jupyterlabCoreutils.libInterfacesMod.IChangedArgs[Any, Any, String]
        ],
      switchSharedModel: (ISharedText, Boolean) => Unit,
      toJSON: () => ICell,
      trusted: Boolean,
      `type`: CellType,
      value: IObservableString
    ): IAttachmentsCellModel = {
      val __obj = js.Dynamic.literal(attachments = attachments.asInstanceOf[js.Any], contentChanged = contentChanged.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], metadata = metadata.asInstanceOf[js.Any], mimeType = mimeType.asInstanceOf[js.Any], mimeTypeChanged = mimeTypeChanged.asInstanceOf[js.Any], modelDB = modelDB.asInstanceOf[js.Any], selections = selections.asInstanceOf[js.Any], sharedModel = sharedModel.asInstanceOf[js.Any], sharedModelSwitched = sharedModelSwitched.asInstanceOf[js.Any], stateChanged = stateChanged.asInstanceOf[js.Any], switchSharedModel = js.Any.fromFunction2(switchSharedModel), toJSON = js.Any.fromFunction0(toJSON), trusted = trusted.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[IAttachmentsCellModel]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: IAttachmentsCellModel] (val x: Self) extends AnyVal {
      
      inline def setAttachments(value: IAttachmentsModel): Self = StObject.set(x, "attachments", value.asInstanceOf[js.Any])
    }
  }
  
  trait ICellModel
    extends StObject
       with IModel {
    
    /**
      * A signal emitted when the content of the model changes.
      */
    val contentChanged: ISignal[ICellModel, Unit]
    
    /**
      * A unique identifier for the cell.
      */
    val id: String
    
    /**
      * The metadata associated with the cell.
      */
    val metadata: IObservableJSON
    
    @JSName("sharedModel")
    val sharedModel_ICellModel: ISharedCell & ISharedText
    
    /**
      * A signal emitted when a model state changes.
      */
    val stateChanged: ISignal[
        ICellModel, 
        typings.jupyterlabCoreutils.libInterfacesMod.IChangedArgs[Any, Any, String]
      ]
    
    /**
      * Serialize the model to JSON.
      */
    def toJSON(): ICell
    
    /**
      * Whether the cell is trusted.
      */
    var trusted: Boolean
    
    /**
      * The type of the cell.
      */
    val `type`: CellType
  }
  object ICellModel {
    
    inline def apply(
      contentChanged: ISignal[ICellModel, Unit],
      id: String,
      metadata: IObservableJSON,
      mimeType: String,
      mimeTypeChanged: ISignal[
          IModel, 
          typings.jupyterlabCoreutils.libInterfacesMod.IChangedArgs[String, String, String]
        ],
      modelDB: IModelDB,
      selections: IObservableMap[js.Array[ITextSelection]],
      sharedModel: ISharedCell & ISharedText,
      sharedModelSwitched: ISignal[IModel, Boolean],
      stateChanged: ISignal[
          ICellModel, 
          typings.jupyterlabCoreutils.libInterfacesMod.IChangedArgs[Any, Any, String]
        ],
      switchSharedModel: (ISharedText, Boolean) => Unit,
      toJSON: () => ICell,
      trusted: Boolean,
      `type`: CellType,
      value: IObservableString
    ): ICellModel = {
      val __obj = js.Dynamic.literal(contentChanged = contentChanged.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], metadata = metadata.asInstanceOf[js.Any], mimeType = mimeType.asInstanceOf[js.Any], mimeTypeChanged = mimeTypeChanged.asInstanceOf[js.Any], modelDB = modelDB.asInstanceOf[js.Any], selections = selections.asInstanceOf[js.Any], sharedModel = sharedModel.asInstanceOf[js.Any], sharedModelSwitched = sharedModelSwitched.asInstanceOf[js.Any], stateChanged = stateChanged.asInstanceOf[js.Any], switchSharedModel = js.Any.fromFunction2(switchSharedModel), toJSON = js.Any.fromFunction0(toJSON), trusted = trusted.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[ICellModel]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ICellModel] (val x: Self) extends AnyVal {
      
      inline def setContentChanged(value: ISignal[ICellModel, Unit]): Self = StObject.set(x, "contentChanged", value.asInstanceOf[js.Any])
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setMetadata(value: IObservableJSON): Self = StObject.set(x, "metadata", value.asInstanceOf[js.Any])
      
      inline def setSharedModel(value: ISharedCell & ISharedText): Self = StObject.set(x, "sharedModel", value.asInstanceOf[js.Any])
      
      inline def setStateChanged(
        value: ISignal[
              ICellModel, 
              typings.jupyterlabCoreutils.libInterfacesMod.IChangedArgs[Any, Any, String]
            ]
      ): Self = StObject.set(x, "stateChanged", value.asInstanceOf[js.Any])
      
      inline def setToJSON(value: () => ICell): Self = StObject.set(x, "toJSON", js.Any.fromFunction0(value))
      
      inline def setTrusted(value: Boolean): Self = StObject.set(x, "trusted", value.asInstanceOf[js.Any])
      
      inline def setType(value: CellType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  trait ICodeCellModel
    extends StObject
       with ICellModel {
    
    /**
      * Clear execution, outputs, and related metadata
      */
    def clearExecution(): Unit
    
    /**
      * The code cell's prompt number. Will be null if the cell has not been run.
      */
    var executionCount: ExecutionCount
    
    /**
      * Whether the code cell has been edited since the last run.
      */
    val isDirty: Boolean
    
    /**
      * The cell outputs.
      */
    val outputs: IOutputAreaModel
    
    /**
      * The type of the cell.
      *
      * #### Notes
      * This is a read-only property.
      */
    @JSName("type")
    val type_ICodeCellModel: code
  }
  object ICodeCellModel {
    
    inline def apply(
      clearExecution: () => Unit,
      contentChanged: ISignal[ICellModel, Unit],
      id: String,
      isDirty: Boolean,
      metadata: IObservableJSON,
      mimeType: String,
      mimeTypeChanged: ISignal[
          IModel, 
          typings.jupyterlabCoreutils.libInterfacesMod.IChangedArgs[String, String, String]
        ],
      modelDB: IModelDB,
      outputs: IOutputAreaModel,
      selections: IObservableMap[js.Array[ITextSelection]],
      sharedModel: ISharedCell & ISharedText,
      sharedModelSwitched: ISignal[IModel, Boolean],
      stateChanged: ISignal[
          ICellModel, 
          typings.jupyterlabCoreutils.libInterfacesMod.IChangedArgs[Any, Any, String]
        ],
      switchSharedModel: (ISharedText, Boolean) => Unit,
      toJSON: () => ICell,
      trusted: Boolean,
      value: IObservableString
    ): ICodeCellModel = {
      val __obj = js.Dynamic.literal(clearExecution = js.Any.fromFunction0(clearExecution), contentChanged = contentChanged.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], isDirty = isDirty.asInstanceOf[js.Any], metadata = metadata.asInstanceOf[js.Any], mimeType = mimeType.asInstanceOf[js.Any], mimeTypeChanged = mimeTypeChanged.asInstanceOf[js.Any], modelDB = modelDB.asInstanceOf[js.Any], outputs = outputs.asInstanceOf[js.Any], selections = selections.asInstanceOf[js.Any], sharedModel = sharedModel.asInstanceOf[js.Any], sharedModelSwitched = sharedModelSwitched.asInstanceOf[js.Any], stateChanged = stateChanged.asInstanceOf[js.Any], switchSharedModel = js.Any.fromFunction2(switchSharedModel), toJSON = js.Any.fromFunction0(toJSON), trusted = trusted.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any], executionCount = null)
      __obj.updateDynamic("type")("code")
      __obj.asInstanceOf[ICodeCellModel]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ICodeCellModel] (val x: Self) extends AnyVal {
      
      inline def setClearExecution(value: () => Unit): Self = StObject.set(x, "clearExecution", js.Any.fromFunction0(value))
      
      inline def setExecutionCount(value: ExecutionCount): Self = StObject.set(x, "executionCount", value.asInstanceOf[js.Any])
      
      inline def setExecutionCountNull: Self = StObject.set(x, "executionCount", null)
      
      inline def setIsDirty(value: Boolean): Self = StObject.set(x, "isDirty", value.asInstanceOf[js.Any])
      
      inline def setOutputs(value: IOutputAreaModel): Self = StObject.set(x, "outputs", value.asInstanceOf[js.Any])
      
      inline def setType(value: code): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  trait IMarkdownCellModel
    extends StObject
       with IAttachmentsCellModel {
    
    /**
      * The type of the cell.
      */
    @JSName("type")
    val type_IMarkdownCellModel: markdown
  }
  object IMarkdownCellModel {
    
    inline def apply(
      attachments: IAttachmentsModel,
      contentChanged: ISignal[ICellModel, Unit],
      id: String,
      metadata: IObservableJSON,
      mimeType: String,
      mimeTypeChanged: ISignal[
          IModel, 
          typings.jupyterlabCoreutils.libInterfacesMod.IChangedArgs[String, String, String]
        ],
      modelDB: IModelDB,
      selections: IObservableMap[js.Array[ITextSelection]],
      sharedModel: ISharedCell & ISharedText,
      sharedModelSwitched: ISignal[IModel, Boolean],
      stateChanged: ISignal[
          ICellModel, 
          typings.jupyterlabCoreutils.libInterfacesMod.IChangedArgs[Any, Any, String]
        ],
      switchSharedModel: (ISharedText, Boolean) => Unit,
      toJSON: () => ICell,
      trusted: Boolean,
      value: IObservableString
    ): IMarkdownCellModel = {
      val __obj = js.Dynamic.literal(attachments = attachments.asInstanceOf[js.Any], contentChanged = contentChanged.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], metadata = metadata.asInstanceOf[js.Any], mimeType = mimeType.asInstanceOf[js.Any], mimeTypeChanged = mimeTypeChanged.asInstanceOf[js.Any], modelDB = modelDB.asInstanceOf[js.Any], selections = selections.asInstanceOf[js.Any], sharedModel = sharedModel.asInstanceOf[js.Any], sharedModelSwitched = sharedModelSwitched.asInstanceOf[js.Any], stateChanged = stateChanged.asInstanceOf[js.Any], switchSharedModel = js.Any.fromFunction2(switchSharedModel), toJSON = js.Any.fromFunction0(toJSON), trusted = trusted.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("markdown")
      __obj.asInstanceOf[IMarkdownCellModel]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: IMarkdownCellModel] (val x: Self) extends AnyVal {
      
      inline def setType(value: markdown): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  trait IRawCellModel
    extends StObject
       with IAttachmentsCellModel {
    
    /**
      * The type of the cell.
      */
    @JSName("type")
    val type_IRawCellModel: raw
  }
  object IRawCellModel {
    
    inline def apply(
      attachments: IAttachmentsModel,
      contentChanged: ISignal[ICellModel, Unit],
      id: String,
      metadata: IObservableJSON,
      mimeType: String,
      mimeTypeChanged: ISignal[
          IModel, 
          typings.jupyterlabCoreutils.libInterfacesMod.IChangedArgs[String, String, String]
        ],
      modelDB: IModelDB,
      selections: IObservableMap[js.Array[ITextSelection]],
      sharedModel: ISharedCell & ISharedText,
      sharedModelSwitched: ISignal[IModel, Boolean],
      stateChanged: ISignal[
          ICellModel, 
          typings.jupyterlabCoreutils.libInterfacesMod.IChangedArgs[Any, Any, String]
        ],
      switchSharedModel: (ISharedText, Boolean) => Unit,
      toJSON: () => ICell,
      trusted: Boolean,
      value: IObservableString
    ): IRawCellModel = {
      val __obj = js.Dynamic.literal(attachments = attachments.asInstanceOf[js.Any], contentChanged = contentChanged.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], metadata = metadata.asInstanceOf[js.Any], mimeType = mimeType.asInstanceOf[js.Any], mimeTypeChanged = mimeTypeChanged.asInstanceOf[js.Any], modelDB = modelDB.asInstanceOf[js.Any], selections = selections.asInstanceOf[js.Any], sharedModel = sharedModel.asInstanceOf[js.Any], sharedModelSwitched = sharedModelSwitched.asInstanceOf[js.Any], stateChanged = stateChanged.asInstanceOf[js.Any], switchSharedModel = js.Any.fromFunction2(switchSharedModel), toJSON = js.Any.fromFunction0(toJSON), trusted = trusted.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("raw")
      __obj.asInstanceOf[IRawCellModel]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: IRawCellModel] (val x: Self) extends AnyVal {
      
      inline def setType(value: raw): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
}
