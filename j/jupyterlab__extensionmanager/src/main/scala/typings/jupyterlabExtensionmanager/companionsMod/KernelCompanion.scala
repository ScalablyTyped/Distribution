package typings.jupyterlabExtensionmanager.companionsMod

import typings.jupyterlabServices.restapiMod.ISpecModel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait KernelCompanion extends js.Object {
  
  /**
    * The kernel companion install info.
    */
  var kernelInfo: IKernelInstallInfo = js.native
  
  /**
    * The kernels that match the install info.
    */
  var kernels: js.Array[ISpecModel] = js.native
}
object KernelCompanion {
  
  @scala.inline
  def apply(kernelInfo: IKernelInstallInfo, kernels: js.Array[ISpecModel]): KernelCompanion = {
    val __obj = js.Dynamic.literal(kernelInfo = kernelInfo.asInstanceOf[js.Any], kernels = kernels.asInstanceOf[js.Any])
    __obj.asInstanceOf[KernelCompanion]
  }
  
  @scala.inline
  implicit class KernelCompanionOps[Self <: KernelCompanion] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setKernelInfo(value: IKernelInstallInfo): Self = this.set("kernelInfo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKernelsVarargs(value: ISpecModel*): Self = this.set("kernels", js.Array(value :_*))
    
    @scala.inline
    def setKernels(value: js.Array[ISpecModel]): Self = this.set("kernels", value.asInstanceOf[js.Any])
  }
}
