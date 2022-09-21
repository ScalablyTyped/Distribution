package typings.libp2pCrypto

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object secp256k1Mod {
  
  @JSImport("@libp2p/crypto/dist/src/keys/secp256k1", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def compressPublicKey(key: js.typedarray.Uint8Array): js.typedarray.Uint8Array = ^.asInstanceOf[js.Dynamic].applyDynamic("compressPublicKey")(key.asInstanceOf[js.Any]).asInstanceOf[js.typedarray.Uint8Array]
  
  inline def computePublicKey(privateKey: js.typedarray.Uint8Array): js.typedarray.Uint8Array = ^.asInstanceOf[js.Dynamic].applyDynamic("computePublicKey")(privateKey.asInstanceOf[js.Any]).asInstanceOf[js.typedarray.Uint8Array]
  
  inline def decompressPublicKey(key: js.typedarray.Uint8Array): js.typedarray.Uint8Array = ^.asInstanceOf[js.Dynamic].applyDynamic("decompressPublicKey")(key.asInstanceOf[js.Any]).asInstanceOf[js.typedarray.Uint8Array]
  
  inline def generateKey(): js.typedarray.Uint8Array = ^.asInstanceOf[js.Dynamic].applyDynamic("generateKey")().asInstanceOf[js.typedarray.Uint8Array]
  
  inline def hashAndSign(key: js.typedarray.Uint8Array, msg: js.typedarray.Uint8Array): js.Promise[js.typedarray.Uint8Array] = (^.asInstanceOf[js.Dynamic].applyDynamic("hashAndSign")(key.asInstanceOf[js.Any], msg.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.typedarray.Uint8Array]]
  
  inline def hashAndVerify(key: js.typedarray.Uint8Array, sig: js.typedarray.Uint8Array, msg: js.typedarray.Uint8Array): js.Promise[Boolean] = (^.asInstanceOf[js.Dynamic].applyDynamic("hashAndVerify")(key.asInstanceOf[js.Any], sig.asInstanceOf[js.Any], msg.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Boolean]]
  
  @JSImport("@libp2p/crypto/dist/src/keys/secp256k1", "privateKeyLength")
  @js.native
  val privateKeyLength: /* 32 */ Double = js.native
  
  inline def validatePrivateKey(key: js.typedarray.Uint8Array): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("validatePrivateKey")(key.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def validatePublicKey(key: js.typedarray.Uint8Array): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("validatePublicKey")(key.asInstanceOf[js.Any]).asInstanceOf[Unit]
}
