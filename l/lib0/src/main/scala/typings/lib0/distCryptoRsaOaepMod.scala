package typings.lib0

import typings.lib0.anon.`2`
import typings.lib0.lib0Strings.decrypt
import typings.lib0.lib0Strings.encrypt
import typings.std.CryptoKey
import typings.std.CryptoKeyPair
import typings.std.JsonWebKey
import typings.std.PromiseLike
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distCryptoRsaOaepMod {
  
  @JSImport("lib0/dist/crypto/rsa-oaep", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def decrypt(key: CryptoKey, data: js.typedarray.Uint8Array): PromiseLike[js.typedarray.Uint8Array] = (^.asInstanceOf[js.Dynamic].applyDynamic("decrypt")(key.asInstanceOf[js.Any], data.asInstanceOf[js.Any])).asInstanceOf[PromiseLike[js.typedarray.Uint8Array]]
  
  inline def encrypt(key: CryptoKey, data: js.typedarray.Uint8Array): PromiseLike[js.typedarray.Uint8Array] = (^.asInstanceOf[js.Dynamic].applyDynamic("encrypt")(key.asInstanceOf[js.Any], data.asInstanceOf[js.Any])).asInstanceOf[PromiseLike[js.typedarray.Uint8Array]]
  
  inline def exportKey(key: CryptoKey): js.Promise[JsonWebKey] = ^.asInstanceOf[js.Dynamic].applyDynamic("exportKey")(key.asInstanceOf[js.Any]).asInstanceOf[js.Promise[JsonWebKey]]
  
  inline def generateKeyPair(): js.Promise[CryptoKeyPair] = ^.asInstanceOf[js.Dynamic].applyDynamic("generateKeyPair")().asInstanceOf[js.Promise[CryptoKeyPair]]
  inline def generateKeyPair(param0: `2`): js.Promise[CryptoKeyPair] = ^.asInstanceOf[js.Dynamic].applyDynamic("generateKeyPair")(param0.asInstanceOf[js.Any]).asInstanceOf[js.Promise[CryptoKeyPair]]
  
  inline def importKey(jwk: Any): js.Promise[CryptoKey] = ^.asInstanceOf[js.Dynamic].applyDynamic("importKey")(jwk.asInstanceOf[js.Any]).asInstanceOf[js.Promise[CryptoKey]]
  inline def importKey(jwk: Any, param1: `2`): js.Promise[CryptoKey] = (^.asInstanceOf[js.Dynamic].applyDynamic("importKey")(jwk.asInstanceOf[js.Any], param1.asInstanceOf[js.Any])).asInstanceOf[js.Promise[CryptoKey]]
  
  type Usages = js.Array[encrypt | decrypt]
}
