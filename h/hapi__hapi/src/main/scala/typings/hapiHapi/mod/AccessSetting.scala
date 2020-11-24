package typings.hapiHapi.mod

import typings.hapiHapi.hapiHapiBooleans.`false`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AccessSetting extends js.Object {
  
  var entity: js.UndefOr[AccessEntity] = js.native
  
  var scope: AccessScopes | `false` = js.native
}
object AccessSetting {
  
  @scala.inline
  def apply(scope: AccessScopes | `false`): AccessSetting = {
    val __obj = js.Dynamic.literal(scope = scope.asInstanceOf[js.Any])
    __obj.asInstanceOf[AccessSetting]
  }
  
  @scala.inline
  implicit class AccessSettingOps[Self <: AccessSetting] (val x: Self) extends AnyVal {
    
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
    def setScope(value: AccessScopes | `false`): Self = this.set("scope", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEntity(value: AccessEntity): Self = this.set("entity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEntity: Self = this.set("entity", js.undefined)
  }
}
