package typings.libp2p

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcPnetKeyGeneratorMod {
  
  @JSImport("libp2p/dist/src/pnet/key-generator", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("libp2p/dist/src/pnet/key-generator", "KEY_LENGTH")
  @js.native
  val KEY_LENGTH: /* 32 */ Double = js.native
  
  @JSImport("libp2p/dist/src/pnet/key-generator", "NONCE_LENGTH")
  @js.native
  val NONCE_LENGTH: /* 24 */ Double = js.native
  
  inline def generateKey(bytes: js.typedarray.Uint8Array): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("generateKey")(bytes.asInstanceOf[js.Any]).asInstanceOf[Unit]
}
