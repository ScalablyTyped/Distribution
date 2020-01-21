package typings.jupyterlabServices.kernelKernelMod.Kernel

import typings.jupyterlabServices.mod.ServerConnection.NetworkError
import typings.jupyterlabServices.serverconnectionMod.ServerConnection.ISettings
import typings.phosphorAlgorithm.iterMod.IIterator
import typings.phosphorDisposable.mod.IDisposable
import typings.phosphorSignaling.mod.ISignal
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Object which manages kernel instances for a given base url.
  *
  * #### Notes
  * The manager is responsible for maintaining the state of running
  * kernels and the initial fetch of kernel specs.
  */
@js.native
trait IManager extends IDisposable {
  /**
    * A signal emitted when there is a connection failure.
    */
  var connectionFailure: ISignal[IManager, NetworkError] = js.native
  /**
    * Whether the manager is ready.
    */
  val isReady: Boolean = js.native
  /**
    * A promise that resolves when the manager is initially ready.
    */
  val ready: js.Promise[Unit] = js.native
  /**
    * A signal emitted when the running kernels change.
    */
  var runningChanged: ISignal[IManager, js.Array[IModel]] = js.native
  /**
    * The server settings for the manager.
    */
  var serverSettings: js.UndefOr[ISettings] = js.native
  /**
    * The kernel spec models.
    *
    * #### Notes
    * The value will be null until the manager is ready.
    */
  val specs: ISpecModels | Null = js.native
  /**
    * A signal emitted when the kernel specs change.
    */
  var specsChanged: ISignal[IManager, ISpecModels] = js.native
  /**
    * Connect to an existing kernel.
    *
    * @param model - The model of the target kernel.
    *
    * @returns A promise that resolves with the new kernel instance.
    */
  def connectTo(model: IModel): IKernel = js.native
  /**
    * Find a kernel by id.
    *
    * @param id - The id of the target kernel.
    *
    * @returns A promise that resolves with the kernel's model.
    */
  def findById(id: String): js.Promise[IModel] = js.native
  /**
    * Force a refresh of the running kernels.
    *
    * @returns A promise that resolves when the models are refreshed.
    *
    * #### Notes
    * This is intended to be called only in response to a user action,
    * since the manager maintains its internal state.
    */
  def refreshRunning(): js.Promise[Unit] = js.native
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
    * Create an iterator over the known running kernels.
    *
    * @returns A new iterator over the running kernels.
    */
  def running(): IIterator[IModel] = js.native
  /**
    * Shut down a kernel by id.
    *
    * @param id - The id of the target kernel.
    *
    * @returns A promise that resolves when the operation is complete.
    */
  def shutdown(id: String): js.Promise[Unit] = js.native
  /**
    * Shut down all kernels.
    *
    * @returns A promise that resolves when all of the kernels are shut down.
    */
  def shutdownAll(): js.Promise[Unit] = js.native
  /**
    * Start a new kernel.
    *
    * @param options - The kernel options to use.
    *
    * @returns A promise that resolves with the kernel instance.
    *
    * #### Notes
    * The manager `serverSettings` will be always be used.
    */
  def startNew(): js.Promise[IKernel] = js.native
  def startNew(options: IOptions): js.Promise[IKernel] = js.native
}

