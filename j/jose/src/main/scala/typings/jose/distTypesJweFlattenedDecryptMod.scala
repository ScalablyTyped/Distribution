package typings.jose

import typings.jose.distTypesTypesMod.DecryptOptions
import typings.jose.distTypesTypesMod.FlattenedDecryptResult
import typings.jose.distTypesTypesMod.FlattenedJWE
import typings.jose.distTypesTypesMod.GetKeyFunction
import typings.jose.distTypesTypesMod.JWEHeaderParameters
import typings.jose.distTypesTypesMod.KeyLike
import typings.jose.distTypesTypesMod.ResolvedKey
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesJweFlattenedDecryptMod {
  
  @JSImport("jose/dist/types/jwe/flattened/decrypt", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def flattenedDecrypt(jwe: FlattenedJWE, key: js.typedarray.Uint8Array): js.Promise[FlattenedDecryptResult] = (^.asInstanceOf[js.Dynamic].applyDynamic("flattenedDecrypt")(jwe.asInstanceOf[js.Any], key.asInstanceOf[js.Any])).asInstanceOf[js.Promise[FlattenedDecryptResult]]
  inline def flattenedDecrypt(jwe: FlattenedJWE, key: js.typedarray.Uint8Array, options: DecryptOptions): js.Promise[FlattenedDecryptResult] = (^.asInstanceOf[js.Dynamic].applyDynamic("flattenedDecrypt")(jwe.asInstanceOf[js.Any], key.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[FlattenedDecryptResult]]
  inline def flattenedDecrypt(jwe: FlattenedJWE, key: KeyLike): js.Promise[FlattenedDecryptResult] = (^.asInstanceOf[js.Dynamic].applyDynamic("flattenedDecrypt")(jwe.asInstanceOf[js.Any], key.asInstanceOf[js.Any])).asInstanceOf[js.Promise[FlattenedDecryptResult]]
  inline def flattenedDecrypt(jwe: FlattenedJWE, key: KeyLike, options: DecryptOptions): js.Promise[FlattenedDecryptResult] = (^.asInstanceOf[js.Dynamic].applyDynamic("flattenedDecrypt")(jwe.asInstanceOf[js.Any], key.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[FlattenedDecryptResult]]
  inline def flattenedDecrypt[T /* <: KeyLike */](jwe: FlattenedJWE, getKey: FlattenedDecryptGetKey): js.Promise[FlattenedDecryptResult & ResolvedKey[T]] = (^.asInstanceOf[js.Dynamic].applyDynamic("flattenedDecrypt")(jwe.asInstanceOf[js.Any], getKey.asInstanceOf[js.Any])).asInstanceOf[js.Promise[FlattenedDecryptResult & ResolvedKey[T]]]
  inline def flattenedDecrypt[T /* <: KeyLike */](jwe: FlattenedJWE, getKey: FlattenedDecryptGetKey, options: DecryptOptions): js.Promise[FlattenedDecryptResult & ResolvedKey[T]] = (^.asInstanceOf[js.Dynamic].applyDynamic("flattenedDecrypt")(jwe.asInstanceOf[js.Any], getKey.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[FlattenedDecryptResult & ResolvedKey[T]]]
  
  type FlattenedDecryptGetKey = GetKeyFunction[js.UndefOr[JWEHeaderParameters], FlattenedJWE]
}
