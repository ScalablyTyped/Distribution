package typings.jupyterlabServices

import typings.jupyterlabServices.anon.OmitIOptionsserverSettingModel
import typings.jupyterlabServices.libBasemanagerMod.BaseManager
import typings.jupyterlabServices.libTerminalManagerMod.TerminalManager.IOptions
import typings.jupyterlabServices.libTerminalRestapiMod.IModel
import typings.jupyterlabServices.libTerminalTerminalMod.IManager
import typings.jupyterlabServices.libTerminalTerminalMod.ITerminalConnection
import typings.luminoPolling.typesPollMod.Poll.Standby
import typings.luminoSignaling.mod.ISignal
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libTerminalManagerMod {
  
  /* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
  - typings.luminoDisposable.mod.IDisposable because Already inherited
  - typings.luminoDisposable.mod.IObservableDisposable because Already inherited
  - typings.jupyterlabServices.libBasemanagerMod.IManager because Already inherited
  - typings.jupyterlabServices.libTerminalTerminalMod.IManager because var conflicts: connectionFailure, disposed, isDisposed, isReady, ready. Inlined runningChanged, isAvailable, running, startNew, startNew, connectTo, shutdown, shutdownAll, refreshRunning */ @JSImport("@jupyterlab/services/lib/terminal/manager", "TerminalManager")
  @js.native
  /**
    * Construct a new terminal manager.
    */
  open class TerminalManager () extends BaseManager {
    def this(options: IOptions) = this()
    
    /* private */ var _connectionFailure: Any = js.native
    
    /* private */ var _isReady: Any = js.native
    
    /* private */ def _models: Any = js.native
    
    /* private */ var _names: Any = js.native
    
    /**
      * Handle a session terminating.
      */
    /* private */ var _onDisposed: Any = js.native
    
    /**
      * Handle a session starting.
      */
    /* private */ var _onStarted: Any = js.native
    
    /* private */ var _pollModels: Any = js.native
    
    /* private */ var _ready: Any = js.native
    
    /* private */ var _runningChanged: Any = js.native
    
    /* private */ var _terminalConnections: Any = js.native
    
    def connectTo(options: OmitIOptionsserverSettingModel): ITerminalConnection = js.native
    
    /**
      * A signal emitted when there is a connection failure.
      */
    @JSName("connectionFailure")
    def connectionFailure_MTerminalManager: ISignal[this.type, js.Error] = js.native
    
    /**
      * Whether the terminal service is available.
      */
    def isAvailable(): Boolean = js.native
    
    /**
      * Test whether the manager is ready.
      */
    @JSName("isReady")
    def isReady_MTerminalManager: Boolean = js.native
    
    /**
      * A promise that fulfills when the manager is ready.
      */
    @JSName("ready")
    def ready_MTerminalManager: js.Promise[Unit] = js.native
    
    /**
      * Force a refresh of the running terminals.
      *
      * @returns A promise that with the list of running terminals.
      *
      * #### Notes
      * This is intended to be called only in response to a user action,
      * since the manager maintains its internal state.
      */
    /**
      * Force a refresh of the running terminal sessions.
      *
      * @returns A promise that with the list of running sessions.
      *
      * #### Notes
      * This is not typically meant to be called by the user, since the
      * manager maintains its own internal state.
      */
    def refreshRunning(): js.Promise[Unit] = js.native
    
    /**
      * Execute a request to the server to poll running terminals and update state.
      */
    /* protected */ def requestRunning(): js.Promise[Unit] = js.native
    
    /**
      * Create an iterator over the most recent running terminals.
      *
      * @returns A new iterator over the running terminals.
      */
    /**
      * Create an iterator over the known running terminals.
      *
      * @returns A new iterator over the running terminals.
      */
    def running(): Any = js.native
    
    /**
      * A signal emitted when the running terminals change.
      */
    def runningChanged: ISignal[this.type, js.Array[IModel]] = js.native
    /**
      * A signal emitted when the running terminals change.
      */
    @JSName("runningChanged")
    var runningChanged_FTerminalManager: ISignal[IManager, js.Array[IModel]] = js.native
    
    /**
      * Shut down a terminal session by name.
      */
    /**
      * Shut down a terminal session by name.
      *
      * @param name - The name of the terminal session.
      *
      * @returns A promise that resolves when the session is shut down.
      */
    def shutdown(name: String): js.Promise[Unit] = js.native
    
    /**
      * Shut down all terminal sessions.
      *
      * @returns A promise that resolves when all of the sessions are shut down.
      */
    def shutdownAll(): js.Promise[Unit] = js.native
    
    /**
      * Create a new terminal session.
      *
      * @param options - The options used to create the terminal.
      *
      * @returns A promise that resolves with the terminal connection instance.
      *
      * #### Notes
      * The manager `serverSettings` will be used unless overridden in the
      * options.
      */
    /**
      * Create a new terminal session.
      *
      * @param options - The options used to create the terminal.
      *
      * @returns A promise that resolves with the terminal connection instance.
      *
      * #### Notes
      * The manager `serverSettings` will be always be used.
      */
    def startNew(): js.Promise[ITerminalConnection] = js.native
    def startNew(options: typings.jupyterlabServices.libTerminalTerminalMod.ITerminal.IOptions): js.Promise[ITerminalConnection] = js.native
  }
  object TerminalManager {
    
    /**
      * The options used to initialize a terminal manager.
      */
    trait IOptions
      extends StObject
         with typings.jupyterlabServices.libBasemanagerMod.BaseManager.IOptions {
      
      /**
        * When the manager stops polling the API. Defaults to `when-hidden`.
        */
      var standby: js.UndefOr[Standby] = js.undefined
    }
    object IOptions {
      
      inline def apply(): IOptions = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[IOptions]
      }
      
      @scala.inline
      implicit open class MutableBuilder[Self <: IOptions] (val x: Self) extends AnyVal {
        
        inline def setStandby(value: Standby): Self = StObject.set(x, "standby", value.asInstanceOf[js.Any])
        
        inline def setStandbyUndefined: Self = StObject.set(x, "standby", js.undefined)
      }
    }
  }
}
