package typings.libp2pCrypto

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcAesMod {
  
  @JSImport("@libp2p/crypto/dist/src/aes", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def create(key: js.typedarray.Uint8Array, iv: js.typedarray.Uint8Array): js.Promise[AESCipher] = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(key.asInstanceOf[js.Any], iv.asInstanceOf[js.Any])).asInstanceOf[js.Promise[AESCipher]]
  
  trait AESCipher extends StObject {
    
    def decrypt(data: js.typedarray.Uint8Array): js.Promise[js.typedarray.Uint8Array]
    
    def encrypt(data: js.typedarray.Uint8Array): js.Promise[js.typedarray.Uint8Array]
  }
  object AESCipher {
    
    inline def apply(
      decrypt: js.typedarray.Uint8Array => js.Promise[js.typedarray.Uint8Array],
      encrypt: js.typedarray.Uint8Array => js.Promise[js.typedarray.Uint8Array]
    ): AESCipher = {
      val __obj = js.Dynamic.literal(decrypt = js.Any.fromFunction1(decrypt), encrypt = js.Any.fromFunction1(encrypt))
      __obj.asInstanceOf[AESCipher]
    }
    
    extension [Self <: AESCipher](x: Self) {
      
      inline def setDecrypt(value: js.typedarray.Uint8Array => js.Promise[js.typedarray.Uint8Array]): Self = StObject.set(x, "decrypt", js.Any.fromFunction1(value))
      
      inline def setEncrypt(value: js.typedarray.Uint8Array => js.Promise[js.typedarray.Uint8Array]): Self = StObject.set(x, "encrypt", js.Any.fromFunction1(value))
    }
  }
}
