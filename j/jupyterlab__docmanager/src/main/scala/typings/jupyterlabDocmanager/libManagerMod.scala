package typings.jupyterlabDocmanager

import typings.jupyterlabApputils.libSessioncontextMod.ISessionContext.IDialogs
import typings.jupyterlabDocmanager.libManagerMod.DocumentManager.IOptions
import typings.jupyterlabDocmanager.libTokensMod.IDocumentManager
import typings.jupyterlabDocprovider.libTokensMod.IDocumentProvider
import typings.jupyterlabDocprovider.libTokensMod.IDocumentProviderFactory
import typings.jupyterlabDocregistry.libRegistryMod.DocumentRegistry.IModel
import typings.jupyterlabDocregistry.libRegistryMod.DocumentRegistry.IOpenOptions
import typings.jupyterlabDocregistry.libRegistryMod.IDocumentWidget
import typings.jupyterlabDocregistry.mod.DocumentRegistry
import typings.jupyterlabServices.libManagerMod.ServiceManager.IManager
import typings.jupyterlabTranslation.libTokensMod.ITranslator
import typings.luminoDisposable.mod.IDisposable
import typings.luminoSignaling.mod.ISignal
import typings.luminoWidgets.mod.Widget
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libManagerMod {
  
  @JSImport("@jupyterlab/docmanager/lib/manager", "DocumentManager")
  @js.native
  open class DocumentManager protected ()
    extends StObject
       with IDocumentManager {
    /**
      * Construct a new document manager.
      */
    def this(options: IOptions) = this()
    
    /* private */ var _activateRequested: Any = js.native
    
    /* private */ var _autosave: Any = js.native
    
    /* private */ var _autosaveInterval: Any = js.native
    
    /* private */ var _collaborative: Any = js.native
    
    /* private */ var _contexts: Any = js.native
    
    /**
      * Get the contexts for a given path.
      *
      * #### Notes
      * There may be more than one context for a given path if the path is open
      * with multiple model factories (for example, a notebook can be open with a
      * notebook model factory and a text model factory).
      */
    /* private */ var _contextsForPath: Any = js.native
    
    /**
      * Create a context from a path and a model factory.
      */
    /* private */ var _createContext: Any = js.native
    
    /**
      * Creates a new document, or loads one from disk, depending on the `which` argument.
      * If `which==='create'`, then it creates a new document. If `which==='open'`,
      * then it loads the document from disk.
      *
      * The two cases differ in how the document context is handled, but the creation
      * of the widget and launching of the kernel are identical.
      */
    /* private */ var _createOrOpenDocument: Any = js.native
    
    /* private */ var _dialogs: Any = js.native
    
    /* private */ var _docProviderFactory: Any = js.native
    
    /**
      * Find a context for a given path and factory name.
      */
    /* private */ var _findContext: Any = js.native
    
    /* private */ var _isDisposed: Any = js.native
    
    /* private */ var _lastModifiedCheckMargin: Any = js.native
    
    /**
      * Handle an activateRequested signal from the widget manager.
      */
    /* private */ var _onActivateRequested: Any = js.native
    
    /**
      * Handle a context disposal.
      */
    /* private */ var _onContextDisposed: Any = js.native
    
    /* private */ var _opener: Any = js.native
    
    /* private */ var _renameUntitledFileOnSave: Any = js.native
    
    /* private */ var _setBusy: Any = js.native
    
    /* private */ var _when: Any = js.native
    
    /**
      * Get the widget factory for a given widget name.
      */
    /* private */ var _widgetFactoryFor: Any = js.native
    
    /* private */ var _widgetManager: Any = js.native
    
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
    
    /**
      * Defines max acceptable difference, in milliseconds, between last modified timestamps on disk and client
      */
    def lastModifiedCheckMargin: Double = js.native
    def lastModifiedCheckMargin_=(value: Double): Unit = js.native
    
    /**
      * Whether to ask the user to rename untitled file on first manual save.
      */
    @JSName("renameUntitledFileOnSave")
    def renameUntitledFileOnSave_MDocumentManager: Boolean = js.native
    
    /* protected */ var translator: ITranslator = js.native
  }
  object DocumentManager {
    
    /**
      * The options used to initialize a document manager.
      */
    trait IOptions extends StObject {
      
      /**
        * Whether the context should be collaborative.
        * If true, the context will connect through yjs_ws_server to share information if possible.
        */
      var collaborative: js.UndefOr[Boolean] = js.undefined
      
      /**
        * A factory method for the document provider.
        */
      var docProviderFactory: js.UndefOr[IDocumentProviderFactory] = js.undefined
      
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
        * The application language translator.
        */
      var translator: js.UndefOr[ITranslator] = js.undefined
      
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
      
      @scala.inline
      implicit open class MutableBuilder[Self <: IOptions] (val x: Self) extends AnyVal {
        
        inline def setCollaborative(value: Boolean): Self = StObject.set(x, "collaborative", value.asInstanceOf[js.Any])
        
        inline def setCollaborativeUndefined: Self = StObject.set(x, "collaborative", js.undefined)
        
        inline def setDocProviderFactory(
          value: /* options */ typings.jupyterlabDocprovider.libTokensMod.IDocumentProviderFactory.IOptions => IDocumentProvider
        ): Self = StObject.set(x, "docProviderFactory", js.Any.fromFunction1(value))
        
        inline def setDocProviderFactoryUndefined: Self = StObject.set(x, "docProviderFactory", js.undefined)
        
        inline def setManager(value: IManager): Self = StObject.set(x, "manager", value.asInstanceOf[js.Any])
        
        inline def setOpener(value: IWidgetOpener): Self = StObject.set(x, "opener", value.asInstanceOf[js.Any])
        
        inline def setRegistry(value: DocumentRegistry): Self = StObject.set(x, "registry", value.asInstanceOf[js.Any])
        
        inline def setSessionDialogs(value: IDialogs): Self = StObject.set(x, "sessionDialogs", value.asInstanceOf[js.Any])
        
        inline def setSessionDialogsUndefined: Self = StObject.set(x, "sessionDialogs", js.undefined)
        
        inline def setSetBusy(value: () => IDisposable): Self = StObject.set(x, "setBusy", js.Any.fromFunction0(value))
        
        inline def setSetBusyUndefined: Self = StObject.set(x, "setBusy", js.undefined)
        
        inline def setTranslator(value: ITranslator): Self = StObject.set(x, "translator", value.asInstanceOf[js.Any])
        
        inline def setTranslatorUndefined: Self = StObject.set(x, "translator", js.undefined)
        
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
