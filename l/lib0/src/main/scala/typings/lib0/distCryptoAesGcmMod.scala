package typings.lib0

import typings.lib0.anon.`0`
import typings.lib0.lib0Strings.decrypt
import typings.lib0.lib0Strings.encrypt
import typings.std.CryptoKey
import typings.std.JsonWebKey
import typings.std.PromiseLike
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distCryptoAesGcmMod {
  
  @JSImport("lib0/dist/crypto/aes-gcm", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def decrypt(key: CryptoKey, data: js.typedarray.Uint8Array): PromiseLike[js.typedarray.Uint8Array] = (^.asInstanceOf[js.Dynamic].applyDynamic("decrypt")(key.asInstanceOf[js.Any], data.asInstanceOf[js.Any])).asInstanceOf[PromiseLike[js.typedarray.Uint8Array]]
  
  inline def deriveKey(secret: String, salt: String): js.Promise[CryptoKey] = (^.asInstanceOf[js.Dynamic].applyDynamic("deriveKey")(secret.asInstanceOf[js.Any], salt.asInstanceOf[js.Any])).asInstanceOf[js.Promise[CryptoKey]]
  inline def deriveKey(secret: String, salt: String, param2: `0`): js.Promise[CryptoKey] = (^.asInstanceOf[js.Dynamic].applyDynamic("deriveKey")(secret.asInstanceOf[js.Any], salt.asInstanceOf[js.Any], param2.asInstanceOf[js.Any])).asInstanceOf[js.Promise[CryptoKey]]
  inline def deriveKey(secret: String, salt: js.typedarray.Uint8Array): js.Promise[CryptoKey] = (^.asInstanceOf[js.Dynamic].applyDynamic("deriveKey")(secret.asInstanceOf[js.Any], salt.asInstanceOf[js.Any])).asInstanceOf[js.Promise[CryptoKey]]
  inline def deriveKey(secret: String, salt: js.typedarray.Uint8Array, param2: `0`): js.Promise[CryptoKey] = (^.asInstanceOf[js.Dynamic].applyDynamic("deriveKey")(secret.asInstanceOf[js.Any], salt.asInstanceOf[js.Any], param2.asInstanceOf[js.Any])).asInstanceOf[js.Promise[CryptoKey]]
  inline def deriveKey(secret: js.typedarray.Uint8Array, salt: String): js.Promise[CryptoKey] = (^.asInstanceOf[js.Dynamic].applyDynamic("deriveKey")(secret.asInstanceOf[js.Any], salt.asInstanceOf[js.Any])).asInstanceOf[js.Promise[CryptoKey]]
  inline def deriveKey(secret: js.typedarray.Uint8Array, salt: String, param2: `0`): js.Promise[CryptoKey] = (^.asInstanceOf[js.Dynamic].applyDynamic("deriveKey")(secret.asInstanceOf[js.Any], salt.asInstanceOf[js.Any], param2.asInstanceOf[js.Any])).asInstanceOf[js.Promise[CryptoKey]]
  inline def deriveKey(secret: js.typedarray.Uint8Array, salt: js.typedarray.Uint8Array): js.Promise[CryptoKey] = (^.asInstanceOf[js.Dynamic].applyDynamic("deriveKey")(secret.asInstanceOf[js.Any], salt.asInstanceOf[js.Any])).asInstanceOf[js.Promise[CryptoKey]]
  inline def deriveKey(secret: js.typedarray.Uint8Array, salt: js.typedarray.Uint8Array, param2: `0`): js.Promise[CryptoKey] = (^.asInstanceOf[js.Dynamic].applyDynamic("deriveKey")(secret.asInstanceOf[js.Any], salt.asInstanceOf[js.Any], param2.asInstanceOf[js.Any])).asInstanceOf[js.Promise[CryptoKey]]
  
  inline def encrypt(key: CryptoKey, data: js.typedarray.Uint8Array): js.Promise[js.typedarray.Uint8Array] = (^.asInstanceOf[js.Dynamic].applyDynamic("encrypt")(key.asInstanceOf[js.Any], data.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.typedarray.Uint8Array]]
  
  inline def exportKey(key: CryptoKey): js.Promise[JsonWebKey] = ^.asInstanceOf[js.Dynamic].applyDynamic("exportKey")(key.asInstanceOf[js.Any]).asInstanceOf[js.Promise[JsonWebKey]]
  
  inline def importKey(jwk: Any): js.Promise[CryptoKey] = ^.asInstanceOf[js.Dynamic].applyDynamic("importKey")(jwk.asInstanceOf[js.Any]).asInstanceOf[js.Promise[CryptoKey]]
  inline def importKey(jwk: Any, usages: Unit, extractable: Boolean): js.Promise[CryptoKey] = (^.asInstanceOf[js.Dynamic].applyDynamic("importKey")(jwk.asInstanceOf[js.Any], usages.asInstanceOf[js.Any], extractable.asInstanceOf[js.Any])).asInstanceOf[js.Promise[CryptoKey]]
  inline def importKey(jwk: Any, usages: Usages): js.Promise[CryptoKey] = (^.asInstanceOf[js.Dynamic].applyDynamic("importKey")(jwk.asInstanceOf[js.Any], usages.asInstanceOf[js.Any])).asInstanceOf[js.Promise[CryptoKey]]
  inline def importKey(jwk: Any, usages: Usages, extractable: Boolean): js.Promise[CryptoKey] = (^.asInstanceOf[js.Dynamic].applyDynamic("importKey")(jwk.asInstanceOf[js.Any], usages.asInstanceOf[js.Any], extractable.asInstanceOf[js.Any])).asInstanceOf[js.Promise[CryptoKey]]
  
  type Usages = js.Array[encrypt | decrypt]
}
