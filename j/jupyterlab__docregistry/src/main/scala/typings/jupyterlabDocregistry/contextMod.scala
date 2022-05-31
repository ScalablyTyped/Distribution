package typings.jupyterlabDocregistry

import typings.jupyterlabApputils.mod.SessionContext
import typings.jupyterlabApputils.sessioncontextMod.ISessionContext.IDialogs
import typings.jupyterlabApputils.sessioncontextMod.ISessionContext.IKernelPreference
import typings.jupyterlabDocregistry.contextMod.Context.IOptions
import typings.jupyterlabDocregistry.registryMod.DocumentRegistry.IContext
import typings.jupyterlabDocregistry.registryMod.DocumentRegistry.IModel
import typings.jupyterlabDocregistry.registryMod.DocumentRegistry.IModelFactory
import typings.jupyterlabDocregistry.registryMod.DocumentRegistry.SaveState
import typings.jupyterlabObservables.modeldbMod.ModelDB.IFactory
import typings.jupyterlabServices.libManagerMod.ServiceManager.IManager
import typings.luminoDisposable.mod.IDisposable
import typings.luminoSignaling.mod.ISignal
import typings.luminoWidgets.mod.Widget
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object contextMod {
  
  @JSImport("@jupyterlab/docregistry/lib/context", "Context")
  @js.native
  class Context[T /* <: IModel */] protected ()
    extends StObject
       with IContext[T] {
    /**
      * Construct a new document context.
      */
    def this(options: IOptions[T]) = this()
    
    /* private */ var _contentsModel: js.Any = js.native
    
    /* private */ var _dialogs: js.Any = js.native
    
    /* private */ var _disposed: js.Any = js.native
    
    /* private */ var _factory: js.Any = js.native
    
    /* private */ var _fileChanged: js.Any = js.native
    
    /**
      * Finish a saveAs operation given a new path.
      */
    /* private */ var _finishSaveAs: js.Any = js.native
    
    /**
      * Handle a save/load error with a dialog.
      */
    /* private */ var _handleError: js.Any = js.native
    
    /* private */ var _isDisposed: js.Any = js.native
    
    /* private */ var _isPopulated: js.Any = js.native
    
    /* private */ var _isReady: js.Any = js.native
    
    /* private */ var _manager: js.Any = js.native
    
    /**
      * Add a checkpoint the file is writable.
      */
    /* private */ var _maybeCheckpoint: js.Any = js.native
    
    /**
      * Handle a time conflict.
      */
    /* private */ var _maybeOverWrite: js.Any = js.native
    
    /**
      * Save a file, dealing with conflicts.
      */
    /* private */ var _maybeSave: js.Any = js.native
    
    /* private */ var _model: js.Any = js.native
    
    /* private */ var _modelDB: js.Any = js.native
    
    /**
      * Handle a change on the contents manager.
      */
    /* private */ var _onFileChanged: js.Any = js.native
    
    /**
      * Handle a change to a session property.
      */
    /* private */ var _onSessionChanged: js.Any = js.native
    
    /* private */ var _opener: js.Any = js.native
    
    /* private */ var _path: js.Any = js.native
    
    /* private */ var _pathChanged: js.Any = js.native
    
    /**
      * Handle an initial population.
      */
    /* private */ var _populate: js.Any = js.native
    
    /* private */ var _populatedPromise: js.Any = js.native
    
    /* private */ var _readyPromise: js.Any = js.native
    
    /**
      * Revert the document contents to disk contents.
      *
      * @param initializeModel - call the model's initialization function after
      * deserializing the content.
      */
    /* private */ var _revert: js.Any = js.native
    
    /**
      * Save the document contents to disk.
      */
    /* private */ var _save: js.Any = js.native
    
    /* private */ var _saveState: js.Any = js.native
    
    /**
      * Handle a time conflict.
      */
    /* private */ var _timeConflict: js.Any = js.native
    
    /**
      * Update our contents model, without the content.
      */
    /* private */ var _updateContentsModel: js.Any = js.native
    
    /* private */ var _useCRLF: js.Any = js.native
    
    /**
      * The current contents model associated with the document.
      *
      * #### Notes
      * The contents model will be null until the context is populated.
      * It will have an  empty `contents` field.
      */
    @JSName("contentsModel")
    def contentsModel_MContext: typings.jupyterlabServices.contentsMod.Contents.IModel | Null = js.native
    
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
      * A signal emitted when the context is disposed.
      */
    @JSName("disposed")
    def disposed_MContext: ISignal[this.type, Unit] = js.native
    
    /**
      * Get the model factory name.
      *
      * #### Notes
      * This is not part of the `IContext` API.
      */
    def factoryName: String = js.native
    
    /**
      * A signal emitted when the model is saved or reverted.
      */
    @JSName("fileChanged")
    def fileChanged_MContext: ISignal[this.type, typings.jupyterlabServices.contentsMod.Contents.IModel] = js.native
    
    /**
      * Initialize the context.
      *
      * @param isNew - Whether it is a new file.
      *
      * @returns a promise that resolves upon initialization.
      */
    def initialize(isNew: Boolean): js.Promise[Unit] = js.native
    
    /**
      * Test whether the object has been disposed.
      *
      * #### Notes
      * This property is always safe to access.
      */
    /* CompleteClass */
    override val isDisposed: Boolean = js.native
    /**
      * Test whether the context is disposed.
      */
    @JSName("isDisposed")
    def isDisposed_MContext: Boolean = js.native
    
    /**
      * Whether the context is ready.
      */
    @JSName("isReady")
    def isReady_MContext: Boolean = js.native
    
    /**
      * The current local path associated with the document.
      * If the document is in the default notebook file browser,
      * this is the same as the path.
      */
    @JSName("localPath")
    def localPath_MContext: String = js.native
    
    /**
      * Get the model associated with the document.
      */
    @JSName("model")
    def model_MContext: T = js.native
    
    /**
      * A signal emitted when the path changes.
      */
    @JSName("pathChanged")
    def pathChanged_MContext: ISignal[this.type, String] = js.native
    
    /**
      * The current path associated with the document.
      */
    @JSName("path")
    def path_MContext: String = js.native
    
    /**
      * A promise that is fulfilled when the context is ready.
      */
    @JSName("ready")
    def ready_MContext: js.Promise[Unit] = js.native
    
    /**
      * A signal emitted on the start and end of a saving operation.
      */
    @JSName("saveState")
    def saveState_MContext: ISignal[this.type, SaveState] = js.native
    
    /**
      * The client session object associated with the context.
      */
    @JSName("sessionContext")
    val sessionContext_Context: SessionContext = js.native
  }
  object Context {
    
    /**
      * The options used to initialize a context.
      */
    trait IOptions[T /* <: IModel */] extends StObject {
      
      /**
        * The model factory used to create the model.
        */
      var factory: IModelFactory[T]
      
      /**
        * The kernel preference associated with the context.
        */
      var kernelPreference: js.UndefOr[IKernelPreference] = js.undefined
      
      /**
        * A service manager instance.
        */
      var manager: IManager
      
      /**
        * An IModelDB factory method which may be used for the document.
        */
      var modelDBFactory: js.UndefOr[IFactory] = js.undefined
      
      /**
        * An optional callback for opening sibling widgets.
        */
      var opener: js.UndefOr[js.Function1[/* widget */ Widget, Unit]] = js.undefined
      
      /**
        * The initial path of the file.
        */
      var path: String
      
      /**
        * The dialogs used for the session context.
        */
      var sessionDialogs: js.UndefOr[IDialogs] = js.undefined
      
      /**
        * A function to call when the kernel is busy.
        */
      var setBusy: js.UndefOr[js.Function0[IDisposable]] = js.undefined
    }
    object IOptions {
      
      inline def apply[T /* <: IModel */](factory: IModelFactory[T], manager: IManager, path: String): IOptions[T] = {
        val __obj = js.Dynamic.literal(factory = factory.asInstanceOf[js.Any], manager = manager.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any])
        __obj.asInstanceOf[IOptions[T]]
      }
      
      extension [Self <: IOptions[?], T /* <: IModel */](x: Self & IOptions[T]) {
        
        inline def setFactory(value: IModelFactory[T]): Self = StObject.set(x, "factory", value.asInstanceOf[js.Any])
        
        inline def setKernelPreference(value: IKernelPreference): Self = StObject.set(x, "kernelPreference", value.asInstanceOf[js.Any])
        
        inline def setKernelPreferenceUndefined: Self = StObject.set(x, "kernelPreference", js.undefined)
        
        inline def setManager(value: IManager): Self = StObject.set(x, "manager", value.asInstanceOf[js.Any])
        
        inline def setModelDBFactory(value: IFactory): Self = StObject.set(x, "modelDBFactory", value.asInstanceOf[js.Any])
        
        inline def setModelDBFactoryUndefined: Self = StObject.set(x, "modelDBFactory", js.undefined)
        
        inline def setOpener(value: /* widget */ Widget => Unit): Self = StObject.set(x, "opener", js.Any.fromFunction1(value))
        
        inline def setOpenerUndefined: Self = StObject.set(x, "opener", js.undefined)
        
        inline def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
        
        inline def setSessionDialogs(value: IDialogs): Self = StObject.set(x, "sessionDialogs", value.asInstanceOf[js.Any])
        
        inline def setSessionDialogsUndefined: Self = StObject.set(x, "sessionDialogs", js.undefined)
        
        inline def setSetBusy(value: () => IDisposable): Self = StObject.set(x, "setBusy", js.Any.fromFunction0(value))
        
        inline def setSetBusyUndefined: Self = StObject.set(x, "setBusy", js.undefined)
      }
    }
  }
}
