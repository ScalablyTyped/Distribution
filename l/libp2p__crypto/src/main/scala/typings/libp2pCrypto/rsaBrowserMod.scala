package typings.libp2pCrypto

import typings.libp2pCrypto.anon.PublicKey
import typings.std.JsonWebKey
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object rsaBrowserMod {
  
  @JSImport("@libp2p/crypto/dist/src/keys/rsa-browser", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def decrypt(key: JsonWebKey, msg: js.typedarray.Uint8Array): js.typedarray.Uint8Array = (^.asInstanceOf[js.Dynamic].applyDynamic("decrypt")(key.asInstanceOf[js.Any], msg.asInstanceOf[js.Any])).asInstanceOf[js.typedarray.Uint8Array]
  
  inline def encrypt(key: JsonWebKey, msg: js.typedarray.Uint8Array): js.typedarray.Uint8Array = (^.asInstanceOf[js.Dynamic].applyDynamic("encrypt")(key.asInstanceOf[js.Any], msg.asInstanceOf[js.Any])).asInstanceOf[js.typedarray.Uint8Array]
  
  inline def generateKey(bits: Double): js.Promise[PublicKey] = ^.asInstanceOf[js.Dynamic].applyDynamic("generateKey")(bits.asInstanceOf[js.Any]).asInstanceOf[js.Promise[PublicKey]]
  
  inline def getRandomValues(length: Double): js.typedarray.Uint8Array = ^.asInstanceOf[js.Dynamic].applyDynamic("getRandomValues")(length.asInstanceOf[js.Any]).asInstanceOf[js.typedarray.Uint8Array]
  
  inline def hashAndSign(key: JsonWebKey, msg: js.typedarray.Uint8Array): js.Promise[js.typedarray.Uint8Array] = (^.asInstanceOf[js.Dynamic].applyDynamic("hashAndSign")(key.asInstanceOf[js.Any], msg.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.typedarray.Uint8Array]]
  
  inline def hashAndVerify(key: JsonWebKey, sig: js.typedarray.Uint8Array, msg: js.typedarray.Uint8Array): js.Promise[Boolean] = (^.asInstanceOf[js.Dynamic].applyDynamic("hashAndVerify")(key.asInstanceOf[js.Any], sig.asInstanceOf[js.Any], msg.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Boolean]]
  
  inline def unmarshalPrivateKey(key: JsonWebKey): js.Promise[PublicKey] = ^.asInstanceOf[js.Dynamic].applyDynamic("unmarshalPrivateKey")(key.asInstanceOf[js.Any]).asInstanceOf[js.Promise[PublicKey]]
  
  object utils {
    
    @JSImport("@libp2p/crypto/dist/src/keys/rsa-browser", "utils")
    @js.native
    val ^ : js.Any = js.native
    
    inline def jwkToPkcs1(jwk: JsonWebKey): js.typedarray.Uint8Array = ^.asInstanceOf[js.Dynamic].applyDynamic("jwkToPkcs1")(jwk.asInstanceOf[js.Any]).asInstanceOf[js.typedarray.Uint8Array]
    
    inline def jwkToPkix(jwk: JsonWebKey): js.typedarray.Uint8Array = ^.asInstanceOf[js.Dynamic].applyDynamic("jwkToPkix")(jwk.asInstanceOf[js.Any]).asInstanceOf[js.typedarray.Uint8Array]
    
    inline def pkcs1ToJwk(bytes: js.typedarray.Uint8Array): JsonWebKey = ^.asInstanceOf[js.Dynamic].applyDynamic("pkcs1ToJwk")(bytes.asInstanceOf[js.Any]).asInstanceOf[JsonWebKey]
    
    inline def pkixToJwk(bytes: js.typedarray.Uint8Array): JsonWebKey = ^.asInstanceOf[js.Dynamic].applyDynamic("pkixToJwk")(bytes.asInstanceOf[js.Any]).asInstanceOf[JsonWebKey]
  }
}
