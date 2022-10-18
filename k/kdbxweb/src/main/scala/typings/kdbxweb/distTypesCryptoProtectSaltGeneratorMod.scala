package typings.kdbxweb

import typings.kdbxweb.distTypesCryptoChacha20Mod.ChaCha20
import typings.kdbxweb.distTypesCryptoSalsa20Mod.Salsa20
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesCryptoProtectSaltGeneratorMod {
  
  @JSImport("kdbxweb/dist/types/crypto/protect-salt-generator", "ProtectSaltGenerator")
  @js.native
  open class ProtectSaltGenerator protected () extends StObject {
    def this(algo: ChaCha20) = this()
    def this(algo: Salsa20) = this()
    
    /* private */ var _algo: Any = js.native
    
    def getSalt(len: Double): js.typedarray.ArrayBuffer = js.native
  }
  /* static members */
  object ProtectSaltGenerator {
    
    @JSImport("kdbxweb/dist/types/crypto/protect-salt-generator", "ProtectSaltGenerator")
    @js.native
    val ^ : js.Any = js.native
    
    inline def create(key: js.typedarray.ArrayBuffer, crsAlgorithm: Double): js.Promise[ProtectSaltGenerator] = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(key.asInstanceOf[js.Any], crsAlgorithm.asInstanceOf[js.Any])).asInstanceOf[js.Promise[ProtectSaltGenerator]]
    inline def create(key: js.typedarray.Uint8Array, crsAlgorithm: Double): js.Promise[ProtectSaltGenerator] = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(key.asInstanceOf[js.Any], crsAlgorithm.asInstanceOf[js.Any])).asInstanceOf[js.Promise[ProtectSaltGenerator]]
  }
}
