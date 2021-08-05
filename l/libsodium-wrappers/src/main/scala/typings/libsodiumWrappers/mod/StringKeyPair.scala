package typings.libsodiumWrappers.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StringKeyPair extends StObject {
  
  var keyType: KeyType
  
  var privateKey: String
  
  var publicKey: String
}
object StringKeyPair {
  
  inline def apply(keyType: KeyType, privateKey: String, publicKey: String): StringKeyPair = {
    val __obj = js.Dynamic.literal(keyType = keyType.asInstanceOf[js.Any], privateKey = privateKey.asInstanceOf[js.Any], publicKey = publicKey.asInstanceOf[js.Any])
    __obj.asInstanceOf[StringKeyPair]
  }
  
  extension [Self <: StringKeyPair](x: Self) {
    
    inline def setKeyType(value: KeyType): Self = StObject.set(x, "keyType", value.asInstanceOf[js.Any])
    
    inline def setPrivateKey(value: String): Self = StObject.set(x, "privateKey", value.asInstanceOf[js.Any])
    
    inline def setPublicKey(value: String): Self = StObject.set(x, "publicKey", value.asInstanceOf[js.Any])
  }
}
