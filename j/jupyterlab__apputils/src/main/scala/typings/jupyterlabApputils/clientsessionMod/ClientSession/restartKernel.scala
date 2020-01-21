package typings.jupyterlabApputils.clientsessionMod.ClientSession

import typings.jupyterlabServices.kernelKernelMod.Kernel.IKernelConnection
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@jupyterlab/apputils/lib/clientsession", "ClientSession.restartKernel")
@js.native
object restartKernel extends js.Object {
  /**
    * Restart a kernel if the user accepts the risk.
    *
    * Returns a promise resolving with whether the kernel was restarted.
    */
  def apply(kernel: IKernelConnection): js.Promise[Boolean] = js.native
}

