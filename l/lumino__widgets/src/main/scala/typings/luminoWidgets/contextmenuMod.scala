package typings.luminoWidgets

import typings.luminoCommands.mod.CommandRegistry
import typings.luminoDisposable.mod.IDisposable
import typings.luminoWidgets.contextmenuMod.ContextMenu.IItemOptions
import typings.luminoWidgets.contextmenuMod.ContextMenu.IOptions
import typings.luminoWidgets.menuMod.Menu
import typings.luminoWidgets.menuMod.Menu.IRenderer
import typings.std.MouseEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object contextmenuMod {
  
  @JSImport("@lumino/widgets/types/contextmenu", "ContextMenu")
  @js.native
  class ContextMenu protected () extends StObject {
    /**
      * Construct a new context menu.
      *
      * @param options - The options for initializing the menu.
      */
    def this(options: IOptions) = this()
    
    var _idTick: js.Any = js.native
    
    var _items: js.Any = js.native
    
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
    @js.native
    trait IItemOptions
      extends typings.luminoWidgets.menuMod.Menu.IItemOptions {
      
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
      var rank: js.UndefOr[Double] = js.native
      
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
      var selector: String = js.native
    }
    object IItemOptions {
      
      @scala.inline
      def apply(selector: String): IItemOptions = {
        val __obj = js.Dynamic.literal(selector = selector.asInstanceOf[js.Any])
        __obj.asInstanceOf[IItemOptions]
      }
      
      @scala.inline
      implicit class IItemOptionsMutableBuilder[Self <: IItemOptions] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setRank(value: Double): Self = StObject.set(x, "rank", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setRankUndefined: Self = StObject.set(x, "rank", js.undefined)
        
        @scala.inline
        def setSelector(value: String): Self = StObject.set(x, "selector", value.asInstanceOf[js.Any])
      }
    }
    
    /**
      * An options object for initializing a context menu.
      */
    @js.native
    trait IOptions extends StObject {
      
      /**
        * The command registry to use with the context menu.
        */
      var commands: CommandRegistry = js.native
      
      /**
        * A custom renderer for use with the context menu.
        */
      var renderer: js.UndefOr[IRenderer] = js.native
    }
    object IOptions {
      
      @scala.inline
      def apply(commands: CommandRegistry): IOptions = {
        val __obj = js.Dynamic.literal(commands = commands.asInstanceOf[js.Any])
        __obj.asInstanceOf[IOptions]
      }
      
      @scala.inline
      implicit class IOptionsMutableBuilder[Self <: IOptions] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setCommands(value: CommandRegistry): Self = StObject.set(x, "commands", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setRenderer(value: IRenderer): Self = StObject.set(x, "renderer", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setRendererUndefined: Self = StObject.set(x, "renderer", js.undefined)
      }
    }
  }
}
