package typings.kdbxweb

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesCryptoSalsa20Mod {
  
  @JSImport("kdbxweb/dist/types/crypto/salsa20", "Salsa20")
  @js.native
  open class Salsa20 protected () extends StObject {
    def this(key: js.typedarray.Uint8Array, nonce: js.typedarray.Uint8Array) = this()
    
    /* private */ val _block: Any = js.native
    
    /* private */ var _blockUsed: Any = js.native
    
    /* private */ val _counterWords: Any = js.native
    
    /* private */ val _keyWords: Any = js.native
    
    /* private */ val _nonceWords: Any = js.native
    
    /* private */ val _rounds: Any = js.native
    
    /* private */ val _sigmaWords: Any = js.native
    
    /* private */ var generateBlock: Any = js.native
    
    def getBytes(numberOfBytes: Double): js.typedarray.Uint8Array = js.native
    
    def getHexString(numberOfBytes: Double): String = js.native
    
    /* private */ var incrementCounter: Any = js.native
    
    /* private */ var reset: Any = js.native
    
    /* private */ var setKey: Any = js.native
    
    /* private */ var setNonce: Any = js.native
  }
}
