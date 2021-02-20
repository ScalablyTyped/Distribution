package typings.libsodiumWrappers.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait StringKeyPair extends StObject {
  
  var keyType: KeyType = js.native
  
  var privateKey: String = js.native
  
  var publicKey: String = js.native
}
object StringKeyPair {
  
  @scala.inline
  def apply(keyType: KeyType, privateKey: String, publicKey: String): StringKeyPair = {
    val __obj = js.Dynamic.literal(keyType = keyType.asInstanceOf[js.Any], privateKey = privateKey.asInstanceOf[js.Any], publicKey = publicKey.asInstanceOf[js.Any])
    __obj.asInstanceOf[StringKeyPair]
  }
  
  @scala.inline
  implicit class StringKeyPairMutableBuilder[Self <: StringKeyPair] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setKeyType(value: KeyType): Self = StObject.set(x, "keyType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPrivateKey(value: String): Self = StObject.set(x, "privateKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPublicKey(value: String): Self = StObject.set(x, "publicKey", value.asInstanceOf[js.Any])
  }
}
