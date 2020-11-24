package typings.loopback.anon

import typings.loopback.loopbackStrings.DENY
import typings.loopback.mod.ACL
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Acls extends js.Object {
  
  var acls: js.Array[ACL] = js.native
  
  var defaultPermission: DENY = js.native
  
  var http: Path = js.native
}
object Acls {
  
  @scala.inline
  def apply(acls: js.Array[ACL], defaultPermission: DENY, http: Path): Acls = {
    val __obj = js.Dynamic.literal(acls = acls.asInstanceOf[js.Any], defaultPermission = defaultPermission.asInstanceOf[js.Any], http = http.asInstanceOf[js.Any])
    __obj.asInstanceOf[Acls]
  }
  
  @scala.inline
  implicit class AclsOps[Self <: Acls] (val x: Self) extends AnyVal {
    
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
    def setAclsVarargs(value: ACL*): Self = this.set("acls", js.Array(value :_*))
    
    @scala.inline
    def setAcls(value: js.Array[ACL]): Self = this.set("acls", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefaultPermission(value: DENY): Self = this.set("defaultPermission", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHttp(value: Path): Self = this.set("http", value.asInstanceOf[js.Any])
  }
}
