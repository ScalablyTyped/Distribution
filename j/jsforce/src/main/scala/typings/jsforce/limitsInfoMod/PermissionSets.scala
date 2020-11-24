package typings.jsforce.limitsInfoMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PermissionSets extends Limit {
  
  var CreateCustom: Limit = js.native
}
object PermissionSets {
  
  @scala.inline
  def apply(CreateCustom: Limit, Max: Double, Remaining: Double): PermissionSets = {
    val __obj = js.Dynamic.literal(CreateCustom = CreateCustom.asInstanceOf[js.Any], Max = Max.asInstanceOf[js.Any], Remaining = Remaining.asInstanceOf[js.Any])
    __obj.asInstanceOf[PermissionSets]
  }
  
  @scala.inline
  implicit class PermissionSetsOps[Self <: PermissionSets] (val x: Self) extends AnyVal {
    
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
    def setCreateCustom(value: Limit): Self = this.set("CreateCustom", value.asInstanceOf[js.Any])
  }
}
