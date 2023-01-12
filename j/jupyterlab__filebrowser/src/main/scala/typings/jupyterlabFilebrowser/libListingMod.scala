package typings.jupyterlabFilebrowser

import org.scalablytyped.runtime.StringDictionary
import typings.jupyterlabDocregistry.libRegistryMod.DocumentRegistry.IFileType
import typings.jupyterlabFilebrowser.jupyterlabFilebrowserStrings.ascending
import typings.jupyterlabFilebrowser.jupyterlabFilebrowserStrings.descending
import typings.jupyterlabFilebrowser.jupyterlabFilebrowserStrings.last_modified
import typings.jupyterlabFilebrowser.jupyterlabFilebrowserStrings.name
import typings.jupyterlabFilebrowser.libListingMod.DirListing.IOptions
import typings.jupyterlabFilebrowser.libListingMod.DirListing.IRenderer
import typings.jupyterlabFilebrowser.libListingMod.DirListing.ISortState
import typings.jupyterlabFilebrowser.libListingMod.DirListing.ToggleableColumn
import typings.jupyterlabFilebrowser.libModelMod.FilterFileBrowserModel
import typings.jupyterlabServices.libContentsMod.Contents.IModel
import typings.jupyterlabTranslation.libTokensMod.ITranslator
import typings.jupyterlabTranslation.libTokensMod.TranslationBundle
import typings.luminoAlgorithm.typesIterMod.IIterator
import typings.luminoDragdrop.mod.IDragEvent
import typings.luminoSignaling.mod.ISignal
import typings.luminoWidgets.mod.Widget
import typings.luminoWidgets.mod.Widget.ResizeMessage
import typings.std.DragEvent
import typings.std.Event
import typings.std.HTMLElement
import typings.std.KeyboardEvent
import typings.std.MouseEvent
import typings.std.Set
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libListingMod {
  
  @JSImport("@jupyterlab/filebrowser/lib/listing", "DirListing")
  @js.native
  open class DirListing protected () extends Widget {
    /**
      * Construct a new file browser directory listing widget.
      *
      * @param model - The file browser view model.
      */
    def this(options: IOptions) = this()
    
    /* private */ var _clipboard: Any = js.native
    
    /**
      * Copy the selected items, and optionally cut as well.
      */
    /* private */ var _copy: Any = js.native
    
    /**
      * Delete the files with the given paths.
      */
    /* private */ var _delete: Any = js.native
    
    /**
      * Allow the user to rename item on a given row.
      */
    /* private */ var _doRename: Any = js.native
    
    /* private */ var _drag: Any = js.native
    
    /* private */ var _dragData: Any = js.native
    
    /* private */ var _editNode: Any = js.native
    
    /**
      * Handle the `'click'` event for the widget.
      */
    /* private */ var _evtClick: Any = js.native
    
    /**
      * Handle the `'mousedown'` event for the widget.
      */
    /* private */ var _evtMousedown: Any = js.native
    
    /**
      * Handle the `'mousemove'` event for the widget.
      */
    /* private */ var _evtMousemove: Any = js.native
    
    /**
      * Handle the `'mouseup'` event for the widget.
      */
    /* private */ var _evtMouseup: Any = js.native
    
    /**
      * Handle the `'scroll'` event for the widget.
      */
    /* private */ var _evtScroll: Any = js.native
    
    /**
      * (Re-)focus on the selected file.
      *
      * If index is not given, it will be inferred from the current selection;
      * providing index saves on the iteration time.
      */
    /* private */ var _focusSelectedFile: Any = js.native
    
    /**
      * Handle a multiple select on a file item node.
      */
    /* private */ var _handleMultiSelect: Any = js.native
    
    /* private */ var _hiddenColumns: Any = js.native
    
    /* private */ var _inRename: Any = js.native
    
    /* private */ var _isCut: Any = js.native
    
    /* private */ var _isDirty: Any = js.native
    
    /* private */ var _items: Any = js.native
    
    /* private */ var _manager: Any = js.native
    
    /* protected */ var _model: FilterFileBrowserModel = js.native
    
    /**
      * Handle an `activateRequested` signal from the manager.
      */
    /* private */ var _onActivateRequested: Any = js.native
    
    /**
      * Handle a `fileChanged` signal from the model.
      */
    /* private */ var _onFileChanged: Any = js.native
    
    /* private */ var _onItemOpened: Any = js.native
    
    /**
      * Handle the `refreshed` signal from the model.
      */
    /* private */ var _onModelRefreshed: Any = js.native
    
    /**
      * Handle a `pathChanged` signal from the model.
      */
    /* private */ var _onPathChanged: Any = js.native
    
    /* private */ var _prevPath: Any = js.native
    
    /* private */ var _renderer: Any = js.native
    
    /* private */ var _searchPrefix: Any = js.native
    
    /* private */ var _searchPrefixTimer: Any = js.native
    
    /**
      * Select a given item.
      */
    /* private */ var _selectItem: Any = js.native
    
    /* private */ var _selectTimer: Any = js.native
    
    /* private */ var _softSelection: Any = js.native
    
    /* private */ var _sortState: Any = js.native
    
    /* private */ var _sortedItems: Any = js.native
    
    /**
      * Start a drag event.
      */
    /* private */ var _startDrag: Any = js.native
    
    /* private */ var _trans: Any = js.native
    
    /**
      * Clear the selected items.
      */
    def clearSelectedItems(): Unit = js.native
    
    /**
      * Get the dir listing content node.
      *
      * #### Notes
      * This is the node which holds the item nodes.
      *
      * Modifying this node directly can lead to undefined behavior.
      */
    def contentNode: HTMLElement = js.native
    
    /**
      * Copy the selected items.
      */
    def copy(): Unit = js.native
    
    /**
      * Cut the selected items.
      */
    def cut(): Unit = js.native
    
    /**
      * Delete the currently selected item(s).
      *
      * @returns A promise that resolves when the operation is complete.
      */
    def delete(): js.Promise[Unit] = js.native
    
    /**
      * Download the currently selected item(s).
      */
    def download(): js.Promise[Unit] = js.native
    
    /**
      * Duplicate the currently selected item(s).
      *
      * @returns A promise that resolves when the operation is complete.
      */
    def duplicate(): js.Promise[Unit] = js.native
    
    /**
      * Handle the `'dblclick'` event for the widget.
      */
    /* protected */ def evtDblClick(event: MouseEvent): Unit = js.native
    
    /**
      * Handle the `'lm-dragenter'` event for the widget.
      */
    /* protected */ def evtDragEnter(event: IDragEvent): Unit = js.native
    
    /**
      * Handle the `'lm-dragleave'` event for the widget.
      */
    /* protected */ def evtDragLeave(event: IDragEvent): Unit = js.native
    
    /**
      * Handle the `'lm-dragover'` event for the widget.
      */
    /* protected */ def evtDragOver(event: IDragEvent): Unit = js.native
    
    /**
      * Handle the `'lm-drop'` event for the widget.
      */
    /* protected */ def evtDrop(event: IDragEvent): Unit = js.native
    
    /**
      * Handle the `'keydown'` event for the widget.
      */
    /* protected */ def evtKeydown(event: KeyboardEvent): Unit = js.native
    
    /**
      * Handle the `drop` event for the widget.
      */
    /* protected */ def evtNativeDrop(event: DragEvent): Unit = js.native
    
    /**
      * Handle the DOM events for the directory listing.
      *
      * @param event - The DOM event sent to the widget.
      *
      * #### Notes
      * This method implements the DOM `EventListener` interface and is
      * called in response to events on the panel's DOM node. It should
      * not be called directly by user code.
      */
    def handleEvent(event: Event): Unit = js.native
    
    /**
      * Handle selection on a file node.
      */
    /* protected */ def handleFileSelect(event: MouseEvent): Unit = js.native
    
    /**
      * Handle the opening of an item.
      */
    /* protected */ def handleOpen(item: IModel): Unit = js.native
    
    /**
      * Get the dir listing header node.
      *
      * #### Notes
      * This is the node which holds the header cells.
      *
      * Modifying this node directly can lead to undefined behavior.
      */
    def headerNode: HTMLElement = js.native
    
    /**
      * Get whether an item is selected by name.
      *
      * @param name - The name of of the item.
      *
      * @returns Whether the item is selected.
      */
    def isSelected(name: String): Boolean = js.native
    
    /**
      * Get the model used by the listing.
      */
    def model: FilterFileBrowserModel = js.native
    
    /**
      * Find a model given a click.
      *
      * @param event - The mouse event.
      *
      * @returns The model for the selected file.
      */
    def modelForClick(event: MouseEvent): js.UndefOr[IModel] = js.native
    
    /**
      * A signal fired when an item is opened.
      */
    def onItemOpened: ISignal[DirListing, IModel] = js.native
    
    def onResize(msg: ResizeMessage): Unit = js.native
    
    /**
      * Paste the items from the clipboard.
      *
      * @returns A promise that resolves when the operation is complete.
      */
    def paste(): js.Promise[Unit] = js.native
    
    /**
      * Rename the first currently selected item.
      *
      * @returns A promise that resolves with the new name of the item.
      */
    def rename(): js.Promise[String] = js.native
    
    /**
      * The renderer instance used by the directory listing.
      */
    def renderer: IRenderer = js.native
    
    /**
      * Select the first item that starts with prefix being typed.
      */
    def selectByPrefix(): Unit = js.native
    
    /**
      * Select an item by name.
      *
      * @param name - The name of the item to select.
      * @param focus - Whether to move focus the selected item.
      *
      * @returns A promise that resolves when the name is selected.
      */
    def selectItemByName(name: String): js.Promise[Unit] = js.native
    def selectItemByName(name: String, focus: Boolean): js.Promise[Unit] = js.native
    
    /**
      * Select next item.
      *
      * @param keepExisting - Whether to keep the current selection and add to it.
      */
    def selectNext(): Unit = js.native
    def selectNext(keepExisting: Boolean): Unit = js.native
    
    /**
      * Select previous item.
      *
      * @param keepExisting - Whether to keep the current selection and add to it.
      */
    def selectPrevious(): Unit = js.native
    def selectPrevious(keepExisting: Boolean): Unit = js.native
    
    /**
      * Create an iterator over the listing's selected items.
      *
      * @returns A new iterator over the listing's selected items.
      */
    def selectedItems(): IIterator[IModel] = js.native
    
    /* protected */ var selection: StringDictionary[Boolean] = js.native
    
    def setColumnVisibility(name: ToggleableColumn, visible: Boolean): Unit = js.native
    
    /**
      * Shut down kernels on the applicable currently selected items.
      *
      * @returns A promise that resolves when the operation is complete.
      */
    def shutdownKernels(): js.Promise[Unit] = js.native
    
    /**
      * Sort the items using a sort condition.
      */
    def sort(state: ISortState): Unit = js.native
    
    /**
      * The current sort state.
      */
    def sortState: ISortState = js.native
    
    /**
      * Create an iterator over the listing's sorted items.
      *
      * @returns A new iterator over the listing's sorted items.
      */
    def sortedItems(): IIterator[IModel] = js.native
    
    /* protected */ var translator: ITranslator = js.native
  }
  object DirListing {
    
    /**
      * The default implementation of an `IRenderer`.
      */
    @JSImport("@jupyterlab/filebrowser/lib/listing", "DirListing.Renderer")
    @js.native
    open class Renderer ()
      extends StObject
         with IRenderer {
      
      /**
        * Create a node for a header item.
        */
      /* protected */ def createHeaderItemNode(label: String): HTMLElement = js.native
    }
    
    /**
      * The default `IRenderer` instance.
      */
    @JSImport("@jupyterlab/filebrowser/lib/listing", "DirListing.defaultRenderer")
    @js.native
    val defaultRenderer: Renderer = js.native
    
    /**
      * A file contents model thunk.
      *
      * Note: The content of the model will be empty.
      * To get the contents, call and await the `withContent`
      * method.
      */
    trait IContentsThunk extends StObject {
      
      /**
        * The contents model.
        */
      var model: IModel
      
      /**
        * Fetches the model with contents.
        */
      def withContent(): js.Promise[IModel]
    }
    object IContentsThunk {
      
      inline def apply(model: IModel, withContent: () => js.Promise[IModel]): IContentsThunk = {
        val __obj = js.Dynamic.literal(model = model.asInstanceOf[js.Any], withContent = js.Any.fromFunction0(withContent))
        __obj.asInstanceOf[IContentsThunk]
      }
      
      @scala.inline
      implicit open class MutableBuilder[Self <: IContentsThunk] (val x: Self) extends AnyVal {
        
        inline def setModel(value: IModel): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
        
        inline def setWithContent(value: () => js.Promise[IModel]): Self = StObject.set(x, "withContent", js.Any.fromFunction0(value))
      }
    }
    
    /**
      * An options object for initializing a file browser directory listing.
      */
    trait IOptions extends StObject {
      
      /**
        * A file browser model instance.
        */
      var model: FilterFileBrowserModel
      
      /**
        * A renderer for file items.
        *
        * The default is a shared `Renderer` instance.
        */
      var renderer: js.UndefOr[IRenderer] = js.undefined
      
      /**
        * A language translator.
        */
      var translator: js.UndefOr[ITranslator] = js.undefined
    }
    object IOptions {
      
      inline def apply(model: FilterFileBrowserModel): IOptions = {
        val __obj = js.Dynamic.literal(model = model.asInstanceOf[js.Any])
        __obj.asInstanceOf[IOptions]
      }
      
      @scala.inline
      implicit open class MutableBuilder[Self <: IOptions] (val x: Self) extends AnyVal {
        
        inline def setModel(value: FilterFileBrowserModel): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
        
        inline def setRenderer(value: IRenderer): Self = StObject.set(x, "renderer", value.asInstanceOf[js.Any])
        
        inline def setRendererUndefined: Self = StObject.set(x, "renderer", js.undefined)
        
        inline def setTranslator(value: ITranslator): Self = StObject.set(x, "translator", value.asInstanceOf[js.Any])
        
        inline def setTranslatorUndefined: Self = StObject.set(x, "translator", js.undefined)
      }
    }
    
    /**
      * The render interface for file browser listing options.
      */
    @js.native
    trait IRenderer extends StObject {
      
      /**
        * Create an appropriate drag image for an item.
        *
        * @param node - A node created by [[createItemNode]].
        *
        * @param count - The number of items being dragged.
        *
        * @param fileType - The file type of the item, if applicable.
        *
        * @returns An element to use as the drag image.
        */
      def createDragImage(node: HTMLElement, count: Double, trans: TranslationBundle): HTMLElement = js.native
      def createDragImage(node: HTMLElement, count: Double, trans: TranslationBundle, fileType: IFileType): HTMLElement = js.native
      
      /**
        * Create a new item node for a dir listing.
        *
        * @returns A new DOM node to use as a content item.
        */
      def createItemNode(): HTMLElement = js.native
      def createItemNode(hiddenColumns: Set[ToggleableColumn]): HTMLElement = js.native
      
      /**
        * Create the DOM node for a dir listing.
        */
      def createNode(): HTMLElement = js.native
      
      /**
        * Get the node containing the file name.
        *
        * @param node - A node created by [[createItemNode]].
        *
        * @returns The node containing the file name.
        */
      def getNameNode(node: HTMLElement): HTMLElement = js.native
      
      /**
        * Handle a header click.
        *
        * @param node - A node populated by [[populateHeaderNode]].
        *
        * @param event - A click event on the node.
        *
        * @returns The sort state of the header after the click event.
        */
      def handleHeaderClick(node: HTMLElement, event: MouseEvent): ISortState | Null = js.native
      
      /**
        * Populate and empty header node for a dir listing.
        *
        * @param node - The header node to populate.
        */
      def populateHeaderNode(node: HTMLElement): Unit = js.native
      def populateHeaderNode(node: HTMLElement, translator: Unit, hiddenColumns: Set[ToggleableColumn]): Unit = js.native
      def populateHeaderNode(node: HTMLElement, translator: ITranslator): Unit = js.native
      def populateHeaderNode(node: HTMLElement, translator: ITranslator, hiddenColumns: Set[ToggleableColumn]): Unit = js.native
      
      /**
        * Update an item node to reflect the current state of a model.
        *
        * @param node - A node created by [[createItemNode]].
        *
        * @param model - The model object to use for the item state.
        *
        * @param fileType - The file type of the item, if applicable.
        */
      def updateItemNode(node: HTMLElement, model: IModel): Unit = js.native
      def updateItemNode(
        node: HTMLElement,
        model: IModel,
        fileType: Unit,
        translator: Unit,
        hiddenColumns: Set[ToggleableColumn]
      ): Unit = js.native
      def updateItemNode(node: HTMLElement, model: IModel, fileType: Unit, translator: ITranslator): Unit = js.native
      def updateItemNode(
        node: HTMLElement,
        model: IModel,
        fileType: Unit,
        translator: ITranslator,
        hiddenColumns: Set[ToggleableColumn]
      ): Unit = js.native
      def updateItemNode(node: HTMLElement, model: IModel, fileType: IFileType): Unit = js.native
      def updateItemNode(
        node: HTMLElement,
        model: IModel,
        fileType: IFileType,
        translator: Unit,
        hiddenColumns: Set[ToggleableColumn]
      ): Unit = js.native
      def updateItemNode(node: HTMLElement, model: IModel, fileType: IFileType, translator: ITranslator): Unit = js.native
      def updateItemNode(
        node: HTMLElement,
        model: IModel,
        fileType: IFileType,
        translator: ITranslator,
        hiddenColumns: Set[ToggleableColumn]
      ): Unit = js.native
    }
    
    /**
      * A sort state.
      */
    trait ISortState extends StObject {
      
      /**
        * The direction of sort.
        */
      var direction: ascending | descending
      
      /**
        * The sort key.
        */
      var key: name | last_modified
    }
    object ISortState {
      
      inline def apply(direction: ascending | descending, key: name | last_modified): ISortState = {
        val __obj = js.Dynamic.literal(direction = direction.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any])
        __obj.asInstanceOf[ISortState]
      }
      
      @scala.inline
      implicit open class MutableBuilder[Self <: ISortState] (val x: Self) extends AnyVal {
        
        inline def setDirection(value: ascending | descending): Self = StObject.set(x, "direction", value.asInstanceOf[js.Any])
        
        inline def setKey(value: name | last_modified): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      }
    }
    
    /**
      * Toggleable columns.
      */
    type ToggleableColumn = last_modified
  }
}
