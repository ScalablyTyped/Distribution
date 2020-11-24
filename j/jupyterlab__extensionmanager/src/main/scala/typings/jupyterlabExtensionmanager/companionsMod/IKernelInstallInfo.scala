package typings.jupyterlabExtensionmanager.companionsMod

import typings.jupyterlabExtensionmanager.anon.Displayname
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IKernelInstallInfo extends IInstallInfo {
  
  /**
    * A specification of which kernels the current install info applies to.
    */
  var kernel_spec: Displayname = js.native
}
object IKernelInstallInfo {
  
  @scala.inline
  def apply(base: IInstallInfoEntry, kernel_spec: Displayname, managers: js.Array[String]): IKernelInstallInfo = {
    val __obj = js.Dynamic.literal(base = base.asInstanceOf[js.Any], kernel_spec = kernel_spec.asInstanceOf[js.Any], managers = managers.asInstanceOf[js.Any])
    __obj.asInstanceOf[IKernelInstallInfo]
  }
  
  @scala.inline
  implicit class IKernelInstallInfoOps[Self <: IKernelInstallInfo] (val x: Self) extends AnyVal {
    
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
    def setKernel_spec(value: Displayname): Self = this.set("kernel_spec", value.asInstanceOf[js.Any])
  }
}
