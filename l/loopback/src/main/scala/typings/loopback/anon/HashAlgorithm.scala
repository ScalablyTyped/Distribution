package typings.loopback.anon

import typings.loopback.mod.ACL
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait HashAlgorithm extends StObject {
  
  var acls: js.Array[ACL] = js.native
  
  var hashAlgorithm: String = js.native
  
  var http: Path = js.native
  
  var ignoreErrors: Boolean = js.native
}
object HashAlgorithm {
  
  @scala.inline
  def apply(acls: js.Array[ACL], hashAlgorithm: String, http: Path, ignoreErrors: Boolean): HashAlgorithm = {
    val __obj = js.Dynamic.literal(acls = acls.asInstanceOf[js.Any], hashAlgorithm = hashAlgorithm.asInstanceOf[js.Any], http = http.asInstanceOf[js.Any], ignoreErrors = ignoreErrors.asInstanceOf[js.Any])
    __obj.asInstanceOf[HashAlgorithm]
  }
  
  @scala.inline
  implicit class HashAlgorithmMutableBuilder[Self <: HashAlgorithm] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAcls(value: js.Array[ACL]): Self = StObject.set(x, "acls", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAclsVarargs(value: ACL*): Self = StObject.set(x, "acls", js.Array(value :_*))
    
    @scala.inline
    def setHashAlgorithm(value: String): Self = StObject.set(x, "hashAlgorithm", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHttp(value: Path): Self = StObject.set(x, "http", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIgnoreErrors(value: Boolean): Self = StObject.set(x, "ignoreErrors", value.asInstanceOf[js.Any])
  }
}
