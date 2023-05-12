package typings.libp2pCrypto

import typings.libp2pCrypto.libp2pCryptoStrings.SHA1
import typings.libp2pCrypto.libp2pCryptoStrings.SHA256
import typings.libp2pCrypto.libp2pCryptoStrings.SHA512
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcHmacMod {
  
  @JSImport("@libp2p/crypto/dist/src/hmac", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def create(hash: SHA1 | SHA256 | SHA512, secret: js.typedarray.Uint8Array): js.Promise[HMAC] = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(hash.asInstanceOf[js.Any], secret.asInstanceOf[js.Any])).asInstanceOf[js.Promise[HMAC]]
  
  trait HMAC extends StObject {
    
    def digest(data: js.typedarray.Uint8Array): js.Promise[js.typedarray.Uint8Array]
    
    var length: Double
  }
  object HMAC {
    
    inline def apply(digest: js.typedarray.Uint8Array => js.Promise[js.typedarray.Uint8Array], length: Double): HMAC = {
      val __obj = js.Dynamic.literal(digest = js.Any.fromFunction1(digest), length = length.asInstanceOf[js.Any])
      __obj.asInstanceOf[HMAC]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: HMAC] (val x: Self) extends AnyVal {
      
      inline def setDigest(value: js.typedarray.Uint8Array => js.Promise[js.typedarray.Uint8Array]): Self = StObject.set(x, "digest", js.Any.fromFunction1(value))
      
      inline def setLength(value: Double): Self = StObject.set(x, "length", value.asInstanceOf[js.Any])
    }
  }
}
