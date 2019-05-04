package typings
package atJupyterlabCoreutilsLib.libActivitymonitorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@jupyterlab/coreutils/lib/activitymonitor", "ActivityMonitor")
@js.native
class ActivityMonitor[Sender, Args] protected ()
  extends atPhosphorDisposableLib.atPhosphorDisposableMod.IDisposable {
  /**
    * Construct a new activity monitor.
    */
  def this(options: atJupyterlabCoreutilsLib.libActivitymonitorMod.ActivityMonitorNs.IOptions[Sender, Args]) = this()
  var _activityStopped: js.Any = js.native
  var _args: js.Any = js.native
  var _isDisposed: js.Any = js.native
  /**
    * A signal handler for the monitored signal.
    */
  var _onSignalFired: js.Any = js.native
  var _sender: js.Any = js.native
  var _timeout: js.Any = js.native
  var _timer: js.Any = js.native
  /**
    * A signal emitted when activity has ceased.
    */
  val activityStopped: atPhosphorSignalingLib.atPhosphorSignalingMod.ISignal[
    this.type, 
    atJupyterlabCoreutilsLib.libActivitymonitorMod.ActivityMonitorNs.IArguments[Sender, Args]
  ] = js.native
  /**
    * Test whether the object has been disposed.
    *
    * #### Notes
    * This property is always safe to access.
    */
  /* CompleteClass */
  override val isDisposed: scala.Boolean = js.native
  /**
    * The timeout associated with the monitor, in milliseconds.
    */
  var timeout: scala.Double = js.native
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

