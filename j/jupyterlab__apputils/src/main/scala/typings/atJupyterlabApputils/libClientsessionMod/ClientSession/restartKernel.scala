package typings.atJupyterlabApputils.libClientsessionMod.ClientSession

import typings.atJupyterlabServices.libKernelKernelMod.Kernel.IKernelConnection
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

