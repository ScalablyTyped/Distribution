package typings
package atJupyterlabServicesLib.libKernelManagerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@jupyterlab/services/lib/kernel/manager", "KernelManager")
@js.native
/**
  * Construct a new kernel manager.
  *
  * @param options - The default options for kernel.
  */
class KernelManager ()
  extends atJupyterlabServicesLib.libKernelKernelMod.KernelNs.IManager {
  def this(options: atJupyterlabServicesLib.libKernelManagerMod.KernelManagerNs.IOptions) = this()
  var _isDisposed: js.Any = js.native
  var _isReady: js.Any = js.native
  var _kernels: js.Any = js.native
  var _models: js.Any = js.native
  var _modelsTimer: js.Any = js.native
  /**
    * Handle a kernel starting.
    */
  var _onStarted: js.Any = js.native
  /**
    * Handle a kernel terminating.
    */
  var _onTerminated: js.Any = js.native
  var _readyPromise: js.Any = js.native
  /**
    * Refresh the running sessions.
    */
  var _refreshRunning: js.Any = js.native
  /**
    * Refresh the specs.
    */
  var _refreshSpecs: js.Any = js.native
  var _runningChanged: js.Any = js.native
  var _specs: js.Any = js.native
  var _specsChanged: js.Any = js.native
  var _specsTimer: js.Any = js.native
  /**
    * Test whether the object has been disposed.
    *
    * #### Notes
    * This property is always safe to access.
    */
  /* CompleteClass */
  override val isDisposed: scala.Boolean = js.native
  /**
    * A signal emitted when the running kernels change.
    */
  @JSName("runningChanged")
  val runningChanged_KernelManager: atPhosphorSignalingLib.atPhosphorSignalingMod.ISignal[this.type, js.Array[atJupyterlabServicesLib.libKernelKernelMod.KernelNs.IModel]] = js.native
  /**
    * A signal emitted when the specs change.
    */
  @JSName("specsChanged")
  val specsChanged_KernelManager: atPhosphorSignalingLib.atPhosphorSignalingMod.ISignal[this.type, atJupyterlabServicesLib.libKernelKernelMod.KernelNs.ISpecModels] = js.native
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

