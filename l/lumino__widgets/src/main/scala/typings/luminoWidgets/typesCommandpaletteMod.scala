package typings.luminoWidgets

import typings.luminoCommands.mod.CommandRegistry
import typings.luminoCommands.mod.CommandRegistry.Dataset
import typings.luminoCommands.mod.CommandRegistry.IKeyBinding
import typings.luminoCoreutils.typesJsonMod.ReadonlyJSONObject
import typings.luminoVirtualdom.mod.ElementDataset
import typings.luminoVirtualdom.mod.VirtualElement
import typings.luminoVirtualdom.mod.h.Child
import typings.luminoWidgets.typesCommandpaletteMod.CommandPalette.IItem
import typings.luminoWidgets.typesCommandpaletteMod.CommandPalette.IItemOptions
import typings.luminoWidgets.typesCommandpaletteMod.CommandPalette.IOptions
import typings.luminoWidgets.typesCommandpaletteMod.CommandPalette.IRenderer
import typings.luminoWidgets.typesWidgetMod.Widget
import typings.std.Event
import typings.std.HTMLDivElement
import typings.std.HTMLInputElement
import typings.std.HTMLUListElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesCommandpaletteMod {
  
  @JSImport("@lumino/widgets/types/commandpalette", "CommandPalette")
  @js.native
  open class CommandPalette protected () extends Widget {
    /**
      * Construct a new command palette.
      *
      * @param options - The options for initializing the palette.
      */
    def this(options: IOptions) = this()
    
    /**
      * Activate the next enabled command item.
      */
    /* private */ var _activateNextItem: Any = js.native
    
    /**
      * Activate the previous enabled command item.
      */
    /* private */ var _activatePreviousItem: Any = js.native
    
    /* private */ var _activeIndex: Any = js.native
    
    /**
      * Handle the `'click'` event for the command palette.
      */
    /* private */ var _evtClick: Any = js.native
    
    /**
      * Handle the `'keydown'` event for the command palette.
      */
    /* private */ var _evtKeyDown: Any = js.native
    
    /**
      * Execute the command item at the given index, if possible.
      */
    /* private */ var _execute: Any = js.native
    
    /* private */ var _items: Any = js.native
    
    /**
      * A signal handler for generic command changes.
      */
    /* private */ var _onGenericChange: Any = js.native
    
    /* private */ var _results: Any = js.native
    
    /**
      * Toggle the focused modifier based on the input node focus state.
      */
    /* private */ var _toggleFocused: Any = js.native
    
    /**
      * Add a command item to the command palette.
      *
      * @param options - The options for creating the command item.
      *
      * @returns The command item added to the palette.
      */
    def addItem(options: IItemOptions): IItem = js.native
    
    /**
      * Adds command items to the command palette.
      *
      * @param items - An array of options for creating each command item.
      *
      * @returns The command items added to the palette.
      */
    def addItems(items: js.Array[IItemOptions]): js.Array[IItem] = js.native
    
    /**
      * Remove all items from the command palette.
      */
    def clearItems(): Unit = js.native
    
    /**
      * The command registry used by the command palette.
      */
    val commands: CommandRegistry = js.native
    
    /**
      * The command palette content node.
      *
      * #### Notes
      * This is the node which holds the command item nodes.
      *
      * Modifying this node directly can lead to undefined behavior.
      */
    def contentNode: HTMLUListElement = js.native
    
    /**
      * Handle the DOM events for the command palette.
      *
      * @param event - The DOM event sent to the command palette.
      *
      * #### Notes
      * This method implements the DOM `EventListener` interface and is
      * called in response to events on the command palette's DOM node.
      * It should not be called directly by user code.
      */
    def handleEvent(event: Event): Unit = js.native
    
    /**
      * The command palette input node.
      *
      * #### Notes
      * This is the actual input node for the search area.
      */
    def inputNode: HTMLInputElement = js.native
    
    /**
      * A read-only array of the command items in the palette.
      */
    def items: js.Array[IItem] = js.native
    
    /**
      * Clear the search results and schedule an update.
      *
      * #### Notes
      * This should be called whenever the search results of the palette
      * should be updated.
      *
      * This is typically called automatically by the palette as needed,
      * but can be called manually if the input text is programatically
      * changed.
      *
      * The rendered results are updated asynchronously.
      */
    def refresh(): Unit = js.native
    
    /**
      * Remove an item from the command palette.
      *
      * @param item - The item to remove from the palette.
      *
      * #### Notes
      * This is a no-op if the item is not in the palette.
      */
    def removeItem(item: IItem): Unit = js.native
    
    /**
      * Remove the item at a given index from the command palette.
      *
      * @param index - The index of the item to remove.
      *
      * #### Notes
      * This is a no-op if the index is out of range.
      */
    def removeItemAt(index: Double): Unit = js.native
    
    /**
      * The renderer used by the command palette.
      */
    val renderer: IRenderer = js.native
    
    /**
      * The command palette search node.
      *
      * #### Notes
      * This is the node which contains the search-related elements.
      */
    def searchNode: HTMLDivElement = js.native
  }
  object CommandPalette {
    
    /**
      * The default implementation of `IRenderer`.
      */
    @JSImport("@lumino/widgets/types/commandpalette", "CommandPalette.Renderer")
    @js.native
    open class Renderer ()
      extends StObject
         with IRenderer {
      
      /**
        * Create the class name for the command item icon.
        *
        * @param data - The data to use for the class name.
        *
        * @returns The full class name for the item icon.
        */
      def createIconClass(data: IItemRenderData): String = js.native
      
      /**
        * Create the class name for the command palette item.
        *
        * @param data - The data to use for the class name.
        *
        * @returns The full class name for the command palette item.
        */
      def createItemClass(data: IItemRenderData): String = js.native
      
      /**
        * Create the dataset for the command palette item.
        *
        * @param data - The data to use for creating the dataset.
        *
        * @returns The dataset for the command palette item.
        */
      def createItemDataset(data: IItemRenderData): ElementDataset = js.native
      
      /**
        * Create the render content for the empty message node.
        *
        * @param data - The data to use for the empty message content.
        *
        * @returns The content to add to the empty message node.
        */
      def formatEmptyMessage(data: IEmptyMessageRenderData): Child = js.native
      
      /**
        * Create the render content for the header node.
        *
        * @param data - The data to use for the header content.
        *
        * @returns The content to add to the header node.
        */
      def formatHeader(data: IHeaderRenderData): Child = js.native
      
      /**
        * Create the render content for the item caption node.
        *
        * @param data - The data to use for the caption content.
        *
        * @returns The content to add to the caption node.
        */
      def formatItemCaption(data: IItemRenderData): Child = js.native
      
      /**
        * Create the render content for the item label node.
        *
        * @param data - The data to use for the label content.
        *
        * @returns The content to add to the label node.
        */
      def formatItemLabel(data: IItemRenderData): Child = js.native
      
      /**
        * Create the render content for the item shortcut node.
        *
        * @param data - The data to use for the shortcut content.
        *
        * @returns The content to add to the shortcut node.
        */
      def formatItemShortcut(data: IItemRenderData): Child = js.native
      
      /**
        * Render the empty results message for a command palette.
        *
        * @param data - The data to use for rendering the message.
        *
        * @returns A virtual element representing the message.
        */
      /* CompleteClass */
      override def renderEmptyMessage(data: IEmptyMessageRenderData): VirtualElement = js.native
      
      /**
        * Render the virtual element for a command palette header.
        *
        * @param data - The data to use for rendering the header.
        *
        * @returns A virtual element representing the header.
        */
      /* CompleteClass */
      override def renderHeader(data: IHeaderRenderData): VirtualElement = js.native
      
      /**
        * Render the virtual element for a command palette item.
        *
        * @param data - The data to use for rendering the item.
        *
        * @returns A virtual element representing the item.
        *
        * #### Notes
        * The command palette will not render invisible items.
        */
      /* CompleteClass */
      override def renderItem(data: IItemRenderData): VirtualElement = js.native
      
      /**
        * Render the caption for a command palette item.
        *
        * @param data - The data to use for rendering the caption.
        *
        * @returns A virtual element representing the caption.
        */
      def renderItemCaption(data: IItemRenderData): VirtualElement = js.native
      
      /**
        * Render the content for a command palette item.
        *
        * @param data - The data to use for rendering the content.
        *
        * @returns A virtual element representing the content.
        */
      def renderItemContent(data: IItemRenderData): VirtualElement = js.native
      
      /**
        * Render the icon for a command palette item.
        *
        * @param data - The data to use for rendering the icon.
        *
        * @returns A virtual element representing the icon.
        */
      def renderItemIcon(data: IItemRenderData): VirtualElement = js.native
      
      /**
        * Render the label for a command palette item.
        *
        * @param data - The data to use for rendering the label.
        *
        * @returns A virtual element representing the label.
        */
      def renderItemLabel(data: IItemRenderData): VirtualElement = js.native
      
      /**
        * Render the shortcut for a command palette item.
        *
        * @param data - The data to use for rendering the shortcut.
        *
        * @returns A virtual element representing the shortcut.
        */
      def renderItemShortcut(data: IItemRenderData): VirtualElement = js.native
    }
    
    /**
      * The default `Renderer` instance.
      */
    @JSImport("@lumino/widgets/types/commandpalette", "CommandPalette.defaultRenderer")
    @js.native
    val defaultRenderer: Renderer = js.native
    
    /**
      * The render data for a command palette empty message.
      */
    trait IEmptyMessageRenderData extends StObject {
      
      /**
        * The query which failed to match any commands.
        */
      var query: String
    }
    object IEmptyMessageRenderData {
      
      inline def apply(query: String): IEmptyMessageRenderData = {
        val __obj = js.Dynamic.literal(query = query.asInstanceOf[js.Any])
        __obj.asInstanceOf[IEmptyMessageRenderData]
      }
      
      @scala.inline
      implicit open class MutableBuilder[Self <: IEmptyMessageRenderData] (val x: Self) extends AnyVal {
        
        inline def setQuery(value: String): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
      }
    }
    
    /**
      * The render data for a command palette header.
      */
    trait IHeaderRenderData extends StObject {
      
      /**
        * The category of the header.
        */
      val category: String
      
      /**
        * The indices of the matched characters in the category.
        */
      val indices: js.Array[Double] | Null
    }
    object IHeaderRenderData {
      
      inline def apply(category: String): IHeaderRenderData = {
        val __obj = js.Dynamic.literal(category = category.asInstanceOf[js.Any], indices = null)
        __obj.asInstanceOf[IHeaderRenderData]
      }
      
      @scala.inline
      implicit open class MutableBuilder[Self <: IHeaderRenderData] (val x: Self) extends AnyVal {
        
        inline def setCategory(value: String): Self = StObject.set(x, "category", value.asInstanceOf[js.Any])
        
        inline def setIndices(value: js.Array[Double]): Self = StObject.set(x, "indices", value.asInstanceOf[js.Any])
        
        inline def setIndicesNull: Self = StObject.set(x, "indices", null)
        
        inline def setIndicesVarargs(value: Double*): Self = StObject.set(x, "indices", js.Array(value*))
      }
    }
    
    /**
      * An object which represents an item in a command palette.
      *
      * #### Notes
      * Item objects are created automatically by a command palette.
      */
    trait IItem extends StObject {
      
      /**
        * The arguments for the command.
        */
      val args: ReadonlyJSONObject
      
      /**
        * The display caption for the command item.
        */
      val caption: String
      
      /**
        * The category for the command item.
        */
      val category: String
      
      /**
        * The extra class name for the command item.
        */
      val className: String
      
      /**
        * The command to execute when the item is triggered.
        */
      val command: String
      
      /**
        * The dataset for the command item.
        */
      val dataset: Dataset
      
      /**
        * The icon renderer for the command item.
        */
      val icon: js.UndefOr[typings.luminoVirtualdom.mod.VirtualElement.IRenderer] = js.undefined
      
      /**
        * The icon class for the command item.
        */
      val iconClass: String
      
      /**
        * The icon label for the command item.
        */
      val iconLabel: String
      
      /**
        * Whether the command item is enabled.
        */
      val isEnabled: Boolean
      
      /**
        * Whether the command item is toggleable.
        */
      val isToggleable: Boolean
      
      /**
        * Whether the command item is toggled.
        */
      val isToggled: Boolean
      
      /**
        * Whether the command item is visible.
        */
      val isVisible: Boolean
      
      /**
        * The key binding for the command item.
        */
      val keyBinding: IKeyBinding | Null
      
      /**
        * The display label for the command item.
        */
      val label: String
      
      /**
        * The rank for the command item.
        */
      val rank: Double
    }
    object IItem {
      
      inline def apply(
        args: ReadonlyJSONObject,
        caption: String,
        category: String,
        className: String,
        command: String,
        dataset: Dataset,
        iconClass: String,
        iconLabel: String,
        isEnabled: Boolean,
        isToggleable: Boolean,
        isToggled: Boolean,
        isVisible: Boolean,
        label: String,
        rank: Double
      ): IItem = {
        val __obj = js.Dynamic.literal(args = args.asInstanceOf[js.Any], caption = caption.asInstanceOf[js.Any], category = category.asInstanceOf[js.Any], className = className.asInstanceOf[js.Any], command = command.asInstanceOf[js.Any], dataset = dataset.asInstanceOf[js.Any], iconClass = iconClass.asInstanceOf[js.Any], iconLabel = iconLabel.asInstanceOf[js.Any], isEnabled = isEnabled.asInstanceOf[js.Any], isToggleable = isToggleable.asInstanceOf[js.Any], isToggled = isToggled.asInstanceOf[js.Any], isVisible = isVisible.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any], rank = rank.asInstanceOf[js.Any], keyBinding = null)
        __obj.asInstanceOf[IItem]
      }
      
      @scala.inline
      implicit open class MutableBuilder[Self <: IItem] (val x: Self) extends AnyVal {
        
        inline def setArgs(value: ReadonlyJSONObject): Self = StObject.set(x, "args", value.asInstanceOf[js.Any])
        
        inline def setCaption(value: String): Self = StObject.set(x, "caption", value.asInstanceOf[js.Any])
        
        inline def setCategory(value: String): Self = StObject.set(x, "category", value.asInstanceOf[js.Any])
        
        inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
        
        inline def setCommand(value: String): Self = StObject.set(x, "command", value.asInstanceOf[js.Any])
        
        inline def setDataset(value: Dataset): Self = StObject.set(x, "dataset", value.asInstanceOf[js.Any])
        
        inline def setIcon(value: typings.luminoVirtualdom.mod.VirtualElement.IRenderer): Self = StObject.set(x, "icon", value.asInstanceOf[js.Any])
        
        inline def setIconClass(value: String): Self = StObject.set(x, "iconClass", value.asInstanceOf[js.Any])
        
        inline def setIconLabel(value: String): Self = StObject.set(x, "iconLabel", value.asInstanceOf[js.Any])
        
        inline def setIconUndefined: Self = StObject.set(x, "icon", js.undefined)
        
        inline def setIsEnabled(value: Boolean): Self = StObject.set(x, "isEnabled", value.asInstanceOf[js.Any])
        
        inline def setIsToggleable(value: Boolean): Self = StObject.set(x, "isToggleable", value.asInstanceOf[js.Any])
        
        inline def setIsToggled(value: Boolean): Self = StObject.set(x, "isToggled", value.asInstanceOf[js.Any])
        
        inline def setIsVisible(value: Boolean): Self = StObject.set(x, "isVisible", value.asInstanceOf[js.Any])
        
        inline def setKeyBinding(value: IKeyBinding): Self = StObject.set(x, "keyBinding", value.asInstanceOf[js.Any])
        
        inline def setKeyBindingNull: Self = StObject.set(x, "keyBinding", null)
        
        inline def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
        
        inline def setRank(value: Double): Self = StObject.set(x, "rank", value.asInstanceOf[js.Any])
      }
    }
    
    /**
      * An options object for creating a command item.
      */
    trait IItemOptions extends StObject {
      
      /**
        * The arguments for the command.
        *
        * The default value is an empty object.
        */
      var args: js.UndefOr[ReadonlyJSONObject] = js.undefined
      
      /**
        * The category for the item.
        */
      var category: String
      
      /**
        * The command to execute when the item is triggered.
        */
      var command: String
      
      /**
        * The rank for the command item.
        *
        * The rank is used as a tie-breaker when ordering command items
        * for display. Items are sorted in the following order:
        *   1. Text match (lower is better)
        *   2. Category (locale order)
        *   3. Rank (lower is better)
        *   4. Label (locale order)
        *
        * The default rank is `Infinity`.
        */
      var rank: js.UndefOr[Double] = js.undefined
    }
    object IItemOptions {
      
      inline def apply(category: String, command: String): IItemOptions = {
        val __obj = js.Dynamic.literal(category = category.asInstanceOf[js.Any], command = command.asInstanceOf[js.Any])
        __obj.asInstanceOf[IItemOptions]
      }
      
      @scala.inline
      implicit open class MutableBuilder[Self <: IItemOptions] (val x: Self) extends AnyVal {
        
        inline def setArgs(value: ReadonlyJSONObject): Self = StObject.set(x, "args", value.asInstanceOf[js.Any])
        
        inline def setArgsUndefined: Self = StObject.set(x, "args", js.undefined)
        
        inline def setCategory(value: String): Self = StObject.set(x, "category", value.asInstanceOf[js.Any])
        
        inline def setCommand(value: String): Self = StObject.set(x, "command", value.asInstanceOf[js.Any])
        
        inline def setRank(value: Double): Self = StObject.set(x, "rank", value.asInstanceOf[js.Any])
        
        inline def setRankUndefined: Self = StObject.set(x, "rank", js.undefined)
      }
    }
    
    /**
      * The render data for a command palette item.
      */
    trait IItemRenderData extends StObject {
      
      /**
        * Whether the item is the active item.
        */
      val active: Boolean
      
      /**
        * The indices of the matched characters in the label.
        */
      val indices: js.Array[Double] | Null
      
      /**
        * The command palette item to render.
        */
      val item: IItem
    }
    object IItemRenderData {
      
      inline def apply(active: Boolean, item: IItem): IItemRenderData = {
        val __obj = js.Dynamic.literal(active = active.asInstanceOf[js.Any], item = item.asInstanceOf[js.Any], indices = null)
        __obj.asInstanceOf[IItemRenderData]
      }
      
      @scala.inline
      implicit open class MutableBuilder[Self <: IItemRenderData] (val x: Self) extends AnyVal {
        
        inline def setActive(value: Boolean): Self = StObject.set(x, "active", value.asInstanceOf[js.Any])
        
        inline def setIndices(value: js.Array[Double]): Self = StObject.set(x, "indices", value.asInstanceOf[js.Any])
        
        inline def setIndicesNull: Self = StObject.set(x, "indices", null)
        
        inline def setIndicesVarargs(value: Double*): Self = StObject.set(x, "indices", js.Array(value*))
        
        inline def setItem(value: IItem): Self = StObject.set(x, "item", value.asInstanceOf[js.Any])
      }
    }
    
    /**
      * An options object for creating a command palette.
      */
    trait IOptions extends StObject {
      
      /**
        * The command registry for use with the command palette.
        */
      var commands: CommandRegistry
      
      /**
        * A custom renderer for use with the command palette.
        *
        * The default is a shared renderer instance.
        */
      var renderer: js.UndefOr[IRenderer] = js.undefined
    }
    object IOptions {
      
      inline def apply(commands: CommandRegistry): IOptions = {
        val __obj = js.Dynamic.literal(commands = commands.asInstanceOf[js.Any])
        __obj.asInstanceOf[IOptions]
      }
      
      @scala.inline
      implicit open class MutableBuilder[Self <: IOptions] (val x: Self) extends AnyVal {
        
        inline def setCommands(value: CommandRegistry): Self = StObject.set(x, "commands", value.asInstanceOf[js.Any])
        
        inline def setRenderer(value: IRenderer): Self = StObject.set(x, "renderer", value.asInstanceOf[js.Any])
        
        inline def setRendererUndefined: Self = StObject.set(x, "renderer", js.undefined)
      }
    }
    
    /**
      * A renderer for use with a command palette.
      */
    trait IRenderer extends StObject {
      
      /**
        * Render the empty results message for a command palette.
        *
        * @param data - The data to use for rendering the message.
        *
        * @returns A virtual element representing the message.
        */
      def renderEmptyMessage(data: IEmptyMessageRenderData): VirtualElement
      
      /**
        * Render the virtual element for a command palette header.
        *
        * @param data - The data to use for rendering the header.
        *
        * @returns A virtual element representing the header.
        */
      def renderHeader(data: IHeaderRenderData): VirtualElement
      
      /**
        * Render the virtual element for a command palette item.
        *
        * @param data - The data to use for rendering the item.
        *
        * @returns A virtual element representing the item.
        *
        * #### Notes
        * The command palette will not render invisible items.
        */
      def renderItem(data: IItemRenderData): VirtualElement
    }
    object IRenderer {
      
      inline def apply(
        renderEmptyMessage: IEmptyMessageRenderData => VirtualElement,
        renderHeader: IHeaderRenderData => VirtualElement,
        renderItem: IItemRenderData => VirtualElement
      ): IRenderer = {
        val __obj = js.Dynamic.literal(renderEmptyMessage = js.Any.fromFunction1(renderEmptyMessage), renderHeader = js.Any.fromFunction1(renderHeader), renderItem = js.Any.fromFunction1(renderItem))
        __obj.asInstanceOf[IRenderer]
      }
      
      @scala.inline
      implicit open class MutableBuilder[Self <: IRenderer] (val x: Self) extends AnyVal {
        
        inline def setRenderEmptyMessage(value: IEmptyMessageRenderData => VirtualElement): Self = StObject.set(x, "renderEmptyMessage", js.Any.fromFunction1(value))
        
        inline def setRenderHeader(value: IHeaderRenderData => VirtualElement): Self = StObject.set(x, "renderHeader", js.Any.fromFunction1(value))
        
        inline def setRenderItem(value: IItemRenderData => VirtualElement): Self = StObject.set(x, "renderItem", js.Any.fromFunction1(value))
      }
    }
  }
}
