package typings.luminoWidgets

import typings.luminoVirtualdom.mod.ElementDataset
import typings.luminoVirtualdom.mod.VirtualElement
import typings.luminoVirtualdom.mod.h.Child
import typings.luminoWidgets.menuMod.Menu
import typings.luminoWidgets.menubarMod.MenuBar.IOptions
import typings.luminoWidgets.menubarMod.MenuBar.IRenderer
import typings.luminoWidgets.titleMod.Title
import typings.luminoWidgets.widgetMod.Widget
import typings.std.Event
import typings.std.HTMLUListElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object menubarMod {
  
  @JSImport("@lumino/widgets/types/menubar", "MenuBar")
  @js.native
  /**
    * Construct a new menu bar.
    *
    * @param options - The options for initializing the menu bar.
    */
  class MenuBar () extends Widget {
    def this(options: IOptions) = this()
    
    var _activeIndex: js.Any = js.native
    
    var _childMenu: js.Any = js.native
    
    /**
      * Close the child menu immediately.
      *
      * This is a no-op if a child menu is not open.
      */
    var _closeChildMenu: js.Any = js.native
    
    /**
      * Handle the `'keydown'` event for the menu bar.
      */
    var _evtKeyDown: js.Any = js.native
    
    /**
      * Handle the `'mousedown'` event for the menu bar.
      */
    var _evtMouseDown: js.Any = js.native
    
    /**
      * Handle the `'mouseleave'` event for the menu bar.
      */
    var _evtMouseLeave: js.Any = js.native
    
    /**
      * Handle the `'mousemove'` event for the menu bar.
      */
    var _evtMouseMove: js.Any = js.native
    
    var _menus: js.Any = js.native
    
    /**
      * Handle the `aboutToClose` signal of a menu.
      */
    var _onMenuAboutToClose: js.Any = js.native
    
    /**
      * Handle the `menuRequested` signal of a child menu.
      */
    var _onMenuMenuRequested: js.Any = js.native
    
    /**
      * Handle the `changed` signal of a title object.
      */
    var _onTitleChanged: js.Any = js.native
    
    /**
      * Open the child menu at the active index immediately.
      *
      * If a different child menu is already open, it will be closed,
      * even if there is no active menu.
      */
    var _openChildMenu: js.Any = js.native
    
    /**
      * Get the index of the currently active menu.
      *
      * #### Notes
      * This will be `-1` if no menu is active.
      */
    /**
      * Set the index of the currently active menu.
      *
      * #### Notes
      * If the menu cannot be activated, the index will be set to `-1`.
      */
    var activeIndex: Double = js.native
    
    /**
      * Get the currently active menu.
      */
    /**
      * Set the currently active menu.
      *
      * #### Notes
      * If the menu does not exist, the menu will be set to `null`.
      */
    var activeMenu: Menu | Null = js.native
    
    /**
      * Add a menu to the end of the menu bar.
      *
      * @param menu - The menu to add to the menu bar.
      *
      * #### Notes
      * If the menu is already added to the menu bar, it will be moved.
      */
    def addMenu(menu: Menu): Unit = js.native
    
    /**
      * The child menu of the menu bar.
      *
      * #### Notes
      * This will be `null` if the menu bar does not have an open menu.
      */
    val childMenu: Menu | Null = js.native
    
    /**
      * Remove all menus from the menu bar.
      */
    def clearMenus(): Unit = js.native
    
    /**
      * Get the menu bar content node.
      *
      * #### Notes
      * This is the node which holds the menu title nodes.
      *
      * Modifying this node directly can lead to undefined behavior.
      */
    val contentNode: HTMLUListElement = js.native
    
    /**
      * Handle the DOM events for the menu bar.
      *
      * @param event - The DOM event sent to the menu bar.
      *
      * #### Notes
      * This method implements the DOM `EventListener` interface and is
      * called in response to events on the menu bar's DOM nodes. It
      * should not be called directly by user code.
      */
    def handleEvent(event: Event): Unit = js.native
    
    /**
      * Insert a menu into the menu bar at the specified index.
      *
      * @param index - The index at which to insert the menu.
      *
      * @param menu - The menu to insert into the menu bar.
      *
      * #### Notes
      * The index will be clamped to the bounds of the menus.
      *
      * If the menu is already added to the menu bar, it will be moved.
      */
    def insertMenu(index: Double, menu: Menu): Unit = js.native
    
    /**
      * A read-only array of the menus in the menu bar.
      */
    val menus: js.Array[Menu] = js.native
    
    /**
      * Open the active menu and activate its first menu item.
      *
      * #### Notes
      * If there is no active menu, this is a no-op.
      */
    def openActiveMenu(): Unit = js.native
    
    /**
      * Remove a menu from the menu bar.
      *
      * @param menu - The menu to remove from the menu bar.
      *
      * #### Notes
      * This is a no-op if the menu is not in the menu bar.
      */
    def removeMenu(menu: Menu): Unit = js.native
    
    /**
      * Remove the menu at a given index from the menu bar.
      *
      * @param index - The index of the menu to remove.
      *
      * #### Notes
      * This is a no-op if the index is out of range.
      */
    def removeMenuAt(index: Double): Unit = js.native
    
    /**
      * The renderer used by the menu bar.
      */
    val renderer: IRenderer = js.native
  }
  object MenuBar {
    
    /**
      * The default implementation of `IRenderer`.
      *
      * #### Notes
      * Subclasses are free to reimplement rendering methods as needed.
      */
    @JSImport("@lumino/widgets/types/menubar", "MenuBar.Renderer")
    @js.native
    /**
      * Construct a new renderer.
      */
    class Renderer () extends IRenderer {
      
      /**
        * Create the class name for the menu bar item icon.
        *
        * @param data - The data to use for the class name.
        *
        * @returns The full class name for the item icon.
        */
      def createIconClass(data: IRenderData): String = js.native
      
      /**
        * Create the class name for the menu bar item.
        *
        * @param data - The data to use for the class name.
        *
        * @returns The full class name for the menu item.
        */
      def createItemClass(data: IRenderData): String = js.native
      
      /**
        * Create the dataset for a menu bar item.
        *
        * @param data - The data to use for the item.
        *
        * @returns The dataset for the menu bar item.
        */
      def createItemDataset(data: IRenderData): ElementDataset = js.native
      
      /**
        * Create the render content for the label node.
        *
        * @param data - The data to use for the label content.
        *
        * @returns The content to add to the label node.
        */
      def formatLabel(data: IRenderData): Child = js.native
      
      /**
        * Render the icon element for a menu bar item.
        *
        * @param data - The data to use for rendering the icon.
        *
        * @returns A virtual element representing the item icon.
        */
      def renderIcon(data: IRenderData): VirtualElement = js.native
      
      /**
        * Render the label element for a menu item.
        *
        * @param data - The data to use for rendering the label.
        *
        * @returns A virtual element representing the item label.
        */
      def renderLabel(data: IRenderData): VirtualElement = js.native
    }
    
    /**
      * The default `Renderer` instance.
      */
    @JSImport("@lumino/widgets/types/menubar", "MenuBar.defaultRenderer")
    @js.native
    val defaultRenderer: Renderer = js.native
    
    /**
      * An options object for creating a menu bar.
      */
    @js.native
    trait IOptions extends StObject {
      
      /**
        * A custom renderer for creating menu bar content.
        *
        * The default is a shared renderer instance.
        */
      var renderer: js.UndefOr[IRenderer] = js.native
    }
    object IOptions {
      
      @scala.inline
      def apply(): IOptions = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[IOptions]
      }
      
      @scala.inline
      implicit class IOptionsMutableBuilder[Self <: IOptions] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setRenderer(value: IRenderer): Self = StObject.set(x, "renderer", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setRendererUndefined: Self = StObject.set(x, "renderer", js.undefined)
      }
    }
    
    /**
      * An object which holds the data to render a menu bar item.
      */
    @js.native
    trait IRenderData extends StObject {
      
      /**
        * Whether the item is the active item.
        */
      val active: Boolean = js.native
      
      /**
        * The title to be rendered.
        */
      val title: Title[Widget] = js.native
    }
    object IRenderData {
      
      @scala.inline
      def apply(active: Boolean, title: Title[Widget]): IRenderData = {
        val __obj = js.Dynamic.literal(active = active.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
        __obj.asInstanceOf[IRenderData]
      }
      
      @scala.inline
      implicit class IRenderDataMutableBuilder[Self <: IRenderData] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setActive(value: Boolean): Self = StObject.set(x, "active", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setTitle(value: Title[Widget]): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      }
    }
    
    /**
      * A renderer for use with a menu bar.
      */
    @js.native
    trait IRenderer extends StObject {
      
      /**
        * Render the virtual element for a menu bar item.
        *
        * @param data - The data to use for rendering the item.
        *
        * @returns A virtual element representing the item.
        */
      def renderItem(data: IRenderData): VirtualElement = js.native
    }
    object IRenderer {
      
      @scala.inline
      def apply(renderItem: IRenderData => VirtualElement): IRenderer = {
        val __obj = js.Dynamic.literal(renderItem = js.Any.fromFunction1(renderItem))
        __obj.asInstanceOf[IRenderer]
      }
      
      @scala.inline
      implicit class IRendererMutableBuilder[Self <: IRenderer] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setRenderItem(value: IRenderData => VirtualElement): Self = StObject.set(x, "renderItem", js.Any.fromFunction1(value))
      }
    }
  }
}
