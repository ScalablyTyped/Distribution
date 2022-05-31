package typings.jupyterlabCells

import typings.jupyterlabApputils.sessioncontextMod.ISessionContext
import typings.jupyterlabCells.anon.PartialIConfig
import typings.jupyterlabCells.headerfooterMod.ICellFooter
import typings.jupyterlabCells.headerfooterMod.ICellHeader
import typings.jupyterlabCells.inputareaMod.IInputPrompt
import typings.jupyterlabCells.inputareaMod.InputArea
import typings.jupyterlabCells.modelMod.IAttachmentsCellModel
import typings.jupyterlabCells.modelMod.ICellModel
import typings.jupyterlabCells.modelMod.ICodeCellModel
import typings.jupyterlabCells.modelMod.IMarkdownCellModel
import typings.jupyterlabCells.modelMod.IRawCellModel
import typings.jupyterlabCells.widgetMod.Cell.IContentFactory
import typings.jupyterlabCells.widgetMod.Cell.IOptions
import typings.jupyterlabCodeeditor.editorMod.CodeEditor.Factory
import typings.jupyterlabCodeeditor.editorMod.CodeEditor.IEditor
import typings.jupyterlabCodeeditor.mod.CodeEditorWrapper
import typings.jupyterlabObservables.observablejsonMod.IObservableJSON
import typings.jupyterlabObservables.observablemapMod.IObservableMap.IChangedArgs
import typings.jupyterlabOutputarea.mod.OutputArea
import typings.jupyterlabOutputarea.widgetMod.IOutputPrompt
import typings.jupyterlabOutputarea.widgetMod.IStdin
import typings.jupyterlabRendermime.tokensMod.IRenderMimeRegistry
import typings.jupyterlabServices.messagesMod.IExecuteReplyMsg
import typings.luminoCoreutils.jsonMod.JSONObject
import typings.luminoCoreutils.jsonMod.PartialJSONValue
import typings.luminoWidgets.mod.Widget
import typings.std.Event
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object widgetMod {
  
  @JSImport("@jupyterlab/cells/lib/widget", "AttachmentsCell")
  @js.native
  abstract class AttachmentsCell protected () extends Cell {
    /**
      * Construct a new base cell widget.
      */
    def this(options: IOptions) = this()
    
    /**
      * Takes in a file object and adds it to
      * the cell attachments
      */
    /* private */ var _attachFile: js.Any = js.native
    
    /**
      * Attaches all DataTransferItems (obtained from
      * clipboard or native drop events) to the cell
      */
    /* private */ var _attachFiles: js.Any = js.native
    
    /* private */ var _evtDragOver: js.Any = js.native
    
    /**
      * Handle the `'lm-drop'` event for the widget.
      */
    /* private */ var _evtDrop: js.Any = js.native
    
    /**
      * Handle the `drop` event for the widget
      */
    /* private */ var _evtNativeDrop: js.Any = js.native
    
    /**
      * Handle the `paste` event for the widget
      */
    /* private */ var _evtPaste: js.Any = js.native
    
    /**
      * Generates a unique URI for a file
      * while preserving the file extension.
      */
    /* private */ var _generateURI: js.Any = js.native
    
    /**
      * Handle the DOM events for the widget.
      *
      * @param event - The DOM event sent to the widget.
      *
      * #### Notes
      * This method implements the DOM `EventListener` interface and is
      * called in response to events on the notebook panel's node. It should
      * not be called directly by user code.
      */
    def handleEvent(event: Event): Unit = js.native
    
    /**
      * The model used by the widget.
      */
    @JSName("model")
    val model_FAttachmentsCell: IAttachmentsCellModel = js.native
    
    /**
      * Modify the cell source to include a reference to the attachment.
      */
    /* protected */ def updateCellSourceWithAttachment(attachmentName: String): Unit = js.native
    /* protected */ def updateCellSourceWithAttachment(attachmentName: String, URI: String): Unit = js.native
  }
  
  @JSImport("@jupyterlab/cells/lib/widget", "Cell")
  @js.native
  class Cell protected () extends Widget {
    /**
      * Construct a new base cell widget.
      */
    def this(options: IOptions) = this()
    
    /* private */ var _input: js.Any = js.native
    
    /* private */ var _inputHidden: js.Any = js.native
    
    /* private */ var _inputPlaceholder: js.Any = js.native
    
    /* private */ var _inputWrapper: js.Any = js.native
    
    /* private */ var _model: js.Any = js.native
    
    /* private */ var _readOnly: js.Any = js.native
    
    /* private */ var _syncCollapse: js.Any = js.native
    
    /* private */ var _syncEditable: js.Any = js.native
    
    /**
      * The content factory used by the widget.
      */
    val contentFactory: IContentFactory = js.native
    
    /**
      * Get the CodeEditor used by the cell.
      */
    def editor: IEditor = js.native
    
    /**
      * Get the CodeEditorWrapper used by the cell.
      */
    def editorWidget: CodeEditorWrapper = js.native
    
    /**
      * Handle the input being hidden.
      *
      * #### Notes
      * This is called by the `inputHidden` setter so that subclasses
      * can perform actions upon the input being hidden without accessing
      * private state.
      */
    /* protected */ def handleInputHidden(value: Boolean): Unit = js.native
    
    /**
      * Initialize view state from model.
      *
      * #### Notes
      * Should be called after construction. For convenience, returns this, so it
      * can be chained in the construction, like `new Foo().initializeState();`
      */
    def initializeState(): this.type = js.native
    
    /**
      * Get the input area for the cell.
      */
    def inputArea: InputArea = js.native
    
    /**
      * The view state of input being hidden.
      */
    def inputHidden: Boolean = js.native
    def inputHidden_=(value: Boolean): Unit = js.native
    
    /**
      * Revert view collapse state from model.
      */
    def loadCollapseState(): Unit = js.native
    
    /**
      * Load view editable state from model.
      */
    def loadEditableState(): Unit = js.native
    
    /**
      * Get the model used by the cell.
      */
    def model: ICellModel = js.native
    
    /**
      * Handle changes in the metadata.
      */
    /* protected */ def onMetadataChanged(model: IObservableJSON, args: IChangedArgs[js.UndefOr[PartialJSONValue]]): Unit = js.native
    
    /**
      * Get the prompt node used by the cell.
      */
    def promptNode: HTMLElement = js.native
    
    /**
      * The read only state of the cell.
      */
    def readOnly: Boolean = js.native
    def readOnly_=(value: Boolean): Unit = js.native
    
    /**
      * A promise that resolves when the widget renders for the first time.
      */
    def ready: js.Promise[Unit] = js.native
    
    /**
      * Save view collapse state to model
      */
    def saveCollapseState(): Unit = js.native
    
    /**
      * Save view editable state to model
      */
    def saveEditableState(): Unit = js.native
    
    /**
      * Set the prompt for the widget.
      */
    def setPrompt(value: String): Unit = js.native
    
    /**
      * Whether to sync the collapse state to the cell model.
      */
    def syncCollapse: Boolean = js.native
    def syncCollapse_=(value: Boolean): Unit = js.native
    
    /**
      * Whether to sync the editable state to the cell model.
      */
    def syncEditable: Boolean = js.native
    def syncEditable_=(value: Boolean): Unit = js.native
  }
  object Cell {
    
    /**
      * The default implementation of an `IContentFactory`.
      *
      * This includes a CodeMirror editor factory to make it easy to use out of the box.
      */
    @JSImport("@jupyterlab/cells/lib/widget", "Cell.ContentFactory")
    @js.native
    /**
      * Create a content factory for a cell.
      */
    class ContentFactory ()
      extends StObject
         with IContentFactory {
      def this(options: typings.jupyterlabCells.widgetMod.Cell.ContentFactory.IOptions) = this()
      
      /* private */ var _editorFactory: js.Any = js.native
      
      /**
        * Create a new cell header for the parent widget.
        */
      /* CompleteClass */
      override def createCellFooter(): ICellFooter = js.native
      
      /**
        * Create a new cell header for the parent widget.
        */
      /* CompleteClass */
      override def createCellHeader(): ICellHeader = js.native
      
      /**
        * Create an input prompt.
        */
      /* CompleteClass */
      override def createInputPrompt(): IInputPrompt = js.native
      
      /**
        * Create an output prompt.
        */
      /* CompleteClass */
      override def createOutputPrompt(): IOutputPrompt = js.native
      
      /**
        * Create an stdin widget.
        */
      /* CompleteClass */
      override def createStdin(options: typings.jupyterlabOutputarea.widgetMod.Stdin.IOptions): IStdin = js.native
      
      /**
        * The editor factory we need to include in `CodeEditorWratter.IOptions`.
        *
        * This is a separate readonly attribute rather than a factory method as we need
        * to pass it around.
        */
      /* CompleteClass */
      override val editorFactory: Factory = js.native
      /**
        * The readonly editor factory that create code editors
        */
      @JSName("editorFactory")
      def editorFactory_MContentFactory: Factory = js.native
    }
    /**
      * A namespace for cell content factory.
      */
    object ContentFactory {
      
      /**
        * Options for the content factory.
        */
      trait IOptions extends StObject {
        
        /**
          * The editor factory used by the content factory.
          *
          * If this is not passed, a default CodeMirror editor factory
          * will be used.
          */
        var editorFactory: js.UndefOr[Factory] = js.undefined
      }
      object IOptions {
        
        inline def apply(): typings.jupyterlabCells.widgetMod.Cell.ContentFactory.IOptions = {
          val __obj = js.Dynamic.literal()
          __obj.asInstanceOf[typings.jupyterlabCells.widgetMod.Cell.ContentFactory.IOptions]
        }
        
        extension [Self <: typings.jupyterlabCells.widgetMod.Cell.ContentFactory.IOptions](x: Self) {
          
          inline def setEditorFactory(value: /* options */ typings.jupyterlabCodeeditor.editorMod.CodeEditor.IOptions => IEditor): Self = StObject.set(x, "editorFactory", js.Any.fromFunction1(value))
          
          inline def setEditorFactoryUndefined: Self = StObject.set(x, "editorFactory", js.undefined)
        }
      }
    }
    
    /**
      * The default content factory for cells.
      */
    @JSImport("@jupyterlab/cells/lib/widget", "Cell.defaultContentFactory")
    @js.native
    val defaultContentFactory: ContentFactory = js.native
    
    /**
      * The factory object for customizable cell children.
      *
      * This is used to allow users of cells to customize child content.
      *
      * This inherits from `OutputArea.IContentFactory` to avoid needless nesting and
      * provide a single factory object for all notebook/cell/outputarea related
      * widgets.
      */
    trait IContentFactory
      extends StObject
         with typings.jupyterlabOutputarea.widgetMod.OutputArea.IContentFactory
         with typings.jupyterlabCells.inputareaMod.InputArea.IContentFactory {
      
      /**
        * Create a new cell header for the parent widget.
        */
      def createCellFooter(): ICellFooter
      
      /**
        * Create a new cell header for the parent widget.
        */
      def createCellHeader(): ICellHeader
    }
    object IContentFactory {
      
      inline def apply(
        createCellFooter: () => ICellFooter,
        createCellHeader: () => ICellHeader,
        createInputPrompt: () => IInputPrompt,
        createOutputPrompt: () => IOutputPrompt,
        createStdin: typings.jupyterlabOutputarea.widgetMod.Stdin.IOptions => IStdin,
        editorFactory: /* options */ typings.jupyterlabCodeeditor.editorMod.CodeEditor.IOptions => IEditor
      ): IContentFactory = {
        val __obj = js.Dynamic.literal(createCellFooter = js.Any.fromFunction0(createCellFooter), createCellHeader = js.Any.fromFunction0(createCellHeader), createInputPrompt = js.Any.fromFunction0(createInputPrompt), createOutputPrompt = js.Any.fromFunction0(createOutputPrompt), createStdin = js.Any.fromFunction1(createStdin), editorFactory = js.Any.fromFunction1(editorFactory))
        __obj.asInstanceOf[IContentFactory]
      }
      
      extension [Self <: IContentFactory](x: Self) {
        
        inline def setCreateCellFooter(value: () => ICellFooter): Self = StObject.set(x, "createCellFooter", js.Any.fromFunction0(value))
        
        inline def setCreateCellHeader(value: () => ICellHeader): Self = StObject.set(x, "createCellHeader", js.Any.fromFunction0(value))
      }
    }
    
    /**
      * An options object for initializing a cell widget.
      */
    trait IOptions extends StObject {
      
      /**
        * The factory object for customizable cell children.
        */
      var contentFactory: js.UndefOr[IContentFactory] = js.undefined
      
      /**
        * The configuration options for the text editor widget.
        */
      var editorConfig: js.UndefOr[PartialIConfig] = js.undefined
      
      /**
        * The model used by the cell.
        */
      var model: ICellModel
      
      /**
        * Whether to send an update request to the editor when it is shown.
        */
      var updateEditorOnShow: js.UndefOr[Boolean] = js.undefined
    }
    object IOptions {
      
      inline def apply(model: ICellModel): IOptions = {
        val __obj = js.Dynamic.literal(model = model.asInstanceOf[js.Any])
        __obj.asInstanceOf[IOptions]
      }
      
      extension [Self <: IOptions](x: Self) {
        
        inline def setContentFactory(value: IContentFactory): Self = StObject.set(x, "contentFactory", value.asInstanceOf[js.Any])
        
        inline def setContentFactoryUndefined: Self = StObject.set(x, "contentFactory", js.undefined)
        
        inline def setEditorConfig(value: PartialIConfig): Self = StObject.set(x, "editorConfig", value.asInstanceOf[js.Any])
        
        inline def setEditorConfigUndefined: Self = StObject.set(x, "editorConfig", js.undefined)
        
        inline def setModel(value: ICellModel): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
        
        inline def setUpdateEditorOnShow(value: Boolean): Self = StObject.set(x, "updateEditorOnShow", value.asInstanceOf[js.Any])
        
        inline def setUpdateEditorOnShowUndefined: Self = StObject.set(x, "updateEditorOnShow", js.undefined)
      }
    }
  }
  
  @JSImport("@jupyterlab/cells/lib/widget", "CodeCell")
  @js.native
  class CodeCell protected () extends Cell {
    /**
      * Construct a code cell widget.
      */
    def this(options: typings.jupyterlabCells.widgetMod.CodeCell.IOptions) = this()
    
    /* private */ var _output: js.Any = js.native
    
    /* private */ var _outputHidden: js.Any = js.native
    
    /**
      * Handle changes in the number of outputs in the output area.
      */
    /* private */ var _outputLengthHandler: js.Any = js.native
    
    /* private */ var _outputPlaceholder: js.Any = js.native
    
    /* private */ var _outputWrapper: js.Any = js.native
    
    /* private */ var _outputsScrolled: js.Any = js.native
    
    /* private */ var _rendermime: js.Any = js.native
    
    /* private */ var _savingMetadata: js.Any = js.native
    
    /* private */ var _syncScrolled: js.Any = js.native
    
    /**
      * Clone the OutputArea alone, returning a simplified output area, using the same model.
      */
    def cloneOutputArea(): OutputArea = js.native
    
    /**
      * Revert view collapse state from model.
      */
    def loadScrolledState(): Unit = js.native
    
    /**
      * The model used by the widget.
      */
    @JSName("model")
    val model_FCodeCell: ICodeCellModel = js.native
    
    /**
      * Handle changes in the model.
      */
    /* protected */ def onStateChanged(
      model: ICellModel,
      args: typings.jupyterlabCoreutils.interfacesMod.IChangedArgs[js.Any, js.Any, String]
    ): Unit = js.native
    
    /**
      * Get the output area for the cell.
      */
    def outputArea: OutputArea = js.native
    
    /**
      * The view state of output being collapsed.
      */
    def outputHidden: Boolean = js.native
    def outputHidden_=(value: Boolean): Unit = js.native
    
    /**
      * Whether the output is in a scrolled state?
      */
    def outputsScrolled: Boolean = js.native
    def outputsScrolled_=(value: Boolean): Unit = js.native
    
    /**
      * Save view collapse state to model
      */
    def saveScrolledState(): Unit = js.native
    
    /**
      * Whether to sync the scrolled state to the cell model.
      */
    def syncScrolled: Boolean = js.native
    def syncScrolled_=(value: Boolean): Unit = js.native
  }
  object CodeCell {
    
    @JSImport("@jupyterlab/cells/lib/widget", "CodeCell")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Execute a cell given a client session.
      */
    inline def execute(cell: CodeCell, sessionContext: ISessionContext): js.Promise[IExecuteReplyMsg | Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("execute")(cell.asInstanceOf[js.Any], sessionContext.asInstanceOf[js.Any])).asInstanceOf[js.Promise[IExecuteReplyMsg | Unit]]
    inline def execute(cell: CodeCell, sessionContext: ISessionContext, metadata: JSONObject): js.Promise[IExecuteReplyMsg | Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("execute")(cell.asInstanceOf[js.Any], sessionContext.asInstanceOf[js.Any], metadata.asInstanceOf[js.Any])).asInstanceOf[js.Promise[IExecuteReplyMsg | Unit]]
    
    /**
      * An options object for initializing a base cell widget.
      */
    trait IOptions
      extends StObject
         with typings.jupyterlabCells.widgetMod.Cell.IOptions {
      
      /**
        * The mime renderer for the cell widget.
        */
      var rendermime: IRenderMimeRegistry
    }
    object IOptions {
      
      inline def apply(model: ICellModel, rendermime: IRenderMimeRegistry): typings.jupyterlabCells.widgetMod.CodeCell.IOptions = {
        val __obj = js.Dynamic.literal(model = model.asInstanceOf[js.Any], rendermime = rendermime.asInstanceOf[js.Any])
        __obj.asInstanceOf[typings.jupyterlabCells.widgetMod.CodeCell.IOptions]
      }
      
      extension [Self <: typings.jupyterlabCells.widgetMod.CodeCell.IOptions](x: Self) {
        
        inline def setRendermime(value: IRenderMimeRegistry): Self = StObject.set(x, "rendermime", value.asInstanceOf[js.Any])
      }
    }
  }
  
  @JSImport("@jupyterlab/cells/lib/widget", "MarkdownCell")
  @js.native
  class MarkdownCell protected () extends AttachmentsCell {
    /**
      * Construct a Markdown cell widget.
      */
    def this(options: typings.jupyterlabCells.widgetMod.MarkdownCell.IOptions) = this()
    
    /**
      * Handle the rendered state.
      */
    /* private */ var _handleRendered: js.Any = js.native
    
    /* private */ var _monitor: js.Any = js.native
    
    /* private */ var _prevText: js.Any = js.native
    
    /* private */ var _ready: js.Any = js.native
    
    /* private */ var _rendered: js.Any = js.native
    
    /* private */ var _renderer: js.Any = js.native
    
    /* private */ var _rendermime: js.Any = js.native
    
    /**
      * Update the rendered input.
      */
    /* private */ var _updateRenderedInput: js.Any = js.native
    
    /**
      * The model used by the widget.
      */
    @JSName("model")
    val model_FMarkdownCell: IMarkdownCellModel = js.native
    
    /**
      * Render an input instead of the text editor.
      */
    /* protected */ def renderInput(widget: Widget): Unit = js.native
    
    /**
      * Whether the cell is rendered.
      */
    def rendered: Boolean = js.native
    def rendered_=(value: Boolean): Unit = js.native
    
    /**
      * Show the text editor instead of rendered input.
      */
    /* protected */ def showEditor(): Unit = js.native
  }
  object MarkdownCell {
    
    /**
      * An options object for initializing a base cell widget.
      */
    trait IOptions
      extends StObject
         with typings.jupyterlabCells.widgetMod.Cell.IOptions {
      
      /**
        * The mime renderer for the cell widget.
        */
      var rendermime: IRenderMimeRegistry
    }
    object IOptions {
      
      inline def apply(model: ICellModel, rendermime: IRenderMimeRegistry): typings.jupyterlabCells.widgetMod.MarkdownCell.IOptions = {
        val __obj = js.Dynamic.literal(model = model.asInstanceOf[js.Any], rendermime = rendermime.asInstanceOf[js.Any])
        __obj.asInstanceOf[typings.jupyterlabCells.widgetMod.MarkdownCell.IOptions]
      }
      
      extension [Self <: typings.jupyterlabCells.widgetMod.MarkdownCell.IOptions](x: Self) {
        
        inline def setRendermime(value: IRenderMimeRegistry): Self = StObject.set(x, "rendermime", value.asInstanceOf[js.Any])
      }
    }
  }
  
  @JSImport("@jupyterlab/cells/lib/widget", "RawCell")
  @js.native
  class RawCell protected () extends Cell {
    /**
      * Construct a raw cell widget.
      */
    def this(options: IOptions) = this()
    
    /**
      * The model used by the widget.
      */
    @JSName("model")
    val model_FRawCell: IRawCellModel = js.native
  }
  object RawCell {
    
    /**
      * An options object for initializing a base cell widget.
      */
    trait IOptions
      extends StObject
         with typings.jupyterlabCells.widgetMod.Cell.IOptions
    object IOptions {
      
      inline def apply(model: ICellModel): typings.jupyterlabCells.widgetMod.RawCell.IOptions = {
        val __obj = js.Dynamic.literal(model = model.asInstanceOf[js.Any])
        __obj.asInstanceOf[typings.jupyterlabCells.widgetMod.RawCell.IOptions]
      }
    }
  }
}
