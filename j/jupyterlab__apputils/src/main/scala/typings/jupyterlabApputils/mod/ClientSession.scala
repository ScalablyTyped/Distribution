package typings.jupyterlabApputils.mod

import typings.jupyterlabApputils.clientsessionMod.ClientSession.IKernelSearch
import typings.jupyterlabApputils.clientsessionMod.ClientSession.IOptions
import typings.jupyterlabServices.kernelKernelMod.Kernel.IKernelConnection
import typings.std.HTMLSelectElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@jupyterlab/apputils", "ClientSession")
@js.native
class ClientSession protected ()
  extends typings.jupyterlabApputils.clientsessionMod.ClientSession {
  /**
    * Construct a new client session.
    */
  def this(options: IOptions) = this()
}

@JSImport("@jupyterlab/apputils", "ClientSession")
@js.native
object ClientSession extends js.Object {
  /**
    * Get the default kernel name given select options.
    */
  def getDefaultKernel(options: IKernelSearch): String | Null = js.native
  /**
    * Populate a kernel dropdown list.
    *
    * @param node - The node to populate.
    *
    * @param options - The options used to populate the kernels.
    *
    * #### Notes
    * Populates the list with separated sections:
    *   - Kernels matching the preferred language (display names).
    *   - "None" signifying no kernel.
    *   - The remaining kernels.
    *   - Sessions matching the preferred language (file names).
    *   - The remaining sessions.
    * If no preferred language is given or no kernels are found using
    * the preferred language, the default kernel is used in the first
    * section.  Kernels are sorted by display name.  Sessions display the
    * base name of the file with an ellipsis overflow and a tooltip with
    * the explicit session information.
    */
  def populateKernelSelect(node: HTMLSelectElement, options: IKernelSearch): Unit = js.native
  /**
    * Restart a kernel if the user accepts the risk.
    *
    * Returns a promise resolving with whether the kernel was restarted.
    */
  def restartKernel(kernel: IKernelConnection): js.Promise[Boolean] = js.native
}

