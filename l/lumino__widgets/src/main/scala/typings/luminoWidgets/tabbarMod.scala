package typings.luminoWidgets

import typings.luminoSignaling.mod.ISignal
import typings.luminoVirtualdom.mod.ElementDataset
import typings.luminoVirtualdom.mod.ElementInlineStyle
import typings.luminoVirtualdom.mod.VirtualElement
import typings.luminoWidgets.tabbarMod.TabBar.ICurrentChangedArgs
import typings.luminoWidgets.tabbarMod.TabBar.IOptions
import typings.luminoWidgets.tabbarMod.TabBar.IRenderer
import typings.luminoWidgets.tabbarMod.TabBar.ITabActivateRequestedArgs
import typings.luminoWidgets.tabbarMod.TabBar.ITabCloseRequestedArgs
import typings.luminoWidgets.tabbarMod.TabBar.ITabDetachRequestedArgs
import typings.luminoWidgets.tabbarMod.TabBar.ITabMovedArgs
import typings.luminoWidgets.tabbarMod.TabBar.InsertBehavior
import typings.luminoWidgets.tabbarMod.TabBar.Orientation
import typings.luminoWidgets.tabbarMod.TabBar.RemoveBehavior
import typings.luminoWidgets.titleMod.Title
import typings.luminoWidgets.widgetMod.Widget
import typings.std.Event
import typings.std.HTMLElement
import typings.std.HTMLUListElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object tabbarMod {
  
  @JSImport("@lumino/widgets/types/tabbar", "TabBar")
  @js.native
  /**
    * Construct a new tab bar.
    *
    * @param options - The options for initializing the tab bar.
    */
  class TabBar[T] () extends Widget {
    def this(options: IOptions[T]) = this()
    
    /**
      * Adjust the current index for a tab insert operation.
      *
      * This method accounts for the tab bar's insertion behavior when
      * adjusting the current index and emitting the changed signal.
      */
    /* private */ var _adjustCurrentForInsert: js.Any = js.native
    
    /**
      * Adjust the current index for a tab move operation.
      *
      * This method will not cause the actual current tab to change.
      * It silently adjusts the index to account for the given move.
      */
    /* private */ var _adjustCurrentForMove: js.Any = js.native
    
    /**
      * Adjust the current index for a tab remove operation.
      *
      * This method accounts for the tab bar's remove behavior when
      * adjusting the current index and emitting the changed signal.
      */
    /* private */ var _adjustCurrentForRemove: js.Any = js.native
    
    /* private */ var _currentChanged: js.Any = js.native
    
    /* private */ var _currentIndex: js.Any = js.native
    
    /* private */ var _dragData: js.Any = js.native
    
    /**
      * Handle the `'dblclick'` event for the tab bar.
      */
    /* private */ var _evtDblClick: js.Any = js.native
    
    /**
      * Handle the `'keydown'` event for the tab bar.
      */
    /* private */ var _evtKeyDown: js.Any = js.native
    
    /**
      * Handle the `'mousedown'` event for the tab bar.
      */
    /* private */ var _evtMouseDown: js.Any = js.native
    
    /**
      * Handle the `'mousemove'` event for the tab bar.
      */
    /* private */ var _evtMouseMove: js.Any = js.native
    
    /**
      * Handle the `'mouseup'` event for the document.
      */
    /* private */ var _evtMouseUp: js.Any = js.native
    
    /**
      * Handle the `changed` signal of a title object.
      */
    /* private */ var _onTitleChanged: js.Any = js.native
    
    /* private */ var _orientation: js.Any = js.native
    
    /* private */ var _previousTitle: js.Any = js.native
    
    /**
      * Release the mouse and restore the non-dragged tab positions.
      */
    /* private */ var _releaseMouse: js.Any = js.native
    
    /* private */ var _tabActivateRequested: js.Any = js.native
    
    /* private */ var _tabCloseRequested: js.Any = js.native
    
    /* private */ var _tabDetachRequested: js.Any = js.native
    
    /* private */ var _tabMoved: js.Any = js.native
    
    /* private */ var _titles: js.Any = js.native
    
    /* private */ var _titlesEditable: js.Any = js.native
    
    /**
      * Add a tab to the end of the tab bar.
      *
      * @param value - The title which holds the data for the tab,
      *   or an options object to convert to a title.
      *
      * @returns The title object added to the tab bar.
      *
      * #### Notes
      * If the title is already added to the tab bar, it will be moved.
      */
    def addTab(value: Title[T]): Title[T] = js.native
    def addTab(value: typings.luminoWidgets.titleMod.Title.IOptions[T]): Title[T] = js.native
    
    /**
      * Whether a tab can be deselected by the user.
      *
      * #### Notes
      * Tabs can be always be deselected programmatically.
      */
    var allowDeselect: Boolean = js.native
    
    /**
      * Remove all tabs from the tab bar.
      */
    def clearTabs(): Unit = js.native
    
    /**
      * The tab bar content node.
      *
      * #### Notes
      * This is the node which holds the tab nodes.
      *
      * Modifying this node directly can lead to undefined behavior.
      */
    val contentNode: HTMLUListElement = js.native
    
    /**
      * A signal emitted when the current tab is changed.
      *
      * #### Notes
      * This signal is emitted when the currently selected tab is changed
      * either through user or programmatic interaction.
      *
      * Notably, this signal is not emitted when the index of the current
      * tab changes due to tabs being inserted, removed, or moved. It is
      * only emitted when the actual current tab node is changed.
      */
    val currentChanged: ISignal[this.type, ICurrentChangedArgs[T]] = js.native
    
    /**
      * Get the index of the currently selected tab.
      *
      * #### Notes
      * This will be `-1` if no tab is selected.
      */
    /**
      * Set the index of the currently selected tab.
      *
      * #### Notes
      * If the value is out of range, the index will be set to `-1`.
      */
    var currentIndex: Double = js.native
    
    /**
      * Get the currently selected title.
      *
      * #### Notes
      * This will be `null` if no tab is selected.
      */
    /**
      * Set the currently selected title.
      *
      * #### Notes
      * If the title does not exist, the title will be set to `null`.
      */
    var currentTitle: Title[T] | Null = js.native
    
    /**
      * Handle the DOM events for the tab bar.
      *
      * @param event - The DOM event sent to the tab bar.
      *
      * #### Notes
      * This method implements the DOM `EventListener` interface and is
      * called in response to events on the tab bar's DOM node.
      *
      * This should not be called directly by user code.
      */
    def handleEvent(event: Event): Unit = js.native
    
    /**
      * The selection behavior when inserting a tab.
      */
    var insertBehavior: InsertBehavior = js.native
    
    /**
      * Insert a tab into the tab bar at the specified index.
      *
      * @param index - The index at which to insert the tab.
      *
      * @param value - The title which holds the data for the tab,
      *   or an options object to convert to a title.
      *
      * @returns The title object added to the tab bar.
      *
      * #### Notes
      * The index will be clamped to the bounds of the tabs.
      *
      * If the title is already added to the tab bar, it will be moved.
      */
    def insertTab(index: Double, value: Title[T]): Title[T] = js.native
    def insertTab(index: Double, value: typings.luminoWidgets.titleMod.Title.IOptions[T]): Title[T] = js.native
    
    /**
      * Get the orientation of the tab bar.
      *
      * #### Notes
      * This controls whether the tabs are arranged in a row or column.
      */
    /**
      * Set the orientation of the tab bar.
      *
      * #### Notes
      * This controls whether the tabs are arranged in a row or column.
      */
    var orientation: Orientation = js.native
    
    /**
      * Release the mouse and restore the non-dragged tab positions.
      *
      * #### Notes
      * This will cause the tab bar to stop handling mouse events and to
      * restore the tabs to their non-dragged positions.
      */
    def releaseMouse(): Unit = js.native
    
    /**
      * The selection behavior when removing a tab.
      */
    var removeBehavior: RemoveBehavior = js.native
    
    /**
      * Remove a tab from the tab bar.
      *
      * @param title - The title for the tab to remove.
      *
      * #### Notes
      * This is a no-op if the title is not in the tab bar.
      */
    def removeTab(title: Title[T]): Unit = js.native
    
    /**
      * Remove the tab at a given index from the tab bar.
      *
      * @param index - The index of the tab to remove.
      *
      * #### Notes
      * This is a no-op if the index is out of range.
      */
    def removeTabAt(index: Double): Unit = js.native
    
    /**
      * The renderer used by the tab bar.
      */
    val renderer: IRenderer[T] = js.native
    
    /**
      * A signal emitted when a tab is clicked by the user.
      *
      * #### Notes
      * If the clicked tab is not the current tab, the clicked tab will be
      * made current and the `currentChanged` signal will be emitted first.
      *
      * This signal is emitted even if the clicked tab is the current tab.
      */
    val tabActivateRequested: ISignal[this.type, ITabActivateRequestedArgs[T]] = js.native
    
    /**
      * A signal emitted when a tab close icon is clicked.
      *
      * #### Notes
      * This signal is not emitted unless the tab title is `closable`.
      */
    val tabCloseRequested: ISignal[this.type, ITabCloseRequestedArgs[T]] = js.native
    
    /**
      * A signal emitted when a tab is dragged beyond the detach threshold.
      *
      * #### Notes
      * This signal is emitted when the user drags a tab with the mouse,
      * and mouse is dragged beyond the detach threshold.
      *
      * The consumer of the signal should call `releaseMouse` and remove
      * the tab in order to complete the detach.
      *
      * This signal is only emitted once per drag cycle.
      */
    val tabDetachRequested: ISignal[this.type, ITabDetachRequestedArgs[T]] = js.native
    
    /**
      * A signal emitted when a tab is moved by the user.
      *
      * #### Notes
      * This signal is emitted when a tab is moved by user interaction.
      *
      * This signal is not emitted when a tab is moved programmatically.
      */
    val tabMoved: ISignal[this.type, ITabMovedArgs[T]] = js.native
    
    /**
      * Whether the tabs are movable by the user.
      *
      * #### Notes
      * Tabs can always be moved programmatically.
      */
    var tabsMovable: Boolean = js.native
    
    /**
      * A read-only array of the titles in the tab bar.
      */
    val titles: js.Array[Title[T]] = js.native
    
    /**
      * Whether the titles can be user-edited.
      *
      */
    /**
      * Set whether titles can be user edited.
      *
      */
    var titlesEditable: Boolean = js.native
  }
  object TabBar {
    
    /**
      * The default implementation of `IRenderer`.
      *
      * #### Notes
      * Subclasses are free to reimplement rendering methods as needed.
      */
    @JSImport("@lumino/widgets/types/tabbar", "TabBar.Renderer")
    @js.native
    /**
      * Construct a new renderer.
      */
    class Renderer ()
      extends StObject
         with IRenderer[js.Any] {
      
      /* private */ var _tabID: js.Any = js.native
      
      /* private */ var _tabKeys: js.Any = js.native
      
      /**
        * A selector which matches the close icon node in a tab.
        */
      /* CompleteClass */
      override val closeIconSelector: String = js.native
      
      /**
        * Create the class name for the tab icon.
        *
        * @param data - The data to use for the tab.
        *
        * @returns The full class name for the tab icon.
        */
      def createIconClass(data: IRenderData[js.Any]): String = js.native
      
      /**
        * Create the class name for the tab.
        *
        * @param data - The data to use for the tab.
        *
        * @returns The full class name for the tab.
        */
      def createTabClass(data: IRenderData[js.Any]): String = js.native
      
      /**
        * Create the dataset for a tab.
        *
        * @param data - The data to use for the tab.
        *
        * @returns The dataset for the tab.
        */
      def createTabDataset(data: IRenderData[js.Any]): ElementDataset = js.native
      
      /**
        * Create a unique render key for the tab.
        *
        * @param data - The data to use for the tab.
        *
        * @returns The unique render key for the tab.
        *
        * #### Notes
        * This method caches the key against the tab title the first time
        * the key is generated. This enables efficient rendering of moved
        * tabs and avoids subtle hover style artifacts.
        */
      def createTabKey(data: IRenderData[js.Any]): String = js.native
      
      /**
        * Create the inline style object for a tab.
        *
        * @param data - The data to use for the tab.
        *
        * @returns The inline style data for the tab.
        */
      def createTabStyle(data: IRenderData[js.Any]): ElementInlineStyle = js.native
      
      /**
        * Render the close icon element for a tab.
        *
        * @param data - The data to use for rendering the tab.
        *
        * @returns A virtual element representing the tab close icon.
        */
      def renderCloseIcon(data: IRenderData[js.Any]): VirtualElement = js.native
      
      /**
        * Render the icon element for a tab.
        *
        * @param data - The data to use for rendering the tab.
        *
        * @returns A virtual element representing the tab icon.
        */
      def renderIcon(data: IRenderData[js.Any]): VirtualElement = js.native
      
      /**
        * Render the label element for a tab.
        *
        * @param data - The data to use for rendering the tab.
        *
        * @returns A virtual element representing the tab label.
        */
      def renderLabel(data: IRenderData[js.Any]): VirtualElement = js.native
      
      /**
        * Render the virtual element for a tab.
        *
        * @param data - The data to use for rendering the tab.
        *
        * @returns A virtual element representing the tab.
        */
      /* CompleteClass */
      override def renderTab(data: IRenderData[js.Any]): VirtualElement = js.native
    }
    
    /**
      * The default `Renderer` instance.
      */
    @JSImport("@lumino/widgets/types/tabbar", "TabBar.defaultRenderer")
    @js.native
    val defaultRenderer: Renderer = js.native
    
    /**
      * The arguments object for the `currentChanged` signal.
      */
    trait ICurrentChangedArgs[T] extends StObject {
      
      /**
        * The currently selected index.
        */
      val currentIndex: Double
      
      /**
        * The currently selected title.
        */
      val currentTitle: Title[T] | Null
      
      /**
        * The previously selected index.
        */
      val previousIndex: Double
      
      /**
        * The previously selected title.
        */
      val previousTitle: Title[T] | Null
    }
    object ICurrentChangedArgs {
      
      inline def apply[T](currentIndex: Double, previousIndex: Double): ICurrentChangedArgs[T] = {
        val __obj = js.Dynamic.literal(currentIndex = currentIndex.asInstanceOf[js.Any], previousIndex = previousIndex.asInstanceOf[js.Any], currentTitle = null, previousTitle = null)
        __obj.asInstanceOf[ICurrentChangedArgs[T]]
      }
      
      extension [Self <: ICurrentChangedArgs[?], T](x: Self & ICurrentChangedArgs[T]) {
        
        inline def setCurrentIndex(value: Double): Self = StObject.set(x, "currentIndex", value.asInstanceOf[js.Any])
        
        inline def setCurrentTitle(value: Title[T]): Self = StObject.set(x, "currentTitle", value.asInstanceOf[js.Any])
        
        inline def setCurrentTitleNull: Self = StObject.set(x, "currentTitle", null)
        
        inline def setPreviousIndex(value: Double): Self = StObject.set(x, "previousIndex", value.asInstanceOf[js.Any])
        
        inline def setPreviousTitle(value: Title[T]): Self = StObject.set(x, "previousTitle", value.asInstanceOf[js.Any])
        
        inline def setPreviousTitleNull: Self = StObject.set(x, "previousTitle", null)
      }
    }
    
    /**
      * An options object for creating a tab bar.
      */
    trait IOptions[T] extends StObject {
      
      /**
        * Whether a tab can be deselected by the user.
        *
        * The default is `false`.
        */
      var allowDeselect: js.UndefOr[Boolean] = js.undefined
      
      /**
        * The selection behavior when inserting a tab.
        *
        * The default is `'select-tab-if-needed'`.
        */
      var insertBehavior: js.UndefOr[InsertBehavior] = js.undefined
      
      /**
        * The layout orientation of the tab bar.
        *
        * The default is `horizontal`.
        */
      var orientation: js.UndefOr[Orientation] = js.undefined
      
      /**
        * The selection behavior when removing a tab.
        *
        * The default is `'select-tab-after'`.
        */
      var removeBehavior: js.UndefOr[RemoveBehavior] = js.undefined
      
      /**
        * A renderer to use with the tab bar.
        *
        * The default is a shared renderer instance.
        */
      var renderer: js.UndefOr[IRenderer[T]] = js.undefined
      
      /**
        * Whether the tabs are movable by the user.
        *
        * The default is `false`.
        */
      var tabsMovable: js.UndefOr[Boolean] = js.undefined
      
      /**
        * Whether the titles can be directly edited by the user.
        *
        * The default is `false`.
        */
      var titlesEditable: js.UndefOr[Boolean] = js.undefined
    }
    object IOptions {
      
      inline def apply[T](): IOptions[T] = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[IOptions[T]]
      }
      
      extension [Self <: IOptions[?], T](x: Self & IOptions[T]) {
        
        inline def setAllowDeselect(value: Boolean): Self = StObject.set(x, "allowDeselect", value.asInstanceOf[js.Any])
        
        inline def setAllowDeselectUndefined: Self = StObject.set(x, "allowDeselect", js.undefined)
        
        inline def setInsertBehavior(value: InsertBehavior): Self = StObject.set(x, "insertBehavior", value.asInstanceOf[js.Any])
        
        inline def setInsertBehaviorUndefined: Self = StObject.set(x, "insertBehavior", js.undefined)
        
        inline def setOrientation(value: Orientation): Self = StObject.set(x, "orientation", value.asInstanceOf[js.Any])
        
        inline def setOrientationUndefined: Self = StObject.set(x, "orientation", js.undefined)
        
        inline def setRemoveBehavior(value: RemoveBehavior): Self = StObject.set(x, "removeBehavior", value.asInstanceOf[js.Any])
        
        inline def setRemoveBehaviorUndefined: Self = StObject.set(x, "removeBehavior", js.undefined)
        
        inline def setRenderer(value: IRenderer[T]): Self = StObject.set(x, "renderer", value.asInstanceOf[js.Any])
        
        inline def setRendererUndefined: Self = StObject.set(x, "renderer", js.undefined)
        
        inline def setTabsMovable(value: Boolean): Self = StObject.set(x, "tabsMovable", value.asInstanceOf[js.Any])
        
        inline def setTabsMovableUndefined: Self = StObject.set(x, "tabsMovable", js.undefined)
        
        inline def setTitlesEditable(value: Boolean): Self = StObject.set(x, "titlesEditable", value.asInstanceOf[js.Any])
        
        inline def setTitlesEditableUndefined: Self = StObject.set(x, "titlesEditable", js.undefined)
      }
    }
    
    /**
      * An object which holds the data to render a tab.
      */
    trait IRenderData[T] extends StObject {
      
      /**
        * Whether the tab is the current tab.
        */
      val current: Boolean
      
      /**
        * The title associated with the tab.
        */
      val title: Title[T]
      
      /**
        * The z-index for the tab.
        */
      val zIndex: Double
    }
    object IRenderData {
      
      inline def apply[T](current: Boolean, title: Title[T], zIndex: Double): IRenderData[T] = {
        val __obj = js.Dynamic.literal(current = current.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any], zIndex = zIndex.asInstanceOf[js.Any])
        __obj.asInstanceOf[IRenderData[T]]
      }
      
      extension [Self <: IRenderData[?], T](x: Self & IRenderData[T]) {
        
        inline def setCurrent(value: Boolean): Self = StObject.set(x, "current", value.asInstanceOf[js.Any])
        
        inline def setTitle(value: Title[T]): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
        
        inline def setZIndex(value: Double): Self = StObject.set(x, "zIndex", value.asInstanceOf[js.Any])
      }
    }
    
    /**
      * A renderer for use with a tab bar.
      */
    trait IRenderer[T] extends StObject {
      
      /**
        * A selector which matches the close icon node in a tab.
        */
      val closeIconSelector: String
      
      /**
        * Render the virtual element for a tab.
        *
        * @param data - The data to use for rendering the tab.
        *
        * @returns A virtual element representing the tab.
        */
      def renderTab(data: IRenderData[T]): VirtualElement
    }
    object IRenderer {
      
      inline def apply[T](closeIconSelector: String, renderTab: IRenderData[T] => VirtualElement): IRenderer[T] = {
        val __obj = js.Dynamic.literal(closeIconSelector = closeIconSelector.asInstanceOf[js.Any], renderTab = js.Any.fromFunction1(renderTab))
        __obj.asInstanceOf[IRenderer[T]]
      }
      
      extension [Self <: IRenderer[?], T](x: Self & IRenderer[T]) {
        
        inline def setCloseIconSelector(value: String): Self = StObject.set(x, "closeIconSelector", value.asInstanceOf[js.Any])
        
        inline def setRenderTab(value: IRenderData[T] => VirtualElement): Self = StObject.set(x, "renderTab", js.Any.fromFunction1(value))
      }
    }
    
    /**
      * The arguments object for the `tabActivateRequested` signal.
      */
    trait ITabActivateRequestedArgs[T] extends StObject {
      
      /**
        * The index of the tab to activate.
        */
      val index: Double
      
      /**
        * The title for the tab.
        */
      val title: Title[T]
    }
    object ITabActivateRequestedArgs {
      
      inline def apply[T](index: Double, title: Title[T]): ITabActivateRequestedArgs[T] = {
        val __obj = js.Dynamic.literal(index = index.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
        __obj.asInstanceOf[ITabActivateRequestedArgs[T]]
      }
      
      extension [Self <: ITabActivateRequestedArgs[?], T](x: Self & ITabActivateRequestedArgs[T]) {
        
        inline def setIndex(value: Double): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
        
        inline def setTitle(value: Title[T]): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      }
    }
    
    /**
      * The arguments object for the `tabCloseRequested` signal.
      */
    trait ITabCloseRequestedArgs[T] extends StObject {
      
      /**
        * The index of the tab to close.
        */
      val index: Double
      
      /**
        * The title for the tab.
        */
      val title: Title[T]
    }
    object ITabCloseRequestedArgs {
      
      inline def apply[T](index: Double, title: Title[T]): ITabCloseRequestedArgs[T] = {
        val __obj = js.Dynamic.literal(index = index.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
        __obj.asInstanceOf[ITabCloseRequestedArgs[T]]
      }
      
      extension [Self <: ITabCloseRequestedArgs[?], T](x: Self & ITabCloseRequestedArgs[T]) {
        
        inline def setIndex(value: Double): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
        
        inline def setTitle(value: Title[T]): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      }
    }
    
    /**
      * The arguments object for the `tabDetachRequested` signal.
      */
    trait ITabDetachRequestedArgs[T] extends StObject {
      
      /**
        * The current client X position of the mouse.
        */
      val clientX: Double
      
      /**
        * The current client Y position of the mouse.
        */
      val clientY: Double
      
      /**
        * The index of the tab to detach.
        */
      val index: Double
      
      /**
        * The node representing the tab.
        */
      val tab: HTMLElement
      
      /**
        * The title for the tab.
        */
      val title: Title[T]
    }
    object ITabDetachRequestedArgs {
      
      inline def apply[T](clientX: Double, clientY: Double, index: Double, tab: HTMLElement, title: Title[T]): ITabDetachRequestedArgs[T] = {
        val __obj = js.Dynamic.literal(clientX = clientX.asInstanceOf[js.Any], clientY = clientY.asInstanceOf[js.Any], index = index.asInstanceOf[js.Any], tab = tab.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
        __obj.asInstanceOf[ITabDetachRequestedArgs[T]]
      }
      
      extension [Self <: ITabDetachRequestedArgs[?], T](x: Self & ITabDetachRequestedArgs[T]) {
        
        inline def setClientX(value: Double): Self = StObject.set(x, "clientX", value.asInstanceOf[js.Any])
        
        inline def setClientY(value: Double): Self = StObject.set(x, "clientY", value.asInstanceOf[js.Any])
        
        inline def setIndex(value: Double): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
        
        inline def setTab(value: HTMLElement): Self = StObject.set(x, "tab", value.asInstanceOf[js.Any])
        
        inline def setTitle(value: Title[T]): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      }
    }
    
    /**
      * The arguments object for the `tabMoved` signal.
      */
    trait ITabMovedArgs[T] extends StObject {
      
      /**
        * The previous index of the tab.
        */
      val fromIndex: Double
      
      /**
        * The title for the tab.
        */
      val title: Title[T]
      
      /**
        * The current index of the tab.
        */
      val toIndex: Double
    }
    object ITabMovedArgs {
      
      inline def apply[T](fromIndex: Double, title: Title[T], toIndex: Double): ITabMovedArgs[T] = {
        val __obj = js.Dynamic.literal(fromIndex = fromIndex.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any], toIndex = toIndex.asInstanceOf[js.Any])
        __obj.asInstanceOf[ITabMovedArgs[T]]
      }
      
      extension [Self <: ITabMovedArgs[?], T](x: Self & ITabMovedArgs[T]) {
        
        inline def setFromIndex(value: Double): Self = StObject.set(x, "fromIndex", value.asInstanceOf[js.Any])
        
        inline def setTitle(value: Title[T]): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
        
        inline def setToIndex(value: Double): Self = StObject.set(x, "toIndex", value.asInstanceOf[js.Any])
      }
    }
    
    /**
      * A type alias for the selection behavior on tab insert.
      */
    /* Rewritten from type alias, can be one of: 
      - typings.luminoWidgets.luminoWidgetsStrings.none
      - typings.luminoWidgets.luminoWidgetsStrings.`select-tab`
      - typings.luminoWidgets.luminoWidgetsStrings.`select-tab-if-needed`
    */
    trait InsertBehavior extends StObject
    object InsertBehavior {
      
      inline def none: typings.luminoWidgets.luminoWidgetsStrings.none = "none".asInstanceOf[typings.luminoWidgets.luminoWidgetsStrings.none]
      
      inline def `select-tab`: typings.luminoWidgets.luminoWidgetsStrings.`select-tab` = "select-tab".asInstanceOf[typings.luminoWidgets.luminoWidgetsStrings.`select-tab`]
      
      inline def `select-tab-if-needed`: typings.luminoWidgets.luminoWidgetsStrings.`select-tab-if-needed` = "select-tab-if-needed".asInstanceOf[typings.luminoWidgets.luminoWidgetsStrings.`select-tab-if-needed`]
    }
    
    /**
      * A type alias for a tab bar orientation.
      */
    /* Rewritten from type alias, can be one of: 
      - typings.luminoWidgets.luminoWidgetsStrings.horizontal
      - typings.luminoWidgets.luminoWidgetsStrings.vertical
    */
    trait Orientation extends StObject
    object Orientation {
      
      inline def horizontal: typings.luminoWidgets.luminoWidgetsStrings.horizontal = "horizontal".asInstanceOf[typings.luminoWidgets.luminoWidgetsStrings.horizontal]
      
      inline def vertical: typings.luminoWidgets.luminoWidgetsStrings.vertical = "vertical".asInstanceOf[typings.luminoWidgets.luminoWidgetsStrings.vertical]
    }
    
    /**
      * A type alias for the selection behavior on tab remove.
      */
    /* Rewritten from type alias, can be one of: 
      - typings.luminoWidgets.luminoWidgetsStrings.none
      - typings.luminoWidgets.luminoWidgetsStrings.`select-tab-after`
      - typings.luminoWidgets.luminoWidgetsStrings.`select-tab-before`
      - typings.luminoWidgets.luminoWidgetsStrings.`select-previous-tab`
    */
    trait RemoveBehavior extends StObject
    object RemoveBehavior {
      
      inline def none: typings.luminoWidgets.luminoWidgetsStrings.none = "none".asInstanceOf[typings.luminoWidgets.luminoWidgetsStrings.none]
      
      inline def `select-previous-tab`: typings.luminoWidgets.luminoWidgetsStrings.`select-previous-tab` = "select-previous-tab".asInstanceOf[typings.luminoWidgets.luminoWidgetsStrings.`select-previous-tab`]
      
      inline def `select-tab-after`: typings.luminoWidgets.luminoWidgetsStrings.`select-tab-after` = "select-tab-after".asInstanceOf[typings.luminoWidgets.luminoWidgetsStrings.`select-tab-after`]
      
      inline def `select-tab-before`: typings.luminoWidgets.luminoWidgetsStrings.`select-tab-before` = "select-tab-before".asInstanceOf[typings.luminoWidgets.luminoWidgetsStrings.`select-tab-before`]
    }
  }
}
