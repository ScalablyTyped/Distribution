package typings.atJupyterlabServices.libKernelKernelMod.Kernel

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
  def apply(
    settings: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify ServerConnection.ISettings */ js.Any
  ): js.Promise[Unit] = js.native
}

