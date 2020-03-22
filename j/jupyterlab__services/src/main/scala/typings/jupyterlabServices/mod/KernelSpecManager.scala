package typings.jupyterlabServices.mod

import typings.jupyterlabServices.managerMod.KernelSpecManager.IOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@jupyterlab/services", "KernelSpecManager")
@js.native
/**
  * Construct a new kernel spec manager.
  *
  * @param options - The default options for kernel.
  */
class KernelSpecManager ()
  extends typings.jupyterlabServices.kernelspecMod.KernelSpecManager {
  def this(options: IOptions) = this()
}

