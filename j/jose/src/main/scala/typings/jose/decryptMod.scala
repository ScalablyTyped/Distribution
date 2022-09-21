package typings.jose

import typings.jose.typesMod.CompactDecryptResult
import typings.jose.typesMod.CompactJWEHeaderParameters
import typings.jose.typesMod.DecryptOptions
import typings.jose.typesMod.FlattenedJWE
import typings.jose.typesMod.GetKeyFunction
import typings.jose.typesMod.KeyLike
import typings.jose.typesMod.ResolvedKey
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object decryptMod {
  
  @JSImport("jose/dist/types/jwe/compact/decrypt", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def compactDecrypt(jwe: String, getKey: CompactDecryptGetKey): js.Promise[CompactDecryptResult & ResolvedKey] = (^.asInstanceOf[js.Dynamic].applyDynamic("compactDecrypt")(jwe.asInstanceOf[js.Any], getKey.asInstanceOf[js.Any])).asInstanceOf[js.Promise[CompactDecryptResult & ResolvedKey]]
  inline def compactDecrypt(jwe: String, getKey: CompactDecryptGetKey, options: DecryptOptions): js.Promise[CompactDecryptResult & ResolvedKey] = (^.asInstanceOf[js.Dynamic].applyDynamic("compactDecrypt")(jwe.asInstanceOf[js.Any], getKey.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[CompactDecryptResult & ResolvedKey]]
  inline def compactDecrypt(jwe: String, key: js.typedarray.Uint8Array): js.Promise[CompactDecryptResult] = (^.asInstanceOf[js.Dynamic].applyDynamic("compactDecrypt")(jwe.asInstanceOf[js.Any], key.asInstanceOf[js.Any])).asInstanceOf[js.Promise[CompactDecryptResult]]
  inline def compactDecrypt(jwe: String, key: js.typedarray.Uint8Array, options: DecryptOptions): js.Promise[CompactDecryptResult] = (^.asInstanceOf[js.Dynamic].applyDynamic("compactDecrypt")(jwe.asInstanceOf[js.Any], key.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[CompactDecryptResult]]
  inline def compactDecrypt(jwe: String, key: KeyLike): js.Promise[CompactDecryptResult] = (^.asInstanceOf[js.Dynamic].applyDynamic("compactDecrypt")(jwe.asInstanceOf[js.Any], key.asInstanceOf[js.Any])).asInstanceOf[js.Promise[CompactDecryptResult]]
  inline def compactDecrypt(jwe: String, key: KeyLike, options: DecryptOptions): js.Promise[CompactDecryptResult] = (^.asInstanceOf[js.Dynamic].applyDynamic("compactDecrypt")(jwe.asInstanceOf[js.Any], key.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[CompactDecryptResult]]
  inline def compactDecrypt(jwe: js.typedarray.Uint8Array, getKey: CompactDecryptGetKey): js.Promise[CompactDecryptResult & ResolvedKey] = (^.asInstanceOf[js.Dynamic].applyDynamic("compactDecrypt")(jwe.asInstanceOf[js.Any], getKey.asInstanceOf[js.Any])).asInstanceOf[js.Promise[CompactDecryptResult & ResolvedKey]]
  inline def compactDecrypt(jwe: js.typedarray.Uint8Array, getKey: CompactDecryptGetKey, options: DecryptOptions): js.Promise[CompactDecryptResult & ResolvedKey] = (^.asInstanceOf[js.Dynamic].applyDynamic("compactDecrypt")(jwe.asInstanceOf[js.Any], getKey.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[CompactDecryptResult & ResolvedKey]]
  inline def compactDecrypt(jwe: js.typedarray.Uint8Array, key: js.typedarray.Uint8Array): js.Promise[CompactDecryptResult] = (^.asInstanceOf[js.Dynamic].applyDynamic("compactDecrypt")(jwe.asInstanceOf[js.Any], key.asInstanceOf[js.Any])).asInstanceOf[js.Promise[CompactDecryptResult]]
  inline def compactDecrypt(jwe: js.typedarray.Uint8Array, key: js.typedarray.Uint8Array, options: DecryptOptions): js.Promise[CompactDecryptResult] = (^.asInstanceOf[js.Dynamic].applyDynamic("compactDecrypt")(jwe.asInstanceOf[js.Any], key.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[CompactDecryptResult]]
  inline def compactDecrypt(jwe: js.typedarray.Uint8Array, key: KeyLike): js.Promise[CompactDecryptResult] = (^.asInstanceOf[js.Dynamic].applyDynamic("compactDecrypt")(jwe.asInstanceOf[js.Any], key.asInstanceOf[js.Any])).asInstanceOf[js.Promise[CompactDecryptResult]]
  inline def compactDecrypt(jwe: js.typedarray.Uint8Array, key: KeyLike, options: DecryptOptions): js.Promise[CompactDecryptResult] = (^.asInstanceOf[js.Dynamic].applyDynamic("compactDecrypt")(jwe.asInstanceOf[js.Any], key.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[CompactDecryptResult]]
  
  type CompactDecryptGetKey = GetKeyFunction[CompactJWEHeaderParameters, FlattenedJWE]
}
