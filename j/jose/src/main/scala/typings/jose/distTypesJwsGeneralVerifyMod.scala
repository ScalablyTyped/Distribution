package typings.jose

import typings.jose.distTypesTypesMod.FlattenedJWSInput
import typings.jose.distTypesTypesMod.GeneralJWSInput
import typings.jose.distTypesTypesMod.GeneralVerifyResult
import typings.jose.distTypesTypesMod.GetKeyFunction
import typings.jose.distTypesTypesMod.JWSHeaderParameters
import typings.jose.distTypesTypesMod.KeyLike
import typings.jose.distTypesTypesMod.ResolvedKey
import typings.jose.distTypesTypesMod.VerifyOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesJwsGeneralVerifyMod {
  
  @JSImport("jose/dist/types/jws/general/verify", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def generalVerify(jws: GeneralJWSInput, key: js.typedarray.Uint8Array): js.Promise[GeneralVerifyResult] = (^.asInstanceOf[js.Dynamic].applyDynamic("generalVerify")(jws.asInstanceOf[js.Any], key.asInstanceOf[js.Any])).asInstanceOf[js.Promise[GeneralVerifyResult]]
  inline def generalVerify(jws: GeneralJWSInput, key: js.typedarray.Uint8Array, options: VerifyOptions): js.Promise[GeneralVerifyResult] = (^.asInstanceOf[js.Dynamic].applyDynamic("generalVerify")(jws.asInstanceOf[js.Any], key.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[GeneralVerifyResult]]
  inline def generalVerify(jws: GeneralJWSInput, key: KeyLike): js.Promise[GeneralVerifyResult] = (^.asInstanceOf[js.Dynamic].applyDynamic("generalVerify")(jws.asInstanceOf[js.Any], key.asInstanceOf[js.Any])).asInstanceOf[js.Promise[GeneralVerifyResult]]
  inline def generalVerify(jws: GeneralJWSInput, key: KeyLike, options: VerifyOptions): js.Promise[GeneralVerifyResult] = (^.asInstanceOf[js.Dynamic].applyDynamic("generalVerify")(jws.asInstanceOf[js.Any], key.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[GeneralVerifyResult]]
  inline def generalVerify[T /* <: KeyLike */](jws: GeneralJWSInput, getKey: GeneralVerifyGetKey): js.Promise[GeneralVerifyResult & ResolvedKey[T]] = (^.asInstanceOf[js.Dynamic].applyDynamic("generalVerify")(jws.asInstanceOf[js.Any], getKey.asInstanceOf[js.Any])).asInstanceOf[js.Promise[GeneralVerifyResult & ResolvedKey[T]]]
  inline def generalVerify[T /* <: KeyLike */](jws: GeneralJWSInput, getKey: GeneralVerifyGetKey, options: VerifyOptions): js.Promise[GeneralVerifyResult & ResolvedKey[T]] = (^.asInstanceOf[js.Dynamic].applyDynamic("generalVerify")(jws.asInstanceOf[js.Any], getKey.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[GeneralVerifyResult & ResolvedKey[T]]]
  
  type GeneralVerifyGetKey = GetKeyFunction[JWSHeaderParameters, FlattenedJWSInput]
}
