package typings
package atJupyterlabExtensionmanagerLib.libCompanionsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait KernelCompanion extends js.Object {
  /**
    * The kernel companion install info.
    */
  var kernelInfo: IKernelInstallInfo
  /**
    * The kernels that match the install info.
    */
  var kernels: js.Array[atJupyterlabServicesLib.libKernelKernelMod.KernelNs.ISpecModel]
}

object KernelCompanion {
  @scala.inline
  def apply(
    kernelInfo: IKernelInstallInfo,
    kernels: js.Array[atJupyterlabServicesLib.libKernelKernelMod.KernelNs.ISpecModel]
  ): KernelCompanion = {
    val __obj = js.Dynamic.literal(kernelInfo = kernelInfo, kernels = kernels)
  
    __obj.asInstanceOf[KernelCompanion]
  }
}

