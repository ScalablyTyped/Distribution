package typings.jupyterlabServices.kernelKernelMod.Kernel

import typings.jupyterlabServices.serverconnectionMod.ServerConnection.ISettings
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@jupyterlab/services/lib/kernel/kernel", "Kernel.shutdown")
@js.native
object shutdown extends js.Object {
  /**
    * Shut down a kernel by id.
    *
    * @param id - The id of the running kernel.
    *
    * @param settings - The server settings for the request.
    *
    * @returns A promise that resolves when the kernel is shut down.
    */
  def apply(id: String): js.Promise[Unit] = js.native
  def apply(id: String, settings: ISettings): js.Promise[Unit] = js.native
}

