package typings.jsrsasign.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait HashMsgHex extends StObject {
  
  var hashAlg: String = js.native
  
  var hashMsgHex: String = js.native
}
object HashMsgHex {
  
  @scala.inline
  def apply(hashAlg: String, hashMsgHex: String): HashMsgHex = {
    val __obj = js.Dynamic.literal(hashAlg = hashAlg.asInstanceOf[js.Any], hashMsgHex = hashMsgHex.asInstanceOf[js.Any])
    __obj.asInstanceOf[HashMsgHex]
  }
  
  @scala.inline
  implicit class HashMsgHexMutableBuilder[Self <: HashMsgHex] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setHashAlg(value: String): Self = StObject.set(x, "hashAlg", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHashMsgHex(value: String): Self = StObject.set(x, "hashMsgHex", value.asInstanceOf[js.Any])
  }
}
