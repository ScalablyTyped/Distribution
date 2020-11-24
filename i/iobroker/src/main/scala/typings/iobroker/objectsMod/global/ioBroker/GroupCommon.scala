package typings.iobroker.objectsMod.global.ioBroker

import typings.iobroker.anon.OmitPermissionSetusergrou
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GroupCommon extends ObjectCommon {
  
   // system.user.name, ...
  /** The default permissions of this group */
  var acl: OmitPermissionSetusergrou = js.native
  
  // Make it possible to narrow the object type using the custom property
  var custom: js.UndefOr[scala.Nothing] = js.native
  
  /** The users of this group */
  var members: js.Array[String] = js.native
  
  /** The name of this group */
  @JSName("name")
  var name_GroupCommon: String = js.native
}
object GroupCommon {
  
  @scala.inline
  def apply(acl: OmitPermissionSetusergrou, members: js.Array[String], name: String): GroupCommon = {
    val __obj = js.Dynamic.literal(acl = acl.asInstanceOf[js.Any], members = members.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[GroupCommon]
  }
  
  @scala.inline
  implicit class GroupCommonOps[Self <: GroupCommon] (val x: Self) extends AnyVal {
    
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
    def setMembersVarargs(value: String*): Self = this.set("members", js.Array(value :_*))
    
    @scala.inline
    def setMembers(value: js.Array[String]): Self = this.set("members", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
  }
}
