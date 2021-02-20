package typings.jupyterlabConsole

import typings.jupyterlabApputils.sessioncontextMod.ISessionContext
import typings.jupyterlabCells.headerfooterMod.ICellFooter
import typings.jupyterlabCells.headerfooterMod.ICellHeader
import typings.jupyterlabCells.inputareaMod.IInputPrompt
import typings.jupyterlabCells.mod.Cell
import typings.jupyterlabCells.mod.CodeCell
import typings.jupyterlabCells.mod.RawCell
import typings.jupyterlabCells.modelMod.ICodeCellModel
import typings.jupyterlabCells.modelMod.IRawCellModel
import typings.jupyterlabCodeeditor.editorMod.CodeEditor.IEditor
import typings.jupyterlabCodeeditor.mimetypeMod.IEditorMimeTypeService
import typings.jupyterlabConsole.widgetMod.CodeConsole.IContentFactory
import typings.jupyterlabConsole.widgetMod.CodeConsole.IModelFactory
import typings.jupyterlabConsole.widgetMod.CodeConsole.IOptions
import typings.jupyterlabNbformat.mod.ICodeCell
import typings.jupyterlabObservables.observablelistMod.IObservableList
import typings.jupyterlabOutputarea.widgetMod.IOutputPrompt
import typings.jupyterlabOutputarea.widgetMod.IStdin
import typings.jupyterlabRendermime.tokensMod.IRenderMimeRegistry
import typings.luminoCoreutils.jsonMod.JSONObject
import typings.luminoSignaling.mod.ISignal
import typings.luminoWidgets.mod.Widget
import typings.std.Date
import typings.std.Event
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object widgetMod {
  
  @JSImport("@jupyterlab/console/lib/widget", "CodeConsole")
  @js.native
  class CodeConsole protected () extends Widget {
    /**
      * Construct a console widget.
      */
    def this(options: IOptions) = this()
    
    var _banner: js.Any = js.native
    
    var _cells: js.Any = js.native
    
    var _content: js.Any = js.native
    
    /**
      * Create the options used to initialize a code cell widget.
      */
    var _createCodeCellOptions: js.Any = js.native
    
    var _drag: js.Any = js.native
    
    var _dragData: js.Any = js.native
    
    /**
      * Handle the `'keydown'` event for the widget.
      */
    var _evtKeyDown: js.Any = js.native
    
    /**
      * Handle `mousedown` events for the widget.
      */
    var _evtMouseDown: js.Any = js.native
    
    /**
      * Handle `mousemove` event of widget
      */
    var _evtMouseMove: js.Any = js.native
    
    /**
      * Handle the `'mouseup'` event for the widget.
      */
    var _evtMouseUp: js.Any = js.native
    
    /**
      * Execute the code in the current prompt cell.
      */
    var _execute: js.Any = js.native
    
    var _executed: js.Any = js.native
    
    var _focusedCell: js.Any = js.native
    
    /**
      * Update the console based on the kernel info.
      */
    var _handleInfo: js.Any = js.native
    
    var _history: js.Any = js.native
    
    var _input: js.Any = js.native
    
    var _mimeTypeService: js.Any = js.native
    
    var _mimetype: js.Any = js.native
    
    var _msgIdCells: js.Any = js.native
    
    var _msgIds: js.Any = js.native
    
    /**
      * Handle cell disposed signals.
      */
    var _onCellDisposed: js.Any = js.native
    
    /**
      * Handle a keydown event on an editor.
      */
    var _onEditorKeydown: js.Any = js.native
    
    /**
      * Handle a change to the kernel.
      */
    var _onKernelChanged: js.Any = js.native
    
    /**
      * Handle a change to the kernel status.
      */
    var _onKernelStatusChanged: js.Any = js.native
    
    var _promptCellCreated: js.Any = js.native
    
    /**
      * Test whether we should execute the prompt cell.
      */
    var _shouldExecute: js.Any = js.native
    
    /**
      * Start a drag event
      */
    var _startDrag: js.Any = js.native
    
    /**
      * Add a banner cell.
      */
    def addBanner(): Unit = js.native
    
    /**
      * Add a new cell to the content panel.
      *
      * @param cell - The code cell widget being added to the content panel.
      *
      * @param msgId - The optional execution message id for the cell.
      *
      * #### Notes
      * This method is meant for use by outside classes that want to add cells to a
      * console. It is distinct from the `inject` method in that it requires
      * rendered code cell widgets and does not execute them (though it can store
      * the execution message id).
      */
    def addCell(cell: CodeCell): Unit = js.native
    def addCell(cell: CodeCell, msgId: String): Unit = js.native
    
    /**
      * The list of content cells in the console.
      *
      * #### Notes
      * This list does not include the current banner or the prompt for a console.
      * It may include previous banners as raw cells.
      */
    def cells: IObservableList[Cell] = js.native
    
    /**
      * Clear the code cells.
      */
    def clear(): Unit = js.native
    
    /**
      * The content factory used by the console.
      */
    val contentFactory: IContentFactory = js.native
    
    /**
      * Create a new cell with the built-in factory.
      */
    def createCodeCell(): CodeCell = js.native
    
    /**
      * Execute the current prompt.
      *
      * @param force - Whether to force execution without checking code
      * completeness.
      *
      * @param timeout - The length of time, in milliseconds, that the execution
      * should wait for the API to determine whether code being submitted is
      * incomplete before attempting submission anyway. The default value is `250`.
      */
    def execute(): js.Promise[Unit] = js.native
    def execute(force: js.UndefOr[scala.Nothing], timeout: Double): js.Promise[Unit] = js.native
    def execute(force: Boolean): js.Promise[Unit] = js.native
    def execute(force: Boolean, timeout: Double): js.Promise[Unit] = js.native
    
    /**
      * A signal emitted when the console finished executing its prompt cell.
      */
    def executed: ISignal[this.type, Date] = js.native
    
    /**
      * Get a cell given a message id.
      *
      * @param msgId - The message id.
      */
    def getCell(msgId: String): js.UndefOr[CodeCell] = js.native
    
    /**
      * Handle the DOM events for the widget.
      *
      * @param event -The DOM event sent to the widget.
      *
      * #### Notes
      * This method implements the DOM `EventListener` interface and is
      * called in response to events on the notebook panel's node. It should
      * not be called directly by user code.
      */
    def handleEvent(event: Event): Unit = js.native
    
    /**
      * Inject arbitrary code for the console to execute immediately.
      *
      * @param code - The code contents of the cell being injected.
      *
      * @returns A promise that indicates when the injected cell's execution ends.
      */
    def inject(code: String): js.Promise[Unit] = js.native
    def inject(code: String, metadata: JSONObject): js.Promise[Unit] = js.native
    
    /**
      * Insert a line break in the prompt cell.
      */
    def insertLinebreak(): Unit = js.native
    
    /**
      * The model factory for the console widget.
      */
    val modelFactory: IModelFactory = js.native
    
    /**
      * Make a new prompt cell.
      */
    /* protected */ def newPromptCell(): Unit = js.native
    
    def promptCell: CodeCell | Null = js.native
    
    /**
      * A signal emitted when a new prompt cell is created.
      */
    def promptCellCreated: ISignal[this.type, CodeCell] = js.native
    
    /**
      * The rendermime instance used by the console.
      */
    val rendermime: IRenderMimeRegistry = js.native
    
    /**
      * Replaces the selected text in the prompt cell.
      *
      * @param text - The text to replace the selection.
      */
    def replaceSelection(text: String): Unit = js.native
    
    /**
      * Serialize the output.
      *
      * #### Notes
      * This only serializes the code cells and the prompt cell if it exists, and
      * skips any old banner cells.
      */
    def serialize(): js.Array[ICodeCell] = js.native
    
    /**
      * The client session used by the console.
      */
    val sessionContext: ISessionContext = js.native
  }
  object CodeConsole {
    
    /**
      * Default implementation of `IContentFactory`.
      */
    @JSImport("@jupyterlab/console/lib/widget", "CodeConsole.ContentFactory")
    @js.native
    /**
      * Create a content factory for a cell.
      */
    class ContentFactory ()
      extends typings.jupyterlabCells.mod.Cell.ContentFactory
         with IContentFactory {
      def this(options: typings.jupyterlabCells.widgetMod.Cell.ContentFactory.IOptions) = this()
    }
    /**
      * A namespace for the code console content factory.
      */
    object ContentFactory {
      
      /**
        * An initialize options for `ContentFactory`.
        */
      type IOptions = typings.jupyterlabCells.widgetMod.Cell.IContentFactory
    }
    
    /**
      * The default implementation of an `IModelFactory`.
      */
    @JSImport("@jupyterlab/console/lib/widget", "CodeConsole.ModelFactory")
    @js.native
    /**
      * Create a new cell model factory.
      */
    class ModelFactory () extends StObject {
      def this(options: IModelFactoryOptions) = this()
      
      /**
        * The factory for output area models.
        */
      val codeCellContentFactory: typings.jupyterlabCells.modelMod.CodeCellModel.IContentFactory = js.native
      
      /**
        * Create a new code cell.
        *
        * @param source - The data to use for the original source data.
        *
        * @returns A new code cell. If a source cell is provided, the
        *   new cell will be initialized with the data from the source.
        *   If the contentFactory is not provided, the instance
        *   `codeCellContentFactory` will be used.
        */
      def createCodeCell(options: typings.jupyterlabCells.modelMod.CodeCellModel.IOptions): ICodeCellModel = js.native
      
      /**
        * Create a new raw cell.
        *
        * @param source - The data to use for the original source data.
        *
        * @returns A new raw cell. If a source cell is provided, the
        *   new cell will be initialized with the data from the source.
        */
      def createRawCell(options: typings.jupyterlabCells.modelMod.CellModel.IOptions): IRawCellModel = js.native
    }
    
    /**
      * A default content factory for the code console.
      */
    @JSImport("@jupyterlab/console/lib/widget", "CodeConsole.defaultContentFactory")
    @js.native
    val defaultContentFactory: IContentFactory = js.native
    
    /**
      * The default `ModelFactory` instance.
      */
    @JSImport("@jupyterlab/console/lib/widget", "CodeConsole.defaultModelFactory")
    @js.native
    val defaultModelFactory: ModelFactory = js.native
    
    /**
      * A content factory for console children.
      */
    @js.native
    trait IContentFactory
      extends typings.jupyterlabCells.widgetMod.Cell.IContentFactory {
      
      /**
        * Create a new code cell widget.
        */
      def createCodeCell(options: typings.jupyterlabCells.widgetMod.CodeCell.IOptions): CodeCell = js.native
      
      /**
        * Create a new raw cell widget.
        */
      def createRawCell(options: typings.jupyterlabCells.widgetMod.RawCell.IOptions): RawCell = js.native
    }
    object IContentFactory {
      
      @scala.inline
      def apply(
        createCellFooter: () => ICellFooter,
        createCellHeader: () => ICellHeader,
        createCodeCell: typings.jupyterlabCells.widgetMod.CodeCell.IOptions => CodeCell,
        createInputPrompt: () => IInputPrompt,
        createOutputPrompt: () => IOutputPrompt,
        createRawCell: typings.jupyterlabCells.widgetMod.RawCell.IOptions => RawCell,
        createStdin: typings.jupyterlabOutputarea.widgetMod.Stdin.IOptions => IStdin,
        editorFactory: /* options */ typings.jupyterlabCodeeditor.editorMod.CodeEditor.IOptions => IEditor
      ): IContentFactory = {
        val __obj = js.Dynamic.literal(createCellFooter = js.Any.fromFunction0(createCellFooter), createCellHeader = js.Any.fromFunction0(createCellHeader), createCodeCell = js.Any.fromFunction1(createCodeCell), createInputPrompt = js.Any.fromFunction0(createInputPrompt), createOutputPrompt = js.Any.fromFunction0(createOutputPrompt), createRawCell = js.Any.fromFunction1(createRawCell), createStdin = js.Any.fromFunction1(createStdin), editorFactory = js.Any.fromFunction1(editorFactory))
        __obj.asInstanceOf[IContentFactory]
      }
      
      @scala.inline
      implicit class IContentFactoryMutableBuilder[Self <: IContentFactory] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setCreateCodeCell(value: typings.jupyterlabCells.widgetMod.CodeCell.IOptions => CodeCell): Self = StObject.set(x, "createCodeCell", js.Any.fromFunction1(value))
        
        @scala.inline
        def setCreateRawCell(value: typings.jupyterlabCells.widgetMod.RawCell.IOptions => RawCell): Self = StObject.set(x, "createRawCell", js.Any.fromFunction1(value))
      }
    }
    
    /**
      * A model factory for a console widget.
      */
    @js.native
    trait IModelFactory extends StObject {
      
      /**
        * The factory for code cell content.
        */
      val codeCellContentFactory: typings.jupyterlabCells.modelMod.CodeCellModel.IContentFactory = js.native
      
      /**
        * Create a new code cell.
        *
        * @param options - The options used to create the cell.
        *
        * @returns A new code cell. If a source cell is provided, the
        *   new cell will be initialized with the data from the source.
        */
      def createCodeCell(options: typings.jupyterlabCells.modelMod.CodeCellModel.IOptions): ICodeCellModel = js.native
      
      /**
        * Create a new raw cell.
        *
        * @param options - The options used to create the cell.
        *
        * @returns A new raw cell. If a source cell is provided, the
        *   new cell will be initialized with the data from the source.
        */
      def createRawCell(options: typings.jupyterlabCells.modelMod.CellModel.IOptions): IRawCellModel = js.native
    }
    object IModelFactory {
      
      @scala.inline
      def apply(
        codeCellContentFactory: typings.jupyterlabCells.modelMod.CodeCellModel.IContentFactory,
        createCodeCell: typings.jupyterlabCells.modelMod.CodeCellModel.IOptions => ICodeCellModel,
        createRawCell: typings.jupyterlabCells.modelMod.CellModel.IOptions => IRawCellModel
      ): IModelFactory = {
        val __obj = js.Dynamic.literal(codeCellContentFactory = codeCellContentFactory.asInstanceOf[js.Any], createCodeCell = js.Any.fromFunction1(createCodeCell), createRawCell = js.Any.fromFunction1(createRawCell))
        __obj.asInstanceOf[IModelFactory]
      }
      
      @scala.inline
      implicit class IModelFactoryMutableBuilder[Self <: IModelFactory] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setCodeCellContentFactory(value: typings.jupyterlabCells.modelMod.CodeCellModel.IContentFactory): Self = StObject.set(x, "codeCellContentFactory", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setCreateCodeCell(value: typings.jupyterlabCells.modelMod.CodeCellModel.IOptions => ICodeCellModel): Self = StObject.set(x, "createCodeCell", js.Any.fromFunction1(value))
        
        @scala.inline
        def setCreateRawCell(value: typings.jupyterlabCells.modelMod.CellModel.IOptions => IRawCellModel): Self = StObject.set(x, "createRawCell", js.Any.fromFunction1(value))
      }
    }
    
    /**
      * The options used to initialize a `ModelFactory`.
      */
    @js.native
    trait IModelFactoryOptions extends StObject {
      
      /**
        * The factory for output area models.
        */
      var codeCellContentFactory: js.UndefOr[typings.jupyterlabCells.modelMod.CodeCellModel.IContentFactory] = js.native
    }
    object IModelFactoryOptions {
      
      @scala.inline
      def apply(): IModelFactoryOptions = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[IModelFactoryOptions]
      }
      
      @scala.inline
      implicit class IModelFactoryOptionsMutableBuilder[Self <: IModelFactoryOptions] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setCodeCellContentFactory(value: typings.jupyterlabCells.modelMod.CodeCellModel.IContentFactory): Self = StObject.set(x, "codeCellContentFactory", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setCodeCellContentFactoryUndefined: Self = StObject.set(x, "codeCellContentFactory", js.undefined)
      }
    }
    
    /**
      * The initialization options for a console widget.
      */
    @js.native
    trait IOptions extends StObject {
      
      /**
        * The content factory for the console widget.
        */
      var contentFactory: IContentFactory = js.native
      
      /**
        * The service used to look up mime types.
        */
      var mimeTypeService: IEditorMimeTypeService = js.native
      
      /**
        * The model factory for the console widget.
        */
      var modelFactory: js.UndefOr[IModelFactory] = js.native
      
      /**
        * The mime renderer for the console widget.
        */
      var rendermime: IRenderMimeRegistry = js.native
      
      /**
        * The client session for the console widget.
        */
      var sessionContext: ISessionContext = js.native
    }
    object IOptions {
      
      @scala.inline
      def apply(
        contentFactory: IContentFactory,
        mimeTypeService: IEditorMimeTypeService,
        rendermime: IRenderMimeRegistry,
        sessionContext: ISessionContext
      ): IOptions = {
        val __obj = js.Dynamic.literal(contentFactory = contentFactory.asInstanceOf[js.Any], mimeTypeService = mimeTypeService.asInstanceOf[js.Any], rendermime = rendermime.asInstanceOf[js.Any], sessionContext = sessionContext.asInstanceOf[js.Any])
        __obj.asInstanceOf[IOptions]
      }
      
      @scala.inline
      implicit class IOptionsMutableBuilder[Self <: IOptions] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setContentFactory(value: IContentFactory): Self = StObject.set(x, "contentFactory", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setMimeTypeService(value: IEditorMimeTypeService): Self = StObject.set(x, "mimeTypeService", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setModelFactory(value: IModelFactory): Self = StObject.set(x, "modelFactory", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setModelFactoryUndefined: Self = StObject.set(x, "modelFactory", js.undefined)
        
        @scala.inline
        def setRendermime(value: IRenderMimeRegistry): Self = StObject.set(x, "rendermime", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setSessionContext(value: ISessionContext): Self = StObject.set(x, "sessionContext", value.asInstanceOf[js.Any])
      }
    }
  }
}
