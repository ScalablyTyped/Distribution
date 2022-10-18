package typings.jupyterlabUiComponents

import typings.jupyterlabUiComponents.libComponentsMenuMod.IRankedMenu.IOptions
import typings.luminoCommands.mod.CommandRegistry
import typings.luminoCommands.mod.CommandRegistry.Dataset
import typings.luminoCoreutils.typesJsonMod.ReadonlyJSONObject
import typings.luminoDisposable.mod.IDisposable
import typings.luminoWidgets.mod.Menu
import typings.luminoWidgets.typesMenuMod.Menu.IItem
import typings.luminoWidgets.typesMenuMod.Menu.IItemOptions
import typings.luminoWidgets.typesMenuMod.Menu.ItemType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libComponentsMenuMod {
  
  @js.native
  trait IRankedMenu
    extends StObject
       with IDisposable {
    
    /**
      * Add a group of menu items specific to a particular
      * plugin.
      *
      * The rank can be set for all items in the group using the
      * function argument or per item.
      *
      * @param items - the list of menu items to add.
      * @param rank - the default rank in the menu in which to insert the group.
      * @returns Disposable of the group
      */
    def addGroup(items: js.Array[IItemOptions]): IDisposable = js.native
    def addGroup(items: js.Array[IItemOptions], rank: Double): IDisposable = js.native
    
    /**
      * Add a menu item to the end of the menu.
      *
      * @param options - The options for creating the menu item.
      *
      * @returns The menu item added to the menu.
      *
      * @deprecated It will return a `IDisposable` object in v4
      */
    def addItem(options: typings.jupyterlabUiComponents.libComponentsMenuMod.IRankedMenu.IItemOptions): IItem = js.native
    
    /**
      * A read-only array of the menu items in the menu.
      */
    val items: js.Array[IItem] = js.native
    
    /**
      * The underlying Lumino menu.
      *
      * @deprecated will be removed in v4
      */
    val menu: Menu = js.native
    
    /**
      * Menu rank
      */
    val rank: js.UndefOr[Double] = js.native
  }
  object IRankedMenu {
    
    /**
      * Default menu item rank
      */
    @JSImport("@jupyterlab/ui-components/lib/components/menu", "IRankedMenu.DEFAULT_RANK")
    @js.native
    val DEFAULT_RANK: /* 100 */ Double = js.native
    
    /**
      * An options object for creating a menu item.
      */
    trait IItemOptions
      extends StObject
         with typings.luminoWidgets.typesMenuMod.Menu.IItemOptions {
      
      /**
        * Menu item rank
        */
      var rank: js.UndefOr[Double] = js.undefined
    }
    object IItemOptions {
      
      inline def apply(): typings.jupyterlabUiComponents.libComponentsMenuMod.IRankedMenu.IItemOptions = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[typings.jupyterlabUiComponents.libComponentsMenuMod.IRankedMenu.IItemOptions]
      }
      
      extension [Self <: typings.jupyterlabUiComponents.libComponentsMenuMod.IRankedMenu.IItemOptions](x: Self) {
        
        inline def setRank(value: Double): Self = StObject.set(x, "rank", value.asInstanceOf[js.Any])
        
        inline def setRankUndefined: Self = StObject.set(x, "rank", js.undefined)
      }
    }
    
    /**
      * An options object for creating a JupyterLab menu.
      */
    trait IOptions
      extends StObject
         with typings.luminoWidgets.typesMenuMod.Menu.IOptions {
      
      /**
        * Whether to include separators between the
        *   groups that are added to the menu.
        *
        * Default: true
        */
      var includeSeparators: js.UndefOr[Boolean] = js.undefined
      
      /**
        * Menu rank
        */
      var rank: js.UndefOr[Double] = js.undefined
    }
    object IOptions {
      
      inline def apply(commands: CommandRegistry): IOptions = {
        val __obj = js.Dynamic.literal(commands = commands.asInstanceOf[js.Any])
        __obj.asInstanceOf[IOptions]
      }
      
      extension [Self <: IOptions](x: Self) {
        
        inline def setIncludeSeparators(value: Boolean): Self = StObject.set(x, "includeSeparators", value.asInstanceOf[js.Any])
        
        inline def setIncludeSeparatorsUndefined: Self = StObject.set(x, "includeSeparators", js.undefined)
        
        inline def setRank(value: Double): Self = StObject.set(x, "rank", value.asInstanceOf[js.Any])
        
        inline def setRankUndefined: Self = StObject.set(x, "rank", js.undefined)
      }
    }
  }
  
  @JSImport("@jupyterlab/ui-components/lib/components/menu", "RankedMenu")
  @js.native
  open class RankedMenu protected ()
    extends Menu
       with IRankedMenu {
    /**
      * Construct a new menu.
      *
      * @param options - Options for the lumino menu.
      */
    def this(options: IOptions) = this()
    
    /* private */ var _includeSeparators: Any = js.native
    
    /* private */ var _rank: Any = js.native
    
    /* private */ var _ranks: Any = js.native
    
    /**
      * Dispose of the resources held by the object.
      *
      * #### Notes
      * If the object's `dispose` method is called more than once, all
      * calls made after the first will be a no-op.
      *
      * #### Undefined Behavior
      * It is undefined behavior to use any functionality of the object
      * after it has been disposed unless otherwise explicitly noted.
      */
    /* InferMemberOverrides */
    override def dispose(): Unit = js.native
    
    /**
      * Get the rank of the item at index.
      *
      * @param index Item index.
      * @returns Rank of the item.
      */
    def getRankAt(index: Double): Double = js.native
    
    /**
      * Insert a menu item into the menu at the specified index.
      *
      * @param index - The index at which to insert the item.
      *
      * @param options - The options for creating the menu item.
      *
      * @returns The menu item added to the menu.
      *
      * #### Notes
      * The index will be clamped to the bounds of the items.
      */
    def insertItem(
      index: Double,
      options: typings.jupyterlabUiComponents.libComponentsMenuMod.IRankedMenu.IItemOptions
    ): IDisposableMenuItem = js.native
    
    /**
      * Test whether the object has been disposed.
      *
      * #### Notes
      * This property is always safe to access.
      */
    /* InferMemberOverrides */
    override val isDisposed: Boolean = js.native
    
    /**
      * A read-only array of the menu items in the menu.
      */
    /* InferMemberOverrides */
    override val items: js.Array[IItem] = js.native
    
    /**
      * The underlying Lumino menu.
      *
      * @deprecated since v3.1
      * RankMenu inherits from Menu since v3.1
      */
    @JSName("menu")
    def menu_MRankedMenu: Menu = js.native
    
    /**
      * Menu rank.
      */
    @JSName("rank")
    def rank_MRankedMenu: js.UndefOr[Double] = js.native
  }
  
  trait IDisposableMenuItem
    extends StObject
       with IDisposable
       with IItem
  object IDisposableMenuItem {
    
    inline def apply(
      args: ReadonlyJSONObject,
      caption: String,
      className: String,
      command: String,
      dataset: Dataset,
      dispose: () => Unit,
      iconClass: String,
      iconLabel: String,
      isDisposed: Boolean,
      isEnabled: Boolean,
      isToggled: Boolean,
      isVisible: Boolean,
      label: String,
      mnemonic: Double,
      `type`: ItemType
    ): IDisposableMenuItem = {
      val __obj = js.Dynamic.literal(args = args.asInstanceOf[js.Any], caption = caption.asInstanceOf[js.Any], className = className.asInstanceOf[js.Any], command = command.asInstanceOf[js.Any], dataset = dataset.asInstanceOf[js.Any], dispose = js.Any.fromFunction0(dispose), iconClass = iconClass.asInstanceOf[js.Any], iconLabel = iconLabel.asInstanceOf[js.Any], isDisposed = isDisposed.asInstanceOf[js.Any], isEnabled = isEnabled.asInstanceOf[js.Any], isToggled = isToggled.asInstanceOf[js.Any], isVisible = isVisible.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any], mnemonic = mnemonic.asInstanceOf[js.Any], keyBinding = null, submenu = null)
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[IDisposableMenuItem]
    }
  }
}
