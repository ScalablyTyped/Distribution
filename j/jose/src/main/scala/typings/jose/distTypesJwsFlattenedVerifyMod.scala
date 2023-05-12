package typings.jose

import typings.jose.distTypesTypesMod.FlattenedJWSInput
import typings.jose.distTypesTypesMod.FlattenedVerifyResult
import typings.jose.distTypesTypesMod.GetKeyFunction
import typings.jose.distTypesTypesMod.JWSHeaderParameters
import typings.jose.distTypesTypesMod.KeyLike
import typings.jose.distTypesTypesMod.ResolvedKey
import typings.jose.distTypesTypesMod.VerifyOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesJwsFlattenedVerifyMod {
  
  @JSImport("jose/dist/types/jws/flattened/verify", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def flattenedVerify(jws: FlattenedJWSInput, key: js.typedarray.Uint8Array): js.Promise[FlattenedVerifyResult] = (^.asInstanceOf[js.Dynamic].applyDynamic("flattenedVerify")(jws.asInstanceOf[js.Any], key.asInstanceOf[js.Any])).asInstanceOf[js.Promise[FlattenedVerifyResult]]
  inline def flattenedVerify(jws: FlattenedJWSInput, key: js.typedarray.Uint8Array, options: VerifyOptions): js.Promise[FlattenedVerifyResult] = (^.asInstanceOf[js.Dynamic].applyDynamic("flattenedVerify")(jws.asInstanceOf[js.Any], key.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[FlattenedVerifyResult]]
  inline def flattenedVerify(jws: FlattenedJWSInput, key: KeyLike): js.Promise[FlattenedVerifyResult] = (^.asInstanceOf[js.Dynamic].applyDynamic("flattenedVerify")(jws.asInstanceOf[js.Any], key.asInstanceOf[js.Any])).asInstanceOf[js.Promise[FlattenedVerifyResult]]
  inline def flattenedVerify(jws: FlattenedJWSInput, key: KeyLike, options: VerifyOptions): js.Promise[FlattenedVerifyResult] = (^.asInstanceOf[js.Dynamic].applyDynamic("flattenedVerify")(jws.asInstanceOf[js.Any], key.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[FlattenedVerifyResult]]
  inline def flattenedVerify[T /* <: KeyLike */](jws: FlattenedJWSInput, getKey: FlattenedVerifyGetKey): js.Promise[FlattenedVerifyResult & ResolvedKey[T]] = (^.asInstanceOf[js.Dynamic].applyDynamic("flattenedVerify")(jws.asInstanceOf[js.Any], getKey.asInstanceOf[js.Any])).asInstanceOf[js.Promise[FlattenedVerifyResult & ResolvedKey[T]]]
  inline def flattenedVerify[T /* <: KeyLike */](jws: FlattenedJWSInput, getKey: FlattenedVerifyGetKey, options: VerifyOptions): js.Promise[FlattenedVerifyResult & ResolvedKey[T]] = (^.asInstanceOf[js.Dynamic].applyDynamic("flattenedVerify")(jws.asInstanceOf[js.Any], getKey.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[FlattenedVerifyResult & ResolvedKey[T]]]
  
  type FlattenedVerifyGetKey = GetKeyFunction[js.UndefOr[JWSHeaderParameters], FlattenedJWSInput]
}
