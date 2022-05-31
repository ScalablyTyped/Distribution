package typings.jupyterlabCells

import typings.jupyterlabAttachments.modelMod.IAttachmentsModel
import typings.jupyterlabCells.jupyterlabCellsStrings.code
import typings.jupyterlabCells.jupyterlabCellsStrings.markdown
import typings.jupyterlabCells.jupyterlabCellsStrings.raw
import typings.jupyterlabCells.modelMod.AttachmentsCellModel.IOptions
import typings.jupyterlabCodeeditor.editorMod.CodeEditor.IModel
import typings.jupyterlabCodeeditor.editorMod.CodeEditor.ITextSelection
import typings.jupyterlabCodeeditor.mod.CodeEditor.Model
import typings.jupyterlabNbformat.mod.CellType
import typings.jupyterlabNbformat.mod.ExecutionCount
import typings.jupyterlabNbformat.mod.IBaseCell
import typings.jupyterlabNbformat.mod.ICell
import typings.jupyterlabObservables.mod.ObservableValue.IChangedArgs
import typings.jupyterlabObservables.modeldbMod.IModelDB
import typings.jupyterlabObservables.modeldbMod.IObservableValue
import typings.jupyterlabObservables.observablejsonMod.IObservableJSON
import typings.jupyterlabObservables.observablemapMod.IObservableMap
import typings.jupyterlabObservables.observablestringMod.IObservableString
import typings.jupyterlabOutputarea.modelMod.IOutputAreaModel
import typings.luminoSignaling.mod.ISignal
import typings.luminoSignaling.mod.Signal
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object modelMod {
  
  @JSImport("@jupyterlab/cells/lib/model", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@jupyterlab/cells/lib/model", "AttachmentsCellModel")
  @js.native
  class AttachmentsCellModel protected () extends CellModel {
    /**
      * Construct a new cell with optional attachments.
      */
    def this(options: IOptions) = this()
    
    /* private */ var _attachments: js.Any = js.native
    
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
    class ContentFactory ()
      extends StObject
         with IContentFactory {
      
      /**
        * Create an output area.
        */
      /* CompleteClass */
      override def createAttachmentsModel(options: typings.jupyterlabAttachments.modelMod.IAttachmentsModel.IOptions): IAttachmentsModel = js.native
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
      def createAttachmentsModel(options: typings.jupyterlabAttachments.modelMod.IAttachmentsModel.IOptions): IAttachmentsModel
    }
    object IContentFactory {
      
      inline def apply(
        createAttachmentsModel: typings.jupyterlabAttachments.modelMod.IAttachmentsModel.IOptions => IAttachmentsModel
      ): IContentFactory = {
        val __obj = js.Dynamic.literal(createAttachmentsModel = js.Any.fromFunction1(createAttachmentsModel))
        __obj.asInstanceOf[IContentFactory]
      }
      
      extension [Self <: IContentFactory](x: Self) {
        
        inline def setCreateAttachmentsModel(value: typings.jupyterlabAttachments.modelMod.IAttachmentsModel.IOptions => IAttachmentsModel): Self = StObject.set(x, "createAttachmentsModel", js.Any.fromFunction1(value))
      }
    }
    
    /**
      * The options used to initialize a `AttachmentsCellModel`.
      */
    trait IOptions
      extends StObject
         with typings.jupyterlabCells.modelMod.CellModel.IOptions {
      
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
      
      extension [Self <: IOptions](x: Self) {
        
        inline def setContentFactory(value: IContentFactory): Self = StObject.set(x, "contentFactory", value.asInstanceOf[js.Any])
        
        inline def setContentFactoryUndefined: Self = StObject.set(x, "contentFactory", js.undefined)
      }
    }
  }
  
  /* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
  - typings.luminoDisposable.mod.IDisposable because Already inherited
  - typings.jupyterlabCodeeditor.editorMod.CodeEditor.IModel because Already inherited
  - typings.jupyterlabCells.modelMod.ICellModel because var conflicts: mimeType, mimeTypeChanged. Inlined `type`, id, contentChanged, stateChanged, trusted, metadata, toJSON */ @JSImport("@jupyterlab/cells/lib/model", "CellModel")
  @js.native
  class CellModel protected () extends Model {
    /**
      * Construct a cell model from optional cell content.
      */
    def this(options: typings.jupyterlabCells.modelMod.CellModel.IOptions) = this()
    
    /**
      * A signal emitted when the state of the model changes.
      */
    val contentChanged: (ISignal[ICellModel, Unit]) | (Signal[this.type, Unit]) = js.native
    
    /**
      * The id for the cell.
      */
    val id: String = js.native
    
    /**
      * The metadata associated with the cell.
      */
    def metadata: IObservableJSON = js.native
    /**
      * The metadata associated with the cell.
      */
    @JSName("metadata")
    val metadata_FCellModel: IObservableJSON = js.native
    
    /**
      * Handle a change to the observable value.
      */
    /* protected */ def onGenericChange(): Unit = js.native
    
    /**
      * Handle a change to the trusted state.
      *
      * The default implementation is a no-op.
      */
    def onTrustedChanged(trusted: IObservableValue, args: IChangedArgs): Unit = js.native
    
    /**
      * A signal emitted when a model state changes.
      */
    val stateChanged: (ISignal[
        ICellModel, 
        typings.jupyterlabCoreutils.interfacesMod.IChangedArgs[js.Any, js.Any, String]
      ]) | (Signal[
        this.type, 
        typings.jupyterlabCoreutils.interfacesMod.IChangedArgs[js.Any, js.Any, String]
      ]) = js.native
    
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
    /**
      * Whether the cell is trusted.
      */
    @JSName("trusted")
    var trusted_FCellModel: Boolean = js.native
    
    /**
      * The type of cell.
      */
    val `type`: CellType = js.native
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
      
      inline def apply(): typings.jupyterlabCells.modelMod.CellModel.IOptions = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[typings.jupyterlabCells.modelMod.CellModel.IOptions]
      }
      
      extension [Self <: typings.jupyterlabCells.modelMod.CellModel.IOptions](x: Self) {
        
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
  - typings.luminoDisposable.mod.IDisposable because Already inherited
  - typings.jupyterlabCodeeditor.editorMod.CodeEditor.IModel because Already inherited
  - typings.jupyterlabCells.modelMod.ICellModel because Already inherited
  - typings.jupyterlabCells.modelMod.ICodeCellModel because var conflicts: metadata, mimeType, mimeTypeChanged, trusted. Inlined executionCount, outputs, clearExecution */ @JSImport("@jupyterlab/cells/lib/model", "CodeCellModel")
  @js.native
  class CodeCellModel protected () extends CellModel {
    /**
      * Construct a new code cell with optional original cell content.
      */
    def this(options: typings.jupyterlabCells.modelMod.CodeCellModel.IOptions) = this()
    
    /**
      * Handle a change to the execution count.
      */
    /* private */ var _onExecutionCountChanged: js.Any = js.native
    
    /* private */ var _outputs: js.Any = js.native
    
    /**
      * Clear execution, outputs, and related metadata
      */
    def clearExecution(): Unit = js.native
    
    /**
      * The execution count of the cell.
      */
    def executionCount: ExecutionCount = js.native
    def executionCount_=(newValue: ExecutionCount): Unit = js.native
    /**
      * The code cell's prompt number. Will be null if the cell has not been run.
      */
    @JSName("executionCount")
    var executionCount_FCodeCellModel: ExecutionCount = js.native
    
    /**
      * The cell outputs.
      */
    def outputs: IOutputAreaModel = js.native
    /**
      * The cell outputs.
      */
    @JSName("outputs")
    val outputs_FCodeCellModel: IOutputAreaModel = js.native
    
    /**
      * The type of the cell.
      */
    @JSName("type")
    def type_MCodeCellModel: code = js.native
  }
  object CodeCellModel {
    
    /**
      * The default implementation of an `IContentFactory`.
      */
    @JSImport("@jupyterlab/cells/lib/model", "CodeCellModel.ContentFactory")
    @js.native
    class ContentFactory ()
      extends StObject
         with IContentFactory {
      
      /**
        * Create an output area.
        */
      /* CompleteClass */
      override def createOutputArea(options: typings.jupyterlabOutputarea.modelMod.IOutputAreaModel.IOptions): IOutputAreaModel = js.native
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
      def createOutputArea(options: typings.jupyterlabOutputarea.modelMod.IOutputAreaModel.IOptions): IOutputAreaModel
    }
    object IContentFactory {
      
      inline def apply(
        createOutputArea: typings.jupyterlabOutputarea.modelMod.IOutputAreaModel.IOptions => IOutputAreaModel
      ): IContentFactory = {
        val __obj = js.Dynamic.literal(createOutputArea = js.Any.fromFunction1(createOutputArea))
        __obj.asInstanceOf[IContentFactory]
      }
      
      extension [Self <: IContentFactory](x: Self) {
        
        inline def setCreateOutputArea(value: typings.jupyterlabOutputarea.modelMod.IOutputAreaModel.IOptions => IOutputAreaModel): Self = StObject.set(x, "createOutputArea", js.Any.fromFunction1(value))
      }
    }
    
    /**
      * The options used to initialize a `CodeCellModel`.
      */
    trait IOptions
      extends StObject
         with typings.jupyterlabCells.modelMod.CellModel.IOptions {
      
      /**
        * The factory for output area model creation.
        */
      var contentFactory: js.UndefOr[IContentFactory] = js.undefined
    }
    object IOptions {
      
      inline def apply(): typings.jupyterlabCells.modelMod.CodeCellModel.IOptions = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[typings.jupyterlabCells.modelMod.CodeCellModel.IOptions]
      }
      
      extension [Self <: typings.jupyterlabCells.modelMod.CodeCellModel.IOptions](x: Self) {
        
        inline def setContentFactory(value: IContentFactory): Self = StObject.set(x, "contentFactory", value.asInstanceOf[js.Any])
        
        inline def setContentFactoryUndefined: Self = StObject.set(x, "contentFactory", js.undefined)
      }
    }
  }
  
  @JSImport("@jupyterlab/cells/lib/model", "MarkdownCellModel")
  @js.native
  class MarkdownCellModel protected () extends AttachmentsCellModel {
    /**
      * Construct a markdown cell model from optional cell content.
      */
    def this(options: typings.jupyterlabCells.modelMod.CellModel.IOptions) = this()
    
    /**
      * The type of the cell.
      */
    @JSName("type")
    def type_MMarkdownCellModel: markdown = js.native
  }
  
  @JSImport("@jupyterlab/cells/lib/model", "RawCellModel")
  @js.native
  class RawCellModel protected () extends AttachmentsCellModel {
    /**
      * Construct a new cell with optional attachments.
      */
    def this(options: IOptions) = this()
    
    /**
      * The type of the cell.
      */
    @JSName("type")
    def type_MRawCellModel: raw = js.native
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
      dispose: () => Unit,
      id: String,
      isDisposed: Boolean,
      metadata: IObservableJSON,
      mimeType: String,
      mimeTypeChanged: ISignal[
          IModel, 
          typings.jupyterlabCoreutils.interfacesMod.IChangedArgs[String, String, String]
        ],
      modelDB: IModelDB,
      selections: IObservableMap[js.Array[ITextSelection]],
      stateChanged: ISignal[
          ICellModel, 
          typings.jupyterlabCoreutils.interfacesMod.IChangedArgs[js.Any, js.Any, String]
        ],
      toJSON: () => ICell,
      trusted: Boolean,
      `type`: CellType,
      value: IObservableString
    ): IAttachmentsCellModel = {
      val __obj = js.Dynamic.literal(attachments = attachments.asInstanceOf[js.Any], contentChanged = contentChanged.asInstanceOf[js.Any], dispose = js.Any.fromFunction0(dispose), id = id.asInstanceOf[js.Any], isDisposed = isDisposed.asInstanceOf[js.Any], metadata = metadata.asInstanceOf[js.Any], mimeType = mimeType.asInstanceOf[js.Any], mimeTypeChanged = mimeTypeChanged.asInstanceOf[js.Any], modelDB = modelDB.asInstanceOf[js.Any], selections = selections.asInstanceOf[js.Any], stateChanged = stateChanged.asInstanceOf[js.Any], toJSON = js.Any.fromFunction0(toJSON), trusted = trusted.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[IAttachmentsCellModel]
    }
    
    extension [Self <: IAttachmentsCellModel](x: Self) {
      
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
    
    /**
      * A signal emitted when a model state changes.
      */
    val stateChanged: ISignal[
        ICellModel, 
        typings.jupyterlabCoreutils.interfacesMod.IChangedArgs[js.Any, js.Any, String]
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
      dispose: () => Unit,
      id: String,
      isDisposed: Boolean,
      metadata: IObservableJSON,
      mimeType: String,
      mimeTypeChanged: ISignal[
          IModel, 
          typings.jupyterlabCoreutils.interfacesMod.IChangedArgs[String, String, String]
        ],
      modelDB: IModelDB,
      selections: IObservableMap[js.Array[ITextSelection]],
      stateChanged: ISignal[
          ICellModel, 
          typings.jupyterlabCoreutils.interfacesMod.IChangedArgs[js.Any, js.Any, String]
        ],
      toJSON: () => ICell,
      trusted: Boolean,
      `type`: CellType,
      value: IObservableString
    ): ICellModel = {
      val __obj = js.Dynamic.literal(contentChanged = contentChanged.asInstanceOf[js.Any], dispose = js.Any.fromFunction0(dispose), id = id.asInstanceOf[js.Any], isDisposed = isDisposed.asInstanceOf[js.Any], metadata = metadata.asInstanceOf[js.Any], mimeType = mimeType.asInstanceOf[js.Any], mimeTypeChanged = mimeTypeChanged.asInstanceOf[js.Any], modelDB = modelDB.asInstanceOf[js.Any], selections = selections.asInstanceOf[js.Any], stateChanged = stateChanged.asInstanceOf[js.Any], toJSON = js.Any.fromFunction0(toJSON), trusted = trusted.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[ICellModel]
    }
    
    extension [Self <: ICellModel](x: Self) {
      
      inline def setContentChanged(value: ISignal[ICellModel, Unit]): Self = StObject.set(x, "contentChanged", value.asInstanceOf[js.Any])
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setMetadata(value: IObservableJSON): Self = StObject.set(x, "metadata", value.asInstanceOf[js.Any])
      
      inline def setStateChanged(
        value: ISignal[
              ICellModel, 
              typings.jupyterlabCoreutils.interfacesMod.IChangedArgs[js.Any, js.Any, String]
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
      dispose: () => Unit,
      id: String,
      isDisposed: Boolean,
      metadata: IObservableJSON,
      mimeType: String,
      mimeTypeChanged: ISignal[
          IModel, 
          typings.jupyterlabCoreutils.interfacesMod.IChangedArgs[String, String, String]
        ],
      modelDB: IModelDB,
      outputs: IOutputAreaModel,
      selections: IObservableMap[js.Array[ITextSelection]],
      stateChanged: ISignal[
          ICellModel, 
          typings.jupyterlabCoreutils.interfacesMod.IChangedArgs[js.Any, js.Any, String]
        ],
      toJSON: () => ICell,
      trusted: Boolean,
      value: IObservableString
    ): ICodeCellModel = {
      val __obj = js.Dynamic.literal(clearExecution = js.Any.fromFunction0(clearExecution), contentChanged = contentChanged.asInstanceOf[js.Any], dispose = js.Any.fromFunction0(dispose), id = id.asInstanceOf[js.Any], isDisposed = isDisposed.asInstanceOf[js.Any], metadata = metadata.asInstanceOf[js.Any], mimeType = mimeType.asInstanceOf[js.Any], mimeTypeChanged = mimeTypeChanged.asInstanceOf[js.Any], modelDB = modelDB.asInstanceOf[js.Any], outputs = outputs.asInstanceOf[js.Any], selections = selections.asInstanceOf[js.Any], stateChanged = stateChanged.asInstanceOf[js.Any], toJSON = js.Any.fromFunction0(toJSON), trusted = trusted.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any], executionCount = null)
      __obj.updateDynamic("type")("code")
      __obj.asInstanceOf[ICodeCellModel]
    }
    
    extension [Self <: ICodeCellModel](x: Self) {
      
      inline def setClearExecution(value: () => Unit): Self = StObject.set(x, "clearExecution", js.Any.fromFunction0(value))
      
      inline def setExecutionCount(value: ExecutionCount): Self = StObject.set(x, "executionCount", value.asInstanceOf[js.Any])
      
      inline def setExecutionCountNull: Self = StObject.set(x, "executionCount", null)
      
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
      dispose: () => Unit,
      id: String,
      isDisposed: Boolean,
      metadata: IObservableJSON,
      mimeType: String,
      mimeTypeChanged: ISignal[
          IModel, 
          typings.jupyterlabCoreutils.interfacesMod.IChangedArgs[String, String, String]
        ],
      modelDB: IModelDB,
      selections: IObservableMap[js.Array[ITextSelection]],
      stateChanged: ISignal[
          ICellModel, 
          typings.jupyterlabCoreutils.interfacesMod.IChangedArgs[js.Any, js.Any, String]
        ],
      toJSON: () => ICell,
      trusted: Boolean,
      value: IObservableString
    ): IMarkdownCellModel = {
      val __obj = js.Dynamic.literal(attachments = attachments.asInstanceOf[js.Any], contentChanged = contentChanged.asInstanceOf[js.Any], dispose = js.Any.fromFunction0(dispose), id = id.asInstanceOf[js.Any], isDisposed = isDisposed.asInstanceOf[js.Any], metadata = metadata.asInstanceOf[js.Any], mimeType = mimeType.asInstanceOf[js.Any], mimeTypeChanged = mimeTypeChanged.asInstanceOf[js.Any], modelDB = modelDB.asInstanceOf[js.Any], selections = selections.asInstanceOf[js.Any], stateChanged = stateChanged.asInstanceOf[js.Any], toJSON = js.Any.fromFunction0(toJSON), trusted = trusted.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("markdown")
      __obj.asInstanceOf[IMarkdownCellModel]
    }
    
    extension [Self <: IMarkdownCellModel](x: Self) {
      
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
      dispose: () => Unit,
      id: String,
      isDisposed: Boolean,
      metadata: IObservableJSON,
      mimeType: String,
      mimeTypeChanged: ISignal[
          IModel, 
          typings.jupyterlabCoreutils.interfacesMod.IChangedArgs[String, String, String]
        ],
      modelDB: IModelDB,
      selections: IObservableMap[js.Array[ITextSelection]],
      stateChanged: ISignal[
          ICellModel, 
          typings.jupyterlabCoreutils.interfacesMod.IChangedArgs[js.Any, js.Any, String]
        ],
      toJSON: () => ICell,
      trusted: Boolean,
      value: IObservableString
    ): IRawCellModel = {
      val __obj = js.Dynamic.literal(attachments = attachments.asInstanceOf[js.Any], contentChanged = contentChanged.asInstanceOf[js.Any], dispose = js.Any.fromFunction0(dispose), id = id.asInstanceOf[js.Any], isDisposed = isDisposed.asInstanceOf[js.Any], metadata = metadata.asInstanceOf[js.Any], mimeType = mimeType.asInstanceOf[js.Any], mimeTypeChanged = mimeTypeChanged.asInstanceOf[js.Any], modelDB = modelDB.asInstanceOf[js.Any], selections = selections.asInstanceOf[js.Any], stateChanged = stateChanged.asInstanceOf[js.Any], toJSON = js.Any.fromFunction0(toJSON), trusted = trusted.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("raw")
      __obj.asInstanceOf[IRawCellModel]
    }
    
    extension [Self <: IRawCellModel](x: Self) {
      
      inline def setType(value: raw): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
}
