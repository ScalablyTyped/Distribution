package typings.libsodiumWrappers.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CryptoBox extends StObject {
  
  var ciphertext: js.typedarray.Uint8Array
  
  var mac: js.typedarray.Uint8Array
}
object CryptoBox {
  
  inline def apply(ciphertext: js.typedarray.Uint8Array, mac: js.typedarray.Uint8Array): CryptoBox = {
    val __obj = js.Dynamic.literal(ciphertext = ciphertext.asInstanceOf[js.Any], mac = mac.asInstanceOf[js.Any])
    __obj.asInstanceOf[CryptoBox]
  }
  
  extension [Self <: CryptoBox](x: Self) {
    
    inline def setCiphertext(value: js.typedarray.Uint8Array): Self = StObject.set(x, "ciphertext", value.asInstanceOf[js.Any])
    
    inline def setMac(value: js.typedarray.Uint8Array): Self = StObject.set(x, "mac", value.asInstanceOf[js.Any])
  }
}
