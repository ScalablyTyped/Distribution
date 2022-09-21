package typings.jose

import typings.jose.typesMod.FlattenedJWSInput
import typings.jose.typesMod.GeneralJWSInput
import typings.jose.typesMod.GeneralVerifyResult
import typings.jose.typesMod.GetKeyFunction
import typings.jose.typesMod.JWSHeaderParameters
import typings.jose.typesMod.KeyLike
import typings.jose.typesMod.ResolvedKey
import typings.jose.typesMod.VerifyOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object generalVerifyMod {
  
  @JSImport("jose/dist/types/jws/general/verify", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def generalVerify(jws: GeneralJWSInput, getKey: GeneralVerifyGetKey): js.Promise[GeneralVerifyResult & ResolvedKey] = (^.asInstanceOf[js.Dynamic].applyDynamic("generalVerify")(jws.asInstanceOf[js.Any], getKey.asInstanceOf[js.Any])).asInstanceOf[js.Promise[GeneralVerifyResult & ResolvedKey]]
  inline def generalVerify(jws: GeneralJWSInput, getKey: GeneralVerifyGetKey, options: VerifyOptions): js.Promise[GeneralVerifyResult & ResolvedKey] = (^.asInstanceOf[js.Dynamic].applyDynamic("generalVerify")(jws.asInstanceOf[js.Any], getKey.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[GeneralVerifyResult & ResolvedKey]]
  inline def generalVerify(jws: GeneralJWSInput, key: js.typedarray.Uint8Array): js.Promise[GeneralVerifyResult] = (^.asInstanceOf[js.Dynamic].applyDynamic("generalVerify")(jws.asInstanceOf[js.Any], key.asInstanceOf[js.Any])).asInstanceOf[js.Promise[GeneralVerifyResult]]
  inline def generalVerify(jws: GeneralJWSInput, key: js.typedarray.Uint8Array, options: VerifyOptions): js.Promise[GeneralVerifyResult] = (^.asInstanceOf[js.Dynamic].applyDynamic("generalVerify")(jws.asInstanceOf[js.Any], key.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[GeneralVerifyResult]]
  inline def generalVerify(jws: GeneralJWSInput, key: KeyLike): js.Promise[GeneralVerifyResult] = (^.asInstanceOf[js.Dynamic].applyDynamic("generalVerify")(jws.asInstanceOf[js.Any], key.asInstanceOf[js.Any])).asInstanceOf[js.Promise[GeneralVerifyResult]]
  inline def generalVerify(jws: GeneralJWSInput, key: KeyLike, options: VerifyOptions): js.Promise[GeneralVerifyResult] = (^.asInstanceOf[js.Dynamic].applyDynamic("generalVerify")(jws.asInstanceOf[js.Any], key.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[GeneralVerifyResult]]
  
  type GeneralVerifyGetKey = GetKeyFunction[JWSHeaderParameters, FlattenedJWSInput]
}
