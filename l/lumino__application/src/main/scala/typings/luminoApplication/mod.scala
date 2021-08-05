package typings.luminoApplication

import typings.luminoApplication.mod.Application.IOptions
import typings.luminoApplication.mod.Application.IStartOptions
import typings.luminoCommands.mod.CommandRegistry
import typings.luminoCoreutils.mod.Token
import typings.luminoWidgets.menuMod.Menu.IRenderer
import typings.luminoWidgets.mod.ContextMenu
import typings.luminoWidgets.mod.Widget
import typings.std.Event
import typings.std.KeyboardEvent
import typings.std.MouseEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@lumino/application", "Application")
  @js.native
  class Application[T /* <: Widget */] protected () extends StObject {
    /**
      * Construct a new application.
      *
      * @param options - The options for creating the application.
      */
    def this(options: IOptions[T]) = this()
    
    /* private */ var _delegate: js.Any = js.native
    
    /* private */ var _pluginMap: js.Any = js.native
    
    /* private */ var _serviceMap: js.Any = js.native
    
    /* private */ var _started: js.Any = js.native
    
    /**
      * Activate the plugin with the given id.
      *
      * @param id - The ID of the plugin of interest.
      *
      * @returns A promise which resolves when the plugin is activated
      *   or rejects with an error if it cannot be activated.
      */
    def activatePlugin(id: String): js.Promise[Unit] = js.native
    
    /**
      * Add the application event listeners.
      *
      * #### Notes
      * The default implementation of this method adds listeners for
      * `'keydown'` and `'resize'` events.
      *
      * A subclass may reimplement this method as needed.
      */
    /* protected */ def addEventListeners(): Unit = js.native
    
    /**
      * Attach the application shell to the DOM.
      *
      * @param id - The id of the host node for the shell, or `''`.
      *
      * #### Notes
      * If the id is not provided, the document body will be the host.
      *
      * A subclass may reimplement this method as needed.
      */
    /* protected */ def attachShell(id: String): Unit = js.native
    
    /**
      * The application command registry.
      */
    val commands: CommandRegistry = js.native
    
    /**
      * The application context menu.
      */
    val contextMenu: ContextMenu = js.native
    
    /**
      * A method invoked on a document `'contextmenu'` event.
      *
      * #### Notes
      * The default implementation of this method opens the application
      * `contextMenu` at the current mouse position.
      *
      * If the application context menu has no matching content *or* if
      * the shift key is pressed, the default browser context menu will
      * be opened instead.
      *
      * A subclass may reimplement this method as needed.
      */
    /* protected */ def evtContextMenu(event: MouseEvent): Unit = js.native
    
    /**
      * A method invoked on a document `'keydown'` event.
      *
      * #### Notes
      * The default implementation of this method invokes the key down
      * processing method of the application command registry.
      *
      * A subclass may reimplement this method as needed.
      */
    /* protected */ def evtKeydown(event: KeyboardEvent): Unit = js.native
    
    /**
      * A method invoked on a window `'resize'` event.
      *
      * #### Notes
      * The default implementation of this method updates the shell.
      *
      * A subclass may reimplement this method as needed.
      */
    /* protected */ def evtResize(event: Event): Unit = js.native
    
    /**
      * Handle the DOM events for the application.
      *
      * @param event - The DOM event sent to the application.
      *
      * #### Notes
      * This method implements the DOM `EventListener` interface and is
      * called in response to events registered for the application. It
      * should not be called directly by user code.
      */
    def handleEvent(event: Event): Unit = js.native
    
    /**
      * Test whether a plugin is registered with the application.
      *
      * @param id - The id of the plugin of interest.
      *
      * @returns `true` if the plugin is registered, `false` otherwise.
      */
    def hasPlugin(id: String): Boolean = js.native
    
    /**
      * List the IDs of the plugins registered with the application.
      *
      * @returns A new array of the registered plugin IDs.
      */
    def listPlugins(): js.Array[String] = js.native
    
    /**
      * Register a plugin with the application.
      *
      * @param plugin - The plugin to register.
      *
      * #### Notes
      * An error will be thrown if a plugin with the same id is already
      * registered, or if the plugin has a circular dependency.
      *
      * If the plugin provides a service which has already been provided
      * by another plugin, the new service will override the old service.
      */
    def registerPlugin(plugin: IPlugin[this.type, js.Any]): Unit = js.native
    
    /**
      * Register multiple plugins with the application.
      *
      * @param plugins - The plugins to register.
      *
      * #### Notes
      * This calls `registerPlugin()` for each of the given plugins.
      */
    def registerPlugins(plugins: js.Array[IPlugin[this.type, js.Any]]): Unit = js.native
    
    /**
      * Resolve an optional service of a given type.
      *
      * @param token - The token for the service type of interest.
      *
      * @returns A promise which resolves to an instance of the requested
      *   service, or `null` if it cannot be resolved.
      *
      * #### Notes
      * Services are singletons. The same instance will be returned each
      * time a given service token is resolved.
      *
      * If the plugin which provides the service has not been activated,
      * resolving the service will automatically activate the plugin.
      *
      * User code will not typically call this method directly. Instead,
      * the optional services for the user's plugins will be resolved
      * automatically when the plugin is activated.
      */
    def resolveOptionalService[U](token: Token[U]): js.Promise[U | Null] = js.native
    
    /**
      * Resolve a required service of a given type.
      *
      * @param token - The token for the service type of interest.
      *
      * @returns A promise which resolves to an instance of the requested
      *   service, or rejects with an error if it cannot be resolved.
      *
      * #### Notes
      * Services are singletons. The same instance will be returned each
      * time a given service token is resolved.
      *
      * If the plugin which provides the service has not been activated,
      * resolving the service will automatically activate the plugin.
      *
      * User code will not typically call this method directly. Instead,
      * the required services for the user's plugins will be resolved
      * automatically when the plugin is activated.
      */
    def resolveRequiredService[U](token: Token[U]): js.Promise[U] = js.native
    
    /**
      * The application shell widget.
      *
      * #### Notes
      * The shell widget is the root "container" widget for the entire
      * application. It will typically expose an API which allows the
      * application plugins to insert content in a variety of places.
      */
    val shell: T = js.native
    
    /**
      * Start the application.
      *
      * @param options - The options for starting the application.
      *
      * @returns A promise which resolves when all bootstrapping work
      *   is complete and the shell is mounted to the DOM.
      *
      * #### Notes
      * This should be called once by the application creator after all
      * initial plugins have been registered.
      *
      * If a plugin fails to the load, the error will be logged and the
      * other valid plugins will continue to be loaded.
      *
      * Bootstrapping the application consists of the following steps:
      * 1. Activate the startup plugins
      * 2. Wait for those plugins to activate
      * 3. Attach the shell widget to the DOM
      * 4. Add the application event listeners
      */
    def start(): js.Promise[Unit] = js.native
    def start(options: IStartOptions): js.Promise[Unit] = js.native
    
    /**
      * A promise which resolves after the application has started.
      *
      * #### Notes
      * This promise will resolve after the `start()` method is called,
      * when all the bootstrapping and shell mounting work is complete.
      */
    val started: js.Promise[Unit] = js.native
  }
  object Application {
    
    /**
      * An options object for creating an application.
      */
    trait IOptions[T /* <: Widget */] extends StObject {
      
      /**
        * A custom renderer for the context menu.
        */
      var contextMenuRenderer: js.UndefOr[IRenderer] = js.undefined
      
      /**
        * The shell widget to use for the application.
        *
        * This should be a newly created and initialized widget.
        *
        * The application will attach the widget to the DOM.
        */
      var shell: T
    }
    object IOptions {
      
      inline def apply[T /* <: Widget */](shell: T): IOptions[T] = {
        val __obj = js.Dynamic.literal(shell = shell.asInstanceOf[js.Any])
        __obj.asInstanceOf[IOptions[T]]
      }
      
      extension [Self <: IOptions[?], T /* <: Widget */](x: Self & IOptions[T]) {
        
        inline def setContextMenuRenderer(value: IRenderer): Self = StObject.set(x, "contextMenuRenderer", value.asInstanceOf[js.Any])
        
        inline def setContextMenuRendererUndefined: Self = StObject.set(x, "contextMenuRenderer", js.undefined)
        
        inline def setShell(value: T): Self = StObject.set(x, "shell", value.asInstanceOf[js.Any])
      }
    }
    
    /**
      * An options object for application startup.
      */
    trait IStartOptions extends StObject {
      
      /**
        * The ID of the DOM node to host the application shell.
        *
        * #### Notes
        * If this is not provided, the document body will be the host.
        */
      var hostID: js.UndefOr[String] = js.undefined
      
      /**
        * The plugins to **not** activate on startup.
        *
        * #### Notes
        * This will override `startPlugins` and any `autoStart` plugins.
        */
      var ignorePlugins: js.UndefOr[js.Array[String]] = js.undefined
      
      /**
        * The plugins to activate on startup.
        *
        * #### Notes
        * These will be *in addition* to any `autoStart` plugins.
        */
      var startPlugins: js.UndefOr[js.Array[String]] = js.undefined
    }
    object IStartOptions {
      
      inline def apply(): IStartOptions = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[IStartOptions]
      }
      
      extension [Self <: IStartOptions](x: Self) {
        
        inline def setHostID(value: String): Self = StObject.set(x, "hostID", value.asInstanceOf[js.Any])
        
        inline def setHostIDUndefined: Self = StObject.set(x, "hostID", js.undefined)
        
        inline def setIgnorePlugins(value: js.Array[String]): Self = StObject.set(x, "ignorePlugins", value.asInstanceOf[js.Any])
        
        inline def setIgnorePluginsUndefined: Self = StObject.set(x, "ignorePlugins", js.undefined)
        
        inline def setIgnorePluginsVarargs(value: String*): Self = StObject.set(x, "ignorePlugins", js.Array(value :_*))
        
        inline def setStartPlugins(value: js.Array[String]): Self = StObject.set(x, "startPlugins", value.asInstanceOf[js.Any])
        
        inline def setStartPluginsUndefined: Self = StObject.set(x, "startPlugins", js.undefined)
        
        inline def setStartPluginsVarargs(value: String*): Self = StObject.set(x, "startPlugins", js.Array(value :_*))
      }
    }
  }
  
  trait IPlugin[T, U] extends StObject {
    
    /**
      * A function invoked to activate the plugin.
      *
      * @param app - The application which owns the plugin.
      *
      * @param args - The services specified by the `requires` property.
      *
      * @returns The provided service, or a promise to the service.
      *
      * #### Notes
      * This function will be called whenever the plugin is manually
      * activated, or when another plugin being activated requires
      * the service it provides.
      *
      * This function will not be called unless all of its required
      * services can be fulfilled.
      */
    def activate(app: T, args: js.Any*): U | js.Promise[U]
    
    /**
      * Whether the plugin should be activated on application start.
      *
      * #### Notes
      * The default is `false`.
      */
    var autoStart: js.UndefOr[Boolean] = js.undefined
    
    /**
      * The human readable id of the plugin.
      *
      * #### Notes
      * This must be unique within an application.
      */
    var id: String
    
    /**
      * The types of optional services for the plugin, if any.
      *
      * #### Notes
      * These tokens correspond to the services that can be used by the
      * plugin if available, but are not necessarily required.
      *
      * The optional services will be passed to the `activate()` function
      * following all required services. If an optional service cannot be
      * resolved, `null` will be passed in its place.
      */
    var optional: js.UndefOr[js.Array[Token[js.Any]]] = js.undefined
    
    /**
      * The type of service provided by the plugin, if any.
      *
      * #### Notes
      * This token corresponds to the service exported by the plugin.
      *
      * When the plugin is activated, the return value of `activate()`
      * is used as the concrete instance of the type.
      */
    var provides: js.UndefOr[Token[U]] = js.undefined
    
    /**
      * The types of required services for the plugin, if any.
      *
      * #### Notes
      * These tokens correspond to the services that are required by
      * the plugin for correct operation.
      *
      * When the plugin is activated, a concrete instance of each type
      * will be passed to the `activate()` function, in the order they
      * are specified in the `requires` array.
      */
    var requires: js.UndefOr[js.Array[Token[js.Any]]] = js.undefined
  }
  object IPlugin {
    
    inline def apply[T, U](activate: (T, /* repeated */ js.Any) => U | js.Promise[U], id: String): IPlugin[T, U] = {
      val __obj = js.Dynamic.literal(activate = js.Any.fromFunction2(activate), id = id.asInstanceOf[js.Any])
      __obj.asInstanceOf[IPlugin[T, U]]
    }
    
    extension [Self <: IPlugin[?, ?], T, U](x: Self & (IPlugin[T, U])) {
      
      inline def setActivate(value: (T, /* repeated */ js.Any) => U | js.Promise[U]): Self = StObject.set(x, "activate", js.Any.fromFunction2(value))
      
      inline def setAutoStart(value: Boolean): Self = StObject.set(x, "autoStart", value.asInstanceOf[js.Any])
      
      inline def setAutoStartUndefined: Self = StObject.set(x, "autoStart", js.undefined)
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setOptional(value: js.Array[Token[js.Any]]): Self = StObject.set(x, "optional", value.asInstanceOf[js.Any])
      
      inline def setOptionalUndefined: Self = StObject.set(x, "optional", js.undefined)
      
      inline def setOptionalVarargs(value: Token[js.Any]*): Self = StObject.set(x, "optional", js.Array(value :_*))
      
      inline def setProvides(value: Token[U]): Self = StObject.set(x, "provides", value.asInstanceOf[js.Any])
      
      inline def setProvidesUndefined: Self = StObject.set(x, "provides", js.undefined)
      
      inline def setRequires(value: js.Array[Token[js.Any]]): Self = StObject.set(x, "requires", value.asInstanceOf[js.Any])
      
      inline def setRequiresUndefined: Self = StObject.set(x, "requires", js.undefined)
      
      inline def setRequiresVarargs(value: Token[js.Any]*): Self = StObject.set(x, "requires", js.Array(value :_*))
    }
  }
}
