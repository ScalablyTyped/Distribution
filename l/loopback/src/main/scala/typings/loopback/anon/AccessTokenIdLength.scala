package typings.loopback.anon

import typings.loopback.mod.ACL
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AccessTokenIdLength extends StObject {
  
  var accessTokenIdLength: Double = js.native
  
  var acls: js.Array[ACL] = js.native
  
  var http: Path = js.native
}
object AccessTokenIdLength {
  
  @scala.inline
  def apply(accessTokenIdLength: Double, acls: js.Array[ACL], http: Path): AccessTokenIdLength = {
    val __obj = js.Dynamic.literal(accessTokenIdLength = accessTokenIdLength.asInstanceOf[js.Any], acls = acls.asInstanceOf[js.Any], http = http.asInstanceOf[js.Any])
    __obj.asInstanceOf[AccessTokenIdLength]
  }
  
  @scala.inline
  implicit class AccessTokenIdLengthMutableBuilder[Self <: AccessTokenIdLength] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAccessTokenIdLength(value: Double): Self = StObject.set(x, "accessTokenIdLength", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAcls(value: js.Array[ACL]): Self = StObject.set(x, "acls", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAclsVarargs(value: ACL*): Self = StObject.set(x, "acls", js.Array(value :_*))
    
    @scala.inline
    def setHttp(value: Path): Self = StObject.set(x, "http", value.asInstanceOf[js.Any])
  }
}
