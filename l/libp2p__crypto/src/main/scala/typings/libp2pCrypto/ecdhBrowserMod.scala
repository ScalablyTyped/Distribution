package typings.libp2pCrypto

import typings.libp2pCrypto.keysInterfaceMod.ECDHKey
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ecdhBrowserMod {
  
  @JSImport("@libp2p/crypto/dist/src/keys/ecdh-browser", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def generateEphmeralKeyPair(curve: String): js.Promise[ECDHKey] = ^.asInstanceOf[js.Dynamic].applyDynamic("generateEphmeralKeyPair")(curve.asInstanceOf[js.Any]).asInstanceOf[js.Promise[ECDHKey]]
}
