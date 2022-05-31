package typings.jupyterlabNotebook

import typings.jupyterlabCells.headerfooterMod.ICellFooter
import typings.jupyterlabCells.headerfooterMod.ICellHeader
import typings.jupyterlabCells.inputareaMod.IInputPrompt
import typings.jupyterlabCells.mod.Cell
import typings.jupyterlabCells.mod.CodeCell
import typings.jupyterlabCells.mod.MarkdownCell
import typings.jupyterlabCells.mod.RawCell
import typings.jupyterlabCodeeditor.editorMod.CodeEditor.Factory
import typings.jupyterlabCodeeditor.editorMod.CodeEditor.IEditor
import typings.jupyterlabCodeeditor.mimetypeMod.IEditorMimeTypeService
import typings.jupyterlabCoreutils.interfacesMod.IChangedArgs
import typings.jupyterlabNbformat.mod.CellType
import typings.jupyterlabNotebook.anon.Anchor
import typings.jupyterlabNotebook.anon.Head
import typings.jupyterlabNotebook.anon.PartialIConfig
import typings.jupyterlabNotebook.modelMod.INotebookModel
import typings.jupyterlabNotebook.widgetMod.Notebook.IOptions
import typings.jupyterlabNotebook.widgetMod.StaticNotebook.IContentFactory
import typings.jupyterlabNotebook.widgetMod.StaticNotebook.IEditorConfig
import typings.jupyterlabNotebook.widgetMod.StaticNotebook.INotebookConfig
import typings.jupyterlabObservables.observablemapMod.IObservableMap
import typings.jupyterlabOutputarea.widgetMod.IOutputPrompt
import typings.jupyterlabOutputarea.widgetMod.IStdin
import typings.jupyterlabRendermime.tokensMod.IRenderMimeRegistry
import typings.luminoCoreutils.jsonMod.ReadonlyPartialJSONValue
import typings.luminoSignaling.mod.ISignal
import typings.luminoWidgets.mod.Widget
import typings.luminoWidgets.mod.Widget.ResizeMessage
import typings.std.Event
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object widgetMod {
  
  @JSImport("@jupyterlab/notebook/lib/widget", "Notebook")
  @js.native
  class Notebook protected () extends StaticNotebook {
    /**
      * Construct a notebook widget.
      */
    def this(options: IOptions) = this()
    
    /* private */ var _activeCell: js.Any = js.native
    
    /* private */ var _activeCellChanged: js.Any = js.native
    
    /* private */ var _activeCellIndex: js.Any = js.native
    
    /* private */ var _cellLayoutStateCache: js.Any = js.native
    
    /* private */ var _checkCacheOnNextResize: js.Any = js.native
    
    /* private */ var _drag: js.Any = js.native
    
    /* private */ var _dragData: js.Any = js.native
    
    /**
      * Ensure that the notebook has proper focus.
      */
    /* private */ var _ensureFocus: js.Any = js.native
    
    /**
      * Handle `contextmenu` event.
      */
    /* private */ var _evtContextMenuCapture: js.Any = js.native
    
    /**
      * Handle `dblclick` events for the widget.
      */
    /* private */ var _evtDblClick: js.Any = js.native
    
    /**
      * Handle the `'mousemove'` event for the widget.
      */
    /* private */ var _evtDocumentMousemove: js.Any = js.native
    
    /**
      * Handle the `'mouseup'` event on the document.
      */
    /* private */ var _evtDocumentMouseup: js.Any = js.native
    
    /**
      * Handle the `'lm-dragenter'` event for the widget.
      */
    /* private */ var _evtDragEnter: js.Any = js.native
    
    /**
      * Handle the `'lm-dragleave'` event for the widget.
      */
    /* private */ var _evtDragLeave: js.Any = js.native
    
    /**
      * Handle the `'lm-dragover'` event for the widget.
      */
    /* private */ var _evtDragOver: js.Any = js.native
    
    /**
      * Handle the `'lm-drop'` event for the widget.
      */
    /* private */ var _evtDrop: js.Any = js.native
    
    /**
      * Handle `focus` events for the widget.
      */
    /* private */ var _evtFocusIn: js.Any = js.native
    
    /**
      * Handle `focusout` events for the notebook.
      */
    /* private */ var _evtFocusOut: js.Any = js.native
    
    /**
      * Handle `mousedown` events for the widget.
      */
    /* private */ var _evtMouseDown: js.Any = js.native
    
    /**
      * Handle `mousedown` event in the capture phase for the widget.
      */
    /* private */ var _evtMouseDownCapture: js.Any = js.native
    
    /**
      * Find the cell index containing the target html element.
      *
      * #### Notes
      * Returns -1 if the cell is not found.
      */
    /* private */ var _findCell: js.Any = js.native
    
    /**
      * Find the target of html mouse event and cell index containing this target.
      *
      * #### Notes
      * Returned index is -1 if the cell is not found.
      */
    /* private */ var _findEventTargetAndCell: js.Any = js.native
    
    /* private */ var _fragment: js.Any = js.native
    
    /* private */ var _mode: js.Any = js.native
    
    /* private */ var _mouseMode: js.Any = js.native
    
    /**
      * Handle edge request signals from cells.
      */
    /* private */ var _onEdgeRequest: js.Any = js.native
    
    /* private */ var _selectionChanged: js.Any = js.native
    
    /**
      * Start a drag event.
      */
    /* private */ var _startDrag: js.Any = js.native
    
    /* private */ var _stateChanged: js.Any = js.native
    
    /**
      * Remove selections from inactive cells to avoid
      * spurious cursors.
      */
    /* private */ var _trimSelections: js.Any = js.native
    
    /**
      * Get the active cell widget.
      *
      * #### Notes
      * This is a cell or `null` if there is no active cell.
      */
    def activeCell: Cell | Null = js.native
    
    /**
      * A signal emitted when the active cell changes.
      *
      * #### Notes
      * This can be due to the active index changing or the
      * cell at the active index changing.
      */
    def activeCellChanged: ISignal[this.type, Cell] = js.native
    
    /**
      * The active cell index of the notebook.
      *
      * #### Notes
      * The index will be clamped to the bounds of the notebook cells.
      */
    def activeCellIndex: Double = js.native
    def activeCellIndex_=(newValue: Double): Unit = js.native
    
    /**
      * Deselect a cell widget.
      *
      * #### Notes
      * It is a no-op if the value does not change.
      * It will emit the `selectionChanged` signal.
      */
    def deselect(widget: Cell): Unit = js.native
    
    /**
      * Deselect all of the cells.
      */
    def deselectAll(): Unit = js.native
    
    /**
      * Move the head of an existing contiguous selection to extend the selection.
      *
      * @param index - The new head of the existing selection.
      *
      * #### Notes
      * If there is no existing selection, the active cell is considered an
      * existing one-cell selection.
      *
      * If the new selection is a single cell, that cell becomes the active cell
      * and all cells are deselected.
      *
      * There is no change if there are no cells (i.e., activeCellIndex is -1).
      */
    def extendContiguousSelectionTo(index: Double): Unit = js.native
    
    /**
      * Get the head and anchor of a contiguous cell selection.
      *
      * The head of a contiguous selection is always the active cell.
      *
      * If there are no cells selected, `{head: null, anchor: null}` is returned.
      *
      * Throws an error if the currently selected cells do not form a contiguous
      * selection.
      */
    def getContiguousSelection(): Anchor | Head = js.native
    
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
      * Whether a cell is selected.
      */
    def isSelected(widget: Cell): Boolean = js.native
    
    /**
      * Whether a cell is selected or is the active cell.
      */
    def isSelectedOrActive(widget: Cell): Boolean = js.native
    
    /**
      * The interactivity mode of the notebook.
      */
    def mode: NotebookMode = js.native
    def mode_=(newValue: NotebookMode): Unit = js.native
    
    /**
      * A message handler invoked on a `'resize'` message.
      */
    /* protected */ def onResize(msg: ResizeMessage): Unit = js.native
    
    /**
      * Scroll so that the given position is centered.
      *
      * @param position - The vertical position in the notebook widget.
      *
      * @param threshold - An optional threshold for the scroll (0-50, defaults to
      * 25).
      *
      * #### Notes
      * If the position is within the threshold percentage of the widget height,
      * measured from the center of the widget, the scroll position will not be
      * changed. A threshold of 0 means we will always scroll so the position is
      * centered, and a threshold of 50 means scrolling only happens if position is
      * outside the current window.
      */
    def scrollToPosition(position: Double): Unit = js.native
    def scrollToPosition(position: Double, threshold: Double): Unit = js.native
    
    /**
      * Select a cell widget.
      *
      * #### Notes
      * It is a no-op if the value does not change.
      * It will emit the `selectionChanged` signal.
      */
    def select(widget: Cell): Unit = js.native
    
    /**
      * A signal emitted when the selection state of the notebook changes.
      */
    def selectionChanged: ISignal[this.type, Unit] = js.native
    
    /**
      * Set URI fragment identifier.
      */
    def setFragment(fragment: String): Unit = js.native
    
    /**
      * A signal emitted when the state of the notebook changes.
      */
    def stateChanged: ISignal[this.type, IChangedArgs[js.Any, js.Any, String]] = js.native
  }
  object Notebook {
    
    /**
      * The default implementation of a notebook content factory..
      *
      * #### Notes
      * Override methods on this class to customize the default notebook factory
      * methods that create notebook content.
      */
    @JSImport("@jupyterlab/notebook/lib/widget", "Notebook.ContentFactory")
    @js.native
    /**
      * Create a content factory for a cell.
      */
    class ContentFactory ()
      extends typings.jupyterlabNotebook.widgetMod.StaticNotebook.ContentFactory {
      def this(options: typings.jupyterlabCells.widgetMod.Cell.ContentFactory.IOptions) = this()
    }
    /**
      * A namespace for the notebook content factory.
      */
    object ContentFactory {
      
      /**
        * An options object for initializing a notebook content factory.
        */
      type IOptions = typings.jupyterlabNotebook.widgetMod.StaticNotebook.ContentFactory.IOptions
    }
    
    @JSImport("@jupyterlab/notebook/lib/widget", "Notebook.defaultContentFactory")
    @js.native
    val defaultContentFactory: IContentFactory = js.native
    
    /**
      * The content factory for the notebook widget.
      */
    type IContentFactory = typings.jupyterlabNotebook.widgetMod.StaticNotebook.IContentFactory
    
    /**
      * An options object for initializing a notebook widget.
      */
    type IOptions = typings.jupyterlabNotebook.widgetMod.StaticNotebook.IOptions
  }
  
  @JSImport("@jupyterlab/notebook/lib/widget", "StaticNotebook")
  @js.native
  class StaticNotebook protected () extends Widget {
    /**
      * Construct a notebook widget.
      */
    def this(options: typings.jupyterlabNotebook.widgetMod.StaticNotebook.IOptions) = this()
    
    /**
      * Create a code cell widget from a code cell model.
      */
    /* private */ var _createCodeCell: js.Any = js.native
    
    /**
      * Create a markdown cell widget from a markdown cell model.
      */
    /* private */ var _createMarkdownCell: js.Any = js.native
    
    /**
      * Create a raw cell widget from a raw cell model.
      */
    /* private */ var _createRawCell: js.Any = js.native
    
    /* private */ var _editorConfig: js.Any = js.native
    
    /**
      * Create a cell widget and insert into the notebook.
      */
    /* private */ var _insertCell: js.Any = js.native
    
    /* private */ var _mimetype: js.Any = js.native
    
    /* private */ var _mimetypeService: js.Any = js.native
    
    /* private */ var _model: js.Any = js.native
    
    /* private */ var _modelChanged: js.Any = js.native
    
    /* private */ var _modelContentChanged: js.Any = js.native
    
    /**
      * Move a cell widget.
      */
    /* private */ var _moveCell: js.Any = js.native
    
    /* private */ var _notebookConfig: js.Any = js.native
    
    /**
      * Handle a change cells event.
      */
    /* private */ var _onCellsChanged: js.Any = js.native
    
    /**
      * Handle an update to the collaborators.
      */
    /* private */ var _onCollaboratorsChanged: js.Any = js.native
    
    /**
      * Handle a new model on the widget.
      */
    /* private */ var _onModelChanged: js.Any = js.native
    
    /**
      * Remove a cell widget.
      */
    /* private */ var _removeCell: js.Any = js.native
    
    /**
      * Update editor settings for notebook cells.
      */
    /* private */ var _updateEditorConfig: js.Any = js.native
    
    /**
      * Update the mimetype of the notebook.
      */
    /* private */ var _updateMimetype: js.Any = js.native
    
    /**
      * Apply updated notebook settings.
      */
    /* private */ var _updateNotebookConfig: js.Any = js.native
    
    /**
      * Get the mimetype for code cells.
      */
    def codeMimetype: String = js.native
    
    /**
      * The cell factory used by the widget.
      */
    val contentFactory: IContentFactory = js.native
    
    /**
      * A configuration object for cell editor settings.
      */
    def editorConfig: IEditorConfig = js.native
    def editorConfig_=(value: IEditorConfig): Unit = js.native
    
    /**
      * The model for the widget.
      */
    def model: INotebookModel | Null = js.native
    
    /**
      * A signal emitted when the model of the notebook changes.
      */
    def modelChanged: ISignal[this.type, Unit] = js.native
    
    /**
      * A signal emitted when the model content changes.
      *
      * #### Notes
      * This is a convenience signal that follows the current model.
      */
    def modelContentChanged: ISignal[this.type, Unit] = js.native
    
    def model_=(newValue: INotebookModel | Null): Unit = js.native
    
    /**
      * A configuration object for notebook settings.
      */
    def notebookConfig: INotebookConfig = js.native
    def notebookConfig_=(value: INotebookConfig): Unit = js.native
    
    /**
      * Handle a cell being inserted.
      *
      * The default implementation is a no-op
      */
    /* protected */ def onCellInserted(index: Double, cell: Cell): Unit = js.native
    
    /**
      * Handle a cell being moved.
      *
      * The default implementation is a no-op
      */
    /* protected */ def onCellMoved(fromIndex: Double, toIndex: Double): Unit = js.native
    
    /**
      * Handle a cell being removed.
      *
      * The default implementation is a no-op
      */
    /* protected */ def onCellRemoved(index: Double, cell: Cell): Unit = js.native
    
    /**
      * Handle changes to the notebook model metadata.
      *
      * #### Notes
      * The default implementation updates the mimetypes of the code cells
      * when the `language_info` metadata changes.
      */
    /* protected */ def onMetadataChanged(
      sender: IObservableMap[js.UndefOr[ReadonlyPartialJSONValue]],
      args: typings.jupyterlabObservables.observablemapMod.IObservableMap.IChangedArgs[ReadonlyPartialJSONValue]
    ): Unit = js.native
    
    /**
      * Handle a new model.
      *
      * #### Notes
      * This method is called after the model change has been handled
      * internally and before the `modelChanged` signal is emitted.
      * The default implementation is a no-op.
      */
    /* protected */ def onModelChanged(): Unit = js.native
    /* protected */ def onModelChanged(oldValue: Null, newValue: INotebookModel): Unit = js.native
    /* protected */ def onModelChanged(oldValue: INotebookModel): Unit = js.native
    /* protected */ def onModelChanged(oldValue: INotebookModel, newValue: INotebookModel): Unit = js.native
    
    /**
      * Handle changes to the notebook model content.
      *
      * #### Notes
      * The default implementation emits the `modelContentChanged` signal.
      */
    /* protected */ def onModelContentChanged(model: INotebookModel, args: Unit): Unit = js.native
    
    /**
      * The Rendermime instance used by the widget.
      */
    val rendermime: IRenderMimeRegistry = js.native
    
    /**
      * A read-only sequence of the widgets in the notebook.
      */
    def widgets: js.Array[Cell] = js.native
  }
  object StaticNotebook {
    
    /**
      * The default implementation of an `IContentFactory`.
      */
    @JSImport("@jupyterlab/notebook/lib/widget", "StaticNotebook.ContentFactory")
    @js.native
    /**
      * Create a content factory for a cell.
      */
    class ContentFactory ()
      extends typings.jupyterlabCells.mod.Cell.ContentFactory
         with IContentFactory {
      def this(options: typings.jupyterlabCells.widgetMod.Cell.ContentFactory.IOptions) = this()
      
      /**
        * Create a new cell header for the parent widget.
        */
      /* CompleteClass */
      /* InferMemberOverrides */
      override def createCellFooter(): ICellFooter = js.native
      
      /**
        * Create a new cell header for the parent widget.
        */
      /* CompleteClass */
      /* InferMemberOverrides */
      override def createCellHeader(): ICellHeader = js.native
      
      /**
        * Create a new code cell widget.
        */
      /* CompleteClass */
      override def createCodeCell(options: typings.jupyterlabCells.widgetMod.CodeCell.IOptions, parent: StaticNotebook): CodeCell = js.native
      
      /**
        * Create an input prompt.
        */
      /* InferMemberOverrides */
      override def createInputPrompt(): IInputPrompt = js.native
      
      /**
        * Create a new markdown cell widget.
        */
      /* CompleteClass */
      override def createMarkdownCell(options: typings.jupyterlabCells.widgetMod.MarkdownCell.IOptions, parent: StaticNotebook): MarkdownCell = js.native
      
      /**
        * Create an output prompt.
        */
      /* CompleteClass */
      /* InferMemberOverrides */
      override def createOutputPrompt(): IOutputPrompt = js.native
      
      /**
        * Create a new raw cell widget.
        */
      /* CompleteClass */
      override def createRawCell(options: typings.jupyterlabCells.widgetMod.RawCell.IOptions, parent: StaticNotebook): RawCell = js.native
      
      /**
        * Create an stdin widget.
        */
      /* CompleteClass */
      /* InferMemberOverrides */
      override def createStdin(options: typings.jupyterlabOutputarea.widgetMod.Stdin.IOptions): IStdin = js.native
      
      /**
        * The editor factory we need to include in `CodeEditorWratter.IOptions`.
        *
        * This is a separate readonly attribute rather than a factory method as we need
        * to pass it around.
        */
      /* InferMemberOverrides */
      override val editorFactory: Factory = js.native
    }
    /**
      * A namespace for the staic notebook content factory.
      */
    object ContentFactory {
      
      /**
        * Options for the content factory.
        */
      type IOptions = typings.jupyterlabCells.widgetMod.Cell.ContentFactory.IOptions
    }
    
    /**
      * Default content factory for the static notebook widget.
      */
    @JSImport("@jupyterlab/notebook/lib/widget", "StaticNotebook.defaultContentFactory")
    @js.native
    val defaultContentFactory: IContentFactory = js.native
    
    /**
      * Default configuration options for cell editors.
      */
    @JSImport("@jupyterlab/notebook/lib/widget", "StaticNotebook.defaultEditorConfig")
    @js.native
    val defaultEditorConfig: IEditorConfig = js.native
    
    /**
      * Default configuration options for notebooks.
      */
    @JSImport("@jupyterlab/notebook/lib/widget", "StaticNotebook.defaultNotebookConfig")
    @js.native
    val defaultNotebookConfig: INotebookConfig = js.native
    
    /**
      * A factory for creating notebook content.
      *
      * #### Notes
      * This extends the content factory of the cell itself, which extends the content
      * factory of the output area and input area. The result is that there is a single
      * factory for creating all child content of a notebook.
      */
    trait IContentFactory
      extends StObject
         with typings.jupyterlabCells.widgetMod.Cell.IContentFactory {
      
      /**
        * Create a new code cell widget.
        */
      def createCodeCell(options: typings.jupyterlabCells.widgetMod.CodeCell.IOptions, parent: StaticNotebook): CodeCell
      
      /**
        * Create a new markdown cell widget.
        */
      def createMarkdownCell(options: typings.jupyterlabCells.widgetMod.MarkdownCell.IOptions, parent: StaticNotebook): MarkdownCell
      
      /**
        * Create a new raw cell widget.
        */
      def createRawCell(options: typings.jupyterlabCells.widgetMod.RawCell.IOptions, parent: StaticNotebook): RawCell
    }
    object IContentFactory {
      
      inline def apply(
        createCellFooter: () => ICellFooter,
        createCellHeader: () => ICellHeader,
        createCodeCell: (typings.jupyterlabCells.widgetMod.CodeCell.IOptions, StaticNotebook) => CodeCell,
        createInputPrompt: () => IInputPrompt,
        createMarkdownCell: (typings.jupyterlabCells.widgetMod.MarkdownCell.IOptions, StaticNotebook) => MarkdownCell,
        createOutputPrompt: () => IOutputPrompt,
        createRawCell: (typings.jupyterlabCells.widgetMod.RawCell.IOptions, StaticNotebook) => RawCell,
        createStdin: typings.jupyterlabOutputarea.widgetMod.Stdin.IOptions => IStdin,
        editorFactory: /* options */ typings.jupyterlabCodeeditor.editorMod.CodeEditor.IOptions => IEditor
      ): IContentFactory = {
        val __obj = js.Dynamic.literal(createCellFooter = js.Any.fromFunction0(createCellFooter), createCellHeader = js.Any.fromFunction0(createCellHeader), createCodeCell = js.Any.fromFunction2(createCodeCell), createInputPrompt = js.Any.fromFunction0(createInputPrompt), createMarkdownCell = js.Any.fromFunction2(createMarkdownCell), createOutputPrompt = js.Any.fromFunction0(createOutputPrompt), createRawCell = js.Any.fromFunction2(createRawCell), createStdin = js.Any.fromFunction1(createStdin), editorFactory = js.Any.fromFunction1(editorFactory))
        __obj.asInstanceOf[IContentFactory]
      }
      
      extension [Self <: IContentFactory](x: Self) {
        
        inline def setCreateCodeCell(value: (typings.jupyterlabCells.widgetMod.CodeCell.IOptions, StaticNotebook) => CodeCell): Self = StObject.set(x, "createCodeCell", js.Any.fromFunction2(value))
        
        inline def setCreateMarkdownCell(value: (typings.jupyterlabCells.widgetMod.MarkdownCell.IOptions, StaticNotebook) => MarkdownCell): Self = StObject.set(x, "createMarkdownCell", js.Any.fromFunction2(value))
        
        inline def setCreateRawCell(value: (typings.jupyterlabCells.widgetMod.RawCell.IOptions, StaticNotebook) => RawCell): Self = StObject.set(x, "createRawCell", js.Any.fromFunction2(value))
      }
    }
    
    /**
      * A config object for the cell editors.
      */
    trait IEditorConfig extends StObject {
      
      /**
        * Config options for code cells.
        */
      val code: PartialIConfig
      
      /**
        * Config options for markdown cells.
        */
      val markdown: PartialIConfig
      
      /**
        * Config options for raw cells.
        */
      val raw: PartialIConfig
    }
    object IEditorConfig {
      
      inline def apply(code: PartialIConfig, markdown: PartialIConfig, raw: PartialIConfig): IEditorConfig = {
        val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any], markdown = markdown.asInstanceOf[js.Any], raw = raw.asInstanceOf[js.Any])
        __obj.asInstanceOf[IEditorConfig]
      }
      
      extension [Self <: IEditorConfig](x: Self) {
        
        inline def setCode(value: PartialIConfig): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
        
        inline def setMarkdown(value: PartialIConfig): Self = StObject.set(x, "markdown", value.asInstanceOf[js.Any])
        
        inline def setRaw(value: PartialIConfig): Self = StObject.set(x, "raw", value.asInstanceOf[js.Any])
      }
    }
    
    /**
      * A config object for the notebook widget
      */
    trait INotebookConfig extends StObject {
      
      /**
        * The default type for new notebook cells.
        */
      var defaultCell: CellType
      
      /**
        * Should timing be recorded in metadata
        */
      var recordTiming: Boolean
      
      /**
        * Enable scrolling past the last cell
        */
      var scrollPastEnd: Boolean
    }
    object INotebookConfig {
      
      inline def apply(defaultCell: CellType, recordTiming: Boolean, scrollPastEnd: Boolean): INotebookConfig = {
        val __obj = js.Dynamic.literal(defaultCell = defaultCell.asInstanceOf[js.Any], recordTiming = recordTiming.asInstanceOf[js.Any], scrollPastEnd = scrollPastEnd.asInstanceOf[js.Any])
        __obj.asInstanceOf[INotebookConfig]
      }
      
      extension [Self <: INotebookConfig](x: Self) {
        
        inline def setDefaultCell(value: CellType): Self = StObject.set(x, "defaultCell", value.asInstanceOf[js.Any])
        
        inline def setRecordTiming(value: Boolean): Self = StObject.set(x, "recordTiming", value.asInstanceOf[js.Any])
        
        inline def setScrollPastEnd(value: Boolean): Self = StObject.set(x, "scrollPastEnd", value.asInstanceOf[js.Any])
      }
    }
    
    /**
      * An options object for initializing a static notebook.
      */
    trait IOptions extends StObject {
      
      /**
        * A factory for creating content.
        */
      var contentFactory: js.UndefOr[IContentFactory] = js.undefined
      
      /**
        * A configuration object for the cell editor settings.
        */
      var editorConfig: js.UndefOr[IEditorConfig] = js.undefined
      
      /**
        * The language preference for the model.
        */
      var languagePreference: js.UndefOr[String] = js.undefined
      
      /**
        * The service used to look up mime types.
        */
      var mimeTypeService: IEditorMimeTypeService
      
      /**
        * A configuration object for notebook settings.
        */
      var notebookConfig: js.UndefOr[INotebookConfig] = js.undefined
      
      /**
        * The rendermime instance used by the widget.
        */
      var rendermime: IRenderMimeRegistry
    }
    object IOptions {
      
      inline def apply(mimeTypeService: IEditorMimeTypeService, rendermime: IRenderMimeRegistry): typings.jupyterlabNotebook.widgetMod.StaticNotebook.IOptions = {
        val __obj = js.Dynamic.literal(mimeTypeService = mimeTypeService.asInstanceOf[js.Any], rendermime = rendermime.asInstanceOf[js.Any])
        __obj.asInstanceOf[typings.jupyterlabNotebook.widgetMod.StaticNotebook.IOptions]
      }
      
      extension [Self <: typings.jupyterlabNotebook.widgetMod.StaticNotebook.IOptions](x: Self) {
        
        inline def setContentFactory(value: IContentFactory): Self = StObject.set(x, "contentFactory", value.asInstanceOf[js.Any])
        
        inline def setContentFactoryUndefined: Self = StObject.set(x, "contentFactory", js.undefined)
        
        inline def setEditorConfig(value: IEditorConfig): Self = StObject.set(x, "editorConfig", value.asInstanceOf[js.Any])
        
        inline def setEditorConfigUndefined: Self = StObject.set(x, "editorConfig", js.undefined)
        
        inline def setLanguagePreference(value: String): Self = StObject.set(x, "languagePreference", value.asInstanceOf[js.Any])
        
        inline def setLanguagePreferenceUndefined: Self = StObject.set(x, "languagePreference", js.undefined)
        
        inline def setMimeTypeService(value: IEditorMimeTypeService): Self = StObject.set(x, "mimeTypeService", value.asInstanceOf[js.Any])
        
        inline def setNotebookConfig(value: INotebookConfig): Self = StObject.set(x, "notebookConfig", value.asInstanceOf[js.Any])
        
        inline def setNotebookConfigUndefined: Self = StObject.set(x, "notebookConfig", js.undefined)
        
        inline def setRendermime(value: IRenderMimeRegistry): Self = StObject.set(x, "rendermime", value.asInstanceOf[js.Any])
      }
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.jupyterlabNotebook.jupyterlabNotebookStrings.command
    - typings.jupyterlabNotebook.jupyterlabNotebookStrings.edit
  */
  trait NotebookMode extends StObject
  object NotebookMode {
    
    inline def command: typings.jupyterlabNotebook.jupyterlabNotebookStrings.command = "command".asInstanceOf[typings.jupyterlabNotebook.jupyterlabNotebookStrings.command]
    
    inline def edit: typings.jupyterlabNotebook.jupyterlabNotebookStrings.edit = "edit".asInstanceOf[typings.jupyterlabNotebook.jupyterlabNotebookStrings.edit]
  }
}
