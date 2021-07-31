package typings.iobroker.objectsMod.global.ioBroker

import typings.iobroker.anon.OmitPermissionSetusergrou
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GroupCommon
  extends StObject
     with ObjectCommon {
  
  // system.user.name, ...
  /** The default permissions of this group */
  var acl: OmitPermissionSetusergrou
  
  // Make it possible to narrow the object type using the custom property
  var custom: Unit
  
  /** The users of this group */
  var members: js.Array[String]
  
  /** The name of this group */
  @JSName("name")
  var name_GroupCommon: String
}
object GroupCommon {
  
  @scala.inline
  def apply(acl: OmitPermissionSetusergrou, custom: Unit, members: js.Array[String], name: String): GroupCommon = {
    val __obj = js.Dynamic.literal(acl = acl.asInstanceOf[js.Any], custom = custom.asInstanceOf[js.Any], members = members.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[GroupCommon]
  }
  
  @scala.inline
  implicit class GroupCommonMutableBuilder[Self <: GroupCommon] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAcl(value: OmitPermissionSetusergrou): Self = StObject.set(x, "acl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCustom(value: Unit): Self = StObject.set(x, "custom", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMembers(value: js.Array[String]): Self = StObject.set(x, "members", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMembersVarargs(value: String*): Self = StObject.set(x, "members", js.Array(value :_*))
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
  }
}
