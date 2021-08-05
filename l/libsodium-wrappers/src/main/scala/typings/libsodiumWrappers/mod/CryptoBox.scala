package typings.libsodiumWrappers.mod

import typings.std.Uint8Array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CryptoBox extends StObject {
  
  var ciphertext: Uint8Array
  
  var mac: Uint8Array
}
object CryptoBox {
  
  inline def apply(ciphertext: Uint8Array, mac: Uint8Array): CryptoBox = {
    val __obj = js.Dynamic.literal(ciphertext = ciphertext.asInstanceOf[js.Any], mac = mac.asInstanceOf[js.Any])
    __obj.asInstanceOf[CryptoBox]
  }
  
  extension [Self <: CryptoBox](x: Self) {
    
    inline def setCiphertext(value: Uint8Array): Self = StObject.set(x, "ciphertext", value.asInstanceOf[js.Any])
    
    inline def setMac(value: Uint8Array): Self = StObject.set(x, "mac", value.asInstanceOf[js.Any])
  }
}
