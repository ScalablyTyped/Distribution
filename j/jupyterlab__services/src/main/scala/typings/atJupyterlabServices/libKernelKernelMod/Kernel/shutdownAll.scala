package typings.atJupyterlabServices.libKernelKernelMod.Kernel

import typings.atJupyterlabServices.libServerconnectionMod.ServerConnection.ISettings
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@jupyterlab/services/lib/kernel/kernel", "Kernel.shutdownAll")
@js.native
object shutdownAll extends js.Object {
  /**
    * Shut down all kernels.
    *
    * @returns A promise that resolves when all of the kernels are shut down.
    */
  def apply(): js.Promise[Unit] = js.native
  def apply(settings: ISettings): js.Promise[Unit] = js.native
}

