package typings.loopback.anon

import typings.loopback.loopbackStrings.DENY
import typings.loopback.mod.ACL
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Acls extends StObject {
  
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
  implicit class AclsMutableBuilder[Self <: Acls] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAcls(value: js.Array[ACL]): Self = StObject.set(x, "acls", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAclsVarargs(value: ACL*): Self = StObject.set(x, "acls", js.Array(value :_*))
    
    @scala.inline
    def setDefaultPermission(value: DENY): Self = StObject.set(x, "defaultPermission", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHttp(value: Path): Self = StObject.set(x, "http", value.asInstanceOf[js.Any])
  }
}
