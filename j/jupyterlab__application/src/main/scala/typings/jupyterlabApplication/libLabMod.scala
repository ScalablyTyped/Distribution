package typings.jupyterlabApplication

import typings.jupyterlabApplication.anon.Matches
import typings.jupyterlabApplication.anon.PartialIPaths
import typings.jupyterlabApplication.jupyterlabApplicationStrings.desktop
import typings.jupyterlabApplication.jupyterlabApplicationStrings.mobile
import typings.jupyterlabApplication.libFrontendMod.JupyterFrontEnd
import typings.jupyterlabApplication.libFrontendMod.JupyterFrontEnd.IPaths
import typings.jupyterlabApplication.libFrontendMod.JupyterFrontEndPlugin
import typings.jupyterlabApplication.libLabMod.JupyterLab.IInfo
import typings.jupyterlabApplication.libLabMod.JupyterLab.IOptions
import typings.jupyterlabApplication.libLabMod.JupyterLab.IPluginModule
import typings.jupyterlabApplication.libShellMod.ILabShell
import typings.jupyterlabApplication.libShellMod.LabShell
import typings.jupyterlabApplication.libStatusMod.LabStatus
import typings.jupyterlabApputils.mod.CommandLinker
import typings.jupyterlabDocregistry.mod.DocumentRegistry
import typings.jupyterlabRendermimeInterfaces.mod.IRenderMime.IExtensionModule
import typings.jupyterlabServices.mod.ServiceManager
import typings.luminoCoreutils.mod.Token
import typings.luminoWidgets.typesMenuMod.Menu.IRenderer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libLabMod {
  
  @JSImport("@jupyterlab/application/lib/lab", "JupyterLab")
  @js.native
  /**
    * Construct a new JupyterLab object.
    */
  open class JupyterLab () extends JupyterFrontEnd[ILabShell, desktop | mobile] {
    def this(options: IOptions) = this()
    
    /* private */ var _info: Any = js.native
    
    /* private */ var _paths: Any = js.native
    
    /**
      * The JupyterLab application information dictionary.
      */
    def info: IInfo = js.native
    
    /**
      * The JupyterLab application paths dictionary.
      */
    def paths: IPaths = js.native
    
    /**
      * A list of all errors encountered when registering plugins.
      */
    val registerPluginErrors: js.Array[js.Error] = js.native
    
    /**
      * Register plugins from a plugin module.
      *
      * @param mod - The plugin module to register.
      */
    def registerPluginModule(mod: IPluginModule): Unit = js.native
    
    /**
      * Register the plugins from multiple plugin modules.
      *
      * @param mods - The plugin modules to register.
      */
    def registerPluginModules(mods: js.Array[IPluginModule]): Unit = js.native
    
    /**
      * The application busy and dirty status signals and flags.
      */
    val status: LabStatus = js.native
  }
  object JupyterLab {
    
    /**
      * The information about a JupyterLab application.
      */
    trait IInfo extends StObject {
      
      /**
        * The collection of deferred extension patterns and matched extensions.
        */
      val deferred: Matches
      
      /**
        * Whether the application is in dev mode.
        */
      val devMode: Boolean
      
      /**
        * The collection of disabled extension patterns and matched extensions.
        */
      val disabled: Matches
      
      /**
        * Whether files are cached on the server.
        */
      val filesCached: Boolean
      
      /**
        * The mime renderer extensions.
        */
      val mimeExtensions: js.Array[IExtensionModule]
    }
    object IInfo {
      
      /**
        * The layout restorer token.
        */
      @JSImport("@jupyterlab/application/lib/lab", "JupyterLab.IInfo")
      @js.native
      val ^ : Token[IInfo] = js.native
      
      @scala.inline
      implicit open class MutableBuilder[Self <: IInfo] (val x: Self) extends AnyVal {
        
        inline def setDeferred(value: Matches): Self = StObject.set(x, "deferred", value.asInstanceOf[js.Any])
        
        inline def setDevMode(value: Boolean): Self = StObject.set(x, "devMode", value.asInstanceOf[js.Any])
        
        inline def setDisabled(value: Matches): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
        
        inline def setFilesCached(value: Boolean): Self = StObject.set(x, "filesCached", value.asInstanceOf[js.Any])
        
        inline def setMimeExtensions(value: js.Array[IExtensionModule]): Self = StObject.set(x, "mimeExtensions", value.asInstanceOf[js.Any])
        
        inline def setMimeExtensionsVarargs(value: IExtensionModule*): Self = StObject.set(x, "mimeExtensions", js.Array(value*))
      }
    }
    
    /**
      * The default JupyterLab application info.
      */
    @JSImport("@jupyterlab/application/lib/lab", "JupyterLab.defaultInfo")
    @js.native
    val defaultInfo: IInfo = js.native
    
    /**
      * The default JupyterLab application paths.
      */
    @JSImport("@jupyterlab/application/lib/lab", "JupyterLab.defaultPaths")
    @js.native
    val defaultPaths: IPaths = js.native
    
    /**
      * The options used to initialize a JupyterLab object.
      */
    /* Inlined parent @jupyterlab/application.@jupyterlab/application/lib/frontend.JupyterFrontEnd.IOptions<@jupyterlab/application.@jupyterlab/application/lib/shell.LabShell, any> */
    /* Inlined parent std.Partial<@jupyterlab/application.@jupyterlab/application/lib/lab.JupyterLab.IInfo> */
    trait IOptions extends StObject {
      
      /**
        * The command linker used by the application.
        */
      var commandLinker: js.UndefOr[CommandLinker] = js.undefined
      
      /**
        * A custom renderer for the context menu.
        */
      var contextMenuRenderer: js.UndefOr[IRenderer] = js.undefined
      
      var deferred: js.UndefOr[Matches] = js.undefined
      
      var devMode: js.UndefOr[Boolean] = js.undefined
      
      var disabled: js.UndefOr[Matches] = js.undefined
      
      /**
        * The document registry instance used by the application.
        */
      var docRegistry: js.UndefOr[DocumentRegistry] = js.undefined
      
      var filesCached: js.UndefOr[Boolean] = js.undefined
      
      var mimeExtensions: js.UndefOr[js.Array[IExtensionModule]] = js.undefined
      
      var paths: js.UndefOr[PartialIPaths] = js.undefined
      
      /**
        * Promise that resolves when state is first restored, returning layout
        * description.
        */
      var restored: js.UndefOr[js.Promise[Any]] = js.undefined
      
      /**
        * The service manager used by the application.
        */
      var serviceManager: js.UndefOr[ServiceManager] = js.undefined
      
      /**
        * The shell widget to use for the application.
        *
        * This should be a newly created and initialized widget.
        *
        * The application will attach the widget to the DOM.
        */
      var shell: LabShell
    }
    object IOptions {
      
      inline def apply(shell: LabShell): IOptions = {
        val __obj = js.Dynamic.literal(shell = shell.asInstanceOf[js.Any])
        __obj.asInstanceOf[IOptions]
      }
      
      @scala.inline
      implicit open class MutableBuilder[Self <: IOptions] (val x: Self) extends AnyVal {
        
        inline def setCommandLinker(value: CommandLinker): Self = StObject.set(x, "commandLinker", value.asInstanceOf[js.Any])
        
        inline def setCommandLinkerUndefined: Self = StObject.set(x, "commandLinker", js.undefined)
        
        inline def setContextMenuRenderer(value: IRenderer): Self = StObject.set(x, "contextMenuRenderer", value.asInstanceOf[js.Any])
        
        inline def setContextMenuRendererUndefined: Self = StObject.set(x, "contextMenuRenderer", js.undefined)
        
        inline def setDeferred(value: Matches): Self = StObject.set(x, "deferred", value.asInstanceOf[js.Any])
        
        inline def setDeferredUndefined: Self = StObject.set(x, "deferred", js.undefined)
        
        inline def setDevMode(value: Boolean): Self = StObject.set(x, "devMode", value.asInstanceOf[js.Any])
        
        inline def setDevModeUndefined: Self = StObject.set(x, "devMode", js.undefined)
        
        inline def setDisabled(value: Matches): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
        
        inline def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
        
        inline def setDocRegistry(value: DocumentRegistry): Self = StObject.set(x, "docRegistry", value.asInstanceOf[js.Any])
        
        inline def setDocRegistryUndefined: Self = StObject.set(x, "docRegistry", js.undefined)
        
        inline def setFilesCached(value: Boolean): Self = StObject.set(x, "filesCached", value.asInstanceOf[js.Any])
        
        inline def setFilesCachedUndefined: Self = StObject.set(x, "filesCached", js.undefined)
        
        inline def setMimeExtensions(value: js.Array[IExtensionModule]): Self = StObject.set(x, "mimeExtensions", value.asInstanceOf[js.Any])
        
        inline def setMimeExtensionsUndefined: Self = StObject.set(x, "mimeExtensions", js.undefined)
        
        inline def setMimeExtensionsVarargs(value: IExtensionModule*): Self = StObject.set(x, "mimeExtensions", js.Array(value*))
        
        inline def setPaths(value: PartialIPaths): Self = StObject.set(x, "paths", value.asInstanceOf[js.Any])
        
        inline def setPathsUndefined: Self = StObject.set(x, "paths", js.undefined)
        
        inline def setRestored(value: js.Promise[Any]): Self = StObject.set(x, "restored", value.asInstanceOf[js.Any])
        
        inline def setRestoredUndefined: Self = StObject.set(x, "restored", js.undefined)
        
        inline def setServiceManager(value: ServiceManager): Self = StObject.set(x, "serviceManager", value.asInstanceOf[js.Any])
        
        inline def setServiceManagerUndefined: Self = StObject.set(x, "serviceManager", js.undefined)
        
        inline def setShell(value: LabShell): Self = StObject.set(x, "shell", value.asInstanceOf[js.Any])
      }
    }
    
    /**
      * The interface for a module that exports a plugin or plugins as
      * the default value.
      */
    trait IPluginModule extends StObject {
      
      /**
        * The default export.
        */
      var default: (JupyterFrontEndPlugin[Any, Any, Any]) | (js.Array[JupyterFrontEndPlugin[Any, Any, Any]])
    }
    object IPluginModule {
      
      inline def apply(default: (JupyterFrontEndPlugin[Any, Any, Any]) | (js.Array[JupyterFrontEndPlugin[Any, Any, Any]])): IPluginModule = {
        val __obj = js.Dynamic.literal(default = default.asInstanceOf[js.Any])
        __obj.asInstanceOf[IPluginModule]
      }
      
      @scala.inline
      implicit open class MutableBuilder[Self <: IPluginModule] (val x: Self) extends AnyVal {
        
        inline def setDefault(value: (JupyterFrontEndPlugin[Any, Any, Any]) | (js.Array[JupyterFrontEndPlugin[Any, Any, Any]])): Self = StObject.set(x, "default", value.asInstanceOf[js.Any])
        
        inline def setDefaultVarargs(value: (JupyterFrontEndPlugin[Any, Any, Any])*): Self = StObject.set(x, "default", js.Array(value*))
      }
    }
  }
}
