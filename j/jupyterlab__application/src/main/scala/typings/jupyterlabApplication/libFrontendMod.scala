package typings.jupyterlabApplication

import org.scalablytyped.runtime.Shortcut
import typings.jupyterlabApplication.anon.App
import typings.jupyterlabApplication.anon.AppSettings
import typings.jupyterlabApplication.anon.Browser
import typings.jupyterlabApplication.libFrontendMod.JupyterFrontEnd.IOptions
import typings.jupyterlabApplication.libFrontendMod.JupyterFrontEnd.IShell
import typings.jupyterlabApplication.libFrontendMod.JupyterFrontEnd.ITreeResolver.Paths
import typings.jupyterlabApputils.mod.CommandLinker
import typings.jupyterlabDocregistry.libRegistryMod.DocumentRegistry.IOpenOptions
import typings.jupyterlabDocregistry.mod.DocumentRegistry
import typings.jupyterlabServices.mod.ServiceManager
import typings.jupyterlabUiComponents.mod.ContextMenuSvg
import typings.luminoAlgorithm.typesIterMod.IIterator
import typings.luminoApplication.mod.Application
import typings.luminoApplication.mod.IPlugin
import typings.luminoCoreutils.mod.Token
import typings.luminoSignaling.mod.ISignal
import typings.luminoWidgets.mod.Widget
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libFrontendMod {
  
  /* note: abstract class */ @JSImport("@jupyterlab/application/lib/frontend", "JupyterFrontEnd")
  @js.native
  open class JupyterFrontEnd[T /* <: IShell */, U /* <: String */] protected () extends Application[T] {
    /**
      * Construct a new JupyterFrontEnd object.
      */
    def this(options: IOptions[T, Any]) = this()
    
    /* private */ var _contextMenuEvent: Any = js.native
    
    /* private */ var _format: Any = js.native
    
    /* private */ var _formatChanged: Any = js.native
    
    /**
      * The command linker used by the application.
      */
    val commandLinker: CommandLinker = js.native
    
    /**
      * Walks up the DOM hierarchy of the target of the active `contextmenu`
      * event, testing each HTMLElement ancestor for a user-supplied function. This can
      * be used to find an HTMLElement on which to operate, given a context menu click.
      *
      * @param fn - a function that takes an `HTMLElement` and returns a
      *   boolean for whether it is the element the requester is seeking.
      *
      * @returns an HTMLElement or undefined, if none is found.
      */
    def contextMenuHitTest(fn: js.Function1[/* node */ HTMLElement, Boolean]): js.UndefOr[HTMLElement] = js.native
    
    /**
      * The application context menu.
      */
    @JSName("contextMenu")
    val contextMenu_JupyterFrontEnd: ContextMenuSvg = js.native
    
    /**
      * The document registry instance used by the application.
      */
    val docRegistry: DocumentRegistry = js.native
    
    /**
      * The application form factor, e.g., `desktop` or `mobile`.
      */
    def format: U = js.native
    
    /**
      * A signal that emits when the application form factor changes.
      */
    def formatChanged: ISignal[this.type, U] = js.native
    
    def format_=(format: U): Unit = js.native
    
    /**
      * The name of this Jupyter front-end application.
      */
    val name: String = js.native
    
    /**
      * A namespace/prefix plugins may use to denote their provenance.
      */
    val namespace: String = js.native
    
    /**
      * Promise that resolves when state is first restored.
      */
    val restored: js.Promise[Unit] = js.native
    
    /**
      * The service manager used by the application.
      */
    val serviceManager: ServiceManager = js.native
    
    /**
      * The version of this Jupyter front-end application.
      */
    val version: String = js.native
  }
  object JupyterFrontEnd {
    
    @JSImport("@jupyterlab/application/lib/frontend", "JupyterFrontEnd")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * An interface for URL and directory paths used by a Jupyter front-end.
      */
    trait IPaths extends StObject {
      
      /**
        * The server directories used by the application, for user information
        * only.
        *
        * #### Notes
        * These are for user information and user interface hints only and should
        * not be relied on in code. A server may set these to empty strings if it
        * does not want to expose this information.
        *
        * Examples of appropriate use include displaying a help dialog for a user
        * listing the paths, or a tooltip in a filebrowser displaying the server
        * root. Examples of inappropriate use include using one of these paths in a
        * terminal command, generating code using these paths, or using one of
        * these paths in a request to the server (it would be better to write a
        * server extension to handle these cases).
        */
      val directories: AppSettings
      
      /**
        * The urls used by the application.
        */
      val urls: App
    }
    object IPaths {
      
      /**
        * The application paths dictionary token.
        */
      @JSImport("@jupyterlab/application/lib/frontend", "JupyterFrontEnd.IPaths")
      @js.native
      val ^ : Token[IPaths] = js.native
      
      @scala.inline
      implicit open class MutableBuilder[Self <: IPaths] (val x: Self) extends AnyVal {
        
        inline def setDirectories(value: AppSettings): Self = StObject.set(x, "directories", value.asInstanceOf[js.Any])
        
        inline def setUrls(value: App): Self = StObject.set(x, "urls", value.asInstanceOf[js.Any])
      }
    }
    
    /**
      * An interface for a front-end tree route resolver.
      */
    trait ITreeResolver extends StObject {
      
      /**
        * A promise that resolves to the routed tree paths or null.
        */
      val paths: js.Promise[Paths]
    }
    /**
      * A namespace for tree resolver types.
      */
    object ITreeResolver extends Shortcut {
      
      inline def apply(paths: js.Promise[Paths]): ITreeResolver = {
        val __obj = js.Dynamic.literal(paths = paths.asInstanceOf[js.Any])
        __obj.asInstanceOf[ITreeResolver]
      }
      
      @JSImport("@jupyterlab/application/lib/frontend", "JupyterFrontEnd.ITreeResolver")
      @js.native
      val ^ : Token[ITreeResolver] = js.native
      
      @scala.inline
      implicit open class MutableBuilder[Self <: ITreeResolver] (val x: Self) extends AnyVal {
        
        inline def setPaths(value: js.Promise[Paths]): Self = StObject.set(x, "paths", value.asInstanceOf[js.Any])
      }
      
      /**
        * The browser and file paths if the tree resolver encountered and handled
        * a tree URL or `null` if not. Empty string paths should be ignored.
        */
      type Paths = Browser | Null
      
      type _To = Token[ITreeResolver]
      
      /* This means you don't have to write `^`, but can instead just say `ITreeResolver.foo` */
      override def _to: Token[ITreeResolver] = ^
    }
    
    /**
      * Is JupyterLab in document mode?
      *
      * @param path - Full URL of JupyterLab
      * @param paths - The current IPaths object hydrated from PageConfig.
      */
    inline def inDocMode(path: String, paths: IPaths): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("inDocMode")(path.asInstanceOf[js.Any], paths.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    
    /**
      * The options used to initialize a JupyterFrontEnd.
      */
    trait IOptions[T /* <: IShell */, U]
      extends StObject
         with typings.luminoApplication.mod.Application.IOptions[T] {
      
      /**
        * The command linker used by the application.
        */
      var commandLinker: js.UndefOr[CommandLinker] = js.undefined
      
      /**
        * The document registry instance used by the application.
        */
      var docRegistry: js.UndefOr[DocumentRegistry] = js.undefined
      
      /**
        * Promise that resolves when state is first restored, returning layout
        * description.
        */
      var restored: js.UndefOr[js.Promise[U]] = js.undefined
      
      /**
        * The service manager used by the application.
        */
      var serviceManager: js.UndefOr[ServiceManager] = js.undefined
    }
    object IOptions {
      
      inline def apply[T /* <: IShell */, U](shell: T): IOptions[T, U] = {
        val __obj = js.Dynamic.literal(shell = shell.asInstanceOf[js.Any])
        __obj.asInstanceOf[IOptions[T, U]]
      }
      
      @scala.inline
      implicit open class MutableBuilder[Self <: IOptions[?, ?], T /* <: IShell */, U] (val x: Self & (IOptions[T, U])) extends AnyVal {
        
        inline def setCommandLinker(value: CommandLinker): Self = StObject.set(x, "commandLinker", value.asInstanceOf[js.Any])
        
        inline def setCommandLinkerUndefined: Self = StObject.set(x, "commandLinker", js.undefined)
        
        inline def setDocRegistry(value: DocumentRegistry): Self = StObject.set(x, "docRegistry", value.asInstanceOf[js.Any])
        
        inline def setDocRegistryUndefined: Self = StObject.set(x, "docRegistry", js.undefined)
        
        inline def setRestored(value: js.Promise[U]): Self = StObject.set(x, "restored", value.asInstanceOf[js.Any])
        
        inline def setRestoredUndefined: Self = StObject.set(x, "restored", js.undefined)
        
        inline def setServiceManager(value: ServiceManager): Self = StObject.set(x, "serviceManager", value.asInstanceOf[js.Any])
        
        inline def setServiceManagerUndefined: Self = StObject.set(x, "serviceManager", js.undefined)
      }
    }
    
    /**
      * A minimal shell type for Jupyter front-end applications.
      */
    @js.native
    trait IShell extends Widget {
      
      /**
        * Activates a widget inside the application shell.
        *
        * @param id - The ID of the widget being activated.
        */
      def activateById(id: String): Unit = js.native
      
      /**
        * Add a widget to the application shell.
        *
        * @param widget - The widget being added.
        *
        * @param area - Optional region in the shell into which the widget should
        * be added.
        *
        * @param options - Optional flags the shell might use when opening the
        * widget, as defined in the `DocumentRegistry`.
        */
      def add(widget: Widget): Unit = js.native
      def add(widget: Widget, area: String): Unit = js.native
      def add(widget: Widget, area: String, options: IOpenOptions): Unit = js.native
      def add(widget: Widget, area: Unit, options: IOpenOptions): Unit = js.native
      
      /**
        * The focused widget in the application shell.
        *
        * #### Notes
        * Different shell implementations have latitude to decide what "current"
        * or "focused" mean, depending on their user interface characteristics.
        */
      val currentWidget: Widget | Null = js.native
      
      /**
        * Returns an iterator for the widgets inside the application shell.
        *
        * @param area - Optional regions in the shell whose widgets are iterated.
        */
      def widgets(): IIterator[Widget] = js.native
      def widgets(area: String): IIterator[Widget] = js.native
    }
  }
  
  object JupyterFrontEndContextMenu {
    
    /**
      * An id for a private context-menu-info ersatz command.
      */
    @JSImport("@jupyterlab/application/lib/frontend", "JupyterFrontEndContextMenu.contextMenu")
    @js.native
    val contextMenu: /* "__internal:context-menu-info" */ String = js.native
  }
  
  type JupyterFrontEndPlugin[T, U /* <: IShell */, V /* <: String */] = IPlugin[JupyterFrontEnd[U, V], T]
}
