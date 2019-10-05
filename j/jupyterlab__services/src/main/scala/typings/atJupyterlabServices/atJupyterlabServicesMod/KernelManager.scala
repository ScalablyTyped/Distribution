package typings.atJupyterlabServices.atJupyterlabServicesMod

import typings.atJupyterlabServices.libKernelManagerMod.KernelManager.IOptions
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
  extends typings.atJupyterlabServices.libKernelMod.KernelManager {
  def this(options: IOptions) = this()
}

