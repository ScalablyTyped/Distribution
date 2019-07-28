package typings.atJupyterlabStatusbar.libDefaultsKernelStatusMod

import typings.atJupyterlabApputils.atJupyterlabApputilsMod.VDomRenderer
import typings.atJupyterlabStatusbar.libDefaultsKernelStatusMod.KernelStatusNs.IOptions
import typings.atJupyterlabStatusbar.libDefaultsKernelStatusMod.KernelStatusNs.Model
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@jupyterlab/statusbar/lib/defaults/kernelStatus", "KernelStatus")
@js.native
class KernelStatus protected () extends VDomRenderer[Model] {
  /**
    * Construct the kernel status widget.
    */
  def this(opts: IOptions) = this()
  var _handleClick: js.Any = js.native
}

