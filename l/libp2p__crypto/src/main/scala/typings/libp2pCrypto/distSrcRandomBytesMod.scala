package typings.libp2pCrypto

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcRandomBytesMod {
  
  @JSImport("@libp2p/crypto/dist/src/random-bytes", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(length: Double): js.typedarray.Uint8Array = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(length.asInstanceOf[js.Any]).asInstanceOf[js.typedarray.Uint8Array]
}
