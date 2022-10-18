package typings.jupyterlabConsole

import typings.jupyterlabApputils.libSessioncontextMod.ISessionContext
import typings.jupyterlabCells.libHeaderfooterMod.ICellFooter
import typings.jupyterlabCells.libHeaderfooterMod.ICellHeader
import typings.jupyterlabCells.libInputareaMod.IInputPrompt
import typings.jupyterlabCells.libModelMod.ICellModel
import typings.jupyterlabCells.libModelMod.ICodeCellModel
import typings.jupyterlabCells.libModelMod.IRawCellModel
import typings.jupyterlabCells.mod.Cell
import typings.jupyterlabCells.mod.CodeCell
import typings.jupyterlabCells.mod.RawCell
import typings.jupyterlabCodeeditor.libEditorMod.CodeEditor.IEditor
import typings.jupyterlabCodeeditor.libMimetypeMod.IEditorMimeTypeService
import typings.jupyterlabConsole.anon.PartialIConfig
import typings.jupyterlabConsole.libWidgetMod.CodeConsole.IContentFactory
import typings.jupyterlabConsole.libWidgetMod.CodeConsole.IModelFactory
import typings.jupyterlabConsole.libWidgetMod.CodeConsole.IOptions
import typings.jupyterlabNbformat.mod.ICodeCell
import typings.jupyterlabObservables.libObservablelistMod.IObservableList
import typings.jupyterlabRendermime.libTokensMod.IRenderMimeRegistry
import typings.luminoCoreutils.typesJsonMod.JSONObject
import typings.luminoSignaling.mod.ISignal
import typings.luminoWidgets.mod.Widget
import typings.std.Event
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libWidgetMod {
  
  @JSImport("@jupyterlab/console/lib/widget", "CodeConsole")
  @js.native
  open class CodeConsole protected () extends Widget {
    /**
      * Construct a console widget.
      */
    def this(options: IOptions) = this()
    
    /* private */ var _banner: Any = js.native
    
    /* private */ var _cells: Any = js.native
    
    /* private */ var _content: Any = js.native
    
    /**
      * Create the options used to initialize a code cell widget.
      */
    /* private */ var _createCodeCellOptions: Any = js.native
    
    /* private */ var _drag: Any = js.native
    
    /* private */ var _dragData: Any = js.native
    
    /**
      * Handle the `'keydown'` event for the widget.
      */
    /* private */ var _evtKeyDown: Any = js.native
    
    /**
      * Handle `mousedown` events for the widget.
      */
    /* private */ var _evtMouseDown: Any = js.native
    
    /**
      * Handle `mousemove` event of widget
      */
    /* private */ var _evtMouseMove: Any = js.native
    
    /**
      * Handle the `'mouseup'` event for the widget.
      */
    /* private */ var _evtMouseUp: Any = js.native
    
    /**
      * Execute the code in the current prompt cell.
      */
    /* private */ var _execute: Any = js.native
    
    /* private */ var _executed: Any = js.native
    
    /* private */ var _focusedCell: Any = js.native
    
    /**
      * Update the console based on the kernel info.
      */
    /* private */ var _handleInfo: Any = js.native
    
    /* private */ var _history: Any = js.native
    
    /* private */ var _input: Any = js.native
    
    /* private */ var _mimeTypeService: Any = js.native
    
    /* private */ var _mimetype: Any = js.native
    
    /* private */ var _msgIdCells: Any = js.native
    
    /* private */ var _msgIds: Any = js.native
    
    /**
      * Handle cell disposed signals.
      */
    /* private */ var _onCellDisposed: Any = js.native
    
    /**
      * Handle a keydown event on an editor.
      */
    /* private */ var _onEditorKeydown: Any = js.native
    
    /**
      * Handle a change to the kernel.
      */
    /* private */ var _onKernelChanged: Any = js.native
    
    /**
      * Handle a change to the kernel status.
      */
    /* private */ var _onKernelStatusChanged: Any = js.native
    
    /* private */ var _promptCellCreated: Any = js.native
    
    /**
      * Test whether we should execute the prompt cell.
      */
    /* private */ var _shouldExecute: Any = js.native
    
    /**
      * Start a drag event
      */
    /* private */ var _startDrag: Any = js.native
    
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
    def cells: IObservableList[Cell[ICellModel]] = js.native
    
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
      * The configuration options for the text editor widget.
      */
    var editorConfig: js.UndefOr[PartialIConfig] = js.native
    
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
    def execute(force: Boolean): js.Promise[Unit] = js.native
    def execute(force: Boolean, timeout: Double): js.Promise[Unit] = js.native
    def execute(force: Unit, timeout: Double): js.Promise[Unit] = js.native
    
    /**
      * A signal emitted when the console finished executing its prompt cell.
      */
    def executed: ISignal[this.type, js.Date] = js.native
    
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
    /* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
    - typings.jupyterlabCells.libInputareaMod.InputArea.IContentFactory because Already inherited
    - typings.jupyterlabCells.libWidgetMod.Cell.IContentFactory because Already inherited
    - typings.jupyterlabConsole.libWidgetMod.CodeConsole.IContentFactory because Already inherited typings.jupyterlabOutputarea.libWidgetMod.OutputArea.IContentFactory */ @JSImport("@jupyterlab/console/lib/widget", "CodeConsole.ContentFactory")
    @js.native
    /**
      * Create a content factory for a cell.
      */
    open class ContentFactory ()
      extends typings.jupyterlabCells.mod.Cell.ContentFactory {
      def this(options: typings.jupyterlabCells.libWidgetMod.Cell.ContentFactory.IOptions) = this()
      
      /**
        * Create a new code cell widget.
        *
        * #### Notes
        * If no cell content factory is passed in with the options, the one on the
        * notebook content factory is used.
        */
      def createCodeCell(options: typings.jupyterlabCells.libWidgetMod.CodeCell.IOptions): CodeCell = js.native
      
      /**
        * Create a new raw cell widget.
        *
        * #### Notes
        * If no cell content factory is passed in with the options, the one on the
        * notebook content factory is used.
        */
      def createRawCell(options: typings.jupyterlabCells.libWidgetMod.RawCell.IOptions): RawCell = js.native
    }
    /**
      * A namespace for the code console content factory.
      */
    object ContentFactory {
      
      /**
        * An initialize options for `ContentFactory`.
        */
      type IOptions = typings.jupyterlabCells.libWidgetMod.Cell.IContentFactory
    }
    
    /**
      * The default implementation of an `IModelFactory`.
      */
    @JSImport("@jupyterlab/console/lib/widget", "CodeConsole.ModelFactory")
    @js.native
    /**
      * Create a new cell model factory.
      */
    open class ModelFactory () extends StObject {
      def this(options: IModelFactoryOptions) = this()
      
      /**
        * The factory for output area models.
        */
      val codeCellContentFactory: typings.jupyterlabCells.libModelMod.CodeCellModel.IContentFactory = js.native
      
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
      def createCodeCell(options: typings.jupyterlabCells.libModelMod.CodeCellModel.IOptions): ICodeCellModel = js.native
      
      /**
        * Create a new raw cell.
        *
        * @param source - The data to use for the original source data.
        *
        * @returns A new raw cell. If a source cell is provided, the
        *   new cell will be initialized with the data from the source.
        */
      def createRawCell(options: typings.jupyterlabCells.libModelMod.CellModel.IOptions): IRawCellModel = js.native
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
    trait IContentFactory
      extends StObject
         with typings.jupyterlabCells.libWidgetMod.Cell.IContentFactory {
      
      /**
        * Create a new code cell widget.
        */
      def createCodeCell(options: typings.jupyterlabCells.libWidgetMod.CodeCell.IOptions): CodeCell
      
      /**
        * Create a new raw cell widget.
        */
      def createRawCell(options: typings.jupyterlabCells.libWidgetMod.RawCell.IOptions): RawCell
    }
    object IContentFactory {
      
      inline def apply(
        createCellFooter: () => ICellFooter,
        createCellHeader: () => ICellHeader,
        createCodeCell: typings.jupyterlabCells.libWidgetMod.CodeCell.IOptions => CodeCell,
        createInputPrompt: () => IInputPrompt,
        createRawCell: typings.jupyterlabCells.libWidgetMod.RawCell.IOptions => RawCell,
        editorFactory: /* options */ typings.jupyterlabCodeeditor.libEditorMod.CodeEditor.IOptions => IEditor
      ): IContentFactory = {
        val __obj = js.Dynamic.literal(createCellFooter = js.Any.fromFunction0(createCellFooter), createCellHeader = js.Any.fromFunction0(createCellHeader), createCodeCell = js.Any.fromFunction1(createCodeCell), createInputPrompt = js.Any.fromFunction0(createInputPrompt), createRawCell = js.Any.fromFunction1(createRawCell), editorFactory = js.Any.fromFunction1(editorFactory))
        __obj.asInstanceOf[IContentFactory]
      }
      
      extension [Self <: IContentFactory](x: Self) {
        
        inline def setCreateCodeCell(value: typings.jupyterlabCells.libWidgetMod.CodeCell.IOptions => CodeCell): Self = StObject.set(x, "createCodeCell", js.Any.fromFunction1(value))
        
        inline def setCreateRawCell(value: typings.jupyterlabCells.libWidgetMod.RawCell.IOptions => RawCell): Self = StObject.set(x, "createRawCell", js.Any.fromFunction1(value))
      }
    }
    
    /**
      * A model factory for a console widget.
      */
    trait IModelFactory extends StObject {
      
      /**
        * The factory for code cell content.
        */
      val codeCellContentFactory: typings.jupyterlabCells.libModelMod.CodeCellModel.IContentFactory
      
      /**
        * Create a new code cell.
        *
        * @param options - The options used to create the cell.
        *
        * @returns A new code cell. If a source cell is provided, the
        *   new cell will be initialized with the data from the source.
        */
      def createCodeCell(options: typings.jupyterlabCells.libModelMod.CodeCellModel.IOptions): ICodeCellModel
      
      /**
        * Create a new raw cell.
        *
        * @param options - The options used to create the cell.
        *
        * @returns A new raw cell. If a source cell is provided, the
        *   new cell will be initialized with the data from the source.
        */
      def createRawCell(options: typings.jupyterlabCells.libModelMod.CellModel.IOptions): IRawCellModel
    }
    object IModelFactory {
      
      inline def apply(
        codeCellContentFactory: typings.jupyterlabCells.libModelMod.CodeCellModel.IContentFactory,
        createCodeCell: typings.jupyterlabCells.libModelMod.CodeCellModel.IOptions => ICodeCellModel,
        createRawCell: typings.jupyterlabCells.libModelMod.CellModel.IOptions => IRawCellModel
      ): IModelFactory = {
        val __obj = js.Dynamic.literal(codeCellContentFactory = codeCellContentFactory.asInstanceOf[js.Any], createCodeCell = js.Any.fromFunction1(createCodeCell), createRawCell = js.Any.fromFunction1(createRawCell))
        __obj.asInstanceOf[IModelFactory]
      }
      
      extension [Self <: IModelFactory](x: Self) {
        
        inline def setCodeCellContentFactory(value: typings.jupyterlabCells.libModelMod.CodeCellModel.IContentFactory): Self = StObject.set(x, "codeCellContentFactory", value.asInstanceOf[js.Any])
        
        inline def setCreateCodeCell(value: typings.jupyterlabCells.libModelMod.CodeCellModel.IOptions => ICodeCellModel): Self = StObject.set(x, "createCodeCell", js.Any.fromFunction1(value))
        
        inline def setCreateRawCell(value: typings.jupyterlabCells.libModelMod.CellModel.IOptions => IRawCellModel): Self = StObject.set(x, "createRawCell", js.Any.fromFunction1(value))
      }
    }
    
    /**
      * The options used to initialize a `ModelFactory`.
      */
    trait IModelFactoryOptions extends StObject {
      
      /**
        * The factory for output area models.
        */
      var codeCellContentFactory: js.UndefOr[typings.jupyterlabCells.libModelMod.CodeCellModel.IContentFactory] = js.undefined
    }
    object IModelFactoryOptions {
      
      inline def apply(): IModelFactoryOptions = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[IModelFactoryOptions]
      }
      
      extension [Self <: IModelFactoryOptions](x: Self) {
        
        inline def setCodeCellContentFactory(value: typings.jupyterlabCells.libModelMod.CodeCellModel.IContentFactory): Self = StObject.set(x, "codeCellContentFactory", value.asInstanceOf[js.Any])
        
        inline def setCodeCellContentFactoryUndefined: Self = StObject.set(x, "codeCellContentFactory", js.undefined)
      }
    }
    
    /**
      * The initialization options for a console widget.
      */
    trait IOptions extends StObject {
      
      /**
        * The content factory for the console widget.
        */
      var contentFactory: IContentFactory
      
      /**
        * The service used to look up mime types.
        */
      var mimeTypeService: IEditorMimeTypeService
      
      /**
        * The model factory for the console widget.
        */
      var modelFactory: js.UndefOr[IModelFactory] = js.undefined
      
      /**
        * The mime renderer for the console widget.
        */
      var rendermime: IRenderMimeRegistry
      
      /**
        * The client session for the console widget.
        */
      var sessionContext: ISessionContext
    }
    object IOptions {
      
      inline def apply(
        contentFactory: IContentFactory,
        mimeTypeService: IEditorMimeTypeService,
        rendermime: IRenderMimeRegistry,
        sessionContext: ISessionContext
      ): IOptions = {
        val __obj = js.Dynamic.literal(contentFactory = contentFactory.asInstanceOf[js.Any], mimeTypeService = mimeTypeService.asInstanceOf[js.Any], rendermime = rendermime.asInstanceOf[js.Any], sessionContext = sessionContext.asInstanceOf[js.Any])
        __obj.asInstanceOf[IOptions]
      }
      
      extension [Self <: IOptions](x: Self) {
        
        inline def setContentFactory(value: IContentFactory): Self = StObject.set(x, "contentFactory", value.asInstanceOf[js.Any])
        
        inline def setMimeTypeService(value: IEditorMimeTypeService): Self = StObject.set(x, "mimeTypeService", value.asInstanceOf[js.Any])
        
        inline def setModelFactory(value: IModelFactory): Self = StObject.set(x, "modelFactory", value.asInstanceOf[js.Any])
        
        inline def setModelFactoryUndefined: Self = StObject.set(x, "modelFactory", js.undefined)
        
        inline def setRendermime(value: IRenderMimeRegistry): Self = StObject.set(x, "rendermime", value.asInstanceOf[js.Any])
        
        inline def setSessionContext(value: ISessionContext): Self = StObject.set(x, "sessionContext", value.asInstanceOf[js.Any])
      }
    }
  }
}
