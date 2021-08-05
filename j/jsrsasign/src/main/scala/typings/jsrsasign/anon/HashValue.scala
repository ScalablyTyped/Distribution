package typings.jsrsasign.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait HashValue extends StObject {
  
  var hashAlg: String
  
  var hashValue: String
}
object HashValue {
  
  inline def apply(hashAlg: String, hashValue: String): HashValue = {
    val __obj = js.Dynamic.literal(hashAlg = hashAlg.asInstanceOf[js.Any], hashValue = hashValue.asInstanceOf[js.Any])
    __obj.asInstanceOf[HashValue]
  }
  
  extension [Self <: HashValue](x: Self) {
    
    inline def setHashAlg(value: String): Self = StObject.set(x, "hashAlg", value.asInstanceOf[js.Any])
    
    inline def setHashValue(value: String): Self = StObject.set(x, "hashValue", value.asInstanceOf[js.Any])
  }
}
