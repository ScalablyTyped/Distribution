package typings.jupyterlabApplication

import typings.jupyterlabApplication.anon.Matches
import typings.jupyterlabApplication.anon.PartialIPaths
import typings.jupyterlabApplication.frontendMod.JupyterFrontEnd
import typings.jupyterlabApplication.frontendMod.JupyterFrontEnd.IPaths
import typings.jupyterlabApplication.frontendMod.JupyterFrontEndPlugin
import typings.jupyterlabApplication.labMod.JupyterLab.IInfo
import typings.jupyterlabApplication.labMod.JupyterLab.IOptions
import typings.jupyterlabApplication.labMod.JupyterLab.IPluginModule
import typings.jupyterlabApplication.shellMod.ILabShell
import typings.jupyterlabApplication.shellMod.LabShell
import typings.jupyterlabApplication.statusMod.LabStatus
import typings.jupyterlabApputils.mod.CommandLinker
import typings.jupyterlabDocregistry.mod.DocumentRegistry
import typings.jupyterlabRendermimeInterfaces.mod.IRenderMime.IExtensionModule
import typings.jupyterlabServices.mod.ServiceManager
import typings.luminoCoreutils.mod.Token
import typings.luminoWidgets.menuMod.Menu.IRenderer
import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object labMod {
  
  @JSImport("@jupyterlab/application/lib/lab", "JupyterLab")
  @js.native
  /**
    * Construct a new JupyterLab object.
    */
  class JupyterLab () extends JupyterFrontEnd[ILabShell] {
    def this(options: IOptions) = this()
    
    var _info: js.Any = js.native
    
    var _paths: js.Any = js.native
    
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
    val registerPluginErrors: js.Array[Error] = js.native
    
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
    @js.native
    trait IInfo extends StObject {
      
      /**
        * The collection of deferred extension patterns and matched extensions.
        */
      val deferred: Matches = js.native
      
      /**
        * Whether the application is in dev mode.
        */
      val devMode: Boolean = js.native
      
      /**
        * The collection of disabled extension patterns and matched extensions.
        */
      val disabled: Matches = js.native
      
      /**
        * Whether files are cached on the server.
        */
      val filesCached: Boolean = js.native
      
      /**
        * The mime renderer extensions.
        */
      val mimeExtensions: js.Array[IExtensionModule] = js.native
    }
    object IInfo {
      
      /**
        * The layout restorer token.
        */
      @JSImport("@jupyterlab/application/lib/lab", "JupyterLab.IInfo")
      @js.native
      val ^ : Token[IInfo] = js.native
      
      @scala.inline
      implicit class IInfoMutableBuilder[Self <: IInfo] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setDeferred(value: Matches): Self = StObject.set(x, "deferred", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setDevMode(value: Boolean): Self = StObject.set(x, "devMode", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setDisabled(value: Matches): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setFilesCached(value: Boolean): Self = StObject.set(x, "filesCached", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setMimeExtensions(value: js.Array[IExtensionModule]): Self = StObject.set(x, "mimeExtensions", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setMimeExtensionsVarargs(value: IExtensionModule*): Self = StObject.set(x, "mimeExtensions", js.Array(value :_*))
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
    @js.native
    trait IOptions extends StObject {
      
      /**
        * The command linker used by the application.
        */
      var commandLinker: js.UndefOr[CommandLinker] = js.native
      
      /**
        * A custom renderer for the context menu.
        */
      var contextMenuRenderer: js.UndefOr[IRenderer] = js.native
      
      var deferred: js.UndefOr[Matches] = js.native
      
      var devMode: js.UndefOr[Boolean] = js.native
      
      var disabled: js.UndefOr[Matches] = js.native
      
      /**
        * The document registry instance used by the application.
        */
      var docRegistry: js.UndefOr[DocumentRegistry] = js.native
      
      var filesCached: js.UndefOr[Boolean] = js.native
      
      var mimeExtensions: js.UndefOr[js.Array[IExtensionModule]] = js.native
      
      var paths: js.UndefOr[PartialIPaths] = js.native
      
      /**
        * Promise that resolves when state is first restored, returning layout
        * description.
        */
      var restored: js.UndefOr[js.Promise[_]] = js.native
      
      /**
        * The service manager used by the application.
        */
      var serviceManager: js.UndefOr[ServiceManager] = js.native
      
      /**
        * The shell widget to use for the application.
        *
        * This should be a newly created and initialized widget.
        *
        * The application will attach the widget to the DOM.
        */
      var shell: LabShell = js.native
    }
    object IOptions {
      
      @scala.inline
      def apply(shell: LabShell): IOptions = {
        val __obj = js.Dynamic.literal(shell = shell.asInstanceOf[js.Any])
        __obj.asInstanceOf[IOptions]
      }
      
      @scala.inline
      implicit class IOptionsMutableBuilder[Self <: IOptions] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setCommandLinker(value: CommandLinker): Self = StObject.set(x, "commandLinker", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setCommandLinkerUndefined: Self = StObject.set(x, "commandLinker", js.undefined)
        
        @scala.inline
        def setContextMenuRenderer(value: IRenderer): Self = StObject.set(x, "contextMenuRenderer", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setContextMenuRendererUndefined: Self = StObject.set(x, "contextMenuRenderer", js.undefined)
        
        @scala.inline
        def setDeferred(value: Matches): Self = StObject.set(x, "deferred", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setDeferredUndefined: Self = StObject.set(x, "deferred", js.undefined)
        
        @scala.inline
        def setDevMode(value: Boolean): Self = StObject.set(x, "devMode", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setDevModeUndefined: Self = StObject.set(x, "devMode", js.undefined)
        
        @scala.inline
        def setDisabled(value: Matches): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
        
        @scala.inline
        def setDocRegistry(value: DocumentRegistry): Self = StObject.set(x, "docRegistry", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setDocRegistryUndefined: Self = StObject.set(x, "docRegistry", js.undefined)
        
        @scala.inline
        def setFilesCached(value: Boolean): Self = StObject.set(x, "filesCached", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setFilesCachedUndefined: Self = StObject.set(x, "filesCached", js.undefined)
        
        @scala.inline
        def setMimeExtensions(value: js.Array[IExtensionModule]): Self = StObject.set(x, "mimeExtensions", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setMimeExtensionsUndefined: Self = StObject.set(x, "mimeExtensions", js.undefined)
        
        @scala.inline
        def setMimeExtensionsVarargs(value: IExtensionModule*): Self = StObject.set(x, "mimeExtensions", js.Array(value :_*))
        
        @scala.inline
        def setPaths(value: PartialIPaths): Self = StObject.set(x, "paths", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setPathsUndefined: Self = StObject.set(x, "paths", js.undefined)
        
        @scala.inline
        def setRestored(value: js.Promise[_]): Self = StObject.set(x, "restored", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setRestoredUndefined: Self = StObject.set(x, "restored", js.undefined)
        
        @scala.inline
        def setServiceManager(value: ServiceManager): Self = StObject.set(x, "serviceManager", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setServiceManagerUndefined: Self = StObject.set(x, "serviceManager", js.undefined)
        
        @scala.inline
        def setShell(value: LabShell): Self = StObject.set(x, "shell", value.asInstanceOf[js.Any])
      }
    }
    
    /**
      * The interface for a module that exports a plugin or plugins as
      * the default value.
      */
    @js.native
    trait IPluginModule extends StObject {
      
      /**
        * The default export.
        */
      var default: JupyterFrontEndPlugin[_] | js.Array[JupyterFrontEndPlugin[_]] = js.native
    }
    object IPluginModule {
      
      @scala.inline
      def apply(default: JupyterFrontEndPlugin[_] | js.Array[JupyterFrontEndPlugin[_]]): IPluginModule = {
        val __obj = js.Dynamic.literal(default = default.asInstanceOf[js.Any])
        __obj.asInstanceOf[IPluginModule]
      }
      
      @scala.inline
      implicit class IPluginModuleMutableBuilder[Self <: IPluginModule] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setDefault(value: JupyterFrontEndPlugin[_] | js.Array[JupyterFrontEndPlugin[_]]): Self = StObject.set(x, "default", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setDefaultVarargs(value: JupyterFrontEndPlugin[js.Any]*): Self = StObject.set(x, "default", js.Array(value :_*))
      }
    }
  }
}
