package typings.jupyterlabStatusbar.kernelStatusMod

import typings.jupyterlabApputils.mod.VDomRenderer
import typings.jupyterlabStatusbar.kernelStatusMod.KernelStatus.IOptions
import typings.jupyterlabStatusbar.kernelStatusMod.KernelStatus.Model
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@jupyterlab/statusbar/lib/defaults/kernelStatus", "KernelStatus")
@js.native
class KernelStatus_ protected () extends VDomRenderer[Model] {
  /**
    * Construct the kernel status widget.
    */
  def this(opts: IOptions) = this()
  
  var _handleClick: js.Any = js.native
}
