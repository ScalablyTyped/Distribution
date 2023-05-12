package typings.lib0

import typings.lib0.anon.`1`
import typings.lib0.lib0Strings.sign
import typings.lib0.lib0Strings.verify
import typings.std.CryptoKey
import typings.std.CryptoKeyPair
import typings.std.JsonWebKey
import typings.std.PromiseLike
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distCryptoEcdsaMod {
  
  @JSImport("lib0/dist/crypto/ecdsa", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def exportKey(key: CryptoKey): js.Promise[JsonWebKey] = ^.asInstanceOf[js.Dynamic].applyDynamic("exportKey")(key.asInstanceOf[js.Any]).asInstanceOf[js.Promise[JsonWebKey]]
  
  inline def generateKeyPair(): js.Promise[CryptoKeyPair] = ^.asInstanceOf[js.Dynamic].applyDynamic("generateKeyPair")().asInstanceOf[js.Promise[CryptoKeyPair]]
  inline def generateKeyPair(param0: `1`): js.Promise[CryptoKeyPair] = ^.asInstanceOf[js.Dynamic].applyDynamic("generateKeyPair")(param0.asInstanceOf[js.Any]).asInstanceOf[js.Promise[CryptoKeyPair]]
  
  inline def importKey(jwk: Any): js.Promise[CryptoKey] = ^.asInstanceOf[js.Dynamic].applyDynamic("importKey")(jwk.asInstanceOf[js.Any]).asInstanceOf[js.Promise[CryptoKey]]
  inline def importKey(jwk: Any, param1: `1`): js.Promise[CryptoKey] = (^.asInstanceOf[js.Dynamic].applyDynamic("importKey")(jwk.asInstanceOf[js.Any], param1.asInstanceOf[js.Any])).asInstanceOf[js.Promise[CryptoKey]]
  
  inline def sign(key: CryptoKey, data: js.typedarray.Uint8Array): PromiseLike[js.typedarray.Uint8Array] = (^.asInstanceOf[js.Dynamic].applyDynamic("sign")(key.asInstanceOf[js.Any], data.asInstanceOf[js.Any])).asInstanceOf[PromiseLike[js.typedarray.Uint8Array]]
  
  inline def verify(key: CryptoKey, signature: js.typedarray.Uint8Array, data: js.typedarray.Uint8Array): PromiseLike[Boolean] = (^.asInstanceOf[js.Dynamic].applyDynamic("verify")(key.asInstanceOf[js.Any], signature.asInstanceOf[js.Any], data.asInstanceOf[js.Any])).asInstanceOf[PromiseLike[Boolean]]
  
  type Usages = js.Array[sign | verify]
}
