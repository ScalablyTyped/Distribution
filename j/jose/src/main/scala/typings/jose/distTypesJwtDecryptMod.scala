package typings.jose

import typings.jose.distTypesTypesMod.CompactJWEHeaderParameters
import typings.jose.distTypesTypesMod.DecryptOptions
import typings.jose.distTypesTypesMod.FlattenedJWE
import typings.jose.distTypesTypesMod.GetKeyFunction
import typings.jose.distTypesTypesMod.JWTClaimVerificationOptions
import typings.jose.distTypesTypesMod.JWTDecryptResult
import typings.jose.distTypesTypesMod.KeyLike
import typings.jose.distTypesTypesMod.ResolvedKey
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesJwtDecryptMod {
  
  @JSImport("jose/dist/types/jwt/decrypt", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def jwtDecrypt(jwt: String, key: js.typedarray.Uint8Array): js.Promise[JWTDecryptResult] = (^.asInstanceOf[js.Dynamic].applyDynamic("jwtDecrypt")(jwt.asInstanceOf[js.Any], key.asInstanceOf[js.Any])).asInstanceOf[js.Promise[JWTDecryptResult]]
  inline def jwtDecrypt(jwt: String, key: js.typedarray.Uint8Array, options: JWTDecryptOptions): js.Promise[JWTDecryptResult] = (^.asInstanceOf[js.Dynamic].applyDynamic("jwtDecrypt")(jwt.asInstanceOf[js.Any], key.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[JWTDecryptResult]]
  inline def jwtDecrypt(jwt: String, key: KeyLike): js.Promise[JWTDecryptResult] = (^.asInstanceOf[js.Dynamic].applyDynamic("jwtDecrypt")(jwt.asInstanceOf[js.Any], key.asInstanceOf[js.Any])).asInstanceOf[js.Promise[JWTDecryptResult]]
  inline def jwtDecrypt(jwt: String, key: KeyLike, options: JWTDecryptOptions): js.Promise[JWTDecryptResult] = (^.asInstanceOf[js.Dynamic].applyDynamic("jwtDecrypt")(jwt.asInstanceOf[js.Any], key.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[JWTDecryptResult]]
  inline def jwtDecrypt(jwt: js.typedarray.Uint8Array, key: js.typedarray.Uint8Array): js.Promise[JWTDecryptResult] = (^.asInstanceOf[js.Dynamic].applyDynamic("jwtDecrypt")(jwt.asInstanceOf[js.Any], key.asInstanceOf[js.Any])).asInstanceOf[js.Promise[JWTDecryptResult]]
  inline def jwtDecrypt(jwt: js.typedarray.Uint8Array, key: js.typedarray.Uint8Array, options: JWTDecryptOptions): js.Promise[JWTDecryptResult] = (^.asInstanceOf[js.Dynamic].applyDynamic("jwtDecrypt")(jwt.asInstanceOf[js.Any], key.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[JWTDecryptResult]]
  inline def jwtDecrypt(jwt: js.typedarray.Uint8Array, key: KeyLike): js.Promise[JWTDecryptResult] = (^.asInstanceOf[js.Dynamic].applyDynamic("jwtDecrypt")(jwt.asInstanceOf[js.Any], key.asInstanceOf[js.Any])).asInstanceOf[js.Promise[JWTDecryptResult]]
  inline def jwtDecrypt(jwt: js.typedarray.Uint8Array, key: KeyLike, options: JWTDecryptOptions): js.Promise[JWTDecryptResult] = (^.asInstanceOf[js.Dynamic].applyDynamic("jwtDecrypt")(jwt.asInstanceOf[js.Any], key.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[JWTDecryptResult]]
  inline def jwtDecrypt[T /* <: KeyLike */](jwt: String, getKey: JWTDecryptGetKey): js.Promise[JWTDecryptResult & ResolvedKey[T]] = (^.asInstanceOf[js.Dynamic].applyDynamic("jwtDecrypt")(jwt.asInstanceOf[js.Any], getKey.asInstanceOf[js.Any])).asInstanceOf[js.Promise[JWTDecryptResult & ResolvedKey[T]]]
  inline def jwtDecrypt[T /* <: KeyLike */](jwt: String, getKey: JWTDecryptGetKey, options: JWTDecryptOptions): js.Promise[JWTDecryptResult & ResolvedKey[T]] = (^.asInstanceOf[js.Dynamic].applyDynamic("jwtDecrypt")(jwt.asInstanceOf[js.Any], getKey.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[JWTDecryptResult & ResolvedKey[T]]]
  inline def jwtDecrypt[T /* <: KeyLike */](jwt: js.typedarray.Uint8Array, getKey: JWTDecryptGetKey): js.Promise[JWTDecryptResult & ResolvedKey[T]] = (^.asInstanceOf[js.Dynamic].applyDynamic("jwtDecrypt")(jwt.asInstanceOf[js.Any], getKey.asInstanceOf[js.Any])).asInstanceOf[js.Promise[JWTDecryptResult & ResolvedKey[T]]]
  inline def jwtDecrypt[T /* <: KeyLike */](jwt: js.typedarray.Uint8Array, getKey: JWTDecryptGetKey, options: JWTDecryptOptions): js.Promise[JWTDecryptResult & ResolvedKey[T]] = (^.asInstanceOf[js.Dynamic].applyDynamic("jwtDecrypt")(jwt.asInstanceOf[js.Any], getKey.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[JWTDecryptResult & ResolvedKey[T]]]
  
  type JWTDecryptGetKey = GetKeyFunction[CompactJWEHeaderParameters, FlattenedJWE]
  
  trait JWTDecryptOptions
    extends StObject
       with DecryptOptions
       with JWTClaimVerificationOptions
  object JWTDecryptOptions {
    
    inline def apply(): JWTDecryptOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[JWTDecryptOptions]
    }
  }
}
