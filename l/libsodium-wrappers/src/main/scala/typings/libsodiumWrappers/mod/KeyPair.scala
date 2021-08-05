package typings.libsodiumWrappers.mod

import typings.std.Uint8Array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait KeyPair extends StObject {
  
  var keyType: KeyType
  
  var privateKey: Uint8Array
  
  var publicKey: Uint8Array
}
object KeyPair {
  
  inline def apply(keyType: KeyType, privateKey: Uint8Array, publicKey: Uint8Array): KeyPair = {
    val __obj = js.Dynamic.literal(keyType = keyType.asInstanceOf[js.Any], privateKey = privateKey.asInstanceOf[js.Any], publicKey = publicKey.asInstanceOf[js.Any])
    __obj.asInstanceOf[KeyPair]
  }
  
  extension [Self <: KeyPair](x: Self) {
    
    inline def setKeyType(value: KeyType): Self = StObject.set(x, "keyType", value.asInstanceOf[js.Any])
    
    inline def setPrivateKey(value: Uint8Array): Self = StObject.set(x, "privateKey", value.asInstanceOf[js.Any])
    
    inline def setPublicKey(value: Uint8Array): Self = StObject.set(x, "publicKey", value.asInstanceOf[js.Any])
  }
}
