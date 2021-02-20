package typings.matrixJsSdk

import org.scalablytyped.runtime.StringDictionary
import typings.std.Uint8Array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object dehydrationMod {
  
  @JSImport("matrix-js-sdk/lib/crypto/dehydration", "DEHYDRATION_ALGORITHM")
  @js.native
  val DEHYDRATION_ALGORITHM: /* "org.matrix.msc2697.v1.olm.libolm_pickle" */ String = js.native
  
  @JSImport("matrix-js-sdk/lib/crypto/dehydration", "DehydrationManager")
  @js.native
  class DehydrationManager protected () extends StObject {
    def this(crypto: js.Any) = this()
    
    var crypto: js.Any = js.native
    
    var dehydrateDevice: js.Any = js.native
    
    var deviceDisplayName: js.Any = js.native
    
    def getDehydrationKeyFromCache(): js.Promise[Unit] = js.native
    
    var inProgress: js.Any = js.native
    
    var key: js.Any = js.native
    
    var keyInfo: js.Any = js.native
    
    def setDehydrationKey(key: Uint8Array): js.Promise[Unit] = js.native
    def setDehydrationKey(key: Uint8Array, keyInfo: js.UndefOr[scala.Nothing], deviceDisplayName: String): js.Promise[Unit] = js.native
    def setDehydrationKey(key: Uint8Array, keyInfo: StringDictionary[js.Any]): js.Promise[Unit] = js.native
    def setDehydrationKey(key: Uint8Array, keyInfo: StringDictionary[js.Any], deviceDisplayName: String): js.Promise[Unit] = js.native
    
    var timeoutId: js.Any = js.native
  }
}
