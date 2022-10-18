package typings.kdbxweb

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesCryptoChacha20Mod {
  
  @JSImport("kdbxweb/dist/types/crypto/chacha20", "ChaCha20")
  @js.native
  open class ChaCha20 protected () extends StObject {
    def this(key: js.typedarray.Uint8Array, nonce: js.typedarray.Uint8Array) = this()
    
    /* private */ val _block: Any = js.native
    
    /* private */ var _blockUsed: Any = js.native
    
    /* private */ val _input: Any = js.native
    
    /* private */ val _sigmaWords: Any = js.native
    
    /* private */ val _x: Any = js.native
    
    def encrypt(data: js.typedarray.Uint8Array): js.typedarray.Uint8Array = js.native
    
    /* private */ var generateBlock: Any = js.native
    
    def getBytes(numberOfBytes: Double): js.typedarray.Uint8Array = js.native
  }
}
