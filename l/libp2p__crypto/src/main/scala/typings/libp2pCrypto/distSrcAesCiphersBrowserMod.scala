package typings.libp2pCrypto

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcAesCiphersBrowserMod {
  
  @JSImport("@libp2p/crypto/dist/src/aes/ciphers-browser", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def createCipheriv(mode: Any, key: js.typedarray.Uint8Array, iv: js.typedarray.Uint8Array): Cipher = (^.asInstanceOf[js.Dynamic].applyDynamic("createCipheriv")(mode.asInstanceOf[js.Any], key.asInstanceOf[js.Any], iv.asInstanceOf[js.Any])).asInstanceOf[Cipher]
  
  inline def createDecipheriv(mode: Any, key: js.typedarray.Uint8Array, iv: js.typedarray.Uint8Array): Cipher = (^.asInstanceOf[js.Dynamic].applyDynamic("createDecipheriv")(mode.asInstanceOf[js.Any], key.asInstanceOf[js.Any], iv.asInstanceOf[js.Any])).asInstanceOf[Cipher]
  
  trait Cipher extends StObject {
    
    def update(data: js.typedarray.Uint8Array): js.typedarray.Uint8Array
  }
  object Cipher {
    
    inline def apply(update: js.typedarray.Uint8Array => js.typedarray.Uint8Array): Cipher = {
      val __obj = js.Dynamic.literal(update = js.Any.fromFunction1(update))
      __obj.asInstanceOf[Cipher]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Cipher] (val x: Self) extends AnyVal {
      
      inline def setUpdate(value: js.typedarray.Uint8Array => js.typedarray.Uint8Array): Self = StObject.set(x, "update", js.Any.fromFunction1(value))
    }
  }
}
