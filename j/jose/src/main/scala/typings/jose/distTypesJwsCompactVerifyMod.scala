package typings.jose

import typings.jose.distTypesTypesMod.CompactJWSHeaderParameters
import typings.jose.distTypesTypesMod.CompactVerifyResult
import typings.jose.distTypesTypesMod.FlattenedJWSInput
import typings.jose.distTypesTypesMod.GetKeyFunction
import typings.jose.distTypesTypesMod.KeyLike
import typings.jose.distTypesTypesMod.ResolvedKey
import typings.jose.distTypesTypesMod.VerifyOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesJwsCompactVerifyMod {
  
  @JSImport("jose/dist/types/jws/compact/verify", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def compactVerify(jws: String, key: js.typedarray.Uint8Array): js.Promise[CompactVerifyResult] = (^.asInstanceOf[js.Dynamic].applyDynamic("compactVerify")(jws.asInstanceOf[js.Any], key.asInstanceOf[js.Any])).asInstanceOf[js.Promise[CompactVerifyResult]]
  inline def compactVerify(jws: String, key: js.typedarray.Uint8Array, options: VerifyOptions): js.Promise[CompactVerifyResult] = (^.asInstanceOf[js.Dynamic].applyDynamic("compactVerify")(jws.asInstanceOf[js.Any], key.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[CompactVerifyResult]]
  inline def compactVerify(jws: String, key: KeyLike): js.Promise[CompactVerifyResult] = (^.asInstanceOf[js.Dynamic].applyDynamic("compactVerify")(jws.asInstanceOf[js.Any], key.asInstanceOf[js.Any])).asInstanceOf[js.Promise[CompactVerifyResult]]
  inline def compactVerify(jws: String, key: KeyLike, options: VerifyOptions): js.Promise[CompactVerifyResult] = (^.asInstanceOf[js.Dynamic].applyDynamic("compactVerify")(jws.asInstanceOf[js.Any], key.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[CompactVerifyResult]]
  inline def compactVerify(jws: js.typedarray.Uint8Array, key: js.typedarray.Uint8Array): js.Promise[CompactVerifyResult] = (^.asInstanceOf[js.Dynamic].applyDynamic("compactVerify")(jws.asInstanceOf[js.Any], key.asInstanceOf[js.Any])).asInstanceOf[js.Promise[CompactVerifyResult]]
  inline def compactVerify(jws: js.typedarray.Uint8Array, key: js.typedarray.Uint8Array, options: VerifyOptions): js.Promise[CompactVerifyResult] = (^.asInstanceOf[js.Dynamic].applyDynamic("compactVerify")(jws.asInstanceOf[js.Any], key.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[CompactVerifyResult]]
  inline def compactVerify(jws: js.typedarray.Uint8Array, key: KeyLike): js.Promise[CompactVerifyResult] = (^.asInstanceOf[js.Dynamic].applyDynamic("compactVerify")(jws.asInstanceOf[js.Any], key.asInstanceOf[js.Any])).asInstanceOf[js.Promise[CompactVerifyResult]]
  inline def compactVerify(jws: js.typedarray.Uint8Array, key: KeyLike, options: VerifyOptions): js.Promise[CompactVerifyResult] = (^.asInstanceOf[js.Dynamic].applyDynamic("compactVerify")(jws.asInstanceOf[js.Any], key.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[CompactVerifyResult]]
  inline def compactVerify[T /* <: KeyLike */](jws: String, getKey: CompactVerifyGetKey): js.Promise[CompactVerifyResult & ResolvedKey[T]] = (^.asInstanceOf[js.Dynamic].applyDynamic("compactVerify")(jws.asInstanceOf[js.Any], getKey.asInstanceOf[js.Any])).asInstanceOf[js.Promise[CompactVerifyResult & ResolvedKey[T]]]
  inline def compactVerify[T /* <: KeyLike */](jws: String, getKey: CompactVerifyGetKey, options: VerifyOptions): js.Promise[CompactVerifyResult & ResolvedKey[T]] = (^.asInstanceOf[js.Dynamic].applyDynamic("compactVerify")(jws.asInstanceOf[js.Any], getKey.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[CompactVerifyResult & ResolvedKey[T]]]
  inline def compactVerify[T /* <: KeyLike */](jws: js.typedarray.Uint8Array, getKey: CompactVerifyGetKey): js.Promise[CompactVerifyResult & ResolvedKey[T]] = (^.asInstanceOf[js.Dynamic].applyDynamic("compactVerify")(jws.asInstanceOf[js.Any], getKey.asInstanceOf[js.Any])).asInstanceOf[js.Promise[CompactVerifyResult & ResolvedKey[T]]]
  inline def compactVerify[T /* <: KeyLike */](jws: js.typedarray.Uint8Array, getKey: CompactVerifyGetKey, options: VerifyOptions): js.Promise[CompactVerifyResult & ResolvedKey[T]] = (^.asInstanceOf[js.Dynamic].applyDynamic("compactVerify")(jws.asInstanceOf[js.Any], getKey.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[CompactVerifyResult & ResolvedKey[T]]]
  
  type CompactVerifyGetKey = GetKeyFunction[CompactJWSHeaderParameters, FlattenedJWSInput]
}
