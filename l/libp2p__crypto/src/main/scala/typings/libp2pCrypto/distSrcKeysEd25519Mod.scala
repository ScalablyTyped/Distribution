package typings.libp2pCrypto

import typings.libp2pCrypto.distSrcKeysInterfaceMod.Uint8ArrayKeyPair
import typings.node.bufferMod.global.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcKeysEd25519Mod {
  
  @JSImport("@libp2p/crypto/dist/src/keys/ed25519", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def generateKey(): js.Promise[Uint8ArrayKeyPair] = ^.asInstanceOf[js.Dynamic].applyDynamic("generateKey")().asInstanceOf[js.Promise[Uint8ArrayKeyPair]]
  
  inline def generateKeyFromSeed(seed: js.typedarray.Uint8Array): js.Promise[Uint8ArrayKeyPair] = ^.asInstanceOf[js.Dynamic].applyDynamic("generateKeyFromSeed")(seed.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Uint8ArrayKeyPair]]
  
  inline def hashAndSign(key: js.typedarray.Uint8Array, msg: js.typedarray.Uint8Array): js.Promise[Buffer] = (^.asInstanceOf[js.Dynamic].applyDynamic("hashAndSign")(key.asInstanceOf[js.Any], msg.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Buffer]]
  
  inline def hashAndVerify(key: js.typedarray.Uint8Array, sig: js.typedarray.Uint8Array, msg: js.typedarray.Uint8Array): js.Promise[Boolean] = (^.asInstanceOf[js.Dynamic].applyDynamic("hashAndVerify")(key.asInstanceOf[js.Any], sig.asInstanceOf[js.Any], msg.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Boolean]]
  
  @JSImport("@libp2p/crypto/dist/src/keys/ed25519", "privateKeyLength")
  @js.native
  val privateKeyLength: /* 64 */ Double = js.native
  
  @JSImport("@libp2p/crypto/dist/src/keys/ed25519", "publicKeyLength")
  @js.native
  val publicKeyLength: /* 32 */ Double = js.native
}
