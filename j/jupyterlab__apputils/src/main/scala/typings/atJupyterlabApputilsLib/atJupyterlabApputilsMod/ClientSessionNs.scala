package typings
package atJupyterlabApputilsLib.atJupyterlabApputilsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@jupyterlab/apputils", "ClientSession")
@js.native
object ClientSessionNs extends js.Object {
  /**
    * Get the default kernel name given select options.
    */
  def getDefaultKernel(options: atJupyterlabApputilsLib.libClientsessionMod.ClientSessionNs.IKernelSearch): java.lang.String | scala.Null = js.native
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
  def populateKernelSelect(
    node: stdLib.HTMLSelectElement,
    options: atJupyterlabApputilsLib.libClientsessionMod.ClientSessionNs.IKernelSearch
  ): scala.Unit = js.native
  /**
    * Restart a kernel if the user accepts the risk.
    *
    * Returns a promise resolving with whether the kernel was restarted.
    */
  def restartKernel(kernel: atJupyterlabServicesLib.libKernelKernelMod.KernelNs.IKernelConnection): js.Promise[scala.Boolean] = js.native
}

