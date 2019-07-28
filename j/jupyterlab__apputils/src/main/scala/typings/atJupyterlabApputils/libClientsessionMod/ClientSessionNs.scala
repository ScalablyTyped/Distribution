package typings.atJupyterlabApputils.libClientsessionMod

import typings.atJupyterlabApputils.libClientsessionMod.ClientSessionNs.IKernelSearch
import typings.atJupyterlabApputils.libClientsessionMod.IClientSessionNs.IKernelPreference
import typings.atJupyterlabServices.libKernelKernelMod.KernelNs.IKernelConnection
import typings.atJupyterlabServices.libKernelKernelMod.KernelNs.ISpecModels
import typings.atJupyterlabServices.libSessionSessionMod.SessionNs.IManager
import typings.atJupyterlabServices.libSessionSessionMod.SessionNs.IModel
import typings.atPhosphorAlgorithm.libIterMod.IterableOrArrayLike
import typings.atPhosphorDisposable.atPhosphorDisposableMod.IDisposable
import typings.std.HTMLSelectElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@jupyterlab/apputils/lib/clientsession", "ClientSession")
@js.native
object ClientSessionNs extends js.Object {
  /**
    * An interface for populating a kernel selector.
    */
  trait IKernelSearch extends js.Object {
    /**
      * The kernel preference.
      */
    var preference: IKernelPreference
    /**
      * The current running sessions.
      */
    var sessions: js.UndefOr[IterableOrArrayLike[IModel]] = js.undefined
    /**
      * The Kernel specs.
      */
    var specs: ISpecModels | Null
  }
  
  /**
    * The options used to initialize a context.
    */
  trait IOptions extends js.Object {
    /**
      * A kernel preference.
      */
    var kernelPreference: js.UndefOr[IKernelPreference] = js.undefined
    /**
      * A session manager instance.
      */
    var manager: IManager
    /**
      * The name of the session.
      */
    var name: js.UndefOr[String] = js.undefined
    /**
      * The initial path of the file.
      */
    var path: js.UndefOr[String] = js.undefined
    /**
      * A function to call when the session becomes busy.
      */
    var setBusy: js.UndefOr[js.Function0[IDisposable]] = js.undefined
    /**
      * The type of the session.
      */
    var `type`: js.UndefOr[String] = js.undefined
  }
  
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

