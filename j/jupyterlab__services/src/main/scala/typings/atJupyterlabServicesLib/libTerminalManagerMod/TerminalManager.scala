package typings
package atJupyterlabServicesLib.libTerminalManagerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@jupyterlab/services/lib/terminal/manager", "TerminalManager")
@js.native
/**
  * Construct a new terminal manager.
  */
class TerminalManager ()
  extends atJupyterlabServicesLib.libTerminalTerminalMod.TerminalSessionNs.IManager {
  def this(options: atJupyterlabServicesLib.libTerminalManagerMod.TerminalManagerNs.IOptions) = this()
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
  var _readyPromise: js.Any = js.native
  /**
    * Refresh the running sessions.
    */
  var _refreshRunning: js.Any = js.native
  var _refreshTimer: js.Any = js.native
  var _runningChanged: js.Any = js.native
  var _sessions: js.Any = js.native
  /**
    * Test whether the object has been disposed.
    *
    * #### Notes
    * This property is always safe to access.
    */
  /* CompleteClass */
  override val isDisposed: scala.Boolean = js.native
  /**
    * A signal emitted when the running terminals change.
    */
  @JSName("runningChanged")
  val runningChanged_TerminalManager: atPhosphorSignalingLib.atPhosphorSignalingMod.ISignal[
    this.type, 
    js.Array[atJupyterlabServicesLib.libTerminalTerminalMod.TerminalSessionNs.IModel]
  ] = js.native
  def connectTo(
    name: java.lang.String,
    options: atJupyterlabServicesLib.libTerminalTerminalMod.TerminalSessionNs.IOptions
  ): js.Promise[atJupyterlabServicesLib.libTerminalTerminalMod.TerminalSessionNs.ISession] = js.native
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
  override def dispose(): scala.Unit = js.native
}

