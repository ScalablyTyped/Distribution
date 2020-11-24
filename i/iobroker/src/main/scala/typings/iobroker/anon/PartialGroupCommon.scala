package typings.iobroker.anon

import typings.iobroker.iobrokerBooleans.`true`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<iobroker.iobroker/objects.<global>.ioBroker.GroupCommon> */
@js.native
trait PartialGroupCommon extends js.Object {
  
  var acl: js.UndefOr[OmitPermissionSetusergrou] = js.native
  
  var custom: js.UndefOr[scala.Nothing] = js.native
  
  var dontDelete: js.UndefOr[`true`] = js.native
  
  var expert: js.UndefOr[`true`] = js.native
  
  var icon: js.UndefOr[String] = js.native
  
  var members: js.UndefOr[js.Array[String]] = js.native
  
  var name: js.UndefOr[String] = js.native
  
  var role: js.UndefOr[String] = js.native
}
object PartialGroupCommon {
  
  @scala.inline
  def apply(): PartialGroupCommon = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialGroupCommon]
  }
  
  @scala.inline
  implicit class PartialGroupCommonOps[Self <: PartialGroupCommon] (val x: Self) extends AnyVal {
    
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
    def setAcl(value: OmitPermissionSetusergrou): Self = this.set("acl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAcl: Self = this.set("acl", js.undefined)
    
    @scala.inline
    def setDontDelete(value: `true`): Self = this.set("dontDelete", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDontDelete: Self = this.set("dontDelete", js.undefined)
    
    @scala.inline
    def setExpert(value: `true`): Self = this.set("expert", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExpert: Self = this.set("expert", js.undefined)
    
    @scala.inline
    def setIcon(value: String): Self = this.set("icon", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIcon: Self = this.set("icon", js.undefined)
    
    @scala.inline
    def setMembersVarargs(value: String*): Self = this.set("members", js.Array(value :_*))
    
    @scala.inline
    def setMembers(value: js.Array[String]): Self = this.set("members", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMembers: Self = this.set("members", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    
    @scala.inline
    def setRole(value: String): Self = this.set("role", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRole: Self = this.set("role", js.undefined)
  }
}
