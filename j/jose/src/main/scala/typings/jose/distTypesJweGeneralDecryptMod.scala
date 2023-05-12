package typings.jose

import typings.jose.distTypesTypesMod.DecryptOptions
import typings.jose.distTypesTypesMod.FlattenedJWE
import typings.jose.distTypesTypesMod.GeneralDecryptResult
import typings.jose.distTypesTypesMod.GeneralJWE
import typings.jose.distTypesTypesMod.GetKeyFunction
import typings.jose.distTypesTypesMod.JWEHeaderParameters
import typings.jose.distTypesTypesMod.KeyLike
import typings.jose.distTypesTypesMod.ResolvedKey
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesJweGeneralDecryptMod {
  
  @JSImport("jose/dist/types/jwe/general/decrypt", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def generalDecrypt(jwe: GeneralJWE, key: js.typedarray.Uint8Array): js.Promise[GeneralDecryptResult] = (^.asInstanceOf[js.Dynamic].applyDynamic("generalDecrypt")(jwe.asInstanceOf[js.Any], key.asInstanceOf[js.Any])).asInstanceOf[js.Promise[GeneralDecryptResult]]
  inline def generalDecrypt(jwe: GeneralJWE, key: js.typedarray.Uint8Array, options: DecryptOptions): js.Promise[GeneralDecryptResult] = (^.asInstanceOf[js.Dynamic].applyDynamic("generalDecrypt")(jwe.asInstanceOf[js.Any], key.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[GeneralDecryptResult]]
  inline def generalDecrypt(jwe: GeneralJWE, key: KeyLike): js.Promise[GeneralDecryptResult] = (^.asInstanceOf[js.Dynamic].applyDynamic("generalDecrypt")(jwe.asInstanceOf[js.Any], key.asInstanceOf[js.Any])).asInstanceOf[js.Promise[GeneralDecryptResult]]
  inline def generalDecrypt(jwe: GeneralJWE, key: KeyLike, options: DecryptOptions): js.Promise[GeneralDecryptResult] = (^.asInstanceOf[js.Dynamic].applyDynamic("generalDecrypt")(jwe.asInstanceOf[js.Any], key.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[GeneralDecryptResult]]
  inline def generalDecrypt[T /* <: KeyLike */](jwe: GeneralJWE, getKey: GeneralDecryptGetKey): js.Promise[GeneralDecryptResult & ResolvedKey[T]] = (^.asInstanceOf[js.Dynamic].applyDynamic("generalDecrypt")(jwe.asInstanceOf[js.Any], getKey.asInstanceOf[js.Any])).asInstanceOf[js.Promise[GeneralDecryptResult & ResolvedKey[T]]]
  inline def generalDecrypt[T /* <: KeyLike */](jwe: GeneralJWE, getKey: GeneralDecryptGetKey, options: DecryptOptions): js.Promise[GeneralDecryptResult & ResolvedKey[T]] = (^.asInstanceOf[js.Dynamic].applyDynamic("generalDecrypt")(jwe.asInstanceOf[js.Any], getKey.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[GeneralDecryptResult & ResolvedKey[T]]]
  
  type GeneralDecryptGetKey = GetKeyFunction[JWEHeaderParameters, FlattenedJWE]
}
