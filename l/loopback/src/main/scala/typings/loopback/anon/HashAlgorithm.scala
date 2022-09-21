package typings.loopback.anon

import typings.loopback.mod.ACL
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait HashAlgorithm extends StObject {
  
  var acls: js.Array[ACL]
  
  var hashAlgorithm: String
  
  var http: Path
  
  var ignoreErrors: Boolean
}
object HashAlgorithm {
  
  inline def apply(acls: js.Array[ACL], hashAlgorithm: String, http: Path, ignoreErrors: Boolean): HashAlgorithm = {
    val __obj = js.Dynamic.literal(acls = acls.asInstanceOf[js.Any], hashAlgorithm = hashAlgorithm.asInstanceOf[js.Any], http = http.asInstanceOf[js.Any], ignoreErrors = ignoreErrors.asInstanceOf[js.Any])
    __obj.asInstanceOf[HashAlgorithm]
  }
  
  extension [Self <: HashAlgorithm](x: Self) {
    
    inline def setAcls(value: js.Array[ACL]): Self = StObject.set(x, "acls", value.asInstanceOf[js.Any])
    
    inline def setAclsVarargs(value: ACL*): Self = StObject.set(x, "acls", js.Array(value*))
    
    inline def setHashAlgorithm(value: String): Self = StObject.set(x, "hashAlgorithm", value.asInstanceOf[js.Any])
    
    inline def setHttp(value: Path): Self = StObject.set(x, "http", value.asInstanceOf[js.Any])
    
    inline def setIgnoreErrors(value: Boolean): Self = StObject.set(x, "ignoreErrors", value.asInstanceOf[js.Any])
  }
}
