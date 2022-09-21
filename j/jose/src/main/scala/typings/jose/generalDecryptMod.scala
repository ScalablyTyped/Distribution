package typings.jose

import typings.jose.typesMod.DecryptOptions
import typings.jose.typesMod.FlattenedJWE
import typings.jose.typesMod.GeneralDecryptResult
import typings.jose.typesMod.GeneralJWE
import typings.jose.typesMod.GetKeyFunction
import typings.jose.typesMod.JWEHeaderParameters
import typings.jose.typesMod.KeyLike
import typings.jose.typesMod.ResolvedKey
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object generalDecryptMod {
  
  @JSImport("jose/dist/types/jwe/general/decrypt", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def generalDecrypt(jwe: GeneralJWE, getKey: GeneralDecryptGetKey): js.Promise[GeneralDecryptResult & ResolvedKey] = (^.asInstanceOf[js.Dynamic].applyDynamic("generalDecrypt")(jwe.asInstanceOf[js.Any], getKey.asInstanceOf[js.Any])).asInstanceOf[js.Promise[GeneralDecryptResult & ResolvedKey]]
  inline def generalDecrypt(jwe: GeneralJWE, getKey: GeneralDecryptGetKey, options: DecryptOptions): js.Promise[GeneralDecryptResult & ResolvedKey] = (^.asInstanceOf[js.Dynamic].applyDynamic("generalDecrypt")(jwe.asInstanceOf[js.Any], getKey.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[GeneralDecryptResult & ResolvedKey]]
  inline def generalDecrypt(jwe: GeneralJWE, key: js.typedarray.Uint8Array): js.Promise[GeneralDecryptResult] = (^.asInstanceOf[js.Dynamic].applyDynamic("generalDecrypt")(jwe.asInstanceOf[js.Any], key.asInstanceOf[js.Any])).asInstanceOf[js.Promise[GeneralDecryptResult]]
  inline def generalDecrypt(jwe: GeneralJWE, key: js.typedarray.Uint8Array, options: DecryptOptions): js.Promise[GeneralDecryptResult] = (^.asInstanceOf[js.Dynamic].applyDynamic("generalDecrypt")(jwe.asInstanceOf[js.Any], key.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[GeneralDecryptResult]]
  inline def generalDecrypt(jwe: GeneralJWE, key: KeyLike): js.Promise[GeneralDecryptResult] = (^.asInstanceOf[js.Dynamic].applyDynamic("generalDecrypt")(jwe.asInstanceOf[js.Any], key.asInstanceOf[js.Any])).asInstanceOf[js.Promise[GeneralDecryptResult]]
  inline def generalDecrypt(jwe: GeneralJWE, key: KeyLike, options: DecryptOptions): js.Promise[GeneralDecryptResult] = (^.asInstanceOf[js.Dynamic].applyDynamic("generalDecrypt")(jwe.asInstanceOf[js.Any], key.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[GeneralDecryptResult]]
  
  type GeneralDecryptGetKey = GetKeyFunction[JWEHeaderParameters, FlattenedJWE]
}
