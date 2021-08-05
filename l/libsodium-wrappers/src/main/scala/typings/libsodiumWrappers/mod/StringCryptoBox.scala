package typings.libsodiumWrappers.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StringCryptoBox extends StObject {
  
  var ciphertext: String
  
  var mac: String
}
object StringCryptoBox {
  
  inline def apply(ciphertext: String, mac: String): StringCryptoBox = {
    val __obj = js.Dynamic.literal(ciphertext = ciphertext.asInstanceOf[js.Any], mac = mac.asInstanceOf[js.Any])
    __obj.asInstanceOf[StringCryptoBox]
  }
  
  extension [Self <: StringCryptoBox](x: Self) {
    
    inline def setCiphertext(value: String): Self = StObject.set(x, "ciphertext", value.asInstanceOf[js.Any])
    
    inline def setMac(value: String): Self = StObject.set(x, "mac", value.asInstanceOf[js.Any])
  }
}
