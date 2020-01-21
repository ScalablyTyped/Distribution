package typings.jupyterlabApputils.clientsessionMod.ClientSession

import typings.std.HTMLSelectElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@jupyterlab/apputils/lib/clientsession", "ClientSession.populateKernelSelect")
@js.native
object populateKernelSelect extends js.Object {
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
  def apply(node: HTMLSelectElement, options: IKernelSearch): Unit = js.native
}

