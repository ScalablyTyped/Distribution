package typings.jupyterlabServices

import typings.jupyterlabServices.anon.OmitIOptionsconnectToKern
import typings.jupyterlabServices.anon.OmitIOptionsmodelconnectT
import typings.jupyterlabServices.libBasemanagerMod.BaseManager
import typings.jupyterlabServices.libKernelKernelMod.IManager
import typings.jupyterlabServices.libSessionManagerMod.SessionManager.IOptions
import typings.jupyterlabServices.libSessionSessionMod.IModel
import typings.jupyterlabServices.libSessionSessionMod.ISessionConnection
import typings.jupyterlabServices.libSessionSessionMod.ISessionOptions
import typings.luminoAlgorithm.typesIterMod.IIterator
import typings.luminoPolling.typesPollMod.Poll.Standby
import typings.luminoSignaling.mod.ISignal
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libSessionManagerMod {
  
  /* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
  - typings.luminoDisposable.mod.IDisposable because Already inherited
  - typings.jupyterlabServices.libSessionSessionMod.IManager because var conflicts: connectionFailure, isDisposed, isReady, ready, serverSettings. Inlined runningChanged, running, startNew, startNew, findById, findByPath, connectTo, shutdown, shutdownAll, refreshRunning, stopIfNeeded */ @JSImport("@jupyterlab/services/lib/session/manager", "SessionManager")
  @js.native
  open class SessionManager protected () extends BaseManager {
    /**
      * Construct a new session manager.
      *
      * @param options - The default options for each session.
      */
    def this(options: IOptions) = this()
    
    /* private */ val _connectToKernel: Any = js.native
    
    /* private */ var _connectionFailure: Any = js.native
    
    /* private */ var _isReady: Any = js.native
    
    /* private */ var _kernelManager: Any = js.native
    
    /* private */ var _models: Any = js.native
    
    /* private */ var _onChanged: Any = js.native
    
    /* private */ var _onDisposed: Any = js.native
    
    /**
      * Handle a session starting.
      */
    /* private */ var _onStarted: Any = js.native
    
    /* private */ var _pollModels: Any = js.native
    
    /* private */ var _ready: Any = js.native
    
    /* private */ var _runningChanged: Any = js.native
    
    /* private */ var _sessionConnections: Any = js.native
    
    /**
      * Connect to a running session.
      *
      * @param model - The model of the target session.
      *
      * @param options - The session options to use.
      *
      * @returns The new session instance.
      */
    def connectTo(options: OmitIOptionsconnectToKern): ISessionConnection = js.native
    
    /**
      * A signal emitted when there is a connection failure.
      */
    @JSName("connectionFailure")
    def connectionFailure_MSessionManager: ISignal[this.type, js.Error] = js.native
    
    /**
      * Find a session by id.
      */
    /**
      * Find a session by id.
      *
      * @param id - The id of the target session.
      *
      * @returns A promise that resolves with the session's model.
      */
    def findById(id: String): js.Promise[js.UndefOr[IModel]] = js.native
    
    /**
      * Find a session by path.
      */
    /**
      * Find a session by path.
      *
      * @param path - The path of the target session.
      *
      * @returns A promise that resolves with the session's model.
      */
    def findByPath(path: String): js.Promise[js.UndefOr[IModel]] = js.native
    
    /**
      * Test whether the manager is ready.
      */
    @JSName("isReady")
    def isReady_MSessionManager: Boolean = js.native
    
    /**
      * A promise that fulfills when the manager is ready.
      */
    @JSName("ready")
    def ready_MSessionManager: js.Promise[Unit] = js.native
    
    /**
      * Force a refresh of the running sessions.
      *
      * @returns A promise that with the list of running sessions.
      *
      * #### Notes
      * This is not typically meant to be called by the user, since the
      * manager maintains its own internal state.
      */
    /**
      * Force a refresh of the running sessions.
      *
      * @returns A promise that resolves when the models are refreshed.
      *
      * #### Notes
      * This is intended to be called only in response to a user action,
      * since the manager maintains its internal state.
      */
    def refreshRunning(): js.Promise[Unit] = js.native
    
    /**
      * Execute a request to the server to poll running kernels and update state.
      */
    /* protected */ def requestRunning(): js.Promise[Unit] = js.native
    
    /**
      * Create an iterator over the most recent running sessions.
      *
      * @returns A new iterator over the running sessions.
      */
    /**
      * Create an iterator over the known running sessions.
      *
      * @returns A new iterator over the running sessions.
      */
    def running(): IIterator[IModel] = js.native
    
    /**
      * A signal emitted when the running sessions change.
      */
    def runningChanged: ISignal[this.type, js.Array[IModel]] = js.native
    /**
      * A signal emitted when the running sessions change.
      */
    @JSName("runningChanged")
    var runningChanged_FSessionManager: ISignal[this.type, js.Array[IModel]] = js.native
    
    /**
      * Shut down a session by id.
      */
    /**
      * Shut down a session by id.
      *
      * @param id - The id of the target kernel.
      *
      * @returns A promise that resolves when the operation is complete.
      */
    def shutdown(id: String): js.Promise[Unit] = js.native
    
    /**
      * Shut down all sessions.
      *
      * @returns A promise that resolves when all of the kernels are shut down.
      */
    /**
      * Shut down all sessions.
      *
      * @returns A promise that resolves when all of the sessions are shut down.
      */
    def shutdownAll(): js.Promise[Unit] = js.native
    
    /**
      * Start a new session.  See also [[startNewSession]].
      *
      * @param createOptions - Options for creating the session
      *
      * @param connectOptions - Options for connecting to the session
      */
    /**
      * Start a new session.
      *
      * @param createOptions - Options for creating the session
      *
      * @param connectOptions - Options for connecting to the session
      *
      * @returns A promise that resolves with a session connection instance.
      *
      * #### Notes
      * The `serverSettings` and `connectToKernel` options of the manager will be used.
      */
    def startNew(createOptions: ISessionOptions): js.Promise[ISessionConnection] = js.native
    def startNew(createOptions: ISessionOptions, connectOptions: OmitIOptionsmodelconnectT): js.Promise[ISessionConnection] = js.native
    
    /**
      * Find a session associated with a path and stop it if it is the only session
      * using that kernel.
      *
      * @param path - The path in question.
      *
      * @returns A promise that resolves when the relevant sessions are stopped.
      */
    /**
      * Find a session associated with a path and stop it is the only session
      * using that kernel.
      *
      * @param path - The path in question.
      *
      * @returns A promise that resolves when the relevant sessions are stopped.
      */
    def stopIfNeeded(path: String): js.Promise[Unit] = js.native
  }
  object SessionManager {
    
    /**
      * The options used to initialize a SessionManager.
      */
    trait IOptions
      extends StObject
         with typings.jupyterlabServices.libBasemanagerMod.BaseManager.IOptions {
      
      /**
        * Kernel Manager
        */
      var kernelManager: IManager
      
      /**
        * When the manager stops polling the API. Defaults to `when-hidden`.
        */
      var standby: js.UndefOr[Standby] = js.undefined
    }
    object IOptions {
      
      inline def apply(kernelManager: IManager): IOptions = {
        val __obj = js.Dynamic.literal(kernelManager = kernelManager.asInstanceOf[js.Any])
        __obj.asInstanceOf[IOptions]
      }
      
      @scala.inline
      implicit open class MutableBuilder[Self <: IOptions] (val x: Self) extends AnyVal {
        
        inline def setKernelManager(value: IManager): Self = StObject.set(x, "kernelManager", value.asInstanceOf[js.Any])
        
        inline def setStandby(value: Standby): Self = StObject.set(x, "standby", value.asInstanceOf[js.Any])
        
        inline def setStandbyUndefined: Self = StObject.set(x, "standby", js.undefined)
      }
    }
  }
}
