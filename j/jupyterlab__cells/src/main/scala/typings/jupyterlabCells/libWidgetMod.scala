package typings.jupyterlabCells

import typings.jupyterlabApputils.libSessioncontextMod.ISessionContext
import typings.jupyterlabCells.anon.Level
import typings.jupyterlabCells.anon.PartialIConfig
import typings.jupyterlabCells.libHeaderfooterMod.ICellFooter
import typings.jupyterlabCells.libHeaderfooterMod.ICellHeader
import typings.jupyterlabCells.libInputareaMod.IInputPrompt
import typings.jupyterlabCells.libInputareaMod.InputArea
import typings.jupyterlabCells.libModelMod.IAttachmentsCellModel
import typings.jupyterlabCells.libModelMod.ICellModel
import typings.jupyterlabCells.libModelMod.ICodeCellModel
import typings.jupyterlabCells.libModelMod.IMarkdownCellModel
import typings.jupyterlabCells.libModelMod.IRawCellModel
import typings.jupyterlabCells.libWidgetMod.Cell.IContentFactory
import typings.jupyterlabCells.libWidgetMod.Cell.IOptions
import typings.jupyterlabCodeeditor.libEditorMod.CodeEditor.Factory
import typings.jupyterlabCodeeditor.libEditorMod.CodeEditor.IEditor
import typings.jupyterlabCodeeditor.mod.CodeEditorWrapper
import typings.jupyterlabObservables.libObservablejsonMod.IObservableJSON
import typings.jupyterlabObservables.libObservablemapMod.IObservableMap.IChangedArgs
import typings.jupyterlabOutputarea.libWidgetMod.IOutputPrompt
import typings.jupyterlabOutputarea.libWidgetMod.IStdin
import typings.jupyterlabOutputarea.mod.OutputArea
import typings.jupyterlabRendermime.libTokensMod.IRenderMimeRegistry
import typings.jupyterlabServices.libKernelMessagesMod.IExecuteReplyMsg
import typings.luminoCoreutils.typesJsonMod.JSONObject
import typings.luminoCoreutils.typesJsonMod.PartialJSONValue
import typings.luminoSignaling.mod.ISignal
import typings.luminoSignaling.mod.Signal
import typings.luminoWidgets.mod.Widget
import typings.luminoWidgets.mod.Widget.ResizeMessage
import typings.std.Event
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libWidgetMod {
  
  /* note: abstract class */ @JSImport("@jupyterlab/cells/lib/widget", "AttachmentsCell")
  @js.native
  open class AttachmentsCell[T /* <: IAttachmentsCellModel */] protected () extends Cell[T] {
    /**
      * Construct a new base cell widget.
      */
    def this(options: IOptions[T]) = this()
    
    /**
      * Takes in a file object and adds it to
      * the cell attachments
      */
    /* private */ var _attachFile: Any = js.native
    
    /**
      * Attaches all DataTransferItems (obtained from
      * clipboard or native drop events) to the cell
      */
    /* private */ var _attachFiles: Any = js.native
    
    /* private */ var _evtDragOver: Any = js.native
    
    /**
      * Handle the `'lm-drop'` event for the widget.
      */
    /* private */ var _evtDrop: Any = js.native
    
    /**
      * Handle the `drop` event for the widget
      */
    /* private */ var _evtNativeDrop: Any = js.native
    
    /**
      * Handle the `paste` event for the widget
      */
    /* private */ var _evtPaste: Any = js.native
    
    /**
      * Generates a unique URI for a file
      * while preserving the file extension.
      */
    /* private */ var _generateURI: Any = js.native
    
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
      * Modify the cell source to include a reference to the attachment.
      */
    /* protected */ def updateCellSourceWithAttachment(attachmentName: String): Unit = js.native
    /* protected */ def updateCellSourceWithAttachment(attachmentName: String, URI: String): Unit = js.native
  }
  
  @JSImport("@jupyterlab/cells/lib/widget", "Cell")
  @js.native
  open class Cell[T /* <: ICellModel */] protected () extends Widget {
    /**
      * Construct a new base cell widget.
      */
    def this(options: IOptions[T]) = this()
    
    /* protected */ var _displayChanged: Signal[this.type, Unit] = js.native
    
    /* private */ var _input: Any = js.native
    
    /* private */ var _inputHidden: Any = js.native
    
    /* private */ var _inputPlaceholder: Any = js.native
    
    /* private */ var _inputWrapper: Any = js.native
    
    /* private */ var _model: Any = js.native
    
    /* private */ var _readOnly: Any = js.native
    
    /* private */ var _resizeDebouncer: Any = js.native
    
    /* private */ var _syncCollapse: Any = js.native
    
    /* private */ var _syncEditable: Any = js.native
    
    /**
      * The content factory used by the widget.
      */
    val contentFactory: IContentFactory = js.native
    
    /**
      * Signal to indicate that widget has changed visibly (in size, in type, etc)
      */
    def displayChanged: ISignal[this.type, Unit] = js.native
    
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
    def model: T = js.native
    
    /**
      * Handle changes in the metadata.
      */
    /* protected */ def onMetadataChanged(model: IObservableJSON, args: IChangedArgs[js.UndefOr[PartialJSONValue]]): Unit = js.native
    
    /**
      * Handle `resize` messages.
      */
    /* protected */ def onResize(msg: ResizeMessage): Unit = js.native
    
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
    open class ContentFactory ()
      extends StObject
         with IContentFactory {
      def this(options: typings.jupyterlabCells.libWidgetMod.Cell.ContentFactory.IOptions) = this()
      
      /* private */ var _editorFactory: Any = js.native
      
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
      override def createStdin(options: typings.jupyterlabOutputarea.libWidgetMod.Stdin.IOptions): IStdin = js.native
      
      /**
        * The editor factory we need to include in `CodeEditorWrapper.IOptions`.
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
        
        inline def apply(): typings.jupyterlabCells.libWidgetMod.Cell.ContentFactory.IOptions = {
          val __obj = js.Dynamic.literal()
          __obj.asInstanceOf[typings.jupyterlabCells.libWidgetMod.Cell.ContentFactory.IOptions]
        }
        
        extension [Self <: typings.jupyterlabCells.libWidgetMod.Cell.ContentFactory.IOptions](x: Self) {
          
          inline def setEditorFactory(value: /* options */ typings.jupyterlabCodeeditor.libEditorMod.CodeEditor.IOptions => IEditor): Self = StObject.set(x, "editorFactory", js.Any.fromFunction1(value))
          
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
         with typings.jupyterlabOutputarea.libWidgetMod.OutputArea.IContentFactory
         with typings.jupyterlabCells.libInputareaMod.InputArea.IContentFactory {
      
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
        createStdin: typings.jupyterlabOutputarea.libWidgetMod.Stdin.IOptions => IStdin,
        editorFactory: /* options */ typings.jupyterlabCodeeditor.libEditorMod.CodeEditor.IOptions => IEditor
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
    trait IOptions[T /* <: ICellModel */] extends StObject {
      
      /**
        * The factory object for customizable cell children.
        */
      var contentFactory: js.UndefOr[IContentFactory] = js.undefined
      
      /**
        * The configuration options for the text editor widget.
        */
      var editorConfig: js.UndefOr[PartialIConfig] = js.undefined
      
      /**
        * The maximum number of output items to display in cell output.
        */
      var maxNumberOutputs: js.UndefOr[Double] = js.undefined
      
      /**
        * The model used by the cell.
        */
      var model: T
      
      /**
        * Whether this cell is a placeholder for future rendering.
        */
      var placeholder: js.UndefOr[Boolean] = js.undefined
      
      /**
        * Whether to send an update request to the editor when it is shown.
        */
      var updateEditorOnShow: js.UndefOr[Boolean] = js.undefined
    }
    object IOptions {
      
      inline def apply[T /* <: ICellModel */](model: T): IOptions[T] = {
        val __obj = js.Dynamic.literal(model = model.asInstanceOf[js.Any])
        __obj.asInstanceOf[IOptions[T]]
      }
      
      extension [Self <: IOptions[?], T /* <: ICellModel */](x: Self & IOptions[T]) {
        
        inline def setContentFactory(value: IContentFactory): Self = StObject.set(x, "contentFactory", value.asInstanceOf[js.Any])
        
        inline def setContentFactoryUndefined: Self = StObject.set(x, "contentFactory", js.undefined)
        
        inline def setEditorConfig(value: PartialIConfig): Self = StObject.set(x, "editorConfig", value.asInstanceOf[js.Any])
        
        inline def setEditorConfigUndefined: Self = StObject.set(x, "editorConfig", js.undefined)
        
        inline def setMaxNumberOutputs(value: Double): Self = StObject.set(x, "maxNumberOutputs", value.asInstanceOf[js.Any])
        
        inline def setMaxNumberOutputsUndefined: Self = StObject.set(x, "maxNumberOutputs", js.undefined)
        
        inline def setModel(value: T): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
        
        inline def setPlaceholder(value: Boolean): Self = StObject.set(x, "placeholder", value.asInstanceOf[js.Any])
        
        inline def setPlaceholderUndefined: Self = StObject.set(x, "placeholder", js.undefined)
        
        inline def setUpdateEditorOnShow(value: Boolean): Self = StObject.set(x, "updateEditorOnShow", value.asInstanceOf[js.Any])
        
        inline def setUpdateEditorOnShowUndefined: Self = StObject.set(x, "updateEditorOnShow", js.undefined)
      }
    }
  }
  
  @JSImport("@jupyterlab/cells/lib/widget", "CodeCell")
  @js.native
  open class CodeCell protected () extends Cell[ICodeCellModel] {
    /**
      * Construct a code cell widget.
      */
    def this(options: typings.jupyterlabCells.libWidgetMod.CodeCell.IOptions) = this()
    
    /* private */ var _output: Any = js.native
    
    /* private */ var _outputHidden: Any = js.native
    
    /**
      * Handle changes in the number of outputs in the output area.
      */
    /* private */ var _outputLengthHandler: Any = js.native
    
    /* private */ var _outputPlaceholder: Any = js.native
    
    /* private */ var _outputWrapper: Any = js.native
    
    /* private */ var _outputsScrolled: Any = js.native
    
    /* private */ var _rendermime: Any = js.native
    
    /* private */ var _savingMetadata: Any = js.native
    
    /* private */ var _syncScrolled: Any = js.native
    
    /**
      * Clone the OutputArea alone, returning a simplified output area, using the same model.
      */
    def cloneOutputArea(): OutputArea = js.native
    
    /**
      * Revert view collapse state from model.
      */
    def loadScrolledState(): Unit = js.native
    
    /**
      * Handle changes in the model.
      */
    /* protected */ def onStateChanged(
      model: ICellModel,
      args: typings.jupyterlabCoreutils.libInterfacesMod.IChangedArgs[Any, Any, String]
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
         with typings.jupyterlabCells.libWidgetMod.Cell.IOptions[ICodeCellModel] {
      
      /**
        * The mime renderer for the cell widget.
        */
      var rendermime: IRenderMimeRegistry
    }
    object IOptions {
      
      inline def apply(model: ICodeCellModel, rendermime: IRenderMimeRegistry): typings.jupyterlabCells.libWidgetMod.CodeCell.IOptions = {
        val __obj = js.Dynamic.literal(model = model.asInstanceOf[js.Any], rendermime = rendermime.asInstanceOf[js.Any])
        __obj.asInstanceOf[typings.jupyterlabCells.libWidgetMod.CodeCell.IOptions]
      }
      
      extension [Self <: typings.jupyterlabCells.libWidgetMod.CodeCell.IOptions](x: Self) {
        
        inline def setRendermime(value: IRenderMimeRegistry): Self = StObject.set(x, "rendermime", value.asInstanceOf[js.Any])
      }
    }
  }
  
  @JSImport("@jupyterlab/cells/lib/widget", "MARKDOWN_HEADING_COLLAPSED")
  @js.native
  val MARKDOWN_HEADING_COLLAPSED: /* "jp-MarkdownHeadingCollapsed" */ String = js.native
  
  @JSImport("@jupyterlab/cells/lib/widget", "MarkdownCell")
  @js.native
  open class MarkdownCell protected () extends AttachmentsCell[IMarkdownCellModel] {
    /**
      * Construct a Markdown cell widget.
      */
    def this(options: typings.jupyterlabCells.libWidgetMod.MarkdownCell.IOptions) = this()
    
    /**
      * Handle the rendered state.
      */
    /* private */ var _handleRendered: Any = js.native
    
    /* private */ var _headingCollapsed: Any = js.native
    
    /* private */ var _monitor: Any = js.native
    
    /* private */ var _numberChildNodes: Any = js.native
    
    /* private */ var _prevText: Any = js.native
    
    /* private */ var _ready: Any = js.native
    
    /* private */ var _rendered: Any = js.native
    
    /* private */ var _renderer: Any = js.native
    
    /* private */ var _rendermime: Any = js.native
    
    /* private */ var _showEditorForReadOnlyMarkdown: Any = js.native
    
    /* private */ var _toggleCollapsedSignal: Any = js.native
    
    /**
      * Update the rendered input.
      */
    /* private */ var _updateRenderedInput: Any = js.native
    
    def headingCollapsed: Boolean = js.native
    def headingCollapsed_=(value: Boolean): Unit = js.native
    
    /**
      * Text that represents the heading if cell is a heading.
      * Returns empty string if not a heading.
      */
    def headingInfo: Level = js.native
    
    /* protected */ def maybeCreateCollapseButton(): Unit = js.native
    
    /* protected */ def maybeCreateOrUpdateExpandButton(): Unit = js.native
    
    def numberChildNodes: Double = js.native
    def numberChildNodes_=(value: Double): Unit = js.native
    
    /**
      * Render the collapse button for heading cells,
      * and for collapsed heading cells render the "expand hidden cells"
      * button.
      */
    /* protected */ def renderCollapseButtons(widget: Widget): Unit = js.native
    
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
    
    def showEditorForReadOnly: Boolean = js.native
    def showEditorForReadOnly_=(value: Boolean): Unit = js.native
    
    def toggleCollapsedSignal: Signal[this.type, Boolean] = js.native
  }
  object MarkdownCell {
    
    /**
      * Default value for showEditorForReadOnlyMarkdown.
      */
    @JSImport("@jupyterlab/cells/lib/widget", "MarkdownCell.defaultShowEditorForReadOnlyMarkdown")
    @js.native
    val defaultShowEditorForReadOnlyMarkdown: /* true */ Boolean = js.native
    
    /**
      * An options object for initializing a base cell widget.
      */
    trait IOptions
      extends StObject
         with typings.jupyterlabCells.libWidgetMod.Cell.IOptions[IMarkdownCellModel] {
      
      /**
        * The mime renderer for the cell widget.
        */
      var rendermime: IRenderMimeRegistry
      
      /**
        * Show editor for read-only Markdown cells.
        */
      var showEditorForReadOnlyMarkdown: js.UndefOr[Boolean] = js.undefined
    }
    object IOptions {
      
      inline def apply(model: IMarkdownCellModel, rendermime: IRenderMimeRegistry): typings.jupyterlabCells.libWidgetMod.MarkdownCell.IOptions = {
        val __obj = js.Dynamic.literal(model = model.asInstanceOf[js.Any], rendermime = rendermime.asInstanceOf[js.Any])
        __obj.asInstanceOf[typings.jupyterlabCells.libWidgetMod.MarkdownCell.IOptions]
      }
      
      extension [Self <: typings.jupyterlabCells.libWidgetMod.MarkdownCell.IOptions](x: Self) {
        
        inline def setRendermime(value: IRenderMimeRegistry): Self = StObject.set(x, "rendermime", value.asInstanceOf[js.Any])
        
        inline def setShowEditorForReadOnlyMarkdown(value: Boolean): Self = StObject.set(x, "showEditorForReadOnlyMarkdown", value.asInstanceOf[js.Any])
        
        inline def setShowEditorForReadOnlyMarkdownUndefined: Self = StObject.set(x, "showEditorForReadOnlyMarkdown", js.undefined)
      }
    }
  }
  
  @JSImport("@jupyterlab/cells/lib/widget", "RawCell")
  @js.native
  open class RawCell protected () extends Cell[IRawCellModel] {
    /**
      * Construct a raw cell widget.
      */
    def this(options: typings.jupyterlabCells.libWidgetMod.RawCell.IOptions) = this()
  }
  object RawCell {
    
    /**
      * An options object for initializing a base cell widget.
      */
    type IOptions = typings.jupyterlabCells.libWidgetMod.Cell.IOptions[IRawCellModel]
  }
}
