package typings.loopback.anon

import typings.loopback.loopbackStrings.DENY
import typings.loopback.mod.ACL
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Acls extends StObject {
  
  var acls: js.Array[ACL]
  
  var defaultPermission: DENY
  
  var http: Path
}
object Acls {
  
  @scala.inline
  def apply(acls: js.Array[ACL], http: Path): Acls = {
    val __obj = js.Dynamic.literal(acls = acls.asInstanceOf[js.Any], defaultPermission = "DENY", http = http.asInstanceOf[js.Any])
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
