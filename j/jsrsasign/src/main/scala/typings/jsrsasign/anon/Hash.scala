package typings.jsrsasign.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Hash extends StObject {
  
  var hash: Alg
  
  var oid: String
}
object Hash {
  
  @scala.inline
  def apply(hash: Alg, oid: String): Hash = {
    val __obj = js.Dynamic.literal(hash = hash.asInstanceOf[js.Any], oid = oid.asInstanceOf[js.Any])
    __obj.asInstanceOf[Hash]
  }
  
  @scala.inline
  implicit class HashMutableBuilder[Self <: Hash] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setHash(value: Alg): Self = StObject.set(x, "hash", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOid(value: String): Self = StObject.set(x, "oid", value.asInstanceOf[js.Any])
  }
}
