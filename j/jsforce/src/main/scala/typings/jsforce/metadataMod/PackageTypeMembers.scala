package typings.jsforce.metadataMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PackageTypeMembers extends StObject {
  
  var members: js.Array[String] = js.native
  
  var name: String = js.native
}
object PackageTypeMembers {
  
  @scala.inline
  def apply(members: js.Array[String], name: String): PackageTypeMembers = {
    val __obj = js.Dynamic.literal(members = members.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[PackageTypeMembers]
  }
  
  @scala.inline
  implicit class PackageTypeMembersMutableBuilder[Self <: PackageTypeMembers] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMembers(value: js.Array[String]): Self = StObject.set(x, "members", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMembersVarargs(value: String*): Self = StObject.set(x, "members", js.Array(value :_*))
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
  }
}
