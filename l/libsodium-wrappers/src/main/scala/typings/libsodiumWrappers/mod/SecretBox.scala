package typings.libsodiumWrappers.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SecretBox extends StObject {
  
  var cipher: js.typedarray.Uint8Array
  
  var mac: js.typedarray.Uint8Array
}
object SecretBox {
  
  inline def apply(cipher: js.typedarray.Uint8Array, mac: js.typedarray.Uint8Array): SecretBox = {
    val __obj = js.Dynamic.literal(cipher = cipher.asInstanceOf[js.Any], mac = mac.asInstanceOf[js.Any])
    __obj.asInstanceOf[SecretBox]
  }
  
  extension [Self <: SecretBox](x: Self) {
    
    inline def setCipher(value: js.typedarray.Uint8Array): Self = StObject.set(x, "cipher", value.asInstanceOf[js.Any])
    
    inline def setMac(value: js.typedarray.Uint8Array): Self = StObject.set(x, "mac", value.asInstanceOf[js.Any])
  }
}
