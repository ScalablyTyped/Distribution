package typings.jupyterlabServices.terminalManagerMod

import typings.jupyterlabServices.terminalManagerMod.TerminalManager.IOptions
import typings.jupyterlabServices.terminalTerminalMod.TerminalSession.IManager
import typings.jupyterlabServices.terminalTerminalMod.TerminalSession.IModel
import typings.jupyterlabServices.terminalTerminalMod.TerminalSession.ISession
import typings.phosphorSignaling.mod.ISignal
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@jupyterlab/services/lib/terminal/manager", "TerminalManager")
@js.native
/**
  * Construct a new terminal manager.
  */
class TerminalManager_ () extends IManager {
  def this(options: IOptions) = this()
  var _connectionFailure: js.Any = js.native
  /**
    * Get a set of options to pass.
    */
  var _getOptions: js.Any = js.native
  var _isDisposed: js.Any = js.native
  var _isReady: js.Any = js.native
  var _models: js.Any = js.native
  /**
    * Handle a session starting.
    */
  var _onStarted: js.Any = js.native
  /**
    * Handle a session terminating.
    */
  var _onTerminated: js.Any = js.native
  var _pollModels: js.Any = js.native
  var _ready: js.Any = js.native
  var _runningChanged: js.Any = js.native
  var _sessions: js.Any = js.native
  /**
    * A signal emitted when there is a connection failure.
    */
  @JSName("connectionFailure")
  val connectionFailure_TerminalManager_ : ISignal[this.type, Error] = js.native
  /**
    * Test whether the object has been disposed.
    *
    * #### Notes
    * This property is always safe to access.
    */
  /* CompleteClass */
  override val isDisposed: Boolean = js.native
  /**
    * A signal emitted when the running terminals change.
    */
  @JSName("runningChanged")
  val runningChanged_TerminalManager_ : ISignal[this.type, js.Array[IModel]] = js.native
  def connectTo(name: String, options: typings.jupyterlabServices.terminalTerminalMod.TerminalSession.IOptions): js.Promise[ISession] = js.native
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
    * Execute a request to the server to poll running terminals and update state.
    */
  /* protected */ def requestRunning(): js.Promise[Unit] = js.native
}

