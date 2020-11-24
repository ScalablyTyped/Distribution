package typings.libraCore.vmErrorsPbMod.VMVerificationStatus

import typings.libraCore.vmErrorsPbMod.VMVerificationErrorKind
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AsObject extends js.Object {
  
  var dependencyId: js.UndefOr[typings.libraCore.languageStoragePbMod.ModuleId.AsObject] = js.native
  
  var errorKind: VMVerificationErrorKind = js.native
  
  var message: String = js.native
  
  var moduleIdx: Double = js.native
  
  var statusKind: StatusKind = js.native
}
object AsObject {
  
  @scala.inline
  def apply(errorKind: VMVerificationErrorKind, message: String, moduleIdx: Double, statusKind: StatusKind): AsObject = {
    val __obj = js.Dynamic.literal(errorKind = errorKind.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], moduleIdx = moduleIdx.asInstanceOf[js.Any], statusKind = statusKind.asInstanceOf[js.Any])
    __obj.asInstanceOf[AsObject]
  }
  
  @scala.inline
  implicit class AsObjectOps[Self <: AsObject] (val x: Self) extends AnyVal {
    
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
    def setErrorKind(value: VMVerificationErrorKind): Self = this.set("errorKind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMessage(value: String): Self = this.set("message", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setModuleIdx(value: Double): Self = this.set("moduleIdx", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatusKind(value: StatusKind): Self = this.set("statusKind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDependencyId(value: typings.libraCore.languageStoragePbMod.ModuleId.AsObject): Self = this.set("dependencyId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDependencyId: Self = this.set("dependencyId", js.undefined)
  }
}
