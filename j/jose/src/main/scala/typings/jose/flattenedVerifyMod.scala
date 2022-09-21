package typings.jose

import typings.jose.typesMod.FlattenedJWSInput
import typings.jose.typesMod.FlattenedVerifyResult
import typings.jose.typesMod.GetKeyFunction
import typings.jose.typesMod.JWSHeaderParameters
import typings.jose.typesMod.KeyLike
import typings.jose.typesMod.ResolvedKey
import typings.jose.typesMod.VerifyOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object flattenedVerifyMod {
  
  @JSImport("jose/dist/types/jws/flattened/verify", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def flattenedVerify(jws: FlattenedJWSInput, getKey: FlattenedVerifyGetKey): js.Promise[FlattenedVerifyResult & ResolvedKey] = (^.asInstanceOf[js.Dynamic].applyDynamic("flattenedVerify")(jws.asInstanceOf[js.Any], getKey.asInstanceOf[js.Any])).asInstanceOf[js.Promise[FlattenedVerifyResult & ResolvedKey]]
  inline def flattenedVerify(jws: FlattenedJWSInput, getKey: FlattenedVerifyGetKey, options: VerifyOptions): js.Promise[FlattenedVerifyResult & ResolvedKey] = (^.asInstanceOf[js.Dynamic].applyDynamic("flattenedVerify")(jws.asInstanceOf[js.Any], getKey.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[FlattenedVerifyResult & ResolvedKey]]
  inline def flattenedVerify(jws: FlattenedJWSInput, key: js.typedarray.Uint8Array): js.Promise[FlattenedVerifyResult] = (^.asInstanceOf[js.Dynamic].applyDynamic("flattenedVerify")(jws.asInstanceOf[js.Any], key.asInstanceOf[js.Any])).asInstanceOf[js.Promise[FlattenedVerifyResult]]
  inline def flattenedVerify(jws: FlattenedJWSInput, key: js.typedarray.Uint8Array, options: VerifyOptions): js.Promise[FlattenedVerifyResult] = (^.asInstanceOf[js.Dynamic].applyDynamic("flattenedVerify")(jws.asInstanceOf[js.Any], key.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[FlattenedVerifyResult]]
  inline def flattenedVerify(jws: FlattenedJWSInput, key: KeyLike): js.Promise[FlattenedVerifyResult] = (^.asInstanceOf[js.Dynamic].applyDynamic("flattenedVerify")(jws.asInstanceOf[js.Any], key.asInstanceOf[js.Any])).asInstanceOf[js.Promise[FlattenedVerifyResult]]
  inline def flattenedVerify(jws: FlattenedJWSInput, key: KeyLike, options: VerifyOptions): js.Promise[FlattenedVerifyResult] = (^.asInstanceOf[js.Dynamic].applyDynamic("flattenedVerify")(jws.asInstanceOf[js.Any], key.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[FlattenedVerifyResult]]
  
  type FlattenedVerifyGetKey = GetKeyFunction[js.UndefOr[JWSHeaderParameters], FlattenedJWSInput]
}
