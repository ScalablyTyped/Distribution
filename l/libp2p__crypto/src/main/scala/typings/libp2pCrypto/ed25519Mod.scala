package typings.libp2pCrypto

import typings.libp2pCrypto.anon.PrivateKey
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ed25519Mod {
  
  @JSImport("@libp2p/crypto/dist/src/keys/ed25519", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def generateKey(): js.Promise[PrivateKey] = ^.asInstanceOf[js.Dynamic].applyDynamic("generateKey")().asInstanceOf[js.Promise[PrivateKey]]
  
  inline def generateKeyFromSeed(seed: js.typedarray.Uint8Array): js.Promise[PrivateKey] = ^.asInstanceOf[js.Dynamic].applyDynamic("generateKeyFromSeed")(seed.asInstanceOf[js.Any]).asInstanceOf[js.Promise[PrivateKey]]
  
  inline def hashAndSign(privateKey: js.typedarray.Uint8Array, msg: js.typedarray.Uint8Array): js.Promise[js.typedarray.Uint8Array] = (^.asInstanceOf[js.Dynamic].applyDynamic("hashAndSign")(privateKey.asInstanceOf[js.Any], msg.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.typedarray.Uint8Array]]
  
  inline def hashAndVerify(publicKey: js.typedarray.Uint8Array, sig: js.typedarray.Uint8Array, msg: js.typedarray.Uint8Array): js.Promise[Boolean] = (^.asInstanceOf[js.Dynamic].applyDynamic("hashAndVerify")(publicKey.asInstanceOf[js.Any], sig.asInstanceOf[js.Any], msg.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Boolean]]
  
  @JSImport("@libp2p/crypto/dist/src/keys/ed25519", "privateKeyLength")
  @js.native
  val privateKeyLength: /* 64 */ Double = js.native
  
  @JSImport("@libp2p/crypto/dist/src/keys/ed25519", "publicKeyLength")
  @js.native
  val publicKeyLength: /* 32 */ Double = js.native
}
