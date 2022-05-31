package typings.jupyterlabDocmanager

import typings.jupyterlabApputils.sessioncontextMod.ISessionContext.IDialogs
import typings.jupyterlabDocmanager.managerMod.DocumentManager.IOptions
import typings.jupyterlabDocmanager.tokensMod.IDocumentManager
import typings.jupyterlabDocregistry.mod.DocumentRegistry
import typings.jupyterlabDocregistry.registryMod.DocumentRegistry.IModel
import typings.jupyterlabDocregistry.registryMod.DocumentRegistry.IOpenOptions
import typings.jupyterlabDocregistry.registryMod.IDocumentWidget
import typings.jupyterlabServices.libManagerMod.ServiceManager.IManager
import typings.luminoDisposable.mod.IDisposable
import typings.luminoSignaling.mod.ISignal
import typings.luminoWidgets.mod.Widget
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object managerMod {
  
  @JSImport("@jupyterlab/docmanager/lib/manager", "DocumentManager")
  @js.native
  class DocumentManager protected ()
    extends StObject
       with IDocumentManager {
    /**
      * Construct a new document manager.
      */
    def this(options: IOptions) = this()
    
    /* private */ var _activateRequested: js.Any = js.native
    
    /* private */ var _autosave: js.Any = js.native
    
    /* private */ var _autosaveInterval: js.Any = js.native
    
    /* private */ var _contexts: js.Any = js.native
    
    /**
      * Get the contexts for a given path.
      *
      * #### Notes
      * There may be more than one context for a given path if the path is open
      * with multiple model factories (for example, a notebook can be open with a
      * notebook model factory and a text model factory).
      */
    /* private */ var _contextsForPath: js.Any = js.native
    
    /**
      * Create a context from a path and a model factory.
      */
    /* private */ var _createContext: js.Any = js.native
    
    /**
      * Creates a new document, or loads one from disk, depending on the `which` argument.
      * If `which==='create'`, then it creates a new document. If `which==='open'`,
      * then it loads the document from disk.
      *
      * The two cases differ in how the document context is handled, but the creation
      * of the widget and launching of the kernel are identical.
      */
    /* private */ var _createOrOpenDocument: js.Any = js.native
    
    /* private */ var _dialogs: js.Any = js.native
    
    /**
      * Find a context for a given path and factory name.
      */
    /* private */ var _findContext: js.Any = js.native
    
    /* private */ var _isDisposed: js.Any = js.native
    
    /**
      * Handle an activateRequested signal from the widget manager.
      */
    /* private */ var _onActivateRequested: js.Any = js.native
    
    /**
      * Handle a context disposal.
      */
    /* private */ var _onContextDisposed: js.Any = js.native
    
    /* private */ var _opener: js.Any = js.native
    
    /* private */ var _setBusy: js.Any = js.native
    
    /* private */ var _when: js.Any = js.native
    
    /**
      * Get the widget factory for a given widget name.
      */
    /* private */ var _widgetFactoryFor: js.Any = js.native
    
    /* private */ var _widgetManager: js.Any = js.native
    
    /**
      * A signal emitted when one of the documents is activated.
      */
    @JSName("activateRequested")
    def activateRequested_MDocumentManager: ISignal[this.type, String] = js.native
    
    /**
      * Determines the time interval for autosave in seconds.
      */
    @JSName("autosaveInterval")
    def autosaveInterval_MDocumentManager: Double = js.native
    
    /**
      * Whether to autosave documents.
      */
    @JSName("autosave")
    def autosave_MDocumentManager: Boolean = js.native
    
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
    /* CompleteClass */
    override def dispose(): Unit = js.native
    
    /**
      * Test whether the object has been disposed.
      *
      * #### Notes
      * This property is always safe to access.
      */
    /* CompleteClass */
    override val isDisposed: Boolean = js.native
    /**
      * Get whether the document manager has been disposed.
      */
    @JSName("isDisposed")
    def isDisposed_MDocumentManager: Boolean = js.native
  }
  object DocumentManager {
    
    /**
      * The options used to initialize a document manager.
      */
    trait IOptions extends StObject {
      
      /**
        * A service manager instance.
        */
      var manager: IManager
      
      /**
        * A widget opener for sibling widgets.
        */
      var opener: IWidgetOpener
      
      /**
        * A document registry instance.
        */
      var registry: DocumentRegistry
      
      /**
        * The provider for session dialogs.
        */
      var sessionDialogs: js.UndefOr[IDialogs] = js.undefined
      
      /**
        * A function called when a kernel is busy.
        */
      var setBusy: js.UndefOr[js.Function0[IDisposable]] = js.undefined
      
      /**
        * A promise for when to start using the manager.
        */
      var when: js.UndefOr[js.Promise[Unit]] = js.undefined
    }
    object IOptions {
      
      inline def apply(manager: IManager, opener: IWidgetOpener, registry: DocumentRegistry): IOptions = {
        val __obj = js.Dynamic.literal(manager = manager.asInstanceOf[js.Any], opener = opener.asInstanceOf[js.Any], registry = registry.asInstanceOf[js.Any])
        __obj.asInstanceOf[IOptions]
      }
      
      extension [Self <: IOptions](x: Self) {
        
        inline def setManager(value: IManager): Self = StObject.set(x, "manager", value.asInstanceOf[js.Any])
        
        inline def setOpener(value: IWidgetOpener): Self = StObject.set(x, "opener", value.asInstanceOf[js.Any])
        
        inline def setRegistry(value: DocumentRegistry): Self = StObject.set(x, "registry", value.asInstanceOf[js.Any])
        
        inline def setSessionDialogs(value: IDialogs): Self = StObject.set(x, "sessionDialogs", value.asInstanceOf[js.Any])
        
        inline def setSessionDialogsUndefined: Self = StObject.set(x, "sessionDialogs", js.undefined)
        
        inline def setSetBusy(value: () => IDisposable): Self = StObject.set(x, "setBusy", js.Any.fromFunction0(value))
        
        inline def setSetBusyUndefined: Self = StObject.set(x, "setBusy", js.undefined)
        
        inline def setWhen(value: js.Promise[Unit]): Self = StObject.set(x, "when", value.asInstanceOf[js.Any])
        
        inline def setWhenUndefined: Self = StObject.set(x, "when", js.undefined)
      }
    }
    
    /**
      * An interface for a widget opener.
      */
    @js.native
    trait IWidgetOpener extends StObject {
      
      /**
        * Open the given widget.
        */
      def open(widget: IDocumentWidget[Widget, IModel]): Unit = js.native
      def open(widget: IDocumentWidget[Widget, IModel], options: IOpenOptions): Unit = js.native
    }
  }
}
