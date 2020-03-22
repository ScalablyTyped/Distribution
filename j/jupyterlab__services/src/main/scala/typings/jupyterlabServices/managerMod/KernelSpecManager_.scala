package typings.jupyterlabServices.managerMod

import typings.jupyterlabServices.basemanagerMod.BaseManager
import typings.jupyterlabServices.kernelspecKernelspecMod.IManager
import typings.jupyterlabServices.managerMod.KernelSpecManager.IOptions
import typings.jupyterlabServices.restapiMod.ISpecModels
import typings.luminoSignaling.mod.ISignal
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- typings.luminoDisposable.mod.IDisposable because Already inherited
- typings.luminoDisposable.mod.IObservableDisposable because Already inherited
- typings.jupyterlabServices.basemanagerMod.IManager because Already inherited
- typings.jupyterlabServices.kernelspecKernelspecMod.IManager because var conflicts: connectionFailure, disposed, isDisposed, isReady, ready. Inlined specsChanged, specs, refreshSpecs */ @JSImport("@jupyterlab/services/lib/kernelspec/manager", "KernelSpecManager")
@js.native
/**
  * Construct a new kernel spec manager.
  *
  * @param options - The default options for kernel.
  */
class KernelSpecManager_ () extends BaseManager {
  def this(options: IOptions) = this()
  var _connectionFailure: js.Any = js.native
  var _isReady: js.Any = js.native
  var _pollSpecs: js.Any = js.native
  var _ready: js.Any = js.native
  var _specs: js.Any = js.native
  var _specsChanged: js.Any = js.native
  /**
    * A signal emitted when the kernel specs change.
    */
  @JSName("specsChanged")
  var specsChanged_FKernelSpecManager_ : ISignal[IManager, ISpecModels] = js.native
  /**
    * The kernel spec models.
    *
    * #### Notes
    * The value will be null until the manager is ready.
    */
  @JSName("specs")
  val specs_FKernelSpecManager_ : ISpecModels | Null = js.native
  /**
    * A signal emitted when there is a connection failure.
    */
  @JSName("connectionFailure")
  def connectionFailure_MKernelSpecManager_(): ISignal[this.type, Error] = js.native
  /**
    * Test whether the manager is ready.
    */
  @JSName("isReady")
  def isReady_MKernelSpecManager_(): Boolean = js.native
  /**
    * A promise that fulfills when the manager is ready.
    */
  @JSName("ready")
  def ready_MKernelSpecManager_(): js.Promise[Unit] = js.native
  /**
    * Force a refresh of the specs from the server.
    *
    * @returns A promise that resolves when the specs are fetched.
    *
    * #### Notes
    * This is intended to be called only in response to a user action,
    * since the manager maintains its internal state.
    */
  def refreshSpecs(): js.Promise[Unit] = js.native
  /**
    * Execute a request to the server to poll specs and update state.
    */
  /* protected */ def requestSpecs(): js.Promise[Unit] = js.native
  /**
    * Get the most recently fetched kernel specs.
    */
  def specs(): ISpecModels | Null = js.native
  /**
    * A signal emitted when the specs change.
    */
  def specsChanged(): ISignal[this.type, ISpecModels] = js.native
}

