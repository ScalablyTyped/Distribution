package typings.kurentoClient.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SDES extends StObject {
  
  var crypto: CryptoSuite
  
  var key: String
  
  var keyBase64: String
}
object SDES {
  
  inline def apply(crypto: CryptoSuite, key: String, keyBase64: String): SDES = {
    val __obj = js.Dynamic.literal(crypto = crypto.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any], keyBase64 = keyBase64.asInstanceOf[js.Any])
    __obj.asInstanceOf[SDES]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SDES] (val x: Self) extends AnyVal {
    
    inline def setCrypto(value: CryptoSuite): Self = StObject.set(x, "crypto", value.asInstanceOf[js.Any])
    
    inline def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    inline def setKeyBase64(value: String): Self = StObject.set(x, "keyBase64", value.asInstanceOf[js.Any])
  }
}
