package typings.jupyterlabServices.terminalManagerMod

import typings.jupyterlabServices.anon.OmitIOptionsserverSettingModel
import typings.jupyterlabServices.basemanagerMod.BaseManager
import typings.jupyterlabServices.terminalManagerMod.TerminalManager.IOptions
import typings.jupyterlabServices.terminalRestapiMod.IModel
import typings.jupyterlabServices.terminalTerminalMod.IManager
import typings.jupyterlabServices.terminalTerminalMod.ITerminalConnection
import typings.luminoAlgorithm.iterMod.IIterator
import typings.luminoSignaling.mod.ISignal
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.luminoDisposable.mod.IDisposable because Already inherited
- typings.luminoDisposable.mod.IObservableDisposable because Already inherited
- typings.jupyterlabServices.basemanagerMod.IManager because Already inherited
- typings.jupyterlabServices.terminalTerminalMod.IManager because var conflicts: connectionFailure, disposed, isDisposed, isReady, ready. Inlined runningChanged, isAvailable, running, startNew, startNew, connectTo, shutdown, shutdownAll, refreshRunning */ @JSImport("@jupyterlab/services/lib/terminal/manager", "TerminalManager")
@js.native
/**
  * Construct a new terminal manager.
  */
class TerminalManager_ () extends BaseManager {
  def this(options: IOptions) = this()
  var _connectionFailure: js.Any = js.native
  var _isReady: js.Any = js.native
  var _names: js.Any = js.native
  /**
    * Handle a session terminating.
    */
  var _onDisposed: js.Any = js.native
  /**
    * Handle a session starting.
    */
  var _onStarted: js.Any = js.native
  var _pollModels: js.Any = js.native
  var _ready: js.Any = js.native
  var _runningChanged: js.Any = js.native
  var _terminalConnections: js.Any = js.native
  /**
    * A signal emitted when the running terminals change.
    */
  @JSName("runningChanged")
  var runningChanged_FTerminalManager_ : ISignal[IManager, js.Array[IModel]] = js.native
  /* private */ def _models: js.Any = js.native
  def connectTo(options: OmitIOptionsserverSettingModel): ITerminalConnection = js.native
  /**
    * A signal emitted when there is a connection failure.
    */
  @JSName("connectionFailure")
  def connectionFailure_MTerminalManager_ : ISignal[this.type, Error] = js.native
  /**
    * Whether the terminal service is available.
    */
  def isAvailable(): Boolean = js.native
  /**
    * Test whether the manager is ready.
    */
  @JSName("isReady")
  def isReady_MTerminalManager_ : Boolean = js.native
  /**
    * A promise that fulfills when the manager is ready.
    */
  @JSName("ready")
  def ready_MTerminalManager_ : js.Promise[Unit] = js.native
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
  def running(): IIterator[IModel] = js.native
  /**
    * A signal emitted when the running terminals change.
    */
  def runningChanged: ISignal[this.type, js.Array[IModel]] = js.native
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
    * @returns A promise that resolves with the terminal instance.
    *
    * #### Notes
    * The manager `serverSettings` will be used unless overridden in the
    * options.
    */
  /**
    * Create a new terminal session.
    *
    * @param options - The options used to create the session.
    *
    * @returns A promise that resolves with the terminal instance.
    *
    * #### Notes
    * The manager `serverSettings` will be always be used.
    */
  def startNew(): js.Promise[ITerminalConnection] = js.native
  def startNew(options: typings.jupyterlabServices.terminalTerminalMod.ITerminalConnection.IOptions): js.Promise[ITerminalConnection] = js.native
}

