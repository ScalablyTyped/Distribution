package typings.luminoWidgets

import typings.luminoCommands.mod.CommandRegistry
import typings.luminoDisposable.mod.IDisposable
import typings.luminoWidgets.typesContextmenuMod.ContextMenu.IItemOptions
import typings.luminoWidgets.typesContextmenuMod.ContextMenu.IOptions
import typings.luminoWidgets.typesMenuMod.Menu
import typings.luminoWidgets.typesMenuMod.Menu.IRenderer
import typings.std.MouseEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesContextmenuMod {
  
  @JSImport("@lumino/widgets/types/contextmenu", "ContextMenu")
  @js.native
  open class ContextMenu protected () extends StObject {
    /**
      * Construct a new context menu.
      *
      * @param options - The options for initializing the menu.
      */
    def this(options: IOptions) = this()
    
    /* private */ var _groupByTarget: Any = js.native
    
    /* private */ var _idTick: Any = js.native
    
    /* private */ var _items: Any = js.native
    
    /* private */ var _sortBySelector: Any = js.native
    
    /**
      * Add an item to the context menu.
      *
      * @param options - The options for creating the item.
      *
      * @returns A disposable which will remove the item from the menu.
      */
    def addItem(options: IItemOptions): IDisposable = js.native
    
    /**
      * The menu widget which displays the matched context items.
      */
    val menu: Menu = js.native
    
    /**
      * Open the context menu in response to a `'contextmenu'` event.
      *
      * @param event - The `'contextmenu'` event of interest.
      *
      * @returns `true` if the menu was opened, or `false` if no items
      *   matched the event and the menu was not opened.
      *
      * #### Notes
      * This method will populate the context menu with items which match
      * the propagation path of the event, then open the menu at the mouse
      * position indicated by the event.
      */
    def open(event: MouseEvent): Boolean = js.native
  }
  object ContextMenu {
    
    /**
      * An options object for creating a context menu item.
      */
    trait IItemOptions
      extends StObject
         with typings.luminoWidgets.typesMenuMod.Menu.IItemOptions {
      
      /**
        * The rank for the item.
        *
        * The rank is used as a tie-breaker when ordering context menu
        * items for display. Items are sorted in the following order:
        *   1. Depth in the DOM tree (deeper is better)
        *   2. Selector specificity (higher is better)
        *   3. Rank (lower is better)
        *   4. Insertion order
        *
        * The default rank is `Infinity`.
        */
      var rank: js.UndefOr[Double] = js.undefined
      
      /**
        * The CSS selector for the context menu item.
        *
        * The context menu item will only be displayed in the context menu
        * when the selector matches a node on the propagation path of the
        * contextmenu event. This allows the menu item to be restricted to
        * user-defined contexts.
        *
        * The selector must not contain commas.
        */
      var selector: String
    }
    object IItemOptions {
      
      inline def apply(selector: String): IItemOptions = {
        val __obj = js.Dynamic.literal(selector = selector.asInstanceOf[js.Any])
        __obj.asInstanceOf[IItemOptions]
      }
      
      extension [Self <: IItemOptions](x: Self) {
        
        inline def setRank(value: Double): Self = StObject.set(x, "rank", value.asInstanceOf[js.Any])
        
        inline def setRankUndefined: Self = StObject.set(x, "rank", js.undefined)
        
        inline def setSelector(value: String): Self = StObject.set(x, "selector", value.asInstanceOf[js.Any])
      }
    }
    
    /**
      * An options object for initializing a context menu.
      */
    trait IOptions extends StObject {
      
      /**
        * The command registry to use with the context menu.
        */
      var commands: CommandRegistry
      
      /**
        * Whether to group items following the DOM hierarchy.
        *
        * Default true.
        *
        * #### Note
        * If true, when the mouse event occurs on element `span` within `div.top`,
        * the items matching `div.top` will be shown before the ones matching `body`.
        */
      var groupByTarget: js.UndefOr[Boolean] = js.undefined
      
      /**
        * A custom renderer for use with the context menu.
        */
      var renderer: js.UndefOr[IRenderer] = js.undefined
      
      /**
        * Whether to sort by selector and rank or only rank.
        *
        * Default true.
        */
      var sortBySelector: js.UndefOr[Boolean] = js.undefined
    }
    object IOptions {
      
      inline def apply(commands: CommandRegistry): IOptions = {
        val __obj = js.Dynamic.literal(commands = commands.asInstanceOf[js.Any])
        __obj.asInstanceOf[IOptions]
      }
      
      extension [Self <: IOptions](x: Self) {
        
        inline def setCommands(value: CommandRegistry): Self = StObject.set(x, "commands", value.asInstanceOf[js.Any])
        
        inline def setGroupByTarget(value: Boolean): Self = StObject.set(x, "groupByTarget", value.asInstanceOf[js.Any])
        
        inline def setGroupByTargetUndefined: Self = StObject.set(x, "groupByTarget", js.undefined)
        
        inline def setRenderer(value: IRenderer): Self = StObject.set(x, "renderer", value.asInstanceOf[js.Any])
        
        inline def setRendererUndefined: Self = StObject.set(x, "renderer", js.undefined)
        
        inline def setSortBySelector(value: Boolean): Self = StObject.set(x, "sortBySelector", value.asInstanceOf[js.Any])
        
        inline def setSortBySelectorUndefined: Self = StObject.set(x, "sortBySelector", js.undefined)
      }
    }
  }
}
