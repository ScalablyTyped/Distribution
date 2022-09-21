package typings.jose

import typings.jose.typesMod.CompactJWSHeaderParameters
import typings.jose.typesMod.CompactVerifyResult
import typings.jose.typesMod.FlattenedJWSInput
import typings.jose.typesMod.GetKeyFunction
import typings.jose.typesMod.KeyLike
import typings.jose.typesMod.ResolvedKey
import typings.jose.typesMod.VerifyOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object verifyMod {
  
  @JSImport("jose/dist/types/jws/compact/verify", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def compactVerify(jws: String, getKey: CompactVerifyGetKey): js.Promise[CompactVerifyResult & ResolvedKey] = (^.asInstanceOf[js.Dynamic].applyDynamic("compactVerify")(jws.asInstanceOf[js.Any], getKey.asInstanceOf[js.Any])).asInstanceOf[js.Promise[CompactVerifyResult & ResolvedKey]]
  inline def compactVerify(jws: String, getKey: CompactVerifyGetKey, options: VerifyOptions): js.Promise[CompactVerifyResult & ResolvedKey] = (^.asInstanceOf[js.Dynamic].applyDynamic("compactVerify")(jws.asInstanceOf[js.Any], getKey.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[CompactVerifyResult & ResolvedKey]]
  inline def compactVerify(jws: String, key: js.typedarray.Uint8Array): js.Promise[CompactVerifyResult] = (^.asInstanceOf[js.Dynamic].applyDynamic("compactVerify")(jws.asInstanceOf[js.Any], key.asInstanceOf[js.Any])).asInstanceOf[js.Promise[CompactVerifyResult]]
  inline def compactVerify(jws: String, key: js.typedarray.Uint8Array, options: VerifyOptions): js.Promise[CompactVerifyResult] = (^.asInstanceOf[js.Dynamic].applyDynamic("compactVerify")(jws.asInstanceOf[js.Any], key.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[CompactVerifyResult]]
  inline def compactVerify(jws: String, key: KeyLike): js.Promise[CompactVerifyResult] = (^.asInstanceOf[js.Dynamic].applyDynamic("compactVerify")(jws.asInstanceOf[js.Any], key.asInstanceOf[js.Any])).asInstanceOf[js.Promise[CompactVerifyResult]]
  inline def compactVerify(jws: String, key: KeyLike, options: VerifyOptions): js.Promise[CompactVerifyResult] = (^.asInstanceOf[js.Dynamic].applyDynamic("compactVerify")(jws.asInstanceOf[js.Any], key.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[CompactVerifyResult]]
  inline def compactVerify(jws: js.typedarray.Uint8Array, getKey: CompactVerifyGetKey): js.Promise[CompactVerifyResult & ResolvedKey] = (^.asInstanceOf[js.Dynamic].applyDynamic("compactVerify")(jws.asInstanceOf[js.Any], getKey.asInstanceOf[js.Any])).asInstanceOf[js.Promise[CompactVerifyResult & ResolvedKey]]
  inline def compactVerify(jws: js.typedarray.Uint8Array, getKey: CompactVerifyGetKey, options: VerifyOptions): js.Promise[CompactVerifyResult & ResolvedKey] = (^.asInstanceOf[js.Dynamic].applyDynamic("compactVerify")(jws.asInstanceOf[js.Any], getKey.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[CompactVerifyResult & ResolvedKey]]
  inline def compactVerify(jws: js.typedarray.Uint8Array, key: js.typedarray.Uint8Array): js.Promise[CompactVerifyResult] = (^.asInstanceOf[js.Dynamic].applyDynamic("compactVerify")(jws.asInstanceOf[js.Any], key.asInstanceOf[js.Any])).asInstanceOf[js.Promise[CompactVerifyResult]]
  inline def compactVerify(jws: js.typedarray.Uint8Array, key: js.typedarray.Uint8Array, options: VerifyOptions): js.Promise[CompactVerifyResult] = (^.asInstanceOf[js.Dynamic].applyDynamic("compactVerify")(jws.asInstanceOf[js.Any], key.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[CompactVerifyResult]]
  inline def compactVerify(jws: js.typedarray.Uint8Array, key: KeyLike): js.Promise[CompactVerifyResult] = (^.asInstanceOf[js.Dynamic].applyDynamic("compactVerify")(jws.asInstanceOf[js.Any], key.asInstanceOf[js.Any])).asInstanceOf[js.Promise[CompactVerifyResult]]
  inline def compactVerify(jws: js.typedarray.Uint8Array, key: KeyLike, options: VerifyOptions): js.Promise[CompactVerifyResult] = (^.asInstanceOf[js.Dynamic].applyDynamic("compactVerify")(jws.asInstanceOf[js.Any], key.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[CompactVerifyResult]]
  
  type CompactVerifyGetKey = GetKeyFunction[CompactJWSHeaderParameters, FlattenedJWSInput]
}
