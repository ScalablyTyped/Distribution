package typings.jupyterlabServices.kernelKernelMod.Kernel

import typings.jupyterlabServices.serverconnectionMod.ServerConnection.ISettings
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@jupyterlab/services/lib/kernel/kernel", "Kernel.findById")
@js.native
object findById extends js.Object {
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
  def apply(id: String): js.Promise[IModel] = js.native
  def apply(id: String, settings: ISettings): js.Promise[IModel] = js.native
}

