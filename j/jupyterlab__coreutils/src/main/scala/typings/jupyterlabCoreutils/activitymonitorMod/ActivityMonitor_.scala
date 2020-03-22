package typings.jupyterlabCoreutils.activitymonitorMod

import typings.jupyterlabCoreutils.activitymonitorMod.ActivityMonitor.IArguments
import typings.jupyterlabCoreutils.activitymonitorMod.ActivityMonitor.IOptions
import typings.luminoDisposable.mod.IDisposable
import typings.luminoSignaling.mod.ISignal
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@jupyterlab/coreutils/lib/activitymonitor", "ActivityMonitor")
@js.native
class ActivityMonitor_[Sender, Args] protected () extends IDisposable {
  /**
    * Construct a new activity monitor.
    */
  def this(options: IOptions[Sender, Args]) = this()
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
    * Test whether the object has been disposed.
    *
    * #### Notes
    * This property is always safe to access.
    */
  /* CompleteClass */
  override val isDisposed: Boolean = js.native
  /**
    * A signal emitted when activity has ceased.
    */
  def activityStopped(): ISignal[this.type, IArguments[Sender, Args]] = js.native
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
    * Test whether the monitor has been disposed.
    *
    * #### Notes
    * This is a read-only property.
    */
  @JSName("isDisposed")
  def isDisposed_MActivityMonitor_(): Boolean = js.native
  /**
    * The timeout associated with the monitor, in milliseconds.
    */
  def timeout(): Double = js.native
  def timeout(value: Double): js.Any = js.native
}

