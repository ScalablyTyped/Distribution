package typings.jupyterlabServices.mod

import typings.jupyterlabServices.managerMod.KernelManager.IOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@jupyterlab/services", "KernelManager")
@js.native
/**
  * Construct a new kernel manager.
  *
  * @param options - The default options for kernel.
  */
class KernelManager ()
  extends typings.jupyterlabServices.kernelMod.KernelManager {
  def this(options: IOptions) = this()
}

