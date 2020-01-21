package typings.jupyterlabExtensionmanager.companionsMod

import typings.jupyterlabServices.kernelKernelMod.Kernel.ISpecModel
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
  var kernels: js.Array[ISpecModel]
}

object KernelCompanion {
  @scala.inline
  def apply(kernelInfo: IKernelInstallInfo, kernels: js.Array[ISpecModel]): KernelCompanion = {
    val __obj = js.Dynamic.literal(kernelInfo = kernelInfo.asInstanceOf[js.Any], kernels = kernels.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[KernelCompanion]
  }
}

