package typings.atJupyterlabServices.atJupyterlabServicesMod

import typings.atJupyterlabServices.libKernelKernelMod.KernelNs.IKernel
import typings.atJupyterlabServices.libKernelKernelMod.KernelNs.IModel
import typings.atJupyterlabServices.libKernelKernelMod.KernelNs.IOptions
import typings.atJupyterlabServices.libKernelKernelMod.KernelNs.ISpecModels
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@jupyterlab/services", "Kernel")
@js.native
object KernelNs extends js.Object {
  /**
    * Connect to a running kernel.
    *
    * @param model - The model of the running kernel.
    *
    * @param settings - The server settings for the request.
    *
    * @returns The kernel object.
    *
    * #### Notes
    * If the kernel was already started via `startNewKernel`, the existing
    * Kernel object info is used to create another instance.
    */
  def connectTo(model: IModel): IKernel = js.native
  def connectTo(
    model: IModel,
    settings: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify ServerConnection.ISettings */ js.Any
  ): IKernel = js.native
  /**
    * Find a kernel by id.
    *
    * @param id - The id of the kernel of interest.
    *
    * @param settings - The optional server settings.
    *
    * @returns A promise that resolves with the model for the kernel.
    *
    * #### Notes
    * If the kernel was already started via `startNewKernel`, we return its
    * `Kernel.IModel`. Otherwise, we attempt to find the existing kernel. The
    * promise is fulfilled when the kernel is found, otherwise the promise is
    * rejected.
    */
  def findById(id: String): js.Promise[IModel] = js.native
  def findById(
    id: String,
    settings: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify ServerConnection.ISettings */ js.Any
  ): js.Promise[IModel] = js.native
  /**
    * Fetch all of the kernel specs.
    *
    * @param settings - The optional server settings.
    *
    * @returns A promise that resolves with the kernel specs.
    *
    * #### Notes
    * Uses the [Jupyter Notebook API](http://petstore.swagger.io/?url=https://raw.githubusercontent.com/jupyter/notebook/master/notebook/services/api/api.yaml#!/kernelspecs).
    */
  def getSpecs(): js.Promise[ISpecModels] = js.native
  def getSpecs(
    settings: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify ServerConnection.ISettings */ js.Any
  ): js.Promise[ISpecModels] = js.native
  /**
    * Fetch the running kernels.
    *
    * @param settings - The optional server settings.
    *
    * @returns A promise that resolves with the list of running kernels.
    *
    * #### Notes
    * Uses the [Jupyter Notebook API](http://petstore.swagger.io/?url=https://raw.githubusercontent.com/jupyter/notebook/master/notebook/services/api/api.yaml#!/kernels) and validates the response model.
    *
    * The promise is fulfilled on a valid response and rejected otherwise.
    */
  def listRunning(): js.Promise[js.Array[IModel]] = js.native
  def listRunning(
    settings: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify ServerConnection.ISettings */ js.Any
  ): js.Promise[js.Array[IModel]] = js.native
  /**
    * Shut down a kernel by id.
    *
    * @param id - The id of the running kernel.
    *
    * @param settings - The server settings for the request.
    *
    * @returns A promise that resolves when the kernel is shut down.
    */
  def shutdown(id: String): js.Promise[Unit] = js.native
  def shutdown(
    id: String,
    settings: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify ServerConnection.ISettings */ js.Any
  ): js.Promise[Unit] = js.native
  /**
    * Shut down all kernels.
    *
    * @returns A promise that resolves when all of the kernels are shut down.
    */
  def shutdownAll(): js.Promise[Unit] = js.native
  def shutdownAll(
    settings: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify ServerConnection.ISettings */ js.Any
  ): js.Promise[Unit] = js.native
  /**
    * Start a new kernel.
    *
    * @param options - The options used to create the kernel.
    *
    * @returns A promise that resolves with a kernel object.
    *
    * #### Notes
    * Uses the [Jupyter Notebook API](http://petstore.swagger.io/?url=https://raw.githubusercontent.com/jupyter/notebook/master/notebook/services/api/api.yaml#!/kernels) and validates the response model.
    *
    * If no options are given or the kernel name is not given, the
    * default kernel will by started by the server.
    *
    * Wraps the result in a Kernel object. The promise is fulfilled
    * when the kernel is started by the server, otherwise the promise is rejected.
    */
  def startNew(): js.Promise[IKernel] = js.native
  def startNew(options: IOptions): js.Promise[IKernel] = js.native
}

