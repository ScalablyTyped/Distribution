package typings.jupyterlabExtensionmanager.anon

import typings.jupyterlabExtensionmanager.companionsMod.IInstallInfo
import typings.jupyterlabExtensionmanager.companionsMod.IKernelInstallInfo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Kernel extends js.Object {
  
  /**
    * Information about any kernel companions.
    */
  var kernel: js.UndefOr[js.Array[IKernelInstallInfo]] = js.native
  
  /**
    * Information about any server extension companions.
    */
  var server: js.UndefOr[IInstallInfo] = js.native
}
object Kernel {
  
  @scala.inline
  def apply(): Kernel = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Kernel]
  }
  
  @scala.inline
  implicit class KernelOps[Self <: Kernel] (val x: Self) extends AnyVal {
    
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
    def setKernelVarargs(value: IKernelInstallInfo*): Self = this.set("kernel", js.Array(value :_*))
    
    @scala.inline
    def setKernel(value: js.Array[IKernelInstallInfo]): Self = this.set("kernel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKernel: Self = this.set("kernel", js.undefined)
    
    @scala.inline
    def setServer(value: IInstallInfo): Self = this.set("server", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteServer: Self = this.set("server", js.undefined)
  }
}
