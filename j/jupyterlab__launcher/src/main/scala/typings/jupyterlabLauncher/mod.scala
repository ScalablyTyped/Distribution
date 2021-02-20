package typings.jupyterlabLauncher

import org.scalablytyped.runtime.Shortcut
import typings.jupyterlabApputils.mod.VDomModel
import typings.jupyterlabApputils.mod.VDomRenderer
import typings.jupyterlabLauncher.mod.ILauncher.IItemOptions
import typings.jupyterlabLauncher.mod.ILauncher.IOptions
import typings.luminoAlgorithm.iterMod.IIterator
import typings.luminoCommands.mod.CommandRegistry
import typings.luminoCoreutils.jsonMod.ReadonlyJSONObject
import typings.luminoCoreutils.mod.Token
import typings.luminoDisposable.mod.IDisposable
import typings.luminoWidgets.mod.Widget
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @js.native
  trait ILauncher extends StObject {
    
    /**
      * Add a command item to the launcher, and trigger re-render event for parent
      * widget.
      *
      * @param options - The specification options for a launcher item.
      *
      * @returns A disposable that will remove the item from Launcher, and trigger
      * re-render event for parent widget.
      *
      */
    def add(options: IItemOptions): IDisposable = js.native
  }
  object ILauncher extends Shortcut {
    
    @scala.inline
    def apply(add: IItemOptions => IDisposable): ILauncher = {
      val __obj = js.Dynamic.literal(add = js.Any.fromFunction1(add))
      __obj.asInstanceOf[ILauncher]
    }
    
    @JSImport("@jupyterlab/launcher", "ILauncher")
    @js.native
    val ^ : Token[ILauncher] = js.native
    
    /**
      * The options used to create a launcher item.
      */
    @js.native
    trait IItemOptions extends StObject {
      
      /**
        * The arguments given to the command for
        * creating the launcher item.
        *
        * ### Notes
        * The launcher will also add the current working
        * directory of the filebrowser in the `cwd` field
        * of the args, which a command may use to create
        * the activity with respect to the right directory.
        */
      var args: js.UndefOr[ReadonlyJSONObject] = js.native
      
      /**
        * The category for the launcher item.
        *
        * The default value is the an empty string.
        */
      var category: js.UndefOr[String] = js.native
      
      /**
        * The command ID for the launcher item.
        *
        * #### Notes
        * If the command's `execute` method returns a `Widget` or
        * a promise that resolves with a `Widget`, then that widget will
        * replace the launcher in the same location of the application
        * shell. If the `execute` method does something else
        * (i.e., create a modal dialog), then the launcher will not be
        * disposed.
        */
      var command: String = js.native
      
      /**
        * For items that have a kernel associated with them, the URL of the kernel
        * icon.
        *
        * This is not a CSS class, but the URL that points to the icon in the kernel
        * spec.
        */
      var kernelIconUrl: js.UndefOr[String] = js.native
      
      /**
        * Metadata about the item.  This can be used by the launcher to
        * affect how the item is displayed.
        */
      var metadata: js.UndefOr[ReadonlyJSONObject] = js.native
      
      /**
        * The rank for the launcher item.
        *
        * The rank is used when ordering launcher items for display. After grouping
        * into categories, items are sorted in the following order:
        *   1. Rank (lower is better)
        *   3. Display Name (locale order)
        *
        * The default rank is `Infinity`.
        */
      var rank: js.UndefOr[Double] = js.native
    }
    object IItemOptions {
      
      @scala.inline
      def apply(command: String): IItemOptions = {
        val __obj = js.Dynamic.literal(command = command.asInstanceOf[js.Any])
        __obj.asInstanceOf[IItemOptions]
      }
      
      @scala.inline
      implicit class IItemOptionsMutableBuilder[Self <: IItemOptions] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setArgs(value: ReadonlyJSONObject): Self = StObject.set(x, "args", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setArgsUndefined: Self = StObject.set(x, "args", js.undefined)
        
        @scala.inline
        def setCategory(value: String): Self = StObject.set(x, "category", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setCategoryUndefined: Self = StObject.set(x, "category", js.undefined)
        
        @scala.inline
        def setCommand(value: String): Self = StObject.set(x, "command", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setKernelIconUrl(value: String): Self = StObject.set(x, "kernelIconUrl", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setKernelIconUrlUndefined: Self = StObject.set(x, "kernelIconUrl", js.undefined)
        
        @scala.inline
        def setMetadata(value: ReadonlyJSONObject): Self = StObject.set(x, "metadata", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setMetadataUndefined: Self = StObject.set(x, "metadata", js.undefined)
        
        @scala.inline
        def setRank(value: Double): Self = StObject.set(x, "rank", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setRankUndefined: Self = StObject.set(x, "rank", js.undefined)
      }
    }
    
    @scala.inline
    implicit class ILauncherMutableBuilder[Self <: ILauncher] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAdd(value: IItemOptions => IDisposable): Self = StObject.set(x, "add", js.Any.fromFunction1(value))
    }
    
    /**
      * The options used to create a Launcher.
      */
    @js.native
    trait IOptions extends StObject {
      
      /**
        * The callback used when an item is launched.
        */
      def callback(widget: Widget): Unit = js.native
      
      /**
        * The command registry used by the launcher.
        */
      var commands: CommandRegistry = js.native
      
      /**
        * The cwd of the launcher.
        */
      var cwd: String = js.native
      
      /**
        * The model of the launcher.
        */
      var model: LauncherModel = js.native
    }
    object IOptions {
      
      @scala.inline
      def apply(callback: Widget => Unit, commands: CommandRegistry, cwd: String, model: LauncherModel): IOptions = {
        val __obj = js.Dynamic.literal(callback = js.Any.fromFunction1(callback), commands = commands.asInstanceOf[js.Any], cwd = cwd.asInstanceOf[js.Any], model = model.asInstanceOf[js.Any])
        __obj.asInstanceOf[IOptions]
      }
      
      @scala.inline
      implicit class IOptionsMutableBuilder[Self <: IOptions] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setCallback(value: Widget => Unit): Self = StObject.set(x, "callback", js.Any.fromFunction1(value))
        
        @scala.inline
        def setCommands(value: CommandRegistry): Self = StObject.set(x, "commands", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setCwd(value: String): Self = StObject.set(x, "cwd", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setModel(value: LauncherModel): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
      }
    }
    
    type _To = Token[ILauncher]
    
    /* This means you don't have to write `^`, but can instead just say `ILauncher.foo` */
    override def _to: Token[ILauncher] = ^
  }
  
  @JSImport("@jupyterlab/launcher", "Launcher")
  @js.native
  class Launcher protected () extends VDomRenderer[LauncherModel] {
    /**
      * Construct a new launcher widget.
      */
    def this(options: IOptions) = this()
    
    var _callback: js.Any = js.native
    
    var _commands: js.Any = js.native
    
    var _cwd: js.Any = js.native
    
    var _pending: js.Any = js.native
    
    /**
      * The cwd of the launcher.
      */
    def cwd: String = js.native
    def cwd_=(value: String): Unit = js.native
    
    /**
      * Whether there is a pending item being launched.
      */
    def pending: Boolean = js.native
    def pending_=(value: Boolean): Unit = js.native
  }
  
  @JSImport("@jupyterlab/launcher", "LauncherModel")
  @js.native
  class LauncherModel ()
    extends VDomModel
       with ILauncher {
    
    var _items: js.Any = js.native
    
    /**
      * Return an iterator of launcher items.
      */
    def items(): IIterator[IItemOptions] = js.native
  }
}
