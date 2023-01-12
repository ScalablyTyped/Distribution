package typings.loopback.anon

import typings.loopback.mod.ACL
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AccessTokenIdLength extends StObject {
  
  var accessTokenIdLength: Double
  
  var acls: js.Array[ACL]
  
  var http: Path
}
object AccessTokenIdLength {
  
  inline def apply(accessTokenIdLength: Double, acls: js.Array[ACL], http: Path): AccessTokenIdLength = {
    val __obj = js.Dynamic.literal(accessTokenIdLength = accessTokenIdLength.asInstanceOf[js.Any], acls = acls.asInstanceOf[js.Any], http = http.asInstanceOf[js.Any])
    __obj.asInstanceOf[AccessTokenIdLength]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AccessTokenIdLength] (val x: Self) extends AnyVal {
    
    inline def setAccessTokenIdLength(value: Double): Self = StObject.set(x, "accessTokenIdLength", value.asInstanceOf[js.Any])
    
    inline def setAcls(value: js.Array[ACL]): Self = StObject.set(x, "acls", value.asInstanceOf[js.Any])
    
    inline def setAclsVarargs(value: ACL*): Self = StObject.set(x, "acls", js.Array(value*))
    
    inline def setHttp(value: Path): Self = StObject.set(x, "http", value.asInstanceOf[js.Any])
  }
}
